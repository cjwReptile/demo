FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /var/lib/jenkins/workspace/demo/target/demo.0.0.1-SNAPSHOT.jar demo.0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.0.0.1-SNAPSHOT.jar"]