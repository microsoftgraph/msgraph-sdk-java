package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InboundOutboundPolicyConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines whether external users coming inbound are allowed.
     */
    private Boolean inboundAllowed;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Defines whether internal users are allowed to go outbound.
     */
    private Boolean outboundAllowed;
    /**
     * Instantiates a new inboundOutboundPolicyConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InboundOutboundPolicyConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a inboundOutboundPolicyConfiguration
     */
    @javax.annotation.Nonnull
    public static InboundOutboundPolicyConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InboundOutboundPolicyConfiguration();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("inboundAllowed", (n) -> { this.setInboundAllowed(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outboundAllowed", (n) -> { this.setOutboundAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundAllowed property value. Defines whether external users coming inbound are allowed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInboundAllowed() {
        return this.inboundAllowed;
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
     * Gets the outboundAllowed property value. Defines whether internal users are allowed to go outbound.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOutboundAllowed() {
        return this.outboundAllowed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("inboundAllowed", this.getInboundAllowed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("outboundAllowed", this.getOutboundAllowed());
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
     * Sets the inboundAllowed property value. Defines whether external users coming inbound are allowed.
     * @param value Value to set for the inboundAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInboundAllowed(@javax.annotation.Nullable final Boolean value) {
        this.inboundAllowed = value;
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
     * Sets the outboundAllowed property value. Defines whether internal users are allowed to go outbound.
     * @param value Value to set for the outboundAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutboundAllowed(@javax.annotation.Nullable final Boolean value) {
        this.outboundAllowed = value;
    }
}
