# Introducción

Este es un proyecto de API REST creado para la primera semana del programa Eureka. Presenta una base de datos en memoria H2 que muestra la información sobre algunos superhéroes y sus organizaciones. ¡Esta información es de tipo clasificada!

## Prerequisitos de instalación

* IDE como IntelliJ o algún símil para Java
* Postman

## Configuración Inicial
Clonar el repositorio localmente y compilar en el IDE
```
git clone https://github.com/ManuDve/superheroes-topsecret.git
```
### Base de Datos
Para visualizar la base de datos, acceder a la consola de la BD H2 en la siguiente URL en un navegador:
```
http://localhost:8080/topsecret-console
```
Acceder con las siguientes credenciales:
```
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:topsecret-db
user: sa
password: 
```
### Endpoints
Utilizando Postman, se exponen los siguientes endpoints

#### GET
```
http://localhost:8080/api/superheroes
```
```
http://localhost:8080/api/organizaciones
```

Estos pueden aceptar parámetros por ID, por ejemplo:
```
http://localhost:8080/api/superheroes/1
```
#### POST

```
http://localhost:8080/api/superheroes
```

Debe ser realizado con la siguiente estructura JSON respectivamente:
* Superheroes
```json
{
    "alias": "Wolverine",
    "estatura": "1.60",
    "vigencia": "true"
}
```
* Organizaciones
```
http://localhost:8080/api/organizaciones
```
```json
{
  "nombre": "X-men",
  "publico": "true",
  "fecha": "1967-07-01"
}
```
Tambien alternativamente este puede contener una lista de superheroes:
```json
{
  "nombre": "X-men",
  "publico": "true",
  "fecha": "1967-07-01",
  "superheroes": [
    {
      "alias": "Wolverine",
      "estatura": "1.60",
      "vigencia": "true"
    },
    {
      "alias": "Jean Grey",
      "estatura": "1.68",
      "vigencia": "false"
    }
  ]
}
```

#### DELETE
Debe ser realizado utilizando el numero de ID, ejemplo:
```
http://localhost:8080/api/superheroes/1
```