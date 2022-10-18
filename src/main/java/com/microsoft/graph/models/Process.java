package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Process implements AdditionalDataHolder, Parsable {
    /** User account identifier (user account context the process ran under) for example, AccountName, SID, and so on. */
    private String _accountName;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The full process invocation commandline including all parameters. */
    private String _commandLine;
    /** Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _createdDateTime;
    /** Complex type containing file hashes (cryptographic and location-sensitive). */
    private FileHash _fileHash;
    /** The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system. */
    private ProcessIntegrityLevel _integrityLevel;
    /** True if the process is elevated. */
    private Boolean _isElevated;
    /** The name of the process' Image file. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _parentProcessCreatedDateTime;
    /** The Process ID (PID) of the parent process. */
    private Integer _parentProcessId;
    /** The name of the image file of the parent process. */
    private String _parentProcessName;
    /** Full path, including filename. */
    private String _path;
    /** The Process ID (PID) of the process. */
    private Integer _processId;
    /**
     * Instantiates a new process and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Process() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.process");
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
        return this._accountName;
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
     * Gets the commandLine property value. The full process invocation commandline including all parameters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommandLine() {
        return this._commandLine;
    }
    /**
     * Gets the createdDateTime property value. Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Process currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(13) {{
            this.put("accountName", (n) -> { currentObject.setAccountName(n.getStringValue()); });
            this.put("commandLine", (n) -> { currentObject.setCommandLine(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("fileHash", (n) -> { currentObject.setFileHash(n.getObjectValue(FileHash::createFromDiscriminatorValue)); });
            this.put("integrityLevel", (n) -> { currentObject.setIntegrityLevel(n.getEnumValue(ProcessIntegrityLevel.class)); });
            this.put("isElevated", (n) -> { currentObject.setIsElevated(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("parentProcessCreatedDateTime", (n) -> { currentObject.setParentProcessCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("parentProcessId", (n) -> { currentObject.setParentProcessId(n.getIntegerValue()); });
            this.put("parentProcessName", (n) -> { currentObject.setParentProcessName(n.getStringValue()); });
            this.put("path", (n) -> { currentObject.setPath(n.getStringValue()); });
            this.put("processId", (n) -> { currentObject.setProcessId(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @return a fileHash
     */
    @javax.annotation.Nullable
    public FileHash getFileHash() {
        return this._fileHash;
    }
    /**
     * Gets the integrityLevel property value. The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
     * @return a processIntegrityLevel
     */
    @javax.annotation.Nullable
    public ProcessIntegrityLevel getIntegrityLevel() {
        return this._integrityLevel;
    }
    /**
     * Gets the isElevated property value. True if the process is elevated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsElevated() {
        return this._isElevated;
    }
    /**
     * Gets the name property value. The name of the process' Image file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the parentProcessCreatedDateTime property value. DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getParentProcessCreatedDateTime() {
        return this._parentProcessCreatedDateTime;
    }
    /**
     * Gets the parentProcessId property value. The Process ID (PID) of the parent process.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getParentProcessId() {
        return this._parentProcessId;
    }
    /**
     * Gets the parentProcessName property value. The name of the image file of the parent process.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentProcessName() {
        return this._parentProcessName;
    }
    /**
     * Gets the path property value. Full path, including filename.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this._path;
    }
    /**
     * Gets the processId property value. The Process ID (PID) of the process.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProcessId() {
        return this._processId;
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
        this._accountName = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the commandLine property value. The full process invocation commandline including all parameters.
     * @param value Value to set for the commandLine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommandLine(@javax.annotation.Nullable final String value) {
        this._commandLine = value;
    }
    /**
     * Sets the createdDateTime property value. Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @param value Value to set for the fileHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileHash(@javax.annotation.Nullable final FileHash value) {
        this._fileHash = value;
    }
    /**
     * Sets the integrityLevel property value. The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
     * @param value Value to set for the integrityLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntegrityLevel(@javax.annotation.Nullable final ProcessIntegrityLevel value) {
        this._integrityLevel = value;
    }
    /**
     * Sets the isElevated property value. True if the process is elevated.
     * @param value Value to set for the isElevated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsElevated(@javax.annotation.Nullable final Boolean value) {
        this._isElevated = value;
    }
    /**
     * Sets the name property value. The name of the process' Image file.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the parentProcessCreatedDateTime property value. DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the parentProcessCreatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._parentProcessCreatedDateTime = value;
    }
    /**
     * Sets the parentProcessId property value. The Process ID (PID) of the parent process.
     * @param value Value to set for the parentProcessId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessId(@javax.annotation.Nullable final Integer value) {
        this._parentProcessId = value;
    }
    /**
     * Sets the parentProcessName property value. The name of the image file of the parent process.
     * @param value Value to set for the parentProcessName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessName(@javax.annotation.Nullable final String value) {
        this._parentProcessName = value;
    }
    /**
     * Sets the path property value. Full path, including filename.
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this._path = value;
    }
    /**
     * Sets the processId property value. The Process ID (PID) of the process.
     * @param value Value to set for the processId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessId(@javax.annotation.Nullable final Integer value) {
        this._processId = value;
    }
}
