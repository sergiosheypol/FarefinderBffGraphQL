FROM openjdk:11
COPY target/farefinder-bff-0.0.1-SNAPSHOT.jar .
CMD java -jar farefinder-bff-0.0.1-SNAPSHOT.jar
EXPOSE 80
