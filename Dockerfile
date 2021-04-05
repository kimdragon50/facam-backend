FROM openjdk:11-jre-slim

WORKDIR app

COPY ./target/employee-management-backend-0.0.1-SNAPSHOT.jar .
CMD java -jar employee-management-backend-0.0.1-SNAPSHOT.jar
