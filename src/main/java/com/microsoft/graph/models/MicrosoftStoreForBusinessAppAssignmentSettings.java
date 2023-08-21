package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an Microsoft Store for Business mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftStoreForBusinessAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Whether or not to use device execution context for Microsoft Store for Business mobile app.
     */
    private Boolean useDeviceContext;
    /**
     * Instantiates a new microsoftStoreForBusinessAppAssignmentSettings and sets the default values.
     */
    public MicrosoftStoreForBusinessAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.microsoftStoreForBusinessAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftStoreForBusinessAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftStoreForBusinessAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftStoreForBusinessAppAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("useDeviceContext", (n) -> { this.setUseDeviceContext(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the useDeviceContext property value. Whether or not to use device execution context for Microsoft Store for Business mobile app.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseDeviceContext() {
        return this.useDeviceContext;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("useDeviceContext", this.getUseDeviceContext());
    }
    /**
     * Sets the useDeviceContext property value. Whether or not to use device execution context for Microsoft Store for Business mobile app.
     * @param value Value to set for the useDeviceContext property.
     */
    public void setUseDeviceContext(@jakarta.annotation.Nullable final Boolean value) {
        this.useDeviceContext = value;
    }
}
