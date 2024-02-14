package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationSchema extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SynchronizationSchema} and sets the default values.
     */
    public SynchronizationSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SynchronizationSchema}
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationSchema createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationSchema();
    }
    /**
     * Gets the directories property value. Contains the collection of directories and all of their objects.
     * @return a {@link java.util.List<DirectoryDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryDefinition> getDirectories() {
        return this.backingStore.get("directories");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directories", (n) -> { this.setDirectories(n.getCollectionOfObjectValues(DirectoryDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("synchronizationRules", (n) -> { this.setSynchronizationRules(n.getCollectionOfObjectValues(SynchronizationRule::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the synchronizationRules property value. A collection of synchronization rules configured for the synchronizationJob or synchronizationTemplate.
     * @return a {@link java.util.List<SynchronizationRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationRule> getSynchronizationRules() {
        return this.backingStore.get("synchronizationRules");
    }
    /**
     * Gets the version property value. The version of the schema, updated automatically with every schema change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("directories", this.getDirectories());
        writer.writeCollectionOfObjectValues("synchronizationRules", this.getSynchronizationRules());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the directories property value. Contains the collection of directories and all of their objects.
     * @param value Value to set for the directories property.
     */
    public void setDirectories(@jakarta.annotation.Nullable final java.util.List<DirectoryDefinition> value) {
        this.backingStore.set("directories", value);
    }
    /**
     * Sets the synchronizationRules property value. A collection of synchronization rules configured for the synchronizationJob or synchronizationTemplate.
     * @param value Value to set for the synchronizationRules property.
     */
    public void setSynchronizationRules(@jakarta.annotation.Nullable final java.util.List<SynchronizationRule> value) {
        this.backingStore.set("synchronizationRules", value);
    }
    /**
     * Sets the version property value. The version of the schema, updated automatically with every schema change.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
