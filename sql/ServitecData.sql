

insert into cliente values ("0923213257", "Angel" ,"Rodriguez", "Arodriguez@hotmail.com", "Guasmo Sur", "0923521423"),
  ("0123453657", "Pedro" ,"Mendez", "Arodriguez@hotmail.com", "Urdesa", "0943323121"),
  ("0463756428", "Manuel" ,"Villao", "Mvillao@hotmail.com", "Floresta", "0962358262"),
  ("0937362273", "Diana" ,"ordoñez", "DianaOrdoñez@hotmail.com", "Mucholote", "0863572566"),
  ("0923723622", "Margarita" ,"Filian", "Mfilian@hotmail.com", "Las Almas", "0972516121"),
  ("0972523722", "Rocio" ,"Mera", "Remera@hotmail.com", "Duran", "0923521423"),
  ("0919862664","Ericka","Mejia Ortiz", "erkaMejia@hotmail.com","Km. 6.5 via a Daule", "2047011");

insert into distribuidora values ("1792169623001","ChecoParts","Av. de las americas 63/ Guayaquil", "ventas@ChecoParts.com", "042476253"),
								 ("0992125691001","Kitton","Av. Carlos Julio Arosemena km 2.5 / Guayaquil", "kitton@hotmail.com", "042347613"),
								 ("0993223291032","Plastigama","Via a Daule Km 5.6/ Guayaquil","ventasPublico@plastigama.com","3716900");

insert into empleado values ("0990851889","Luis","Moya", "lamoya@espol.edu.ec", "guasmo sur", "0990851889","gerente",800,"lamoya","1234", null),
  ("0945321212","Carlos","Burgos", "carlosburgos@servitec.com", "Mucholote", "0921212325","Jefe",600, "cburgos","cburgos", null),
  ("0912345754","Carolina","Burgos", "caralbur@espol.edu.ec", "Mucholote", "0991241222","Secretaria",300,"carolina","caralbur", "0945321212"),
  ("0912345678","Juan","Mera", "jmera@hotmail.com", "Orquideas", "0924213743","Albañil",	 150 ,null, null, "0945321212"),
  ("0912312431","Orlando","Romero", "ORomero@hotmail.com", "Orquideas", "0936325323","Albañil", 150,null,null ,"0945321212"),
  ("0912642371","Francisco","Lecaro", "FraLecaro@hotmail.com", "Orquideas", "0974563452","Albañil",150, null, null, "0945321212");
  
  insert into articulo values("001","varilla 1/2"), ("002", "lampara Fluorescente"), ("003","foco"), ("004","cable 1 mm");
  
  insert into facturaservitec values ("0000370", "2018-01-10","0919862664",25.00,3.00,28.00),
									 ("0000001", "2018-01-10","0919862664",25.00,3.00,28.00);
  
  

#insert into bitacora values (001, "se retiro la fluorecente y se limpio el socket", "2018-01-12", 1);


call Ingresar_Factura_Externa("0000100","0992125691001",now(),122.57,10.97,13.39,124.99,@fknoRegistro);
call Ingresar_Articulo("005",5,1.99,9.95,"toma corriente doble",1);
call Ingresar_Articulo("006",1,0.25,0.25,"placa toma-sencilla",1);
call Ingresar_Articulo("007",1,1.55,1.55,"pulsador",1);
call Ingresar_Articulo("008",1,0.25,0.25,"Bisel 4x4 sencillo",1);
call Ingresar_Articulo("009",3,35,100.44,"panel led",1);

call Ingresar_Factura_Externa("0000100","0993223291032",now(),25,12,12,250,@fknoRegistro);
call Ingresar_Articulo("010",4,2,8,"Pegamento",2);
call Ingresar_Articulo("011",1,10,10,"Arena",2);
call Ingresar_Articulo("012",4,1,4,"Ladrillo",2);

call Ingresar_Factura_Externa("0000101","0993223291032",now(),25,12,12,250,@fknoRegistro);
call Ingresar_Articulo("013",4,2,8,"Pegamento",3);
call Ingresar_Articulo("014",1,10,10,"Arena",3);
call Ingresar_Articulo("015",4,1,4,"Ladrillo",3);

#Trabajo
 call Ingresar_Trabajo('2018_01_28','2018_01_31',"fin proyecto",50,@pknoTrabajo);
 call Ingresar_EmpleadoAsignados(1,'0912642371');
 call Ingresar_Insumos(1,"007",1);
 call Ingresar_Insumos(1,"010",2);
 call Ingresar_Insumos(1,"012",1);