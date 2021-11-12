/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     11/11/2021 11:08:18 p. m.                    */
/*==============================================================*/


drop table if exists EXAMEN;

drop table if exists LISTAUSUARIOSREUNION;

drop table if exists MARCASDETIEMPO;

drop table if exists REUNION;

drop table if exists USUARIO;

drop table if exists VIDEO;

/*==============================================================*/
/* Table: EXAMEN                                                */
/*==============================================================*/
create table EXAMEN
(
   IDEXAMEN             int not null auto_increment,
   IDUSUARIOCREADOR     int,
   IDUSUARIODOCENTE     int,
   FECHA                date,
   HORA                 time,
   DESCRIPCION          varchar(255),
   VERSION              int,
   primary key (IDEXAMEN)
);

/*==============================================================*/
/* Table: LISTAUSUARIOSREUNION                                  */
/*==============================================================*/
create table LISTAUSUARIOSREUNION
(
   ID_REUNION           int not null,
   IDUSUARIO            int not null,
   FECHA                date not null,
   HORA                 time not null,
   ESTADO               varchar(55),
   primary key (ID_REUNION, IDUSUARIO, FECHA, HORA)
);

/*==============================================================*/
/* Table: MARCASDETIEMPO                                        */
/*==============================================================*/
create table MARCASDETIEMPO
(
   IDMARCATIEMPO        int not null auto_increment,
   IDVIDEO              int,
   HORAVIDEO            int,
   MINUTOVIDEO          int,
   SEGUNDOVIDEO         int,
   DESCRIPCION          varchar(25),
   primary key (IDMARCATIEMPO)
);

/*==============================================================*/
/* Table: REUNION                                               */
/*==============================================================*/
create table REUNION
(
   ID_REUNION           int not null auto_increment,
   IDUSUARIOCREADOR     int not null,
   ESTADO               varchar(55),
   primary key (ID_REUNION)
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   IDUSUARIO            int not null auto_increment,
   NOMBREREALUSUARIO    varchar(255),
   APELLIDOREALUSUARIO  varchar(255),
   NOMBREUSUARIO        varchar(255),
   CONTRASENIA          varchar(255),
   ROL                  varchar(50),
   primary key (IDUSUARIO)
);

/*==============================================================*/
/* Table: VIDEO                                                 */
/*==============================================================*/
create table VIDEO
(
   IDVIDEO              int not null auto_increment,
   ID_REUNION           int,
   FECHACREACION        date,
   HORACREACION         time,
   primary key (IDVIDEO)
);

alter table EXAMEN add constraint FK_RELATIONSHIP_5 foreign key (IDUSUARIOCREADOR)
      references USUARIO (IDUSUARIO) on delete restrict on update restrict;

alter table EXAMEN add constraint FK_RELATIONSHIP_6 foreign key (IDUSUARIODOCENTE)
      references USUARIO (IDUSUARIO) on delete restrict on update restrict;

alter table LISTAUSUARIOSREUNION add constraint FK_RELATIONSHIP_3 foreign key (ID_REUNION)
      references REUNION (ID_REUNION) on delete restrict on update restrict;

alter table LISTAUSUARIOSREUNION add constraint FK_RELATIONSHIP_4 foreign key (IDUSUARIO)
      references USUARIO (IDUSUARIO) on delete restrict on update restrict;

alter table MARCASDETIEMPO add constraint FK_RELATIONSHIP_8 foreign key (IDVIDEO)
      references VIDEO (IDVIDEO) on delete restrict on update restrict;

alter table REUNION add constraint FK_RELATIONSHIP_2 foreign key (IDUSUARIOCREADOR)
      references USUARIO (IDUSUARIO) on delete restrict on update restrict;

alter table VIDEO add constraint FK_RELATIONSHIP_7 foreign key (ID_REUNION)
      references REUNION (ID_REUNION) on delete restrict on update restrict;

