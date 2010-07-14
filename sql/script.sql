/*
 * Execute this script before before run the app 
 * Database: MySQL
 * 
 * Author: Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */

CREATE TABLE `blog`.`STATE` (
  `STATE_ID` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `STATE_NAME` VARCHAR(45) NOT NULL,
  `STATE_CODE` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`STATE_ID`)
)
ENGINE = InnoDB;

insert into STATE (STATE_CODE, STATE_NAME) values ('AC','Acre');
insert into STATE (STATE_CODE, STATE_NAME) values ('AL','Alagoas');
insert into STATE (STATE_CODE, STATE_NAME) values ('AP','Amapá');
insert into STATE (STATE_CODE, STATE_NAME) values ('AM','Amazonas');
insert into STATE (STATE_CODE, STATE_NAME) values ('BA','Bahia');
insert into STATE (STATE_CODE, STATE_NAME) values ('CE','Ceará');
insert into STATE (STATE_CODE, STATE_NAME) values ('DF','Distrito Federal');
insert into STATE (STATE_CODE, STATE_NAME) values ('ES','Espírito Santo');
insert into STATE (STATE_CODE, STATE_NAME) values ('GO','Goiás');
insert into STATE (STATE_CODE, STATE_NAME) values ('MA','Maranhão');
insert into STATE (STATE_CODE, STATE_NAME) values ('MT','Mato Grosso');
insert into STATE (STATE_CODE, STATE_NAME) values ('MS','Mato Grosso do Sul');
insert into STATE (STATE_CODE, STATE_NAME) values ('MG','Minas Gerais');
insert into STATE (STATE_CODE, STATE_NAME) values ('PA','Pará');
insert into STATE (STATE_CODE, STATE_NAME) values ('PB','Paraíba');
insert into STATE (STATE_CODE, STATE_NAME) values ('PR','Paraná');
insert into STATE (STATE_CODE, STATE_NAME) values ('PE','Pernambuco');
insert into STATE (STATE_CODE, STATE_NAME) values ('PI','Piauí');
insert into STATE (STATE_CODE, STATE_NAME) values ('RJ','Rio de Janeiro');
insert into STATE (STATE_CODE, STATE_NAME) values ('RN','Rio Grande do Norte');
insert into STATE (STATE_CODE, STATE_NAME) values ('RS','Rio Grande do Sul');
insert into STATE (STATE_CODE, STATE_NAME) values ('RO','Rondônia');
insert into STATE (STATE_CODE, STATE_NAME) values ('RR','Roraima');
insert into STATE (STATE_CODE, STATE_NAME) values ('SC','Santa Catarina');
insert into STATE (STATE_CODE, STATE_NAME) values ('SP','São Paulo');
insert into STATE (STATE_CODE, STATE_NAME) values ('SE','Sergipe');
insert into STATE (STATE_CODE, STATE_NAME) values ('TO','Tocantins');
