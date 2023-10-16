/* agenciaV_modeloLogico: */


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
