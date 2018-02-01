CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `servitec`.`reporte_articulos` AS
    SELECT 
        `servitec`.`articulo`.`codigoArticulo` AS `Codigo`,
        `servitec`.`articulo`.`descripcion` AS `Descripcion`,
        `servitec`.`compraarticulo`.`cantidad` AS `Cantidad`,
        `servitec`.`compraarticulo`.`precioUnitario` AS `Precio_Unitario`
    FROM
        (`servitec`.`articulo`
        JOIN `servitec`.`compraarticulo`)