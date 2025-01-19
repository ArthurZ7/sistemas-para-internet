CREATE DATABASE db_musica;

-- Seleciona o banco de dados
USE db_musica;

-- Criação da tabela tb_usuario
CREATE TABLE tb_usuario (
    cod_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nom_usuario VARCHAR(255) NOT NULL,
    dt_nasc_usuario VARCHAR(15),
    end_usuario VARCHAR(255),
    email_usuario VARCHAR(255) UNIQUE,
    senha_usuario INT NOT NULL
);

-- Criação da tabela tb_musica
CREATE TABLE tb_musica (
    cod_musica INT AUTO_INCREMENT PRIMARY KEY,
    titulo_musica VARCHAR(255) NOT NULL,
    ano_lancamento_musica VARCHAR(4),
    duracao_musica INT
);

-- Criação da tabela tb_playlist
CREATE TABLE tb_playlist (
    cod_playlist INT AUTO_INCREMENT PRIMARY KEY,
    nom_playlist VARCHAR(255) NOT NULL,
    qnt_musica INT,
    cod_musica INT,
    cod_usuario INT,
    FOREIGN KEY (cod_musica) REFERENCES tb_musica(cod_musica),
    FOREIGN KEY (cod_usuario) REFERENCES tb_usuario(cod_usuario)
);