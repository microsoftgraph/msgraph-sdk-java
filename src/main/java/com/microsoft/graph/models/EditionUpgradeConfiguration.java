package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 10 Edition Upgrade configuration.
 */
public class EditionUpgradeConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Edition Upgrade License File Content.
     */
    private String license;
    /**
     * Edition Upgrade License type
     */
    private EditionUpgradeLicenseType licenseType;
    /**
     * Edition Upgrade Product Key.
     */
    private String productKey;
    /**
     * Windows 10 Edition type.
     */
    private Windows10EditionType targetEdition;
    /**
     * Instantiates a new editionUpgradeConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EditionUpgradeConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.editionUpgradeConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a editionUpgradeConfiguration
     */
    @javax.annotation.Nonnull
    public static EditionUpgradeConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EditionUpgradeConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("license", (n) -> { this.setLicense(n.getStringValue()); });
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(EditionUpgradeLicenseType.class)); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("targetEdition", (n) -> { this.setTargetEdition(n.getEnumValue(Windows10EditionType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the license property value. Edition Upgrade License File Content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLicense() {
        return this.license;
    }
    /**
     * Gets the licenseType property value. Edition Upgrade License type
     * @return a editionUpgradeLicenseType
     */
    @javax.annotation.Nullable
    public EditionUpgradeLicenseType getLicenseType() {
        return this.licenseType;
    }
    /**
     * Gets the productKey property value. Edition Upgrade Product Key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this.productKey;
    }
    /**
     * Gets the targetEdition property value. Windows 10 Edition type.
     * @return a windows10EditionType
     */
    @javax.annotation.Nullable
    public Windows10EditionType getTargetEdition() {
        return this.targetEdition;
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
        writer.writeStringValue("license", this.getLicense());
        writer.writeEnumValue("licenseType", this.getLicenseType());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeEnumValue("targetEdition", this.getTargetEdition());
    }
    /**
     * Sets the license property value. Edition Upgrade License File Content.
     * @param value Value to set for the license property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicense(@javax.annotation.Nullable final String value) {
        this.license = value;
    }
    /**
     * Sets the licenseType property value. Edition Upgrade License type
     * @param value Value to set for the licenseType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicenseType(@javax.annotation.Nullable final EditionUpgradeLicenseType value) {
        this.licenseType = value;
    }
    /**
     * Sets the productKey property value. Edition Upgrade Product Key.
     * @param value Value to set for the productKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this.productKey = value;
    }
    /**
     * Sets the targetEdition property value. Windows 10 Edition type.
     * @param value Value to set for the targetEdition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetEdition(@javax.annotation.Nullable final Windows10EditionType value) {
        this.targetEdition = value;
    }
}
