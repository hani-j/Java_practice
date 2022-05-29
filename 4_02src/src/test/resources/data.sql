
call next value for hibernate_sequence; -- 값증가 --
insert into users('id', 'name', 'email', 'createdAt', 'updatedAt') values (1, 'martin', 'martin@fastcampus.com', now(), now());

call next value for hibernate_sequence;
insert into users('id', 'name', 'email', 'createdAt', 'updatedAt') values (2, 'dennis', 'dennis@fastcampus.com', now(), now());

call next value for hibernate_sequence;
insert into users('id', 'name', 'email', 'createdAt', 'updatedAt') values (3, 'sophia', 'sophia@slowcampus.com', now(), now());

call next value for hibernate_sequence;
insert into users('id', 'name', 'email', 'createdAt', 'updatedAt') values (4, 'james', 'james@fastcampus.com', now(), now());

call next value for hibernate_sequence;
insert into users('id', 'name', 'email', 'createdAt', 'updatedAt') values (5, 'martin', 'martin@another.com', now(), now());
