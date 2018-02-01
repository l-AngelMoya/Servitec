CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `servitec`.`reporte_egresos` AS
    SELECT 
        `servitec`.`facturaexterna`.`noRegistro` AS `N° Registro`,
        `servitec`.`facturaexterna`.`idDistribuidora` AS `Id Distribuidora`,
        `servitec`.`facturaexterna`.`fechaEmision` AS `Fecha de Emision`,
        `servitec`.`facturaexterna`.`descuento` AS `Descuento`,
        `servitec`.`facturaexterna`.`iva` AS `IVA`,
        `servitec`.`facturaexterna`.`total` AS `Total`
    FROM
        `servitec`.`facturaexterna`
   HAVING
		MONTH(fechaEmision)= month(now())