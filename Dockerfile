FROM openjdk:8u191-jdk-alpine3.9
ADD target/Kokot_Docker_IO-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar Kokot_Docker_IO-0.0.1-SNAPSHOT.jar