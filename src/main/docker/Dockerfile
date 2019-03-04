FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG demo.0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]