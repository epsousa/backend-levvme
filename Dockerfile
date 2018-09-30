FROM openjdk:8
ADD build/libs/levvme-0.0.1-SNAPSHOT.jar levvme-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "levvme-0.0.1-SNAPSHOT.jar"]