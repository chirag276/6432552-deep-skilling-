# Scenario 2: Promote Customers to VIP Based on Balance

## 🧾 Description

This PL/SQL block iterates through all customers in the `Customers` table. If a customer's balance is greater than $10,000, their `IsVIP` status is set to `'TRUE'`.

---

## 📂 File

- `Scenario2.sql` — Contains the PL/SQL block to promote eligible customers to VIP status.

---

## ▶️ How to Run

1. Open Oracle SQL Developer or any PL/SQL-compatible environment.
2. Connect to your Oracle database.
3. Open `Scenario2.sql`.
4. Execute the script as a PL/SQL block.

---

## ✅ Output

The `Customers` table is updated to reflect VIP status based on balance.

Assuming the initial data:

| CustomerID | Name         | Balance  | IsVIP  |
|------------|--------------|----------|--------|
| 1          | John Doe     | 15000.00 | FALSE  |
| 2          | Jane Smith   | 8000.00  | FALSE  |
| 3          | Mark Johnson | 12000.00 | FALSE  |

After running the script:

| CustomerID | Name         | Balance  | IsVIP  |
|------------|--------------|----------|--------|
| 1          | John Doe     | 15000.00 | TRUE   |
| 2          | Jane Smith   | 8000.00  | FALSE  |
| 3          | Mark Johnson | 12000.00 | TRUE   |

You can verify the result using:

```sql
SELECT * FROM Customers;
