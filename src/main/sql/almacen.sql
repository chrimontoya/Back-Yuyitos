-- MySQL Script generated by MySQL Workbench
-- dom 29 may 2022 23:37:56
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema almacen
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `almacen` ;

-- -----------------------------------------------------
-- Schema almacen
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `almacen` DEFAULT CHARACTER SET utf8 ;
USE `almacen` ;

-- -----------------------------------------------------
-- Table `almacen`.`FIADO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`FIADO` ;

CREATE TABLE IF NOT EXISTS `almacen`.`FIADO` (
  `id_deuda` INT NOT NULL AUTO_INCREMENT,
  `estado` TINYINT NOT NULL,
  PRIMARY KEY (`id_deuda`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`CLIENTE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`CLIENTE` ;

CREATE TABLE IF NOT EXISTS `almacen`.`CLIENTE` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT,
  `rut` INT NOT NULL,
  `dv` VARCHAR(1) NOT NULL,
  `nombres` VARCHAR(100) NULL,
  `apellido_paterno` VARCHAR(100) NULL,
  `apellido_materno` VARCHAR(100) NULL,
  `FIADO_id_fiado` INT NOT NULL,
  PRIMARY KEY (`id_cliente`),
  INDEX `fk_CLIENTE_DEUDA1_idx` (`FIADO_id_fiado` ASC) VISIBLE,
  CONSTRAINT `fk_CLIENTE_DEUDA1`
    FOREIGN KEY (`FIADO_id_fiado`)
    REFERENCES `almacen`.`FIADO` (`id_deuda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`VENTA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`VENTA` ;

CREATE TABLE IF NOT EXISTS `almacen`.`VENTA` (
  `id_venta` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `CLIENTE_id_cliente` INT NOT NULL,
  PRIMARY KEY (`id_venta`),
  INDEX `fk_VENTA_CLIENTE1_idx` (`CLIENTE_id_cliente` ASC) VISIBLE,
  CONSTRAINT `fk_VENTA_CLIENTE1`
    FOREIGN KEY (`CLIENTE_id_cliente`)
    REFERENCES `almacen`.`CLIENTE` (`id_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`DETALLE_VENTA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`DETALLE_VENTA` ;

CREATE TABLE IF NOT EXISTS `almacen`.`DETALLE_VENTA` (
  `id_detalle_venta` INT UNSIGNED NOT NULL,
  `monto` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `PRODUCTO_TIPO_CATEGORIA_id_tipo_categoria` INT NOT NULL,
  `VENTA_id_venta` INT NOT NULL,
  PRIMARY KEY (`id_detalle_venta`),
  INDEX `fk_DETALLE_VENTA_VENTA1_idx` (`VENTA_id_venta` ASC) VISIBLE,
  CONSTRAINT `fk_DETALLE_VENTA_VENTA1`
    FOREIGN KEY (`VENTA_id_venta`)
    REFERENCES `almacen`.`VENTA` (`id_venta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`CATEGORIA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`CATEGORIA` ;

CREATE TABLE IF NOT EXISTS `almacen`.`CATEGORIA` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`TIPO_CATEGORIA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`TIPO_CATEGORIA` ;

CREATE TABLE IF NOT EXISTS `almacen`.`TIPO_CATEGORIA` (
  `id_tipo_categoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `CATEGORIA_id_categoria` INT NOT NULL,
  PRIMARY KEY (`id_tipo_categoria`),
  INDEX `fk_TIPO_CATEGORIA_CATEGORIA1_idx` (`CATEGORIA_id_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_TIPO_CATEGORIA_CATEGORIA1`
    FOREIGN KEY (`CATEGORIA_id_categoria`)
    REFERENCES `almacen`.`CATEGORIA` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`PRODUCTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`PRODUCTO` ;

CREATE TABLE IF NOT EXISTS `almacen`.`PRODUCTO` (
  `id_producto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `cantidad` INT NOT NULL,
  `fecha_vencimiento` DATE NULL,
  `imagen` BLOB NULL,
  `TIPO_CATEGORIA_id_tipo_categoria` INT NOT NULL,
  PRIMARY KEY (`id_producto`),
  INDEX `fk_PRODUCTO_TIPO_CATEGORIA1_idx` (`TIPO_CATEGORIA_id_tipo_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_PRODUCTO_TIPO_CATEGORIA1`
    FOREIGN KEY (`TIPO_CATEGORIA_id_tipo_categoria`)
    REFERENCES `almacen`.`TIPO_CATEGORIA` (`id_tipo_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`RUBRO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`RUBRO` ;

CREATE TABLE IF NOT EXISTS `almacen`.`RUBRO` (
  `id_rubro` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_rubro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`PROVEEDOR`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`PROVEEDOR` ;

CREATE TABLE IF NOT EXISTS `almacen`.`PROVEEDOR` (
  `id_proveedor` INT NOT NULL AUTO_INCREMENT,
  `rut` INT NOT NULL,
  `dv` VARCHAR(1) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `RUBRO_id_rubro` INT NOT NULL,
  PRIMARY KEY (`id_proveedor`),
  INDEX `fk_PROVEEDOR_RUBRO1_idx` (`RUBRO_id_rubro` ASC) VISIBLE,
  CONSTRAINT `fk_PROVEEDOR_RUBRO1`
    FOREIGN KEY (`RUBRO_id_rubro`)
    REFERENCES `almacen`.`RUBRO` (`id_rubro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`ORDEN`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`ORDEN` ;

CREATE TABLE IF NOT EXISTS `almacen`.`ORDEN` (
  `id_orden` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `estado` TINYINT NOT NULL,
  `PROVEEDOR_id_proveedor` INT NOT NULL,
  PRIMARY KEY (`id_orden`),
  INDEX `fk_ORDEN_PROVEEDOR1_idx` (`PROVEEDOR_id_proveedor` ASC) VISIBLE,
  CONSTRAINT `fk_ORDEN_PROVEEDOR1`
    FOREIGN KEY (`PROVEEDOR_id_proveedor`)
    REFERENCES `almacen`.`PROVEEDOR` (`id_proveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`CONTACTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`CONTACTO` ;

CREATE TABLE IF NOT EXISTS `almacen`.`CONTACTO` (
  `id_contacto` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(100) NOT NULL,
  `telefono` INT NOT NULL,
  `PROVEEDOR_id_proveedor` INT NOT NULL,
  PRIMARY KEY (`id_contacto`),
  INDEX `fk_CONTACTO_PROVEEDOR1_idx` (`PROVEEDOR_id_proveedor` ASC) VISIBLE,
  CONSTRAINT `fk_CONTACTO_PROVEEDOR1`
    FOREIGN KEY (`PROVEEDOR_id_proveedor`)
    REFERENCES `almacen`.`PROVEEDOR` (`id_proveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`DETALLE_ORDEN`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`DETALLE_ORDEN` ;

CREATE TABLE IF NOT EXISTS `almacen`.`DETALLE_ORDEN` (
  `id_detalle_orden` INT NOT NULL AUTO_INCREMENT,
  `nombre_producto` VARCHAR(100) NOT NULL,
  `cantidad` INT NOT NULL,
  `monto` INT NOT NULL,
  `fecha_vencimiento` DATE NOT NULL,
  `PRODUCTO_id_producto` INT NOT NULL,
  `ORDEN_id_orden` INT NOT NULL,
  PRIMARY KEY (`id_detalle_orden`),
  INDEX `fk_DETALLE_ORDEN_PRODUCTO1_idx` (`PRODUCTO_id_producto` ASC) VISIBLE,
  INDEX `fk_DETALLE_ORDEN_ORDEN1_idx` (`ORDEN_id_orden` ASC) VISIBLE,
  CONSTRAINT `fk_DETALLE_ORDEN_PRODUCTO1`
    FOREIGN KEY (`PRODUCTO_id_producto`)
    REFERENCES `almacen`.`PRODUCTO` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DETALLE_ORDEN_ORDEN1`
    FOREIGN KEY (`ORDEN_id_orden`)
    REFERENCES `almacen`.`ORDEN` (`id_orden`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`RECEPCION`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`RECEPCION` ;

CREATE TABLE IF NOT EXISTS `almacen`.`RECEPCION` (
  `id_recepcion` INT NOT NULL AUTO_INCREMENT,
  `id_producto` INT NOT NULL,
  `id_orden` INT NOT NULL,
  `fecha` DATE NOT NULL,
  PRIMARY KEY (`id_recepcion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacen`.`DEUDA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`DEUDA` ;

CREATE TABLE IF NOT EXISTS `almacen`.`DEUDA` (
  `id_deuda` INT NOT NULL,
  `id_venta` INT NOT NULL,
  `id_cliente` INT NOT NULL,
  PRIMARY KEY (`id_deuda`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

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


