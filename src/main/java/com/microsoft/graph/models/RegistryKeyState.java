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
public class RegistryKeyState implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new RegistryKeyState and sets the default values.
     */
    public RegistryKeyState() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryKeyState
     */
    @jakarta.annotation.Nonnull
    public static RegistryKeyState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryKeyState();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("hive", (n) -> { this.setHive(n.getEnumValue(RegistryHive.class)); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("oldKey", (n) -> { this.setOldKey(n.getStringValue()); });
        deserializerMap.put("oldValueData", (n) -> { this.setOldValueData(n.getStringValue()); });
        deserializerMap.put("oldValueName", (n) -> { this.setOldValueName(n.getStringValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getEnumValue(RegistryOperation.class)); });
        deserializerMap.put("processId", (n) -> { this.setProcessId(n.getIntegerValue()); });
        deserializerMap.put("valueData", (n) -> { this.setValueData(n.getStringValue()); });
        deserializerMap.put("valueName", (n) -> { this.setValueName(n.getStringValue()); });
        deserializerMap.put("valueType", (n) -> { this.setValueType(n.getEnumValue(RegistryValueType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hive property value. A Windows registry hive : HKEYCURRENTCONFIG HKEYCURRENTUSER HKEYLOCALMACHINE/SAM HKEYLOCALMACHINE/Security HKEYLOCALMACHINE/Software HKEYLOCALMACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     * @return a RegistryHive
     */
    @jakarta.annotation.Nullable
    public RegistryHive getHive() {
        return this.BackingStore.get("hive");
    }
    /**
     * Gets the key property value. Current (i.e. changed) registry key (excludes HIVE).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.BackingStore.get("key");
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
     * Gets the oldKey property value. Previous (i.e. before changed) registry key (excludes HIVE).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOldKey() {
        return this.BackingStore.get("oldKey");
    }
    /**
     * Gets the oldValueData property value. Previous (i.e. before changed) registry key value data (contents).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOldValueData() {
        return this.BackingStore.get("oldValueData");
    }
    /**
     * Gets the oldValueName property value. Previous (i.e. before changed) registry key value name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOldValueName() {
        return this.BackingStore.get("oldValueName");
    }
    /**
     * Gets the operation property value. Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     * @return a RegistryOperation
     */
    @jakarta.annotation.Nullable
    public RegistryOperation getOperation() {
        return this.BackingStore.get("operation");
    }
    /**
     * Gets the processId property value. Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProcessId() {
        return this.BackingStore.get("processId");
    }
    /**
     * Gets the valueData property value. Current (i.e. changed) registry key value data (contents).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValueData() {
        return this.BackingStore.get("valueData");
    }
    /**
     * Gets the valueName property value. Current (i.e. changed) registry key value name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValueName() {
        return this.BackingStore.get("valueName");
    }
    /**
     * Gets the valueType property value. Registry key value type REGBINARY REGDWORD REGDWORDLITTLEENDIAN REGDWORDBIGENDIANREGEXPANDSZ REGLINK REGMULTISZ REGNONE REGQWORD REGQWORDLITTLEENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     * @return a RegistryValueType
     */
    @jakarta.annotation.Nullable
    public RegistryValueType getValueType() {
        return this.BackingStore.get("valueType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("hive", this.getHive());
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("oldKey", this.getOldKey());
        writer.writeStringValue("oldValueData", this.getOldValueData());
        writer.writeStringValue("oldValueName", this.getOldValueName());
        writer.writeEnumValue("operation", this.getOperation());
        writer.writeIntegerValue("processId", this.getProcessId());
        writer.writeStringValue("valueData", this.getValueData());
        writer.writeStringValue("valueName", this.getValueName());
        writer.writeEnumValue("valueType", this.getValueType());
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
     * Sets the hive property value. A Windows registry hive : HKEYCURRENTCONFIG HKEYCURRENTUSER HKEYLOCALMACHINE/SAM HKEYLOCALMACHINE/Security HKEYLOCALMACHINE/Software HKEYLOCALMACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     * @param value Value to set for the hive property.
     */
    public void setHive(@jakarta.annotation.Nullable final RegistryHive value) {
        this.BackingStore.set("hive", value);
    }
    /**
     * Sets the key property value. Current (i.e. changed) registry key (excludes HIVE).
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("key", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the oldKey property value. Previous (i.e. before changed) registry key (excludes HIVE).
     * @param value Value to set for the oldKey property.
     */
    public void setOldKey(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("oldKey", value);
    }
    /**
     * Sets the oldValueData property value. Previous (i.e. before changed) registry key value data (contents).
     * @param value Value to set for the oldValueData property.
     */
    public void setOldValueData(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("oldValueData", value);
    }
    /**
     * Sets the oldValueName property value. Previous (i.e. before changed) registry key value name.
     * @param value Value to set for the oldValueName property.
     */
    public void setOldValueName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("oldValueName", value);
    }
    /**
     * Sets the operation property value. Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final RegistryOperation value) {
        this.BackingStore.set("operation", value);
    }
    /**
     * Sets the processId property value. Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     * @param value Value to set for the processId property.
     */
    public void setProcessId(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("processId", value);
    }
    /**
     * Sets the valueData property value. Current (i.e. changed) registry key value data (contents).
     * @param value Value to set for the valueData property.
     */
    public void setValueData(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("valueData", value);
    }
    /**
     * Sets the valueName property value. Current (i.e. changed) registry key value name
     * @param value Value to set for the valueName property.
     */
    public void setValueName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("valueName", value);
    }
    /**
     * Sets the valueType property value. Registry key value type REGBINARY REGDWORD REGDWORDLITTLEENDIAN REGDWORDBIGENDIANREGEXPANDSZ REGLINK REGMULTISZ REGNONE REGQWORD REGQWORDLITTLEENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     * @param value Value to set for the valueType property.
     */
    public void setValueType(@jakarta.annotation.Nullable final RegistryValueType value) {
        this.BackingStore.set("valueType", value);
    }
}
