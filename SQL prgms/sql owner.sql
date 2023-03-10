use devika;
create table owners(
	owner_id varchar(10),
    owner_name varchar(20),
    address varchar(20),
    phone_no bigint,
    email varchar(20),
    primary key(owner_id)
    );
  insert into owners(owner_id ,owner_name,address, phone_no ,email)
	values("123", "meenakshi", "thodupuzha",9995076030,"meenu@gmail.com"),
		("456","devika","ernakulam",9061861825,"devika@gmail.com"),
        ("789","amitha","kochi",9878654367,"amitha@gmail.com"),
        ("011","sree","mvta",9823114588,"sree@gmail.com"),
        ("012","jyothi","thodupuzha",8113426678,"jyothika@gmail.com"),
        ("013","ayline","tvm",9876432200,"aylinesara@gmail.com");
        