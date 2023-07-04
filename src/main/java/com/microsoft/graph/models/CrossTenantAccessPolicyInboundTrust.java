package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyInboundTrust implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies whether compliant devices from external Azure AD organizations are trusted.
     */
    private Boolean isCompliantDeviceAccepted;
    /**
     * Specifies whether hybrid Azure AD joined devices from external Azure AD organizations are trusted.
     */
    private Boolean isHybridAzureADJoinedDeviceAccepted;
    /**
     * Specifies whether MFA from external Azure AD organizations is trusted.
     */
    private Boolean isMfaAccepted;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new crossTenantAccessPolicyInboundTrust and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyInboundTrust() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyInboundTrust
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyInboundTrust createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyInboundTrust();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isCompliantDeviceAccepted", (n) -> { this.setIsCompliantDeviceAccepted(n.getBooleanValue()); });
        deserializerMap.put("isHybridAzureADJoinedDeviceAccepted", (n) -> { this.setIsHybridAzureADJoinedDeviceAccepted(n.getBooleanValue()); });
        deserializerMap.put("isMfaAccepted", (n) -> { this.setIsMfaAccepted(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCompliantDeviceAccepted property value. Specifies whether compliant devices from external Azure AD organizations are trusted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCompliantDeviceAccepted() {
        return this.isCompliantDeviceAccepted;
    }
    /**
     * Gets the isHybridAzureADJoinedDeviceAccepted property value. Specifies whether hybrid Azure AD joined devices from external Azure AD organizations are trusted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHybridAzureADJoinedDeviceAccepted() {
        return this.isHybridAzureADJoinedDeviceAccepted;
    }
    /**
     * Gets the isMfaAccepted property value. Specifies whether MFA from external Azure AD organizations is trusted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaAccepted() {
        return this.isMfaAccepted;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isCompliantDeviceAccepted", this.getIsCompliantDeviceAccepted());
        writer.writeBooleanValue("isHybridAzureADJoinedDeviceAccepted", this.getIsHybridAzureADJoinedDeviceAccepted());
        writer.writeBooleanValue("isMfaAccepted", this.getIsMfaAccepted());
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
        this.additionalData = value;
    }
    /**
     * Sets the isCompliantDeviceAccepted property value. Specifies whether compliant devices from external Azure AD organizations are trusted.
     * @param value Value to set for the isCompliantDeviceAccepted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCompliantDeviceAccepted(@javax.annotation.Nullable final Boolean value) {
        this.isCompliantDeviceAccepted = value;
    }
    /**
     * Sets the isHybridAzureADJoinedDeviceAccepted property value. Specifies whether hybrid Azure AD joined devices from external Azure AD organizations are trusted.
     * @param value Value to set for the isHybridAzureADJoinedDeviceAccepted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHybridAzureADJoinedDeviceAccepted(@javax.annotation.Nullable final Boolean value) {
        this.isHybridAzureADJoinedDeviceAccepted = value;
    }
    /**
     * Sets the isMfaAccepted property value. Specifies whether MFA from external Azure AD organizations is trusted.
     * @param value Value to set for the isMfaAccepted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaAccepted(@javax.annotation.Nullable final Boolean value) {
        this.isMfaAccepted = value;
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
}
