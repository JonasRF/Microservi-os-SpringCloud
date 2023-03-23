FROM openjdk:17
VOLUME /tmp
EXPOSE 8761
ADD ./target/naming-server-0.0.1-SNAPSHOT.jar naming-server.jar
ENTRYPOINT ["java","-jar","/naming-server.jar"]