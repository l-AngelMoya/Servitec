CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `servitec`.`reporte_ingresos` AS
    SELECT 
        `fs`.`fechaEmision` AS `Fecha Emision`,
        `fs`.`noFactura` AS `N° Factura`,
        `c`.`cedula` AS `Cedula`,
        `c`.`nombre` AS `Nombre`,
        `c`.`apellido` AS `Apellido`,
        `t`.`noTrabajo` AS `NoTrabajo`,
        `t`.`descripcion` AS `Descripcion`,
        `fs`.`total` AS `Total`
    FROM
        ((`servitec`.`cliente` `c`
        JOIN `servitec`.`facturaservitec` `fs`)
        JOIN `servitec`.`trabajo` `t`)
    HAVING
		MONTH(fechaEmision)= month(now())