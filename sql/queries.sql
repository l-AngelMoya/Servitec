#queries
use servitec;


select * from empleado order by apellido;

SELECT user , contraseña FROM empleado where user!=null ;

select cedula from empleado;
SELECT * FROM empleado ;

select * from cliente;

select * from distribuidora;

select * from articulo;

select * from trabajo;

select * from gasto;

select * from facturaServitec;
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
	UPDATE empleado SET nombre="luis", apellido="",correo="lamoya@espol.edu.ec",direccion="guasmo sur", telefono="0990851889", cargo="nada",salarioMensual=1000, user="lamoya", contraseña="lamoya",idsupervisor=null where cedula="0990851889";

#obtener las cedulas de los empleados que podran ser supervisores.alter
select cedula
from empleado;

insert into empleado values ("123123123","Luis","Moya", "lamoya@espol.edu.ec", "guasmo sur", "0990851889","gerente",default,"lamoya","1234", null);

select * from facturaExterna;
call Ingresar_Factura_Externa("000005","0992125691001",now(),10,0,1.3,11.3);


#FACTURA EXERNA.- al ingresar el articulo se me agrega el articulo a la base de datos "articulo" y se crea la compra en "compraArticulo"
call Ingresar_Articulo("101010","4",10,40,"juego de cama");
select * from articulo;
select * from compraArticulo;
select * from facturaExterna;
SELECT noRegistro FROM facturaExterna order BY noRegistro DESC LIMIT 1;
