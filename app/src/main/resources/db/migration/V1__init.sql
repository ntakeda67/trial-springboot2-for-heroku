create table operation_log (
	id serial not null primary key,
	description varchar(255) not null,
	created_at timestamp not null
);

insert into operation_log (description, created_at) values ('DUMMY_DATA', '2018-06-08T12:34:56');