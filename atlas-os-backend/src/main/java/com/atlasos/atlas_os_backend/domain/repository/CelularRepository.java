package com.atlasos.atlas_os_backend.domain.repository;

import com.atlasos.atlas_os_backend.domain.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CelularRepository extends JpaRepository<Celular, Long>, JpaSpecificationExecutor<Celular> {

    List<Celular> findByFabricanteOrderByDataLancamentoAsc(String fabricante);


}
