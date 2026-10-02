package api.dto;

public record CelularDto(
        Long id,
        String modelo,
        String fabricante,
        Integer memoriaRam,
        Integer armazenamento,
        Integer tamanhoBateria,
        Integer tamanhoTela,
        String tecnologiaTela,
        String tecnologiaCamera,
        String conectorDeCarga,
        String processador,
        Integer totalCamerasTraseiras,
        Integer totalMpCameraFrontal,
        Boolean temCarregamentoSemFio,
        Boolean tem5g) {
}
