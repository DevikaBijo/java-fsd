use devika;
create table cars(
	car_id varchar(10),
    car_name varchar(20),
    car_type varchar(20),
    owner_id varchar(10),
    primary key(car_id),
    foreign key(owner_id) references owners(owner_id)
    );
    insert into cars(car_id, car_name, car_type ,owner_id)
		values("10","swift","ABC","123"),
			("11","Innova","DEF","456"),
            ("12","i20","GHI","789"),
            ("13","creta","JKL","011"),
            ("14","Breeza","MNO","012"),
            ("15","Alto","PQR","013");