use devika;
/*CREATE TABLE Employee (
    employee_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    hire_date DATE NOT NULL,
    job_title VARCHAR(50) NOT NULL,
    department_id INT NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);*/

insert  into Employee(employee_id,first_name , last_name, email, phone,
		hire_date,job_title,department_id ,salary)
values(12,"meeanakshi","sajeevan","meenakshi@gmail.com",9995076030,"2022-12-21","engineer",1234,50000.0),
	(13,"devika","bijo","devika@gmail.com",9061861825,"2022-12-22","engineer",3421,100000.0),
    (14,"amitha","benny","amitha2gmail.com",9877654320,"2023-10-5","engineer",6789,560000.0),
    (23,"migha","joseph","migha@gmail.com",906188905,"2022-12-2","engineer",7890,200000.0),
    (33,"sona","s","sona@gmail.com",7865861825,"2022-10-9","engineer",4321,980000.0);
    



