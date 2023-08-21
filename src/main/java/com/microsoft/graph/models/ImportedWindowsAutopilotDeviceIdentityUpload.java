package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Import windows autopilot devices using upload.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImportedWindowsAutopilotDeviceIdentityUpload extends Entity implements Parsable {
    /**
     * DateTime when the entity is created.
     */
    private OffsetDateTime createdDateTimeUtc;
    /**
     * Collection of all Autopilot devices as a part of this upload.
     */
    private java.util.List<ImportedWindowsAutopilotDeviceIdentity> deviceIdentities;
    /**
     * The status property
     */
    private ImportedWindowsAutopilotDeviceIdentityUploadStatus status;
    /**
     * Instantiates a new importedWindowsAutopilotDeviceIdentityUpload and sets the default values.
     */
    public ImportedWindowsAutopilotDeviceIdentityUpload() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedWindowsAutopilotDeviceIdentityUpload
     */
    @jakarta.annotation.Nonnull
    public static ImportedWindowsAutopilotDeviceIdentityUpload createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedWindowsAutopilotDeviceIdentityUpload();
    }
    /**
     * Gets the createdDateTimeUtc property value. DateTime when the entity is created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTimeUtc() {
        return this.createdDateTimeUtc;
    }
    /**
     * Gets the deviceIdentities property value. Collection of all Autopilot devices as a part of this upload.
     * @return a importedWindowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getDeviceIdentities() {
        return this.deviceIdentities;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTimeUtc", (n) -> { this.setCreatedDateTimeUtc(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceIdentities", (n) -> { this.setDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ImportedWindowsAutopilotDeviceIdentityUploadStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. The status property
     * @return a importedWindowsAutopilotDeviceIdentityUploadStatus
     */
    @jakarta.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityUploadStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTimeUtc", this.getCreatedDateTimeUtc());
        writer.writeCollectionOfObjectValues("deviceIdentities", this.getDeviceIdentities());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTimeUtc property value. DateTime when the entity is created.
     * @param value Value to set for the createdDateTimeUtc property.
     */
    public void setCreatedDateTimeUtc(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTimeUtc = value;
    }
    /**
     * Sets the deviceIdentities property value. Collection of all Autopilot devices as a part of this upload.
     * @param value Value to set for the deviceIdentities property.
     */
    public void setDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this.deviceIdentities = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ImportedWindowsAutopilotDeviceIdentityUploadStatus value) {
        this.status = value;
    }
}
