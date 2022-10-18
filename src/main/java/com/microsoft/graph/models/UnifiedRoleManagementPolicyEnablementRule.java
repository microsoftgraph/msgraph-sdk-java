package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyEnablementRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /** The collection of rules that are enabled for this policy rule. For example, MultiFactorAuthentication, Ticketing, and Justification. */
    private java.util.List<String> _enabledRules;
    /**
     * Instantiates a new UnifiedRoleManagementPolicyEnablementRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementPolicyEnablementRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyEnablementRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyEnablementRule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyEnablementRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyEnablementRule();
    }
    /**
     * Gets the enabledRules property value. The collection of rules that are enabled for this policy rule. For example, MultiFactorAuthentication, Ticketing, and Justification.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnabledRules() {
        return this._enabledRules;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicyEnablementRule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("enabledRules", (n) -> { currentObject.setEnabledRules(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("enabledRules", this.getEnabledRules());
    }
    /**
     * Sets the enabledRules property value. The collection of rules that are enabled for this policy rule. For example, MultiFactorAuthentication, Ticketing, and Justification.
     * @param value Value to set for the enabledRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabledRules(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enabledRules = value;
    }
}
