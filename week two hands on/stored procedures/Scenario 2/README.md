
---

## 📁 `Scenario2_README.md` — Update Employee Bonus

```markdown
# Scenario 2: Update Employee Bonus

## 🧾 Description

The `UpdateEmployeeBonus` procedure increases the salary of employees in a specific department by a **given bonus percentage**. The department ID and bonus percent are passed as **input parameters**.

---

## 🗃️ Sample Data (Before Execution)

| EmployeeID | Name     | DepartmentID | Salary   |
|------------|----------|--------------|----------|
| 201        | Alice    | 10           | 50000.00 |
| 202        | Bob      | 20           | 60000.00 |
| 203        | Charlie  | 10           | 55000.00 |

---

## ▶️ Procedure Execution

```sql
EXEC UpdateEmployeeBonus(10, 5);
