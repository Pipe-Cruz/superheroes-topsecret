# Introducción

Este es un proyecto de API REST creado para la primera semana del programa Eureka. Presenta una base de datos en memoria H2 que muestra la información sobre algunos superhéroes y sus organizaciones. ¡Esta información es de tipo clasificada!

## Prerequisitos de instalación

* Instalar un IDE como IntelliJ o algún símil para Java
* Instalar [JDK 11](https://jdk.java.net/java-se-ri/11-MR2)
* Instalar Postman, crear una cuenta e iniciar sesión
* Instalar el plugin Lombok en el IDE


## Configuración Inicial

* Clonar el repositorio localmente
* Cargar las dependencias con Maven
* Ejecutar la aplicación

```
git clone https://github.com/ManuDve/superheroes-topsecret.git
```
### Base de Datos
Para visualizar la base de datos, acceder a la consola de la BD H2 en la siguiente URL en un navegador:
```
http://localhost:8081/topsecret-console
```
Acceder con las siguientes credenciales:
```
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:topsecret-db
user: sa
password: 
```
### Endpoints
Utilizando Postman, se exponen los siguientes endpoints:

#### GET
```
http://localhost:8081/api/superheroes
```
```
http://localhost:8081/api/organizaciones
```

Estos pueden aceptar parámetros por **ID**, por ejemplo:
```
http://localhost:8081/api/organizaciones/1
```
```
http://localhost:8081/api/superheroes/1
```
#### POST

Debe ser realizado con la siguiente estructura **JSON**:

* Organizaciones
```
http://localhost:8081/api/organizaciones
```
```json
{
  "nombre": "X-Men",
  "publico": false,
  "fecha": "1967-07-01"
}
```
```json
{
"nombre": "Fantastic Four",
"publico": true,
"fecha": "1961-11-01"
}
```
* Superhéroes

```
http://localhost:8081/api/superheroes
```

Luego de crear una organización, los superhéroes llevan la ID de la organización a la cual pertenecen:
```json
{
  "alias": "Wolverine",
  "vigencia": true,
  "organizacion": {
    "id": 1
  }
}
```
```json
{
  "alias": "Mister Fantastic",
  "vigencia": false,
  "organizacion": {
    "id": 2
  }
}
```
El parámetro con la ID de la organización es **obligatorio**.

#### DELETE
Debe ser realizado utilizando el número de **ID**, ejemplo:
```
http://localhost:8081/api/superheroes/1
```
Para borrar una organización, primero deben eliminarse los superhéroes que están relacionados a aquella organización
```
http://localhost:8081/api/organizaciones/1
```