package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiTenantOrganizationIdentitySyncPolicyTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MultiTenantOrganizationIdentitySyncPolicyTemplate} and sets the default values.
     */
    public MultiTenantOrganizationIdentitySyncPolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiTenantOrganizationIdentitySyncPolicyTemplate}
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationIdentitySyncPolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationIdentitySyncPolicyTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("templateApplicationLevel", (n) -> { this.setTemplateApplicationLevel(n.getEnumSetValue(TemplateApplicationLevel::forValue)); });
        deserializerMap.put("userSyncInbound", (n) -> { this.setUserSyncInbound(n.getObjectValue(CrossTenantUserSyncInbound::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the templateApplicationLevel property value. The templateApplicationLevel property
     * @return a {@link EnumSet<TemplateApplicationLevel>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<TemplateApplicationLevel> getTemplateApplicationLevel() {
        return this.backingStore.get("templateApplicationLevel");
    }
    /**
     * Gets the userSyncInbound property value. Defines whether users can be synchronized from the partner tenant.
     * @return a {@link CrossTenantUserSyncInbound}
     */
    @jakarta.annotation.Nullable
    public CrossTenantUserSyncInbound getUserSyncInbound() {
        return this.backingStore.get("userSyncInbound");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("templateApplicationLevel", this.getTemplateApplicationLevel());
        writer.writeObjectValue("userSyncInbound", this.getUserSyncInbound());
    }
    /**
     * Sets the templateApplicationLevel property value. The templateApplicationLevel property
     * @param value Value to set for the templateApplicationLevel property.
     */
    public void setTemplateApplicationLevel(@jakarta.annotation.Nullable final EnumSet<TemplateApplicationLevel> value) {
        this.backingStore.set("templateApplicationLevel", value);
    }
    /**
     * Sets the userSyncInbound property value. Defines whether users can be synchronized from the partner tenant.
     * @param value Value to set for the userSyncInbound property.
     */
    public void setUserSyncInbound(@jakarta.annotation.Nullable final CrossTenantUserSyncInbound value) {
        this.backingStore.set("userSyncInbound", value);
    }
}
