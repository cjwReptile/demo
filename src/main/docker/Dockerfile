FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD demo.0.0.1-SNAPSHOT.jar /var/lib/jenkins/workspace/demo/target/demo/demo.0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.0.0.1-SNAPSHOT.jar"]