package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class SynchronizationTemplate extends Entity implements Parsable {
    /** The applicationId property */
    private UUID applicationId;
    /** The default property */
    private Boolean defaultEscaped;
    /** The description property */
    private String description;
    /** The discoverable property */
    private Boolean discoverable;
    /** The factoryTag property */
    private String factoryTag;
    /** The metadata property */
    private java.util.List<SynchronizationMetadataEntry> metadata;
    /** The schema property */
    private SynchronizationSchema schema;
    /**
     * Instantiates a new synchronizationTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationTemplate
     */
    @javax.annotation.Nonnull
    public static SynchronizationTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationTemplate();
    }
    /**
     * Gets the applicationId property value. The applicationId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getApplicationId() {
        return this.applicationId;
    }
    /**
     * Gets the default property value. The default property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefault() {
        return this.defaultEscaped;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the discoverable property value. The discoverable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiscoverable() {
        return this.discoverable;
    }
    /**
     * Gets the factoryTag property value. The factoryTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFactoryTag() {
        return this.factoryTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the metadata property value. The metadata property
     * @return a synchronizationMetadataEntry
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationMetadataEntry> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the schema property value. The schema property
     * @return a synchronizationSchema
     */
    @javax.annotation.Nullable
    public SynchronizationSchema getSchema() {
        return this.schema;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the applicationId property value. The applicationId property
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationId(@javax.annotation.Nullable final UUID value) {
        this.applicationId = value;
    }
    /**
     * Sets the default property value. The default property
     * @param value Value to set for the default property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefault(@javax.annotation.Nullable final Boolean value) {
        this.defaultEscaped = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the discoverable property value. The discoverable property
     * @param value Value to set for the discoverable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscoverable(@javax.annotation.Nullable final Boolean value) {
        this.discoverable = value;
    }
    /**
     * Sets the factoryTag property value. The factoryTag property
     * @param value Value to set for the factoryTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactoryTag(@javax.annotation.Nullable final String value) {
        this.factoryTag = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final java.util.List<SynchronizationMetadataEntry> value) {
        this.metadata = value;
    }
    /**
     * Sets the schema property value. The schema property
     * @param value Value to set for the schema property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchema(@javax.annotation.Nullable final SynchronizationSchema value) {
        this.schema = value;
    }
}
