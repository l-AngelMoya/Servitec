#queries
use servitec;


select * from empleado order by apellido;

SELECT user , contraseña FROM empleado where user!=null ;

SELECT * FROM empleado ;

select * from cliente;

select * from distribuidora;

#buscar una factura por su numero de factura (pk)
select * from facturaservitec where noFactura="0000370";

#eliminar un empleado desde su cedula
DELETE FROM empleado WHERE cedula="1111111111";
