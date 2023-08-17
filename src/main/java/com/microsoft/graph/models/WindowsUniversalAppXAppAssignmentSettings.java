package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used when assigning a Windows Universal AppX mobile app to a group.
 */
public class WindowsUniversalAppXAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * If true, uses device execution context for Windows Universal AppX mobile app. Device-context install is not allowed when this type of app is targeted with Available intent. Defaults to false.
     */
    private Boolean useDeviceContext;
    /**
     * Instantiates a new windowsUniversalAppXAppAssignmentSettings and sets the default values.
     */
    public WindowsUniversalAppXAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsUniversalAppXAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsUniversalAppXAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static WindowsUniversalAppXAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUniversalAppXAppAssignmentSettings();
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
     * Gets the useDeviceContext property value. If true, uses device execution context for Windows Universal AppX mobile app. Device-context install is not allowed when this type of app is targeted with Available intent. Defaults to false.
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
     * Sets the useDeviceContext property value. If true, uses device execution context for Windows Universal AppX mobile app. Device-context install is not allowed when this type of app is targeted with Available intent. Defaults to false.
     * @param value Value to set for the useDeviceContext property.
     */
    public void setUseDeviceContext(@jakarta.annotation.Nullable final Boolean value) {
        this.useDeviceContext = value;
    }
}
