CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT (
        SELECT salary 
        FROM (
            SELECT DISTINCT salary, DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk FROM Employee
        ) AS ranked_salary
        WHERE rnk=N
      ) AS getNthHighestSalary

  );
END