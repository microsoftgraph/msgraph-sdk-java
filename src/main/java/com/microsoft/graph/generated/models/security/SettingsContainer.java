package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SettingsContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SettingsContainer} and sets the default values.
     */
    public SettingsContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SettingsContainer}
     */
    @jakarta.annotation.Nonnull
    public static SettingsContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SettingsContainer();
    }
    /**
     * Gets the autoAuditingConfiguration property value. Represents automatic configuration for collection of Windows event logs as needed for Defender for Identity sensors.
     * @return a {@link AutoAuditingConfiguration}
     */
    @jakarta.annotation.Nullable
    public AutoAuditingConfiguration getAutoAuditingConfiguration() {
        return this.backingStore.get("autoAuditingConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autoAuditingConfiguration", (n) -> { this.setAutoAuditingConfiguration(n.getObjectValue(AutoAuditingConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("autoAuditingConfiguration", this.getAutoAuditingConfiguration());
    }
    /**
     * Sets the autoAuditingConfiguration property value. Represents automatic configuration for collection of Windows event logs as needed for Defender for Identity sensors.
     * @param value Value to set for the autoAuditingConfiguration property.
     */
    public void setAutoAuditingConfiguration(@jakarta.annotation.Nullable final AutoAuditingConfiguration value) {
        this.backingStore.set("autoAuditingConfiguration", value);
    }
}
