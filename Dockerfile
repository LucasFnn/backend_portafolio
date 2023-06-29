FROM adoptopenjdk:11-jdk-hotspot
MAINTAINER  LGF
COPY  tarjet/portafolio-0.0.1-SNAPSHOT.jar  lgf-app.jar
ENTRYPOINT  ["java","-jar","/lgf-app.jar"]
EXPOSE 8080