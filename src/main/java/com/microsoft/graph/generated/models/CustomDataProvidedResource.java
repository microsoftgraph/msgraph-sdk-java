package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomDataProvidedResource extends AccessPackageResource implements Parsable {
    /**
     * Instantiates a new {@link CustomDataProvidedResource} and sets the default values.
     */
    public CustomDataProvidedResource() {
        super();
        this.setOdataType("#microsoft.graph.customDataProvidedResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomDataProvidedResource}
     */
    @jakarta.annotation.Nonnull
    public static CustomDataProvidedResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomDataProvidedResource();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("notificationEndpointConfiguration", (n) -> { this.setNotificationEndpointConfiguration(n.getObjectValue(CustomExtensionEndpointConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notificationEndpointConfiguration property value. The endpoint configuration of the logic app that is triggered when the access review for this resource goes into an initializing state.
     * @return a {@link CustomExtensionEndpointConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionEndpointConfiguration getNotificationEndpointConfiguration() {
        return this.backingStore.get("notificationEndpointConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("notificationEndpointConfiguration", this.getNotificationEndpointConfiguration());
    }
    /**
     * Sets the notificationEndpointConfiguration property value. The endpoint configuration of the logic app that is triggered when the access review for this resource goes into an initializing state.
     * @param value Value to set for the notificationEndpointConfiguration property.
     */
    public void setNotificationEndpointConfiguration(@jakarta.annotation.Nullable final CustomExtensionEndpointConfiguration value) {
        this.backingStore.set("notificationEndpointConfiguration", value);
    }
}
