# 🏦 Account Microservice

This is a simple Spring Boot RESTful microservice that provides account details for a banking system. It is part of a microservices hands-on learning exercise.

---

## 🚀 How to Run

### ✅ Requirements
- Java 17 or above
- Maven or Maven Wrapper
- VS Code or Eclipse

### ▶️ Run the Application

You can run the application in any of the following ways:

- **In VS Code:**
  - Open `AccountApplication.java`
  - Click the green ▶️ button near the `main` method

- **Using Terminal (if Maven is installed):**
  mvn spring-boot:run

- Using Maven Wrapper:
   ./mvnw spring-boot:run

- API Endpoint
Get Account Details
Method: GET

 URL:http://localhost:8080/accounts/{accountNumber}

Example Request:
 GET http://localhost:8080/accounts/00987987973432

- Sample JSON Response:
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}

