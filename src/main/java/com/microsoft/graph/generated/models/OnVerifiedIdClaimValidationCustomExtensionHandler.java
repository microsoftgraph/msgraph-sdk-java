package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnVerifiedIdClaimValidationCustomExtensionHandler extends OnVerifiedIdClaimValidationHandler implements Parsable {
    /**
     * Instantiates a new {@link OnVerifiedIdClaimValidationCustomExtensionHandler} and sets the default values.
     */
    public OnVerifiedIdClaimValidationCustomExtensionHandler() {
        super();
        this.setOdataType("#microsoft.graph.onVerifiedIdClaimValidationCustomExtensionHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnVerifiedIdClaimValidationCustomExtensionHandler}
     */
    @jakarta.annotation.Nonnull
    public static OnVerifiedIdClaimValidationCustomExtensionHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnVerifiedIdClaimValidationCustomExtensionHandler();
    }
    /**
     * Gets the configuration property value. Configuration that overrides the default settings from the referenced custom extension, such as timeout and retry values. Optional.
     * @return a {@link CustomExtensionOverwriteConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionOverwriteConfiguration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the customExtension property value. The customExtension property
     * @return a {@link OnVerifiedIdClaimValidationCustomExtension}
     */
    @jakarta.annotation.Nullable
    public OnVerifiedIdClaimValidationCustomExtension getCustomExtension() {
        return this.backingStore.get("customExtension");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(CustomExtensionOverwriteConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(OnVerifiedIdClaimValidationCustomExtension::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("customExtension", this.getCustomExtension());
    }
    /**
     * Sets the configuration property value. Configuration that overrides the default settings from the referenced custom extension, such as timeout and retry values. Optional.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final CustomExtensionOverwriteConfiguration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the customExtension property value. The customExtension property
     * @param value Value to set for the customExtension property.
     */
    public void setCustomExtension(@jakarta.annotation.Nullable final OnVerifiedIdClaimValidationCustomExtension value) {
        this.backingStore.set("customExtension", value);
    }
}
