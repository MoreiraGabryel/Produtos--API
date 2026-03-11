create  table produto (
    id varchar(255) not null  primary key,
    nome varchar(50) not null,
    descricao varchar(600),
    preco numeric (18, 2)
);