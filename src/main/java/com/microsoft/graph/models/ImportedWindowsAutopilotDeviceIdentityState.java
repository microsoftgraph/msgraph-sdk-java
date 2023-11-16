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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImportedWindowsAutopilotDeviceIdentityState implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ImportedWindowsAutopilotDeviceIdentityState and sets the default values.
     */
    public ImportedWindowsAutopilotDeviceIdentityState() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportedWindowsAutopilotDeviceIdentityState
     */
    @jakarta.annotation.Nonnull
    public static ImportedWindowsAutopilotDeviceIdentityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedWindowsAutopilotDeviceIdentityState();
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
     * Gets the deviceErrorCode property value. Device error code reported by Device Directory Service(DDS).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceErrorCode() {
        return this.BackingStore.get("deviceErrorCode");
    }
    /**
     * Gets the deviceErrorName property value. Device error name reported by Device Directory Service(DDS).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceErrorName() {
        return this.BackingStore.get("deviceErrorName");
    }
    /**
     * Gets the deviceImportStatus property value. The deviceImportStatus property
     * @return a ImportedWindowsAutopilotDeviceIdentityImportStatus
     */
    @jakarta.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityImportStatus getDeviceImportStatus() {
        return this.BackingStore.get("deviceImportStatus");
    }
    /**
     * Gets the deviceRegistrationId property value. Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceRegistrationId() {
        return this.BackingStore.get("deviceRegistrationId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("deviceErrorCode", (n) -> { this.setDeviceErrorCode(n.getIntegerValue()); });
        deserializerMap.put("deviceErrorName", (n) -> { this.setDeviceErrorName(n.getStringValue()); });
        deserializerMap.put("deviceImportStatus", (n) -> { this.setDeviceImportStatus(n.getEnumValue(ImportedWindowsAutopilotDeviceIdentityImportStatus.class)); });
        deserializerMap.put("deviceRegistrationId", (n) -> { this.setDeviceRegistrationId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("deviceErrorCode", this.getDeviceErrorCode());
        writer.writeStringValue("deviceErrorName", this.getDeviceErrorName());
        writer.writeEnumValue("deviceImportStatus", this.getDeviceImportStatus());
        writer.writeStringValue("deviceRegistrationId", this.getDeviceRegistrationId());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the deviceErrorCode property value. Device error code reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceErrorCode property.
     */
    public void setDeviceErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("deviceErrorCode", value);
    }
    /**
     * Sets the deviceErrorName property value. Device error name reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceErrorName property.
     */
    public void setDeviceErrorName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceErrorName", value);
    }
    /**
     * Sets the deviceImportStatus property value. The deviceImportStatus property
     * @param value Value to set for the deviceImportStatus property.
     */
    public void setDeviceImportStatus(@jakarta.annotation.Nullable final ImportedWindowsAutopilotDeviceIdentityImportStatus value) {
        this.BackingStore.set("deviceImportStatus", value);
    }
    /**
     * Sets the deviceRegistrationId property value. Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceRegistrationId property.
     */
    public void setDeviceRegistrationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceRegistrationId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
