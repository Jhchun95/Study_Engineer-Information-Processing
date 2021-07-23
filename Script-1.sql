-- 4��. ������ ���Ѱ� ����
-- 1. Where�� ����
-- ����1: ������ �� ��
SELECT EMP_NAME ����̸�, ORG_CD �Ҽ�, POSITION ����, SALARY ����
FROM cslee.TB_EMP
WHERE POSITION ='�븮';

-- ���� �ð� ��ȸ�ϴ� ���
select now();
-- ����ð����� �Ϸ� �� ��¥ ���ϴ� ���
select now(), now()::date - '1 day' ::interval;
-- ���� Ÿ���� ��ȸ�ϴ� ���
show timezone;
--�ý��� ���ڸ� ��ȸ�ϴ� ���
select current_date, current_time, timeofday(); 
select now(), current_timestamp, timestamp 'now';
-- ��¥���� ������ �����ϴ� ��� (date_part, extract, date_trunc ���� ����� ��� �ٸ��� ���غ�����.)
select date_part('year', timestamp '2020-07-30 20:38:40');
select date_part('year', current_timestamp);

select extract('isoyear' from date '2006-01-01');
select extract('isoyear' from current_timestamp);

select date_trunc('year', timestamp '2020-07-30 20:38:40');
select date_trunc('year', current_timestamp);

-- ��¥���� ���� �����ϴ� ��� (date_part, extract, date_trunc ���� ����� ��� �ٸ��� ���غ�����.)
select date_part('month', timestamp '2020-07-30 20:38:40');
select date_part('month', current_timestamp);

select extract('month' from timestamp '2020-07-30 20:38:40');
select extract('month' from interval '2 years 3 months');
select extract('month' from interval '2 years 13 months');

select date_trunc('month', timestamp '2020-07-30 20:38:40'); -- �������� ������ �������� �ʱ�ȭ�� �´��� �����

-- ��¥���� ���� �����ϴ� ���
select date_part('day', timestamp '2020-07-30 20:38:40');
select date_trunc('day', timestamp '2020-07-30 20:38:40'); -- ���ڱ����� ������ �������� �ʱ�ȭ�� �´��� �����

-- �ð����� �ø� �����ϴ� ���
select date_part('hour', timestamp '2013-07-30 20:38:40');
select date_part('hour', interval '4 hours 3 minutes');
select date_trunc('hour', timestamp '2020-07-30 20:38:40');

-- �ð����� ���� �����ϴ� ���
select date_part('minute', timestamp '2020-07-30 20:38:40');
select date_trunc('minute', timestamp '2020-07-30 20:38:40');

-- �ð����� �ʸ� �����ϴ� ���
select date_part('second',timestamp '2013-07-30 20:38:40'); 
select extract('second' from time '17:12:28.5');
select date_trunc('second', timestamp '2013-07-30 20:38:40');

-- �ּ� ���ϱ�
SELECT EMP_NAME, to_char((current_timestamp - ENT_DATE),'W') WEEKS
FROM cslee.TB_EMP
WHERE ORG_CD = '10';

-- to_Char ����
select emp_name, ent_date,
	to_char(ent_date,'yyyy') �Ի��,
	to_char(ent_date,'MM') �Ի��,
	to_char(ent_date,'DD') �Ի���
from cslee.tb_emp;

-- Extract ����
select emp_name, ent_date,
	extract('year' from ent_date) �Ի��,
	extract('month' from ent_date) �Ի��,
	extract('day' from ent_date) �Ի���
from cslee.tb_emp;

-- ��ȯ�Լ�(����� ������ ���� ��ȯ) to_date, to_number, to_timestamp, cast
select to_date('05 Dec 2000', 'DD Mon YYYY');

select to_number('12,454.8-', '99G999D9S');

select to_timestamp('05 Dec 2000', 'DD Mon YYYY');

-- ��ȯ�Լ� ��ü
select cast(123.4 as varchar(10))
	, cast('123.5' as NUMERIC)
	, cast(1234.5678 as dec(6,2))
	, cast(current_timestamp as date)
	, to_char(current_timestamp, 'YYYY-MM-DD HH24:MI:SS')
	, to_char(1234.56, 'L9,999,99')
	, to_number('$12,345', '$99,999')
	, to_date('2014/03/01 21:30:18', 'YYYY/MM/DD HH24:MI:SS')
	, to_timestamp('2014/03/01 21:30:18', 'YYYY/MM/DD HH24:MI:SS'); 
	
-- Case ǥ�� ����
select emp_name,
	case when salary > 50000000
	then salary
	else 50000000
	end as revised_salary
from cslee.tb_emp;

select org_name,
case org_name
when '����1��' then '����'
when '����2��' then '����'
when '����3��' then '����'
when '�濵������' then '����'
else '����'
end as AREA
	from cslee.tb_org;
	
-- case��
select emp_name,
	case when salary >= 90000000 then 'high'
		 when salary >= 60000000 then 'mid'
		 else 'low'
	end  as salary_grade
from cslee.tb_emp;

-- ��ø case��
select emp_name, salary,
	case when salary >= 50000000
			then 20000000
		 else (case when salary >= 20000000
		 					then 10000000
		 			else salary * 0.5
		 		end)
	end as BONUS
from cslee.tb_emp;

--null ���� �Լ�
--coalesce �Լ�
select emp_name, position, coalesce(position, '����')
from cslee.tb_emp;

-- case�Լ�
select emp_name, position,
       case when position is null
       then '����'
       		else position
       end as ��å
from cslee.tb_emp te 

-- null�� ������
select coalesce(salary, 0) SAL
from cslee.tb_emp
where emp_name = '������';

select Max(salary) sal
from cslee.tb_emp 
where emp_name = '������';

select coalesce(salary, 9999) sal
from cslee.tb_emp
where emp_name = '������';

select count(*) "��ü�Ǽ�"
	, count(position) "��å�Ǽ�"
	, count(distinct position) "��å����"
	, MAX(salary) "�ִ�"
	, min(salary) "�ּ�"
	, avg(salary) "���"
from cslee.tb_emp;

-- group by ��

select position "��å",
count(*) "�ο���",
MIN(Salary) "�ּ�",
MAX(salary) "�ִ�",
AVG(salary) "���"
from cslee.tb_emp
group by position;

-- Having ��

select org_cd "�μ�",
count(*) "�ο���",
avg(salary) "���"
FROM cslee.tb_emp
group by org_cd
having count(*) >= 4;

select org_cd "�μ�",
Max(salary) "�ִ�"
from cslee.tb_emp
group by org_cd 
having min(salary) <= 40000000;

select org_cd, position, avg(salary)
from cslee.tb_emp 
where position in ('����', '�븮','���')
group by org_cd, position;

select org_cd
	, AVG(case position when '����' then salary end) "����"
	, AVG(case position when '�븮' then salary end) "�븮"
	, AVG(case position when '���' then salary end) "���"
from cslee.tb_emp 
where position in ('����','�븮','���')
group by org_cd;

select org_cd,
sum(coalesce((case position when '����' then 1 else 0 end),0)) "����",
sum(coalesce((case position when '����' then 1 else 0 end),0)) "����",
sum(coalesce((case position when '�븮' then 1 else 0 end),0)) "�븮",
sum(coalesce((case position when '���' then 1 else 0 end),0)) "���"
from cslee.tb_emp 
group by org_cd;

select org_cd,
coalesce(sum(case position when '����' then 1 else 0 end),0) "����",
coalesce(sum(case position when '����' then 1 else 0 end),0) "����",
coalesce(sum(case position when '�븮' then 1 else 0 end),0) "�븮",
coalesce(sum(case position when '���' then 1 else 0 end),0) "���"
from cslee.tb_emp 
group by org_cd;

-- ��� ���̺�� ���� ���̺��� ���� sql
select tb_emp.emp_name, tb_emp.org_cd, tb_org.org_cd, tb_org.org_name
from cslee.tb_emp, cslee.tb_org 
where cslee.tb_emp.org_cd = cslee.tb_org.org_cd;

-- ����̸�, �ҼӺμ��ڵ�, �μ���(������), ��å�� ����Ͻÿ�.
select tb_emp.emp_no, tb_emp.emp_name, tb_emp.org_cd, tb_org.org_name, tb_emp.position
from cslee.tb_emp, cslee.tb_org
where cslee.tb_emp.org_cd = cslee.tb_org.org_cd ;

-- Alias ���
select e.emp_no, e.emp_name, e.org_cd, o.org_name, e.position
from cslee.tb_emp as e, cslee.tb_org as o 
where e.org_cd = o.org_cd and e.position = '����' 
order by o.org_name; 
-- ���� �����÷� ����, ��������, ����

-- ���¹�ȣ, ����, ��ǰ��, ���ݾ�, �����ڸ��� ����Ѵ�.
select  a.accno, c.cust_name, p.prod_name, a.cont_amt, e.emp_name
from cslee.tb_accnt a, cslee.tb_cust c, cslee.tb_prod p, cslee.tb_emp e 
where a.cust_no = c.cust_no 
and a.prod_cd = p.prod_cd 
and a.manager = e.emp_no;

-- ����� �޿��� ��� ��޿� ���ϴ��� �˰� �ʹٴ� �䱸���׿� ���� Non Equi Join
select e.emp_name �����, e.salary ����, s.grade �޿����
from cslee.tb_emp e, cslee.tb_grade s
where e.salary between s.low_sal and s.high_sal ;

-- ǥ�� ����(ANSI ǥ����, ANSI ǥ�������� ������ ���� ����)
-- Inner Join
-- ��� ��ȣ�� ��� �̸�, �ҼӺμ� �ڵ�� �ҼӺμ� �̸��� ã�ƺ���.

--(1)where�� join ����
select emp.emp_no, emp.emp_name, org.org_name
from cslee.tb_emp emp, cslee.tb_org org 
where emp.org_cd = org.org_cd ;

--(2)From�� join ����
select emp.emp_no, emp.emp_name, org.org_name
from cslee.tb_emp emp
inner join cslee.tb_org org
on emp.org_cd = org.org_cd ;

--(3)INNER Ű���� ����
select emp.emp_no, emp.emp_name, org.org_name
from cslee.tb_emp emp
join cslee.tb_org org
on emp.org_cd = org.org_cd ;

-- ���� ���̺��� ���¹�ȣ�� ����ȣ, ���� ���� �����̺�� �����Ͽ� ã�ƺ���.
select acc.accno, acc.cust_no, cust.cust_name
from cslee.tb_accnt acc inner join cslee.tb_cust cust
on (cust.cust_no = acc.cust_no);

-- From�� Join ����
-- �����ڵ� 10�� �μ��� �Ҽ� ��� �̸� �� �Ҽ� �μ� �ڵ�, �μ� �ڵ�, �μ� �̸��� ã�ƺ���. 
select e.emp_name, e.org_cd, o.org_cd, o.org_name
from cslee.tb_emp e
join cslee.tb_org o 
on (e.org_cd = o.org_cd)
where e.org_cd = '10';

-- on���ǰ�- ��������
--(1) where�� join ����
select a.accno ���¹�ȣ, c.cust_name ����, p.prod_name ��ǰ��
	, a.cont_amt ���ݾ�, e.emp_name ����ڸ�
from cslee.tb_accnt A, cslee.tb_cust c, cslee.tb_prod p, cslee.tb_emp e 
where a.cust_no = c.cust_no 
and a.prod_cd = p.prod_cd 
and a.manager = e.emp_no;

-- (2) on�� join ����
select a.accno ���¹�ȣ, c.cust_name ����, p.prod_name ��ǰ��
	, a.cont_amt ����ȣ, e.emp_name ����ڸ�
from cslee.tb_accnt a 
inner join cslee.tb_cust c on A.cust_no = c.cust_no 
inner join cslee.tb_prod p on a.prod_cd = p.prod_cd 
inner join cslee.tb_emp e on a.manager = e.emp_no;

-- cross ����
select count(emp_name) from cslee.tb_emp;
select count(org_name) from cslee.tb_org;

select e.emp_name, o.org_name
from cslee.tb_emp e cross join cslee.tb_org o 
order by emp_name;

select count(e.emp_name)
from cslee.tb_emp e cross join cslee.tb_org o;

-- left outer join
-- ���� �߿� ���� �μ������� �ȵ� ����� �ִ�. ���(tb_emp)�� ����(tb_org)�� join�ϵ�
-- �μ������� �ȵ� ����� ������ ���� ����ϵ��� �Ѵ�.
select e.emp_no ���, e.emp_name �����, e.position ��å, o.org_name �μ���
from cslee.tb_emp e left outer join cslee.tb_org o 
on e.org_cd = o.org_cd 
where e.position = '���';

-- right outer join
-- ���� �������� left join�� outer join���� ǥ���Ѵ�.
select e.emp_no ���, e.emp_name �����, e.position ��å, o.org_name �μ���
from cslee.tb_org o right outer join cslee.tb_emp e 
on e.org_cd = o.org_cd 
where e.position = '���';

-- Full outer join
select a.org_cd, A.org_name, B.org_cd, B.org_name
from cslee.tb_org a full outer join cslee.tb_org b 
on a.org_cd = b.org_cd;

select a.org_cd, A.org_name, B.org_cd, B.org_name
from cslee.tb_org a left outer join cslee.tb_org b 
on a.org_cd = b.org_cd
union
select a.org_cd, A.org_name, B.org_cd, B.org_name
from cslee.tb_org a right outer join cslee.tb_org b 
on a.org_cd = b.org_cd;