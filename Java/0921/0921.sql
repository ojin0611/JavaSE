CREATE TABLE member(
    id           VARCHAR2(14),
    passwd       VARCHAR2(20)
);
--Table 생성 확인
DESC USER_TABLES;

SELECT table_name
FROM user_tables;  ==> SELECT * FROM tab;

SELECT * FROM tab;

CREATE TABLE Student1(
    hakbun      CHAR(7),                   --2020-01
    name        VARCHAR2(20),              --김빛나라 
    address     VARCHAR2(200),             --서울시 강남구 역삼동 한독빌딩 8층
    age         NUMBER(3),
    birthday    DATE,
    email       VARCHAR2(100),
    height      NUMBER(4,1),                           --178.3
    weight      NUMBER(4,1)                             --110.3
);

TRUNCATE TABLE Student   --ROLLBACK이 안됨(DDL이니까), 구조는 남기고 데이터만 지운다.        
--cf) DELETE FROM Student, ROLLBACK이 된다(DML이니까)
--cf) DROP TABLE Student, 아예 테이블 자체를 지운다.






