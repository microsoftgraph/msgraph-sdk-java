package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectRoutingLogRow implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Number of the user or bot who received the call. E.164 format, but may include additional data. */
    private String _calleeNumber;
    /** In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue. */
    private Integer _callEndSubReason;
    /** Number of the user or bot who made the call. E.164 format, but may include additional data. */
    private String _callerNumber;
    /** Call type and direction. */
    private String _callType;
    /** Identifier for the call that you can use when calling Microsoft Support. GUID. */
    private String _correlationId;
    /** Duration of the call in seconds. */
    private Integer _duration;
    /** Only exists for successful (fully established) calls. Time when call ended. */
    private OffsetDateTime _endDateTime;
    /** Only exists for failed (not fully established) calls. */
    private OffsetDateTime _failureDateTime;
    /** The code with which the call ended, RFC 3261. */
    private Integer _finalSipCode;
    /** Description of the SIP code and Microsoft subcode. */
    private String _finalSipCodePhrase;
    /** Unique call identifier. GUID. */
    private String _id;
    /** When the initial invite was sent. */
    private OffsetDateTime _inviteDateTime;
    /** Indicates if the trunk was enabled for media bypass or not. */
    private Boolean _mediaBypassEnabled;
    /** The datacenter used for media path in non-bypass call. */
    private String _mediaPathLocation;
    /** The OdataType property */
    private String _odataType;
    /** The datacenter used for signaling for both bypass and non-bypass calls. */
    private String _signalingLocation;
    /** Call start time.For failed and unanswered calls, this can be equal to invite or failure time. */
    private OffsetDateTime _startDateTime;
    /** Success or attempt. */
    private Boolean _successfulCall;
    /** Fully qualified domain name of the session border controller. */
    private String _trunkFullyQualifiedDomainName;
    /** Display name of the user. */
    private String _userDisplayName;
    /** Calling user's ID in Graph. This and other user info will be null/empty for bot call types. GUID. */
    private String _userId;
    /** UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address. */
    private String _userPrincipalName;
    /**
     * Instantiates a new directRoutingLogRow and sets the default values.
     * @return a void
     */
    public DirectRoutingLogRow() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callRecords.directRoutingLogRow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directRoutingLogRow
     */
    @javax.annotation.Nonnull
    public static DirectRoutingLogRow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectRoutingLogRow();
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
     * Gets the calleeNumber property value. Number of the user or bot who received the call. E.164 format, but may include additional data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCalleeNumber() {
        return this._calleeNumber;
    }
    /**
     * Gets the callEndSubReason property value. In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCallEndSubReason() {
        return this._callEndSubReason;
    }
    /**
     * Gets the callerNumber property value. Number of the user or bot who made the call. E.164 format, but may include additional data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallerNumber() {
        return this._callerNumber;
    }
    /**
     * Gets the callType property value. Call type and direction.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallType() {
        return this._callType;
    }
    /**
     * Gets the correlationId property value. Identifier for the call that you can use when calling Microsoft Support. GUID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the duration property value. Duration of the call in seconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDuration() {
        return this._duration;
    }
    /**
     * Gets the endDateTime property value. Only exists for successful (fully established) calls. Time when call ended.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFailureDateTime() {
        return this._failureDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DirectRoutingLogRow currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(22) {{
            this.put("calleeNumber", (n) -> { currentObject.setCalleeNumber(n.getStringValue()); });
            this.put("callEndSubReason", (n) -> { currentObject.setCallEndSubReason(n.getIntegerValue()); });
            this.put("callerNumber", (n) -> { currentObject.setCallerNumber(n.getStringValue()); });
            this.put("callType", (n) -> { currentObject.setCallType(n.getStringValue()); });
            this.put("correlationId", (n) -> { currentObject.setCorrelationId(n.getStringValue()); });
            this.put("duration", (n) -> { currentObject.setDuration(n.getIntegerValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("failureDateTime", (n) -> { currentObject.setFailureDateTime(n.getOffsetDateTimeValue()); });
            this.put("finalSipCode", (n) -> { currentObject.setFinalSipCode(n.getIntegerValue()); });
            this.put("finalSipCodePhrase", (n) -> { currentObject.setFinalSipCodePhrase(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("inviteDateTime", (n) -> { currentObject.setInviteDateTime(n.getOffsetDateTimeValue()); });
            this.put("mediaBypassEnabled", (n) -> { currentObject.setMediaBypassEnabled(n.getBooleanValue()); });
            this.put("mediaPathLocation", (n) -> { currentObject.setMediaPathLocation(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("signalingLocation", (n) -> { currentObject.setSignalingLocation(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("successfulCall", (n) -> { currentObject.setSuccessfulCall(n.getBooleanValue()); });
            this.put("trunkFullyQualifiedDomainName", (n) -> { currentObject.setTrunkFullyQualifiedDomainName(n.getStringValue()); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the finalSipCode property value. The code with which the call ended, RFC 3261.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFinalSipCode() {
        return this._finalSipCode;
    }
    /**
     * Gets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFinalSipCodePhrase() {
        return this._finalSipCodePhrase;
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
     * Gets the inviteDateTime property value. When the initial invite was sent.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getInviteDateTime() {
        return this._inviteDateTime;
    }
    /**
     * Gets the mediaBypassEnabled property value. Indicates if the trunk was enabled for media bypass or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMediaBypassEnabled() {
        return this._mediaBypassEnabled;
    }
    /**
     * Gets the mediaPathLocation property value. The datacenter used for media path in non-bypass call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaPathLocation() {
        return this._mediaPathLocation;
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
     * Gets the signalingLocation property value. The datacenter used for signaling for both bypass and non-bypass calls.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignalingLocation() {
        return this._signalingLocation;
    }
    /**
     * Gets the startDateTime property value. Call start time.For failed and unanswered calls, this can be equal to invite or failure time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the successfulCall property value. Success or attempt.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSuccessfulCall() {
        return this._successfulCall;
    }
    /**
     * Gets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrunkFullyQualifiedDomainName() {
        return this._trunkFullyQualifiedDomainName;
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
     * Gets the userId property value. Calling user's ID in Graph. This and other user info will be null/empty for bot call types. GUID.
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the calleeNumber property value. Number of the user or bot who received the call. E.164 format, but may include additional data.
     * @param value Value to set for the calleeNumber property.
     * @return a void
     */
    public void setCalleeNumber(@javax.annotation.Nullable final String value) {
        this._calleeNumber = value;
    }
    /**
     * Sets the callEndSubReason property value. In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
     * @param value Value to set for the callEndSubReason property.
     * @return a void
     */
    public void setCallEndSubReason(@javax.annotation.Nullable final Integer value) {
        this._callEndSubReason = value;
    }
    /**
     * Sets the callerNumber property value. Number of the user or bot who made the call. E.164 format, but may include additional data.
     * @param value Value to set for the callerNumber property.
     * @return a void
     */
    public void setCallerNumber(@javax.annotation.Nullable final String value) {
        this._callerNumber = value;
    }
    /**
     * Sets the callType property value. Call type and direction.
     * @param value Value to set for the callType property.
     * @return a void
     */
    public void setCallType(@javax.annotation.Nullable final String value) {
        this._callType = value;
    }
    /**
     * Sets the correlationId property value. Identifier for the call that you can use when calling Microsoft Support. GUID.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the duration property value. Duration of the call in seconds.
     * @param value Value to set for the duration property.
     * @return a void
     */
    public void setDuration(@javax.annotation.Nullable final Integer value) {
        this._duration = value;
    }
    /**
     * Sets the endDateTime property value. Only exists for successful (fully established) calls. Time when call ended.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @param value Value to set for the failureDateTime property.
     * @return a void
     */
    public void setFailureDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._failureDateTime = value;
    }
    /**
     * Sets the finalSipCode property value. The code with which the call ended, RFC 3261.
     * @param value Value to set for the finalSipCode property.
     * @return a void
     */
    public void setFinalSipCode(@javax.annotation.Nullable final Integer value) {
        this._finalSipCode = value;
    }
    /**
     * Sets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @param value Value to set for the finalSipCodePhrase property.
     * @return a void
     */
    public void setFinalSipCodePhrase(@javax.annotation.Nullable final String value) {
        this._finalSipCodePhrase = value;
    }
    /**
     * Sets the id property value. Unique call identifier. GUID.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the inviteDateTime property value. When the initial invite was sent.
     * @param value Value to set for the inviteDateTime property.
     * @return a void
     */
    public void setInviteDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._inviteDateTime = value;
    }
    /**
     * Sets the mediaBypassEnabled property value. Indicates if the trunk was enabled for media bypass or not.
     * @param value Value to set for the mediaBypassEnabled property.
     * @return a void
     */
    public void setMediaBypassEnabled(@javax.annotation.Nullable final Boolean value) {
        this._mediaBypassEnabled = value;
    }
    /**
     * Sets the mediaPathLocation property value. The datacenter used for media path in non-bypass call.
     * @param value Value to set for the mediaPathLocation property.
     * @return a void
     */
    public void setMediaPathLocation(@javax.annotation.Nullable final String value) {
        this._mediaPathLocation = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the signalingLocation property value. The datacenter used for signaling for both bypass and non-bypass calls.
     * @param value Value to set for the signalingLocation property.
     * @return a void
     */
    public void setSignalingLocation(@javax.annotation.Nullable final String value) {
        this._signalingLocation = value;
    }
    /**
     * Sets the startDateTime property value. Call start time.For failed and unanswered calls, this can be equal to invite or failure time.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the successfulCall property value. Success or attempt.
     * @param value Value to set for the successfulCall property.
     * @return a void
     */
    public void setSuccessfulCall(@javax.annotation.Nullable final Boolean value) {
        this._successfulCall = value;
    }
    /**
     * Sets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @param value Value to set for the trunkFullyQualifiedDomainName property.
     * @return a void
     */
    public void setTrunkFullyQualifiedDomainName(@javax.annotation.Nullable final String value) {
        this._trunkFullyQualifiedDomainName = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. Calling user's ID in Graph. This and other user info will be null/empty for bot call types. GUID.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName (sign-in name) in Azure Active Directory. This is usually the same as user's SIP Address, and can be same as user's e-mail address.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
