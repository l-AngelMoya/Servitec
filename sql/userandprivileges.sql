use servitec;

CREATE USER 'Gerente'@'200.9.176.9' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON * . * TO 'Gerente'@'200.9.176.9';


CREATE USER 'Secretaria'@'localhost' IDENTIFIED BY '5678';
GRANT SELECT,SHOW VIEW ON * . * TO 'Secretaria'@'localhost';

CREATE USER 'Empleado'@'localhost' IDENTIFIED BY '5678';
GRANT SHOW VIEW ON * . * TO 'Empleado'@'localhost';

CREATE USER 'Supervisor'@'localhost' IDENTIFIED BY '5678';
GRANT SELECT, UPDATE,DELETE ON * . * TO 'Supervisor'@'localhost';

CREATE USER 'Tesorero'@'localhost' IDENTIFIED BY '5678';
GRANT UPDATE,DELETE ON * . * TO 'Tesorero'@'localhost';

drop user Gerente@200.9.176.9;
drop user Secretaria@localhost;
drop user Empleado@localhost;
drop user Supervisor@localhost;
drop user Tesorero@localhost;
show grants for 'Secretaria'@'localhost';
show grants for 'Empleado'@'localhost';
show grants for 'Supervisor'@'localhost';
show grants for 'Tesorero'@'localhost';
