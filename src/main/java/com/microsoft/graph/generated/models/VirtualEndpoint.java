package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEndpoint extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VirtualEndpoint} and sets the default values.
     */
    public VirtualEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEndpoint}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEndpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEndpoint();
    }
    /**
     * Gets the auditEvents property value. The auditEvents property
     * @return a {@link java.util.List<CloudPcAuditEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcAuditEvent> getAuditEvents() {
        return this.backingStore.get("auditEvents");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(CloudPcAuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningPolicies", (n) -> { this.setProvisioningPolicies(n.getCollectionOfObjectValues(CloudPcProvisioningPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("userSettings", (n) -> { this.setUserSettings(n.getCollectionOfObjectValues(CloudPcUserSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the provisioningPolicies property value. The provisioningPolicies property
     * @return a {@link java.util.List<CloudPcProvisioningPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicy> getProvisioningPolicies() {
        return this.backingStore.get("provisioningPolicies");
    }
    /**
     * Gets the userSettings property value. The userSettings property
     * @return a {@link java.util.List<CloudPcUserSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserSetting> getUserSettings() {
        return this.backingStore.get("userSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("provisioningPolicies", this.getProvisioningPolicies());
        writer.writeCollectionOfObjectValues("userSettings", this.getUserSettings());
    }
    /**
     * Sets the auditEvents property value. The auditEvents property
     * @param value Value to set for the auditEvents property.
     */
    public void setAuditEvents(@jakarta.annotation.Nullable final java.util.List<CloudPcAuditEvent> value) {
        this.backingStore.set("auditEvents", value);
    }
    /**
     * Sets the provisioningPolicies property value. The provisioningPolicies property
     * @param value Value to set for the provisioningPolicies property.
     */
    public void setProvisioningPolicies(@jakarta.annotation.Nullable final java.util.List<CloudPcProvisioningPolicy> value) {
        this.backingStore.set("provisioningPolicies", value);
    }
    /**
     * Sets the userSettings property value. The userSettings property
     * @param value Value to set for the userSettings property.
     */
    public void setUserSettings(@jakarta.annotation.Nullable final java.util.List<CloudPcUserSetting> value) {
        this.backingStore.set("userSettings", value);
    }
}
