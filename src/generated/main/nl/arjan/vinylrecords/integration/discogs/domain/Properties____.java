
package nl.arjan.vinylrecords.integration.discogs.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "labels",
    "formats",
    "thumb",
    "title",
    "artists",
    "resource_url",
    "year",
    "id"
})
public class Properties____ {

    @JsonProperty("labels")
    private Labels labels;
    @JsonProperty("formats")
    private Formats formats;
    @JsonProperty("thumb")
    private Thumb thumb;
    @JsonProperty("title")
    private Title title;
    @JsonProperty("artists")
    private Artists artists;
    @JsonProperty("resource_url")
    private ResourceUrl__ resourceUrl;
    @JsonProperty("year")
    private Year year;
    @JsonProperty("id")
    private Id__ id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public Labels getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The formats
     */
    @JsonProperty("formats")
    public Formats getFormats() {
        return formats;
    }

    /**
     * 
     * @param formats
     *     The formats
     */
    @JsonProperty("formats")
    public void setFormats(Formats formats) {
        this.formats = formats;
    }

    /**
     * 
     * @return
     *     The thumb
     */
    @JsonProperty("thumb")
    public Thumb getThumb() {
        return thumb;
    }

    /**
     * 
     * @param thumb
     *     The thumb
     */
    @JsonProperty("thumb")
    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The artists
     */
    @JsonProperty("artists")
    public Artists getArtists() {
        return artists;
    }

    /**
     * 
     * @param artists
     *     The artists
     */
    @JsonProperty("artists")
    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    /**
     * 
     * @return
     *     The resourceUrl
     */
    @JsonProperty("resource_url")
    public ResourceUrl__ getResourceUrl() {
        return resourceUrl;
    }

    /**
     * 
     * @param resourceUrl
     *     The resource_url
     */
    @JsonProperty("resource_url")
    public void setResourceUrl(ResourceUrl__ resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    /**
     * 
     * @return
     *     The year
     */
    @JsonProperty("year")
    public Year getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    @JsonProperty("year")
    public void setYear(Year year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Id__ getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Id__ id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(labels).append(formats).append(thumb).append(title).append(artists).append(resourceUrl).append(year).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties____) == false) {
            return false;
        }
        Properties____ rhs = ((Properties____) other);
        return new EqualsBuilder().append(labels, rhs.labels).append(formats, rhs.formats).append(thumb, rhs.thumb).append(title, rhs.title).append(artists, rhs.artists).append(resourceUrl, rhs.resourceUrl).append(year, rhs.year).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
