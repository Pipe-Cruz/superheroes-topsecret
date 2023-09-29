# Introducción

Este es un proyecto de API REST creado para la primera semana del programa Eureka. Presenta una base de datos en memoria H2 que muestra la información sobre algunos superhéroes y sus organizaciones. ¡Esta información es de tipo clasificada!

## Prerequisitos de instalación

* IDE como IntelliJ o algún símil para Java
* Postman

## Configuración Inicial
Clonar el repositorio localmente
```
git clone https://github.com/ManuDve/superheroes-topsecret.git
```
Compilar el programa en el IDE y acceder a la consola de la BD H2 en la siguiente URL en un navegador:
```
http://localhost:8080/topsecret-console
```
Acceder con las siguientes credenciales:
```
Driver-Class: org.h2.Driver
JDBC-URL: jdbc:h2:mem:topsecret-db
user: sa
password: 
```
Se podrán visualizar las tablas de la base de datos creadas a partir de las entidades, están pueden ser modificadas mediante los siguientes endpoints:
