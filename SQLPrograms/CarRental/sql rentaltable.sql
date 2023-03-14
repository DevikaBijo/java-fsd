use devika;
create table rentals(
	rental_id varchar(10),
    customer_id varchar(10),
    car_id varchar(10),
    pickup_date date,
    return_date date,
    km_driven int,
    fare_amount double(10,2),
    primary key(rental_id),
    foreign key(customer_id) references customers(customer_id),
    foreign key(car_id) references cars(car_id)
    );

insert into rentals(rental_id,customer_id, car_id,pickup_date, return_date,km_driven, fare_amount)
	values("R001","1","10","2018-03-10","2018-03-10",800,9000),
		("R002","2","11","2018-03-11","2018-03-12",200,3000),
        ("R003","3","12","2018-04-15","2018-04-15",100,1500),
        ("R004","4","13","2018-05-16","2018-05-18",1000,10000),
        ("R005","5","14","2018-05-10","2018-05-12",900,11000),
        ("R006","6","15","2018-05-20","2018-05-21",200,2500);

        

    
    