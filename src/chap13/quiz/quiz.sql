create table quiz(
     quiznum number(3) primary key,
     content varchar2(200),
     one varchar2(20),
     two varchar2(20),
     three varchar2(20),
     four  varchar2(20));


create sequence quiznum;

insert into quiz values(quiznum.nextval,
               '1. ���� �� �ڹ��� �⺻�� �����Ͱ� �ƴ� ����?',
               'int' , 'double', 'Long', 'char');

insert into quiz values(quiznum.nextval,
                '2. switch������ �������� �� �� ���� Ÿ����? ',
                'int' , 'double', 'String', 'char');

insert into quiz values(quiznum.nextval,
               '3. �������̵��� �����ϱ� ���� �޼ҵ忡 �߰��ϴ� modifier��? ',
               'static' , 'final', 'private', 'abstract');