package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LinkedResource extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LinkedResource} and sets the default values.
     */
    public LinkedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LinkedResource}
     */
    @jakarta.annotation.Nonnull
    public static LinkedResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkedResource();
    }
    /**
     * Gets the applicationName property value. The app name of the source that sends the linkedResource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationName() {
        return this.backingStore.get("applicationName");
    }
    /**
     * Gets the displayName property value. The title of the linkedResource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. ID of the object that is associated with this task on the third-party/partner system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationName", (n) -> { this.setApplicationName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webUrl property value. Deep link to the linkedResource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the applicationName property value. The app name of the source that sends the linkedResource.
     * @param value Value to set for the applicationName property.
     */
    public void setApplicationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationName", value);
    }
    /**
     * Sets the displayName property value. The title of the linkedResource.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. ID of the object that is associated with this task on the third-party/partner system.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the webUrl property value. Deep link to the linkedResource.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
