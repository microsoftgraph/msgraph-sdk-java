package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomDataProvidedResourceFile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomDataProvidedResourceFile} and sets the default values.
     */
    public CustomDataProvidedResourceFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomDataProvidedResourceFile}
     */
    @jakarta.annotation.Nonnull
    public static CustomDataProvidedResourceFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomDataProvidedResourceFile();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("uploadedDateTime", (n) -> { this.setUploadedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name of the uploaded file, including the file extension. Required.  Supports $filter (eq, ne)  and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the size property value. Size of the file in bytes. Read-only.  Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the uploadedDateTime property value. Timestamp when the file was uploaded. Read-only.  Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadedDateTime() {
        return this.backingStore.get("uploadedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("size", this.getSize());
        writer.writeOffsetDateTimeValue("uploadedDateTime", this.getUploadedDateTime());
    }
    /**
     * Sets the name property value. Name of the uploaded file, including the file extension. Required.  Supports $filter (eq, ne)  and $orderby.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the size property value. Size of the file in bytes. Read-only.  Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the uploadedDateTime property value. Timestamp when the file was uploaded. Read-only.  Supports $filter (eq, ne, gt, ge, lt, le) and $orderby.
     * @param value Value to set for the uploadedDateTime property.
     */
    public void setUploadedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("uploadedDateTime", value);
    }
}
