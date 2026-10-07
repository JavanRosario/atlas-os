package com.atlasos.atlas_os_backend.api.dto;

import java.time.LocalDate;

public record CelularDto(Long id, String modelo, String fabricante, LocalDate dataLancamento, Integer memoriaRam,
                         Integer armazenamento, Integer tamanhoTela, String tecnologiaTela, String tecnologiaCamera,
                         String conectorDeCarga, String tensaoDeCarga,
                         String processador, Integer totalCamerasTraseiras, Integer totalMpCameraFrontal,
                         Boolean temCarregamentoSemFio, Boolean tem5g) {
}
