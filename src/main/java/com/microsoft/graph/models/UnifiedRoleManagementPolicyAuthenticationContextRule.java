package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyAuthenticationContextRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /**
     * Instantiates a new UnifiedRoleManagementPolicyAuthenticationContextRule and sets the default values.
     */
    public UnifiedRoleManagementPolicyAuthenticationContextRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyAuthenticationContextRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyAuthenticationContextRule
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyAuthenticationContextRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyAuthenticationContextRule();
    }
    /**
     * Gets the claimValue property value. The value of the authentication context claim.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClaimValue() {
        return this.backingStore.get("claimValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("claimValue", (n) -> { this.setClaimValue(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Determines whether this rule is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("claimValue", this.getClaimValue());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
    }
    /**
     * Sets the claimValue property value. The value of the authentication context claim.
     * @param value Value to set for the claimValue property.
     */
    public void setClaimValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("claimValue", value);
    }
    /**
     * Sets the isEnabled property value. Determines whether this rule is enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
}
