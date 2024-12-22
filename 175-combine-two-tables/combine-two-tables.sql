select p.firstName, p.lastName, coalesce(a.city,null) as city,coalesce(a.state,null) as state
from Person as p
left join Address as a
on p.personId=a.personId;