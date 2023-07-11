package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Configuration used to deliver a set of custom settings as-is to apps for users to whom the configuration is scoped
 */
public class ManagedAppConfiguration extends ManagedAppPolicy implements Parsable {
    /**
     * A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned by this service
     */
    private java.util.List<KeyValuePair> customSettings;
    /**
     * Instantiates a new managedAppConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.managedAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAppConfiguration
     */
    @javax.annotation.Nonnull
    public static ManagedAppConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.targetedManagedAppConfiguration": return new TargetedManagedAppConfiguration();
            }
        }
        return new ManagedAppConfiguration();
    }
    /**
     * Gets the customSettings property value. A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned by this service
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomSettings() {
        return this.customSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customSettings", (n) -> { this.setCustomSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("customSettings", this.getCustomSettings());
    }
    /**
     * Sets the customSettings property value. A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned by this service
     * @param value Value to set for the customSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomSettings(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.customSettings = value;
    }
}
