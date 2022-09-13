FROM openjdk:slim-buster
COPY target/ARCHI_CLOUD-APP-0.0.1-SNAPSHOT.jar springapp.jar
EXPOSE 8080
CMD ["java", "-jar",  "springapp.jar"]