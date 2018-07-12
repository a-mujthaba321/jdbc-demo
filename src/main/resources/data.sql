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

INSERT INTO course (id, course_name) VALUES (1001, 'Bachelor of Hibernate');
INSERT INTO course (id, course_name) VALUES (1002, 'Bachelor of IT');
INSERT INTO course (id, course_name) VALUES (1003, 'Bachelor of Spring');

INSERT INTO student (id, full_name) VALUES (2001, 'John Doe');
INSERT INTO student (id, full_name) VALUES (2002, 'Jack Doe');
INSERT INTO student (id, full_name) VALUES (2003, 'Jill Doe');

INSERT INTO passport (id, passport_number) VALUES (3001, 'PP1020232');
INSERT INTO passport (id, passport_number) VALUES (3002, 'PP5020322');
INSERT INTO passport (id, passport_number) VALUES (3003, 'PP6020326');


INSERT INTO review (id, rating, description) VALUES (4001, '1', 'Bad course');
INSERT INTO review (id, rating, description) VALUES (4002, '4', 'Excellent course');
INSERT INTO review (id, rating, description) VALUES (4003, '5', 'Good course');