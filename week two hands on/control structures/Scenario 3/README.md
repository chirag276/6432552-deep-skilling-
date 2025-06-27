# Scenario 3: Send Loan Due Reminders to Customers

## 🧾 Description

This PL/SQL block fetches all loans from the `Loans` table that are due within the next 30 days. For each loan, it prints a personalized reminder message including the customer’s name, loan ID, and due date using `DBMS_OUTPUT.PUT_LINE`.

---

## 📂 File

- `Scenario3.sql` — Contains the PL/SQL block to display due loan reminders.

---

## ▶️ How to Run

1. Open Oracle SQL Developer or any PL/SQL-compatible environment.
2. Connect to your Oracle database.
3. Open `Scenario3.sql`.
4. Make sure **DBMS Output** is enabled (`View → DBMS Output → Enable for your connection`).
5. Execute the script as a PL/SQL block.

---

## ✅ Output

If the `Loans` and `Customers` tables contain the following sample data:

### Customers Table:

| CustomerID | Name         |
|------------|--------------|
| 1          | John Doe     |
| 2          | Jane Smith   |

### Loans Table:

| LoanID | CustomerID | DueDate    |
|--------|------------|------------|
| 101    | 1          | (SYSDATE+5)|
| 102    | 2          | (SYSDATE+40)|

After running the script, only loans due within 30 days will trigger reminders.

### Sample Output:
Reminder: Dear John Doe, your loan (LoanID: 101) is due on 01-JUL-2025.


➡️ The loan for Jane Smith is not printed because it is due beyond 30 days.

---

## 📝 Notes

- Make sure `DBMS_OUTPUT` is turned ON to see the output.
- Adjust the `SYSDATE + 30` interval in the query if a different window is needed.
- Both `Loans` and `Customers` tables must exist with proper data.

