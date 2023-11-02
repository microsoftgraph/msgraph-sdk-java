package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new SynchronizationTemplate and sets the default values.
     */
    public SynchronizationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SynchronizationTemplate
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationTemplate();
    }
    /**
     * Gets the applicationId property value. Identifier of the application this template belongs to.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getApplicationId() {
        return this.getBackingStore().get("applicationId");
    }
    /**
     * Gets the default property value. true if this template is recommended to be the default for the application.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefault() {
        return this.getBackingStore().get("default");
    }
    /**
     * Gets the description property value. Description of the template.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.getBackingStore().get("description");
    }
    /**
     * Gets the discoverable property value. true if this template should appear in the collection of templates available for the application instance (service principal).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiscoverable() {
        return this.getBackingStore().get("discoverable");
    }
    /**
     * Gets the factoryTag property value. One of the well-known factory tags supported by the synchronization engine. The factoryTag tells the synchronization engine which implementation to use when processing jobs based on this template.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFactoryTag() {
        return this.getBackingStore().get("factoryTag");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getUUIDValue()); });
        deserializerMap.put("default", (n) -> { this.setDefault(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("discoverable", (n) -> { this.setDiscoverable(n.getBooleanValue()); });
        deserializerMap.put("factoryTag", (n) -> { this.setFactoryTag(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getCollectionOfObjectValues(SynchronizationMetadataEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getObjectValue(SynchronizationSchema::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @return a java.util.List<SynchronizationMetadataEntry>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationMetadataEntry> getMetadata() {
        return this.getBackingStore().get("metadata");
    }
    /**
     * Gets the schema property value. Default synchronization schema for the jobs based on this template.
     * @return a SynchronizationSchema
     */
    @jakarta.annotation.Nullable
    public SynchronizationSchema getSchema() {
        return this.getBackingStore().get("schema");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeUUIDValue("applicationId", this.getApplicationId());
        writer.writeBooleanValue("default", this.getDefault());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("discoverable", this.getDiscoverable());
        writer.writeStringValue("factoryTag", this.getFactoryTag());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeObjectValue("schema", this.getSchema());
    }
    /**
     * Sets the applicationId property value. Identifier of the application this template belongs to.
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final UUID value) {
        this.getBackingStore().set("applicationId", value);
    }
    /**
     * Sets the default property value. true if this template is recommended to be the default for the application.
     * @param value Value to set for the default property.
     */
    public void setDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("default", value);
    }
    /**
     * Sets the description property value. Description of the template.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("description", value);
    }
    /**
     * Sets the discoverable property value. true if this template should appear in the collection of templates available for the application instance (service principal).
     * @param value Value to set for the discoverable property.
     */
    public void setDiscoverable(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("discoverable", value);
    }
    /**
     * Sets the factoryTag property value. One of the well-known factory tags supported by the synchronization engine. The factoryTag tells the synchronization engine which implementation to use when processing jobs based on this template.
     * @param value Value to set for the factoryTag property.
     */
    public void setFactoryTag(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("factoryTag", value);
    }
    /**
     * Sets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final java.util.List<SynchronizationMetadataEntry> value) {
        this.getBackingStore().set("metadata", value);
    }
    /**
     * Sets the schema property value. Default synchronization schema for the jobs based on this template.
     * @param value Value to set for the schema property.
     */
    public void setSchema(@jakarta.annotation.Nullable final SynchronizationSchema value) {
        this.getBackingStore().set("schema", value);
    }
}
