INSERT INTO group_animals (name_group, quantity) VALUES ('HERBIVOROUS', 0),
                                                       ('(HERBIVOROUS OR CARNIVOROUS) AND SMALL', 0),
                                                       ('OMNIVOROUS AND NOT HIGH', 0)^;

INSERT INTO animal (name, weight, height, type) VALUES ('Animal1', 'LUNG', 'LOW', 'HERBIVOROUS'),
                                                       ('Animal2', 'LUNG', 'SMALL', 'HERBIVOROUS'),
                                                       ('Animal3', 'LUNG', 'SMALL', 'CARNIVOROUS'),
                                                       ('Animal4', 'LUNG', 'SMALL', 'CARNIVOROUS'),
                                                       ('Animal5', 'LUNG', 'SMALL', 'CARNIVOROUS'),
                                                       ('Animal6', 'LUNG', 'HIGH', 'HERBIVOROUS'),
                                                       ('Animal7', 'LUNG', 'SMALL', 'OMNIVOROUS'),
                                                       ('Animal8', 'LUNG', 'LOW', 'OMNIVOROUS'),
                                                       ('Animal9', 'LUNG', 'HIGH', 'OMNIVOROUS')^;



