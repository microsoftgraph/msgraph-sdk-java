package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProcessEvidence extends AlertEvidence implements Parsable {
    /** The detectionStatus property */
    private DetectionStatus _detectionStatus;
    /** The imageFile property */
    private FileDetails _imageFile;
    /** The mdeDeviceId property */
    private String _mdeDeviceId;
    /** The parentProcessCreationDateTime property */
    private OffsetDateTime _parentProcessCreationDateTime;
    /** The parentProcessId property */
    private Long _parentProcessId;
    /** The parentProcessImageFile property */
    private FileDetails _parentProcessImageFile;
    /** The processCommandLine property */
    private String _processCommandLine;
    /** The processCreationDateTime property */
    private OffsetDateTime _processCreationDateTime;
    /** The processId property */
    private Long _processId;
    /** The userAccount property */
    private UserAccount _userAccount;
    /**
     * Instantiates a new ProcessEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProcessEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProcessEvidence
     */
    @javax.annotation.Nonnull
    public static ProcessEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessEvidence();
    }
    /**
     * Gets the detectionStatus property value. The detectionStatus property
     * @return a detectionStatus
     */
    @javax.annotation.Nullable
    public DetectionStatus getDetectionStatus() {
        return this._detectionStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionStatus", (n) -> { this.setDetectionStatus(n.getEnumValue(DetectionStatus.class)); });
        deserializerMap.put("imageFile", (n) -> { this.setImageFile(n.getObjectValue(FileDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("mdeDeviceId", (n) -> { this.setMdeDeviceId(n.getStringValue()); });
        deserializerMap.put("parentProcessCreationDateTime", (n) -> { this.setParentProcessCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parentProcessId", (n) -> { this.setParentProcessId(n.getLongValue()); });
        deserializerMap.put("parentProcessImageFile", (n) -> { this.setParentProcessImageFile(n.getObjectValue(FileDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("processCommandLine", (n) -> { this.setProcessCommandLine(n.getStringValue()); });
        deserializerMap.put("processCreationDateTime", (n) -> { this.setProcessCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("processId", (n) -> { this.setProcessId(n.getLongValue()); });
        deserializerMap.put("userAccount", (n) -> { this.setUserAccount(n.getObjectValue(UserAccount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the imageFile property value. The imageFile property
     * @return a fileDetails
     */
    @javax.annotation.Nullable
    public FileDetails getImageFile() {
        return this._imageFile;
    }
    /**
     * Gets the mdeDeviceId property value. The mdeDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdeDeviceId() {
        return this._mdeDeviceId;
    }
    /**
     * Gets the parentProcessCreationDateTime property value. The parentProcessCreationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getParentProcessCreationDateTime() {
        return this._parentProcessCreationDateTime;
    }
    /**
     * Gets the parentProcessId property value. The parentProcessId property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getParentProcessId() {
        return this._parentProcessId;
    }
    /**
     * Gets the parentProcessImageFile property value. The parentProcessImageFile property
     * @return a fileDetails
     */
    @javax.annotation.Nullable
    public FileDetails getParentProcessImageFile() {
        return this._parentProcessImageFile;
    }
    /**
     * Gets the processCommandLine property value. The processCommandLine property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProcessCommandLine() {
        return this._processCommandLine;
    }
    /**
     * Gets the processCreationDateTime property value. The processCreationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getProcessCreationDateTime() {
        return this._processCreationDateTime;
    }
    /**
     * Gets the processId property value. The processId property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getProcessId() {
        return this._processId;
    }
    /**
     * Gets the userAccount property value. The userAccount property
     * @return a userAccount
     */
    @javax.annotation.Nullable
    public UserAccount getUserAccount() {
        return this._userAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("detectionStatus", this.getDetectionStatus());
        writer.writeObjectValue("imageFile", this.getImageFile());
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
        writer.writeOffsetDateTimeValue("parentProcessCreationDateTime", this.getParentProcessCreationDateTime());
        writer.writeLongValue("parentProcessId", this.getParentProcessId());
        writer.writeObjectValue("parentProcessImageFile", this.getParentProcessImageFile());
        writer.writeStringValue("processCommandLine", this.getProcessCommandLine());
        writer.writeOffsetDateTimeValue("processCreationDateTime", this.getProcessCreationDateTime());
        writer.writeLongValue("processId", this.getProcessId());
        writer.writeObjectValue("userAccount", this.getUserAccount());
    }
    /**
     * Sets the detectionStatus property value. The detectionStatus property
     * @param value Value to set for the detectionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionStatus(@javax.annotation.Nullable final DetectionStatus value) {
        this._detectionStatus = value;
    }
    /**
     * Sets the imageFile property value. The imageFile property
     * @param value Value to set for the imageFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageFile(@javax.annotation.Nullable final FileDetails value) {
        this._imageFile = value;
    }
    /**
     * Sets the mdeDeviceId property value. The mdeDeviceId property
     * @param value Value to set for the mdeDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdeDeviceId(@javax.annotation.Nullable final String value) {
        this._mdeDeviceId = value;
    }
    /**
     * Sets the parentProcessCreationDateTime property value. The parentProcessCreationDateTime property
     * @param value Value to set for the parentProcessCreationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._parentProcessCreationDateTime = value;
    }
    /**
     * Sets the parentProcessId property value. The parentProcessId property
     * @param value Value to set for the parentProcessId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessId(@javax.annotation.Nullable final Long value) {
        this._parentProcessId = value;
    }
    /**
     * Sets the parentProcessImageFile property value. The parentProcessImageFile property
     * @param value Value to set for the parentProcessImageFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentProcessImageFile(@javax.annotation.Nullable final FileDetails value) {
        this._parentProcessImageFile = value;
    }
    /**
     * Sets the processCommandLine property value. The processCommandLine property
     * @param value Value to set for the processCommandLine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessCommandLine(@javax.annotation.Nullable final String value) {
        this._processCommandLine = value;
    }
    /**
     * Sets the processCreationDateTime property value. The processCreationDateTime property
     * @param value Value to set for the processCreationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._processCreationDateTime = value;
    }
    /**
     * Sets the processId property value. The processId property
     * @param value Value to set for the processId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessId(@javax.annotation.Nullable final Long value) {
        this._processId = value;
    }
    /**
     * Sets the userAccount property value. The userAccount property
     * @param value Value to set for the userAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccount(@javax.annotation.Nullable final UserAccount value) {
        this._userAccount = value;
    }
}
