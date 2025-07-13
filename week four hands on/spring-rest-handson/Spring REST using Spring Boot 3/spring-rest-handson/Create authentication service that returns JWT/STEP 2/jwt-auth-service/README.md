# 🔐 JWT Authentication Service (Spring Boot)

A Spring Boot-based REST API to authenticate users via HTTP Basic Auth and return a JWT (to be implemented). This project manually decodes the Basic Auth credentials and validates them against predefined values.

---

## 📌 Features

- Custom `/authenticate` endpoint
- Accepts credentials via HTTP Basic Auth (`-u user:pwd`)
- Manually decodes the `Authorization` header (Base64)
- Validates username and password in controller
- Prepares for JWT generation in next step

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot 3.2.x
- Spring Security (only for Basic Auth)
- Maven
- JUnit 5 + MockMvc (for testing)
- (Coming soon) `jjwt` for JWT token generation

---

## 📂 Authentication Endpoint

### `GET /authenticate`

- Accepts: Basic Authentication
- Reads and decodes `Authorization` header manually
- Validates username/password (`user:pwd`)
- Response:
  - ✅ Valid: `User authenticated successfully. Next: generate JWT.`
  - ❌ Invalid: `Invalid username or password.`

---

## 🔧 Configuration

### application.properties

```properties
server.port=8090
logging.level.org.springframework.security=DEBUG

### sample output

🔗 Request 1: Valid Credentials
curl -u user:pwd http://localhost:8090/authenticate

📤 Response:
User authenticated successfully. Next: generate JWT.

🔗 Request 2: Invalid Credentials
curl -u admin:wrongpass http://localhost:8090/authenticate

📤 Response:
Invalid username or password.