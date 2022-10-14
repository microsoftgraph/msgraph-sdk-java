package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchAggregation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The buckets property */
    private java.util.List<SearchBucket> _buckets;
    /** The field property */
    private String _field;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new searchAggregation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SearchAggregation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.searchAggregation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchAggregation
     */
    @javax.annotation.Nonnull
    public static SearchAggregation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchAggregation();
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
     * Gets the buckets property value. The buckets property
     * @return a searchBucket
     */
    @javax.annotation.Nullable
    public java.util.List<SearchBucket> getBuckets() {
        return this._buckets;
    }
    /**
     * Gets the field property value. The field property
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
        final SearchAggregation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("buckets", (n) -> { currentObject.setBuckets(n.getCollectionOfObjectValues(SearchBucket::createFromDiscriminatorValue)); });
            this.put("field", (n) -> { currentObject.setField(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeStringValue("field", this.getField());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the buckets property value. The buckets property
     * @param value Value to set for the buckets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuckets(@javax.annotation.Nullable final java.util.List<SearchBucket> value) {
        this._buckets = value;
    }
    /**
     * Sets the field property value. The field property
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
}
