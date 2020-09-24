REM CROSS JOIN, 교차조인, ,Cartesian Product, 데카르트 곱
SELECT empno, ename, job, dname, loc, dept.deptno
--FROM   emp, dept, salgrade, bonus, ......;    --비표준조인
FROM emp CROSS JOIN dept  CROSS JOIN salgrade  CROSS JOIN bonus;   --표준조인

REM 등가조인(Equi Join), Inner Join, Simple Join, Natural Join, 조인, join ~ on, join ~ using
--1. SMITH는 몇 번 부서 소속인가?  20번 부서
SELECT ename, deptno
FROM emp
WHERE ename = 'SMITH';
--2. 그 부서는 이름과 위치는 어디인가?
SELECT dname, loc
FROM dept
WHERE deptno = 20;
--3. SMITH가 속한 부서이름과 위치는 어디인가?   RESEARCH소속 at DALLAS
SELECT ename, emp.deptno, dname, loc
FROM emp, dept
WHERE emp.deptno = dept.deptno AND ename = 'SMITH';

--예를 들어, 사원번호, 이름, 급여, 근무 부서를 함께 출력하되 급여가 3000 이상인 데이터만 출력하시오.
SELECT   e.empno AS "사원번호", e.ename AS "사원명" , e.sal AS "봉급", d.dname AS "부서명"
FROM     emp e, dept d
WHERE    e.deptno = d.deptno AND e.sal >= 3000;   --비표준 등가 조인

SELECT   e.empno AS "사원번호", e.ename AS "사원명" , e.sal AS "봉급", d.dname AS "부서명", deptno AS "부서번호"
FROM   emp e NATURAL JOIN dept d
WHERE  e.sal >= 3000;   --표준 NATURAL JOIN

SELECT  e.empno AS "사원번호", e.ename AS "사원명" , e.sal AS "봉급", d.dname AS "부서명", deptno AS "부서번호"
FROM   emp e INNER JOIN dept d USING(deptno)
WHERE   e.sal >= 3000;  --표준 JOIN ~ USING JOIN, 조인 조건에 식별자 사용 금지

--사원이름 KING 의 부서이름과 근무지를 출력
SELECT  ename, dname, loc
FROM    emp, dept
WHERE   emp.deptno = dept.deptno AND ename = UPPER('king')   --비표준 조인

SELECT  ename, dname, loc
FROM    emp NATURAL JOIN dept
WHERE   ename = UPPER('king')

--모든 사원의 이름, 부서 번호, 부서 이름을 표시하는 질의를 작성하시오.
SELECT  ename, emp.deptno, dname
FROM    emp, dept
WHERE   emp.deptno = dept.deptno;  --비표준 조인

SELECT  ename, deptno, dname
FROM    emp NATURAL JOIN dept;     --표준 조인

SELECT   ename, deptno, dname
FROM    emp INNER JOIN dept USING(deptno);   --표준 조인

--comm을 받는 모든 사원의 이름, 부서 이름 및 위치를 표시하는 질의를 작성하시오.
SELECT ename, dname, loc
FROM   emp, dept
WHERE  emp.deptno = dept.deptno AND comm IS NOT NULL;

SELECT  ename, dname, loc
FROM    emp NATURAL JOIN dept
WHERE   comm IS NOT NULL;

SELECT ename, dname, loc
FROM   emp INNER JOIN dept USING(deptno)
WHERE  comm IS NOT NULL;

--DALLAS에 근무하는 모든 사원의 이름, 직무, 부서 번호 및 부서 이름을 표시하는 질의를 작성하시오.
SELECT   ename, job, emp.deptno, dname
FROM     emp, dept
WHERE    emp.deptno = dept.deptno AND loc = UPPER('Dallas');

SELECT  ename, job, deptno, dname
FROM   emp NATURAL JOIN dept
WHERE loc = UPPER('Dallas');

SELECT  ename, job, deptno, dname
FROM   emp INNER JOIN dept USING(deptno)
WHERE loc = UPPER('Dallas');

REM JOIN ~ ON 사용하기
SELECT  empno, ename, job, sal, dname, loc, dept.deptno
FROM    emp, dept
WHERE   emp.deptno = dept.deptno AND sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER'); --비표준

SELECT  empno, ename, job, sal, dname, loc, deptno
FROM   emp NATURAL JOIN dept
WHERE  sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER');  --표준 NATURAL JOIN

SELECT  empno, ename, job, sal, dname, loc, deptno
FROM   emp INNER JOIN dept USING(deptno)
WHERE  sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER');  --표준 JOIN ~ USING

SELECT  empno, ename, job, sal, dname, loc, dept.deptno
FROM   emp INNER JOIN dept ON emp.deptno = dept.deptno
WHERE  sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER');  --표준 JOIN ~ ON

--이름이 ‘ALLEN’인 사원의 부서명을 출력하라.
SELECT  ename, dname
FROM    emp, dept
WHERE   emp.deptno = dept.deptno AND ename = 'ALLEN';  --비표준

SELECT  ename, dname
FROM    emp NATURAL JOIN dept
WHERE ename = 'ALLEN';             --표준 NATURAL JOIN

SELECT  ename, dname
FROM    emp INNER JOIN dept USING(deptno)
WHERE ename = 'ALLEN';             --표준 JOIN ~ USING

SELECT  ename, dname
FROM    emp INNER JOIN dept ON emp.deptno = dept.deptno
WHERE ename = 'ALLEN';             --표준 JOIN ~ ON

--5. EMP와 DEPT Table을 JOIN하여 부서번호, 부서명, 이름, 급여를 출력하라.
SELECT   d.deptno, dname, ename, sal
FROM     emp e, dept d
WHERE    e.deptno = d.deptno;   --비표준

SELECT   deptno, dname, ename, sal
FROM    emp NATURAL JOIN dept;   --표준 NATURAL JOIN

SELECT   deptno, dname, ename, sal
FROM     emp INNER JOIN dept USING(deptno);   --표준 JOIN ~ USING

SELECT   d.deptno, dname, ename, sal
FROM   emp e INNER JOIN dept d ON e.deptno = d.deptno;   --표준 JOIN ~ ON









