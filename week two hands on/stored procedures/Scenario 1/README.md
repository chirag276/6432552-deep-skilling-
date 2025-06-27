# 💼 Scenario 1: Process Monthly Interest

## 🧾 Description

The `ProcessMonthlyInterest` procedure applies a **1% monthly interest** to all customer accounts with the account type `'SAVINGS'`. This is used by banks to incrementally grow savings balances.

---

## 📋 Sample Data (Before Execution)

| AccountID | AccountType | Balance  |
|-----------|-------------|----------|
| 101       | SAVINGS     | 10000.00 |
| 102       | CHECKING    | 8000.00  |
| 103       | SAVINGS     | 5000.00  |

---

## ▶️ Procedure Execution

```sql
EXEC ProcessMonthlyInterest;

