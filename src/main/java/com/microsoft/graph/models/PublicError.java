package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PublicError implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Represents the error code. */
    private String code;
    /** Details of the error. */
    private java.util.List<PublicErrorDetail> details;
    /** Details of the inner error. */
    private PublicInnerError innerError;
    /** A non-localized message for the developer. */
    private String message;
    /** The OdataType property */
    private String odataType;
    /** The target of the error. */
    private String target;
    /**
     * Instantiates a new publicError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PublicError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a publicError
     */
    @javax.annotation.Nonnull
    public static PublicError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublicError();
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
     * Gets the code property value. Represents the error code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the details property value. Details of the error.
     * @return a publicErrorDetail
     */
    @javax.annotation.Nullable
    public java.util.List<PublicErrorDetail> getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(PublicErrorDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("innerError", (n) -> { this.setInnerError(n.getObjectValue(PublicInnerError::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the innerError property value. Details of the inner error.
     * @return a publicInnerError
     */
    @javax.annotation.Nullable
    public PublicInnerError getInnerError() {
        return this.innerError;
    }
    /**
     * Gets the message property value. A non-localized message for the developer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
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
     * Gets the target property value. The target of the error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTarget() {
        return this.target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeObjectValue("innerError", this.getInnerError());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("target", this.getTarget());
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
     * Sets the code property value. Represents the error code.
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the details property value. Details of the error.
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final java.util.List<PublicErrorDetail> value) {
        this.details = value;
    }
    /**
     * Sets the innerError property value. Details of the inner error.
     * @param value Value to set for the innerError property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInnerError(@javax.annotation.Nullable final PublicInnerError value) {
        this.innerError = value;
    }
    /**
     * Sets the message property value. A non-localized message for the developer.
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
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
     * Sets the target property value. The target of the error.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final String value) {
        this.target = value;
    }
}
