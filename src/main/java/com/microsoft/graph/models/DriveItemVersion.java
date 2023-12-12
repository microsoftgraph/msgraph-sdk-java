package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveItemVersion extends BaseItemVersion implements Parsable {
    /**
     * Instantiates a new DriveItemVersion and sets the default values.
     */
    public DriveItemVersion() {
        super();
        this.setOdataType("#microsoft.graph.driveItemVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DriveItemVersion
     */
    @jakarta.annotation.Nonnull
    public static DriveItemVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItemVersion();
    }
    /**
     * Gets the content property value. The content stream for this version of the item.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the size property value. Indicates the size of the content stream for this version of the item.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeLongValue("size", this.getSize());
    }
    /**
     * Sets the content property value. The content stream for this version of the item.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the size property value. Indicates the size of the content stream for this version of the item.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
}
