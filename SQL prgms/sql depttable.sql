use devika;
/*CREATE TABLE Department (
    department_id INT NOT NULL AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL,
    manager_id INT,
    location VARCHAR(100),
    PRIMARY KEY (department_id)
);*/

insert into Department ( department_id ,department_name,manager_id,location)
values(1234, "cloud service",5678,"trivandrum"),(3421,"AI",9000,"kochi"),
	 (6789,"machine learning",07655,"kozhikode"),(7890,"development",6742,"banglore"),
     (4321,"testing",6666,"trivandrum");
