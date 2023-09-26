package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PstnCallLogRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft.
     */
    private PstnCallDurationSource callDurationSource;
    /**
     * Number dialed in E.164 format.
     */
    private String calleeNumber;
    /**
     * Number that received the call for inbound calls or the number dialed for outbound calls. E.164 format.
     */
    private String callerNumber;
    /**
     * Call identifier. Not guaranteed to be unique.
     */
    private String callId;
    /**
     * Whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference.
     */
    private String callType;
    /**
     * Amount of money or cost of the call that is charged to your account.
     */
    private Decimal charge;
    /**
     * ID of the audio conference.
     */
    private String conferenceId;
    /**
     * Connection fee price.
     */
    private Decimal connectionCharge;
    /**
     * Type of currency used to calculate the cost of the call. For details, see (ISO 4217.
     */
    private String currency;
    /**
     * Whether the call was domestic (within a country or region) or international (outside a country or region) based on the user's location.
     */
    private String destinationContext;
    /**
     * Country or region dialed.
     */
    private String destinationName;
    /**
     * How long the call was connected, in seconds.
     */
    private Integer duration;
    /**
     * Call end time.
     */
    private OffsetDateTime endDateTime;
    /**
     * Unique call identifier. GUID.
     */
    private String id;
    /**
     * User's phone number type, such as a service of toll-free number.
     */
    private String inventoryType;
    /**
     * The license used for the call.
     */
    private String licenseCapability;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The telecommunications operator which provided PSTN services for this call. This may be Microsoft, or it may be a third-party operator via the Operator Connect Program.
     */
    private String operator;
    /**
     * Call start time.
     */
    private OffsetDateTime startDateTime;
    /**
     * Country code of the tenant. For details, see ISO 3166-1 alpha-2.
     */
    private String tenantCountryCode;
    /**
     * Country code of the user. For details, see ISO 3166-1 alpha-2.
     */
    private String usageCountryCode;
    /**
     * Display name of the user.
     */
    private String userDisplayName;
    /**
     * Calling user's ID in Graph. GUID. This and other user info will be null/empty for bot call types (ucapin, ucapout).
     */
    private String userId;
    /**
     * The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new PstnCallLogRow and sets the default values.
     */
    public PstnCallLogRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PstnCallLogRow
     */
    @jakarta.annotation.Nonnull
    public static PstnCallLogRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PstnCallLogRow();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the callDurationSource property value. The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft.
     * @return a PstnCallDurationSource
     */
    @jakarta.annotation.Nullable
    public PstnCallDurationSource getCallDurationSource() {
        return this.callDurationSource;
    }
    /**
     * Gets the calleeNumber property value. Number dialed in E.164 format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCalleeNumber() {
        return this.calleeNumber;
    }
    /**
     * Gets the callerNumber property value. Number that received the call for inbound calls or the number dialed for outbound calls. E.164 format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallerNumber() {
        return this.callerNumber;
    }
    /**
     * Gets the callId property value. Call identifier. Not guaranteed to be unique.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallId() {
        return this.callId;
    }
    /**
     * Gets the callType property value. Whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallType() {
        return this.callType;
    }
    /**
     * Gets the charge property value. Amount of money or cost of the call that is charged to your account.
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getCharge() {
        return this.charge;
    }
    /**
     * Gets the conferenceId property value. ID of the audio conference.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConferenceId() {
        return this.conferenceId;
    }
    /**
     * Gets the connectionCharge property value. Connection fee price.
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getConnectionCharge() {
        return this.connectionCharge;
    }
    /**
     * Gets the currency property value. Type of currency used to calculate the cost of the call. For details, see (ISO 4217.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the destinationContext property value. Whether the call was domestic (within a country or region) or international (outside a country or region) based on the user's location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationContext() {
        return this.destinationContext;
    }
    /**
     * Gets the destinationName property value. Country or region dialed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationName() {
        return this.destinationName;
    }
    /**
     * Gets the duration property value. How long the call was connected, in seconds.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.duration;
    }
    /**
     * Gets the endDateTime property value. Call end time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("callDurationSource", (n) -> { this.setCallDurationSource(n.getEnumValue(PstnCallDurationSource.class)); });
        deserializerMap.put("calleeNumber", (n) -> { this.setCalleeNumber(n.getStringValue()); });
        deserializerMap.put("callerNumber", (n) -> { this.setCallerNumber(n.getStringValue()); });
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callType", (n) -> { this.setCallType(n.getStringValue()); });
        deserializerMap.put("charge", (n) -> { this.setCharge(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("conferenceId", (n) -> { this.setConferenceId(n.getStringValue()); });
        deserializerMap.put("connectionCharge", (n) -> { this.setConnectionCharge(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the inventoryType property value. User's phone number type, such as a service of toll-free number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInventoryType() {
        return this.inventoryType;
    }
    /**
     * Gets the licenseCapability property value. The license used for the call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLicenseCapability() {
        return this.licenseCapability;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the operator property value. The telecommunications operator which provided PSTN services for this call. This may be Microsoft, or it may be a third-party operator via the Operator Connect Program.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperator() {
        return this.operator;
    }
    /**
     * Gets the startDateTime property value. Call start time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the tenantCountryCode property value. Country code of the tenant. For details, see ISO 3166-1 alpha-2.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantCountryCode() {
        return this.tenantCountryCode;
    }
    /**
     * Gets the usageCountryCode property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsageCountryCode() {
        return this.usageCountryCode;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. Calling user's ID in Graph. GUID. This and other user info will be null/empty for bot call types (ucapin, ucapout).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("callDurationSource", this.getCallDurationSource());
        writer.writeStringValue("calleeNumber", this.getCalleeNumber());
        writer.writeStringValue("callerNumber", this.getCallerNumber());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeStringValue("callType", this.getCallType());
        writer.writeObjectValue("charge", this.getCharge());
        writer.writeStringValue("conferenceId", this.getConferenceId());
        writer.writeObjectValue("connectionCharge", this.getConnectionCharge());
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the callDurationSource property value. The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft.
     * @param value Value to set for the callDurationSource property.
     */
    public void setCallDurationSource(@jakarta.annotation.Nullable final PstnCallDurationSource value) {
        this.callDurationSource = value;
    }
    /**
     * Sets the calleeNumber property value. Number dialed in E.164 format.
     * @param value Value to set for the calleeNumber property.
     */
    public void setCalleeNumber(@jakarta.annotation.Nullable final String value) {
        this.calleeNumber = value;
    }
    /**
     * Sets the callerNumber property value. Number that received the call for inbound calls or the number dialed for outbound calls. E.164 format.
     * @param value Value to set for the callerNumber property.
     */
    public void setCallerNumber(@jakarta.annotation.Nullable final String value) {
        this.callerNumber = value;
    }
    /**
     * Sets the callId property value. Call identifier. Not guaranteed to be unique.
     * @param value Value to set for the callId property.
     */
    public void setCallId(@jakarta.annotation.Nullable final String value) {
        this.callId = value;
    }
    /**
     * Sets the callType property value. Whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference.
     * @param value Value to set for the callType property.
     */
    public void setCallType(@jakarta.annotation.Nullable final String value) {
        this.callType = value;
    }
    /**
     * Sets the charge property value. Amount of money or cost of the call that is charged to your account.
     * @param value Value to set for the charge property.
     */
    public void setCharge(@jakarta.annotation.Nullable final Decimal value) {
        this.charge = value;
    }
    /**
     * Sets the conferenceId property value. ID of the audio conference.
     * @param value Value to set for the conferenceId property.
     */
    public void setConferenceId(@jakarta.annotation.Nullable final String value) {
        this.conferenceId = value;
    }
    /**
     * Sets the connectionCharge property value. Connection fee price.
     * @param value Value to set for the connectionCharge property.
     */
    public void setConnectionCharge(@jakarta.annotation.Nullable final Decimal value) {
        this.connectionCharge = value;
    }
    /**
     * Sets the currency property value. Type of currency used to calculate the cost of the call. For details, see (ISO 4217.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the destinationContext property value. Whether the call was domestic (within a country or region) or international (outside a country or region) based on the user's location.
     * @param value Value to set for the destinationContext property.
     */
    public void setDestinationContext(@jakarta.annotation.Nullable final String value) {
        this.destinationContext = value;
    }
    /**
     * Sets the destinationName property value. Country or region dialed.
     * @param value Value to set for the destinationName property.
     */
    public void setDestinationName(@jakarta.annotation.Nullable final String value) {
        this.destinationName = value;
    }
    /**
     * Sets the duration property value. How long the call was connected, in seconds.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.duration = value;
    }
    /**
     * Sets the endDateTime property value. Call end time.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the id property value. Unique call identifier. GUID.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the inventoryType property value. User's phone number type, such as a service of toll-free number.
     * @param value Value to set for the inventoryType property.
     */
    public void setInventoryType(@jakarta.annotation.Nullable final String value) {
        this.inventoryType = value;
    }
    /**
     * Sets the licenseCapability property value. The license used for the call.
     * @param value Value to set for the licenseCapability property.
     */
    public void setLicenseCapability(@jakarta.annotation.Nullable final String value) {
        this.licenseCapability = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operator property value. The telecommunications operator which provided PSTN services for this call. This may be Microsoft, or it may be a third-party operator via the Operator Connect Program.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final String value) {
        this.operator = value;
    }
    /**
     * Sets the startDateTime property value. Call start time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the tenantCountryCode property value. Country code of the tenant. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the tenantCountryCode property.
     */
    public void setTenantCountryCode(@jakarta.annotation.Nullable final String value) {
        this.tenantCountryCode = value;
    }
    /**
     * Sets the usageCountryCode property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the usageCountryCode property.
     */
    public void setUsageCountryCode(@jakarta.annotation.Nullable final String value) {
        this.usageCountryCode = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. Calling user's ID in Graph. GUID. This and other user info will be null/empty for bot call types (ucapin, ucapout).
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
