CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
) AS
    insufficient_funds EXCEPTION;
BEGIN
    -- Check if from_account has enough balance
    DECLARE
        current_balance NUMBER;
    BEGIN
        SELECT Balance INTO current_balance
        FROM Accounts
        WHERE AccountID = from_account;

        IF current_balance < amount THEN
            RAISE insufficient_funds;
        END IF;
    END;

    -- Deduct from source
    UPDATE Accounts
    SET Balance = Balance - amount
    WHERE AccountID = from_account;

    -- Add to destination
    UPDATE Accounts
    SET Balance = Balance + amount
    WHERE AccountID = to_account;

    COMMIT;
EXCEPTION
    WHEN insufficient_funds THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in source account.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
