
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
    "join",
    "name",
    "anv",
    "tracks",
    "role",
    "resource_url",
    "id"
})
public class Properties_______ {

    @JsonProperty("join")
    private Join join;
    @JsonProperty("name")
    private Name__ name;
    @JsonProperty("anv")
    private Anv anv;
    @JsonProperty("tracks")
    private Tracks tracks;
    @JsonProperty("role")
    private Role role;
    @JsonProperty("resource_url")
    private ResourceUrl_ resourceUrl;
    @JsonProperty("id")
    private Id_ id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The join
     */
    @JsonProperty("join")
    public Join getJoin() {
        return join;
    }

    /**
     * 
     * @param join
     *     The join
     */
    @JsonProperty("join")
    public void setJoin(Join join) {
        this.join = join;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public Name__ getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(Name__ name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The anv
     */
    @JsonProperty("anv")
    public Anv getAnv() {
        return anv;
    }

    /**
     * 
     * @param anv
     *     The anv
     */
    @JsonProperty("anv")
    public void setAnv(Anv anv) {
        this.anv = anv;
    }

    /**
     * 
     * @return
     *     The tracks
     */
    @JsonProperty("tracks")
    public Tracks getTracks() {
        return tracks;
    }

    /**
     * 
     * @param tracks
     *     The tracks
     */
    @JsonProperty("tracks")
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    /**
     * 
     * @return
     *     The role
     */
    @JsonProperty("role")
    public Role getRole() {
        return role;
    }

    /**
     * 
     * @param role
     *     The role
     */
    @JsonProperty("role")
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * 
     * @return
     *     The resourceUrl
     */
    @JsonProperty("resource_url")
    public ResourceUrl_ getResourceUrl() {
        return resourceUrl;
    }

    /**
     * 
     * @param resourceUrl
     *     The resource_url
     */
    @JsonProperty("resource_url")
    public void setResourceUrl(ResourceUrl_ resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Id_ getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Id_ id) {
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
        return new HashCodeBuilder().append(join).append(name).append(anv).append(tracks).append(role).append(resourceUrl).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties_______) == false) {
            return false;
        }
        Properties_______ rhs = ((Properties_______) other);
        return new EqualsBuilder().append(join, rhs.join).append(name, rhs.name).append(anv, rhs.anv).append(tracks, rhs.tracks).append(role, rhs.role).append(resourceUrl, rhs.resourceUrl).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
