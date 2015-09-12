package nl.arjan.vinylrecords.domain.repository;

import nl.arjan.vinylrecords.domain.Artist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
