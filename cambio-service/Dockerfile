FROM openjdk:17
VOLUME /tmp
EXPOSE 8000
ADD ./target/cambio-service-0.0.1-SNAPSHOT.jar cambio-service.jar
ENTRYPOINT ["java","-jar","/cambio-service.jar"]