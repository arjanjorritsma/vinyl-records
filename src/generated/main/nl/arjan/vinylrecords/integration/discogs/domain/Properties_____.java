
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
    "id",
    "resource_url",
    "catno",
    "name",
    "entity_type"
})
public class Properties_____ {

    @JsonProperty("id")
    private Id id;
    @JsonProperty("resource_url")
    private ResourceUrl resourceUrl;
    @JsonProperty("catno")
    private Catno catno;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("entity_type")
    private EntityType entityType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The resourceUrl
     */
    @JsonProperty("resource_url")
    public ResourceUrl getResourceUrl() {
        return resourceUrl;
    }

    /**
     * 
     * @param resourceUrl
     *     The resource_url
     */
    @JsonProperty("resource_url")
    public void setResourceUrl(ResourceUrl resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    /**
     * 
     * @return
     *     The catno
     */
    @JsonProperty("catno")
    public Catno getCatno() {
        return catno;
    }

    /**
     * 
     * @param catno
     *     The catno
     */
    @JsonProperty("catno")
    public void setCatno(Catno catno) {
        this.catno = catno;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The entityType
     */
    @JsonProperty("entity_type")
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * 
     * @param entityType
     *     The entity_type
     */
    @JsonProperty("entity_type")
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
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
        return new HashCodeBuilder().append(id).append(resourceUrl).append(catno).append(name).append(entityType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties_____) == false) {
            return false;
        }
        Properties_____ rhs = ((Properties_____) other);
        return new EqualsBuilder().append(id, rhs.id).append(resourceUrl, rhs.resourceUrl).append(catno, rhs.catno).append(name, rhs.name).append(entityType, rhs.entityType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
