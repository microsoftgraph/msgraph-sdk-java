package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomExtensionCalloutInstance implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identification of the custom extension that was triggered at this instance.
     */
    private String customExtensionId;
    /**
     * Details provided by the logic app during the callback of the request instance.
     */
    private String detail;
    /**
     * The unique run identifier for the logic app.
     */
    private String externalCorrelationId;
    /**
     * Unique identifier for the callout instance. Read-only.
     */
    private String id;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status of the request to the custom extension. The possible values are: calloutSent, callbackReceived, calloutFailed, callbackTimedOut, waitingForCallback, unknownFutureValue.
     */
    private CustomExtensionCalloutInstanceStatus status;
    /**
     * Instantiates a new customExtensionCalloutInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomExtensionCalloutInstance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customExtensionCalloutInstance
     */
    @javax.annotation.Nonnull
    public static CustomExtensionCalloutInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionCalloutInstance();
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
     * Gets the customExtensionId property value. Identification of the custom extension that was triggered at this instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomExtensionId() {
        return this.customExtensionId;
    }
    /**
     * Gets the detail property value. Details provided by the logic app during the callback of the request instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetail() {
        return this.detail;
    }
    /**
     * Gets the externalCorrelationId property value. The unique run identifier for the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalCorrelationId() {
        return this.externalCorrelationId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("customExtensionId", (n) -> { this.setCustomExtensionId(n.getStringValue()); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getStringValue()); });
        deserializerMap.put("externalCorrelationId", (n) -> { this.setExternalCorrelationId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CustomExtensionCalloutInstanceStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier for the callout instance. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the status property value. The status of the request to the custom extension. The possible values are: calloutSent, callbackReceived, calloutFailed, callbackTimedOut, waitingForCallback, unknownFutureValue.
     * @return a customExtensionCalloutInstanceStatus
     */
    @javax.annotation.Nullable
    public CustomExtensionCalloutInstanceStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customExtensionId", this.getCustomExtensionId());
        writer.writeStringValue("detail", this.getDetail());
        writer.writeStringValue("externalCorrelationId", this.getExternalCorrelationId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the customExtensionId property value. Identification of the custom extension that was triggered at this instance.
     * @param value Value to set for the customExtensionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtensionId(@javax.annotation.Nullable final String value) {
        this.customExtensionId = value;
    }
    /**
     * Sets the detail property value. Details provided by the logic app during the callback of the request instance.
     * @param value Value to set for the detail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetail(@javax.annotation.Nullable final String value) {
        this.detail = value;
    }
    /**
     * Sets the externalCorrelationId property value. The unique run identifier for the logic app.
     * @param value Value to set for the externalCorrelationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalCorrelationId(@javax.annotation.Nullable final String value) {
        this.externalCorrelationId = value;
    }
    /**
     * Sets the id property value. Unique identifier for the callout instance. Read-only.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
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
     * Sets the status property value. The status of the request to the custom extension. The possible values are: calloutSent, callbackReceived, calloutFailed, callbackTimedOut, waitingForCallback, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final CustomExtensionCalloutInstanceStatus value) {
        this.status = value;
    }
}
