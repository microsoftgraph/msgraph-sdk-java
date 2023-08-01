package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileEvidence extends AlertEvidence implements Parsable {
    /**
     * The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     */
    private DetectionStatus detectionStatus;
    /**
     * The file details.
     */
    private FileDetails fileDetails;
    /**
     * A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     */
    private String mdeDeviceId;
    /**
     * Instantiates a new fileEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FileEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.fileEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileEvidence
     */
    @javax.annotation.Nonnull
    public static FileEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileEvidence();
    }
    /**
     * Gets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @return a detectionStatus
     */
    @javax.annotation.Nullable
    public DetectionStatus getDetectionStatus() {
        return this.detectionStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionStatus", (n) -> { this.setDetectionStatus(n.getEnumValue(DetectionStatus.class)); });
        deserializerMap.put("fileDetails", (n) -> { this.setFileDetails(n.getObjectValue(FileDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("mdeDeviceId", (n) -> { this.setMdeDeviceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileDetails property value. The file details.
     * @return a fileDetails
     */
    @javax.annotation.Nullable
    public FileDetails getFileDetails() {
        return this.fileDetails;
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdeDeviceId() {
        return this.mdeDeviceId;
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
        writer.writeObjectValue("fileDetails", this.getFileDetails());
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
    }
    /**
     * Sets the detectionStatus property value. The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
     * @param value Value to set for the detectionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionStatus(@javax.annotation.Nullable final DetectionStatus value) {
        this.detectionStatus = value;
    }
    /**
     * Sets the fileDetails property value. The file details.
     * @param value Value to set for the fileDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileDetails(@javax.annotation.Nullable final FileDetails value) {
        this.fileDetails = value;
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdeDeviceId(@javax.annotation.Nullable final String value) {
        this.mdeDeviceId = value;
    }
}
