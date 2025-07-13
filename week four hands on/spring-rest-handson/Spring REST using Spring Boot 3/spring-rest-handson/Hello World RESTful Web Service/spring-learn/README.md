# Spring Learn – Hello World RESTful Web Service

## 📘 Overview

This project demonstrates how to build a basic RESTful web service using the Spring Boot framework. The service responds with a hardcoded `"Hello World!!"` message when accessed through a GET request at `/hello`.

---

## 🚀 Features

- REST API built with Spring Boot
- Returns "Hello World!!" via `/hello` endpoint
- Simple controller with logging
- Configurable server port
- Unit test using JUnit 5 and MockMvc

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot (Web)
- Maven
- JUnit 5
- MockMvc
- SLF4J (Logging)
- Postman or browser for testing

## 🧾 Endpoint Details

- **URL**: `http://localhost:8083/hello`
- **Method**: GET
- **Controller**: `HelloController`
- **Method**: `sayHello()`
- **Response**: `Hello World!!`

---

## 📝 Log Output

The controller logs the start and end of the method execution:

INFO START - sayHello()
INFO END - sayHello()
---

## 🧪 Unit Testing

- Test class: `SpringLearnApplicationTests`
- Uses `MockMvc` to simulate GET request to `/hello`
- Asserts:
  - HTTP status 200 OK
  - Response content is `Hello World!!`

---

## ▶️ How to Run

### 📦 Prerequisites
- Java 17+
- Maven

### 🔧 Run the App
```bash
mvn spring-boot:run

Or run SpringLearnApplication.java from IDE.

Visit in browser or Postman:
Hello World!!
