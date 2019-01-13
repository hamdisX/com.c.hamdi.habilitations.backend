-- MySQL Workbench Forward Engineering

-- SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
-- SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
-- SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema habilitation
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema habilitation
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `habilitation` DEFAULT CHARACTER SET utf8 ;
USE `habilitation` ;

-- -----------------------------------------------------
-- Table `habilitation`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `habilitation`.`User` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `habilitation`.`Grp`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `habilitation`.`Grp` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `label` VARCHAR(45) NULL,
  `creation_date` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `habilitation`.`User_has_Group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `habilitation`.`User_has_Group` (
  `user_id` INT NOT NULL,
  `group_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `group_id`),
  INDEX `fk_User_has_Group_Group1_idx` (`group_id` ASC) ,
  INDEX `fk_User_has_Group_User_idx` (`user_id` ASC) ,
  CONSTRAINT `fk_User_has_Group_User`
    FOREIGN KEY (`user_id`)
    REFERENCES `habilitation`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_Group_Group1`
    FOREIGN KEY (`group_id`)
    REFERENCES `habilitation`.`Grp` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `habilitation`.`Profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `habilitation`.`Profile` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `label` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `habilitation`.`Grp_has_Profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `habilitation`.`Grp_has_Profile` (
  `grp_id` INT NOT NULL,
  `profile_id` INT NOT NULL,
  PRIMARY KEY (`grp_id`, `profile_id`),
  INDEX `fk_Group_has_Profil_Profil1_idx` (`profile_id` ASC) ,
  INDEX `fk_Group_has_Profil_Group1_idx` (`grp_id` ASC) ,
  CONSTRAINT `fk_Group_has_Profil_Group1`
    FOREIGN KEY (`grp_id`)
    REFERENCES `habilitation`.`Grp` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Group_has_Profil_Profil1`
    FOREIGN KEY (`profile_id`)
    REFERENCES `habilitation`.`Profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `habilitation`.`Resource`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `habilitation`.`Resource` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `label` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `habilitation`.`Privilege`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `habilitation`.`Privilege` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `label` VARCHAR(45) NULL,
  `profile_id` INT NOT NULL,
  `resource_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Privilege_Profile1_idx` (`profile_id` ASC) ,
  INDEX `fk_Privilege_Resource1_idx` (`resource_id` ASC) ,
  CONSTRAINT `fk_Privilege_Profile1`
    FOREIGN KEY (`profile_id`)
    REFERENCES `habilitation`.`Profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Privilege_Resource1`
    FOREIGN KEY (`resource_id`)
    REFERENCES `habilitation`.`Resource` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- SET SQL_MODE=@OLD_SQL_MODE;
-- SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
-- SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
