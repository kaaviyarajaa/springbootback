# Use Maven to build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use OpenJDK to run the application
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]
