create table saving_account (
	account_no integer primary key generated always as identity,
	full_name varchar(50),
	balance decimal
);

insert into saving_account(full_name,balance) values('first_customer1',200.0);
insert into saving_account(full_name,balance) values('second_customer2',202.0);