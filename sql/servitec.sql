drop database if exists servitec;

create database servitec;
use servitec;

create table cliente(
  cedula char(10) primary key,
  nombre char(30),
  apellido char(30),
  correo char(50),
  direccion char(50),
  telefono char(30)
  );
  

create table facturaServitec(
  noFactura int  primary key auto_increment,
  fechaEmision date ,
  cedula char(10),
  subtotal float ,
  iva float,
  total float,
  foreign key (cedula) references cliente (cedula)
 #constraint cons check(iva > 12 and subtotal >0 )
);

create table distribuidora(
  idDistribuidora char(20) primary key,
  nombre char(20),
  direccion varchar(50),
  correo varchar(40),
  telefono varchar(10)
);


create table facturaExterna( 
  noRegistro int primary key auto_increment,
  noFactura char(10),
  idDistribuidora char(20),
  fechaEmision date,
  subtotal float,
  descuento float,
  iva float,
  total float,
  
  foreign key (idDistribuidora) references distribuidora (idDistribuidora)
);

create table empleado(
  cedula char (15) primary key,
  nombre char (20),
  apellido char (20),
  correo char (30),
  direccion char(50),
  telefono char(15),
  cargo char(30),
  salarioMensual float default 0.0,
  user char(12),
  contraseña varchar(12),
  idsupervisor char(15) default "null",
  foreign key(idsupervisor)references empleado(cedula)
  );
  
  
  create table trabajo(
    noTrabajo int primary key auto_increment,
    fechaTrabajo date,
    descripcion varchar(60),
    noFactura int default null,
    fechaEntrega date,
    costoManoObra float,
    isTerminado boolean default false,
    foreign key (noFactura) references facturaServitec (noFactura)
  );


create table empleadosAsignados(
  noTrabajo int,
  cedula char(15),
  primary key(notrabajo,cedula),
  foreign key(noTrabajo) references trabajo (noTrabajo),
  foreign key(cedula) references empleado (cedula)
);

create table articulo(
  codigoArticulo char(20) primary key,
  descripcion varchar(60)
);

create table compraArticulo(
  noRegistro int,
  codigoArticulo char(20),
  cantidad int,
  precioUnitario float,
  precioTotal float,
  primary key(noRegistro ,codigoArticulo),
  foreign key (noRegistro) references facturaExterna (noRegistro),
  foreign key (codigoArticulo) references articulo (codigoArticulo) 
  );


create table insumos(
  noTrabajo int,
  codigoArticulo char(20),
  cantidad int,
  primary key(noTrabajo, codigoArticulo),
  foreign key(noTrabajo) references trabajo(noTrabajo),
  foreign key(codigoArticulo) references articulo (codigoArticulo)
);

 
 
 delimiter $
 create procedure Ingresar_Factura_Externa(in nfactura char(15),in noDistribuidora char(20),in fecha date,in subtot float, in descuento float, in iva float, in total float,out fknoRegistro int)
 begin   
	INSERT INTO facturaExterna VALUES (0,nfactura,noDistribuidora,fecha,subtot,descuento,iva,total);
    SELECT noRegistro into fknoRegistro FROM facturaExterna order BY noRegistro DESC LIMIT 1;
end
$
 delimiter ;
 delimiter @
 create procedure Ingresar_Articulo(in codArticulo char(20),in cantidad int,in punitario float,in ptotal float, in descrip varchar(60),in noRegistro int)
 begin
	INSERT INTO articulo VALUES (codArticulo,descrip);
    Insert into compraArticulo values (noRegistro,codArticulo,cantidad,punitario,ptotal);
 end
 @
 delimiter ;
 
delimiter @
 create procedure eliminar_CompraArticulos_FacturaExterna(in codArticulo char(20),in numeroRegistro int)
 begin
    DELETE FROM compraArticulo WHERE codArticulo=codArticulo and noRegistro=numeroRegistro;
    delete from insumos where codigoArticulo=codArticulo;
    Delete from articulo where codigoArticulo=codArticulo;
    delete from facturaexterna where noRegistro=numeroRegistro;
 end
 @
 delimiter ;

delimiter @
 create procedure Ingresar_Trabajo(in fechaInicio Date,in fechaFin Date,in descrp varchar(60),in costoXObra float,out pknoTrabajo int)
 begin
	INSERT INTO trabajo VALUES (0,fechaInicio,descrp,null,fechaFin,costoXObra,false);
	SELECT noTrabajo into pknoTrabajo FROM trabajo order BY noTrabajo DESC LIMIT 1;

 end
 @
 delimiter ;

 
delimiter @
create procedure Ingresar_EmpleadoAsignados(in numeroTrabajo int,in cedula char(15))
 begin
	INSERT INTO empleadosAsignados VALUES (numeroTrabajo,cedula);
 end
 @
 delimiter ;

delimiter @
create procedure Ingresar_Insumos(in numeroTrabajo int,in codArticulo char(20),in cant int)
 begin
	INSERT INTO insumos VALUES (numeroTrabajo,codArticulo,cant);
 end
 @
 delimiter ;
 
 delimiter @
 create trigger Reducir_Articulos_Ingresar_Trabajo after insert on insumos
 for each row 
 begin
	update compraArticulo set cantidad=cantidad-new.cantidad where compraArticulo.codigoArticulo=new.codigoArticulo;
 end
 @
 delimiter ;

delimiter @
 create procedure eliminar_Trabajo(in numeroTrabajo int,in codArticulo varchar(20),in cedulaEmpleado char(15))
 begin
    Delete from empleadosasignados where noTrabajo=numeroTrabajo and cedula=cedulaEmpleado;
    DELETE FROM insumos WHERE noTrabajo=numeroTrabajo and codigoArticulo=codArticulo;
 end
 @
 delimiter ;
 
 
 delimiter @
 create trigger Aumentar_Articulos_Eliminar_Trabajo after delete on insumos
 for each row 
 begin
	update compraArticulo set cantidad=cantidad+old.cantidad where compraArticulo.codigoArticulo=old.codigoArticulo;
 end
 @
 delimiter ;
 
 
 delimiter @
 create procedure Insertar_Factura_Servitec(in FechaInicial date,in cedulaClie char(10),in subtot float, in iva float, in tot float,out	numFact int)
 begin
    insert into facturaServitec values (0,FechaInicial,cedulaClie,subtot,iva,tot);
	SELECT noFactura into numFact FROM facturaServitec order BY noFactura DESC LIMIT 1;
 end
 @
 delimiter ;
 
 
 #CREATE INDEX <index_name> ON <table_name> (<col_name>);
create index DescripcionArticulo on articulo (descripcion);
create index fechaEmisionFacturaServitec on facturaServitec (fechaEmision);
create index noFacturaFacturaExterna on facturaExterna (noFactura);
create index CedulaxCargoEmp on empleado(cedula,cargo);
create index FechaTrabajo on trabajo (fechaTrabajo);

#Modificar una distribuidora
delimiter @
 create procedure Eliminar_Distribuidora(in idDistrib char(20))
 begin
    update facturaExterna set idDistribuidora=null where idDistribuidora=idDistrib ;
    DELETE FROM distribuidora WHERE idDistribuidora= idDistrib;
	
 end
 @
 delimiter ;
 
create view TodosArticulos as (select art.codigoArticulo,art.descripcion,factExt.noFactura, dist.idDistribuidora,cart.precioUnitario,cart.cantidad from articulo art join compraarticulo cart on art.codigoArticulo=cart.codigoArticulo join facturaExterna factExt on cart.noRegistro=factExt.noRegistro join distribuidora dist on factExt.idDistribuidora=dist.idDistribuidora);
select * from TodosArticulos;