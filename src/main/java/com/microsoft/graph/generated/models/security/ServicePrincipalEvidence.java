package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new ServicePrincipalEvidence and sets the default values.
     */
    public ServicePrincipalEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.servicePrincipalEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrincipalEvidence
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipalEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalEvidence();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the appOwnerTenantId property value. The appOwnerTenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppOwnerTenantId() {
        return this.backingStore.get("appOwnerTenantId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appOwnerTenantId", (n) -> { this.setAppOwnerTenantId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalName", (n) -> { this.setServicePrincipalName(n.getStringValue()); });
        deserializerMap.put("servicePrincipalObjectId", (n) -> { this.setServicePrincipalObjectId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalType", (n) -> { this.setServicePrincipalType(n.getEnumValue(ServicePrincipalType::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the servicePrincipalName property value. The servicePrincipalName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalName() {
        return this.backingStore.get("servicePrincipalName");
    }
    /**
     * Gets the servicePrincipalObjectId property value. The servicePrincipalObjectId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalObjectId() {
        return this.backingStore.get("servicePrincipalObjectId");
    }
    /**
     * Gets the servicePrincipalType property value. The servicePrincipalType property
     * @return a ServicePrincipalType
     */
    @jakarta.annotation.Nullable
    public ServicePrincipalType getServicePrincipalType() {
        return this.backingStore.get("servicePrincipalType");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("appOwnerTenantId", this.getAppOwnerTenantId());
        writer.writeStringValue("servicePrincipalName", this.getServicePrincipalName());
        writer.writeStringValue("servicePrincipalObjectId", this.getServicePrincipalObjectId());
        writer.writeEnumValue("servicePrincipalType", this.getServicePrincipalType());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the appOwnerTenantId property value. The appOwnerTenantId property
     * @param value Value to set for the appOwnerTenantId property.
     */
    public void setAppOwnerTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appOwnerTenantId", value);
    }
    /**
     * Sets the servicePrincipalName property value. The servicePrincipalName property
     * @param value Value to set for the servicePrincipalName property.
     */
    public void setServicePrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalName", value);
    }
    /**
     * Sets the servicePrincipalObjectId property value. The servicePrincipalObjectId property
     * @param value Value to set for the servicePrincipalObjectId property.
     */
    public void setServicePrincipalObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalObjectId", value);
    }
    /**
     * Sets the servicePrincipalType property value. The servicePrincipalType property
     * @param value Value to set for the servicePrincipalType property.
     */
    public void setServicePrincipalType(@jakarta.annotation.Nullable final ServicePrincipalType value) {
        this.backingStore.set("servicePrincipalType", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
