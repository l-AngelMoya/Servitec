#queries
use servitec;


select * from empleado order by apellido;

SELECT user , contraseña FROM empleado where user!=null ;

SELECT * FROM empleado ;

select * from cliente;

select * from distribuidora;

select * from articulo;

select * from trabajo;

#buscar una factura por su numero de factura (pk)
select * from facturaservitec where noFactura="0000370";

#eliminar un empleado desde su cedula
DELETE FROM empleado WHERE cedula="1111111111";

#actualiza un registro del empleado
update empleado set cedula="1212121212", correo="cBaque!",salarioMensual=50 where cedula="1212121212";

#ver las facturas con sus trabajos
select * 
from trabajo t , facturaservitec fs
where t.noFactura=fs.noFactura and t.noTrabajo=1;


#actualizar los datos del empleado
UPDATE empleado (nombre,apellido,correo,direccion,telefono,cargo,salarioMensual,user,contraseña) SET nombre="luis", apellido="",correo="lamoya@espol.edu.ec",direccion="guasmo sur", telefono="0990851889", cargo="nada",salarioMensual=1000, user="lamoya", contraseña="lamoya",idsupervisor=null where cedula="0990851889";
