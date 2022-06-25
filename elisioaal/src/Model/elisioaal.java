package cadastroeleitoral;

//  # Script para inicializar o banco de dados
//
//   create database if not exists elisioaal;
//
//   use elisioaal;
//
//   drop table if exists medico;
//   create table if not exists cadidato (
//	 idcandidato int primary key auto_increment,
//       nome varchar(255) not null,
//       partido int not null,
//       numero int not null,
//       cargo varchar(255) not null
//   );
//
//   drop table if exists eleitor;
//   create table if not exists eleitor (
//       ideleito int primary key auto_increment,
//       nome varchar(255) not null,
//       cpf varchar(255) not null,
//       titulo int not null
//   );
//
//   drop table if exists consulta;
//   create table if not exists consulta (
//       idconsulta int primary key auto_increment,
//       idcandidato int not null,
//       ideleitor int not null,
//       votos varchar(255) not null,
//
//       foreign key (idcandidato) references candidato(idcandidato) on delete cascade on update cascade,
//       foreign key (ideleitor) references eleitor(ideleitor) on delete cascade on update cascade
//   );