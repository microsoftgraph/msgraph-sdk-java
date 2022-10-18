package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AggregationOption implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The bucketDefinition property */
    private BucketAggregationDefinition _bucketDefinition;
    /** Computes aggregation on the field while the field exists in current entity type. Required. */
    private String _field;
    /** The OdataType property */
    private String _odataType;
    /** The number of searchBucket resources to be returned. This is not required when the range is provided manually in the search request. Optional. */
    private Integer _size;
    /**
     * Instantiates a new aggregationOption and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AggregationOption() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.aggregationOption");
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
        return this._additionalData;
    }
    /**
     * Gets the bucketDefinition property value. The bucketDefinition property
     * @return a bucketAggregationDefinition
     */
    @javax.annotation.Nullable
    public BucketAggregationDefinition getBucketDefinition() {
        return this._bucketDefinition;
    }
    /**
     * Gets the field property value. Computes aggregation on the field while the field exists in current entity type. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getField() {
        return this._field;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AggregationOption currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("bucketDefinition", (n) -> { currentObject.setBucketDefinition(n.getObjectValue(BucketAggregationDefinition::createFromDiscriminatorValue)); });
            this.put("field", (n) -> { currentObject.setField(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the size property value. The number of searchBucket resources to be returned. This is not required when the range is provided manually in the search request. Optional.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this._size;
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bucketDefinition property value. The bucketDefinition property
     * @param value Value to set for the bucketDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBucketDefinition(@javax.annotation.Nullable final BucketAggregationDefinition value) {
        this._bucketDefinition = value;
    }
    /**
     * Sets the field property value. Computes aggregation on the field while the field exists in current entity type. Required.
     * @param value Value to set for the field property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setField(@javax.annotation.Nullable final String value) {
        this._field = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the size property value. The number of searchBucket resources to be returned. This is not required when the range is provided manually in the search request. Optional.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this._size = value;
    }
}
