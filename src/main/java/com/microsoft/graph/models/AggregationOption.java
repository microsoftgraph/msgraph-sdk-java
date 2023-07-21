package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AggregationOption implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bucketDefinition property
     */
    private BucketAggregationDefinition bucketDefinition;
    /**
     * Computes aggregation on the field while the field exists in current entity type. Required.
     */
    private String field;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The number of searchBucket resources to be returned. This is not required when the range is provided manually in the search request. Optional.
     */
    private Integer size;
    /**
     * Instantiates a new aggregationOption and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AggregationOption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a aggregationOption
     */
    @javax.annotation.Nonnull
    public static AggregationOption createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AggregationOption();
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
     * Gets the bucketDefinition property value. The bucketDefinition property
     * @return a bucketAggregationDefinition
     */
    @javax.annotation.Nullable
    public BucketAggregationDefinition getBucketDefinition() {
        return this.bucketDefinition;
    }
    /**
     * Gets the field property value. Computes aggregation on the field while the field exists in current entity type. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getField() {
        return this.field;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the size property value. The number of searchBucket resources to be returned. This is not required when the range is provided manually in the search request. Optional.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bucketDefinition", this.getBucketDefinition());
        writer.writeStringValue("field", this.getField());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bucketDefinition property value. The bucketDefinition property
     * @param value Value to set for the bucketDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBucketDefinition(@javax.annotation.Nullable final BucketAggregationDefinition value) {
        this.bucketDefinition = value;
    }
    /**
     * Sets the field property value. Computes aggregation on the field while the field exists in current entity type. Required.
     * @param value Value to set for the field property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setField(@javax.annotation.Nullable final String value) {
        this.field = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the size property value. The number of searchBucket resources to be returned. This is not required when the range is provided manually in the search request. Optional.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this.size = value;
    }
}
