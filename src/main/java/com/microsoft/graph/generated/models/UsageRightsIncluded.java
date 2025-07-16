package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageRightsIncluded extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UsageRightsIncluded} and sets the default values.
     */
    public UsageRightsIncluded() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UsageRightsIncluded}
     */
    @jakarta.annotation.Nonnull
    public static UsageRightsIncluded createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageRightsIncluded();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ownerEmail", (n) -> { this.setOwnerEmail(n.getStringValue()); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getEnumSetValue(UsageRights::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ownerEmail property value. The email of owner label rights.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerEmail() {
        return this.backingStore.get("ownerEmail");
    }
    /**
     * Gets the userEmail property value. The email of user with label user rights.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.backingStore.get("userEmail");
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link EnumSet<UsageRights>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<UsageRights> getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("ownerEmail", this.getOwnerEmail());
        writer.writeStringValue("userEmail", this.getUserEmail());
        writer.writeEnumSetValue("value", this.getValue());
    }
    /**
     * Sets the ownerEmail property value. The email of owner label rights.
     * @param value Value to set for the ownerEmail property.
     */
    public void setOwnerEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerEmail", value);
    }
    /**
     * Sets the userEmail property value. The email of user with label user rights.
     * @param value Value to set for the userEmail property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userEmail", value);
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final EnumSet<UsageRights> value) {
        this.backingStore.set("value", value);
    }
}
