package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PstnCallLogRow implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft. */
    private PstnCallDurationSource _callDurationSource;
    /** Number dialed in E.164 format. */
    private String _calleeNumber;
    /** Number that received the call for inbound calls or the number dialed for outbound calls. E.164 format. */
    private String _callerNumber;
    /** Call identifier. Not guaranteed to be unique. */
    private String _callId;
    /** Whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference. */
    private String _callType;
    /** Amount of money or cost of the call that is charged to your account. */
    private BigDecimal _charge;
    /** ID of the audio conference. */
    private String _conferenceId;
    /** Connection fee price. */
    private BigDecimal _connectionCharge;
    /** Type of currency used to calculate the cost of the call (ISO 4217). */
    private String _currency;
    /** Whether the call was domestic (within a country or region) or international (outside a country or region) based on the user's location. */
    private String _destinationContext;
    /** Country or region dialed. */
    private String _destinationName;
    /** How long the call was connected, in seconds. */
    private Integer _duration;
    /** Call end time. */
    private OffsetDateTime _endDateTime;
    /** Unique call identifier. GUID. */
    private String _id;
    /** User's phone number type, such as a service of toll-free number. */
    private String _inventoryType;
    /** The license used for the call. */
    private String _licenseCapability;
    /** The OdataType property */
    private String _odataType;
    /** The telecommunications operator which provided PSTN services for this call. This may be Microsoft, or it may be a third-party operator via the Operator Connect Program. */
    private String _operator;
    /** Call start time. */
    private OffsetDateTime _startDateTime;
    /** Country code of the tenant, ISO 3166-1 alpha-2. */
    private String _tenantCountryCode;
    /** Country code of the user, ISO 3166-1 alpha-2. */
    private String _usageCountryCode;
    /** Display name of the user. */
    private String _userDisplayName;
    /** Calling user's ID in Graph. GUID. This and other user info will be null/empty for bot call types (ucap_in, ucap_out). */
    private String _userId;
    /** UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address. */
    private String _userPrincipalName;
    /**
     * Instantiates a new pstnCallLogRow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PstnCallLogRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pstnCallLogRow
     */
    @javax.annotation.Nonnull
    public static PstnCallLogRow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PstnCallLogRow();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the callDurationSource property value. The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft.
     * @return a pstnCallDurationSource
     */
    @javax.annotation.Nullable
    public PstnCallDurationSource getCallDurationSource() {
        return this._callDurationSource;
    }
    /**
     * Gets the calleeNumber property value. Number dialed in E.164 format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCalleeNumber() {
        return this._calleeNumber;
    }
    /**
     * Gets the callerNumber property value. Number that received the call for inbound calls or the number dialed for outbound calls. E.164 format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallerNumber() {
        return this._callerNumber;
    }
    /**
     * Gets the callId property value. Call identifier. Not guaranteed to be unique.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallId() {
        return this._callId;
    }
    /**
     * Gets the callType property value. Whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallType() {
        return this._callType;
    }
    /**
     * Gets the charge property value. Amount of money or cost of the call that is charged to your account.
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getCharge() {
        return this._charge;
    }
    /**
     * Gets the conferenceId property value. ID of the audio conference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConferenceId() {
        return this._conferenceId;
    }
    /**
     * Gets the connectionCharge property value. Connection fee price.
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getConnectionCharge() {
        return this._connectionCharge;
    }
    /**
     * Gets the currency property value. Type of currency used to calculate the cost of the call (ISO 4217).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrency() {
        return this._currency;
    }
    /**
     * Gets the destinationContext property value. Whether the call was domestic (within a country or region) or international (outside a country or region) based on the user's location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationContext() {
        return this._destinationContext;
    }
    /**
     * Gets the destinationName property value. Country or region dialed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationName() {
        return this._destinationName;
    }
    /**
     * Gets the duration property value. How long the call was connected, in seconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDuration() {
        return this._duration;
    }
    /**
     * Gets the endDateTime property value. Call end time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(24);
        deserializerMap.put("callDurationSource", (n) -> { this.setCallDurationSource(n.getEnumValue(PstnCallDurationSource.class)); });
        deserializerMap.put("calleeNumber", (n) -> { this.setCalleeNumber(n.getStringValue()); });
        deserializerMap.put("callerNumber", (n) -> { this.setCallerNumber(n.getStringValue()); });
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callType", (n) -> { this.setCallType(n.getStringValue()); });
        deserializerMap.put("charge", (n) -> { this.setCharge(n.getBigDecimalValue()); });
        deserializerMap.put("conferenceId", (n) -> { this.setConferenceId(n.getStringValue()); });
        deserializerMap.put("connectionCharge", (n) -> { this.setConnectionCharge(n.getBigDecimalValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("destinationContext", (n) -> { this.setDestinationContext(n.getStringValue()); });
        deserializerMap.put("destinationName", (n) -> { this.setDestinationName(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("inventoryType", (n) -> { this.setInventoryType(n.getStringValue()); });
        deserializerMap.put("licenseCapability", (n) -> { this.setLicenseCapability(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenantCountryCode", (n) -> { this.setTenantCountryCode(n.getStringValue()); });
        deserializerMap.put("usageCountryCode", (n) -> { this.setUsageCountryCode(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique call identifier. GUID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the inventoryType property value. User's phone number type, such as a service of toll-free number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInventoryType() {
        return this._inventoryType;
    }
    /**
     * Gets the licenseCapability property value. The license used for the call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLicenseCapability() {
        return this._licenseCapability;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the operator property value. The telecommunications operator which provided PSTN services for this call. This may be Microsoft, or it may be a third-party operator via the Operator Connect Program.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperator() {
        return this._operator;
    }
    /**
     * Gets the startDateTime property value. Call start time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the tenantCountryCode property value. Country code of the tenant, ISO 3166-1 alpha-2.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantCountryCode() {
        return this._tenantCountryCode;
    }
    /**
     * Gets the usageCountryCode property value. Country code of the user, ISO 3166-1 alpha-2.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsageCountryCode() {
        return this._usageCountryCode;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userId property value. Calling user's ID in Graph. GUID. This and other user info will be null/empty for bot call types (ucap_in, ucap_out).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address.
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("callDurationSource", this.getCallDurationSource());
        writer.writeStringValue("calleeNumber", this.getCalleeNumber());
        writer.writeStringValue("callerNumber", this.getCallerNumber());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeStringValue("callType", this.getCallType());
        writer.writeBigDecimalValue("charge", this.getCharge());
        writer.writeStringValue("conferenceId", this.getConferenceId());
        writer.writeBigDecimalValue("connectionCharge", this.getConnectionCharge());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("destinationContext", this.getDestinationContext());
        writer.writeStringValue("destinationName", this.getDestinationName());
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("inventoryType", this.getInventoryType());
        writer.writeStringValue("licenseCapability", this.getLicenseCapability());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operator", this.getOperator());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("tenantCountryCode", this.getTenantCountryCode());
        writer.writeStringValue("usageCountryCode", this.getUsageCountryCode());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the callDurationSource property value. The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft.
     * @param value Value to set for the callDurationSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallDurationSource(@javax.annotation.Nullable final PstnCallDurationSource value) {
        this._callDurationSource = value;
    }
    /**
     * Sets the calleeNumber property value. Number dialed in E.164 format.
     * @param value Value to set for the calleeNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalleeNumber(@javax.annotation.Nullable final String value) {
        this._calleeNumber = value;
    }
    /**
     * Sets the callerNumber property value. Number that received the call for inbound calls or the number dialed for outbound calls. E.164 format.
     * @param value Value to set for the callerNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallerNumber(@javax.annotation.Nullable final String value) {
        this._callerNumber = value;
    }
    /**
     * Sets the callId property value. Call identifier. Not guaranteed to be unique.
     * @param value Value to set for the callId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallId(@javax.annotation.Nullable final String value) {
        this._callId = value;
    }
    /**
     * Sets the callType property value. Whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference.
     * @param value Value to set for the callType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallType(@javax.annotation.Nullable final String value) {
        this._callType = value;
    }
    /**
     * Sets the charge property value. Amount of money or cost of the call that is charged to your account.
     * @param value Value to set for the charge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCharge(@javax.annotation.Nullable final BigDecimal value) {
        this._charge = value;
    }
    /**
     * Sets the conferenceId property value. ID of the audio conference.
     * @param value Value to set for the conferenceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConferenceId(@javax.annotation.Nullable final String value) {
        this._conferenceId = value;
    }
    /**
     * Sets the connectionCharge property value. Connection fee price.
     * @param value Value to set for the connectionCharge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionCharge(@javax.annotation.Nullable final BigDecimal value) {
        this._connectionCharge = value;
    }
    /**
     * Sets the currency property value. Type of currency used to calculate the cost of the call (ISO 4217).
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final String value) {
        this._currency = value;
    }
    /**
     * Sets the destinationContext property value. Whether the call was domestic (within a country or region) or international (outside a country or region) based on the user's location.
     * @param value Value to set for the destinationContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationContext(@javax.annotation.Nullable final String value) {
        this._destinationContext = value;
    }
    /**
     * Sets the destinationName property value. Country or region dialed.
     * @param value Value to set for the destinationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationName(@javax.annotation.Nullable final String value) {
        this._destinationName = value;
    }
    /**
     * Sets the duration property value. How long the call was connected, in seconds.
     * @param value Value to set for the duration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuration(@javax.annotation.Nullable final Integer value) {
        this._duration = value;
    }
    /**
     * Sets the endDateTime property value. Call end time.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the id property value. Unique call identifier. GUID.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the inventoryType property value. User's phone number type, such as a service of toll-free number.
     * @param value Value to set for the inventoryType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInventoryType(@javax.annotation.Nullable final String value) {
        this._inventoryType = value;
    }
    /**
     * Sets the licenseCapability property value. The license used for the call.
     * @param value Value to set for the licenseCapability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLicenseCapability(@javax.annotation.Nullable final String value) {
        this._licenseCapability = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the operator property value. The telecommunications operator which provided PSTN services for this call. This may be Microsoft, or it may be a third-party operator via the Operator Connect Program.
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final String value) {
        this._operator = value;
    }
    /**
     * Sets the startDateTime property value. Call start time.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the tenantCountryCode property value. Country code of the tenant, ISO 3166-1 alpha-2.
     * @param value Value to set for the tenantCountryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantCountryCode(@javax.annotation.Nullable final String value) {
        this._tenantCountryCode = value;
    }
    /**
     * Sets the usageCountryCode property value. Country code of the user, ISO 3166-1 alpha-2.
     * @param value Value to set for the usageCountryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsageCountryCode(@javax.annotation.Nullable final String value) {
        this._usageCountryCode = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. Calling user's ID in Graph. GUID. This and other user info will be null/empty for bot call types (ucap_in, ucap_out).
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
