FROM openjdk:24-oraclelinux9
LABEL maintainer="shanem@liatrio.com"
COPY /target/spring-petclinic-3.3.0-SNAPSHOT.jar /home/petclinc.jar
CMD ["java","-jar","/home/petclinc.jar"]
