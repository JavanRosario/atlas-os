package com.atlasos.atlas_os_backend.domain.repository;

import com.atlasos.atlas_os_backend.domain.model.Celular;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelularRepository extends JpaRepository<Celular, Long> {

    Page<Celular> findByFabricanteOrderByDataLancamentoAsc(Pageable pageable);
}
