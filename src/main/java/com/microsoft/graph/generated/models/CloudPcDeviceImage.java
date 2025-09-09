package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcDeviceImage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcDeviceImage} and sets the default values.
     */
    public CloudPcDeviceImage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcDeviceImage}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDeviceImage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDeviceImage();
    }
    /**
     * Gets the displayName property value. The display name of the associated device image. The device image display name and the version are used to uniquely identify the Cloud PC device image. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the errorCode property value. The error code of the status of the image that indicates why the upload failed, if applicable. Possible values are: internalServerError, sourceImageNotFound, osVersionNotSupported, sourceImageInvalid, sourceImageNotGeneralized, unknownFutureValue, vmAlreadyAzureAdJoined, paidSourceImageNotSupport, sourceImageNotSupportCustomizeVMName, sourceImageSizeExceedsLimitation. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: vmAlreadyAzureAdJoined, paidSourceImageNotSupport, sourceImageNotSupportCustomizeVMName, sourceImageSizeExceedsLimitation. Read-only.
     * @return a {@link CloudPcDeviceImageErrorCode}
     */
    @jakarta.annotation.Nullable
    public CloudPcDeviceImageErrorCode getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * Gets the expirationDate property value. The date when the image became unavailable. Read-only.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this.backingStore.get("expirationDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getEnumValue(CloudPcDeviceImageErrorCode::forValue)); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getLocalDateValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("osBuildNumber", (n) -> { this.setOsBuildNumber(n.getStringValue()); });
        deserializerMap.put("osStatus", (n) -> { this.setOsStatus(n.getEnumValue(CloudPcDeviceImageOsStatus::forValue)); });
        deserializerMap.put("sourceImageResourceId", (n) -> { this.setSourceImageResourceId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcDeviceImageStatus::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The data and time when the image was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the operatingSystem property value. The operating system (OS) of the image. For example, Windows 11 Enterprise. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the osBuildNumber property value. The OS build version of the image. For example, 1909. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsBuildNumber() {
        return this.backingStore.get("osBuildNumber");
    }
    /**
     * Gets the osStatus property value. The OS status of this image. Possible values are: supported, supportedWithWarning, unknown, unknownFutureValue. The default value is unknown. Read-only.
     * @return a {@link CloudPcDeviceImageOsStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcDeviceImageOsStatus getOsStatus() {
        return this.backingStore.get("osStatus");
    }
    /**
     * Gets the sourceImageResourceId property value. The unique identifier (ID) of the source image resource on Azure. The required ID format is: &apos;/subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}&apos;. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceImageResourceId() {
        return this.backingStore.get("sourceImageResourceId");
    }
    /**
     * Gets the status property value. The status of the image on the Cloud PC. Possible values are: pending, ready, failed, unknownFutureValue. Read-only.
     * @return a {@link CloudPcDeviceImageStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcDeviceImageStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the version property value. The image version. For example, 0.0.1 and 1.5.13. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("errorCode", this.getErrorCode());
        writer.writeLocalDateValue("expirationDate", this.getExpirationDate());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeEnumValue("osStatus", this.getOsStatus());
        writer.writeStringValue("sourceImageResourceId", this.getSourceImageResourceId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The display name of the associated device image. The device image display name and the version are used to uniquely identify the Cloud PC device image. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the errorCode property value. The error code of the status of the image that indicates why the upload failed, if applicable. Possible values are: internalServerError, sourceImageNotFound, osVersionNotSupported, sourceImageInvalid, sourceImageNotGeneralized, unknownFutureValue, vmAlreadyAzureAdJoined, paidSourceImageNotSupport, sourceImageNotSupportCustomizeVMName, sourceImageSizeExceedsLimitation. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: vmAlreadyAzureAdJoined, paidSourceImageNotSupport, sourceImageNotSupportCustomizeVMName, sourceImageSizeExceedsLimitation. Read-only.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final CloudPcDeviceImageErrorCode value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the expirationDate property value. The date when the image became unavailable. Read-only.
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("expirationDate", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The data and time when the image was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the operatingSystem property value. The operating system (OS) of the image. For example, Windows 11 Enterprise. Read-only.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the osBuildNumber property value. The OS build version of the image. For example, 1909. Read-only.
     * @param value Value to set for the osBuildNumber property.
     */
    public void setOsBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osBuildNumber", value);
    }
    /**
     * Sets the osStatus property value. The OS status of this image. Possible values are: supported, supportedWithWarning, unknown, unknownFutureValue. The default value is unknown. Read-only.
     * @param value Value to set for the osStatus property.
     */
    public void setOsStatus(@jakarta.annotation.Nullable final CloudPcDeviceImageOsStatus value) {
        this.backingStore.set("osStatus", value);
    }
    /**
     * Sets the sourceImageResourceId property value. The unique identifier (ID) of the source image resource on Azure. The required ID format is: &apos;/subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}&apos;. Read-only.
     * @param value Value to set for the sourceImageResourceId property.
     */
    public void setSourceImageResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceImageResourceId", value);
    }
    /**
     * Sets the status property value. The status of the image on the Cloud PC. Possible values are: pending, ready, failed, unknownFutureValue. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcDeviceImageStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the version property value. The image version. For example, 0.0.1 and 1.5.13. Read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
