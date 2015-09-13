
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
    "instance_id",
    "rating",
    "basic_information",
    "id"
})
public class Properties___ {

    @JsonProperty("instance_id")
    private InstanceId instanceId;
    @JsonProperty("rating")
    private Rating rating;
    @JsonProperty("basic_information")
    private BasicInformation basicInformation;
    @JsonProperty("id")
    private Id___ id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The instanceId
     */
    @JsonProperty("instance_id")
    public InstanceId getInstanceId() {
        return instanceId;
    }

    /**
     * 
     * @param instanceId
     *     The instance_id
     */
    @JsonProperty("instance_id")
    public void setInstanceId(InstanceId instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * 
     * @return
     *     The rating
     */
    @JsonProperty("rating")
    public Rating getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    @JsonProperty("rating")
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The basicInformation
     */
    @JsonProperty("basic_information")
    public BasicInformation getBasicInformation() {
        return basicInformation;
    }

    /**
     * 
     * @param basicInformation
     *     The basic_information
     */
    @JsonProperty("basic_information")
    public void setBasicInformation(BasicInformation basicInformation) {
        this.basicInformation = basicInformation;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Id___ getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Id___ id) {
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
        return new HashCodeBuilder().append(instanceId).append(rating).append(basicInformation).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties___) == false) {
            return false;
        }
        Properties___ rhs = ((Properties___) other);
        return new EqualsBuilder().append(instanceId, rhs.instanceId).append(rating, rhs.rating).append(basicInformation, rhs.basicInformation).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
