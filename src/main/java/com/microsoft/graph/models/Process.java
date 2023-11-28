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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Process implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new Process and sets the default values.
     */
    public Process() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Process
     */
    @jakarta.annotation.Nonnull
    public static Process createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Process();
    }
    /**
     * Gets the accountName property value. User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.backingStore.get("accountName");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the commandLine property value. The full process invocation commandline including all parameters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCommandLine() {
        return this.backingStore.get("commandLine");
    }
    /**
     * Gets the createdDateTime property value. Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("commandLine", (n) -> { this.setCommandLine(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileHash", (n) -> { this.setFileHash(n.getObjectValue(FileHash::createFromDiscriminatorValue)); });
        deserializerMap.put("integrityLevel", (n) -> { this.setIntegrityLevel(n.getEnumValue(ProcessIntegrityLevel::forValue)); });
        deserializerMap.put("isElevated", (n) -> { this.setIsElevated(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentProcessCreatedDateTime", (n) -> { this.setParentProcessCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parentProcessId", (n) -> { this.setParentProcessId(n.getIntegerValue()); });
        deserializerMap.put("parentProcessName", (n) -> { this.setParentProcessName(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("processId", (n) -> { this.setProcessId(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @return a FileHash
     */
    @jakarta.annotation.Nullable
    public FileHash getFileHash() {
        return this.backingStore.get("fileHash");
    }
    /**
     * Gets the integrityLevel property value. The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
     * @return a ProcessIntegrityLevel
     */
    @jakarta.annotation.Nullable
    public ProcessIntegrityLevel getIntegrityLevel() {
        return this.backingStore.get("integrityLevel");
    }
    /**
     * Gets the isElevated property value. True if the process is elevated.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsElevated() {
        return this.backingStore.get("isElevated");
    }
    /**
     * Gets the name property value. The name of the process' Image file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the parentProcessCreatedDateTime property value. DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getParentProcessCreatedDateTime() {
        return this.backingStore.get("parentProcessCreatedDateTime");
    }
    /**
     * Gets the parentProcessId property value. The Process ID (PID) of the parent process.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getParentProcessId() {
        return this.backingStore.get("parentProcessId");
    }
    /**
     * Gets the parentProcessName property value. The name of the image file of the parent process.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentProcessName() {
        return this.backingStore.get("parentProcessName");
    }
    /**
     * Gets the path property value. Full path, including filename.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.backingStore.get("path");
    }
    /**
     * Gets the processId property value. The Process ID (PID) of the process.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProcessId() {
        return this.backingStore.get("processId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeStringValue("commandLine", this.getCommandLine());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("fileHash", this.getFileHash());
        writer.writeEnumValue("integrityLevel", this.getIntegrityLevel());
        writer.writeBooleanValue("isElevated", this.getIsElevated());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("parentProcessCreatedDateTime", this.getParentProcessCreatedDateTime());
        writer.writeIntegerValue("parentProcessId", this.getParentProcessId());
        writer.writeStringValue("parentProcessName", this.getParentProcessName());
        writer.writeStringValue("path", this.getPath());
        writer.writeIntegerValue("processId", this.getProcessId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountName property value. User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountName", value);
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
     * Sets the commandLine property value. The full process invocation commandline including all parameters.
     * @param value Value to set for the commandLine property.
     */
    public void setCommandLine(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commandLine", value);
    }
    /**
     * Sets the createdDateTime property value. Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @param value Value to set for the fileHash property.
     */
    public void setFileHash(@jakarta.annotation.Nullable final FileHash value) {
        this.backingStore.set("fileHash", value);
    }
    /**
     * Sets the integrityLevel property value. The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
     * @param value Value to set for the integrityLevel property.
     */
    public void setIntegrityLevel(@jakarta.annotation.Nullable final ProcessIntegrityLevel value) {
        this.backingStore.set("integrityLevel", value);
    }
    /**
     * Sets the isElevated property value. True if the process is elevated.
     * @param value Value to set for the isElevated property.
     */
    public void setIsElevated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isElevated", value);
    }
    /**
     * Sets the name property value. The name of the process' Image file.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the parentProcessCreatedDateTime property value. DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the parentProcessCreatedDateTime property.
     */
    public void setParentProcessCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("parentProcessCreatedDateTime", value);
    }
    /**
     * Sets the parentProcessId property value. The Process ID (PID) of the parent process.
     * @param value Value to set for the parentProcessId property.
     */
    public void setParentProcessId(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("parentProcessId", value);
    }
    /**
     * Sets the parentProcessName property value. The name of the image file of the parent process.
     * @param value Value to set for the parentProcessName property.
     */
    public void setParentProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentProcessName", value);
    }
    /**
     * Sets the path property value. Full path, including filename.
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("path", value);
    }
    /**
     * Sets the processId property value. The Process ID (PID) of the process.
     * @param value Value to set for the processId property.
     */
    public void setProcessId(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("processId", value);
    }
}
