
create table book_memeber
(
id varchar2(50),
pw varchar2(50) not null,
nick varchar2(50),
email varchar2(50),
tel varchar2(50),
constraint book_memeber_pk primary key(id)
);


select * from book_memeber

insert into book_memeber values ('admin','1234','hrd','email@email.com','010-000-0000');



