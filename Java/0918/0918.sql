CREATE TABLE emp_copy
AS 
SELECT * FROM emp;  --14rows, 8 columns, data까지

SELECT * FROM emp_copy;

INSERT INTO emp_copy(empno, ename, mgr, hiredate)
VALUES(8001, 'CHULSU',7369,SYSDATE);   --순서에 주의하자, 데이터타입에 주의하자, literal의 타입(문자형/날짜형/숫자형)에 주의하자. 데이터 크기에 주의하자.

INSERT INTO emp_copy(empno, ename, job, sal)
VALUES(8002, 'YOUNGHEE', 'DESIGNER', 1500)

DROP TABLE emp_copy;  --테이블 삭제

CREATE TABLE emp_copy
AS
SELECT * FROM emp
WHERE 0 > 1;       --data는 복사하지 않고 schema만 복사하는 방법

SELECT * FROM emp_copy;

INSERT INTO emp_copy(empno, ename, sal, comm, deptno)
VALUES (1111, 'CHULSU', 800, 100, 40);

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(2222, 'HANJIMIN', 'DEVELOPER', SYSDATE);

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(3333, 'YOUNGHEE', SYSDATE);  --갯수에 주의하자.

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES('3333', 'YOUNGHEE', 'MARKETTER', SYSDATE);

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES('helo', 'HOJUNE', 'MARKETTER', SYSDATE);  --데이터 타입에 주의하자.

SELECT  LENGTH(ename), LENGTHB('안녕')
FROM  emp_copy

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(4444, '소녀시대', 'MARKETTER', SYSDATE);  --데이터 크기에 주의하자.

--NULL 처리
INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(4444, 'HOJUNE', 'MARKETTER', SYSDATE);  --나머지 4개의 열은 자동으로 null 처리

INSERT INTO emp_copy(empno, ename, job, hiredate)
VALUES(5555, UPPER('girlsday'), NULL, NULL);

INSERT INTO emp_copy(empno, ename, hiredate)
VALUES(6666, 'BTS', TO_DATE('01-02-2019', 'MM-DD-YYYY'));

SELECT deptno FROM dept;

INSERT INTO emp(empno, ename, deptno)
VALUES(8888, 'JIMIN', 77);  --테이블 복사하면 제약조건은 복사되지 않는다. 

DROP TABLE emp_copy;

CREATE TABLE emp_copy
AS
SELECT * FROM emp
WHERE 0 = 1

REM UPDATE
SELECT * FROM emp_copy;

--전체 수정하기
UPDATE  emp_copy       --어떤 테이블을 수정할 것인가
SET     deptno = 10;   --어떤 컬럼을 수정할 것인가

--조건을 사용해서 일부 행만 수정하기
UPDATE    emp_copy
SET       sal = 1000
WHERE     empno < 3000;

UPDATE  emp_copy
SET     sal = 2000
WHERE   ename = UPPER('jimin')

--일부 열을 수정하기
UPDATE   emp_copy
SET      job = 'DESIGNER', mgr = 1111, sal = 3000, deptno = 20
WHERE    empno = 4444

--1. 수정하려는 열의 갯수 파악(전체, 일부, 단 하나...)  --> WHERE 조건절에 따라 결정
--2. 수정하려는 컬럼의 갯수 파악(전체 칼럼 변경은 전혀 없다. 단 한개의 컬럼, 일부 칼럼을 변경할 것인가? ) --> 쉼표(,)를 사용할 것인가?

UPDATE emp
SET    deptno = 70
WHERE  ename = 'SMITH';

UPDATE emp_copy  
SET mgr = 2222, sal = 1500, comm = 100 
WHERE empno = 5555
