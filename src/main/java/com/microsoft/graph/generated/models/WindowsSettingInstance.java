package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsSettingInstance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsSettingInstance} and sets the default values.
     */
    public WindowsSettingInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsSettingInstance}
     */
    @jakarta.annotation.Nonnull
    public static WindowsSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsSettingInstance();
    }
    /**
     * Gets the createdDateTime property value. Set by the server. Represents the dateTime in UTC when the object was created on the server.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the expirationDateTime property value. Set by the server. The object expires at the specified dateTime in UTC, making it unavailable after that time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Set by the server if not provided in the request from the Windows client device. Refers to the user&apos;s Windows device that modified the object at the specified dateTime in UTC.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the payload property value. Base64-encoded JSON setting value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayload() {
        return this.backingStore.get("payload");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("payload", this.getPayload());
    }
    /**
     * Sets the createdDateTime property value. Set by the server. Represents the dateTime in UTC when the object was created on the server.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the expirationDateTime property value. Set by the server. The object expires at the specified dateTime in UTC, making it unavailable after that time.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Set by the server if not provided in the request from the Windows client device. Refers to the user&apos;s Windows device that modified the object at the specified dateTime in UTC.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the payload property value. Base64-encoded JSON setting value.
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payload", value);
    }
}
