CREATE TABLE animal
(
	id serial not null
		primary key,
	name varchar(50),
	weight varchar(50),
	height varchar(50),
	type varchar(50)
)^;

CREATE TABLE group_animals
(
	id serial not null
		primary key,
	name_group varchar(100),
	quantity INTEGER
)^;

CREATE FUNCTION animal_registration_func()
    RETURNS trigger
    AS $animal_registration_trigger$
BEGIN
    UPDATE group_animals
    SET quantity = (SELECT COUNT(*) FROM animal WHERE type='HERBIVOROUS')
    WHERE
    name_group = 'HERBIVOROUS';

    UPDATE group_animals
    SET quantity = (SELECT COUNT(*) FROM animal WHERE (type='HERBIVOROUS' OR type='CARNIVOROUS') AND height='SMALL')
    WHERE
    name_group = '(HERBIVOROUS OR CARNIVOROUS) AND SMALL';

    UPDATE group_animals
    SET quantity = (SELECT COUNT(*) FROM animal WHERE type='OMNIVOROUS' AND NOT height='HIGH')
    WHERE
    name_group = 'OMNIVOROUS AND NOT HIGH';
RETURN NULL;
END;
$animal_registration_trigger$ LANGUAGE plpgsql^;

CREATE TRIGGER animal_registration_trigger
    AFTER INSERT OR UPDATE OR DELETE ON animal
    FOR EACH ROW EXECUTE PROCEDURE animal_registration_func()^;