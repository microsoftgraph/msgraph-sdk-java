package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectoryDefinition extends Entity implements Parsable {
    /**
     * The discoverabilities property
     */
    private DirectoryDefinitionDiscoverabilities discoverabilities;
    /**
     * Represents the discovery date and time using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime discoveryDateTime;
    /**
     * Name of the directory. Must be unique within the synchronization schema. Not nullable.
     */
    private String name;
    /**
     * Collection of objects supported by the directory.
     */
    private java.util.List<ObjectDefinition> objects;
    /**
     * Whether this object is read-only.
     */
    private Boolean readOnly;
    /**
     * Read only value that indicates version discovered. null if discovery has not yet occurred.
     */
    private String version;
    /**
     * Instantiates a new directoryDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directoryDefinition
     */
    @javax.annotation.Nonnull
    public static DirectoryDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryDefinition();
    }
    /**
     * Gets the discoverabilities property value. The discoverabilities property
     * @return a directoryDefinitionDiscoverabilities
     */
    @javax.annotation.Nullable
    public DirectoryDefinitionDiscoverabilities getDiscoverabilities() {
        return this.discoverabilities;
    }
    /**
     * Gets the discoveryDateTime property value. Represents the discovery date and time using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDiscoveryDateTime() {
        return this.discoveryDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("discoverabilities", (n) -> { this.setDiscoverabilities(n.getEnumValue(DirectoryDefinitionDiscoverabilities.class)); });
        deserializerMap.put("discoveryDateTime", (n) -> { this.setDiscoveryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("objects", (n) -> { this.setObjects(n.getCollectionOfObjectValues(ObjectDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("readOnly", (n) -> { this.setReadOnly(n.getBooleanValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name of the directory. Must be unique within the synchronization schema. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the objects property value. Collection of objects supported by the directory.
     * @return a objectDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ObjectDefinition> getObjects() {
        return this.objects;
    }
    /**
     * Gets the readOnly property value. Whether this object is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReadOnly() {
        return this.readOnly;
    }
    /**
     * Gets the version property value. Read only value that indicates version discovered. null if discovery has not yet occurred.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeEnumValue("discoverabilities", this.getDiscoverabilities());
        writer.writeOffsetDateTimeValue("discoveryDateTime", this.getDiscoveryDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("objects", this.getObjects());
        writer.writeBooleanValue("readOnly", this.getReadOnly());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the discoverabilities property value. The discoverabilities property
     * @param value Value to set for the discoverabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscoverabilities(@javax.annotation.Nullable final DirectoryDefinitionDiscoverabilities value) {
        this.discoverabilities = value;
    }
    /**
     * Sets the discoveryDateTime property value. Represents the discovery date and time using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the discoveryDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscoveryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.discoveryDateTime = value;
    }
    /**
     * Sets the name property value. Name of the directory. Must be unique within the synchronization schema. Not nullable.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the objects property value. Collection of objects supported by the directory.
     * @param value Value to set for the objects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjects(@javax.annotation.Nullable final java.util.List<ObjectDefinition> value) {
        this.objects = value;
    }
    /**
     * Sets the readOnly property value. Whether this object is read-only.
     * @param value Value to set for the readOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReadOnly(@javax.annotation.Nullable final Boolean value) {
        this.readOnly = value;
    }
    /**
     * Sets the version property value. Read only value that indicates version discovered. null if discovery has not yet occurred.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
