FROM openjdk:8-jre-alpine

COPY ./target/afb-mock.jar /root/afb-mock.jar

WORKDIR /root

CMD ["java", "-server", "-Xms512m", "-Xmx512m", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "afb-mock.jar"]