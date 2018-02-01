CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `servitec`.`reporte_empleados` AS
    SELECT 
        `servitec`.`empleado`.`cedula` AS `Cedula`,
        `servitec`.`empleado`.`nombre` AS `Nombre`,
        `servitec`.`empleado`.`apellido` AS `Apellido`,
        `servitec`.`empleado`.`cargo` AS `Cargo`,
        `servitec`.`empleado`.`telefono` AS `Telefono`,
        `servitec`.`empleado`.`direccion` AS `Direccion`,
        `servitec`.`empleado`.`salarioMensual` AS `Salario_Mensual`
    FROM
        `servitec`.`empleado`