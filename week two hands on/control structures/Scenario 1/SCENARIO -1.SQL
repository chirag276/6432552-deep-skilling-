DECLARE
    CURSOR cur_customers IS
        SELECT CustomerID, Age, LoanInterestRate FROM Customers;
BEGIN
    FOR cust_rec IN cur_customers LOOP
        IF cust_rec.Age > 60 THEN
            UPDATE Customers
            SET LoanInterestRate = LoanInterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
