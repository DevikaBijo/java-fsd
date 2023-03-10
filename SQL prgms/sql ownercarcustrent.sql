use devika;
select cars.car_id,cars.car_name, cars.car_type from cars inner join rentals where pickup_date= null;
select cars.car_id,cars.car_name ,cars.owner_id from cars where car_type in ("ABC") order by car_id;
alter table cars add  car_regno varchar(10);
select car_id, car_name, car_type from cars where car_type in("ABC") order by car_id;
select c.owner_id,owner_name,address,phone_no from owners inner join cars c on owners.owner_id=c.owner_id where car_name in( "swift") order by owner_id;
select rental_id , car_id, customer_id,km_driven from rentals where return_date="2018-03-10";
select distinct car_id,count(car_id)AS count from rentals group by car_id;