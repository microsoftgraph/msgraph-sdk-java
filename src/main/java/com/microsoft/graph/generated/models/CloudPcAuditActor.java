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
public class CloudPcAuditActor implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcAuditActor} and sets the default values.
     */
    public CloudPcAuditActor() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcAuditActor}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcAuditActor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAuditActor();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the applicationDisplayName property value. The applicationDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationDisplayName() {
        return this.backingStore.get("applicationDisplayName");
    }
    /**
     * Gets the applicationId property value. The applicationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.backingStore.get("applicationId");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("applicationDisplayName", (n) -> { this.setApplicationDisplayName(n.getStringValue()); });
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remoteTenantId", (n) -> { this.setRemoteTenantId(n.getStringValue()); });
        deserializerMap.put("remoteUserId", (n) -> { this.setRemoteUserId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalName", (n) -> { this.setServicePrincipalName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPermissions", (n) -> { this.setUserPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userRoleScopeTags", (n) -> { this.setUserRoleScopeTags(n.getCollectionOfObjectValues(CloudPcUserRoleScopeTagInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. The ipAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the remoteTenantId property value. The remoteTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteTenantId() {
        return this.backingStore.get("remoteTenantId");
    }
    /**
     * Gets the remoteUserId property value. The remoteUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteUserId() {
        return this.backingStore.get("remoteUserId");
    }
    /**
     * Gets the servicePrincipalName property value. The servicePrincipalName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalName() {
        return this.backingStore.get("servicePrincipalName");
    }
    /**
     * Gets the userId property value. The userId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPermissions property value. The userPermissions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserPermissions() {
        return this.backingStore.get("userPermissions");
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the userRoleScopeTags property value. The userRoleScopeTags property
     * @return a {@link java.util.List<CloudPcUserRoleScopeTagInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserRoleScopeTagInfo> getUserRoleScopeTags() {
        return this.backingStore.get("userRoleScopeTags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationDisplayName", this.getApplicationDisplayName());
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("remoteTenantId", this.getRemoteTenantId());
        writer.writeStringValue("remoteUserId", this.getRemoteUserId());
        writer.writeStringValue("servicePrincipalName", this.getServicePrincipalName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeCollectionOfPrimitiveValues("userPermissions", this.getUserPermissions());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeCollectionOfObjectValues("userRoleScopeTags", this.getUserRoleScopeTags());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the applicationDisplayName property value. The applicationDisplayName property
     * @param value Value to set for the applicationDisplayName property.
     */
    public void setApplicationDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationDisplayName", value);
    }
    /**
     * Sets the applicationId property value. The applicationId property
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationId", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the ipAddress property value. The ipAddress property
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the remoteTenantId property value. The remoteTenantId property
     * @param value Value to set for the remoteTenantId property.
     */
    public void setRemoteTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteTenantId", value);
    }
    /**
     * Sets the remoteUserId property value. The remoteUserId property
     * @param value Value to set for the remoteUserId property.
     */
    public void setRemoteUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteUserId", value);
    }
    /**
     * Sets the servicePrincipalName property value. The servicePrincipalName property
     * @param value Value to set for the servicePrincipalName property.
     */
    public void setServicePrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalName", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPermissions property value. The userPermissions property
     * @param value Value to set for the userPermissions property.
     */
    public void setUserPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("userPermissions", value);
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the userRoleScopeTags property value. The userRoleScopeTags property
     * @param value Value to set for the userRoleScopeTags property.
     */
    public void setUserRoleScopeTags(@jakarta.annotation.Nullable final java.util.List<CloudPcUserRoleScopeTagInfo> value) {
        this.backingStore.set("userRoleScopeTags", value);
    }
}
