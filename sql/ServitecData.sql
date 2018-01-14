

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
  ("0912345678","Juan","Mera", "jmera@hotmail.com", "Orquideas", "0924213743","Albanil", 150 ,null, null, "0945321212"),
  ("0912312431","Olando","Romero", "ORomero@hotmail.com", "Orquideas", "0936325323","Albanil", 150,null,null ,"0945321212"),
  ("0912642371","Francisco","Lecaro", "FraLecaro@hotmail.com", "Orquideas", "0974563452","Albanil",150, null, null, "0945321212");
  
  insert into articulo values("001","varilla 1/2"), ("002", "lampara Fluorescente"), ("003","foco"), ("004","cable 1 mm");
  
  #date = YYYY-MM-DD
  insert into facturaservitec values ("0000370", "2018-01-10","0919862664",25.00,3.00,28.00);
  
  insert into trabajo values (1, "2018-01-12" ,"Reparacion de luces fluorecentes", "0000370", "2018-01-20",25.00,false),
							 (2, "2018-01-12", "Reparacion techo", "0000370" , "2018-01-14",30.00, true ),
                             (3, "2018-01-12", "Cambio de tomacorriente", "0000370" , "2018-01-14",10.00, true );

  insert into bitacora values (001, "se retiro la fluorecente y se limpio el socket", "2018-01-12", 1);
