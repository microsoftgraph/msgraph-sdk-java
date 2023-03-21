package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Process implements AdditionalDataHolder, Parsable {
    /** User account identifier (user account context the process ran under) for example, AccountName, SID, and so on. */
    private String accountName;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The full process invocation commandline including all parameters. */
    private String commandLine;
    /** Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime createdDateTime;
    /** Complex type containing file hashes (cryptographic and location-sensitive). */
    private FileHash fileHash;
    /** The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system. */
    private ProcessIntegrityLevel integrityLevel;
    /** True if the process is elevated. */
    private Boolean isElevated;
    /** The name of the process' Image file. */
    private String name;
    /** The OdataType property */
    private String odataType;
    /** DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime parentProcessCreatedDateTime;
    /** The Process ID (PID) of the parent process. */
    private Integer parentProcessId;
    /** The name of the image file of the parent process. */
    private String parentProcessName;
    /** Full path, including filename. */
    private String path;
    /** The Process ID (PID) of the process. */
    private Integer processId;
    /**
     * Instantiates a new process and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Process() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a process
     */
    @javax.annotation.Nonnull
    public static Process createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Process();
    }
    /**
     * Gets the accountName property value. User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
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
     * Gets the commandLine property value. The full process invocation commandline including all parameters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommandLine() {
        return this.commandLine;
    }
    /**
     * Gets the createdDateTime property value. Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("commandLine", (n) -> { this.setCommandLine(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fileHash", (n) -> { this.setFileHash(n.getObjectValue(FileHash::createFromDiscriminatorValue)); });
        deserializerMap.put("integrityLevel", (n) -> { this.setIntegrityLevel(n.getEnumValue(ProcessIntegrityLevel.class)); });
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
     * @return a fileHash
     */
    @javax.annotation.Nullable
    public FileHash getFileHash() {
        return this.fileHash;
    }
    /**
     * Gets the integrityLevel property value. The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
     * @return a processIntegrityLevel
     */
    @javax.annotation.Nullable
    public ProcessIntegrityLevel getIntegrityLevel() {
        return this.integrityLevel;
    }
    /**
     * Gets the isElevated property value. True if the process is elevated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsElevated() {
        return this.isElevated;
    }
    /**
     * Gets the name property value. The name of the process' Image file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the parentProcessCreatedDateTime property value. DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getParentProcessCreatedDateTime() {
        return this.parentProcessCreatedDateTime;
    }
    /**
     * Gets the parentProcessId property value. The Process ID (PID) of the parent process.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getParentProcessId() {
        return this.parentProcessId;
    }
    /**
     * Gets the parentProcessName property value. The name of the image file of the parent process.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentProcessName() {
        return this.parentProcessName;
    }
    /**
     * Gets the path property value. Full path, including filename.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the processId property value. The Process ID (PID) of the process.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProcessId() {
        return this.processId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this.accountName = value;
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
     * Sets the commandLine property value. The full process invocation commandline including all parameters.
     * @param value Value to set for the commandLine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommandLine(@javax.annotation.Nullable final String value) {
        this.commandLine = value;
    }
    /**
     * Sets the createdDateTime property value. Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @param value Value to set for the fileHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileHash(@javax.annotation.Nullable final FileHash value) {
        this.fileHash = value;
    }
    /**
     * Sets the integrityLevel property value. The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
     * @param value Value to set for the integrityLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntegrityLevel(@javax.annotation.Nullable final ProcessIntegrityLevel value) {
        this.integrityLevel = value;
    }
    /**
     * Sets the isElevated property value. True if the process is elevated.
     * @param value Value to set for the isElevated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsElevated(@javax.annotation.Nullable final Boolean value) {
        this.isElevated = value;
    }
    /**
     * Sets the name property value. The name of the process' Image file.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the parentProcessCreatedDateTime property value. DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the parentProcessCreatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.parentProcessCreatedDateTime = value;
    }
    /**
     * Sets the parentProcessId property value. The Process ID (PID) of the parent process.
     * @param value Value to set for the parentProcessId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessId(@javax.annotation.Nullable final Integer value) {
        this.parentProcessId = value;
    }
    /**
     * Sets the parentProcessName property value. The name of the image file of the parent process.
     * @param value Value to set for the parentProcessName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessName(@javax.annotation.Nullable final String value) {
        this.parentProcessName = value;
    }
    /**
     * Sets the path property value. Full path, including filename.
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the processId property value. The Process ID (PID) of the process.
     * @param value Value to set for the processId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessId(@javax.annotation.Nullable final Integer value) {
        this.processId = value;
    }
}
