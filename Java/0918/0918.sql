CREATE TABLE emp_copy
AS 
SELECT * FROM emp;  --14rows, 8 columns, data����

SELECT * FROM emp_copy;

INSERT INTO emp_copy(empno, ename, mgr, hiredate)
VALUES(8001, 'CHULSU',7369,SYSDATE);   --������ ��������, ������Ÿ�Կ� ��������, literal�� Ÿ��(������/��¥��/������)�� ��������. ������ ũ�⿡ ��������.

INSERT INTO emp_copy(empno, ename, job, sal)
VALUES(8002, 'YOUNGHEE', 'DESIGNER', 1500)

DROP TABLE emp_copy;  --���̺� ����

CREATE TABLE emp_copy
AS
SELECT * FROM emp
WHERE 0 > 1;       --data�� �������� �ʰ� schema�� �����ϴ� ���

SELECT * FROM emp_copy;

INSERT INTO emp_copy(empno, ename, sal, comm, deptno)
VALUES (1111, 'CHULSU', 800, 100, 40);

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(2222, 'HANJIMIN', 'DEVELOPER', SYSDATE);

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(3333, 'YOUNGHEE', SYSDATE);  --������ ��������.

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES('3333', 'YOUNGHEE', 'MARKETTER', SYSDATE);

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES('helo', 'HOJUNE', 'MARKETTER', SYSDATE);  --������ Ÿ�Կ� ��������.

SELECT  LENGTH(ename), LENGTHB('�ȳ�')
FROM  emp_copy

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(4444, '�ҳ�ô�', 'MARKETTER', SYSDATE);  --������ ũ�⿡ ��������.

--NULL ó��
INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(4444, 'HOJUNE', 'MARKETTER', SYSDATE);  --������ 4���� ���� �ڵ����� null ó��

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(5555, UPPER('girlsday'), NULL, NULL);

INSERT INTO emp_copy(empno, ename, hiredate)
VALUES(6666, 'BTS', TO_DATE('01-02-2019', 'MM-DD-YYYY'));

SELECT deptno FROM dept;

INSERT INTO emp(empno, ename, deptno)
VALUES(8888, 'JIMIN', 77);  --���̺� �����ϸ� ���������� ������� �ʴ´�. 

DROP TABLE emp_copy;

CREATE TABLE emp_copy
AS
SELECT * FROM emp
WHERE 0 = 1

REM UPDATE
SELECT * FROM emp_copy;

--��ü �����ϱ�
UPDATE  emp_copy       --� ���̺��� ������ ���ΰ�
SET     deptno = 10;   --� �÷��� ������ ���ΰ�

--������ ����ؼ� �Ϻ� �ุ �����ϱ�
UPDATE    emp_copy
SET       sal = 1000
WHERE     empno < 3000;

UPDATE  emp_copy
SET     sal = 2000
WHERE   ename = UPPER('jimin')

--�Ϻ� ���� �����ϱ�
UPDATE   emp_copy
SET      job = 'DESIGNER', mgr = 1111, sal = 3000, deptno = 20
WHERE    empno = 4444

--1. �����Ϸ��� ���� ���� �ľ�(��ü, �Ϻ�, �� �ϳ�...)  --> WHERE �������� ���� ����
--2. �����Ϸ��� �÷��� ���� �ľ�(��ü Į�� ������ ���� ����. �� �Ѱ��� �÷�, �Ϻ� Į���� ������ ���ΰ�? ) --> ��ǥ(,)�� ����� ���ΰ�?

UPDATE emp
SET    deptno = 70
WHERE  ename = 'SMITH';

UPDATE emp_copy  
SET mgr = 2222, sal = 1500, comm = 100 
WHERE empno = 5555
