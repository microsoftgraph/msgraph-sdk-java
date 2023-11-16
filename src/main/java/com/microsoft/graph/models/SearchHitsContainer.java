package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchHitsContainer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new SearchHitsContainer and sets the default values.
     */
    public SearchHitsContainer() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SearchHitsContainer
     */
    @jakarta.annotation.Nonnull
    public static SearchHitsContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchHitsContainer();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the aggregations property value. The aggregations property
     * @return a java.util.List<SearchAggregation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SearchAggregation> getAggregations() {
        return this.BackingStore.get("aggregations");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<SearchHit>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SearchHit> getHits() {
        return this.BackingStore.get("hits");
    }
    /**
     * Gets the moreResultsAvailable property value. Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMoreResultsAvailable() {
        return this.BackingStore.get("moreResultsAvailable");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the total property value. The total number of results. Note this isn't the number of results on the page, but the total number of results satisfying the query.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.BackingStore.get("total");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("aggregations", this.getAggregations());
        writer.writeCollectionOfObjectValues("hits", this.getHits());
        writer.writeBooleanValue("moreResultsAvailable", this.getMoreResultsAvailable());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the aggregations property value. The aggregations property
     * @param value Value to set for the aggregations property.
     */
    public void setAggregations(@jakarta.annotation.Nullable final java.util.List<SearchAggregation> value) {
        this.BackingStore.set("aggregations", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the hits property value. A collection of the search results.
     * @param value Value to set for the hits property.
     */
    public void setHits(@jakarta.annotation.Nullable final java.util.List<SearchHit> value) {
        this.BackingStore.set("hits", value);
    }
    /**
     * Sets the moreResultsAvailable property value. Provides information if more results are available. Based on this information, you can adjust the from and size properties of the searchRequest accordingly.
     * @param value Value to set for the moreResultsAvailable property.
     */
    public void setMoreResultsAvailable(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("moreResultsAvailable", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the total property value. The total number of results. Note this isn't the number of results on the page, but the total number of results satisfying the query.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("total", value);
    }
}
