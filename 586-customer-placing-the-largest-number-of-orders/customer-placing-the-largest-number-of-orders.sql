with sai as
(select customer_number,count(customer_number) as count from Orders group by customer_number)
select customer_number from sai where count=(select max(count) from sai);