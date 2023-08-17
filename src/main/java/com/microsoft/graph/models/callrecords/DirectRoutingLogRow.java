package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectRoutingLogRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of the user or bot who received the call. E.164 format, but may include additional data.
     */
    private String calleeNumber;
    /**
     * In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
     */
    private Integer callEndSubReason;
    /**
     * Number of the user or bot who made the call. E.164 format, but may include additional data.
     */
    private String callerNumber;
    /**
     * Call type and direction.
     */
    private String callType;
    /**
     * Identifier for the call that you can use when calling Microsoft Support. GUID.
     */
    private String correlationId;
    /**
     * Duration of the call in seconds.
     */
    private Integer duration;
    /**
     * Only exists for successful (fully established) calls. Time when call ended.
     */
    private OffsetDateTime endDateTime;
    /**
     * Only exists for failed (not fully established) calls.
     */
    private OffsetDateTime failureDateTime;
    /**
     * The code with which the call ended, RFC 3261.
     */
    private Integer finalSipCode;
    /**
     * Description of the SIP code and Microsoft subcode.
     */
    private String finalSipCodePhrase;
    /**
     * Unique call identifier. GUID.
     */
    private String id;
    /**
     * When the initial invite was sent.
     */
    private OffsetDateTime inviteDateTime;
    /**
     * Indicates if the trunk was enabled for media bypass or not.
     */
    private Boolean mediaBypassEnabled;
    /**
     * The datacenter used for media path in non-bypass call.
     */
    private String mediaPathLocation;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The datacenter used for signaling for both bypass and non-bypass calls.
     */
    private String signalingLocation;
    /**
     * Call start time.For failed and unanswered calls, this can be equal to invite or failure time.
     */
    private OffsetDateTime startDateTime;
    /**
     * Success or attempt.
     */
    private Boolean successfulCall;
    /**
     * Fully qualified domain name of the session border controller.
     */
    private String trunkFullyQualifiedDomainName;
    /**
     * Display name of the user.
     */
    private String userDisplayName;
    /**
     * Calling user's ID in Graph. This and other user info will be null/empty for bot call types. GUID.
     */
    private String userId;
    /**
     * UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new directRoutingLogRow and sets the default values.
     */
    public DirectRoutingLogRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directRoutingLogRow
     */
    @jakarta.annotation.Nonnull
    public static DirectRoutingLogRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectRoutingLogRow();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the calleeNumber property value. Number of the user or bot who received the call. E.164 format, but may include additional data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCalleeNumber() {
        return this.calleeNumber;
    }
    /**
     * Gets the callEndSubReason property value. In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCallEndSubReason() {
        return this.callEndSubReason;
    }
    /**
     * Gets the callerNumber property value. Number of the user or bot who made the call. E.164 format, but may include additional data.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCallerNumber() {
        return this.callerNumber;
    }
    /**
     * Gets the callType property value. Call type and direction.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCallType() {
        return this.callType;
    }
    /**
     * Gets the correlationId property value. Identifier for the call that you can use when calling Microsoft Support. GUID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the duration property value. Duration of the call in seconds.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.duration;
    }
    /**
     * Gets the endDateTime property value. Only exists for successful (fully established) calls. Time when call ended.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailureDateTime() {
        return this.failureDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
        deserializerMap.put("calleeNumber", (n) -> { this.setCalleeNumber(n.getStringValue()); });
        deserializerMap.put("callEndSubReason", (n) -> { this.setCallEndSubReason(n.getIntegerValue()); });
        deserializerMap.put("callerNumber", (n) -> { this.setCallerNumber(n.getStringValue()); });
        deserializerMap.put("callType", (n) -> { this.setCallType(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureDateTime", (n) -> { this.setFailureDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("finalSipCode", (n) -> { this.setFinalSipCode(n.getIntegerValue()); });
        deserializerMap.put("finalSipCodePhrase", (n) -> { this.setFinalSipCodePhrase(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("inviteDateTime", (n) -> { this.setInviteDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mediaBypassEnabled", (n) -> { this.setMediaBypassEnabled(n.getBooleanValue()); });
        deserializerMap.put("mediaPathLocation", (n) -> { this.setMediaPathLocation(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("signalingLocation", (n) -> { this.setSignalingLocation(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("successfulCall", (n) -> { this.setSuccessfulCall(n.getBooleanValue()); });
        deserializerMap.put("trunkFullyQualifiedDomainName", (n) -> { this.setTrunkFullyQualifiedDomainName(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the finalSipCode property value. The code with which the call ended, RFC 3261.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFinalSipCode() {
        return this.finalSipCode;
    }
    /**
     * Gets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFinalSipCodePhrase() {
        return this.finalSipCodePhrase;
    }
    /**
     * Gets the id property value. Unique call identifier. GUID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the inviteDateTime property value. When the initial invite was sent.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInviteDateTime() {
        return this.inviteDateTime;
    }
    /**
     * Gets the mediaBypassEnabled property value. Indicates if the trunk was enabled for media bypass or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMediaBypassEnabled() {
        return this.mediaBypassEnabled;
    }
    /**
     * Gets the mediaPathLocation property value. The datacenter used for media path in non-bypass call.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMediaPathLocation() {
        return this.mediaPathLocation;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the signalingLocation property value. The datacenter used for signaling for both bypass and non-bypass calls.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSignalingLocation() {
        return this.signalingLocation;
    }
    /**
     * Gets the startDateTime property value. Call start time.For failed and unanswered calls, this can be equal to invite or failure time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the successfulCall property value. Success or attempt.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSuccessfulCall() {
        return this.successfulCall;
    }
    /**
     * Gets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTrunkFullyQualifiedDomainName() {
        return this.trunkFullyQualifiedDomainName;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. Calling user's ID in Graph. This and other user info will be null/empty for bot call types. GUID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address.
     * @return a string
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
        writer.writeStringValue("calleeNumber", this.getCalleeNumber());
        writer.writeIntegerValue("callEndSubReason", this.getCallEndSubReason());
        writer.writeStringValue("callerNumber", this.getCallerNumber());
        writer.writeStringValue("callType", this.getCallType());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeOffsetDateTimeValue("failureDateTime", this.getFailureDateTime());
        writer.writeIntegerValue("finalSipCode", this.getFinalSipCode());
        writer.writeStringValue("finalSipCodePhrase", this.getFinalSipCodePhrase());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("inviteDateTime", this.getInviteDateTime());
        writer.writeBooleanValue("mediaBypassEnabled", this.getMediaBypassEnabled());
        writer.writeStringValue("mediaPathLocation", this.getMediaPathLocation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("signalingLocation", this.getSignalingLocation());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeBooleanValue("successfulCall", this.getSuccessfulCall());
        writer.writeStringValue("trunkFullyQualifiedDomainName", this.getTrunkFullyQualifiedDomainName());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the calleeNumber property value. Number of the user or bot who received the call. E.164 format, but may include additional data.
     * @param value Value to set for the calleeNumber property.
     */
    public void setCalleeNumber(@jakarta.annotation.Nullable final String value) {
        this.calleeNumber = value;
    }
    /**
     * Sets the callEndSubReason property value. In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
     * @param value Value to set for the callEndSubReason property.
     */
    public void setCallEndSubReason(@jakarta.annotation.Nullable final Integer value) {
        this.callEndSubReason = value;
    }
    /**
     * Sets the callerNumber property value. Number of the user or bot who made the call. E.164 format, but may include additional data.
     * @param value Value to set for the callerNumber property.
     */
    public void setCallerNumber(@jakarta.annotation.Nullable final String value) {
        this.callerNumber = value;
    }
    /**
     * Sets the callType property value. Call type and direction.
     * @param value Value to set for the callType property.
     */
    public void setCallType(@jakarta.annotation.Nullable final String value) {
        this.callType = value;
    }
    /**
     * Sets the correlationId property value. Identifier for the call that you can use when calling Microsoft Support. GUID.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the duration property value. Duration of the call in seconds.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.duration = value;
    }
    /**
     * Sets the endDateTime property value. Only exists for successful (fully established) calls. Time when call ended.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @param value Value to set for the failureDateTime property.
     */
    public void setFailureDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failureDateTime = value;
    }
    /**
     * Sets the finalSipCode property value. The code with which the call ended, RFC 3261.
     * @param value Value to set for the finalSipCode property.
     */
    public void setFinalSipCode(@jakarta.annotation.Nullable final Integer value) {
        this.finalSipCode = value;
    }
    /**
     * Sets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @param value Value to set for the finalSipCodePhrase property.
     */
    public void setFinalSipCodePhrase(@jakarta.annotation.Nullable final String value) {
        this.finalSipCodePhrase = value;
    }
    /**
     * Sets the id property value. Unique call identifier. GUID.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the inviteDateTime property value. When the initial invite was sent.
     * @param value Value to set for the inviteDateTime property.
     */
    public void setInviteDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.inviteDateTime = value;
    }
    /**
     * Sets the mediaBypassEnabled property value. Indicates if the trunk was enabled for media bypass or not.
     * @param value Value to set for the mediaBypassEnabled property.
     */
    public void setMediaBypassEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.mediaBypassEnabled = value;
    }
    /**
     * Sets the mediaPathLocation property value. The datacenter used for media path in non-bypass call.
     * @param value Value to set for the mediaPathLocation property.
     */
    public void setMediaPathLocation(@jakarta.annotation.Nullable final String value) {
        this.mediaPathLocation = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the signalingLocation property value. The datacenter used for signaling for both bypass and non-bypass calls.
     * @param value Value to set for the signalingLocation property.
     */
    public void setSignalingLocation(@jakarta.annotation.Nullable final String value) {
        this.signalingLocation = value;
    }
    /**
     * Sets the startDateTime property value. Call start time.For failed and unanswered calls, this can be equal to invite or failure time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the successfulCall property value. Success or attempt.
     * @param value Value to set for the successfulCall property.
     */
    public void setSuccessfulCall(@jakarta.annotation.Nullable final Boolean value) {
        this.successfulCall = value;
    }
    /**
     * Sets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @param value Value to set for the trunkFullyQualifiedDomainName property.
     */
    public void setTrunkFullyQualifiedDomainName(@jakarta.annotation.Nullable final String value) {
        this.trunkFullyQualifiedDomainName = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. Calling user's ID in Graph. This and other user info will be null/empty for bot call types. GUID.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
