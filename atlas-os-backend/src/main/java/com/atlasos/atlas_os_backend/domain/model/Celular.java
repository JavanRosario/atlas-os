package com.atlasos.atlas_os_backend.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate; // OBRIGATÓRIO para a nova data

@Entity
@Data
@Table(name = "tb_dados_celular")
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_celular")
    private Long id;

    @Column(name = "nm_modelo", nullable = false)
    private String modelo;

    @Column(name = "nm_fabricante", nullable = false)
    private String fabricante;

    @Column(name = "dt_lancamento", nullable = false)
    private LocalDate dataLancamento;

    @Column(name = "qt_memoria_ram", nullable = false)
    private Integer memoriaRam;

    @Column(name = "qt_armazenamento", nullable = false)
    private Integer armazenamento;

    @Column(name = "qt_tamanho_bateria", nullable = false)
    private Integer tamanhoBateria;

    @Column(name = "qt_tamanho_tela", nullable = false)
    private Integer tamanhoTela;

    @Column(name = "nm_tecnologia_tela", nullable = false)
    private String tecnologiaTela;

    @Column(name = "nm_tecnologia_camera", nullable = false)
    private String tecnologiaCamera;

    @Column(name = "nm_tipo_conector_de_carga", nullable = false)
    private String conectorDeCarga;

    @Column(name = "nm_tensao_de_carga", nullable = false)
    private String tensaoDeCarga;

    @Column(name = "nm_processador", nullable = false)
    private String processador;

    @Column(name = "qt_cameras_traseiras", nullable = false)
    private Integer totalCamerasTraseiras;

    @Column(name = "qt_camera_frontal_mp", nullable = false)
    private Integer totalMpCameraFrontal;

    @Column(name = "bo_carregamento_sem_fio", nullable = false)
    private Boolean temCarregamentoSemFio;

    @Column(name = "bo_tecnologia_5g", nullable = false)
    private Boolean tem5g;
}
