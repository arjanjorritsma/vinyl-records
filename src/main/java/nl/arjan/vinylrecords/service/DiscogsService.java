package nl.arjan.vinylrecords.service;

import java.util.List;

import nl.arjan.vinylrecords.domain.Record;
import nl.arjan.vinylrecords.domain.repository.RecordRepository;
import nl.arjan.vinylrecords.integration.discogs.DiscogsClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscogsService {

	@Autowired
	private RecordRepository recordRepository;

	@Autowired
	private DiscogsClient discogsClient;

	public void updateCollection() {
		List<Record> updatedRecords = discogsClient.getCollection();

		for (Record updatedRecord : updatedRecords) {
			updateRecord(updatedRecord);
		}

	}

	private void updateRecord(Record updatedRecord) {
		Record foundRecord = recordRepository.findOne(updatedRecord.getId());

		if (foundRecord != null) {
			foundRecord.update(updatedRecord);
			recordRepository.save(foundRecord);
		} else {
			recordRepository.save(updatedRecord);
		}

	}
}
