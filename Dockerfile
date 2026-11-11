# Stage 1: Build & Test
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean test package

# Stage 2: Runtime Image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/square-area-app-1.0.0.jar app.jar
CMD ["java", "-jar", "app.jar"]