package com.atlasos.atlas_os_backend.domain.especification;

import com.atlasos.atlas_os_backend.domain.model.Celular;
import org.springframework.data.jpa.domain.Specification;

public class CelularEspecification {

    public static Specification<Celular> specification ()

    public static Specification<Celular> porFabricante(String fabricante) {
        return ((root, query, cb) -> {
            if (fabricante == null || fabricante.trim().isEmpty()) {
                return null;
            }
            return cb.like(cb.lower(root.get("fabricante")), "%" + fabricante.toLowerCase() + "%");
        });
    }
}
