-- 4장. 데이터 제한과 정렬
-- 1. Where절 연습
-- 예제1: 문자형 값 비교
SELECT EMP_NAME 사원이름, ORG_CD 소속, POSITION 직무, SALARY 연봉
FROM cslee.TB_EMP
WHERE POSITION ='대리';

-- 현재 시간 조회하는 방법
select now();
-- 현재시간보다 하루 전 날짜 구하는 방법
select now(), now()::date - '1 day' ::interval;
-- 현재 타임존 조회하는 방법
show timezone;
--시스템 일자를 조회하는 방법
select current_date, current_time, timeofday(); 
select now(), current_timestamp, timestamp 'now';
-- 날짜에서 연도를 추출하는 방법 (date_part, extract, date_trunc 각각 결과가 어떻게 다른지 비교해보세요.)
select date_part('year', timestamp '2020-07-30 20:38:40');
select date_part('year', current_timestamp);

select extract('isoyear' from date '2006-01-01');
select extract('isoyear' from current_timestamp);

select date_trunc('year', timestamp '2020-07-30 20:38:40');
select date_trunc('year', current_timestamp);

-- 날짜에서 월을 추출하는 방법 (date_part, extract, date_trunc 각각 결과가 어떻게 다른지 비교해보세요.)
select date_part('month', timestamp '2020-07-30 20:38:40');
select date_part('month', current_timestamp);

select extract('month' from timestamp '2020-07-30 20:38:40');
select extract('month' from interval '2 years 3 months');
select extract('month' from interval '2 years 13 months');

select date_trunc('month', timestamp '2020-07-30 20:38:40'); -- 월까지만 나오고 나머지는 초기화로 맞누는 방법임

-- 날짜에서 일을 추출하는 방법
select date_part('day', timestamp '2020-07-30 20:38:40');
select date_trunc('day', timestamp '2020-07-30 20:38:40'); -- 일자까지만 나오고 나머지는 초기화로 맞누는 방법임

-- 시간에서 시를 추출하는 방법
select date_part('hour', timestamp '2013-07-30 20:38:40');
select date_part('hour', interval '4 hours 3 minutes');
select date_trunc('hour', timestamp '2020-07-30 20:38:40');

-- 시간에서 분을 추출하는 방법
select date_part('minute', timestamp '2020-07-30 20:38:40');
select date_trunc('minute', timestamp '2020-07-30 20:38:40');

-- 시간에서 초를 추출하는 방법
select date_part('second',timestamp '2013-07-30 20:38:40'); 
select extract('second' from time '17:12:28.5');
select date_trunc('second', timestamp '2013-07-30 20:38:40');

-- 주수 구하기
SELECT EMP_NAME, to_char((current_timestamp - ENT_DATE),'W') WEEKS
FROM cslee.TB_EMP
WHERE ORG_CD = '10';

-- to_Char 구문
select emp_name, ent_date,
	to_char(ent_date,'yyyy') 입사년,
	to_char(ent_date,'MM') 입사월,
	to_char(ent_date,'DD') 입사일
from cslee.tb_emp;

-- Extract 구문
select emp_name, ent_date,
	extract('year' from ent_date) 입사년,
	extract('month' from ent_date) 입사월,
	extract('day' from ent_date) 입사일
from cslee.tb_emp;

-- 변환함수(명시적 데이터 유형 변환) to_date, to_number, to_timestamp, cast
select to_date('05 Dec 2000', 'DD Mon YYYY');

select to_number('12,454.8-', '99G999D9S');

select to_timestamp('05 Dec 2000', 'DD Mon YYYY');

-- 변환함수 전체
select cast(123.4 as varchar(10))
	, cast('123.5' as NUMERIC)
	, cast(1234.5678 as dec(6,2))
	, cast(current_timestamp as date)
	, to_char(current_timestamp, 'YYYY-MM-DD HH24:MI:SS')
	, to_char(1234.56, 'L9,999,99')
	, to_number('$12,345', '$99,999')
	, to_date('2014/03/01 21:30:18', 'YYYY/MM/DD HH24:MI:SS')
	, to_timestamp('2014/03/01 21:30:18', 'YYYY/MM/DD HH24:MI:SS'); 
	
-- Case 표현 예제
select emp_name,
	case when salary > 50000000
	then salary
	else 50000000
	end as revised_salary
from cslee.tb_emp;

select org_name,
case org_name
when '영업1팀' then '지사'
when '영업2팀' then '지사'
when '영업3팀' then '지사'
when '경영관리팀' then '본사'
else '지점'
end as AREA
	from cslee.tb_org;
	
-- case문
select emp_name,
	case when salary >= 90000000 then 'high'
		 when salary >= 60000000 then 'mid'
		 else 'low'
	end  as salary_grade
from cslee.tb_emp;

-- 중첩 case문
select emp_name, salary,
	case when salary >= 50000000
			then 20000000
		 else (case when salary >= 20000000
		 					then 10000000
		 			else salary * 0.5
		 		end)
	end as BONUS
from cslee.tb_emp;

--null 관련 함수
--coalesce 함수
select emp_name, position, coalesce(position, '없음')
from cslee.tb_emp;

-- case함수
select emp_name, position,
       case when position is null
       then '없음'
       		else position
       end as 직책
from cslee.tb_emp te 

-- null과 공집합
select coalesce(salary, 0) SAL
from cslee.tb_emp
where emp_name = '김태진';

select Max(salary) sal
from cslee.tb_emp 
where emp_name = '김태진';

select coalesce(salary, 9999) sal
from cslee.tb_emp
where emp_name = '김태진';

select count(*) "전체건수"
	, count(position) "직책건수"
	, count(distinct position) "직책종류"
	, MAX(salary) "최대"
	, min(salary) "최소"
	, avg(salary) "평균"
from cslee.tb_emp;

-- group by 절

select position "직책",
count(*) "인원수",
MIN(Salary) "최소",
MAX(salary) "최대",
AVG(salary) "평균"
from cslee.tb_emp
group by position;

-- Having 절

select org_cd "부서",
count(*) "인원수",
avg(salary) "평균"
FROM cslee.tb_emp
group by org_cd
having count(*) >= 4;

select org_cd "부서",
Max(salary) "최대"
from cslee.tb_emp
group by org_cd 
having min(salary) <= 40000000;

select org_cd, position, avg(salary)
from cslee.tb_emp 
where position in ('과장', '대리','사원')
group by org_cd, position;

select org_cd
	, AVG(case position when '과장' then salary end) "과장"
	, AVG(case position when '대리' then salary end) "대리"
	, AVG(case position when '사원' then salary end) "사원"
from cslee.tb_emp 
where position in ('과장','대리','사원')
group by org_cd;

select org_cd,
sum(coalesce((case position when '팀장' then 1 else 0 end),0)) "팀장",
sum(coalesce((case position when '과장' then 1 else 0 end),0)) "과장",
sum(coalesce((case position when '대리' then 1 else 0 end),0)) "대리",
sum(coalesce((case position when '사원' then 1 else 0 end),0)) "사원"
from cslee.tb_emp 
group by org_cd;

select org_cd,
coalesce(sum(case position when '팀장' then 1 else 0 end),0) "팀장",
coalesce(sum(case position when '과장' then 1 else 0 end),0) "과장",
coalesce(sum(case position when '대리' then 1 else 0 end),0) "대리",
coalesce(sum(case position when '사원' then 1 else 0 end),0) "사원"
from cslee.tb_emp 
group by org_cd;

-- 사원 테이블과 조직 테이블의 조인 sql
select tb_emp.emp_name, tb_emp.org_cd, tb_org.org_cd, tb_org.org_name
from cslee.tb_emp, cslee.tb_org 
where cslee.tb_emp.org_cd = cslee.tb_org.org_cd;

-- 사원이름, 소속부서코드, 부서명(조직명), 직책을 출력하시오.
select tb_emp.emp_no, tb_emp.emp_name, tb_emp.org_cd, tb_org.org_name, tb_emp.position
from cslee.tb_emp, cslee.tb_org
where cslee.tb_emp.org_cd = cslee.tb_org.org_cd ;

-- Alias 사용
select e.emp_no, e.emp_name, e.org_cd, o.org_name, e.position
from cslee.tb_emp as e, cslee.tb_org as o 
where e.org_cd = o.org_cd and e.position = '팀장' 
order by o.org_name; 
-- 각각 조인컬럼 지정, 필터조건, 정렬

-- 계좌번호, 고객명, 상품명, 계약금액, 관리자명을 출력한다.
select  a.accno, c.cust_name, p.prod_name, a.cont_amt, e.emp_name
from cslee.tb_accnt a, cslee.tb_cust c, cslee.tb_prod p, cslee.tb_emp e 
where a.cust_no = c.cust_no 
and a.prod_cd = p.prod_cd 
and a.manager = e.emp_no;

-- 사원별 급여와 어느 등급에 속하는지 알고 싶다는 요구사항에 대한 Non Equi Join
select e.emp_name 사원명, e.salary 연봉, s.grade 급여등급
from cslee.tb_emp e, cslee.tb_grade s
where e.salary between s.low_sal and s.high_sal ;

-- 표준 조인(ANSI 표현법, ANSI 표현법으로 익히는 것이 좋다)
-- Inner Join
-- 사원 번호와 사원 이름, 소속부서 코드와 소속부서 이름을 찾아본다.

--(1)where절 join 조건
select emp.emp_no, emp.emp_name, org.org_name
from cslee.tb_emp emp, cslee.tb_org org 
where emp.org_cd = org.org_cd ;

--(2)From절 join 조건
select emp.emp_no, emp.emp_name, org.org_name
from cslee.tb_emp emp
inner join cslee.tb_org org
on emp.org_cd = org.org_cd ;

--(3)INNER 키워드 생략
select emp.emp_no, emp.emp_name, org.org_name
from cslee.tb_emp emp
join cslee.tb_org org
on emp.org_cd = org.org_cd ;

-- 계좌 테이블에서 계좌번호와 고객번호, 고객의 명을 고객테이블과 조인하여 찾아본다.
select acc.accno, acc.cust_no, cust.cust_name
from cslee.tb_accnt acc inner join cslee.tb_cust cust
on (cust.cust_no = acc.cust_no);

-- From절 Join 조건
-- 조직코드 10인 부서의 소속 사원 이름 및 소속 부서 코드, 부서 코드, 부서 이름을 찾아본다. 
select e.emp_name, e.org_cd, o.org_cd, o.org_name
from cslee.tb_emp e
join cslee.tb_org o 
on (e.org_cd = o.org_cd)
where e.org_cd = '10';

-- on조건걸- 다중조인
--(1) where절 join 조건
select a.accno 계좌번호, c.cust_name 고객명, p.prod_name 상품명
	, a.cont_amt 계약금액, e.emp_name 담당자명
from cslee.tb_accnt A, cslee.tb_cust c, cslee.tb_prod p, cslee.tb_emp e 
where a.cust_no = c.cust_no 
and a.prod_cd = p.prod_cd 
and a.manager = e.emp_no;

-- (2) on절 join 조건
select a.accno 계좌번호, c.cust_name 고객명, p.prod_name 상품명
	, a.cont_amt 계약번호, e.emp_name 담당자명
from cslee.tb_accnt a 
inner join cslee.tb_cust c on A.cust_no = c.cust_no 
inner join cslee.tb_prod p on a.prod_cd = p.prod_cd 
inner join cslee.tb_emp e on a.manager = e.emp_no;

-- cross 조인
select count(emp_name) from cslee.tb_emp;
select count(org_name) from cslee.tb_org;

select e.emp_name, o.org_name
from cslee.tb_emp e cross join cslee.tb_org o 
order by emp_name;

select count(e.emp_name)
from cslee.tb_emp e cross join cslee.tb_org o;

-- left outer join
-- 직원 중에 아직 부서배정이 안된 사원도 있다. 사원(tb_emp)과 조직(tb_org)을 join하되
-- 부서배정이 안된 사원의 정보도 같이 출력하도록 한다.
select e.emp_no 사번, e.emp_name 사원명, e.position 직책, o.org_name 부서명
from cslee.tb_emp e left outer join cslee.tb_org o 
on e.org_cd = o.org_cd 
where e.position = '사원';

-- right outer join
-- 이전 예제에서 left join을 outer join으로 표현한다.
select e.emp_no 사번, e.emp_name 사원명, e.position 직책, o.org_name 부서명
from cslee.tb_org o right outer join cslee.tb_emp e 
on e.org_cd = o.org_cd 
where e.position = '사원';

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