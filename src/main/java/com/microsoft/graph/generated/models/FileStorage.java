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
     * Gets the containers property value. The collection of active fileStorageContainer resources.
     * @return a {@link java.util.List<FileStorageContainer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainer> getContainers() {
        return this.backingStore.get("containers");
    }
    /**
     * Gets the containerTypeRegistrations property value. The collection of fileStorageContainerTypeRegistration resources.
     * @return a {@link java.util.List<FileStorageContainerTypeRegistration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainerTypeRegistration> getContainerTypeRegistrations() {
        return this.backingStore.get("containerTypeRegistrations");
    }
    /**
     * Gets the containerTypes property value. The collection of fileStorageContainerType resources.
     * @return a {@link java.util.List<FileStorageContainerType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainerType> getContainerTypes() {
        return this.backingStore.get("containerTypes");
    }
    /**
     * Gets the deletedContainers property value. The collection of deleted fileStorageContainer resources.
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
        deserializerMap.put("containerTypeRegistrations", (n) -> { this.setContainerTypeRegistrations(n.getCollectionOfObjectValues(FileStorageContainerTypeRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("containerTypes", (n) -> { this.setContainerTypes(n.getCollectionOfObjectValues(FileStorageContainerType::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("containerTypeRegistrations", this.getContainerTypeRegistrations());
        writer.writeCollectionOfObjectValues("containerTypes", this.getContainerTypes());
        writer.writeCollectionOfObjectValues("deletedContainers", this.getDeletedContainers());
    }
    /**
     * Sets the containers property value. The collection of active fileStorageContainer resources.
     * @param value Value to set for the containers property.
     */
    public void setContainers(@jakarta.annotation.Nullable final java.util.List<FileStorageContainer> value) {
        this.backingStore.set("containers", value);
    }
    /**
     * Sets the containerTypeRegistrations property value. The collection of fileStorageContainerTypeRegistration resources.
     * @param value Value to set for the containerTypeRegistrations property.
     */
    public void setContainerTypeRegistrations(@jakarta.annotation.Nullable final java.util.List<FileStorageContainerTypeRegistration> value) {
        this.backingStore.set("containerTypeRegistrations", value);
    }
    /**
     * Sets the containerTypes property value. The collection of fileStorageContainerType resources.
     * @param value Value to set for the containerTypes property.
     */
    public void setContainerTypes(@jakarta.annotation.Nullable final java.util.List<FileStorageContainerType> value) {
        this.backingStore.set("containerTypes", value);
    }
    /**
     * Sets the deletedContainers property value. The collection of deleted fileStorageContainer resources.
     * @param value Value to set for the deletedContainers property.
     */
    public void setDeletedContainers(@jakarta.annotation.Nullable final java.util.List<FileStorageContainer> value) {
        this.backingStore.set("deletedContainers", value);
    }
}
