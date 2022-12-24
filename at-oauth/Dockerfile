FROM openjdk:11
VOLUME /tmp
ADD ./target/at-oauth-0.0.1-SNAPSHOT.jar at-oauth.jar
ENTRYPOINT ["java","-jar”,”/at-oauth.jar"]