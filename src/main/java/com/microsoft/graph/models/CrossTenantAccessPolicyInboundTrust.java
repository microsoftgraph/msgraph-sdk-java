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
public class CrossTenantAccessPolicyInboundTrust implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new CrossTenantAccessPolicyInboundTrust and sets the default values.
     */
    public CrossTenantAccessPolicyInboundTrust() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantAccessPolicyInboundTrust
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessPolicyInboundTrust createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyInboundTrust();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isCompliantDeviceAccepted", (n) -> { this.setIsCompliantDeviceAccepted(n.getBooleanValue()); });
        deserializerMap.put("isHybridAzureADJoinedDeviceAccepted", (n) -> { this.setIsHybridAzureADJoinedDeviceAccepted(n.getBooleanValue()); });
        deserializerMap.put("isMfaAccepted", (n) -> { this.setIsMfaAccepted(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCompliantDeviceAccepted property value. Specifies whether compliant devices from external Microsoft Entra organizations are trusted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCompliantDeviceAccepted() {
        return this.BackingStore.get("isCompliantDeviceAccepted");
    }
    /**
     * Gets the isHybridAzureADJoinedDeviceAccepted property value. Specifies whether Microsoft Entra hybrid joined devices from external Microsoft Entra organizations are trusted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHybridAzureADJoinedDeviceAccepted() {
        return this.BackingStore.get("isHybridAzureADJoinedDeviceAccepted");
    }
    /**
     * Gets the isMfaAccepted property value. Specifies whether MFA from external Microsoft Entra organizations is trusted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMfaAccepted() {
        return this.BackingStore.get("isMfaAccepted");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isCompliantDeviceAccepted", this.getIsCompliantDeviceAccepted());
        writer.writeBooleanValue("isHybridAzureADJoinedDeviceAccepted", this.getIsHybridAzureADJoinedDeviceAccepted());
        writer.writeBooleanValue("isMfaAccepted", this.getIsMfaAccepted());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the isCompliantDeviceAccepted property value. Specifies whether compliant devices from external Microsoft Entra organizations are trusted.
     * @param value Value to set for the isCompliantDeviceAccepted property.
     */
    public void setIsCompliantDeviceAccepted(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isCompliantDeviceAccepted", value);
    }
    /**
     * Sets the isHybridAzureADJoinedDeviceAccepted property value. Specifies whether Microsoft Entra hybrid joined devices from external Microsoft Entra organizations are trusted.
     * @param value Value to set for the isHybridAzureADJoinedDeviceAccepted property.
     */
    public void setIsHybridAzureADJoinedDeviceAccepted(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isHybridAzureADJoinedDeviceAccepted", value);
    }
    /**
     * Sets the isMfaAccepted property value. Specifies whether MFA from external Microsoft Entra organizations is trusted.
     * @param value Value to set for the isMfaAccepted property.
     */
    public void setIsMfaAccepted(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isMfaAccepted", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
