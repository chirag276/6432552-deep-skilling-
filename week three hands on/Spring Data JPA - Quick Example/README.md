# 📘 OrmLearn - Spring Data JPA Example

This is a basic Spring Boot project that uses Spring Data JPA with MySQL to access a `country` table.

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Eclipse

---

## ⚙️ MySQL Setup

```sql
CREATE DATABASE ormlearn;

CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India'), ('US', 'United States of America');
🧾 Sample Code
✅ Entity: Country.java
@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "co_code")
    private String code;

    @Column(name = "co_name")
    private String name;
    // Getters, Setters
}

Output Example
[Country{code='IN', name='India'}, Country{code='US', name='United States of America'}]
