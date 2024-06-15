FROM maven:3.8.1-openjdk-17 AS builder
COPY . /kafka
WORKDIR /kafka
RUN mvn clean package -DskipTests

FROM openjdk:23-ea-17-jdk-bullseye
COPY --from=builder /kafka/target/kafka-demo-0.0.1-SNAPSHOT.jar /kafka.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/kafka.jar"]
