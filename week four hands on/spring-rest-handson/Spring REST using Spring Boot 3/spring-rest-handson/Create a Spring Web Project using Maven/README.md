# spring-learn

A basic Spring Boot Web project created using Spring Initializr with Maven.

## Project Details
- Group ID: `com.cognizant`
- Artifact ID: `spring-learn`
- Dependencies: Spring Web, Spring Boot DevTools
- Java Version: 17

## How to Build
```bash
mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=123456

## How to Run
mvn spring-boot:run

You should see:
SpringLearnApplication has started successfully!


