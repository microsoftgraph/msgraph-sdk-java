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
public class BucketAggregationDefinition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new BucketAggregationDefinition and sets the default values.
     */
    public BucketAggregationDefinition() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BucketAggregationDefinition
     */
    @jakarta.annotation.Nonnull
    public static BucketAggregationDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BucketAggregationDefinition();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("isDescending", (n) -> { this.setIsDescending(n.getBooleanValue()); });
        deserializerMap.put("minimumCount", (n) -> { this.setMinimumCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("prefixFilter", (n) -> { this.setPrefixFilter(n.getStringValue()); });
        deserializerMap.put("ranges", (n) -> { this.setRanges(n.getCollectionOfObjectValues(BucketAggregationRange::createFromDiscriminatorValue)); });
        deserializerMap.put("sortBy", (n) -> { this.setSortBy(n.getEnumValue(BucketAggregationSortProperty.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isDescending property value. True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDescending() {
        return this.BackingStore.get("isDescending");
    }
    /**
     * Gets the minimumCount property value. The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumCount() {
        return this.BackingStore.get("minimumCount");
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
     * Gets the prefixFilter property value. A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrefixFilter() {
        return this.BackingStore.get("prefixFilter");
    }
    /**
     * Gets the ranges property value. Specifies the manual ranges to compute the aggregations. This is only valid for nonstring refiners of date or numeric type. Optional.
     * @return a java.util.List<BucketAggregationRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BucketAggregationRange> getRanges() {
        return this.BackingStore.get("ranges");
    }
    /**
     * Gets the sortBy property value. The sortBy property
     * @return a BucketAggregationSortProperty
     */
    @jakarta.annotation.Nullable
    public BucketAggregationSortProperty getSortBy() {
        return this.BackingStore.get("sortBy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isDescending", this.getIsDescending());
        writer.writeIntegerValue("minimumCount", this.getMinimumCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("prefixFilter", this.getPrefixFilter());
        writer.writeCollectionOfObjectValues("ranges", this.getRanges());
        writer.writeEnumValue("sortBy", this.getSortBy());
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
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the isDescending property value. True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     * @param value Value to set for the isDescending property.
     */
    public void setIsDescending(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isDescending", value);
    }
    /**
     * Sets the minimumCount property value. The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     * @param value Value to set for the minimumCount property.
     */
    public void setMinimumCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("minimumCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the prefixFilter property value. A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     * @param value Value to set for the prefixFilter property.
     */
    public void setPrefixFilter(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("prefixFilter", value);
    }
    /**
     * Sets the ranges property value. Specifies the manual ranges to compute the aggregations. This is only valid for nonstring refiners of date or numeric type. Optional.
     * @param value Value to set for the ranges property.
     */
    public void setRanges(@jakarta.annotation.Nullable final java.util.List<BucketAggregationRange> value) {
        this.BackingStore.set("ranges", value);
    }
    /**
     * Sets the sortBy property value. The sortBy property
     * @param value Value to set for the sortBy property.
     */
    public void setSortBy(@jakarta.annotation.Nullable final BucketAggregationSortProperty value) {
        this.BackingStore.set("sortBy", value);
    }
}
