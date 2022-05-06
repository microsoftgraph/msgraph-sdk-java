package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryKeyState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.  */
    private RegistryHive _hive;
    /** Current (i.e. changed) registry key (excludes HIVE).  */
    private String _key;
    /** Previous (i.e. before changed) registry key (excludes HIVE).  */
    private String _oldKey;
    /** Previous (i.e. before changed) registry key value data (contents).  */
    private String _oldValueData;
    /** Previous (i.e. before changed) registry key value name.  */
    private String _oldValueName;
    /** Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.  */
    private RegistryOperation _operation;
    /** Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).  */
    private Integer _processId;
    /** Current (i.e. changed) registry key value data (contents).  */
    private String _valueData;
    /** Current (i.e. changed) registry key value name  */
    private String _valueName;
    /** Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.  */
    private RegistryValueType _valueType;
    /**
     * Instantiates a new registryKeyState and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RegistryKeyState currentObject = this;
        return new HashMap<>(10) {{
            this.put("hive", (n) -> { currentObject.setHive(n.getEnumValue(RegistryHive.class)); });
            this.put("key", (n) -> { currentObject.setKey(n.getStringValue()); });
            this.put("oldKey", (n) -> { currentObject.setOldKey(n.getStringValue()); });
            this.put("oldValueData", (n) -> { currentObject.setOldValueData(n.getStringValue()); });
            this.put("oldValueName", (n) -> { currentObject.setOldValueName(n.getStringValue()); });
            this.put("operation", (n) -> { currentObject.setOperation(n.getEnumValue(RegistryOperation.class)); });
            this.put("processId", (n) -> { currentObject.setProcessId(n.getIntegerValue()); });
            this.put("valueData", (n) -> { currentObject.setValueData(n.getStringValue()); });
            this.put("valueName", (n) -> { currentObject.setValueName(n.getStringValue()); });
            this.put("valueType", (n) -> { currentObject.setValueType(n.getEnumValue(RegistryValueType.class)); });
        }};
    }
    /**
     * Gets the hive property value. A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     * @return a registryHive
     */
    @javax.annotation.Nullable
    public RegistryHive getHive() {
        return this._hive;
    }
    /**
     * Gets the key property value. Current (i.e. changed) registry key (excludes HIVE).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKey() {
        return this._key;
    }
    /**
     * Gets the oldKey property value. Previous (i.e. before changed) registry key (excludes HIVE).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldKey() {
        return this._oldKey;
    }
    /**
     * Gets the oldValueData property value. Previous (i.e. before changed) registry key value data (contents).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldValueData() {
        return this._oldValueData;
    }
    /**
     * Gets the oldValueName property value. Previous (i.e. before changed) registry key value name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldValueName() {
        return this._oldValueName;
    }
    /**
     * Gets the operation property value. Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     * @return a registryOperation
     */
    @javax.annotation.Nullable
    public RegistryOperation getOperation() {
        return this._operation;
    }
    /**
     * Gets the processId property value. Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProcessId() {
        return this._processId;
    }
    /**
     * Gets the valueData property value. Current (i.e. changed) registry key value data (contents).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueData() {
        return this._valueData;
    }
    /**
     * Gets the valueName property value. Current (i.e. changed) registry key value name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueName() {
        return this._valueName;
    }
    /**
     * Gets the valueType property value. Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     * @return a registryValueType
     */
    @javax.annotation.Nullable
    public RegistryValueType getValueType() {
        return this._valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("hive", this.getHive());
        writer.writeStringValue("key", this.getKey());
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the hive property value. A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     * @param value Value to set for the hive property.
     * @return a void
     */
    public void setHive(@javax.annotation.Nullable final RegistryHive value) {
        this._hive = value;
    }
    /**
     * Sets the key property value. Current (i.e. changed) registry key (excludes HIVE).
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final String value) {
        this._key = value;
    }
    /**
     * Sets the oldKey property value. Previous (i.e. before changed) registry key (excludes HIVE).
     * @param value Value to set for the oldKey property.
     * @return a void
     */
    public void setOldKey(@javax.annotation.Nullable final String value) {
        this._oldKey = value;
    }
    /**
     * Sets the oldValueData property value. Previous (i.e. before changed) registry key value data (contents).
     * @param value Value to set for the oldValueData property.
     * @return a void
     */
    public void setOldValueData(@javax.annotation.Nullable final String value) {
        this._oldValueData = value;
    }
    /**
     * Sets the oldValueName property value. Previous (i.e. before changed) registry key value name.
     * @param value Value to set for the oldValueName property.
     * @return a void
     */
    public void setOldValueName(@javax.annotation.Nullable final String value) {
        this._oldValueName = value;
    }
    /**
     * Sets the operation property value. Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     * @param value Value to set for the operation property.
     * @return a void
     */
    public void setOperation(@javax.annotation.Nullable final RegistryOperation value) {
        this._operation = value;
    }
    /**
     * Sets the processId property value. Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     * @param value Value to set for the processId property.
     * @return a void
     */
    public void setProcessId(@javax.annotation.Nullable final Integer value) {
        this._processId = value;
    }
    /**
     * Sets the valueData property value. Current (i.e. changed) registry key value data (contents).
     * @param value Value to set for the valueData property.
     * @return a void
     */
    public void setValueData(@javax.annotation.Nullable final String value) {
        this._valueData = value;
    }
    /**
     * Sets the valueName property value. Current (i.e. changed) registry key value name
     * @param value Value to set for the valueName property.
     * @return a void
     */
    public void setValueName(@javax.annotation.Nullable final String value) {
        this._valueName = value;
    }
    /**
     * Sets the valueType property value. Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     * @param value Value to set for the valueType property.
     * @return a void
     */
    public void setValueType(@javax.annotation.Nullable final RegistryValueType value) {
        this._valueType = value;
    }
}
