FROM openjdk:11
ADD out/artifacts/employee_jar/employee.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080


