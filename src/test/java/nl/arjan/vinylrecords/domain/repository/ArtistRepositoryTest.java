package nl.arjan.vinylrecords.domain.repository;

import static org.junit.Assert.assertEquals;
import nl.arjan.vinylrecords.config.TestConfiguration;
import nl.arjan.vinylrecords.domain.Artist;
import nl.arjan.vinylrecords.domain.ArtistTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@TestConfiguration
public class ArtistRepositoryTest {

	@Autowired
	private ArtistRepository artistRepository;

	@Test
	public void testFindOne() {
		Artist artist = ArtistTest.create();
		artistRepository.save(artist);

		Artist result = artistRepository.findOne(artist.getId());

		assertEquals(artist.getId(), result.getId());
	}

}
