package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class BitlockerRecoveryKey extends Entity implements Parsable {
    /** The date and time when the key was originally backed up to Azure Active Directory. Not nullable. */
    private OffsetDateTime _createdDateTime;
    /** Identifier of the device the BitLocker key is originally backed up from. Supports $filter (eq). */
    private String _deviceId;
    /** The BitLocker recovery key. Returned only on $select. Not nullable. */
    private String _key;
    /** Indicates the type of volume the BitLocker key is associated with. The possible values are: 1 (for operatingSystemVolume), 2 (for fixedDataVolume), 3 (for removableDataVolume), and 4 (for unknownFutureValue). */
    private VolumeType _volumeType;
    /**
     * Instantiates a new bitlockerRecoveryKey and sets the default values.
     * @return a void
     */
    public BitlockerRecoveryKey() {
        super();
        this.setOdataType("#microsoft.graph.bitlockerRecoveryKey");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitlockerRecoveryKey
     */
    @javax.annotation.Nonnull
    public static BitlockerRecoveryKey createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitlockerRecoveryKey();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the key was originally backed up to Azure Active Directory. Not nullable.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deviceId property value. Identifier of the device the BitLocker key is originally backed up from. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BitlockerRecoveryKey currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("key", (n) -> { currentObject.setKey(n.getStringValue()); });
            this.put("volumeType", (n) -> { currentObject.setVolumeType(n.getEnumValue(VolumeType.class)); });
        }};
    }
    /**
     * Gets the key property value. The BitLocker recovery key. Returned only on $select. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKey() {
        return this._key;
    }
    /**
     * Gets the volumeType property value. Indicates the type of volume the BitLocker key is associated with. The possible values are: 1 (for operatingSystemVolume), 2 (for fixedDataVolume), 3 (for removableDataVolume), and 4 (for unknownFutureValue).
     * @return a volumeType
     */
    @javax.annotation.Nullable
    public VolumeType getVolumeType() {
        return this._volumeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("key", this.getKey());
        writer.writeEnumValue("volumeType", this.getVolumeType());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the key was originally backed up to Azure Active Directory. Not nullable.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deviceId property value. Identifier of the device the BitLocker key is originally backed up from. Supports $filter (eq).
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the key property value. The BitLocker recovery key. Returned only on $select. Not nullable.
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final String value) {
        this._key = value;
    }
    /**
     * Sets the volumeType property value. Indicates the type of volume the BitLocker key is associated with. The possible values are: 1 (for operatingSystemVolume), 2 (for fixedDataVolume), 3 (for removableDataVolume), and 4 (for unknownFutureValue).
     * @param value Value to set for the volumeType property.
     * @return a void
     */
    public void setVolumeType(@javax.annotation.Nullable final VolumeType value) {
        this._volumeType = value;
    }
}
