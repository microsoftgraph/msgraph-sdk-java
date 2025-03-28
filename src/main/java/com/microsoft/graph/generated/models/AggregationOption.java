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
public class AggregationOption implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AggregationOption} and sets the default values.
     */
    public AggregationOption() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AggregationOption}
     */
    @jakarta.annotation.Nonnull
    public static AggregationOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AggregationOption();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the bucketDefinition property value. The bucketDefinition property
     * @return a {@link BucketAggregationDefinition}
     */
    @jakarta.annotation.Nullable
    public BucketAggregationDefinition getBucketDefinition() {
        return this.backingStore.get("bucketDefinition");
    }
    /**
     * Gets the field property value. Computes aggregation on the field while the field exists in the current entity type. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getField() {
        return this.backingStore.get("field");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("bucketDefinition", (n) -> { this.setBucketDefinition(n.getObjectValue(BucketAggregationDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("field", (n) -> { this.setField(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the size property value. The number of searchBucket resources to be returned. This isn&apos;t required when the range is provided manually in the search request. The minimum accepted size is 1, and the maximum is 65535. Optional.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bucketDefinition", this.getBucketDefinition());
        writer.writeStringValue("field", this.getField());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the bucketDefinition property value. The bucketDefinition property
     * @param value Value to set for the bucketDefinition property.
     */
    public void setBucketDefinition(@jakarta.annotation.Nullable final BucketAggregationDefinition value) {
        this.backingStore.set("bucketDefinition", value);
    }
    /**
     * Sets the field property value. Computes aggregation on the field while the field exists in the current entity type. Required.
     * @param value Value to set for the field property.
     */
    public void setField(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("field", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the size property value. The number of searchBucket resources to be returned. This isn&apos;t required when the range is provided manually in the search request. The minimum accepted size is 1, and the maximum is 65535. Optional.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("size", value);
    }
}
