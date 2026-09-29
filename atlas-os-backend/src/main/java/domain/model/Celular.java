package domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_celular")
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_celular")
    private Long id;

    @Column(name = "nm_modelo")
    private String modelo;

    @Column(name = "nm_fabricante")
    private String fabricante;

    @Column(name = "qt_memoria_ram")
    private Integer memoriaRam;

    @Column(name = "qt_armazenamento")
    private Integer armazenamento;

    @Column(name = "qt_tamanho_bateria")
    private Integer tamanhoBateria;

    @Column(name = "qt_tamanho_tela")
    private Integer tamanhoTela;

    @Column(name = "nm_tecnologia_tela")
    private String tecnologiaTela;

    @Column(name = "nm_tecnologia_camera")
    private String tecnologiaCamera;

    @Column(name = "nm_tipo_conector_de_carga")
    private String conectorDeCarga;

    @Column(name = "nm_processador")
    private String processador;

    @Column(name = "qt_cameras_traseiras")
    private Integer totalCamerasTraseiras;

    @Column(name = "qt_camera_frontal_mp")
    private Integer totalMpCameraFrontal;

    @Column(name = "bo_carregamento_sem_fio")
    private Boolean temCarregamentoSemFio;

    @Column(name = "bo_tecnologia_5g")
    private Boolean tem5g;


}
