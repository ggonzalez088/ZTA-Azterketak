-- MySQL Script generated by MySQL Workbench
-- mié 22 may 2024 16:46:37
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Exam
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Exam` ;

-- -----------------------------------------------------
-- Schema Exam
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Exam` DEFAULT CHARACTER SET utf8 ;
USE `Exam` ;

-- -----------------------------------------------------
-- Table `Exam`.`AppUser`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Exam`.`AppUser` ;

CREATE TABLE IF NOT EXISTS `Exam`.`AppUser` (
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `roles` ENUM('administraria', 'langilea') NOT NULL,
  PRIMARY KEY (`login`),
  UNIQUE INDEX `logina_UNIQUE` (`login` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Exam`.`Baimena`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Exam`.`Baimena` ;

CREATE TABLE IF NOT EXISTS `Exam`.`Baimena` (
  `idBaimena` INT NOT NULL AUTO_INCREMENT,
  `gela` VARCHAR(45) NOT NULL,
  `AppUser_login` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idBaimena`),
  INDEX `fk_Baimena_AppUser1_idx` (`AppUser_login` ASC) VISIBLE,
  CONSTRAINT `fk_Baimena_AppUser1`
    FOREIGN KEY (`AppUser_login`)
    REFERENCES `Exam`.`AppUser` (`login`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Exam`.`Erabilpena`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Exam`.`Erabilpena` ;

CREATE TABLE IF NOT EXISTS `Exam`.`Erabilpena` (
  `idErabilpena` INT NOT NULL AUTO_INCREMENT,
  `gela` VARCHAR(45) NOT NULL,
  `sarrera` DATETIME NOT NULL,
  `irteera` DATETIME NULL,
  `AppUser_login` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idErabilpena`),
  INDEX `fk_Erabilpena_AppUser_idx` (`AppUser_login` ASC) VISIBLE,
  CONSTRAINT `fk_Erabilpena_AppUser`
    FOREIGN KEY (`AppUser_login`)
    REFERENCES `Exam`.`AppUser` (`login`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `Exam`.`AppUser`
-- -----------------------------------------------------
START TRANSACTION;
USE `Exam`;
INSERT INTO `Exam`.`AppUser` (`login`, `password`, `roles`) VALUES ('gaizka', 'gaizka', 'administraria');
INSERT INTO `Exam`.`AppUser` (`login`, `password`, `roles`) VALUES ('jose', 'jose', 'langilea');
INSERT INTO `Exam`.`AppUser` (`login`, `password`, `roles`) VALUES ('juan', 'juan', 'langilea');
INSERT INTO `Exam`.`AppUser` (`login`, `password`, `roles`) VALUES ('julian', 'julian', 'langilea');

COMMIT;

 