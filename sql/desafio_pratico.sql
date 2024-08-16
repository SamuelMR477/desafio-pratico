create DATABASE desafio_pratico{
    create table aluno{
        id int primary key not null auto_increment,
        nome varchar(50) not null,
        idade int(3) not null,
        nota_primeiro_semestre float(3) not null,
        nota_segundo_semestre float(3) not null,
        nome_professor varchar(50) not null,
        numero_sala int(3) not null
    }
}