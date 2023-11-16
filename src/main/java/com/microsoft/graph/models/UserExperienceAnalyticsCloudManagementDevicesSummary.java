package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience work from anywhere Cloud management devices summary.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsCloudManagementDevicesSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UserExperienceAnalyticsCloudManagementDevicesSummary and sets the default values.
     */
    public UserExperienceAnalyticsCloudManagementDevicesSummary() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsCloudManagementDevicesSummary
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsCloudManagementDevicesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsCloudManagementDevicesSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
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
     * Gets the coManagedDeviceCount property value. Total number of  co-managed devices. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCoManagedDeviceCount() {
        return this.BackingStore.get("coManagedDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("coManagedDeviceCount", (n) -> { this.setCoManagedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("intuneDeviceCount", (n) -> { this.setIntuneDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantAttachDeviceCount", (n) -> { this.setTenantAttachDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intuneDeviceCount property value. The count of intune devices that are not autopilot registerd. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIntuneDeviceCount() {
        return this.BackingStore.get("intuneDeviceCount");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the tenantAttachDeviceCount property value. Total count of tenant attach devices. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTenantAttachDeviceCount() {
        return this.BackingStore.get("tenantAttachDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("coManagedDeviceCount", this.getCoManagedDeviceCount());
        writer.writeIntegerValue("intuneDeviceCount", this.getIntuneDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("tenantAttachDeviceCount", this.getTenantAttachDeviceCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the coManagedDeviceCount property value. Total number of  co-managed devices. Read-only.
     * @param value Value to set for the coManagedDeviceCount property.
     */
    public void setCoManagedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("coManagedDeviceCount", value);
    }
    /**
     * Sets the intuneDeviceCount property value. The count of intune devices that are not autopilot registerd. Read-only.
     * @param value Value to set for the intuneDeviceCount property.
     */
    public void setIntuneDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("intuneDeviceCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the tenantAttachDeviceCount property value. Total count of tenant attach devices. Read-only.
     * @param value Value to set for the tenantAttachDeviceCount property.
     */
    public void setTenantAttachDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("tenantAttachDeviceCount", value);
    }
}
