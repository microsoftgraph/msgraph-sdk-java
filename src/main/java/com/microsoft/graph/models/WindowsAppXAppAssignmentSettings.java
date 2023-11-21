package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used when assigning a Windows AppX mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAppXAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new WindowsAppXAppAssignmentSettings and sets the default values.
     */
    public WindowsAppXAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsAppXAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsAppXAppAssignmentSettings
     */
    @jakarta.annotation.Nonnull
    public static WindowsAppXAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAppXAppAssignmentSettings();
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
     * Gets the useDeviceContext property value. When TRUE, indicates that device execution context will be used for the AppX mobile app. When FALSE, indicates that user context will be used for the AppX mobile app. By default, this property is set to FALSE. Once this property has been set to TRUE it cannot be changed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseDeviceContext() {
        return this.backingStore.get("useDeviceContext");
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
     * Sets the useDeviceContext property value. When TRUE, indicates that device execution context will be used for the AppX mobile app. When FALSE, indicates that user context will be used for the AppX mobile app. By default, this property is set to FALSE. Once this property has been set to TRUE it cannot be changed.
     * @param value Value to set for the useDeviceContext property.
     */
    public void setUseDeviceContext(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useDeviceContext", value);
    }
}
