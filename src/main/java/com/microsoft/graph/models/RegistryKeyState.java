package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryKeyState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     */
    private RegistryHive hive;
    /**
     * Current (i.e. changed) registry key (excludes HIVE).
     */
    private String key;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Previous (i.e. before changed) registry key (excludes HIVE).
     */
    private String oldKey;
    /**
     * Previous (i.e. before changed) registry key value data (contents).
     */
    private String oldValueData;
    /**
     * Previous (i.e. before changed) registry key value name.
     */
    private String oldValueName;
    /**
     * Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     */
    private RegistryOperation operation;
    /**
     * Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     */
    private Integer processId;
    /**
     * Current (i.e. changed) registry key value data (contents).
     */
    private String valueData;
    /**
     * Current (i.e. changed) registry key value name
     */
    private String valueName;
    /**
     * Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     */
    private RegistryValueType valueType;
    /**
     * Instantiates a new registryKeyState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistryKeyState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a registryKeyState
     */
    @javax.annotation.Nonnull
    public static RegistryKeyState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryKeyState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the hive property value. A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     * @return a registryHive
     */
    @javax.annotation.Nullable
    public RegistryHive getHive() {
        return this.hive;
    }
    /**
     * Gets the key property value. Current (i.e. changed) registry key (excludes HIVE).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the oldKey property value. Previous (i.e. before changed) registry key (excludes HIVE).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldKey() {
        return this.oldKey;
    }
    /**
     * Gets the oldValueData property value. Previous (i.e. before changed) registry key value data (contents).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldValueData() {
        return this.oldValueData;
    }
    /**
     * Gets the oldValueName property value. Previous (i.e. before changed) registry key value name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldValueName() {
        return this.oldValueName;
    }
    /**
     * Gets the operation property value. Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     * @return a registryOperation
     */
    @javax.annotation.Nullable
    public RegistryOperation getOperation() {
        return this.operation;
    }
    /**
     * Gets the processId property value. Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProcessId() {
        return this.processId;
    }
    /**
     * Gets the valueData property value. Current (i.e. changed) registry key value data (contents).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueData() {
        return this.valueData;
    }
    /**
     * Gets the valueName property value. Current (i.e. changed) registry key value name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueName() {
        return this.valueName;
    }
    /**
     * Gets the valueType property value. Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     * @return a registryValueType
     */
    @javax.annotation.Nullable
    public RegistryValueType getValueType() {
        return this.valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hive property value. A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     * @param value Value to set for the hive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHive(@javax.annotation.Nullable final RegistryHive value) {
        this.hive = value;
    }
    /**
     * Sets the key property value. Current (i.e. changed) registry key (excludes HIVE).
     * @param value Value to set for the key property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKey(@javax.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the oldKey property value. Previous (i.e. before changed) registry key (excludes HIVE).
     * @param value Value to set for the oldKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOldKey(@javax.annotation.Nullable final String value) {
        this.oldKey = value;
    }
    /**
     * Sets the oldValueData property value. Previous (i.e. before changed) registry key value data (contents).
     * @param value Value to set for the oldValueData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOldValueData(@javax.annotation.Nullable final String value) {
        this.oldValueData = value;
    }
    /**
     * Sets the oldValueName property value. Previous (i.e. before changed) registry key value name.
     * @param value Value to set for the oldValueName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOldValueName(@javax.annotation.Nullable final String value) {
        this.oldValueName = value;
    }
    /**
     * Sets the operation property value. Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     * @param value Value to set for the operation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperation(@javax.annotation.Nullable final RegistryOperation value) {
        this.operation = value;
    }
    /**
     * Sets the processId property value. Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     * @param value Value to set for the processId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessId(@javax.annotation.Nullable final Integer value) {
        this.processId = value;
    }
    /**
     * Sets the valueData property value. Current (i.e. changed) registry key value data (contents).
     * @param value Value to set for the valueData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueData(@javax.annotation.Nullable final String value) {
        this.valueData = value;
    }
    /**
     * Sets the valueName property value. Current (i.e. changed) registry key value name
     * @param value Value to set for the valueName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueName(@javax.annotation.Nullable final String value) {
        this.valueName = value;
    }
    /**
     * Sets the valueType property value. Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     * @param value Value to set for the valueType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueType(@javax.annotation.Nullable final RegistryValueType value) {
        this.valueType = value;
    }
}
