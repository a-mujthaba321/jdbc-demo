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

INSERT INTO course (id, course_name) VALUES (1002, 'Bachelor of Hibernate');