package com.atlasos.atlas_os_backend.api.especification;

import com.atlasos.atlas_os_backend.api.dto.CelularFiltro;
import com.atlasos.atlas_os_backend.domain.model.Celular;
import org.springframework.data.jpa.domain.Specification;

public class CelularSpecification {

    public static Specification<Celular> specification(CelularFiltro celularFiltro) {
        return Specification.where(porFabricante(celularFiltro.fabricante()));
    }

    private static Specification<Celular> porFabricante(String fabricante) {
        return ((root, query, cb) -> {
            if (fabricante == null || fabricante.trim().isEmpty()) {
                return null;
            }
            return cb.like(cb.lower(root.get("fabricante")), "%" + fabricante.toLowerCase() + "%");
        });
    }
}
