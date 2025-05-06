package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotAdminLimitedMode extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotAdminLimitedMode} and sets the default values.
     */
    public CopilotAdminLimitedMode() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotAdminLimitedMode}
     */
    @jakarta.annotation.Nonnull
    public static CopilotAdminLimitedMode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotAdminLimitedMode();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("isEnabledForGroup", (n) -> { this.setIsEnabledForGroup(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the isEnabledForGroup property value. The isEnabledForGroup property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabledForGroup() {
        return this.backingStore.get("isEnabledForGroup");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeBooleanValue("isEnabledForGroup", this.getIsEnabledForGroup());
    }
    /**
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the isEnabledForGroup property value. The isEnabledForGroup property
     * @param value Value to set for the isEnabledForGroup property.
     */
    public void setIsEnabledForGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabledForGroup", value);
    }
}
