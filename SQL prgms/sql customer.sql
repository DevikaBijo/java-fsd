use devika;
create table customers(
	customer_id varchar(10),
    customer_name varchar(20),
    address varchar(20),
    phone_no bigint(20),
    email_id varchar(20),
    primary key(customer_id)
    );
    
insert into customers(customer_id, customer_name ,address,phone_no,email_id)
	values("1","annsmaria","mvta",8977665678, "anns@gmail.com"),
		("2","alpho","ekm",908799657,"alph@gmail.com"),
        ("3","anu","trissur",9205608900,"anu@gmail.com"),
        ("4","dev","trissur",920545900,"dev@gmail.com"),
        ("5","devu","idukki",7866548900,"devu@gmail.com"),
        ("6","ami","ekm",7688990035,"amii@gmail.com");
		