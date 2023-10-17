package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Windows Log Collection request entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceLogCollectionResponse extends Entity implements Parsable {
    /**
     * The User Principal Name (UPN) of the user that enrolled the device.
     */
    private String enrolledByUser;
    /**
     * The DateTime of the expiration of the logs.
     */
    private OffsetDateTime expirationDateTimeUTC;
    /**
     * The UPN for who initiated the request.
     */
    private String initiatedByUserPrincipalName;
    /**
     * Indicates Intune device unique identifier.
     */
    private UUID managedDeviceId;
    /**
     * The DateTime the request was received.
     */
    private OffsetDateTime receivedDateTimeUTC;
    /**
     * The DateTime of the request.
     */
    private OffsetDateTime requestedDateTimeUTC;
    /**
     * The size of the logs in KB. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double sizeInKB;
    /**
     * AppLogUploadStatus
     */
    private AppLogUploadState status;
    /**
     * Instantiates a new DeviceLogCollectionResponse and sets the default values.
     */
    public DeviceLogCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceLogCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public static DeviceLogCollectionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLogCollectionResponse();
    }
    /**
     * Gets the enrolledByUser property value. The User Principal Name (UPN) of the user that enrolled the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnrolledByUser() {
        return this.enrolledByUser;
    }
    /**
     * Gets the expirationDateTimeUTC property value. The DateTime of the expiration of the logs.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTimeUTC() {
        return this.expirationDateTimeUTC;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enrolledByUser", (n) -> { this.setEnrolledByUser(n.getStringValue()); });
        deserializerMap.put("expirationDateTimeUTC", (n) -> { this.setExpirationDateTimeUTC(n.getOffsetDateTimeValue()); });
        deserializerMap.put("initiatedByUserPrincipalName", (n) -> { this.setInitiatedByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getUUIDValue()); });
        deserializerMap.put("receivedDateTimeUTC", (n) -> { this.setReceivedDateTimeUTC(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestedDateTimeUTC", (n) -> { this.setRequestedDateTimeUTC(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sizeInKB", (n) -> { this.setSizeInKB(n.getDoubleValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AppLogUploadState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedByUserPrincipalName property value. The UPN for who initiated the request.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatedByUserPrincipalName() {
        return this.initiatedByUserPrincipalName;
    }
    /**
     * Gets the managedDeviceId property value. Indicates Intune device unique identifier.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the receivedDateTimeUTC property value. The DateTime the request was received.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTimeUTC() {
        return this.receivedDateTimeUTC;
    }
    /**
     * Gets the requestedDateTimeUTC property value. The DateTime of the request.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedDateTimeUTC() {
        return this.requestedDateTimeUTC;
    }
    /**
     * Gets the sizeInKB property value. The size of the logs in KB. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSizeInKB() {
        return this.sizeInKB;
    }
    /**
     * Gets the status property value. AppLogUploadStatus
     * @return a AppLogUploadState
     */
    @jakarta.annotation.Nullable
    public AppLogUploadState getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("enrolledByUser", this.getEnrolledByUser());
        writer.writeOffsetDateTimeValue("expirationDateTimeUTC", this.getExpirationDateTimeUTC());
        writer.writeStringValue("initiatedByUserPrincipalName", this.getInitiatedByUserPrincipalName());
        writer.writeUUIDValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeOffsetDateTimeValue("receivedDateTimeUTC", this.getReceivedDateTimeUTC());
        writer.writeOffsetDateTimeValue("requestedDateTimeUTC", this.getRequestedDateTimeUTC());
        writer.writeDoubleValue("sizeInKB", this.getSizeInKB());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the enrolledByUser property value. The User Principal Name (UPN) of the user that enrolled the device.
     * @param value Value to set for the enrolledByUser property.
     */
    public void setEnrolledByUser(@jakarta.annotation.Nullable final String value) {
        this.enrolledByUser = value;
    }
    /**
     * Sets the expirationDateTimeUTC property value. The DateTime of the expiration of the logs.
     * @param value Value to set for the expirationDateTimeUTC property.
     */
    public void setExpirationDateTimeUTC(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTimeUTC = value;
    }
    /**
     * Sets the initiatedByUserPrincipalName property value. The UPN for who initiated the request.
     * @param value Value to set for the initiatedByUserPrincipalName property.
     */
    public void setInitiatedByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.initiatedByUserPrincipalName = value;
    }
    /**
     * Sets the managedDeviceId property value. Indicates Intune device unique identifier.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final UUID value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the receivedDateTimeUTC property value. The DateTime the request was received.
     * @param value Value to set for the receivedDateTimeUTC property.
     */
    public void setReceivedDateTimeUTC(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.receivedDateTimeUTC = value;
    }
    /**
     * Sets the requestedDateTimeUTC property value. The DateTime of the request.
     * @param value Value to set for the requestedDateTimeUTC property.
     */
    public void setRequestedDateTimeUTC(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.requestedDateTimeUTC = value;
    }
    /**
     * Sets the sizeInKB property value. The size of the logs in KB. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the sizeInKB property.
     */
    public void setSizeInKB(@jakarta.annotation.Nullable final Double value) {
        this.sizeInKB = value;
    }
    /**
     * Sets the status property value. AppLogUploadStatus
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AppLogUploadState value) {
        this.status = value;
    }
}
