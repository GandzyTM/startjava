select * from jaegers.jaegers;

select *  from jaegers.jaegers jj where jj.status = 'Alive';

select * from jaegers.jaegers jj where jj.mark in ('Mark-1', 'Mark-3');

select * from jaegers.jaegers jj order by jj.mark desc;

select * from jaegers.jaegers jj where jj.launch > to_date('2017-07-07', 'YYYY-MM-DD');

select * from jaegers.jaegers jj where jj."kaijuKill" > 5
union all
select * from jaegers.jaegers jj where jj."kaijuKill" < 4;

select avg(jj.weight) from jaegers.jaegers jj;

update jaegers.jaegers set "kaijuKill" = "kaijuKill" + 1 where status = 'Alive';

delete from jaegers.jaegers jj where jj.status = 'Destroyed';