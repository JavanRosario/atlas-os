package domain.repository;

import domain.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelularRepository extends JpaRepository<Long, Celular> {
}
