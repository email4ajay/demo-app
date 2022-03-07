FROM openjdk:8
EXPOSE 8081
ADD target/demo-app.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]
#CMD ["/bin/bash"]