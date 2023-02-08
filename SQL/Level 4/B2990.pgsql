/*
Show the CPF, employees (empregados) name and department (departamentos) name of the employees that don't work (trabalha) in any project 
(projetos). The result must be order by CPF.
*/

SELECT e.cpf, e.enome, d.dnome
FROM empregados e INNER JOIN departamentos d ON e.dnumero = d.dnumero
WHERE e.cpf_supervisor IS NULL
ORDER BY e.cpf;