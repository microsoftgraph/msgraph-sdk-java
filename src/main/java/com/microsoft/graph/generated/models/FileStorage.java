package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileStorage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link FileStorage} and sets the default values.
     */
    public FileStorage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileStorage}
     */
    @jakarta.annotation.Nonnull
    public static FileStorage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileStorage();
    }
    /**
     * Gets the containers property value. The containers property
     * @return a {@link java.util.List<FileStorageContainer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainer> getContainers() {
        return this.backingStore.get("containers");
    }
    /**
     * Gets the deletedContainers property value. The deletedContainers property
     * @return a {@link java.util.List<FileStorageContainer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainer> getDeletedContainers() {
        return this.backingStore.get("deletedContainers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containers", (n) -> { this.setContainers(n.getCollectionOfObjectValues(FileStorageContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedContainers", (n) -> { this.setDeletedContainers(n.getCollectionOfObjectValues(FileStorageContainer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("containers", this.getContainers());
        writer.writeCollectionOfObjectValues("deletedContainers", this.getDeletedContainers());
    }
    /**
     * Sets the containers property value. The containers property
     * @param value Value to set for the containers property.
     */
    public void setContainers(@jakarta.annotation.Nullable final java.util.List<FileStorageContainer> value) {
        this.backingStore.set("containers", value);
    }
    /**
     * Sets the deletedContainers property value. The deletedContainers property
     * @param value Value to set for the deletedContainers property.
     */
    public void setDeletedContainers(@jakarta.annotation.Nullable final java.util.List<FileStorageContainer> value) {
        this.backingStore.set("deletedContainers", value);
    }
}
