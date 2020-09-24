REM CROSS JOIN, ��������, ,Cartesian Product, ��ī��Ʈ ��
SELECT empno, ename, job, dname, loc, dept.deptno
--FROM   emp, dept, salgrade, bonus, ......;    --��ǥ������
FROM emp CROSS JOIN dept  CROSS JOIN salgrade  CROSS JOIN bonus;   --ǥ������

REM �����(Equi Join), Inner Join, Simple Join, Natural Join, ����, join ~ on, join ~ using
--1. SMITH�� �� �� �μ� �Ҽ��ΰ�?  20�� �μ�
SELECT ename, deptno
FROM emp
WHERE ename = 'SMITH';
--2. �� �μ��� �̸��� ��ġ�� ����ΰ�?
SELECT dname, loc
FROM dept
WHERE deptno = 20;
--3. SMITH�� ���� �μ��̸��� ��ġ�� ����ΰ�?   RESEARCH�Ҽ� at DALLAS
SELECT ename, emp.deptno, dname, loc
FROM emp, dept
WHERE emp.deptno = dept.deptno AND ename = 'SMITH';

--���� ���, �����ȣ, �̸�, �޿�, �ٹ� �μ��� �Բ� ����ϵ� �޿��� 3000 �̻��� �����͸� ����Ͻÿ�.
SELECT   e.empno AS "�����ȣ", e.ename AS "�����" , e.sal AS "����", d.dname AS "�μ���"
FROM     emp e, dept d
WHERE    e.deptno = d.deptno AND e.sal >= 3000;   --��ǥ�� � ����

SELECT   e.empno AS "�����ȣ", e.ename AS "�����" , e.sal AS "����", d.dname AS "�μ���", deptno AS "�μ���ȣ"
FROM   emp e NATURAL JOIN dept d
WHERE  e.sal >= 3000;   --ǥ�� NATURAL JOIN

SELECT  e.empno AS "�����ȣ", e.ename AS "�����" , e.sal AS "����", d.dname AS "�μ���", deptno AS "�μ���ȣ"
FROM   emp e INNER JOIN dept d USING(deptno)
WHERE   e.sal >= 3000;  --ǥ�� JOIN ~ USING JOIN, ���� ���ǿ� �ĺ��� ��� ����

--����̸� KING �� �μ��̸��� �ٹ����� ���
SELECT  ename, dname, loc
FROM    emp, dept
WHERE   emp.deptno = dept.deptno AND ename = UPPER('king')   --��ǥ�� ����

SELECT  ename, dname, loc
FROM    emp NATURAL JOIN dept
WHERE   ename = UPPER('king')

--��� ����� �̸�, �μ� ��ȣ, �μ� �̸��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�.
SELECT  ename, emp.deptno, dname
FROM    emp, dept
WHERE   emp.deptno = dept.deptno;  --��ǥ�� ����

SELECT  ename, deptno, dname
FROM    emp NATURAL JOIN dept;     --ǥ�� ����

SELECT   ename, deptno, dname
FROM    emp INNER JOIN dept USING(deptno);   --ǥ�� ����

--comm�� �޴� ��� ����� �̸�, �μ� �̸� �� ��ġ�� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�.
SELECT ename, dname, loc
FROM   emp, dept
WHERE  emp.deptno = dept.deptno AND comm IS NOT NULL;

SELECT  ename, dname, loc
FROM    emp NATURAL JOIN dept
WHERE   comm IS NOT NULL;

SELECT ename, dname, loc
FROM   emp INNER JOIN dept USING(deptno)
WHERE  comm IS NOT NULL;

--DALLAS�� �ٹ��ϴ� ��� ����� �̸�, ����, �μ� ��ȣ �� �μ� �̸��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�.
SELECT   ename, job, emp.deptno, dname
FROM     emp, dept
WHERE    emp.deptno = dept.deptno AND loc = UPPER('Dallas');

SELECT  ename, job, deptno, dname
FROM   emp NATURAL JOIN dept
WHERE loc = UPPER('Dallas');

SELECT  ename, job, deptno, dname
FROM   emp INNER JOIN dept USING(deptno)
WHERE loc = UPPER('Dallas');

REM JOIN ~ ON ����ϱ�
SELECT  empno, ename, job, sal, dname, loc, dept.deptno
FROM    emp, dept
WHERE   emp.deptno = dept.deptno AND sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER'); --��ǥ��

SELECT  empno, ename, job, sal, dname, loc, deptno
FROM   emp NATURAL JOIN dept
WHERE  sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER');  --ǥ�� NATURAL JOIN

SELECT  empno, ename, job, sal, dname, loc, deptno
FROM   emp INNER JOIN dept USING(deptno)
WHERE  sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER');  --ǥ�� JOIN ~ USING

SELECT  empno, ename, job, sal, dname, loc, dept.deptno
FROM   emp INNER JOIN dept ON emp.deptno = dept.deptno
WHERE  sal <= 2000 AND job IN ('SALESMAN', 'CLERK', 'MANAGER');  --ǥ�� JOIN ~ ON

--�̸��� ��ALLEN���� ����� �μ����� ����϶�.
SELECT  ename, dname
FROM    emp, dept
WHERE   emp.deptno = dept.deptno AND ename = 'ALLEN';  --��ǥ��

SELECT  ename, dname
FROM    emp NATURAL JOIN dept
WHERE ename = 'ALLEN';             --ǥ�� NATURAL JOIN

SELECT  ename, dname
FROM    emp INNER JOIN dept USING(deptno)
WHERE ename = 'ALLEN';             --ǥ�� JOIN ~ USING

SELECT  ename, dname
FROM    emp INNER JOIN dept ON emp.deptno = dept.deptno
WHERE ename = 'ALLEN';             --ǥ�� JOIN ~ ON

--5. EMP�� DEPT Table�� JOIN�Ͽ� �μ���ȣ, �μ���, �̸�, �޿��� ����϶�.
SELECT   d.deptno, dname, ename, sal
FROM     emp e, dept d
WHERE    e.deptno = d.deptno;   --��ǥ��

SELECT   deptno, dname, ename, sal
FROM    emp NATURAL JOIN dept;   --ǥ�� NATURAL JOIN

SELECT   deptno, dname, ename, sal
FROM     emp INNER JOIN dept USING(deptno);   --ǥ�� JOIN ~ USING

SELECT   d.deptno, dname, ename, sal
FROM   emp e INNER JOIN dept d ON e.deptno = d.deptno;   --ǥ�� JOIN ~ ON









