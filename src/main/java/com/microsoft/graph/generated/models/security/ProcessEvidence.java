package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProcessEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link ProcessEvidence} and sets the default values.
     */
    public ProcessEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.processEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessEvidence}
     */
    @jakarta.annotation.Nonnull
    public static ProcessEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessEvidence();
    }
    /**
     * Gets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @return a {@link DetectionStatus}
     */
    @jakarta.annotation.Nullable
    public DetectionStatus getDetectionStatus() {
        return this.backingStore.get("detectionStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionStatus", (n) -> { this.setDetectionStatus(n.getEnumValue(DetectionStatus::forValue)); });
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
     * Gets the imageFile property value. Image file details.
     * @return a {@link FileDetails}
     */
    @jakarta.annotation.Nullable
    public FileDetails getImageFile() {
        return this.backingStore.get("imageFile");
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMdeDeviceId() {
        return this.backingStore.get("mdeDeviceId");
    }
    /**
     * Gets the parentProcessCreationDateTime property value. Date and time when the parent of the process was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getParentProcessCreationDateTime() {
        return this.backingStore.get("parentProcessCreationDateTime");
    }
    /**
     * Gets the parentProcessId property value. Process ID (PID) of the parent process that spawned the process.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getParentProcessId() {
        return this.backingStore.get("parentProcessId");
    }
    /**
     * Gets the parentProcessImageFile property value. Parent process image file details.
     * @return a {@link FileDetails}
     */
    @jakarta.annotation.Nullable
    public FileDetails getParentProcessImageFile() {
        return this.backingStore.get("parentProcessImageFile");
    }
    /**
     * Gets the processCommandLine property value. Command line used to create the new process.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessCommandLine() {
        return this.backingStore.get("processCommandLine");
    }
    /**
     * Gets the processCreationDateTime property value. Date and time when the process was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProcessCreationDateTime() {
        return this.backingStore.get("processCreationDateTime");
    }
    /**
     * Gets the processId property value. Process ID (PID) of the newly created process.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getProcessId() {
        return this.backingStore.get("processId");
    }
    /**
     * Gets the userAccount property value. User details of the user that ran the process.
     * @return a {@link UserAccount}
     */
    @jakarta.annotation.Nullable
    public UserAccount getUserAccount() {
        return this.backingStore.get("userAccount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @param value Value to set for the detectionStatus property.
     */
    public void setDetectionStatus(@jakarta.annotation.Nullable final DetectionStatus value) {
        this.backingStore.set("detectionStatus", value);
    }
    /**
     * Sets the imageFile property value. Image file details.
     * @param value Value to set for the imageFile property.
     */
    public void setImageFile(@jakarta.annotation.Nullable final FileDetails value) {
        this.backingStore.set("imageFile", value);
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     */
    public void setMdeDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdeDeviceId", value);
    }
    /**
     * Sets the parentProcessCreationDateTime property value. Date and time when the parent of the process was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the parentProcessCreationDateTime property.
     */
    public void setParentProcessCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("parentProcessCreationDateTime", value);
    }
    /**
     * Sets the parentProcessId property value. Process ID (PID) of the parent process that spawned the process.
     * @param value Value to set for the parentProcessId property.
     */
    public void setParentProcessId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("parentProcessId", value);
    }
    /**
     * Sets the parentProcessImageFile property value. Parent process image file details.
     * @param value Value to set for the parentProcessImageFile property.
     */
    public void setParentProcessImageFile(@jakarta.annotation.Nullable final FileDetails value) {
        this.backingStore.set("parentProcessImageFile", value);
    }
    /**
     * Sets the processCommandLine property value. Command line used to create the new process.
     * @param value Value to set for the processCommandLine property.
     */
    public void setProcessCommandLine(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processCommandLine", value);
    }
    /**
     * Sets the processCreationDateTime property value. Date and time when the process was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the processCreationDateTime property.
     */
    public void setProcessCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("processCreationDateTime", value);
    }
    /**
     * Sets the processId property value. Process ID (PID) of the newly created process.
     * @param value Value to set for the processId property.
     */
    public void setProcessId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("processId", value);
    }
    /**
     * Sets the userAccount property value. User details of the user that ran the process.
     * @param value Value to set for the userAccount property.
     */
    public void setUserAccount(@jakarta.annotation.Nullable final UserAccount value) {
        this.backingStore.set("userAccount", value);
    }
}
