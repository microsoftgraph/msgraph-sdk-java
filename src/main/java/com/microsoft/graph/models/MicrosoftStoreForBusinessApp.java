package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftStoreForBusinessApp extends MobileApp implements Parsable {
    /** The licenseType property */
    private MicrosoftStoreForBusinessLicenseType licenseType;
    /** The app package identifier */
    private String packageIdentityName;
    /** The app product key */
    private String productKey;
    /** The total number of Microsoft Store for Business licenses. */
    private Integer totalLicenseCount;
    /** The number of Microsoft Store for Business licenses in use. */
    private Integer usedLicenseCount;
    /**
     * Instantiates a new MicrosoftStoreForBusinessApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftStoreForBusinessApp() {
        super();
        this.setOdataType("#microsoft.graph.microsoftStoreForBusinessApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftStoreForBusinessApp
     */
    @javax.annotation.Nonnull
    public static MicrosoftStoreForBusinessApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftStoreForBusinessApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(MicrosoftStoreForBusinessLicenseType.class)); });
        deserializerMap.put("packageIdentityName", (n) -> { this.setPackageIdentityName(n.getStringValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the licenseType property value. The licenseType property
     * @return a microsoftStoreForBusinessLicenseType
     */
    @javax.annotation.Nullable
    public MicrosoftStoreForBusinessLicenseType getLicenseType() {
        return this.licenseType;
    }
    /**
     * Gets the packageIdentityName property value. The app package identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageIdentityName() {
        return this.packageIdentityName;
    }
    /**
     * Gets the productKey property value. The app product key
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this.productKey;
    }
    /**
     * Gets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.totalLicenseCount;
    }
    /**
     * Gets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.usedLicenseCount;
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
        writer.writeEnumValue("licenseType", this.getLicenseType());
        writer.writeStringValue("packageIdentityName", this.getPackageIdentityName());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
    }
    /**
     * Sets the licenseType property value. The licenseType property
     * @param value Value to set for the licenseType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicenseType(@javax.annotation.Nullable final MicrosoftStoreForBusinessLicenseType value) {
        this.licenseType = value;
    }
    /**
     * Sets the packageIdentityName property value. The app package identifier
     * @param value Value to set for the packageIdentityName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageIdentityName(@javax.annotation.Nullable final String value) {
        this.packageIdentityName = value;
    }
    /**
     * Sets the productKey property value. The app product key
     * @param value Value to set for the productKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this.productKey = value;
    }
    /**
     * Sets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLicenseCount(@javax.annotation.Nullable final Integer value) {
        this.totalLicenseCount = value;
    }
    /**
     * Sets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsedLicenseCount(@javax.annotation.Nullable final Integer value) {
        this.usedLicenseCount = value;
    }
}
