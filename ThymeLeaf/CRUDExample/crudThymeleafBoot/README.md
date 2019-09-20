# Ejemplo de uso CRUD con la plantilla Thymeleaf y Spring Boot

## Objetivo
* Entender el uso de las operaciones CRUD (Create, Read, Update, Delete) con JPA y Spring Boot.
* Además usar la plantilla Thymeleaf y poder ver como gestionar las distintas operaciones de gestión.

### Paquetes necesarios
* ThymeLeaf	
* Spring Boot Dev
* Spring Boot
* Spring Web
* Lombok
* Spring JPA

```XML
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
```

### Modelo
* Tenemos una tabla `Usuario (id, nombre, email)`.

```SQL
     CREATE TABLE Usuario{
     	id LONG;
     	nombre VARCHAR NOT NULL;
     	email VARCHAR NOT NULL
     }
```
* [Referencia](https://www.baeldung.com/spring-boot-crud-thymeleaf)

## Detalles a tomar en cuenta

### POJO y beans
* La tabla queda representada en una clase POJO ```Usuario````que encapsula via JPA el acceso y gestión de la tabla.
* Para ello defino a la Clase `Usuario` como una `@Entity` con las propiedades asociadas a cada campo.

## Pendiente
* Con la tabla vacia no funciona.
* Pendiente la gestión y control de errores.
 