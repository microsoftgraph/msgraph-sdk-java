package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains MSI app properties for a Win32 App.
 */
public class Win32LobAppMsiInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the package type of an MSI Win32LobApp.
     */
    private Win32LobAppMsiPackageType packageType;
    /**
     * The MSI product code.
     */
    private String productCode;
    /**
     * The MSI product name.
     */
    private String productName;
    /**
     * The MSI product version.
     */
    private String productVersion;
    /**
     * The MSI publisher.
     */
    private String publisher;
    /**
     * Whether the MSI app requires the machine to reboot to complete installation.
     */
    private Boolean requiresReboot;
    /**
     * The MSI upgrade code.
     */
    private String upgradeCode;
    /**
     * Instantiates a new win32LobAppMsiInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppMsiInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppMsiInformation
     */
    @javax.annotation.Nonnull
    public static Win32LobAppMsiInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppMsiInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("packageType", (n) -> { this.setPackageType(n.getEnumValue(Win32LobAppMsiPackageType.class)); });
        deserializerMap.put("productCode", (n) -> { this.setProductCode(n.getStringValue()); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("requiresReboot", (n) -> { this.setRequiresReboot(n.getBooleanValue()); });
        deserializerMap.put("upgradeCode", (n) -> { this.setUpgradeCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the packageType property value. Indicates the package type of an MSI Win32LobApp.
     * @return a Win32LobAppMsiPackageType
     */
    @javax.annotation.Nullable
    public Win32LobAppMsiPackageType getPackageType() {
        return this.packageType;
    }
    /**
     * Gets the productCode property value. The MSI product code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductCode() {
        return this.productCode;
    }
    /**
     * Gets the productName property value. The MSI product name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductName() {
        return this.productName;
    }
    /**
     * Gets the productVersion property value. The MSI product version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this.productVersion;
    }
    /**
     * Gets the publisher property value. The MSI publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the requiresReboot property value. Whether the MSI app requires the machine to reboot to complete installation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequiresReboot() {
        return this.requiresReboot;
    }
    /**
     * Gets the upgradeCode property value. The MSI upgrade code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpgradeCode() {
        return this.upgradeCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("packageType", this.getPackageType());
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeBooleanValue("requiresReboot", this.getRequiresReboot());
        writer.writeStringValue("upgradeCode", this.getUpgradeCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the packageType property value. Indicates the package type of an MSI Win32LobApp.
     * @param value Value to set for the packageType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageType(@javax.annotation.Nullable final Win32LobAppMsiPackageType value) {
        this.packageType = value;
    }
    /**
     * Sets the productCode property value. The MSI product code.
     * @param value Value to set for the productCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductCode(@javax.annotation.Nullable final String value) {
        this.productCode = value;
    }
    /**
     * Sets the productName property value. The MSI product name.
     * @param value Value to set for the productName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductName(@javax.annotation.Nullable final String value) {
        this.productName = value;
    }
    /**
     * Sets the productVersion property value. The MSI product version.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this.productVersion = value;
    }
    /**
     * Sets the publisher property value. The MSI publisher.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the requiresReboot property value. Whether the MSI app requires the machine to reboot to complete installation.
     * @param value Value to set for the requiresReboot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequiresReboot(@javax.annotation.Nullable final Boolean value) {
        this.requiresReboot = value;
    }
    /**
     * Sets the upgradeCode property value. The MSI upgrade code.
     * @param value Value to set for the upgradeCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeCode(@javax.annotation.Nullable final String value) {
        this.upgradeCode = value;
    }
}
