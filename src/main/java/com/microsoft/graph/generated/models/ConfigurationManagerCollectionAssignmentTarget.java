package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an assignment to a Configuration Manager Collection.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationManagerCollectionAssignmentTarget extends DeviceAndAppManagementAssignmentTarget implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationManagerCollectionAssignmentTarget} and sets the default values.
     */
    public ConfigurationManagerCollectionAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.configurationManagerCollectionAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationManagerCollectionAssignmentTarget}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationManagerCollectionAssignmentTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerCollectionAssignmentTarget();
    }
    /**
     * Gets the collectionId property value. The collection Id that is the target of the assignment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCollectionId() {
        return this.backingStore.get("collectionId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("collectionId", (n) -> { this.setCollectionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("collectionId", this.getCollectionId());
    }
    /**
     * Sets the collectionId property value. The collection Id that is the target of the assignment.
     * @param value Value to set for the collectionId property.
     */
    public void setCollectionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("collectionId", value);
    }
}
