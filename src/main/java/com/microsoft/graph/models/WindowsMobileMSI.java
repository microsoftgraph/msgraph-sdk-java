package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsMobileMSI extends MobileLobApp implements Parsable {
    /** The command line. */
    private String commandLine;
    /** A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature. */
    private Boolean ignoreVersionDetection;
    /** The product code. */
    private String productCode;
    /** The product version of Windows Mobile MSI Line of Business (LoB) app. */
    private String productVersion;
    /**
     * Instantiates a new WindowsMobileMSI and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.commandLine;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("commandLine", (n) -> { this.setCommandLine(n.getStringValue()); });
        deserializerMap.put("ignoreVersionDetection", (n) -> { this.setIgnoreVersionDetection(n.getBooleanValue()); });
        deserializerMap.put("productCode", (n) -> { this.setProductCode(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreVersionDetection property value. A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.ignoreVersionDetection;
    }
    /**
     * Gets the productCode property value. The product code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductCode() {
        return this.productCode;
    }
    /**
     * Gets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this.productVersion;
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
    @javax.annotation.Nonnull
    public void setCommandLine(@javax.annotation.Nullable final String value) {
        this.commandLine = value;
    }
    /**
     * Sets the ignoreVersionDetection property value. A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     * @param value Value to set for the ignoreVersionDetection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIgnoreVersionDetection(@javax.annotation.Nullable final Boolean value) {
        this.ignoreVersionDetection = value;
    }
    /**
     * Sets the productCode property value. The product code.
     * @param value Value to set for the productCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductCode(@javax.annotation.Nullable final String value) {
        this.productCode = value;
    }
    /**
     * Sets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this.productVersion = value;
    }
}
