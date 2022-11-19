package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImportedWindowsAutopilotDeviceIdentityUpload extends Entity implements Parsable {
    /** DateTime when the entity is created. */
    private OffsetDateTime _createdDateTimeUtc;
    /** Collection of all Autopilot devices as a part of this upload. */
    private java.util.List<ImportedWindowsAutopilotDeviceIdentity> _deviceIdentities;
    /** The status property */
    private ImportedWindowsAutopilotDeviceIdentityUploadStatus _status;
    /**
     * Instantiates a new ImportedWindowsAutopilotDeviceIdentityUpload and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityUpload() {
        super();
        this.setOdataType("#microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportedWindowsAutopilotDeviceIdentityUpload
     */
    @javax.annotation.Nonnull
    public static ImportedWindowsAutopilotDeviceIdentityUpload createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedWindowsAutopilotDeviceIdentityUpload();
    }
    /**
     * Gets the createdDateTimeUtc property value. DateTime when the entity is created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTimeUtc() {
        return this._createdDateTimeUtc;
    }
    /**
     * Gets the deviceIdentities property value. Collection of all Autopilot devices as a part of this upload.
     * @return a importedWindowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getDeviceIdentities() {
        return this._deviceIdentities;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ImportedWindowsAutopilotDeviceIdentityUpload currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTimeUtc", (n) -> { currentObject.setCreatedDateTimeUtc(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceIdentities", (n) -> { currentObject.setDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ImportedWindowsAutopilotDeviceIdentityUploadStatus.class)); });
        return deserializerMap
    }
    /**
     * Gets the status property value. The status property
     * @return a importedWindowsAutopilotDeviceIdentityUploadStatus
     */
    @javax.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityUploadStatus getStatus() {
        return this._status;
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
        writer.writeOffsetDateTimeValue("createdDateTimeUtc", this.getCreatedDateTimeUtc());
        writer.writeCollectionOfObjectValues("deviceIdentities", this.getDeviceIdentities());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTimeUtc property value. DateTime when the entity is created.
     * @param value Value to set for the createdDateTimeUtc property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTimeUtc(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTimeUtc = value;
    }
    /**
     * Sets the deviceIdentities property value. Collection of all Autopilot devices as a part of this upload.
     * @param value Value to set for the deviceIdentities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceIdentities(@javax.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this._deviceIdentities = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ImportedWindowsAutopilotDeviceIdentityUploadStatus value) {
        this._status = value;
    }
}
