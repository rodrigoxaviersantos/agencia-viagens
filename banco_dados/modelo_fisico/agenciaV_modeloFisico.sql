CREATE DATABASE agencia_viagens; 

use agencia_viagens; 


    /* Tabelas */
    CREATE TABLE Usuario (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    email_usuario VARCHAR(50),
    senha_usuario VARCHAR(12),
    dataCadastro_usuario DATETIME
);


CREATE TABLE Cliente (
    cpf_cliente VARCHAR(11) PRIMARY KEY,
    id_usuario INT,
    email_cliente VARCHAR(50),
    telefone_cliente VARCHAR(11),
    nome_cliente VARCHAR(60),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario)
);


CREATE TABLE Pedido (
    num_pedido INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT,
    data_pedido DATETIME,
    formaPag_pedido VARCHAR(20),
    precoTotal_pedido DECIMAL(12),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario)
);


CREATE TABLE Passagem (
    id_passagem INT PRIMARY KEY AUTO_INCREMENT,
    num_pedido INT,
    qtde_passagem INT,
    FOREIGN KEY (num_pedido) REFERENCES Pedido(num_pedido)
);



-- Selecionando tabelas                                
select * from Usuario;
select * from cliente;
select * from Pedido;
select * from Passagem;


-- Inserindo dados na tabela Usuario
INSERT INTO Usuario (email_usuario, senha_usuario, dataCadastro_usuario)
VALUES ('maria@gmail.com', '321', '2023-10-09');

-- Inserindo dados na tabela Cliente
INSERT INTO Cliente (cpf_cliente, email_cliente, telefone_cliente, nome_cliente)
VALUES ('12345678901', 'maria@gmail.com', '987654321', 'Maria');

INSERT INTO Cliente (id_usuario, cpf_cliente, email_cliente, telefone_cliente, nome_cliente)
VALUES (3, '12345678902', 'sofia@gmail.com', '987654321', 'Sofia');


-- Inserindo dados na tabela Pedido
INSERT INTO Pedido (id_usuario, data_pedido, formaPag_pedido, precoTotal_pedido)
VALUES (3, '2023-10-09', 'Cartão de Crédito', 150.00);

INSERT INTO Pedido (id_usuario, data_pedido, formaPag_pedido, precoTotal_pedido)
VALUES (3, '2023-10-09', 'À vista', 100.00);

-- Inserindo dados na tabela Passagem
INSERT INTO Passagem (num_pedido, qtde_passagem)
VALUES (1, 10);
INSERT INTO Passagem (num_pedido, qtde_passagem)
VALUES (3, 5);




-- Consultas SQL

SELECT * FROM Usuario WHERE id_usuario = 3;
SELECT * FROM Cliente WHERE id_usuario = 3;

SELECT u.id_usuario, u.email_usuario, c.cpf_cliente, c.email_cliente, c.telefone_cliente, c.nome_cliente, 
       p.num_pedido, p.data_pedido, p.formaPag_pedido, p.precoTotal_pedido,
       pa.id_passagem, pa.qtde_passagem
FROM Usuario u
JOIN Cliente c ON u.id_usuario = c.id_usuario
JOIN Pedido p ON p.id_usuario = c.id_usuario 
JOIN Passagem pa ON p.num_pedido = pa.num_pedido
WHERE c.cpf_cliente = '12345678902'; 

-- Delete - Excluindo um pedido e sua passagem associada 

DELETE FROM Pedido, Passagem
USING Pedido
JOIN Passagem ON Pedido.num_pedido = Passagem.num_pedido
WHERE Pedido.num_pedido = "SeuNumeroDePedido";

-- Update 

UPDATE Usuario
SET email_usuario = ?, senha_usuario = ?
WHERE id_usuario = ?;
