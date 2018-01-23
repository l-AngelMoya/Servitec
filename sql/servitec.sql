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
  noFactura char(10)  primary key,
  fechaEmision date ,
  cedula char(10),
  subtotal float,
  iva float,
  total float,
  foreign key (cedula) references cliente (cedula)
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
    noTrabajo int primary key,
    fechaTrabajo date,
    descripcion varchar(60),
    noFactura char(10),
    fechaEntrega date,
    costoManoObra float,
    isTerminado boolean default false,
    foreign key (noFactura) references facturaServitec (noFactura)
  );

create table bitacora (
  idbitacora int primary key,
  detalle varchar(100),
  fecha date,
  noTrabajo int,
  foreign key (noTrabajo) references trabajo (noTrabajo)
);

create table empleadosAsignados(
  noTrabajo int,
  cedula int,
  primary key(notrabajo,cedula),
  foreign key(noTrabajo) references trabajo (noTrabajo)
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
  primary key(noTrabajo, codigoArticulo),
  foreign key(noTrabajo) references trabajo(noTrabajo),
  foreign key(codigoArticulo) references articulo (codigoArticulo)
);


create table gasto(
  noGasto int primary key,
  razon varchar(50),
  fechaGasto date
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
# call Ingresar_Factura_Externa("10","0992125691001",now(),0,0,0,0,@fknoRegistro);
 #select @fknoRegistro;
 #call Ingresar_Articulo("54234",4,10,40,"juego de cama",1);

