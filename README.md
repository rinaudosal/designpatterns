# Design Pattern in Java
In this Project, based on Pluralsight course of [Bryan Hansen](https://app.pluralsight.com/paths/skill/design-patterns-in-java) i created examples for the common design pattern in Java.

### Structure
Each Design Pattern it's a part of specific classification (Behavioural, Structural or Creational).
For each it's described the following info:

* Concepts
* Example
* Example in Java API


### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)


Decoupling of sender and receiver
Receiver contains reference to next receiver
Promotes loose coupling
No Handler - OK
Examples:
java.util.logging.Logger#log() javax.servlet.Filter#doFilter() Spring Security Filter Chain