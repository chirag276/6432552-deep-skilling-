# Spring Learn – Hands-on 2

## Spring Core – Load SimpleDateFormat from Spring Configuration XML

This exercise demonstrates how to configure and reuse a `SimpleDateFormat` instance using Spring’s XML configuration. It helps avoid the repeated creation of date formatters across the application.

---

## Technologies Used

- Java 17
- Spring Core (Spring Context)
- Maven
- JUnit 5
- VS Code or Eclipse

---

## Project Description

The objective is to create a reusable `SimpleDateFormat` bean using Spring XML configuration. Instead of creating a new instance in multiple classes, the formatter is defined once in the XML and injected wherever required.

---

## Implementation Steps

1. A Spring XML configuration file is created to define the `SimpleDateFormat` bean with the pattern `dd/MM/yyyy`.
2. The Spring application context is loaded using `ClassPathXmlApplicationContext`.
3. The `SimpleDateFormat` bean is retrieved using the `getBean` method.
4. A string date `"31/12/2018"` is parsed using the formatter, and the resulting `Date` object is printed to the console.
5. A JUnit test validates the parsing logic.
6. The application is executed as a standard Java application or using Maven test.

---

## Sample Output

Parsed Date: Mon Dec 31 00:00:00 IST 2018

---

## Troubleshooting

If there is a conflict with the Tomcat port or any other embedded server port, an optional `application.properties` file can be used to change the default port by adding the `server.port` property.

---

## Notes

- This is a basic example using Spring Core without Spring Boot.
- Ideal for learning how dependency injection works using XML configuration.
- The resources folder must be correctly configured to ensure Spring can load the XML file.

---

## References

Spring Framework Documentation – Bean Metadata Configuration:  
https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-metadata
