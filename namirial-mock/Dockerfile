FROM openjdk:8-jre-alpine

COPY ./target/namirial-mock-1.0.1.jar /root/namirial-mock.jar

WORKDIR /root

CMD ["java", "-server", "-Xms2g", "-Xmx2g", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "namirial-mock.jar"]