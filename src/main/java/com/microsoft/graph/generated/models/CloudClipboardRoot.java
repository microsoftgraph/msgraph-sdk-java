package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudClipboardRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudClipboardRoot} and sets the default values.
     */
    public CloudClipboardRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudClipboardRoot}
     */
    @jakarta.annotation.Nonnull
    public static CloudClipboardRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudClipboardRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(CloudClipboardItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. Represents a collection of Cloud Clipboard items.
     * @return a {@link java.util.List<CloudClipboardItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudClipboardItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("items", this.getItems());
    }
    /**
     * Sets the items property value. Represents a collection of Cloud Clipboard items.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<CloudClipboardItem> value) {
        this.backingStore.set("items", value);
    }
}
