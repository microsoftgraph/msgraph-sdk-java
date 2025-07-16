package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PolicyTemplate} and sets the default values.
     */
    public PolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyTemplate}
     */
    @jakarta.annotation.Nonnull
    public static PolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("multiTenantOrganizationIdentitySynchronization", (n) -> { this.setMultiTenantOrganizationIdentitySynchronization(n.getObjectValue(MultiTenantOrganizationIdentitySyncPolicyTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("multiTenantOrganizationPartnerConfiguration", (n) -> { this.setMultiTenantOrganizationPartnerConfiguration(n.getObjectValue(MultiTenantOrganizationPartnerConfigurationTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the multiTenantOrganizationIdentitySynchronization property value. Defines an optional cross-tenant access policy template with user synchronization settings for a multitenant organization.
     * @return a {@link MultiTenantOrganizationIdentitySyncPolicyTemplate}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationIdentitySyncPolicyTemplate getMultiTenantOrganizationIdentitySynchronization() {
        return this.backingStore.get("multiTenantOrganizationIdentitySynchronization");
    }
    /**
     * Gets the multiTenantOrganizationPartnerConfiguration property value. Defines an optional cross-tenant access policy template with inbound and outbound partner configuration settings for a multitenant organization.
     * @return a {@link MultiTenantOrganizationPartnerConfigurationTemplate}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationPartnerConfigurationTemplate getMultiTenantOrganizationPartnerConfiguration() {
        return this.backingStore.get("multiTenantOrganizationPartnerConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("multiTenantOrganizationIdentitySynchronization", this.getMultiTenantOrganizationIdentitySynchronization());
        writer.writeObjectValue("multiTenantOrganizationPartnerConfiguration", this.getMultiTenantOrganizationPartnerConfiguration());
    }
    /**
     * Sets the multiTenantOrganizationIdentitySynchronization property value. Defines an optional cross-tenant access policy template with user synchronization settings for a multitenant organization.
     * @param value Value to set for the multiTenantOrganizationIdentitySynchronization property.
     */
    public void setMultiTenantOrganizationIdentitySynchronization(@jakarta.annotation.Nullable final MultiTenantOrganizationIdentitySyncPolicyTemplate value) {
        this.backingStore.set("multiTenantOrganizationIdentitySynchronization", value);
    }
    /**
     * Sets the multiTenantOrganizationPartnerConfiguration property value. Defines an optional cross-tenant access policy template with inbound and outbound partner configuration settings for a multitenant organization.
     * @param value Value to set for the multiTenantOrganizationPartnerConfiguration property.
     */
    public void setMultiTenantOrganizationPartnerConfiguration(@jakarta.annotation.Nullable final MultiTenantOrganizationPartnerConfigurationTemplate value) {
        this.backingStore.set("multiTenantOrganizationPartnerConfiguration", value);
    }
}
