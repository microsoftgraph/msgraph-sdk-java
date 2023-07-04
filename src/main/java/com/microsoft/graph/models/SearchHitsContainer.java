package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchHitsContainer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The aggregations property
     */
    private java.util.List<SearchAggregation> aggregations;
    /**
     * A collection of the search results.
     */
    private java.util.List<SearchHit> hits;
    /**
     * Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.
     */
    private Boolean moreResultsAvailable;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The total number of results. Note this is not the number of results on the page, but the total number of results satisfying the query.
     */
    private Integer total;
    /**
     * Instantiates a new SearchHitsContainer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SearchHitsContainer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SearchHitsContainer
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
        return this.additionalData;
    }
    /**
     * Gets the aggregations property value. The aggregations property
     * @return a searchAggregation
     */
    @javax.annotation.Nullable
    public java.util.List<SearchAggregation> getAggregations() {
        return this.aggregations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("aggregations", (n) -> { this.setAggregations(n.getCollectionOfObjectValues(SearchAggregation::createFromDiscriminatorValue)); });
        deserializerMap.put("hits", (n) -> { this.setHits(n.getCollectionOfObjectValues(SearchHit::createFromDiscriminatorValue)); });
        deserializerMap.put("moreResultsAvailable", (n) -> { this.setMoreResultsAvailable(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hits property value. A collection of the search results.
     * @return a searchHit
     */
    @javax.annotation.Nullable
    public java.util.List<SearchHit> getHits() {
        return this.hits;
    }
    /**
     * Gets the moreResultsAvailable property value. Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMoreResultsAvailable() {
        return this.moreResultsAvailable;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the total property value. The total number of results. Note this is not the number of results on the page, but the total number of results satisfying the query.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("aggregations", this.getAggregations());
        writer.writeCollectionOfObjectValues("hits", this.getHits());
        writer.writeBooleanValue("moreResultsAvailable", this.getMoreResultsAvailable());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the aggregations property value. The aggregations property
     * @param value Value to set for the aggregations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAggregations(@javax.annotation.Nullable final java.util.List<SearchAggregation> value) {
        this.aggregations = value;
    }
    /**
     * Sets the hits property value. A collection of the search results.
     * @param value Value to set for the hits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHits(@javax.annotation.Nullable final java.util.List<SearchHit> value) {
        this.hits = value;
    }
    /**
     * Sets the moreResultsAvailable property value. Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.
     * @param value Value to set for the moreResultsAvailable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMoreResultsAvailable(@javax.annotation.Nullable final Boolean value) {
        this.moreResultsAvailable = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the total property value. The total number of results. Note this is not the number of results on the page, but the total number of results satisfying the query.
     * @param value Value to set for the total property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotal(@javax.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
