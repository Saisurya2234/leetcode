select emp.name,e.unique_id
from Employees as emp
left join EmployeeUNI as e
on emp.id=e.id;