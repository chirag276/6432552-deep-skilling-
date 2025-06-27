# Scenario 1: Apply Discount on Loan Interest for Senior Customers

## 🧾 Description

This PL/SQL block loops through all customers in the `Customers` table and checks their age. If a customer is older than 60 years, it reduces their current loan interest rate by 1%.

---

## 📂 File

- `Scenario1.sql` — Contains the PL/SQL block to apply interest rate discounts for senior citizens.

---

## ▶️ How to Run

1. Open Oracle SQL Developer or any PL/SQL-compatible environment.
2. Connect to your Oracle database.
3. Open `Scenario1.sql`.
4. Execute the script as a PL/SQL block.

---

## ✅ Output

The `Customers` table is updated after executing the PL/SQL block.

Assuming the initial data:

| CustomerID | Name         | Age | LoanInterestRate |
|------------|--------------|-----|------------------|
| 1          | John Doe     | 65  | 10.5             |
| 2          | Jane Smith   | 45  | 9.0              |
| 3          | Mark Johnson | 70  | 11.2             |

After running the script, customers older than 60 get a 1% interest rate discount:

| CustomerID | Name         | Age | LoanInterestRate |
|------------|--------------|-----|------------------|
| 1          | John Doe     | 65  | 9.5              |
| 2          | Jane Smith   | 45  | 9.0              |
| 3          | Mark Johnson | 70  | 10.2             |

You can verify the result using:

```sql
SELECT * FROM Customers;
