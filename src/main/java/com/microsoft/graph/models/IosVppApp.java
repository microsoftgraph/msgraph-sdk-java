package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosVppApp extends MobileApp implements Parsable {
    /** The applicable iOS Device Type. */
    private IosDeviceType _applicableDeviceType;
    /** The store URL. */
    private String _appStoreUrl;
    /** The Identity Name. */
    private String _bundleId;
    /** The supported License Type. */
    private VppLicensingType _licensingType;
    /** The VPP application release date and time. */
    private OffsetDateTime _releaseDateTime;
    /** The total number of VPP licenses. */
    private Integer _totalLicenseCount;
    /** The number of VPP licenses in use. */
    private Integer _usedLicenseCount;
    /** Possible types of an Apple Volume Purchase Program token. */
    private VppTokenAccountType _vppTokenAccountType;
    /** The Apple Id associated with the given Apple Volume Purchase Program Token. */
    private String _vppTokenAppleId;
    /** The organization associated with the Apple Volume Purchase Program Token */
    private String _vppTokenOrganizationName;
    /**
     * Instantiates a new IosVppApp and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static IosVppApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppApp();
    }
    /**
     * Gets the applicableDeviceType property value. The applicable iOS Device Type.
     * @return a iosDeviceType
     */
    @javax.annotation.Nullable
    public IosDeviceType getApplicableDeviceType() {
        return this._applicableDeviceType;
    }
    /**
     * Gets the appStoreUrl property value. The store URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppStoreUrl() {
        return this._appStoreUrl;
    }
    /**
     * Gets the bundleId property value. The Identity Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this._bundleId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosVppApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("applicableDeviceType", (n) -> { currentObject.setApplicableDeviceType(n.getObjectValue(IosDeviceType::createFromDiscriminatorValue)); });
            this.put("appStoreUrl", (n) -> { currentObject.setAppStoreUrl(n.getStringValue()); });
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
            this.put("licensingType", (n) -> { currentObject.setLicensingType(n.getObjectValue(VppLicensingType::createFromDiscriminatorValue)); });
            this.put("releaseDateTime", (n) -> { currentObject.setReleaseDateTime(n.getOffsetDateTimeValue()); });
            this.put("totalLicenseCount", (n) -> { currentObject.setTotalLicenseCount(n.getIntegerValue()); });
            this.put("usedLicenseCount", (n) -> { currentObject.setUsedLicenseCount(n.getIntegerValue()); });
            this.put("vppTokenAccountType", (n) -> { currentObject.setVppTokenAccountType(n.getEnumValue(VppTokenAccountType.class)); });
            this.put("vppTokenAppleId", (n) -> { currentObject.setVppTokenAppleId(n.getStringValue()); });
            this.put("vppTokenOrganizationName", (n) -> { currentObject.setVppTokenOrganizationName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the licensingType property value. The supported License Type.
     * @return a vppLicensingType
     */
    @javax.annotation.Nullable
    public VppLicensingType getLicensingType() {
        return this._licensingType;
    }
    /**
     * Gets the releaseDateTime property value. The VPP application release date and time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this._releaseDateTime;
    }
    /**
     * Gets the totalLicenseCount property value. The total number of VPP licenses.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this._totalLicenseCount;
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this._usedLicenseCount;
    }
    /**
     * Gets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @return a vppTokenAccountType
     */
    @javax.annotation.Nullable
    public VppTokenAccountType getVppTokenAccountType() {
        return this._vppTokenAccountType;
    }
    /**
     * Gets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppTokenAppleId() {
        return this._vppTokenAppleId;
    }
    /**
     * Gets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVppTokenOrganizationName() {
        return this._vppTokenOrganizationName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setApplicableDeviceType(@javax.annotation.Nullable final IosDeviceType value) {
        this._applicableDeviceType = value;
    }
    /**
     * Sets the appStoreUrl property value. The store URL.
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    public void setAppStoreUrl(@javax.annotation.Nullable final String value) {
        this._appStoreUrl = value;
    }
    /**
     * Sets the bundleId property value. The Identity Name.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
    /**
     * Sets the licensingType property value. The supported License Type.
     * @param value Value to set for the licensingType property.
     * @return a void
     */
    public void setLicensingType(@javax.annotation.Nullable final VppLicensingType value) {
        this._licensingType = value;
    }
    /**
     * Sets the releaseDateTime property value. The VPP application release date and time.
     * @param value Value to set for the releaseDateTime property.
     * @return a void
     */
    public void setReleaseDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._releaseDateTime = value;
    }
    /**
     * Sets the totalLicenseCount property value. The total number of VPP licenses.
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    public void setTotalLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicenseCount = value;
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    public void setUsedLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._usedLicenseCount = value;
    }
    /**
     * Sets the vppTokenAccountType property value. Possible types of an Apple Volume Purchase Program token.
     * @param value Value to set for the vppTokenAccountType property.
     * @return a void
     */
    public void setVppTokenAccountType(@javax.annotation.Nullable final VppTokenAccountType value) {
        this._vppTokenAccountType = value;
    }
    /**
     * Sets the vppTokenAppleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the vppTokenAppleId property.
     * @return a void
     */
    public void setVppTokenAppleId(@javax.annotation.Nullable final String value) {
        this._vppTokenAppleId = value;
    }
    /**
     * Sets the vppTokenOrganizationName property value. The organization associated with the Apple Volume Purchase Program Token
     * @param value Value to set for the vppTokenOrganizationName property.
     * @return a void
     */
    public void setVppTokenOrganizationName(@javax.annotation.Nullable final String value) {
        this._vppTokenOrganizationName = value;
    }
}
