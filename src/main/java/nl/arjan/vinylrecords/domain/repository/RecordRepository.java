package nl.arjan.vinylrecords.domain.repository;

import nl.arjan.vinylrecords.domain.Record;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "record")
public interface RecordRepository extends JpaRepository<Record, Long> {

}
