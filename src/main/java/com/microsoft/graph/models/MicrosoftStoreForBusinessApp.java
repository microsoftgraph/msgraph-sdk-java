package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftStoreForBusinessApp extends MobileApp implements Parsable {
    /** The licenseType property */
    private MicrosoftStoreForBusinessLicenseType _licenseType;
    /** The app package identifier */
    private String _packageIdentityName;
    /** The app product key */
    private String _productKey;
    /** The total number of Microsoft Store for Business licenses. */
    private Integer _totalLicenseCount;
    /** The number of Microsoft Store for Business licenses in use. */
    private Integer _usedLicenseCount;
    /**
     * Instantiates a new MicrosoftStoreForBusinessApp and sets the default values.
     * @return a void
     */
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftStoreForBusinessApp currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("licenseType", (n) -> { currentObject.setLicenseType(n.getEnumValue(MicrosoftStoreForBusinessLicenseType.class)); });
            this.put("packageIdentityName", (n) -> { currentObject.setPackageIdentityName(n.getStringValue()); });
            this.put("productKey", (n) -> { currentObject.setProductKey(n.getStringValue()); });
            this.put("totalLicenseCount", (n) -> { currentObject.setTotalLicenseCount(n.getIntegerValue()); });
            this.put("usedLicenseCount", (n) -> { currentObject.setUsedLicenseCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the licenseType property value. The licenseType property
     * @return a microsoftStoreForBusinessLicenseType
     */
    @javax.annotation.Nullable
    public MicrosoftStoreForBusinessLicenseType getLicenseType() {
        return this._licenseType;
    }
    /**
     * Gets the packageIdentityName property value. The app package identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageIdentityName() {
        return this._packageIdentityName;
    }
    /**
     * Gets the productKey property value. The app product key
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this._productKey;
    }
    /**
     * Gets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this._totalLicenseCount;
    }
    /**
     * Gets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this._usedLicenseCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setLicenseType(@javax.annotation.Nullable final MicrosoftStoreForBusinessLicenseType value) {
        this._licenseType = value;
    }
    /**
     * Sets the packageIdentityName property value. The app package identifier
     * @param value Value to set for the packageIdentityName property.
     * @return a void
     */
    public void setPackageIdentityName(@javax.annotation.Nullable final String value) {
        this._packageIdentityName = value;
    }
    /**
     * Sets the productKey property value. The app product key
     * @param value Value to set for the productKey property.
     * @return a void
     */
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this._productKey = value;
    }
    /**
     * Sets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    public void setTotalLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicenseCount = value;
    }
    /**
     * Sets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     * @return a void
     */
    public void setUsedLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._usedLicenseCount = value;
    }
}
