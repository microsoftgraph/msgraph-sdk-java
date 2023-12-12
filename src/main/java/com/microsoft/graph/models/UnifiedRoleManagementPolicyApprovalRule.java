package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyApprovalRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /**
     * Instantiates a new UnifiedRoleManagementPolicyApprovalRule and sets the default values.
     */
    public UnifiedRoleManagementPolicyApprovalRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyApprovalRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyApprovalRule
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyApprovalRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyApprovalRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("setting", (n) -> { this.setSetting(n.getObjectValue(ApprovalSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the setting property value. The settings for approval of the role assignment.
     * @return a ApprovalSettings
     */
    @jakarta.annotation.Nullable
    public ApprovalSettings getSetting() {
        return this.backingStore.get("setting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("setting", this.getSetting());
    }
    /**
     * Sets the setting property value. The settings for approval of the role assignment.
     * @param value Value to set for the setting property.
     */
    public void setSetting(@jakarta.annotation.Nullable final ApprovalSettings value) {
        this.backingStore.set("setting", value);
    }
}
