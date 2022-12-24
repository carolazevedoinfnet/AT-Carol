FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/at-eureka-server-0.0.1-SNAPSHOT.jar at-eureka-server.jar
ENTRYPOINT ["java","-jar”,”/at-eureka-server.jar"]