# 🌱 Spring Learn – RESTful Web Services

This Spring Boot project demonstrates two RESTful services:

1. **Hello World API** – returns a greeting string.
2. **Country API** – returns country details loaded from Spring XML configuration.

---

## 📦 Technologies Used

- Java 17
- Spring Boot 3
- Spring Web (REST)
- Spring Context (XML bean config)
- SLF4J Logging
- JUnit 5 + MockMvc for testing
- Maven

---

## 🔧 Configuration

### application.properties

```properties
server.port=8083
logging.level.root=INFO

🔗 Request:
GET http://localhost:8083/country

🌐 JSON Response:
{
  "code": "IN",
  "name": "India"
}
