package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsMobileMSI extends MobileLobApp implements Parsable {
    /** The command line. */
    private String _commandLine;
    /** A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature. */
    private Boolean _ignoreVersionDetection;
    /** The product code. */
    private String _productCode;
    /** The product version of Windows Mobile MSI Line of Business (LoB) app. */
    private String _productVersion;
    /**
     * Instantiates a new WindowsMobileMSI and sets the default values.
     * @return a void
     */
    public WindowsMobileMSI() {
        super();
        this.setOdataType("#microsoft.graph.windowsMobileMSI");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsMobileMSI
     */
    @javax.annotation.Nonnull
    public static WindowsMobileMSI createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsMobileMSI();
    }
    /**
     * Gets the commandLine property value. The command line.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommandLine() {
        return this._commandLine;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsMobileMSI currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("commandLine", (n) -> { currentObject.setCommandLine(n.getStringValue()); });
            this.put("ignoreVersionDetection", (n) -> { currentObject.setIgnoreVersionDetection(n.getBooleanValue()); });
            this.put("productCode", (n) -> { currentObject.setProductCode(n.getStringValue()); });
            this.put("productVersion", (n) -> { currentObject.setProductVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ignoreVersionDetection property value. A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this._ignoreVersionDetection;
    }
    /**
     * Gets the productCode property value. The product code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductCode() {
        return this._productCode;
    }
    /**
     * Gets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this._productVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("commandLine", this.getCommandLine());
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productVersion", this.getProductVersion());
    }
    /**
     * Sets the commandLine property value. The command line.
     * @param value Value to set for the commandLine property.
     * @return a void
     */
    public void setCommandLine(@javax.annotation.Nullable final String value) {
        this._commandLine = value;
    }
    /**
     * Sets the ignoreVersionDetection property value. A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     * @param value Value to set for the ignoreVersionDetection property.
     * @return a void
     */
    public void setIgnoreVersionDetection(@javax.annotation.Nullable final Boolean value) {
        this._ignoreVersionDetection = value;
    }
    /**
     * Sets the productCode property value. The product code.
     * @param value Value to set for the productCode property.
     * @return a void
     */
    public void setProductCode(@javax.annotation.Nullable final String value) {
        this._productCode = value;
    }
    /**
     * Sets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this._productVersion = value;
    }
}
