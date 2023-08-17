package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesDirectorySynchronization extends Entity implements Parsable {
    /**
     * Consists of configurations that can be fine-tuned and impact the on-premises directory synchronization process for a tenant.
     */
    private OnPremisesDirectorySynchronizationConfiguration configuration;
    /**
     * The features property
     */
    private OnPremisesDirectorySynchronizationFeature features;
    /**
     * Instantiates a new onPremisesDirectorySynchronization and sets the default values.
     */
    public OnPremisesDirectorySynchronization() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesDirectorySynchronization
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesDirectorySynchronization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronization();
    }
    /**
     * Gets the configuration property value. Consists of configurations that can be fine-tuned and impact the on-premises directory synchronization process for a tenant.
     * @return a onPremisesDirectorySynchronizationConfiguration
     */
    @jakarta.annotation.Nullable
    public OnPremisesDirectorySynchronizationConfiguration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the features property value. The features property
     * @return a onPremisesDirectorySynchronizationFeature
     */
    @jakarta.annotation.Nullable
    public OnPremisesDirectorySynchronizationFeature getFeatures() {
        return this.features;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(OnPremisesDirectorySynchronizationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("features", (n) -> { this.setFeatures(n.getObjectValue(OnPremisesDirectorySynchronizationFeature::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeObjectValue("features", this.getFeatures());
    }
    /**
     * Sets the configuration property value. Consists of configurations that can be fine-tuned and impact the on-premises directory synchronization process for a tenant.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final OnPremisesDirectorySynchronizationConfiguration value) {
        this.configuration = value;
    }
    /**
     * Sets the features property value. The features property
     * @param value Value to set for the features property.
     */
    public void setFeatures(@jakarta.annotation.Nullable final OnPremisesDirectorySynchronizationFeature value) {
        this.features = value;
    }
}
