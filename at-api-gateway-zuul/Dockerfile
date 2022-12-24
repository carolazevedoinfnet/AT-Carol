FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/at-api-gateway-zuul-0.0.1-SNAPSHOT.jar at-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar”,”/at-api-gateway-zuul.jar"]