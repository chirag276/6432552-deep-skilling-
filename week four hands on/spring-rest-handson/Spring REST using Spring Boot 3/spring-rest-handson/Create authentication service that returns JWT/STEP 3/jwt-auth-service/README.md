# 🔐 JWT Authentication Service (Spring Boot)

A Spring Boot-based REST API that authenticates users via HTTP Basic Auth and returns a signed JWT token. This service is a foundational component for securing microservices and RESTful applications.

---

## 📌 Features

- `/authenticate` endpoint
- Accepts HTTP Basic Authentication (`-u user:pwd`)
- Manually decodes `Authorization` header
- Validates user credentials
- Generates a signed JWT token on success
- Returns token as JSON response

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot 3.2.x
- Spring Security
- JJWT (Java JWT library)
- Maven
- JUnit 5 + MockMvc (for testing)

---

## 🔧 Configuration

### application.properties

```properties
server.port=8090
logging.level.org.springframework.security=DEBUG

### Test It
✅ Request
curl -s -u user:pwd http://localhost:8090/authenticate

✅ Response (JSON):
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwia..."
}