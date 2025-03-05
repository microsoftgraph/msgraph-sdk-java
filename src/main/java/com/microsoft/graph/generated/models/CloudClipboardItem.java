package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudClipboardItem extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudClipboardItem} and sets the default values.
     */
    public CloudClipboardItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudClipboardItem}
     */
    @jakarta.annotation.Nonnull
    public static CloudClipboardItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudClipboardItem();
    }
    /**
     * Gets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the expirationDateTime property value. Set by the server. DateTime in UTC when the object expires and after that the object is no longer available. The default and also maximum TTL is 12 hours after the creation, but it might change for performance optimization.
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
        deserializerMap.put("payloads", (n) -> { this.setPayloads(n.getCollectionOfObjectValues(CloudClipboardItemPayload::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Set by the server if not provided in the client&apos;s request. DateTime in UTC when the object was modified by the client.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the payloads property value. A cloudClipboardItem can have multiple cloudClipboardItemPayload objects in the payloads. A window can place more than one clipboard object on the clipboard. Each one represents the same information in a different clipboard format.
     * @return a {@link java.util.List<CloudClipboardItemPayload>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudClipboardItemPayload> getPayloads() {
        return this.backingStore.get("payloads");
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
        writer.writeCollectionOfObjectValues("payloads", this.getPayloads());
    }
    /**
     * Sets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the expirationDateTime property value. Set by the server. DateTime in UTC when the object expires and after that the object is no longer available. The default and also maximum TTL is 12 hours after the creation, but it might change for performance optimization.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Set by the server if not provided in the client&apos;s request. DateTime in UTC when the object was modified by the client.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the payloads property value. A cloudClipboardItem can have multiple cloudClipboardItemPayload objects in the payloads. A window can place more than one clipboard object on the clipboard. Each one represents the same information in a different clipboard format.
     * @param value Value to set for the payloads property.
     */
    public void setPayloads(@jakarta.annotation.Nullable final java.util.List<CloudClipboardItemPayload> value) {
        this.backingStore.set("payloads", value);
    }
}
