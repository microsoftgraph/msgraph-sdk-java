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
     * Instantiates a new IosVppApp and sets the default values.
     */
    public IosVppApp() {
        super();
        this.setOdataType("#microsoft.graph.iosVppApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVppApp
     */
    @jakarta.annotation.Nonnull
    public static IosVppApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppApp();
    }
    /**
     * Gets the applicableDeviceType property value. The applicable iOS Device Type.
     * @return a IosDeviceType
     */
    @jakarta.annotation.Nullable
    public IosDeviceType getApplicableDeviceType() {
        return this.getBackingStore().get("applicableDeviceType");
    }
    /**
     * Gets the appStoreUrl property value. The store URL.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppStoreUrl() {
        return this.getBackingStore().get("appStoreUrl");
    }
    /**
     * Gets the bundleId property value. The Identity Name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.getBackingStore().get("bundleId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
        deserializerMap.put("vppTokenAccountType", (n) -> { this.setVppTokenAccountType(n.getEnumValue(VppTokenAccountType.class)); });
        deserializerMap.put("vppTokenAppleId", (n) -> { this.setVppTokenAppleId(n.getStringValue()); });
        deserializerMap.put("vppTokenOrganizationName", (n) -> { this.setVppTokenOrganizationName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the licensingType property value. The supported License Type.
     * @return a VppLicensingType
     */
    @jakarta.annotation.Nullable
    public VppLicensingType getLicensingType() {
        return this.getBackingStore().get("licensingType");
    }
    /**
     * Gets the releaseDateTime property value. The VPP application release date and time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.getBackingStore().get("releaseDateTime");
    }
    /**
     * Gets the totalLicenseCount property value. The total number of VPP licenses.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.getBackingStore().get("totalLicenseCount");
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.getBackingStore().get("usedLicenseCount");
    }
    /**
     * Gets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @return a VppTokenAccountType
     */
    @jakarta.annotation.Nullable
    public VppTokenAccountType getVppTokenAccountType() {
        return this.getBackingStore().get("vppTokenAccountType");
    }
    /**
     * Gets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVppTokenAppleId() {
        return this.getBackingStore().get("vppTokenAppleId");
    }
    /**
     * Gets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVppTokenOrganizationName() {
        return this.getBackingStore().get("vppTokenOrganizationName");
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
        this.getBackingStore().set("applicableDeviceType", value);
    }
    /**
     * Sets the appStoreUrl property value. The store URL.
     * @param value Value to set for the appStoreUrl property.
     */
    public void setAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("appStoreUrl", value);
    }
    /**
     * Sets the bundleId property value. The Identity Name.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("bundleId", value);
    }
    /**
     * Sets the licensingType property value. The supported License Type.
     * @param value Value to set for the licensingType property.
     */
    public void setLicensingType(@jakarta.annotation.Nullable final VppLicensingType value) {
        this.getBackingStore().set("licensingType", value);
    }
    /**
     * Sets the releaseDateTime property value. The VPP application release date and time.
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("releaseDateTime", value);
    }
    /**
     * Sets the totalLicenseCount property value. The total number of VPP licenses.
     * @param value Value to set for the totalLicenseCount property.
     */
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("totalLicenseCount", value);
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("usedLicenseCount", value);
    }
    /**
     * Sets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @param value Value to set for the vppTokenAccountType property.
     */
    public void setVppTokenAccountType(@jakarta.annotation.Nullable final VppTokenAccountType value) {
        this.getBackingStore().set("vppTokenAccountType", value);
    }
    /**
     * Sets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the vppTokenAppleId property.
     */
    public void setVppTokenAppleId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("vppTokenAppleId", value);
    }
    /**
     * Sets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @param value Value to set for the vppTokenOrganizationName property.
     */
    public void setVppTokenOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("vppTokenOrganizationName", value);
    }
}
