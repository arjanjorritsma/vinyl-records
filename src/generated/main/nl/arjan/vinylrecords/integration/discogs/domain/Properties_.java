
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
    "per_page",
    "items",
    "page",
    "urls",
    "pages"
})
public class Properties_ {

    @JsonProperty("per_page")
    private PerPage perPage;
    @JsonProperty("items")
    private Items items;
    @JsonProperty("page")
    private Page page;
    @JsonProperty("urls")
    private Urls urls;
    @JsonProperty("pages")
    private Pages pages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The perPage
     */
    @JsonProperty("per_page")
    public PerPage getPerPage() {
        return perPage;
    }

    /**
     * 
     * @param perPage
     *     The per_page
     */
    @JsonProperty("per_page")
    public void setPerPage(PerPage perPage) {
        this.perPage = perPage;
    }

    /**
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    public Items getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    public void setItems(Items items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("page")
    public Page getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("page")
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The urls
     */
    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    /**
     * 
     * @param urls
     *     The urls
     */
    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    /**
     * 
     * @return
     *     The pages
     */
    @JsonProperty("pages")
    public Pages getPages() {
        return pages;
    }

    /**
     * 
     * @param pages
     *     The pages
     */
    @JsonProperty("pages")
    public void setPages(Pages pages) {
        this.pages = pages;
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
        return new HashCodeBuilder().append(perPage).append(items).append(page).append(urls).append(pages).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties_) == false) {
            return false;
        }
        Properties_ rhs = ((Properties_) other);
        return new EqualsBuilder().append(perPage, rhs.perPage).append(items, rhs.items).append(page, rhs.page).append(urls, rhs.urls).append(pages, rhs.pages).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
