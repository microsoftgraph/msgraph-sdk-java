package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Mobile MSI Line Of Business apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsMobileMSI extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new {@link WindowsMobileMSI} and sets the default values.
     */
    public WindowsMobileMSI() {
        super();
        this.setOdataType("#microsoft.graph.windowsMobileMSI");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsMobileMSI}
     */
    @jakarta.annotation.Nonnull
    public static WindowsMobileMSI createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsMobileMSI();
    }
    /**
     * Gets the commandLine property value. The command line.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommandLine() {
        return this.backingStore.get("commandLine");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.backingStore.get("ignoreVersionDetection");
    }
    /**
     * Gets the productCode property value. The product code.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductCode() {
        return this.backingStore.get("productCode");
    }
    /**
     * Gets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductVersion() {
        return this.backingStore.get("productVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCommandLine(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commandLine", value);
    }
    /**
     * Sets the ignoreVersionDetection property value. A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     * @param value Value to set for the ignoreVersionDetection property.
     */
    public void setIgnoreVersionDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("ignoreVersionDetection", value);
    }
    /**
     * Sets the productCode property value. The product code.
     * @param value Value to set for the productCode property.
     */
    public void setProductCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productCode", value);
    }
    /**
     * Sets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @param value Value to set for the productVersion property.
     */
    public void setProductVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productVersion", value);
    }
}
