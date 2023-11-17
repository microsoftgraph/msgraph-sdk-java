package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectRoutingLogRow implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new DirectRoutingLogRow and sets the default values.
     */
    public DirectRoutingLogRow() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DirectRoutingLogRow
     */
    @jakarta.annotation.Nonnull
    public static DirectRoutingLogRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectRoutingLogRow();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the calleeNumber property value. Number of the user or bot who received the call. E.164 format, but might include other data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCalleeNumber() {
        return this.backingStore.get("calleeNumber");
    }
    /**
     * Gets the callEndSubReason property value. In addition to the SIP codes, Microsoft has subcodes that indicate the specific issue.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCallEndSubReason() {
        return this.backingStore.get("callEndSubReason");
    }
    /**
     * Gets the callerNumber property value. Number of the user or bot who made the call. E.164 format, but might include other data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallerNumber() {
        return this.backingStore.get("callerNumber");
    }
    /**
     * Gets the callType property value. Call type and direction.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCallType() {
        return this.backingStore.get("callType");
    }
    /**
     * Gets the correlationId property value. Identifier for the call that you can use when calling Microsoft Support. GUID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the duration property value. Duration of the call in seconds.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * Gets the endDateTime property value. Only exists for successful (fully established) calls. Time when call ended.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailureDateTime() {
        return this.backingStore.get("failureDateTime");
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
     * Gets the finalSipCode property value. The code with which the call ended. For more information, see RFC 3261.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFinalSipCode() {
        return this.backingStore.get("finalSipCode");
    }
    /**
     * Gets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFinalSipCodePhrase() {
        return this.backingStore.get("finalSipCodePhrase");
    }
    /**
     * Gets the id property value. Unique call identifier. GUID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the inviteDateTime property value. When the initial invite was sent.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInviteDateTime() {
        return this.backingStore.get("inviteDateTime");
    }
    /**
     * Gets the mediaBypassEnabled property value. Indicates whether the trunk was enabled for media bypass.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMediaBypassEnabled() {
        return this.backingStore.get("mediaBypassEnabled");
    }
    /**
     * Gets the mediaPathLocation property value. The datacenter used for media path in a nonbypass call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMediaPathLocation() {
        return this.backingStore.get("mediaPathLocation");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the signalingLocation property value. The datacenter used for signaling for both bypass and nonbypass calls.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignalingLocation() {
        return this.backingStore.get("signalingLocation");
    }
    /**
     * Gets the startDateTime property value. Call start time.For failed and unanswered calls, this can be equal to the invite or failure time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the successfulCall property value. Success or attempt.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSuccessfulCall() {
        return this.backingStore.get("successfulCall");
    }
    /**
     * Gets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTrunkFullyQualifiedDomainName() {
        return this.backingStore.get("trunkFullyQualifiedDomainName");
    }
    /**
     * Gets the userDisplayName property value. Display name of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userId property value. Calling user's ID in Microsoft Graph. This and other user information is null/empty for bot call types. GUID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName (sign-in name) in Microsoft Entra ID. This is usually the same as the user's SIP Address, and can be the same as the user's email address.
     * @return a String
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the calleeNumber property value. Number of the user or bot who received the call. E.164 format, but might include other data.
     * @param value Value to set for the calleeNumber property.
     */
    public void setCalleeNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("calleeNumber", value);
    }
    /**
     * Sets the callEndSubReason property value. In addition to the SIP codes, Microsoft has subcodes that indicate the specific issue.
     * @param value Value to set for the callEndSubReason property.
     */
    public void setCallEndSubReason(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("callEndSubReason", value);
    }
    /**
     * Sets the callerNumber property value. Number of the user or bot who made the call. E.164 format, but might include other data.
     * @param value Value to set for the callerNumber property.
     */
    public void setCallerNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callerNumber", value);
    }
    /**
     * Sets the callType property value. Call type and direction.
     * @param value Value to set for the callType property.
     */
    public void setCallType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callType", value);
    }
    /**
     * Sets the correlationId property value. Identifier for the call that you can use when calling Microsoft Support. GUID.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the duration property value. Duration of the call in seconds.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the endDateTime property value. Only exists for successful (fully established) calls. Time when call ended.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @param value Value to set for the failureDateTime property.
     */
    public void setFailureDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("failureDateTime", value);
    }
    /**
     * Sets the finalSipCode property value. The code with which the call ended. For more information, see RFC 3261.
     * @param value Value to set for the finalSipCode property.
     */
    public void setFinalSipCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("finalSipCode", value);
    }
    /**
     * Sets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @param value Value to set for the finalSipCodePhrase property.
     */
    public void setFinalSipCodePhrase(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("finalSipCodePhrase", value);
    }
    /**
     * Sets the id property value. Unique call identifier. GUID.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the inviteDateTime property value. When the initial invite was sent.
     * @param value Value to set for the inviteDateTime property.
     */
    public void setInviteDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("inviteDateTime", value);
    }
    /**
     * Sets the mediaBypassEnabled property value. Indicates whether the trunk was enabled for media bypass.
     * @param value Value to set for the mediaBypassEnabled property.
     */
    public void setMediaBypassEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("mediaBypassEnabled", value);
    }
    /**
     * Sets the mediaPathLocation property value. The datacenter used for media path in a nonbypass call.
     * @param value Value to set for the mediaPathLocation property.
     */
    public void setMediaPathLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaPathLocation", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the signalingLocation property value. The datacenter used for signaling for both bypass and nonbypass calls.
     * @param value Value to set for the signalingLocation property.
     */
    public void setSignalingLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signalingLocation", value);
    }
    /**
     * Sets the startDateTime property value. Call start time.For failed and unanswered calls, this can be equal to the invite or failure time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the successfulCall property value. Success or attempt.
     * @param value Value to set for the successfulCall property.
     */
    public void setSuccessfulCall(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("successfulCall", value);
    }
    /**
     * Sets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @param value Value to set for the trunkFullyQualifiedDomainName property.
     */
    public void setTrunkFullyQualifiedDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("trunkFullyQualifiedDomainName", value);
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userId property value. Calling user's ID in Microsoft Graph. This and other user information is null/empty for bot call types. GUID.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName (sign-in name) in Microsoft Entra ID. This is usually the same as the user's SIP Address, and can be the same as the user's email address.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
