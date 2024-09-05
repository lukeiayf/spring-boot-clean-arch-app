<h1 align="center">
  Spring Boot Clean Architecture
</h1>


This is an exercise based on [this vídeo](https://www.youtube.com/watch?v=hit0XHGt4WI) made with the intent of using Clean Architecture on a SpringBoot Application

## Tecnologies used

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## How to run

- Clone repo:
```
git clone https://github.com/lukeiayf/spring-boot-clean-arch-app
```
- Build project:
```
./mvnw clean package
```
- Run:
```
java -jar ./target/spring-boot-cleanarch-0.0.1-SNAPSHOT.jar
```
- Test ( with [httppie](https://httpie.io) or Postman):
```
http POST :8080/users username=username password=password email=email
```

Big thanks to https://github.com/giuliana-bezerra for the code and lecture.