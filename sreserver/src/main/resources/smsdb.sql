-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema sredb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sredb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sredb` DEFAULT CHARACTER SET utf8 ;
USE `sredb` ;

-- -----------------------------------------------------
-- Table `sredb`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`employee` (
  `id` VARCHAR(64) NOT NULL,
  `idcard` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sredb`.`position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`position` (
  `id` VARCHAR(64) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sredb`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`department` (
  `id` VARCHAR(64) NOT NULL,
  `parentid` VARCHAR(45) NULL,
  `isparent` TINYINT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sredb`.`feature`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`feature` (
  `id` VARCHAR(64) NOT NULL,
  `name_zh` VARCHAR(64) NOT NULL,
  `name_en` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sredb`.`menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`menu` (
  `id` VARCHAR(64) NOT NULL,
  `url` VARCHAR(64) NOT NULL,
  `path` VARCHAR(64) NULL,
  `component` VARCHAR(64) NULL,
  `name` VARCHAR(64) NULL,
  `iconCls` VARCHAR(64) NULL,
  `keepAlive` TINYINT(1) NULL,
  `requireAuth` TINYINT(1) NULL,
  `enabled` TINYINT(1) NULL,
  `menucol` VARCHAR(45) NULL,
  `parent_id` VARCHAR(64) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_menu_menu_idx` (`parent_id` ASC) VISIBLE,
  CONSTRAINT `fk_menu_menu`
    FOREIGN KEY (`parent_id`)
    REFERENCES `sredb`.`menu` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sredb`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`role` (
  `id` VARCHAR(64) NOT NULL,
  `name` VARCHAR(64) NULL,
  `nameZh` VARCHAR(64) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sredb`.`tbl_relation_map`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`tbl_relation_map` (
  `id` VARCHAR(64) NOT NULL,
  `fnodeid` VARCHAR(64) NOT NULL,
  `tnodeid` VARCHAR(64) NOT NULL,
  `fnodetype` VARCHAR(45) NOT NULL,
  `tnodetype` VARCHAR(45) NOT NULL,
  `status` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sredb`.`sreuser`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sredb`.`sreuser` (
  `id` VARCHAR(64) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `enabled` TINYINT NOT NULL DEFAULT 1,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
