INSERT INTO almacen.CATEGORIA (nombre) values ("Alimentos no perecibles");
INSERT INTO almacen.CATEGORIA (nombre) values ("Alimentos perecibles");
INSERT INTO almacen.CATEGORIA (nombre) values ("Bebidas");
INSERT INTO almacen.CATEGORIA (nombre) values ("Articulos de aseo");
INSERT INTO almacen.CATEGORIA (nombre) values ("Articulos de bazar");

INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Azucar 1Kg",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Azucar 5Kg",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Sal 1Kg",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Sal 5Kg",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Café 170g",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Café 400g",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Harina 1Kg",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Harina 5Kg",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Leche en polvo 700g",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Leche en polvo 1500g",1);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Frutas y Verduras",2);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Carne de vacuno",2);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Bebida 1L",3);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Bebida 2L",3);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Bebida 3L",3);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Detergente 1L",4);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Detergente 3L",4);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Lavaloza 1L",4);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Lavaloza 5L",4);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Confort 12u",5);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Confort 24u",5);
INSERT INTO almacen.TIPO_CATEGORIA (nombre,CATEGORIA_id_categoria) values ("Vasos de plastico",5);

INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Detergente genérico",0,null,null,16,2000);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Detergente genérico azul",0,null,null,17,4000);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Peras",0,null,null,11,400);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Manzana roja",0,null,null,11,600);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Manzana verde",0,null,null,11,700);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Quick",0,null,null,18,1000);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Quick con cloro",0,null,null,19,4000);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Cocacola",0,null,null,13,900);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Cocacola",0,null,null,14,1250);
INSERT INTO almacen.PRODUCTO (nombre, cantidad, fecha_vencimiento, imagen, TIPO_CATEGORIA_id_tipo_categoria, precio)
VALUES("Cocacola",0,null,null,15,2250);

INSERT INTO almacen.rubro (nombre) VALUES ("Ganadería");
INSERT INTO almacen.rubro (nombre) VALUES ("Pesca");
INSERT INTO almacen.rubro (nombre) VALUES ("Alimentos");

INSERT INTO almacen.proveedor (rut,dv,nombre,RUBRO_id_rubro) VALUES (73345735,"k","Distribuidora S.A",3);
INSERT INTO almacen.proveedor (rut,dv,nombre,RUBRO_id_rubro) VALUES (73936823,"1","Alimentos frescos",3);
INSERT INTO almacen.proveedor (rut,dv,nombre,RUBRO_id_rubro) VALUES (73945123,"6","Pesco",2);
INSERT INTO almacen.proveedor (rut,dv,nombre,RUBRO_id_rubro) VALUES (73123432,"9","Ganadería S.A",1);

INSERT INTO almacen.contacto (email,telefono,PROVEEDOR_id_proveedor) VALUES ("distribuidora@gmail.com",973346475,1);
INSERT INTO almacen.contacto (email,telefono,PROVEEDOR_id_proveedor) VALUES ("alimentos@gmail.com",987346475,2);
INSERT INTO almacen.contacto (email,telefono,PROVEEDOR_id_proveedor) VALUES ("pesco@gmail.com",935846475,3);
INSERT INTO almacen.contacto (email,telefono,PROVEEDOR_id_proveedor) VALUES ("ganaderia@gmail.com",979446475,4);

INSERT INTO almacen.rol (usuario) VALUES ("ADMIN");
INSERT INTO almacen.rol (usuario) VALUES ("USUARIO");
INSERT INTO almacen.rol (usuario) VALUES ("INACTIVO");

INSERT INTO almacen.usuario (usuario, password, rol_id_rol) VALUES ("almacen","1234",1);
INSERT INTO almacen.usuario (usuario, password, rol_id_rol) VALUES ("proveedor","1234",2);
INSERT INTO almacen.usuario (usuario, password, rol_id_rol) VALUES ("cliente","1234",3);

INSERT INTO almacen.fiado (estado) VALUES (0);
INSERT INTO almacen.fiado (estado) VALUES (1);