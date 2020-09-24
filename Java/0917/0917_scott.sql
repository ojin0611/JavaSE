--3. DEPT Table에 있는 모든 부서를 출력하고, EMP Table에 있는 DATA와 JOIN하여 모든
--사원의 이름, 부서번호, 부서명, 급여를 출력하라. OUTER JOIN 사용해야 합니다.

SELECT  e.ename, e.deptno, d.dname, e.sal
FROM    emp e, dept d
WHERE   e.deptno = d.deptno;   --비표준 조인

SELECT  e.ename, deptno, d.dname, e.sal
FROM    emp e NATURAL JOIN dept d   --표준 NATURAL JOIN

SELECT  e.ename, deptno, d.dname, e.sal
FROM    emp e INNER JOIN dept d USING(deptno)  --표준 JOIN ~ USING

SELECT  e.ename, e.deptno, d.dname, e.sal
FROM    emp e INNER JOIN dept d ON e.deptno = d.deptno;   --표준 JOIN ~ ON

--5. ‘ALLEN:의 직무와 같은 사람의 이름, 부서명, 급여, 회사위치, 직무를 출력하라.
SELECT job
FROM emp
WHERE ename = 'ALLEN';  --SALESMAN

SELECT  ename, dname, sal, loc, job
FROM    emp, dept
WHERE  emp.deptno = dept.deptno AND job = 'SALESMAN';

SELECT  ename, dname, sal, loc, job
FROM    emp NATURAL JOIN dept
WHERE  job = 'SALESMAN';

--9. 10번 부서 중에서 30번 부서에는 없는 업무를 하는 사원의 사원번호, 이름, 부서명,
--입사일, 지역을 출력하라.
SELECT job
FROM emp
WHERE deptno = 30;   --SALESMAN, MANAGER, CLERK

SELECT  empno, ename, dname, hiredate, loc
FROM   emp, dept
WHERE  emp.deptno = dept.deptno AND emp.deptno = 10 AND job NOT IN ('SALESMAN', 'MANAGER', 'CLERK');

SELECT  empno, ename, dname, hiredate, loc
FROM   emp INNER JOIN dept USING(deptno)
WHERE  deptno = 10 AND job NOT IN ('SALESMAN', 'MANAGER', 'CLERK');

REM 비등가 조인, Non-Equi Join
SELECT  empno, ename, sal, grade
FROM    emp, salgrade
--WHERE   emp.sal BETWEEN salgrade.losal AND salgrade.hisal;
WHERE sal >= losal AND sal <= hisal;    --비표준 비등가 조인

SELECT empno, ename, sal, losal, hisal, grade
FROM   emp INNER JOIN salgrade ON sal BETWEEN losal AND hisal;  --표준 비등가 조인

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno;  --비표준 외부조인, 40번 부서에 소속된 사원은 없다. RIGHT OUTER JOIN

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno = dept.deptno(+);  --비표준 외부조인, 모든 사원은 부서에 소속되어 있다. 소속이 없는 사원은 없다. LEFT OUTER JOIN

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno(+);  --FULL OUTER JOIN

--비표준 조인에서는 FULL OUTER JOIN을 지원하지 않는다. 
--그렇다면 방법이 전혀 없는가? 있다.   어떤 방법? -> UNION을 사용하면 된다.
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno
UNION
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno = dept.deptno(+);

--비표준 RIGHT OUTER JOIN
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp RIGHT OUTER JOIN dept ON emp.deptno = dept.deptno  --표준 OUTER JOIN

REM 표준 조인으로 FULL OUTER JOIN 하기
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp FULL OUTER JOIN dept ON emp.deptno = dept.deptno

--SELF JOIN
SELECT  부하.empno, 부하.ename, 부하.mgr, 상사.empno, 상사.ename
FROM    emp 부하, emp  상사
WHERE   부하.mgr = 상사.empno;  --비표준 SELF JOIN

SELECT  부하.empno, 부하.ename, 부하.mgr, 상사.empno, 상사.ename
FROM    emp 부하 INNER JOIN emp 상사 ON 부하.mgr = 상사.empno;

SELECT  부하.empno, 부하.ename, 부하.mgr, 상사.empno, 상사.ename
FROM    emp 부하, emp  상사
WHERE   부하.mgr = 상사.empno(+);  --비표준 왼쪽 포괄 조인


--SMITH의 매니저는 FORD이다’
SELECT 부하.ename || '의 매니저는 ' || 상사.ename || '이다.'
FROM emp 부하 INNER JOIN emp 상사 ON 부하.mgr = 상사.empno;

SELECT 부하.ename || '의 매니저는 ' || NVL(상사.ename, 'N/A') || '입니다.'
FROM emp 부하 LEFT OUTER JOIN emp 상사 ON 부하.mgr = 상사.empno;

--p.239 Q1
--급여가 2000을 초과한 사원들의 부서정보, 사원정보
SELECT dept.deptno, dname, empno, ename, sal
FROM   dept, emp
WHERE dept.deptno = emp.deptno AND sal > 2000;

SELECT  dept.deptno, dname, empno, ename, sal
FROM    dept INNER JOIN emp ON dept.deptno = emp.deptno
WHERE   sal > 2000;

--p.239. Q2
--부서별 평균 급여, 최대 급여, 최소 급여, 사원 수
SELECT dept.deptno, dname, TRUNC(AVG(sal)), MAX(sal), MIN(sal), COUNT(*) 
FROM   dept, emp
WHERE  dept.deptno = emp.deptno
GROUP BY dept.deptno, dname

SELECT dept.deptno, dname, TRUNC(AVG(sal)), MAX(sal), MIN(sal), COUNT(*) 
FROM   dept INNER JOIN emp ON dept.deptno = emp.deptno
GROUP BY dept.deptno, dname

--p.239. Q3
--모든 부서 정보와 사원 정보를 부서번호, 사원 이름 순으로 정렬
SELECT dept.deptno, dname, empno, ename, job, sal
FROM   dept, emp  
WHERE  dept.deptno = emp.deptno(+)
ORDER BY  dept.deptno ASC, ename ASC;

SELECT dept.deptno, dname, empno, ename, job, sal
FROM   dept LEFT OUTER JOIN emp ON dept.deptno = emp.deptno
ORDER BY  dept.deptno ASC, ename ASC;


--p.240. Q4
SELECT dept.deptno AS DEPTNO, dname, 부하.empno AS EMPNO, 부하.ename AS ENAME, 부하.mgr MGR, 부하.sal SAL, 
       부하.deptno DEPTNO_1, losal, hisal, grade, 상사.empno AS MGR_EMPNO, 상사.ename AS MGR_ENAME
FROM   dept, emp 부하, salgrade, emp 상사
WHERE  (dept.deptno = 부하.deptno(+)) AND 
        (부하.sal BETWEEN losal(+) AND hisal(+)) AND (부하.mgr = 상사.empno(+))
ORDER BY dept.deptno, 부하.empno;


SELECT dept.deptno AS DEPTNO, dname, 부하.empno AS EMPNO, 부하.ename AS ENAME, 부하.mgr MGR, 부하.sal SAL, 
       부하.deptno DEPTNO_1, losal, hisal, grade, 상사.empno AS MGR_EMPNO, 상사.ename AS MGR_ENAME
FROM  dept LEFT OUTER JOIN emp 부하 ON (dept.deptno = 부하.deptno) 
      LEFT OUTER JOIN salgrade ON (부하.sal BETWEEN losal AND hisal) 
      LEFT OUTER JOIN emp 상사 ON (부하.mgr = 상사.empno)
ORDER BY dept.deptno, 부하.empno;
    


REM 새로운 데이터 추가하기
--INSERT INTO 테이블 VALUES(값들...)
--1. 날짜형과 문자형은 반드시 홑따옴표를 사용해야 한다. 반면, 숫자형은 홑따옴표를 사용하지 않는다.
--2. 순서를 고민하자.
--3. literal의 사이즈를 고민하자.
--4. literal의 type을 고민하자. 
--5. NULL을 고민하자.

INSERT INTO dept
VALUES(50, 'DEVELOPMENT', 'SEOUL');

INSERT INTO dept(loc, deptno, dname)  --테이블의 기본순서를 다르게 하려면
VALUES('PUSAN', 60, 'DESIGN') 

INSERT INTO dept(dname, loc, deptno)  --테이블의 순서를 다르게 하려면 반드시 명시해야 한다.
VALUES(30, 40, 70);

--INSERT INTO dept(deptno, dname, loc)
--VALUES(80, 'JAVA');  값의 수가 충분하지 않습니다.라는 에러 발생

--NULL을 암시적으로 처리하자.
INSERT INTO dept(deptno, dname)
VALUES(80, 'JAVA');

--NULL을 명시적으로 처리하자.
INSERT INTO dept(deptno, dname, loc)
VALUES(90, 'ORACLE', NULL);
