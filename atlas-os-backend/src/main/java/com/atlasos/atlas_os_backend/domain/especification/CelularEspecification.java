package com.atlasos.atlas_os_backend.domain.especification;

import org.springframework.data.jpa.domain.Specification;

import javax.swing.text.html.HTMLDocument;

public class CelularEspecification {

    public static <T> Specification<T> filtrarPorFabricante(String fabricante){
        return ((root, query, criteriaBuilder) -> {
            if (fabricante == null)
        })
    }
}
