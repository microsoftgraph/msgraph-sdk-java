package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantAppManagementPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new TenantAppManagementPolicy and sets the default values.
     */
    public TenantAppManagementPolicy() {
        super();
        this.setOdataType("#microsoft.graph.tenantAppManagementPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TenantAppManagementPolicy
     */
    @jakarta.annotation.Nonnull
    public static TenantAppManagementPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantAppManagementPolicy();
    }
    /**
     * Gets the applicationRestrictions property value. Restrictions that apply as default to all application objects in the tenant.
     * @return a AppManagementConfiguration
     */
    @jakarta.annotation.Nullable
    public AppManagementConfiguration getApplicationRestrictions() {
        return this.backingStore.get("applicationRestrictions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationRestrictions", (n) -> { this.setApplicationRestrictions(n.getObjectValue(AppManagementConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("servicePrincipalRestrictions", (n) -> { this.setServicePrincipalRestrictions(n.getObjectValue(AppManagementConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Denotes whether the policy is enabled. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the servicePrincipalRestrictions property value. Restrictions that apply as default to all service principal objects in the tenant.
     * @return a AppManagementConfiguration
     */
    @jakarta.annotation.Nullable
    public AppManagementConfiguration getServicePrincipalRestrictions() {
        return this.backingStore.get("servicePrincipalRestrictions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicationRestrictions", this.getApplicationRestrictions());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("servicePrincipalRestrictions", this.getServicePrincipalRestrictions());
    }
    /**
     * Sets the applicationRestrictions property value. Restrictions that apply as default to all application objects in the tenant.
     * @param value Value to set for the applicationRestrictions property.
     */
    public void setApplicationRestrictions(@jakarta.annotation.Nullable final AppManagementConfiguration value) {
        this.backingStore.set("applicationRestrictions", value);
    }
    /**
     * Sets the isEnabled property value. Denotes whether the policy is enabled. Default value is false.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the servicePrincipalRestrictions property value. Restrictions that apply as default to all service principal objects in the tenant.
     * @param value Value to set for the servicePrincipalRestrictions property.
     */
    public void setServicePrincipalRestrictions(@jakarta.annotation.Nullable final AppManagementConfiguration value) {
        this.backingStore.set("servicePrincipalRestrictions", value);
    }
}
