#queries
use servitec;


select * from empleado order by apellido;

SELECT user , contraseña FROM empleado where user!=null ;

select cedula from empleado;
SELECT * FROM empleado where cargo='ALBAÑIL';

select * from cliente;

select * from distribuidora;

select * from articulo;


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

#busqueda de factura externa con todos sus joins
select fe.noRegistro,fe.noFactura,fe.fechaEmision,dis.idDistribuidora,fe.subtotal	
from facturaExterna fe join distribuidora dis on fe.idDistribuidora=dis.idDistribuidora join compraArticulo compart on fe.noRegistro=compart.noRegistro join articulo art on compart.codigoArticulo=art.codigoArticulo  ;

#FACTURA EXERNA.- al ingresar el articulo se me agrega el articulo a la base de datos "articulo" y se crea la compra en "compraArticulo"
call Ingresar_Articulo("101010","4",10,40,"juego de cama");
select * from articulo;
select * from compraArticulo;
select * from articulo a join compraArticulo ca on a.codigoArticulo=ca.codigoArticulo join facturaExterna fe on fe.noRegistro=ca.noRegistro;
select * from facturaExterna;
SELECT noRegistro FROM facturaExterna order BY noRegistro DESC LIMIT 1;

call Buscar_Infor_FacExterna('000',@distribuidora,@nombreDistribuidora,@numRegisto);
select @distribuidora,@numRegistro;

select dis.idDistribuidora,dis.nombre,fe.noRegistro  from facturaExterna fe  join distribuidora dis on fe.idDistribuidora=dis.idDistribuidora 
	where fe.noFactura=0000100;

#buscar factura externa
select fe.noRegistro,fe.noFactura,fe.fechaEmision,idDistribuidora,subtotal,descuento,iva,total,ca.codigoArticulo,ca.cantidad,ca.precioUnitario,ca.precioTotal, ar.descripcion
from facturaexterna fe join compraarticulo ca on fe.noRegistro=ca.noRegistro join articulo ar on ar.codigoArticulo=ca.codigoArticulo
where fe.noFactura='0000100';

DELETE FROM compraArticulo WHERE codigoArticulo='008'and noRegistro=2;
select ar.codigoArticulo,descripcion,cantidad from articulo ar join compraArticulo ca on ar.codigoArticulo=ca.codigoArticulo;

select * from trabajo;
select * from empleadosAsignados ;
select * from insumos;
select* from articulo;
select * from compraArticulo;



#obtener los datos de la factura sin articulos
select fechaTrabajo,fechaEntrega,costoManoObra,descripcion,noFactura,emp.cedula,emp.nombre,emp.apellido from trabajo tra join empleadosAsignados empAs on tra.notrabajo=empAs.noTrabajo join empleado emp on empAs.cedula=emp.cedula where tra.noTrabajo=1;
select art.codigoArticulo,art.descripcion,ins.cantidad from trabajo tr join insumos ins on tr.noTrabajo=ins.noTrabajo join articulo art on ins.codigoArticulo=art.codigoArticulo where tr.noTrabajo=1;
select * from trabajo tra join empleadosAsignados empAs on tra.notrabajo=empAs.noTrabajo join empleado emp on empAs.cedula=emp.cedula where tra.noTrabajo=1;



