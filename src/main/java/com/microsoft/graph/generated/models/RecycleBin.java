package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecycleBin extends BaseItem implements Parsable {
    /**
     * Instantiates a new {@link RecycleBin} and sets the default values.
     */
    public RecycleBin() {
        super();
        this.setOdataType("#microsoft.graph.recycleBin");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecycleBin}
     */
    @jakarta.annotation.Nonnull
    public static RecycleBin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecycleBin();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(RecycleBinItem::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(RecycleBinSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. List of the recycleBinItems deleted by a user.
     * @return a {@link java.util.List<RecycleBinItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecycleBinItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link RecycleBinSettings}
     */
    @jakarta.annotation.Nullable
    public RecycleBinSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the items property value. List of the recycleBinItems deleted by a user.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<RecycleBinItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final RecycleBinSettings value) {
        this.backingStore.set("settings", value);
    }
}
