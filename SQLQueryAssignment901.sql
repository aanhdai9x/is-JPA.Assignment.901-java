CREATE DATABASE Assignment901
GO

USE Assignment901
GO

CREATE TABLE Customer(
	customer_id		INT	    PRIMARY KEY ,
	[name]			VARCHAR(60) ,
	phoneNumber		VARCHAR(12) ,
	[address]		VARCHAR(60) ,
)

CREATE TABLE [Order](
	customer_id		INT ,
	number			VARCHAR(10) ,
	[date]			DATE ,
	FOREIGN KEY (customer_id) REFERENCES Customer(customer_id) ,
)

INSERT Customer(customer_id ,[name], phoneNumber, [address]) VALUES(1, 'Tan', '123654785', 'Cau Giay');
INSERT [Order](customer_id,number, [date]) VALUES(1,'2', '2021-12-11');

select * from [Order] o, Customer c
where o.customer_id = c.customer_id 
and phoneNumber = '123456789'

delete [Order] FROM [Order] o, Customer c
where c.customer_id = o.customer_id
and phoneNumber = '123654785'