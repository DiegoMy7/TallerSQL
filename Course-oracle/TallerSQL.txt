/*
Ejercicios

1. Crear una nueva base de datos llamada "TallerSQL"
2. Crear una tabla llamada "Clientes", considerar los atributos, Id, Nombre, Apellido, Telefono, Direccion, Email.
3. Insertar 10 registros en la tabla creada anteriormente 
4. Mostrar todos los registros insertados.
5. Actualizar 5 registros de la tabla anteriormente creada utilizando WHERE
6. Eliminar 2 registros utilizando WHERE
7. Guardar todo tu trabajo en tu repositorio de github


*/


CREATE DATABASE TallerSQL
USE TallerSQL;

CREATE TABLE Clientes(
Id INT PRIMARY KEY,
Nombre VARCHAR(50),
Apellido VARCHAR(50),
Telefono VARCHAR (15),
Direccion VARCHAR (100),
Email VARCHAR(100),

);

-- Insertar 10 registros en la tabla Clientes
USE TallerSQL

INSERT INTO Clientes (Id, Nombre, Apellido, Telefono, Direccion, Email) VALUES
(001,'Diego', 'Perez', '923456789', 'Independencia', 'Diego@gmail.com'),
(002,'Maria', 'Gonzalez', '987654321', 'Chorrillos', 'maria@gmail.com'),
(003,'Pedro', 'Martinez', '955555555', 'Puente Piedra', 'pedro@gmail.com'),
(004,'Ana', 'Lopez', '966666666', 'Independencia', 'ana@gmail.com'),
(005,'Luis', 'Hernandez', '977777777', 'Acho', 'luis@gmail.com'),
(006,'Laura', 'Diaz', '988888888', 'Miraflores', 'laura@gmail.com'),
(007,'Carlos', 'Sanchez', '999999999', 'Puente Piedra', 'carlos@gmail.com'),
(008,'Sofia', 'Ramirez', '911111111', 'San Martin', 'sofia@gmail.com'),
(009,'Pablo', 'Alvarez', '922222222', 'Callao', 'pablo@gmail.com'),
(010,'Elena', 'Fernandez', '933333333', 'Comas', 'elena@gmail.com');

-- Mostrar todos los registros insertados en la tabla Clientes
SELECT * FROM Clientes


-- Actualizar 5 registros de la tabla Clientes sin utilizar SET

UPDATE Clientes set Nombre = 'Kevin' where nombre = 'Diego'
UPDATE Clientes set Nombre = 'Liz' where nombre = 'Maria'
UPDATE Clientes set Nombre = 'Pepito' where nombre = 'Pedro'
UPDATE Clientes set Nombre = 'Flaviana' where nombre = 'Ana'
UPDATE Clientes set Nombre = 'Jose' where nombre = 'Luis'

-- Eliminar 2 registros de la Tabla usando Where
BEGIN TRAN 
Delete from Clientes where Nombre = 'Kevin'
DELETE FROM Clientes where Nombre = 'Flaviana'
ROLLBACK