create table quiz(
     quiznum number(3) primary key,
     content varchar2(200),
     one varchar2(20),
     two varchar2(20),
     three varchar2(20),
     four  varchar2(20));


create sequence quiznum;

insert into quiz values(quiznum.nextval,
               '1. 다음 중 자바의 기본형 데이터가 아닌 것은?',
               'int' , 'double', 'Long', 'char');

insert into quiz values(quiznum.nextval,
                '2. switch구문의 조건으로 올 수 없는 타입은? ',
                'int' , 'double', 'String', 'char');

insert into quiz values(quiznum.nextval,
               '3. 오버라이딩을 금지하기 위해 메소드에 추가하는 modifier는? ',
               'static' , 'final', 'private', 'abstract');