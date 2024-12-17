CREATE DATABASE db_padaria;

USE db_padaria;

CREATE TABLE tb_produto
(
	id INT AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
    preco DOUBLE NOT NULL,
    data_fabricacao DATE,
    data_vencimento DATE,
    CONSTRAINT pk_tb_produto PRIMARY KEY(id)
);