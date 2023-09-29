## Configuración Inicial
Clonar el repositorio localmente
```properties
git clone https://github.com/ManuDve/superheroes-topsecret.git
```
Compilar el programa y acceder a la consola de la BD H2 en la siguiente URL en un navegador:
```url
http://localhost:8080/topsecret-console
```
Acceder con las siguientes credenciales:
```properties
Driver-Class: org.h2.Driver
JDBC-URL: jdbc:h2:mem:topsecret-db
user: sa
password: 
```
Se podrán visualizar las tablas creadas a partir de las entidades, están pueden ser modificadas mediante los siguientes endpoints:
