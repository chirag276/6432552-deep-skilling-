# 🌱 Spring Learn – RESTful Web Services with XML Configuration

A Spring Boot application demonstrating RESTful services using both annotation-based and XML-based configurations.

---

## 🚀 Features

- `GET /hello` – Returns "Hello World!!"
- `GET /country` – Returns hardcoded India country object from XML
- `GET /countries/{code}` – Returns country by code (case-insensitive), loaded from XML list

---

## 🛠 Technologies Used

- Java 17
- Spring Boot 3.2.x
- Spring Web
- Spring Context (XML configuration)
- Jackson (for JSON serialization)
- SLF4J Logging
- JUnit 5 + MockMvc
- Maven

---

## 📄 application.properties

```properties
server.port=8083
logging.level.root=INFO

## 📤 Sample Output

### ✅ GET `/hello`

- **Request**:  
  `GET http://localhost:8083/hello`

- **Response**:
Hello World!!

- **Console Logs**:
INFO START - sayHello()
INFO END - sayHello()

---

### ✅ GET `/country`

- **Request**:  
`GET http://localhost:8083/country`

- **Response (JSON)**:
```json
{
  "code": "IN",
  "name": "India"
}
Console Logs:
INFO  START - getCountryIndia()
INFO  END - getCountryIndia()
✅ GET /countries/in
Request:
GET http://localhost:8083/countries/in

Response (JSON):
{
  "code": "IN",
  "name": "India"
}
