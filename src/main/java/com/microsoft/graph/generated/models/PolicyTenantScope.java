package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyTenantScope extends PolicyScopeBase implements Parsable {
    /**
     * Instantiates a new {@link PolicyTenantScope} and sets the default values.
     */
    public PolicyTenantScope() {
        super();
        this.setOdataType("#microsoft.graph.policyTenantScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyTenantScope}
     */
    @jakarta.annotation.Nonnull
    public static PolicyTenantScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyTenantScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyScope", (n) -> { this.setPolicyScope(n.getObjectValue(PolicyBinding::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policyScope property value. Specifies the users and groups included in or excluded from this tenant-level policy scope.
     * @return a {@link PolicyBinding}
     */
    @jakarta.annotation.Nullable
    public PolicyBinding getPolicyScope() {
        return this.backingStore.get("policyScope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("policyScope", this.getPolicyScope());
    }
    /**
     * Sets the policyScope property value. Specifies the users and groups included in or excluded from this tenant-level policy scope.
     * @param value Value to set for the policyScope property.
     */
    public void setPolicyScope(@jakarta.annotation.Nullable final PolicyBinding value) {
        this.backingStore.set("policyScope", value);
    }
}
