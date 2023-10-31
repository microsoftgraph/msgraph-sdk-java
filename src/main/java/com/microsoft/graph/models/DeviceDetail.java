package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new DeviceDetail and sets the default values.
     */
    public DeviceDetail() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceDetail
     */
    @jakarta.annotation.Nonnull
    public static DeviceDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the browser property value. Indicates the browser information of the used for signing in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.getBackingStore().get("browser");
    }
    /**
     * Gets the deviceId property value. Refers to the UniqueID of the device used for signing in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.getBackingStore().get("deviceId");
    }
    /**
     * Gets the displayName property value. Refers to the name of the device used for signing in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isCompliant", (n) -> { this.setIsCompliant(n.getBooleanValue()); });
        deserializerMap.put("isManaged", (n) -> { this.setIsManaged(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("trustType", (n) -> { this.setTrustType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCompliant property value. Indicates whether the device is compliant.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCompliant() {
        return this.getBackingStore().get("isCompliant");
    }
    /**
     * Gets the isManaged property value. Indicates whether the device is managed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsManaged() {
        return this.getBackingStore().get("isManaged");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the operatingSystem property value. Indicates the operating system name and version used for signing in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.getBackingStore().get("operatingSystem");
    }
    /**
     * Gets the trustType property value. Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTrustType() {
        return this.getBackingStore().get("trustType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeBooleanValue("isManaged", this.getIsManaged());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("trustType", this.getTrustType());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the browser property value. Indicates the browser information of the used for signing in.
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("browser", value);
    }
    /**
     * Sets the deviceId property value. Refers to the UniqueID of the device used for signing in.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("deviceId", value);
    }
    /**
     * Sets the displayName property value. Refers to the name of the device used for signing in.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the isCompliant property value. Indicates whether the device is compliant.
     * @param value Value to set for the isCompliant property.
     */
    public void setIsCompliant(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isCompliant", value);
    }
    /**
     * Sets the isManaged property value. Indicates whether the device is managed.
     * @param value Value to set for the isManaged property.
     */
    public void setIsManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isManaged", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the operatingSystem property value. Indicates the operating system name and version used for signing in.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("operatingSystem", value);
    }
    /**
     * Sets the trustType property value. Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     * @param value Value to set for the trustType property.
     */
    public void setTrustType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("trustType", value);
    }
}
