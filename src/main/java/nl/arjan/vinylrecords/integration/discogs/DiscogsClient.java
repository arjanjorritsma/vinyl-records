package nl.arjan.vinylrecords.integration.discogs;

import java.util.List;

import nl.arjan.vinylrecords.domain.Record;
import nl.arjan.vinylrecords.integration.discogs.domain.Releases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DiscogsClient {
	@Value("${discogs.url.collection}")
	private String collectionUrl;

	@Autowired
	private RestTemplate restTemplate;

	public List<Record> getCollection() {

		Releases releases = restTemplate.getForEntity(collectionUrl,
				Releases.class).getBody();
		return null;
	}
}
