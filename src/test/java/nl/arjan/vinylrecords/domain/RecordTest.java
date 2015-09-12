package nl.arjan.vinylrecords.domain;

public class RecordTest {
	public static Record create() {
		Record record = new Record();
		record.setName("name");
		record.setYear(2010);

		return record;
	}
}
