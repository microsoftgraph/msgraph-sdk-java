package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantGovernanceSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantGovernanceSetting} and sets the default values.
     */
    public TenantGovernanceSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantGovernanceSetting}
     */
    @jakarta.annotation.Nonnull
    public static TenantGovernanceSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantGovernanceSetting();
    }
    /**
     * Gets the canReceiveInvitations property value. The canReceiveInvitations property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanReceiveInvitations() {
        return this.backingStore.get("canReceiveInvitations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("canReceiveInvitations", (n) -> { this.setCanReceiveInvitations(n.getBooleanValue()); });
        deserializerMap.put("isRelatedTenantsEnabled", (n) -> { this.setIsRelatedTenantsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRelatedTenantsEnabled property value. The isRelatedTenantsEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRelatedTenantsEnabled() {
        return this.backingStore.get("isRelatedTenantsEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("canReceiveInvitations", this.getCanReceiveInvitations());
        writer.writeBooleanValue("isRelatedTenantsEnabled", this.getIsRelatedTenantsEnabled());
    }
    /**
     * Sets the canReceiveInvitations property value. The canReceiveInvitations property
     * @param value Value to set for the canReceiveInvitations property.
     */
    public void setCanReceiveInvitations(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("canReceiveInvitations", value);
    }
    /**
     * Sets the isRelatedTenantsEnabled property value. The isRelatedTenantsEnabled property
     * @param value Value to set for the isRelatedTenantsEnabled property.
     */
    public void setIsRelatedTenantsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRelatedTenantsEnabled", value);
    }
}
