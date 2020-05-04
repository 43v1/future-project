CREATE DATABASE wheels_and_tires;

CREATE TABLE `wheels_and_tires`.`wheels` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `brand` INT NULL,
  `model` INT NULL,
  `width` DOUBLE NULL,
  `size` INT NULL,
  `offset` INT NULL,
  `weight` DOUBLE NULL,
  `material` varchar(255) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `wheels_and_tires`.`tires` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `brand` INT NULL,
  `model` INT NULL,
  `width` INT NULL,
  `size` INT NULL,
  `height` INT NULL,
  `speed_index` varchar(1) NULL,
  `season` varchar(255) NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `wheels_and_tires`.`ads` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(255) NULL,
  `tire` INT NULL,
  `wheel` INT NULL,
  `user` INT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `wheels_and_tires`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `fname` VARCHAR(255) NULL,
  `lname` VARCHAR(255) NULL,
  `gender` VARCHAR(255) NULL,
  `age` INT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `wheels_and_tires`.`ads_type` (
  `id` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO wheels_and_tires.ads_type(id, name) VALUES ('WHEEL','Обява за джанти');
INSERT INTO wheels_and_tires.ads_type(id, name) VALUES ('TIRE','Обява за гуми');
INSERT INTO wheels_and_tires.ads_type(id, name) VALUES ('WHEEL_AND_TIRE','Обява за джанти и гуми');

ALTER TABLE wheels_and_tires.ads
ADD CONSTRAINT FK_ads_type
FOREIGN KEY (type) REFERENCES wheels_and_tires.ads_type(id);

ALTER TABLE wheels_and_tires.ads
ADD CONSTRAINT FK_ads_tires
FOREIGN KEY (tire) REFERENCES wheels_and_tires.tires(id);

ALTER TABLE wheels_and_tires.ads
ADD CONSTRAINT FK_ads_wheels
FOREIGN KEY (wheel) REFERENCES wheels_and_tires.wheels(id);

ALTER TABLE wheels_and_tires.ads
ADD CONSTRAINT FK_ads_users
FOREIGN KEY (user) REFERENCES wheels_and_tires.users(id);

CREATE TABLE `wheels_and_tires`.`tire_brands` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

ALTER TABLE wheels_and_tires.tires
ADD CONSTRAINT FK_tires_tire_brands
FOREIGN KEY (brand) REFERENCES wheels_and_tires.tire_brands(id);

CREATE TABLE `wheels_and_tires`.`tire_brands_models` (
  `id` INT NOT NULL,
  `brand` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

ALTER TABLE wheels_and_tires.tire_brands_models
ADD CONSTRAINT FK_tire_brands_models_tire_brands
FOREIGN KEY (brand) REFERENCES wheels_and_tires.tire_brands(id);

ALTER TABLE wheels_and_tires.tires
ADD CONSTRAINT FK_tires_tire_brands_models
FOREIGN KEY (model) REFERENCES wheels_and_tires.tire_brands_models(id);

CREATE TABLE `wheels_and_tires`.`season` (
  `id` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO wheels_and_tires.season(id, name) VALUES ('WINTER','Зима');
INSERT INTO wheels_and_tires.season(id, name) VALUES ('SUMMER','Лято');
INSERT INTO wheels_and_tires.season(id, name) VALUES ('ALL_SEASONS','Всесезонни');

ALTER TABLE wheels_and_tires.tires
ADD CONSTRAINT FK_tires_season
FOREIGN KEY (season) REFERENCES wheels_and_tires.season(id);


