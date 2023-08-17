package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyEnablementRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /**
     * The collection of rules that are enabled for this policy rule. For example, MultiFactorAuthentication, Ticketing, and Justification.
     */
    private java.util.List<String> enabledRules;
    /**
     * Instantiates a new unifiedRoleManagementPolicyEnablementRule and sets the default values.
     */
    public UnifiedRoleManagementPolicyEnablementRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyEnablementRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementPolicyEnablementRule
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyEnablementRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyEnablementRule();
    }
    /**
     * Gets the enabledRules property value. The collection of rules that are enabled for this policy rule. For example, MultiFactorAuthentication, Ticketing, and Justification.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnabledRules() {
        return this.enabledRules;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enabledRules", (n) -> { this.setEnabledRules(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("enabledRules", this.getEnabledRules());
    }
    /**
     * Sets the enabledRules property value. The collection of rules that are enabled for this policy rule. For example, MultiFactorAuthentication, Ticketing, and Justification.
     * @param value Value to set for the enabledRules property.
     */
    public void setEnabledRules(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.enabledRules = value;
    }
}
