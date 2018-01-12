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
  noFactura int primary key,
  idDistribuidora char(20),
  fechaEmision date,
  subtotal float,
  descuento float,
  iva float,
  total float,
  
  foreign key (idDistribuidora) references distribuidora (idDistribuidora)
);

create table empleado(
  cedula char (10) primary key,
  nombre char (20),
  apellido char (20),
  correo char (30),
  direccion char(50),
  telefono char(15),
  cargo char(30),
  salarioMensual float,
  user char(12),
  contraseña char(12),
  idsupervisor char(10) default null,
  foreign key(idsupervisor)references empleado(cedula)
  );
  
  
  create table trabajo(
    noTrabajo int primary key,
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
  noFactura int,
  codigoArticulo char(20),
  cantidad int,
  precioUnitario float,
  precioTotal float,
  primary key(noFactura ,codigoArticulo),
  foreign key (noFactura) references facturaExterna (noFactura),
  foreign key (codigoArticulo) references articulo (codigoArticulo) );


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
 
create table salarioEmpleado(
  idEmpleado char(10),
  noGasto int,
  salario float,
  primary key(idEmpleado,noGasto),
  foreign key (idEmpleado) references empleado(cedula),
  foreign key (noGasto) references gasto(noGasto)
);