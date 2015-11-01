package nl.arjan.vinylrecords.domain.repository;

import nl.arjan.vinylrecords.domain.Artist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "artist")
public interface ArtistRepository extends JpaRepository<Artist, Long> {
	public Artist findByName(String name);
}
