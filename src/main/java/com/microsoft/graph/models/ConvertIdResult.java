package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConvertIdResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** An error object indicating the reason for the conversion failure. This value is not present if the conversion succeeded. */
    private GenericError _errorDetails;
    /** The OdataType property */
    private String _odataType;
    /** The identifier that was converted. This value is the original, un-converted identifier. */
    private String _sourceId;
    /** The converted identifier. This value is not present if the conversion failed. */
    private String _targetId;
    /**
     * Instantiates a new convertIdResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConvertIdResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.convertIdResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a convertIdResult
     */
    @javax.annotation.Nonnull
    public static ConvertIdResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConvertIdResult();
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
     * Gets the errorDetails property value. An error object indicating the reason for the conversion failure. This value is not present if the conversion succeeded.
     * @return a genericError
     */
    @javax.annotation.Nullable
    public GenericError getErrorDetails() {
        return this._errorDetails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConvertIdResult currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("errorDetails", (n) -> { currentObject.setErrorDetails(n.getObjectValue(GenericError::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
        deserializerMap.put("targetId", (n) -> { currentObject.setTargetId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the sourceId property value. The identifier that was converted. This value is the original, un-converted identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the targetId property value. The converted identifier. This value is not present if the conversion failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetId() {
        return this._targetId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("errorDetails", this.getErrorDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("targetId", this.getTargetId());
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
     * Sets the errorDetails property value. An error object indicating the reason for the conversion failure. This value is not present if the conversion succeeded.
     * @param value Value to set for the errorDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDetails(@javax.annotation.Nullable final GenericError value) {
        this._errorDetails = value;
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
     * Sets the sourceId property value. The identifier that was converted. This value is the original, un-converted identifier.
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the targetId property value. The converted identifier. This value is not present if the conversion failed.
     * @param value Value to set for the targetId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetId(@javax.annotation.Nullable final String value) {
        this._targetId = value;
    }
}
