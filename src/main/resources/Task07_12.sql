DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;



DROP TABLE IF EXISTS commands;
CREATE TABLE commands (
command_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
command VARCHAR (20),
command_description VARCHAR (100)
);

DROP TABLE IF EXISTS animal_groups;
CREATE TABLE animal_groups (
animal_group_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
animal_group_name VARCHAR (20)
);

DROP TABLE IF EXISTS animal_types;
CREATE TABLE animal_types (
animal_type_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
animal_type_name VARCHAR (20),
in_group INT UNSIGNED NOT NULL,
FOREIGN KEY (in_group) REFERENCES animal_groups (animal_group_id)
);

DROP TABLE IF EXISTS animals;
CREATE TABLE animals (
animal_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
animal_name VARCHAR (20),
refers_to_type INT UNSIGNED NOT NULL,
birth_date DATE,
FOREIGN KEY (refers_to_type) REFERENCES animal_types (animal_type_id)
);

DROP TABLE IF EXISTS animal_skills;
CREATE TABLE animal_skills (
skill_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
animal_id INT UNSIGNED NOT NULL,
can_do INT UNSIGNED NOT NULL,
FOREIGN KEY (animal_id) REFERENCES animals(animal_id)
ON DELETE CASCADE,
FOREIGN KEY (can_do) REFERENCES commands(command_id)
);

INSERT INTO commands (command,command_description)
VALUES
('go', 'move forward'),
('stop', 'stop moving'),
('sit', 'sit down'),
('voice', 'make a noise'),
('die', 'lie on your back and don\'t move'),
('aport', 'bring a throwed thing'),
('fas', 'attack a target');

INSERT INTO animal_groups (animal_group_name)
VALUES
('pet'),
('beast of burgen');

INSERT INTO animal_types (animal_type_name, in_group)
VALUES 
('dog', 1),
('cat', 1),
('hamster', 1),
('horse', 2),
('camel', 2),
('donkey', 2);

INSERT INTO animals (refers_to_type, animal_name, birth_date)
VALUES
(1, 'Polkan', '2005-05-23'),
(2, 'Timofey', '2015-01-05'),
(3, 'Button', '2023-02-15'),
(4, 'Appollo', '2010-11-02'),
(4, 'Zeus', '2017-12-10'),
(5, 'Jokfor', '2018-10-25'),
(6, 'Donkey', '2020-04-07'),
(1, 'Chloy', '2019-03-08'),
(2, 'Fluffy', '2021-09-05'),
(1, 'Bolt', '2022-07-12'),
(5, 'Stiff', '2012-08-08'),
(5, 'Tank', '2013-06-29'),
(2, 'Spark', '2021-06-20'),
(3, 'Lucifire', '2022-04-17');

INSERT INTO animal_skills (animal_id, can_do)
VALUES
(1, 3),
(1, 4),
(4, 1),
(4, 2),
(5, 1),
(5, 2),
(6, 1),
(6, 2),
(8, 5),
(10, 3),
(10, 4),
(10, 6),
(10, 7)
;

SET @camel_id = 
(SELECT animal_type_id
FROM animal_types
WHERE animal_type_name = 'camel');

DELETE FROM animals WHERE refers_to_type = @camel_id;

DROP TABLE IF EXISTS young_animals;
CREATE TABLE young_animals (
young_animal_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
animal_id INT UNSIGNED NOT NULL,
young_animal_age VARCHAR (50),
FOREIGN KEY (animal_id) REFERENCES animals(animal_id)
ON DELETE CASCADE
);

INSERT INTO young_animals (animal_id, young_animal_age)
SELECT  animal_id,
		CONCAT((FLOOR(DATEDIFF(NOW(), birth_date)/365)),' years ', (FLOOR(DATEDIFF(NOW(), birth_date)%365/30.4)), ' month') as age 
FROM animals 
WHERE (DATEDIFF(NOW(), birth_date)/365)>1
	  AND 
	  (DATEDIFF(NOW(), birth_date)/365)<3
;


SELECT  animal_id,
		(FLOOR(DATEDIFF(NOW(), birth_date)/365)) as _years,
		(FLOOR(DATEDIFF(NOW(), birth_date)%365/30.4)) as _month,
		CONCAT((FLOOR(DATEDIFF(NOW(), birth_date)/365)),' years ', (FLOOR(DATEDIFF(NOW(), birth_date)%365/30.4)), ' month') as age 
FROM animals 
WHERE (DATEDIFF(NOW(), birth_date)/365)>1
	  AND 
	  (DATEDIFF(NOW(), birth_date)/365)<3;
	  
	 
	 