package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new FileEvidence and sets the default values.
     */
    public FileEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.fileEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileEvidence
     */
    @jakarta.annotation.Nonnull
    public static FileEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileEvidence();
    }
    /**
     * Gets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @return a DetectionStatus
     */
    @jakarta.annotation.Nullable
    public DetectionStatus getDetectionStatus() {
        return this.backingStore.get("detectionStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionStatus", (n) -> { this.setDetectionStatus(n.getEnumValue(DetectionStatus::forValue)); });
        deserializerMap.put("fileDetails", (n) -> { this.setFileDetails(n.getObjectValue(FileDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("mdeDeviceId", (n) -> { this.setMdeDeviceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileDetails property value. The file details.
     * @return a FileDetails
     */
    @jakarta.annotation.Nullable
    public FileDetails getFileDetails() {
        return this.backingStore.get("fileDetails");
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMdeDeviceId() {
        return this.backingStore.get("mdeDeviceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("detectionStatus", this.getDetectionStatus());
        writer.writeObjectValue("fileDetails", this.getFileDetails());
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
    }
    /**
     * Sets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @param value Value to set for the detectionStatus property.
     */
    public void setDetectionStatus(@jakarta.annotation.Nullable final DetectionStatus value) {
        this.backingStore.set("detectionStatus", value);
    }
    /**
     * Sets the fileDetails property value. The file details.
     * @param value Value to set for the fileDetails property.
     */
    public void setFileDetails(@jakarta.annotation.Nullable final FileDetails value) {
        this.backingStore.set("fileDetails", value);
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     */
    public void setMdeDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdeDeviceId", value);
    }
}
