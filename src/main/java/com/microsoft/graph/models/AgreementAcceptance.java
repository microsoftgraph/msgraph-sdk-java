package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AgreementAcceptance extends Entity implements Parsable {
    /** ID of the agreement file accepted by the user.  */
    private String _agreementFileId;
    /** ID of the agreement.  */
    private String _agreementId;
    /** The display name of the device used for accepting the agreement.  */
    private String _deviceDisplayName;
    /** The unique identifier of the device used for accepting the agreement.  */
    private String _deviceId;
    /** The operating system used for accepting the agreement.  */
    private String _deviceOSType;
    /** The operating system version of the device used for accepting the agreement.  */
    private String _deviceOSVersion;
    /** The expiration date time of the acceptance. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _expirationDateTime;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _recordedDateTime;
    /** Possible values are: accepted, declined. Supports $filter (eq).  */
    private AgreementAcceptanceState _state;
    /** Display name of the user when the acceptance was recorded.  */
    private String _userDisplayName;
    /** Email of the user when the acceptance was recorded.  */
    private String _userEmail;
    /** ID of the user who accepted the agreement.  */
    private String _userId;
    /** UPN of the user when the acceptance was recorded.  */
    private String _userPrincipalName;
    /**
     * Instantiates a new agreementAcceptance and sets the default values.
     * @return a void
     */
    public AgreementAcceptance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a agreementAcceptance
     */
    @javax.annotation.Nonnull
    public static AgreementAcceptance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgreementAcceptance();
    }
    /**
     * Gets the agreementFileId property value. ID of the agreement file accepted by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAgreementFileId() {
        return this._agreementFileId;
    }
    /**
     * Gets the agreementId property value. ID of the agreement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAgreementId() {
        return this._agreementId;
    }
    /**
     * Gets the deviceDisplayName property value. The display name of the device used for accepting the agreement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this._deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device used for accepting the agreement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceOSType property value. The operating system used for accepting the agreement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOSType() {
        return this._deviceOSType;
    }
    /**
     * Gets the deviceOSVersion property value. The operating system version of the device used for accepting the agreement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOSVersion() {
        return this._deviceOSVersion;
    }
    /**
     * Gets the expirationDateTime property value. The expiration date time of the acceptance. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AgreementAcceptance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("agreementFileId", (n) -> { currentObject.setAgreementFileId(n.getStringValue()); });
            this.put("agreementId", (n) -> { currentObject.setAgreementId(n.getStringValue()); });
            this.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceOSType", (n) -> { currentObject.setDeviceOSType(n.getStringValue()); });
            this.put("deviceOSVersion", (n) -> { currentObject.setDeviceOSVersion(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("recordedDateTime", (n) -> { currentObject.setRecordedDateTime(n.getOffsetDateTimeValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(AgreementAcceptanceState.class)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userEmail", (n) -> { currentObject.setUserEmail(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the recordedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRecordedDateTime() {
        return this._recordedDateTime;
    }
    /**
     * Gets the state property value. Possible values are: accepted, declined. Supports $filter (eq).
     * @return a agreementAcceptanceState
     */
    @javax.annotation.Nullable
    public AgreementAcceptanceState getState() {
        return this._state;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user when the acceptance was recorded.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userEmail property value. Email of the user when the acceptance was recorded.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserEmail() {
        return this._userEmail;
    }
    /**
     * Gets the userId property value. ID of the user who accepted the agreement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. UPN of the user when the acceptance was recorded.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the agreementFileId property value. ID of the agreement file accepted by the user.
     * @param value Value to set for the agreementFileId property.
     * @return a void
     */
    public void setAgreementFileId(@javax.annotation.Nullable final String value) {
        this._agreementFileId = value;
    }
    /**
     * Sets the agreementId property value. ID of the agreement.
     * @param value Value to set for the agreementId property.
     * @return a void
     */
    public void setAgreementId(@javax.annotation.Nullable final String value) {
        this._agreementId = value;
    }
    /**
     * Sets the deviceDisplayName property value. The display name of the device used for accepting the agreement.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device used for accepting the agreement.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceOSType property value. The operating system used for accepting the agreement.
     * @param value Value to set for the deviceOSType property.
     * @return a void
     */
    public void setDeviceOSType(@javax.annotation.Nullable final String value) {
        this._deviceOSType = value;
    }
    /**
     * Sets the deviceOSVersion property value. The operating system version of the device used for accepting the agreement.
     * @param value Value to set for the deviceOSVersion property.
     * @return a void
     */
    public void setDeviceOSVersion(@javax.annotation.Nullable final String value) {
        this._deviceOSVersion = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date time of the acceptance. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the recordedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the recordedDateTime property.
     * @return a void
     */
    public void setRecordedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._recordedDateTime = value;
    }
    /**
     * Sets the state property value. Possible values are: accepted, declined. Supports $filter (eq).
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final AgreementAcceptanceState value) {
        this._state = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user when the acceptance was recorded.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userEmail property value. Email of the user when the acceptance was recorded.
     * @param value Value to set for the userEmail property.
     * @return a void
     */
    public void setUserEmail(@javax.annotation.Nullable final String value) {
        this._userEmail = value;
    }
    /**
     * Sets the userId property value. ID of the user who accepted the agreement.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. UPN of the user when the acceptance was recorded.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
