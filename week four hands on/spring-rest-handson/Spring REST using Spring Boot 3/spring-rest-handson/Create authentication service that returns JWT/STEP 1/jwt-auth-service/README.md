# 🔐 JWT Authentication Service (Spring Boot)

A Spring Boot-based REST API to authenticate users via HTTP Basic Auth and return a JSON Web Token (JWT). This is the foundational step for enabling JWT-based authentication in microservices and secured APIs.

---

## 📌 Features

- Custom `/authenticate` endpoint
- Accepts Basic Authentication (`-u user:pwd`)
- Validates credentials using Spring Security (in-memory user)
- Next steps: Generate JWT and secure other endpoints

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot 3.2.x
- Spring Security
- Maven
- JUnit 5 (with MockMvc for testing)
- (Coming soon) JWT library: `jjwt` by io.jsonwebtoken

---

## 📂 Authentication Endpoint

### `GET /authenticate`

- Accepts: Basic Auth credentials
- Returns: Confirmation message (later, will return JWT)

> Credentials are passed using:
> ```bash
> curl -u user:pwd http://localhost:8090/authenticate
> ```

---

## 🔧 Configuration

### application.properties

```properties
server.port=8090
logging.level.org.springframework.security=DEBUG

🔗 Request
curl -u user:pwd http://localhost:8090/authenticate

📤 Response:
This is the authentication endpoint. Next step: parse Basic Auth and generate JWT.
