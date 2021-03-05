package guru.springframework.repositories;

import guru.springframework.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitiOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription (String description);
}
