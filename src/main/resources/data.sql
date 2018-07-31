/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ali Mujthaba
 * Created: Jul 3, 2018
 */

create table person(
    id integer not null,
    full_name varchar(255) not null,
    birth_date bigint,
    primary key(id)
);

INSERT INTO person (id, full_name,birth_date) VALUES (1, 'ALI MUJUTHABA', 1500893000);
INSERT INTO person (id, full_name,birth_date) VALUES (2, 'ISMAIL HAFIZ', 1500793000);
INSERT INTO person (id, full_name,birth_date) VALUES (3, 'AISHATH SAHAA', 1500893000);

INSERT INTO course (course_name, lecturer_name, is_full, number_of_students) VALUES ('Bachelor of Hibernate', 'Vlad Mihalcea', true, 1000);
INSERT INTO course (course_name, lecturer_name, is_full, number_of_students) VALUES ('Bachelor of Spring Boot', 'Stephane Nicoll', true, 2000);
INSERT INTO course (course_name, lecturer_name, is_full, number_of_students) VALUES ('Bachelor of React', 'Dan Abramov', false,  3000);



INSERT INTO passport (id, passport_number) VALUES (3001, 'PP1020232');
INSERT INTO passport (id, passport_number) VALUES (3002, 'PP5020322');
INSERT INTO passport (id, passport_number) VALUES (3003, 'PP6020326');

INSERT INTO student (id, full_name, passport_id) VALUES (2001, 'John Doe', 3001);
INSERT INTO student (id, full_name, passport_id) VALUES (2002, 'Jack Doe', 3002);
INSERT INTO student (id, full_name, passport_id) VALUES (2003, 'Jill Doe', 3003);


INSERT INTO review (id, rating, description, course_id) VALUES (4001, '1', 'Bad course', 2);
INSERT INTO review (id, rating, description, course_id) VALUES (4002, '4', 'Excellent course', 2);
INSERT INTO review (id, rating, description, course_id) VALUES (4003, '5', 'Good course', 3);