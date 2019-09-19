# Ejemplo de CRUD usando Angular y Spring Boot

### Detalle sobre la aplicación
La aplicación lleva la gestión de la tabla personas:

##### Tabla Personas

```
	persona{
		Id: INTEGER autoincrement;
		Nombre: VARCHAR(50);
		Apellidos: VARCHAR(200);
	}
```
##### Descripción del Backend

CrudAngular se compone de los siguientes paquetes:

* **es.uned.master.java.bean**: Contiene las entidades de acceso a capa de datos. *Persona.java* es el POJO que gestionará una entidad del registro de Persona.
* **es.uned.master.java.controller**: Es el controlador de la aplicación que realiza los mapeos de las peticiones. La clase es *Controlador.java*.
* **es.uned.master.java.model**: Contiene el respositorio o la capa de acceso a los datos de la tabla usando JPA e Hibernate. La clase es *PersonaRepository.java*.
* **es.uned.master.java.service**: Contiene la fachada que comunica el repositorio. la clase es *PersonaServiceImp.java* con su interfaz *PersonaService.java*.

 

### Documentación
* [PlayList Youtube](https://www.youtube.com/watch?v=O13X14TGtm8&list=PLG1l7S-453CbcDUEhfOnwAe6p1gLxcgXK)
  * [Vídeo parte 1](https://www.youtube.com/watch?v=O13X14TGtm8&list=PLG1l7S-453CbcDUEhfOnwAe6p1gLxcgXK&index=1)
  * [Vídeo parte 2](https://www.youtube.com/watch?v=xnTwU-ZgAqQ&list=PLG1l7S-453CbcDUEhfOnwAe6p1gLxcgXK&index=2)
  * [Vídeo parte 3](https://www.youtube.com/watch?v=-nzB6HIiGqQ&list=PLG1l7S-453CbcDUEhfOnwAe6p1gLxcgXK&index=3)
  * [Vídeo parte 4](https://www.youtube.com/watch?v=BU_krBYIAGQ&list=PLG1l7S-453CbcDUEhfOnwAe6p1gLxcgXK&index=4)

* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Angular](https://angular.io/docs)
* [Spring Web](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


