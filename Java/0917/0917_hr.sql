SELECT employee_id, first_name, hire_date, department_name, location_id
FROM   employees e, departments d
WHERE e.department_id = d.department_id;  --��ǥ��

SELECT employee_id, first_name, hire_date, department_name, location_id
FROM   employees  NATURAL JOIN departments;

SELECT employee_id, first_name, hire_date, department_name, location_id
FROM   employees  INNER JOIN departments USING(department_id);

REM 3�� �̻� ���̺� �����ϱ� : employees, departments, locations, countries
SELECT employee_id, first_name, hire_date, d.department_id, department_name, 
       lo.location_id, city, state_province, c.country_id, country_name
FROM employees e, departments d, locations lo, countries c
WHERE e.department_id = d.department_id AND d.location_id = lo.location_id 
      AND lo.country_id = c.country_id AND e.department_id IN (10, 20, 30, 40);  --�����
      
SELECT employee_id, first_name, hire_date, e.department_id, department_name, city, 
       state_province, country_name
FROM employees e INNER JOIN departments d ON e.department_id = d.department_id
     INNER JOIN locations lo ON d.location_id = lo.location_id
     INNER JOIN countries co ON lo.country_id = co.country_id
WHERE e.department_id IN (10, 20, 30, 40);        --JOIN ~ ON ��ġ�Ѵ�.
      
      
SELECT employee_id, first_name, hire_date, department_id, department_name, city, state_province, country_name
FROM employees e NATURAL JOIN departments d NATURAL JOIN locations lo NATURAL JOIN countries c      
WHERE department_id IN (10, 20, 30, 40);

SELECT employee_id, first_name, hire_date, department_id, department_name, city, state_province, country_name
FROM employees e INNER JOIN departments d USING(department_id, manager_id) INNER JOIN locations lo USING(location_id) 
     INNER JOIN countries c USING(country_id)      
WHERE department_id IN (10, 20, 30, 40);

REM ��������, �ܺ� ����, Outer JOIN
--Ȥ�� Ư�� �μ��� ����� �Ѹ� ���°�?
SELECT  employee_id, first_name, e.department_id, d.department_id, department_name
FROM    employees e, departments d
WHERE   e.department_id(+) = d.department_id;  --��ǥ�� ������ �ܺ�����

SELECT  employee_id, first_name, e.department_id, d.department_id, department_name
FROM   employees e RIGHT OUTER JOIN departments d ON e.department_id = d.department_id;  --ǥ�� RIGHT OUTER JOIN

--����� �Ҽ� �μ��� ���� ����� �ִ°�?
SELECT  employee_id, first_name, e.department_id, d.department_id, department_name
FROM    employees e, departments d
WHERE   e.department_id = d.department_id(+);  --��ǥ�� ���� �ܺ�����

SELECT  employee_id, first_name, e.department_id, d.department_id, department_name
FROM    employees e LEFT OUTER JOIN departments d ON e.department_id = d.department_id;  --ǥ�� LEFT OUTER JOIN

REM FULL ��������
--�Ҽ��� ���� ���, ����� �Ѹ� ���� �μ� ��� ����ϱ�
SELECT  employee_id, first_name, e.department_id, d.department_id, department_name
FROM    employees e, departments d
WHERE   e.department_id(+) = d.department_id
UNION
SELECT  employee_id, first_name, e.department_id, d.department_id, department_name
FROM    employees e, departments d
WHERE   e.department_id = d.department_id(+);

SELECT  employee_id, first_name, e.department_id, d.department_id, department_name
FROM    employees e FULL OUTER JOIN departments d ON e.department_id = d.department_id;







