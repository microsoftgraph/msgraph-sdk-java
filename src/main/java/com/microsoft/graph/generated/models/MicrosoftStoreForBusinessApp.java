package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Microsoft Store for Business Apps. This class does not support Create, Delete, or Update.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftStoreForBusinessApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new MicrosoftStoreForBusinessApp and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static MicrosoftStoreForBusinessApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftStoreForBusinessApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(MicrosoftStoreForBusinessLicenseType::forValue)); });
        deserializerMap.put("packageIdentityName", (n) -> { this.setPackageIdentityName(n.getStringValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("totalLicenseCount", (n) -> { this.setTotalLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the licenseType property value. The licenseType property
     * @return a MicrosoftStoreForBusinessLicenseType
     */
    @jakarta.annotation.Nullable
    public MicrosoftStoreForBusinessLicenseType getLicenseType() {
        return this.backingStore.get("licenseType");
    }
    /**
     * Gets the packageIdentityName property value. The app package identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPackageIdentityName() {
        return this.backingStore.get("packageIdentityName");
    }
    /**
     * Gets the productKey property value. The app product key
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductKey() {
        return this.backingStore.get("productKey");
    }
    /**
     * Gets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this.backingStore.get("totalLicenseCount");
    }
    /**
     * Gets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.backingStore.get("usedLicenseCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setLicenseType(@jakarta.annotation.Nullable final MicrosoftStoreForBusinessLicenseType value) {
        this.backingStore.set("licenseType", value);
    }
    /**
     * Sets the packageIdentityName property value. The app package identifier
     * @param value Value to set for the packageIdentityName property.
     */
    public void setPackageIdentityName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageIdentityName", value);
    }
    /**
     * Sets the productKey property value. The app product key
     * @param value Value to set for the productKey property.
     */
    public void setProductKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productKey", value);
    }
    /**
     * Sets the totalLicenseCount property value. The total number of Microsoft Store for Business licenses.
     * @param value Value to set for the totalLicenseCount property.
     */
    public void setTotalLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicenseCount", value);
    }
    /**
     * Sets the usedLicenseCount property value. The number of Microsoft Store for Business licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedLicenseCount", value);
    }
}
