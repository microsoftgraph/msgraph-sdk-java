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
 * The user experience analytics summary of Devices not windows autopilot ready.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAutopilotDevicesSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserExperienceAnalyticsAutopilotDevicesSummary} and sets the default values.
     */
    public UserExperienceAnalyticsAutopilotDevicesSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsAutopilotDevicesSummary}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAutopilotDevicesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAutopilotDevicesSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDevicesNotAutopilotRegistered() {
        return this.backingStore.get("devicesNotAutopilotRegistered");
    }
    /**
     * Gets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDevicesWithoutAutopilotProfileAssigned() {
        return this.backingStore.get("devicesWithoutAutopilotProfileAssigned");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("devicesNotAutopilotRegistered", (n) -> { this.setDevicesNotAutopilotRegistered(n.getIntegerValue()); });
        deserializerMap.put("devicesWithoutAutopilotProfileAssigned", (n) -> { this.setDevicesWithoutAutopilotProfileAssigned(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalWindows10DevicesWithoutTenantAttached", (n) -> { this.setTotalWindows10DevicesWithoutTenantAttached(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the totalWindows10DevicesWithoutTenantAttached property value. The count of windows 10 devices that are Intune and co-managed. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalWindows10DevicesWithoutTenantAttached() {
        return this.backingStore.get("totalWindows10DevicesWithoutTenantAttached");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("devicesNotAutopilotRegistered", this.getDevicesNotAutopilotRegistered());
        writer.writeIntegerValue("devicesWithoutAutopilotProfileAssigned", this.getDevicesWithoutAutopilotProfileAssigned());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("totalWindows10DevicesWithoutTenantAttached", this.getTotalWindows10DevicesWithoutTenantAttached());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the devicesNotAutopilotRegistered property value. The count of intune devices that are not autopilot registerd. Read-only.
     * @param value Value to set for the devicesNotAutopilotRegistered property.
     */
    public void setDevicesNotAutopilotRegistered(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("devicesNotAutopilotRegistered", value);
    }
    /**
     * Sets the devicesWithoutAutopilotProfileAssigned property value. The count of intune devices not autopilot profile assigned. Read-only.
     * @param value Value to set for the devicesWithoutAutopilotProfileAssigned property.
     */
    public void setDevicesWithoutAutopilotProfileAssigned(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("devicesWithoutAutopilotProfileAssigned", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the totalWindows10DevicesWithoutTenantAttached property value. The count of windows 10 devices that are Intune and co-managed. Read-only.
     * @param value Value to set for the totalWindows10DevicesWithoutTenantAttached property.
     */
    public void setTotalWindows10DevicesWithoutTenantAttached(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalWindows10DevicesWithoutTenantAttached", value);
    }
}
