begin
   execute immediate 'drop table "user"';
exception
   when others then null;
end;
/

create table "user"(
id number(10) not null,
name varchar2(50) not null,
email varchar2(50) not null,
password varchar2(50) not null,
age number(10) not null,
role varchar2(50) not null,
created_date date not null,
status varchar2(50) not null,
primary key(id));

insert into "user"(id, name,email,password,age,role,created_date,status) values(1,'Asha','ash@a.com','as123',18,'user',TO_DATE('2015-10-13','YYYY-MM-DD'),'Approved');
insert into "user"(id, name,email,password,age,role,created_date,status) values(2,'Rahul','rh@a.com','rh@123',15,'user',TO_DATE('2015-10-14','YYYY-MM-DD'),'Approved');
insert into "user"(id, name,email,password,age,role,created_date,status) values(3,'Ravi','rv@a.com','rv@98',20,'user',TO_DATE('2015-10-14','YYYY-MM-DD'),'pending');
insert into "user"(id, name,email,password,age,role,created_date,status) values(4,'Pavi','pv@a.com','pv@98',20,'user',TO_DATE('2015-11-14','YYYY-MM-DD'),'pending');
insert into "user"(id, name,email,password,age,role,created_date,status) values(5,'Devi','dv@a.com','dv@98',20,'user',TO_DATE('2015-09-07','YYYY-MM-DD'),'pending');
