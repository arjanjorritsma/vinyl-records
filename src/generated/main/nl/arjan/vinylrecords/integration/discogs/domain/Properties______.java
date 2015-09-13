
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
    "descriptions",
    "name",
    "qty"
})
public class Properties______ {

    @JsonProperty("descriptions")
    private Descriptions descriptions;
    @JsonProperty("name")
    private Name_ name;
    @JsonProperty("qty")
    private Qty qty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The descriptions
     */
    @JsonProperty("descriptions")
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * 
     * @param descriptions
     *     The descriptions
     */
    @JsonProperty("descriptions")
    public void setDescriptions(Descriptions descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public Name_ getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(Name_ name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The qty
     */
    @JsonProperty("qty")
    public Qty getQty() {
        return qty;
    }

    /**
     * 
     * @param qty
     *     The qty
     */
    @JsonProperty("qty")
    public void setQty(Qty qty) {
        this.qty = qty;
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
        return new HashCodeBuilder().append(descriptions).append(name).append(qty).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties______) == false) {
            return false;
        }
        Properties______ rhs = ((Properties______) other);
        return new EqualsBuilder().append(descriptions, rhs.descriptions).append(name, rhs.name).append(qty, rhs.qty).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
