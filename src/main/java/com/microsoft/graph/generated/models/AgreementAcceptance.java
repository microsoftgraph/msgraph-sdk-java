package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgreementAcceptance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgreementAcceptance} and sets the default values.
     */
    public AgreementAcceptance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgreementAcceptance}
     */
    @jakarta.annotation.Nonnull
    public static AgreementAcceptance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgreementAcceptance();
    }
    /**
     * Gets the agreementFileId property value. The identifier of the agreement file accepted by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgreementFileId() {
        return this.backingStore.get("agreementFileId");
    }
    /**
     * Gets the agreementId property value. The identifier of the agreement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgreementId() {
        return this.backingStore.get("agreementId");
    }
    /**
     * Gets the deviceDisplayName property value. The display name of the device used for accepting the agreement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.backingStore.get("deviceDisplayName");
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device used for accepting the agreement. Supports $filter (eq) and eq for null values.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceOSType property value. The operating system used to accept the agreement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceOSType() {
        return this.backingStore.get("deviceOSType");
    }
    /**
     * Gets the deviceOSVersion property value. The operating system version of the device used to accept the agreement.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceOSVersion() {
        return this.backingStore.get("deviceOSVersion");
    }
    /**
     * Gets the expirationDateTime property value. The expiration date time of the acceptance. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ge, le) and eq for null values.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agreementFileId", (n) -> { this.setAgreementFileId(n.getStringValue()); });
        deserializerMap.put("agreementId", (n) -> { this.setAgreementId(n.getStringValue()); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceOSType", (n) -> { this.setDeviceOSType(n.getStringValue()); });
        deserializerMap.put("deviceOSVersion", (n) -> { this.setDeviceOSVersion(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recordedDateTime", (n) -> { this.setRecordedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AgreementAcceptanceState::forValue)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recordedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRecordedDateTime() {
        return this.backingStore.get("recordedDateTime");
    }
    /**
     * Gets the state property value. The state of the agreement acceptance. Possible values are: accepted, declined. Supports $filter (eq).
     * @return a {@link AgreementAcceptanceState}
     */
    @jakarta.annotation.Nullable
    public AgreementAcceptanceState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the userDisplayName property value. Display name of the user when the acceptance was recorded.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userEmail property value. Email of the user when the acceptance was recorded.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.backingStore.get("userEmail");
    }
    /**
     * Gets the userId property value. The identifier of the user who accepted the agreement. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. UPN of the user when the acceptance was recorded.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agreementFileId", this.getAgreementFileId());
        writer.writeStringValue("agreementId", this.getAgreementId());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceOSType", this.getDeviceOSType());
        writer.writeStringValue("deviceOSVersion", this.getDeviceOSVersion());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("recordedDateTime", this.getRecordedDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userEmail", this.getUserEmail());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the agreementFileId property value. The identifier of the agreement file accepted by the user.
     * @param value Value to set for the agreementFileId property.
     */
    public void setAgreementFileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agreementFileId", value);
    }
    /**
     * Sets the agreementId property value. The identifier of the agreement.
     * @param value Value to set for the agreementId property.
     */
    public void setAgreementId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agreementId", value);
    }
    /**
     * Sets the deviceDisplayName property value. The display name of the device used for accepting the agreement.
     * @param value Value to set for the deviceDisplayName property.
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceDisplayName", value);
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device used for accepting the agreement. Supports $filter (eq) and eq for null values.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceOSType property value. The operating system used to accept the agreement.
     * @param value Value to set for the deviceOSType property.
     */
    public void setDeviceOSType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOSType", value);
    }
    /**
     * Sets the deviceOSVersion property value. The operating system version of the device used to accept the agreement.
     * @param value Value to set for the deviceOSVersion property.
     */
    public void setDeviceOSVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOSVersion", value);
    }
    /**
     * Sets the expirationDateTime property value. The expiration date time of the acceptance. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ge, le) and eq for null values.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the recordedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the recordedDateTime property.
     */
    public void setRecordedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("recordedDateTime", value);
    }
    /**
     * Sets the state property value. The state of the agreement acceptance. Possible values are: accepted, declined. Supports $filter (eq).
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AgreementAcceptanceState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the userDisplayName property value. Display name of the user when the acceptance was recorded.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userEmail property value. Email of the user when the acceptance was recorded.
     * @param value Value to set for the userEmail property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userEmail", value);
    }
    /**
     * Sets the userId property value. The identifier of the user who accepted the agreement. Supports $filter (eq).
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. UPN of the user when the acceptance was recorded.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
