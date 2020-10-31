create database trabalhoPoo;
use trabalhoPoo;
create table Cliente(
	id integer UNSIGNED auto_increment not null,
	whatsapp varchar(11),
    nome varchar(100) not null,
	address varchar(150) not null,
    district varchar(100) not null,
    city varchar(100) not null,
    primary key (id)
);

insert into Cliente (whatsapp, nome, address, district, city) values ("31999999999", "Filipe", "rua almeida", "MG", "BH");
select * from Cliente;