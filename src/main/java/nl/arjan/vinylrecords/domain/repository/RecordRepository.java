package nl.arjan.vinylrecords.domain.repository;

import nl.arjan.vinylrecords.domain.Record;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
