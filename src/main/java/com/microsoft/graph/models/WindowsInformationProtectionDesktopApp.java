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
        final WindowsInformationProtectionDesktopApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("binaryName", (n) -> { currentObject.setBinaryName(n.getStringValue()); });
            this.put("binaryVersionHigh", (n) -> { currentObject.setBinaryVersionHigh(n.getStringValue()); });
            this.put("binaryVersionLow", (n) -> { currentObject.setBinaryVersionLow(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setBinaryName(@javax.annotation.Nullable final String value) {
        this._binaryName = value;
    }
    /**
     * Sets the binaryVersionHigh property value. The high binary version.
     * @param value Value to set for the binaryVersionHigh property.
     * @return a void
     */
    public void setBinaryVersionHigh(@javax.annotation.Nullable final String value) {
        this._binaryVersionHigh = value;
    }
    /**
     * Sets the binaryVersionLow property value. The lower binary version.
     * @param value Value to set for the binaryVersionLow property.
     * @return a void
     */
    public void setBinaryVersionLow(@javax.annotation.Nullable final String value) {
        this._binaryVersionLow = value;
    }
}
