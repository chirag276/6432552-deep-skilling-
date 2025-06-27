
---

## 📁 `Scenario3_README.md` — Transfer Funds Between Accounts

```markdown
# Scenario 3: Transfer Funds Between Accounts

## 🧾 Description

The `TransferFunds` procedure safely transfers a specified amount from one account to another. It performs a **balance check** before the deduction and raises an error if there are insufficient funds.

---

## 🔧 Parameters

- `from_account` (NUMBER): Source account ID
- `to_account` (NUMBER): Destination account ID
- `amount` (NUMBER): Amount to transfer

---

## 🗃️ Sample Data (Before Execution)

| AccountID | Balance  |
|-----------|----------|
| 101       | 5000.00  |
| 102       | 2000.00  |

---

## ▶️ Procedure Execution

```sql
EXEC TransferFunds(101, 102, 3000);
