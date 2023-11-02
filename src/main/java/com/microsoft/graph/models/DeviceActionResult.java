package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device action result
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceActionResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new DeviceActionResult and sets the default values.
     */
    public DeviceActionResult() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceActionResult
     */
    @jakarta.annotation.Nonnull
    public static DeviceActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deleteUserFromSharedAppleDeviceActionResult": return new DeleteUserFromSharedAppleDeviceActionResult();
                case "#microsoft.graph.locateDeviceActionResult": return new LocateDeviceActionResult();
                case "#microsoft.graph.remoteLockActionResult": return new RemoteLockActionResult();
                case "#microsoft.graph.resetPasscodeActionResult": return new ResetPasscodeActionResult();
                case "#microsoft.graph.rotateBitLockerKeysDeviceActionResult": return new RotateBitLockerKeysDeviceActionResult();
                case "#microsoft.graph.windowsDefenderScanActionResult": return new WindowsDefenderScanActionResult();
            }
        }
        return new DeviceActionResult();
    }
    /**
     * Gets the actionName property value. Action name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActionName() {
        return this.getBackingStore().get("actionName");
    }
    /**
     * Gets the actionState property value. State of the action on the device
     * @return a ActionState
     */
    @jakarta.annotation.Nullable
    public ActionState getActionState() {
        return this.getBackingStore().get("actionState");
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getStringValue()); });
        deserializerMap.put("actionState", (n) -> { this.setActionState(n.getEnumValue(ActionState.class)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Time the action state was last updated
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.getBackingStore().get("lastUpdatedDateTime");
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
     * Gets the startDateTime property value. Time the action was initiated
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.getBackingStore().get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeEnumValue("actionState", this.getActionState());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the actionName property value. Action name
     * @param value Value to set for the actionName property.
     */
    public void setActionName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("actionName", value);
    }
    /**
     * Sets the actionState property value. State of the action on the device
     * @param value Value to set for the actionState property.
     */
    public void setActionState(@jakarta.annotation.Nullable final ActionState value) {
        this.getBackingStore().set("actionState", value);
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
     * Sets the lastUpdatedDateTime property value. Time the action state was last updated
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the startDateTime property value. Time the action was initiated
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("startDateTime", value);
    }
}
