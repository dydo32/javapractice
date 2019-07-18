create table kitriemp(
	id varchar2(15) primary key,
	pass varchar2(15),
	name varchar2(20),
	addr varchar2(30),
	hiredate date,
	grade varchar2(6),
	point number,
	deptno varchar2(15)
);
create table kitridept(
	deptno varchar2(15) primary key,
	deptname varchar2(20),
	loc varchar2(15),
	tel varchar2(15),
	mgr varchar2(15)
);

select * from kitriemp;
select * from kitridept;

delete KITRIDEPT where deptno = '9999';

insert into kitridept values('001','瞪骯褒','10類','02-777-111','jang');
insert into kitridept values('002','艙機獄睡','1類','02-777-111','lee');
insert into kitridept values('003','艙機1ぜ','2類','02-777-222','kim');
insert into kitridept values('004','艙機2ぜ','2類','02-777-333','kang');
insert into kitridept values('005','檣餌睡','7類','02-777-777','hong');
