# ✅ Exercise 2: Verifying Interactions with Mockito

## 📘 Scenario

This exercise demonstrates how to use **Mockito** to verify that a method was called with specific arguments. This is useful for testing interactions between components, especially when using service layers, APIs, or repositories.

---

## 🧾 Class Overview

### `Notifier.java`

```java
public interface Notifier {
    void sendMessage(String message);
}

✅ Sample Output

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running UserServiceTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS 