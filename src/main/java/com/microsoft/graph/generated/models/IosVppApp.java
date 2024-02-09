package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for iOS Volume-Purchased Program (VPP) Apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosVppApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new {@link IosVppApp} and sets the default values.
     */
    public IosVppApp() {
        super();
        this.setOdataType("#microsoft.graph.iosVppApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosVppApp}
     */
    @jakarta.annotation.Nonnull
    public static IosVppApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppApp();
    }
    /**
     * Gets the applicableDeviceType property value. The applicable iOS Device Type.
     * @return a {@link IosDeviceType}
     */
    @jakarta.annotation.Nullable
    public IosDeviceType getApplicableDeviceType() {
        return this.backingStore.get("applicableDeviceType");
    }
    /**
     * Gets the appStoreUrl property value. The store URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.backingStore.get("appStoreUrl");
    }
    /**
     * Gets the bundleId property value. The Identity Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.backingStore.get("bundleId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableDeviceType", (n) -> { this.setApplicableDeviceType(n.getObjectValue(IosDeviceType::createFromDiscriminatorValue)); });
        deserializerMap.put("appStoreUrl", (n) -> { this.setAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("licensingType", (n) -> { this.setLicensingType(n.getObjectValue(VppLicensingType::createFromDiscriminatorValue)); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("vppTokenAccountType", (n) -> { this.setVppTokenAccountType(n.getEnumValue(VppTokenAccountType::forValue)); });
        deserializerMap.put("vppTokenAppleId", (n) -> { this.setVppTokenAppleId(n.getStringValue()); });
        deserializerMap.put("vppTokenOrganizationName", (n) -> { this.setVppTokenOrganizationName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the licensingType property value. The supported License Type.
     * @return a {@link VppLicensingType}
     */
    @jakarta.annotation.Nullable
    public VppLicensingType getLicensingType() {
        return this.backingStore.get("licensingType");
    }
    /**
     * Gets the releaseDateTime property value. The VPP application release date and time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.backingStore.get("releaseDateTime");
    }
    /**
     * Gets the totalLicenseCount property value. The total number of VPP licenses.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.backingStore.get("totalLicenseCount");
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.backingStore.get("usedLicenseCount");
    }
    /**
     * Gets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @return a {@link VppTokenAccountType}
     */
    @jakarta.annotation.Nullable
    public VppTokenAccountType getVppTokenAccountType() {
        return this.backingStore.get("vppTokenAccountType");
    }
    /**
     * Gets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVppTokenAppleId() {
        return this.backingStore.get("vppTokenAppleId");
    }
    /**
     * Gets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVppTokenOrganizationName() {
        return this.backingStore.get("vppTokenOrganizationName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicableDeviceType", this.getApplicableDeviceType());
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeObjectValue("licensingType", this.getLicensingType());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
        writer.writeEnumValue("vppTokenAccountType", this.getVppTokenAccountType());
        writer.writeStringValue("vppTokenAppleId", this.getVppTokenAppleId());
        writer.writeStringValue("vppTokenOrganizationName", this.getVppTokenOrganizationName());
    }
    /**
     * Sets the applicableDeviceType property value. The applicable iOS Device Type.
     * @param value Value to set for the applicableDeviceType property.
     */
    public void setApplicableDeviceType(@jakarta.annotation.Nullable final IosDeviceType value) {
        this.backingStore.set("applicableDeviceType", value);
    }
    /**
     * Sets the appStoreUrl property value. The store URL.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appStoreUrl", value);
    }
    /**
     * Sets the bundleId property value. The Identity Name.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bundleId", value);
    }
    /**
     * Sets the licensingType property value. The supported License Type.
     * @param value Value to set for the licensingType property.
     */
    public void setLicensingType(@jakarta.annotation.Nullable final VppLicensingType value) {
        this.backingStore.set("licensingType", value);
    }
    /**
     * Sets the releaseDateTime property value. The VPP application release date and time.
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("releaseDateTime", value);
    }
    /**
     * Sets the totalLicenseCount property value. The total number of VPP licenses.
     * @param value Value to set for the totalLicenseCount property.
     */
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicenseCount", value);
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedLicenseCount", value);
    }
    /**
     * Sets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @param value Value to set for the vppTokenAccountType property.
     */
    public void setVppTokenAccountType(@jakarta.annotation.Nullable final VppTokenAccountType value) {
        this.backingStore.set("vppTokenAccountType", value);
    }
    /**
     * Sets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the vppTokenAppleId property.
     */
    public void setVppTokenAppleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vppTokenAppleId", value);
    }
    /**
     * Sets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @param value Value to set for the vppTokenOrganizationName property.
     */
    public void setVppTokenOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vppTokenOrganizationName", value);
    }
}
