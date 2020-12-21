FROM openjdk:11.0.2-jre-slim
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar .
CMD /usr/bin/java -Xmx400m -Xms400m -jar eurekaserver-0.0.1-SNAPSHOT.jar
EXPOSE 8761
