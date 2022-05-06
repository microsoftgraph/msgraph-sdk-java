package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchHitsContainer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Contains the collection of aggregations computed based on the provided aggregationOption specified in the request.  */
    private java.util.List<SearchAggregation> _aggregations;
    /** A collection of the search results.  */
    private java.util.List<SearchHit> _hits;
    /** Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.  */
    private Boolean _moreResultsAvailable;
    /** The total number of results. Note this is not the number of results on the page, but the total number of results satisfying the query.  */
    private Integer _total;
    /**
     * Instantiates a new searchHitsContainer and sets the default values.
     * @return a void
     */
    public SearchHitsContainer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchHitsContainer
     */
    @javax.annotation.Nonnull
    public static SearchHitsContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchHitsContainer();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the aggregations property value. Contains the collection of aggregations computed based on the provided aggregationOption specified in the request.
     * @return a searchAggregation
     */
    @javax.annotation.Nullable
    public java.util.List<SearchAggregation> getAggregations() {
        return this._aggregations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchHitsContainer currentObject = this;
        return new HashMap<>(4) {{
            this.put("aggregations", (n) -> { currentObject.setAggregations(n.getCollectionOfObjectValues(SearchAggregation::createFromDiscriminatorValue)); });
            this.put("hits", (n) -> { currentObject.setHits(n.getCollectionOfObjectValues(SearchHit::createFromDiscriminatorValue)); });
            this.put("moreResultsAvailable", (n) -> { currentObject.setMoreResultsAvailable(n.getBooleanValue()); });
            this.put("total", (n) -> { currentObject.setTotal(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the hits property value. A collection of the search results.
     * @return a searchHit
     */
    @javax.annotation.Nullable
    public java.util.List<SearchHit> getHits() {
        return this._hits;
    }
    /**
     * Gets the moreResultsAvailable property value. Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMoreResultsAvailable() {
        return this._moreResultsAvailable;
    }
    /**
     * Gets the total property value. The total number of results. Note this is not the number of results on the page, but the total number of results satisfying the query.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotal() {
        return this._total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("aggregations", this.getAggregations());
        writer.writeCollectionOfObjectValues("hits", this.getHits());
        writer.writeBooleanValue("moreResultsAvailable", this.getMoreResultsAvailable());
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the aggregations property value. Contains the collection of aggregations computed based on the provided aggregationOption specified in the request.
     * @param value Value to set for the aggregations property.
     * @return a void
     */
    public void setAggregations(@javax.annotation.Nullable final java.util.List<SearchAggregation> value) {
        this._aggregations = value;
    }
    /**
     * Sets the hits property value. A collection of the search results.
     * @param value Value to set for the hits property.
     * @return a void
     */
    public void setHits(@javax.annotation.Nullable final java.util.List<SearchHit> value) {
        this._hits = value;
    }
    /**
     * Sets the moreResultsAvailable property value. Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.
     * @param value Value to set for the moreResultsAvailable property.
     * @return a void
     */
    public void setMoreResultsAvailable(@javax.annotation.Nullable final Boolean value) {
        this._moreResultsAvailable = value;
    }
    /**
     * Sets the total property value. The total number of results. Note this is not the number of results on the page, but the total number of results satisfying the query.
     * @param value Value to set for the total property.
     * @return a void
     */
    public void setTotal(@javax.annotation.Nullable final Integer value) {
        this._total = value;
    }
}
