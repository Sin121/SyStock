CREATE TABLE Endereco (
Cod_end int PRIMARY KEY AUTO_INCREMENT NOT NULL,
logradouro varchar(40) NOT NULL,
Bairro varchar(40) NOT NULL,
Cidade varchar(40) NOT NULL,
Numero int NOT NULL,
Estado varchar(40) NOT NULL
);

CREATE TABLE Login (
Cod_login int PRIMARY KEY AUTO_INCREMENT NOT NULL,
Usuario varchar(40) NOT NULL,
Senha varchar(40) NOT NULL
);

CREATE TABLE TIpo_equipamento (
Cod_tipo int PRIMARY KEY AUTO_INCREMENT NOT NULL,
Nome_tipo_equip  varchar(40) NOT NULL,
Descricao varchar(40) NOT NULL
);

CREATE TABLE Fabricante (
Cod_fabricante int PRIMARY KEY AUTO_INCREMENT NOT NULL,
Nome varchar(40) NOT NULL
);

CREATE TABLE Manutencao (
Cod_manut int PRIMARY KEY AUTO_INCREMENT NOT NULL,
Descricao_problema varchar(40) NOT NULL,
Data_m date NOT NULL,
Solucao varchar(40) NOT NULL
);

CREATE TABLE Executa (
Cod_func int,
Cod_manut int,
FOREIGN KEY(Cod_func) REFERENCES Funcionario_Departamento (Cod_func,Cod_departamento),
FOREIGN KEY(Cod_manut) REFERENCES Manutencao (Cod_manut)
);

CREATE TABLE Necessita (
Cod_manut int,
Cod_equip int,
FOREIGN KEY(Cod_manut) REFERENCES Manutencao (Cod_manut),
FOREIGN KEY(Cod_equip) REFERENCES Equipamento (Cod_equip)
);

CREATE TABLE Possui (
Cod_tipo int,
Cod_equip int,
FOREIGN KEY(Cod_tipo) REFERENCES TIpo_equipamento (Cod_tipo),
FOREIGN KEY(Cod_equip) REFERENCES Equipamento (Cod_equip)
);

CREATE TABLE Possuem (
Cod_fabricante int,
Cod_equip int,
FOREIGN KEY(Cod_fabricante) REFERENCES Fabricante (Cod_fabricante)
);

CREATE TABLE Funcionario_Departamento (
Cod_func int,
Nome_func varchar(40) NOT NULL,
Matricula int NOT NULL,
CPF int NOT NULL,
E-mail varchar(40),
Celular int,
Cargo varchar(40) NOT NULL,
Cod_end int,
Cod_departamento int,
Nome_departamento varchar(40) NOT NULL,
Chefe varchar(40) NOT NULL,
PRIMARY KEY(Cod_func,Cod_departamento),
FOREIGN KEY(Cod_end) REFERENCES Endereco (Cod_end)
);

CREATE TABLE Equipamento (
Cod_equip int PRIMARY KEY AUTO_INCREMENT,
Nome_equip varchar(40) NOT NULL,
Numero_patrimonio varchar(40) NOT NULL,
data_ultim_manut date,
Status varchar(40) NOT NULL,
Cod_func int,
Cod_departamento int,
FOREIGN KEY(Cod_departamento) REFERENCES Funcionario_Departamento (Cod_func,Cod_departamento)
);