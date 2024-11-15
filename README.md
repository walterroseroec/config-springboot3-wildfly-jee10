# CRUD con API REST: Cómo integrar Spring Boot 3 con WildFly: 

En este proyecto, te muestro cómo integrar Spring Boot 3 con WildFly para crear una API REST completa con operaciones CRUD y validaciones de base de datos. Ideal para quienes buscan mejorar sus habilidades y aprender buenas prácticas en sus proyectos Java.

## Explicación del proyecto

Puedes ver a detalle el proyecto directamente desde mi canal de YouTube [https://youtu.be/mInXv2e9dv8](https://youtu.be/mInXv2e9dv8)


##  Herramientas utilizadas:
- **Java [17 o Superior]** como lenguaje de programación.
- **PostgreSQL  [12 o Superior]** como motor de la base de datos.
- **Spring Boot 3 [3.3.5]**  para el uso de herramientas de microservicios.
- **WildFly [27.0.0.FINAL] - [34.0.0.FINAL]** para el despliegue de aplicaciones.


## Script de la base de datos

```
create database db_springboot_dev;

CREATE TABLE `db_springboot_dev`.`clientes` (
  `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `fecha_registro` date  NOT NULL,
  PRIMARY KEY (`id_cliente`));
  
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Joel', 'Jurado', 'juradoec@yahoo.com', '2023-08-01');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Carlos', 'Miranda', 'mirandaTr98@gmail.com', '2023-08-02');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Marcela', 'Sanchez', 'schMarce@itb.com', '2023-08-03');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Ben', 'Tennyson', 'ben10@cn.com', '2023-08-04');
```


---
