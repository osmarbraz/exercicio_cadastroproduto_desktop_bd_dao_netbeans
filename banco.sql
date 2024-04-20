#criar o database chamado exercicio
create database if not exists exercicio;

#entrar no database exercicio
use exercicio;

#remove a tabela para recriá-la
drop table if exists produto;

#cria a tabela de produto 
CREATE TABLE produto (
	produtoID   INTEGER NOT NULL AUTO_INCREMENT,    	 
	nome        VARCHAR(50) NOT NULL,     
	precoVenda  DECIMAL(9,2) NOT NULL,     
	precoCusto  DECIMAL(9,2) NOT NULL,     
	unidade     VARCHAR(2),	
	categoria   VARCHAR(25),
	PRIMARY KEY(produtoID)    
);

#lista a tabela criada
show tables;
