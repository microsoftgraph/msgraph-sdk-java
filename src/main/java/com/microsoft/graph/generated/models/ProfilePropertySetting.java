package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProfilePropertySetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ProfilePropertySetting} and sets the default values.
     */
    public ProfilePropertySetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProfilePropertySetting}
     */
    @jakarta.annotation.Nonnull
    public static ProfilePropertySetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProfilePropertySetting();
    }
    /**
     * Gets the displayName property value. Name of the property-level setting.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("prioritizedSourceUrls", (n) -> { this.setPrioritizedSourceUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Other name of the property-level setting. For backward compatibility.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the prioritizedSourceUrls property value. A collection of prioritized profile source URLs ordered by data precedence within an organization.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPrioritizedSourceUrls() {
        return this.backingStore.get("prioritizedSourceUrls");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("prioritizedSourceUrls", this.getPrioritizedSourceUrls());
    }
    /**
     * Sets the displayName property value. Name of the property-level setting.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the name property value. Other name of the property-level setting. For backward compatibility.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the prioritizedSourceUrls property value. A collection of prioritized profile source URLs ordered by data precedence within an organization.
     * @param value Value to set for the prioritizedSourceUrls property.
     */
    public void setPrioritizedSourceUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("prioritizedSourceUrls", value);
    }
}
