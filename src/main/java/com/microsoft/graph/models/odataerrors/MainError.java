package com.microsoft.graph.models.odataerrors;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MainError implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The code property */
    private String _code;
    /** The details property */
    private java.util.List<ErrorDetails> _details;
    /** The innererror property */
    private InnerError _innererror;
    /** The message property */
    private String _message;
    /** The target property */
    private String _target;
    /**
     * Instantiates a new MainError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MainError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MainError
     */
    @javax.annotation.Nonnull
    public static MainError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MainError();
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
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
    }
    /**
     * Gets the details property value. The details property
     * @return a ErrorDetails
     */
    @javax.annotation.Nullable
    public java.util.List<ErrorDetails> getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(ErrorDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("innererror", (n) -> { this.setInnererror(n.getObjectValue(InnerError::createFromDiscriminatorValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the innererror property value. The innererror property
     * @return a InnerError
     */
    @javax.annotation.Nullable
    public InnerError getInnererror() {
        return this._innererror;
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the target property value. The target property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTarget() {
        return this._target;
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
        writer.writeObjectValue("innererror", this.getInnererror());
        writer.writeStringValue("message", this.getMessage());
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
        this._additionalData = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final java.util.List<ErrorDetails> value) {
        this._details = value;
    }
    /**
     * Sets the innererror property value. The innererror property
     * @param value Value to set for the innererror property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInnererror(@javax.annotation.Nullable final InnerError value) {
        this._innererror = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the target property value. The target property
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final String value) {
        this._target = value;
    }
}
