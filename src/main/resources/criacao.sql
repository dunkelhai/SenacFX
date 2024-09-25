CREATE DATABASE SenacProjeto;
USE SenacProjeto;
CREATE TABLE `department` (
                              `Id` int NOT NULL AUTO_INCREMENT,
                              `Name` varchar(60) DEFAULT NULL,
                              PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `seller` (
                          `Id` int NOT NULL AUTO_INCREMENT,
                          `Name` varchar(60) NOT NULL,
                          `Email` varchar(100) NOT NULL,
                          `BirthDate` datetime NOT NULL,
                          `BaseSalary` double NOT NULL,
                          `DepartmentId` int NOT NULL,
                          PRIMARY KEY (`Id`),
                          KEY `DepartmentId` (`DepartmentId`),
                          CONSTRAINT `seller_ibfk_1` FOREIGN KEY (`DepartmentId`) REFERENCES `department` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SELECT * FROM SenacProjeto.department;
SELECT * FROM SenacProjeto.seller;