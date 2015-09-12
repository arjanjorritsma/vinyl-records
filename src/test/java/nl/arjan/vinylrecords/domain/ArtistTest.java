package nl.arjan.vinylrecords.domain;

public class ArtistTest {

	public static Artist create() {
		Artist artist = new Artist();
		artist.setName("name");
		artist.addRecord(RecordTest.create());

		return artist;
	}

}
