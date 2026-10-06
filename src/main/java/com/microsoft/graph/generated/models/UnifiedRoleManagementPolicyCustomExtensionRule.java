package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyCustomExtensionRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoleManagementPolicyCustomExtensionRule} and sets the default values.
     */
    public UnifiedRoleManagementPolicyCustomExtensionRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyCustomExtensionRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleManagementPolicyCustomExtensionRule}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyCustomExtensionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyCustomExtensionRule();
    }
    /**
     * Gets the customAttributes property value. The customAttributes property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCustomAttributes() {
        return this.backingStore.get("customAttributes");
    }
    /**
     * Gets the customExtensionId property value. The customExtensionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomExtensionId() {
        return this.backingStore.get("customExtensionId");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customAttributes", (n) -> { this.setCustomAttributes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("customExtensionId", (n) -> { this.setCustomExtensionId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a {@link Boolean}
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
        writer.writeCollectionOfPrimitiveValues("customAttributes", this.getCustomAttributes());
        writer.writeStringValue("customExtensionId", this.getCustomExtensionId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
    }
    /**
     * Sets the customAttributes property value. The customAttributes property
     * @param value Value to set for the customAttributes property.
     */
    public void setCustomAttributes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("customAttributes", value);
    }
    /**
     * Sets the customExtensionId property value. The customExtensionId property
     * @param value Value to set for the customExtensionId property.
     */
    public void setCustomExtensionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customExtensionId", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
}
