--3. DEPT Table�� �ִ� ��� �μ��� ����ϰ�, EMP Table�� �ִ� DATA�� JOIN�Ͽ� ���
--����� �̸�, �μ���ȣ, �μ���, �޿��� ����϶�. OUTER JOIN ����ؾ� �մϴ�.

SELECT  e.ename, e.deptno, d.dname, e.sal
FROM    emp e, dept d
WHERE   e.deptno = d.deptno;   --��ǥ�� ����

SELECT  e.ename, deptno, d.dname, e.sal
FROM    emp e NATURAL JOIN dept d   --ǥ�� NATURAL JOIN

SELECT  e.ename, deptno, d.dname, e.sal
FROM    emp e INNER JOIN dept d USING(deptno)  --ǥ�� JOIN ~ USING

SELECT  e.ename, e.deptno, d.dname, e.sal
FROM    emp e INNER JOIN dept d ON e.deptno = d.deptno;   --ǥ�� JOIN ~ ON

--5. ��ALLEN:�� ������ ���� ����� �̸�, �μ���, �޿�, ȸ����ġ, ������ ����϶�.
SELECT job
FROM emp
WHERE ename = 'ALLEN';  --SALESMAN

SELECT  ename, dname, sal, loc, job
FROM    emp, dept
WHERE  emp.deptno = dept.deptno AND job = 'SALESMAN';

SELECT  ename, dname, sal, loc, job
FROM    emp NATURAL JOIN dept
WHERE  job = 'SALESMAN';

--9. 10�� �μ� �߿��� 30�� �μ����� ���� ������ �ϴ� ����� �����ȣ, �̸�, �μ���,
--�Ի���, ������ ����϶�.
SELECT job
FROM emp
WHERE deptno = 30;   --SALESMAN, MANAGER, CLERK

SELECT  empno, ename, dname, hiredate, loc
FROM   emp, dept
WHERE  emp.deptno = dept.deptno AND emp.deptno = 10 AND job NOT IN ('SALESMAN', 'MANAGER', 'CLERK');

SELECT  empno, ename, dname, hiredate, loc
FROM   emp INNER JOIN dept USING(deptno)
WHERE  deptno = 10 AND job NOT IN ('SALESMAN', 'MANAGER', 'CLERK');

REM �� ����, Non-Equi Join
SELECT  empno, ename, sal, grade
FROM    emp, salgrade
--WHERE   emp.sal BETWEEN salgrade.losal AND salgrade.hisal;
WHERE sal >= losal AND sal <= hisal;    --��ǥ�� �� ����

SELECT empno, ename, sal, losal, hisal, grade
FROM   emp INNER JOIN salgrade ON sal BETWEEN losal AND hisal;  --ǥ�� �� ����

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno;  --��ǥ�� �ܺ�����, 40�� �μ��� �Ҽӵ� ����� ����. RIGHT OUTER JOIN

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno = dept.deptno(+);  --��ǥ�� �ܺ�����, ��� ����� �μ��� �ҼӵǾ� �ִ�. �Ҽ��� ���� ����� ����. LEFT OUTER JOIN

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno(+);  --FULL OUTER JOIN

--��ǥ�� ���ο����� FULL OUTER JOIN�� �������� �ʴ´�. 
--�׷��ٸ� ����� ���� ���°�? �ִ�.   � ���? -> UNION�� ����ϸ� �ȴ�.
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno
UNION
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno = dept.deptno(+);

--��ǥ�� RIGHT OUTER JOIN
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp, dept
WHERE   emp.deptno(+) = dept.deptno

SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp RIGHT OUTER JOIN dept ON emp.deptno = dept.deptno  --ǥ�� OUTER JOIN

REM ǥ�� �������� FULL OUTER JOIN �ϱ�
SELECT  empno, ename, emp.deptno, dept.deptno, dname, loc
FROM    emp FULL OUTER JOIN dept ON emp.deptno = dept.deptno

--SELF JOIN
SELECT  ����.empno, ����.ename, ����.mgr, ���.empno, ���.ename
FROM    emp ����, emp  ���
WHERE   ����.mgr = ���.empno;  --��ǥ�� SELF JOIN

SELECT  ����.empno, ����.ename, ����.mgr, ���.empno, ���.ename
FROM    emp ���� INNER JOIN emp ��� ON ����.mgr = ���.empno;

SELECT  ����.empno, ����.ename, ����.mgr, ���.empno, ���.ename
FROM    emp ����, emp  ���
WHERE   ����.mgr = ���.empno(+);  --��ǥ�� ���� ���� ����


--SMITH�� �Ŵ����� FORD�̴١�
SELECT ����.ename || '�� �Ŵ����� ' || ���.ename || '�̴�.'
FROM emp ���� INNER JOIN emp ��� ON ����.mgr = ���.empno;

SELECT ����.ename || '�� �Ŵ����� ' || NVL(���.ename, 'N/A') || '�Դϴ�.'
FROM emp ���� LEFT OUTER JOIN emp ��� ON ����.mgr = ���.empno;

--p.239 Q1
--�޿��� 2000�� �ʰ��� ������� �μ�����, �������
SELECT dept.deptno, dname, empno, ename, sal
FROM   dept, emp
WHERE dept.deptno = emp.deptno AND sal > 2000;

SELECT  dept.deptno, dname, empno, ename, sal
FROM    dept INNER JOIN emp ON dept.deptno = emp.deptno
WHERE   sal > 2000;

--p.239. Q2
--�μ��� ��� �޿�, �ִ� �޿�, �ּ� �޿�, ��� ��
SELECT dept.deptno, dname, TRUNC(AVG(sal)), MAX(sal), MIN(sal), COUNT(*) 
FROM   dept, emp
WHERE  dept.deptno = emp.deptno
GROUP BY dept.deptno, dname

SELECT dept.deptno, dname, TRUNC(AVG(sal)), MAX(sal), MIN(sal), COUNT(*) 
FROM   dept INNER JOIN emp ON dept.deptno = emp.deptno
GROUP BY dept.deptno, dname

--p.239. Q3
--��� �μ� ������ ��� ������ �μ���ȣ, ��� �̸� ������ ����
SELECT dept.deptno, dname, empno, ename, job, sal
FROM   dept, emp  
WHERE  dept.deptno = emp.deptno(+)
ORDER BY  dept.deptno ASC, ename ASC;

SELECT dept.deptno, dname, empno, ename, job, sal
FROM   dept LEFT OUTER JOIN emp ON dept.deptno = emp.deptno
ORDER BY  dept.deptno ASC, ename ASC;


--p.240. Q4
SELECT dept.deptno AS DEPTNO, dname, ����.empno AS EMPNO, ����.ename AS ENAME, ����.mgr MGR, ����.sal SAL, 
       ����.deptno DEPTNO_1, losal, hisal, grade, ���.empno AS MGR_EMPNO, ���.ename AS MGR_ENAME
FROM   dept, emp ����, salgrade, emp ���
WHERE  (dept.deptno = ����.deptno(+)) AND 
        (����.sal BETWEEN losal(+) AND hisal(+)) AND (����.mgr = ���.empno(+))
ORDER BY dept.deptno, ����.empno;


SELECT dept.deptno AS DEPTNO, dname, ����.empno AS EMPNO, ����.ename AS ENAME, ����.mgr MGR, ����.sal SAL, 
       ����.deptno DEPTNO_1, losal, hisal, grade, ���.empno AS MGR_EMPNO, ���.ename AS MGR_ENAME
FROM  dept LEFT OUTER JOIN emp ���� ON (dept.deptno = ����.deptno) 
      LEFT OUTER JOIN salgrade ON (����.sal BETWEEN losal AND hisal) 
      LEFT OUTER JOIN emp ��� ON (����.mgr = ���.empno)
ORDER BY dept.deptno, ����.empno;
    


REM ���ο� ������ �߰��ϱ�
--INSERT INTO ���̺� VALUES(����...)
--1. ��¥���� �������� �ݵ�� Ȭ����ǥ�� ����ؾ� �Ѵ�. �ݸ�, �������� Ȭ����ǥ�� ������� �ʴ´�.
--2. ������ �������.
--3. literal�� ����� �������.
--4. literal�� type�� �������. 
--5. NULL�� �������.

INSERT INTO dept
VALUES(50, 'DEVELOPMENT', 'SEOUL');

INSERT INTO dept(loc, deptno, dname)  --���̺��� �⺻������ �ٸ��� �Ϸ���
VALUES('PUSAN', 60, 'DESIGN') 

INSERT INTO dept(dname, loc, deptno)  --���̺��� ������ �ٸ��� �Ϸ��� �ݵ�� ����ؾ� �Ѵ�.
VALUES(30, 40, 70);

--INSERT INTO dept(deptno, dname, loc)
--VALUES(80, 'JAVA');  ���� ���� ������� �ʽ��ϴ�.��� ���� �߻�

--NULL�� �Ͻ������� ó������.
INSERT INTO dept(deptno, dname)
VALUES(80, 'JAVA');

--NULL�� ��������� ó������.
INSERT INTO dept(deptno, dname, loc)
VALUES(90, 'ORACLE', NULL);
