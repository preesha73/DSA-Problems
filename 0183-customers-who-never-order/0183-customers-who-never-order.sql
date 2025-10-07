# Write your MySQL query statement below
-- SELECT c.name AS Customers
-- FROM Customers c
-- WHERE c.id NOT IN(
--     SELECT customerID FROM Orders
-- );

-- SELECT c.name AS Customers
-- FROM Customers c
-- LEFT JOIN Orders o
--     ON c.id = o.customerID
-- WHERE o.id is NULL;

SELECT c.name AS Customers
FROM Customers c
WHERE NOT EXISTS (
    SELECT 1
    FROM Orders o
    WHERE o.customerID = c.id
);