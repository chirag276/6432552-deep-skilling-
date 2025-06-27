# ✅ Exercise 1: Mocking and Stubbing with Mockito

## 📘 Scenario

This exercise demonstrates how to use **Mockito** to mock an external API and stub its methods to return predefined values. This allows the service class to be tested independently of the real API.

---

## 🔧 Technologies Used

- Java 8+
- JUnit 5
- Mockito
- Maven

---

## 🧾 Class Overview

### `ExternalAPI.java`

```java
public interface ExternalAPI {
    String fetchData();
}

✅ Sample Output

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running MyServiceTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
