CREATE TABLE `wheels_and_tires`.`wheel_brands` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `wheels_and_tires`.`wheel_brands_models` (
  `id` INT NOT NULL,
  `brand` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

ALTER TABLE wheels_and_tires.wheel_brands_models
ADD CONSTRAINT FK_wheel_brands_models_wheel_brands
FOREIGN KEY (brand) REFERENCES wheels_and_tires.wheel_brands(id);



CREATE TABLE `wheels_and_tires`.`materials` (
  `id` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO wheels_and_tires.materials(id, name) VALUES ('ALLOY','Алуминиеви');
INSERT INTO wheels_and_tires.materials(id, name) VALUES ('STEEL','Железни');


ALTER TABLE wheels_and_tires.wheels
ADD CONSTRAINT FK_wheels_wheel_brands_models
FOREIGN KEY (model) REFERENCES wheels_and_tires.wheel_brands_models(id);


ALTER TABLE wheels_and_tires.wheels
ADD CONSTRAINT FK_wheels_wheel_brands
FOREIGN KEY (brand) REFERENCES wheels_and_tires.wheel_brands(id);


ALTER TABLE wheels_and_tires.wheels
ADD CONSTRAINT FK_wheels_materials
FOREIGN KEY (material) REFERENCES wheels_and_tires.materials(id);