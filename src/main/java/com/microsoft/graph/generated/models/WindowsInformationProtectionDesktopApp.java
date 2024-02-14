package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Desktop App for Windows information protection
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsInformationProtectionDesktopApp extends WindowsInformationProtectionApp implements Parsable {
    /**
     * Instantiates a new {@link WindowsInformationProtectionDesktopApp} and sets the default values.
     */
    public WindowsInformationProtectionDesktopApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsInformationProtectionDesktopApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsInformationProtectionDesktopApp}
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionDesktopApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionDesktopApp();
    }
    /**
     * Gets the binaryName property value. The binary name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBinaryName() {
        return this.backingStore.get("binaryName");
    }
    /**
     * Gets the binaryVersionHigh property value. The high binary version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBinaryVersionHigh() {
        return this.backingStore.get("binaryVersionHigh");
    }
    /**
     * Gets the binaryVersionLow property value. The lower binary version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBinaryVersionLow() {
        return this.backingStore.get("binaryVersionLow");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("binaryName", (n) -> { this.setBinaryName(n.getStringValue()); });
        deserializerMap.put("binaryVersionHigh", (n) -> { this.setBinaryVersionHigh(n.getStringValue()); });
        deserializerMap.put("binaryVersionLow", (n) -> { this.setBinaryVersionLow(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("binaryName", this.getBinaryName());
        writer.writeStringValue("binaryVersionHigh", this.getBinaryVersionHigh());
        writer.writeStringValue("binaryVersionLow", this.getBinaryVersionLow());
    }
    /**
     * Sets the binaryName property value. The binary name.
     * @param value Value to set for the binaryName property.
     */
    public void setBinaryName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("binaryName", value);
    }
    /**
     * Sets the binaryVersionHigh property value. The high binary version.
     * @param value Value to set for the binaryVersionHigh property.
     */
    public void setBinaryVersionHigh(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("binaryVersionHigh", value);
    }
    /**
     * Sets the binaryVersionLow property value. The lower binary version.
     * @param value Value to set for the binaryVersionLow property.
     */
    public void setBinaryVersionLow(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("binaryVersionLow", value);
    }
}
