package com.atlasos.atlas_os_backend.domain.exception;

public class CelularNaoEncontradoException extends RuntimeException {

    public CelularNaoEncontradoException(String msg) {
        super(msg);
    }

    public CelularNaoEncontradoException(Long cidadeId) {
        this("Não existe um cadastro de Celular com o código: %d".formatted(cidadeId));
    }
}
