package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantDataSecurityAndGovernance extends DataSecurityAndGovernance implements Parsable {
    /**
     * Instantiates a new {@link TenantDataSecurityAndGovernance} and sets the default values.
     */
    public TenantDataSecurityAndGovernance() {
        super();
        this.setOdataType("#microsoft.graph.tenantDataSecurityAndGovernance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantDataSecurityAndGovernance}
     */
    @jakarta.annotation.Nonnull
    public static TenantDataSecurityAndGovernance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantDataSecurityAndGovernance();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("protectionScopes", (n) -> { this.setProtectionScopes(n.getObjectValue(TenantProtectionScopeContainer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the protectionScopes property value. The protectionScopes property
     * @return a {@link TenantProtectionScopeContainer}
     */
    @jakarta.annotation.Nullable
    public TenantProtectionScopeContainer getProtectionScopes() {
        return this.backingStore.get("protectionScopes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("protectionScopes", this.getProtectionScopes());
    }
    /**
     * Sets the protectionScopes property value. The protectionScopes property
     * @param value Value to set for the protectionScopes property.
     */
    public void setProtectionScopes(@jakarta.annotation.Nullable final TenantProtectionScopeContainer value) {
        this.backingStore.set("protectionScopes", value);
    }
}
