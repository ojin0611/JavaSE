CREATE TABLE member(
    id           VARCHAR2(14),
    passwd       VARCHAR2(20)
);
--Table ���� Ȯ��
DESC USER_TABLES;

SELECT table_name
FROM user_tables;  ==> SELECT * FROM tab;

SELECT * FROM tab;

CREATE TABLE Student1(
    hakbun      CHAR(7),                   --2020-01
    name        VARCHAR2(20),              --������� 
    address     VARCHAR2(200),             --����� ������ ���ﵿ �ѵ����� 8��
    age         NUMBER(3),
    birthday    DATE,
    email       VARCHAR2(100),
    height      NUMBER(4,1),                           --178.3
    weight      NUMBER(4,1)                             --110.3
);

TRUNCATE TABLE Student   --ROLLBACK�� �ȵ�(DDL�̴ϱ�), ������ ����� �����͸� �����.        
--cf) DELETE FROM Student, ROLLBACK�� �ȴ�(DML�̴ϱ�)
--cf) DROP TABLE Student, �ƿ� ���̺� ��ü�� �����.






