CREATE DATABASE RENAP;
USE RENAP;

CREATE TABLE Persona
(Num_DPI int(15) Primary Key,
Nombres_Persona Varchar(60) Not Null,
Apellido_Paterno Varchar(20) Not Null,
Apellido_Materno Varchar(20) Not Null,
Fecha_Nacimiento date
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
