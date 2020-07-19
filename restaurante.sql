SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `restaurante` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `restaurante` ;

-- -----------------------------------------------------
-- Table `restaurante`.`funcionario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `restaurante`.`funcionario` (
  `id_funcionario` INT NOT NULL AUTO_INCREMENT ,
  `nome` CHAR(50) NOT NULL ,
  `login` CHAR(20) NOT NULL ,
  `senha` CHAR(10) NOT NULL ,
  PRIMARY KEY (`id_funcionario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `restaurante`.`item`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `restaurante`.`item` (
  `id_item` INT NOT NULL AUTO_INCREMENT ,
  `nome_item` CHAR(30) NOT NULL ,
  `preco_item` DOUBLE NOT NULL ,
  PRIMARY KEY (`id_item`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `restaurante`.`pedido`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `restaurante`.`pedido` (
  `id_pedido` INT NOT NULL AUTO_INCREMENT ,
  `mesa_pedido` INT NOT NULL ,
  `qtd_pedido` INT NOT NULL ,
  `subtotal_pedido` DOUBLE NOT NULL ,
  `item_id_item` INT NOT NULL ,
  `funcionario_id_funcionario` INT NOT NULL ,
  PRIMARY KEY (`id_pedido`, `item_id_item`, `funcionario_id_funcionario`) ,
  INDEX `fk_pedido_item1_idx` (`item_id_item` ASC) ,
  INDEX `fk_pedido_funcionario1_idx` (`funcionario_id_funcionario` ASC) ,
  CONSTRAINT `fk_pedido_item1`
    FOREIGN KEY (`item_id_item` )
    REFERENCES `restaurante`.`item` (`id_item` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_funcionario1`
    FOREIGN KEY (`funcionario_id_funcionario` )
    REFERENCES `restaurante`.`funcionario` (`id_funcionario` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `restaurante` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
