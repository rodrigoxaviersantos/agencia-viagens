/* agenciaV_modeloLogico: */

CREATE TABLE Usuario (
    id_usuario Inteiro PRIMARY KEY,
    email_usuario VARCHAR,
    senha_usuario Inteiro,
    dataCadastro_usuario DATE
);

CREATE TABLE Cliente_ (
);

CREATE TABLE Pedido (
    num_pedido Inteiro PRIMARY KEY
);

CREATE TABLE Passagem (
    fk_Pedido_num_pedido Inteiro
);
 
ALTER TABLE Passagem ADD CONSTRAINT FK_Passagem_1
    FOREIGN KEY (fk_Pedido_num_pedido)
    REFERENCES Pedido (num_pedido)
    ON DELETE RESTRICT;