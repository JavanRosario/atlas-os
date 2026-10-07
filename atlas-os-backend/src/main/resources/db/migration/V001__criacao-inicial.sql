create table tb_dados_celular
(
    cd_celular                bigint generated always as identity primary key,
    nm_modelo                 varchar(255) not null,
    nm_fabricante             varchar(255) not null,
    dt_lancamento             date         not null,
    qt_memoria_ram            int          not null,
    qt_armazenamento          int          not null,
    qt_tamanho_bateria        int          not null,
    qt_tamanho_tela           int          not null,
    nm_tecnologia_tela        varchar(255) not null,
    nm_tecnologia_camera      varchar(255) not null,
    nm_tipo_conector_de_carga varchar(255) not null,
    nm_tensao_de_carga        varchar(255) not null,
    nm_processador            varchar(255) not null,
    qt_cameras_traseiras      int          not null,
    qt_camera_frontal_mp      int          not null,
    bo_carregamento_sem_fio   boolean      not null,
    bo_tecnologia_5g          boolean      not null

);