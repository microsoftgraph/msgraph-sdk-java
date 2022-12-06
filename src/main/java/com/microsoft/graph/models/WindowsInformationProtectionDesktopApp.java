package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsInformationProtectionDesktopApp extends WindowsInformationProtectionApp implements Parsable {
    /** The binary name. */
    private String _binaryName;
    /** The high binary version. */
    private String _binaryVersionHigh;
    /** The lower binary version. */
    private String _binaryVersionLow;
    /**
     * Instantiates a new WindowsInformationProtectionDesktopApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionDesktopApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsInformationProtectionDesktopApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsInformationProtectionDesktopApp
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionDesktopApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionDesktopApp();
    }
    /**
     * Gets the binaryName property value. The binary name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBinaryName() {
        return this._binaryName;
    }
    /**
     * Gets the binaryVersionHigh property value. The high binary version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBinaryVersionHigh() {
        return this._binaryVersionHigh;
    }
    /**
     * Gets the binaryVersionLow property value. The lower binary version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBinaryVersionLow() {
        return this._binaryVersionLow;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("binaryName", (n) -> { this.setBinaryName(n.getStringValue()); });
        deserializerMap.put("binaryVersionHigh", (n) -> { this.setBinaryVersionHigh(n.getStringValue()); });
        deserializerMap.put("binaryVersionLow", (n) -> { this.setBinaryVersionLow(n.getStringValue()); });
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
        writer.writeStringValue("binaryName", this.getBinaryName());
        writer.writeStringValue("binaryVersionHigh", this.getBinaryVersionHigh());
        writer.writeStringValue("binaryVersionLow", this.getBinaryVersionLow());
    }
    /**
     * Sets the binaryName property value. The binary name.
     * @param value Value to set for the binaryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBinaryName(@javax.annotation.Nullable final String value) {
        this._binaryName = value;
    }
    /**
     * Sets the binaryVersionHigh property value. The high binary version.
     * @param value Value to set for the binaryVersionHigh property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBinaryVersionHigh(@javax.annotation.Nullable final String value) {
        this._binaryVersionHigh = value;
    }
    /**
     * Sets the binaryVersionLow property value. The lower binary version.
     * @param value Value to set for the binaryVersionLow property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBinaryVersionLow(@javax.annotation.Nullable final String value) {
        this._binaryVersionLow = value;
    }
}
