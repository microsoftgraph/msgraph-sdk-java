package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskyUser extends Entity implements Parsable {
    /**
     * The activity related to user risk level change
     */
    private java.util.List<RiskyUserHistoryItem> history;
    /**
     * Indicates whether the user is deleted. Possible values are: true, false.
     */
    private Boolean isDeleted;
    /**
     * Indicates whether a user's risky state is being processed by the backend.
     */
    private Boolean isProcessing;
    /**
     * Details of the detected risk. Possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue.
     */
    private RiskDetail riskDetail;
    /**
     * The date and time that the risky user was last updated.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime riskLastUpdatedDateTime;
    /**
     * Level of the detected risky user. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     */
    private RiskLevel riskLevel;
    /**
     * State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     */
    private RiskState riskState;
    /**
     * Risky user display name.
     */
    private String userDisplayName;
    /**
     * Risky user principal name.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new riskyUser and sets the default values.
     */
    public RiskyUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a riskyUser
     */
    @jakarta.annotation.Nonnull
    public static RiskyUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.riskyUserHistoryItem": return new RiskyUserHistoryItem();
            }
        }
        return new RiskyUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(RiskyUserHistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("isProcessing", (n) -> { this.setIsProcessing(n.getBooleanValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
        deserializerMap.put("riskLastUpdatedDateTime", (n) -> { this.setRiskLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState.class)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. The activity related to user risk level change
     * @return a riskyUserHistoryItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskyUserHistoryItem> getHistory() {
        return this.history;
    }
    /**
     * Gets the isDeleted property value. Indicates whether the user is deleted. Possible values are: true, false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    /**
     * Gets the isProcessing property value. Indicates whether a user's risky state is being processed by the backend.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsProcessing() {
        return this.isProcessing;
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. Possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue.
     * @return a riskDetail
     */
    @jakarta.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this.riskDetail;
    }
    /**
     * Gets the riskLastUpdatedDateTime property value. The date and time that the risky user was last updated.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRiskLastUpdatedDateTime() {
        return this.riskLastUpdatedDateTime;
    }
    /**
     * Gets the riskLevel property value. Level of the detected risky user. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     * @return a riskLevel
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this.riskLevel;
    }
    /**
     * Gets the riskState property value. State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @return a riskState
     */
    @jakarta.annotation.Nullable
    public RiskState getRiskState() {
        return this.riskState;
    }
    /**
     * Gets the userDisplayName property value. Risky user display name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. Risky user principal name.
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
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeBooleanValue("isProcessing", this.getIsProcessing());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeOffsetDateTimeValue("riskLastUpdatedDateTime", this.getRiskLastUpdatedDateTime());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the history property value. The activity related to user risk level change
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<RiskyUserHistoryItem> value) {
        this.history = value;
    }
    /**
     * Sets the isDeleted property value. Indicates whether the user is deleted. Possible values are: true, false.
     * @param value Value to set for the isDeleted property.
     */
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.isDeleted = value;
    }
    /**
     * Sets the isProcessing property value. Indicates whether a user's risky state is being processed by the backend.
     * @param value Value to set for the isProcessing property.
     */
    public void setIsProcessing(@jakarta.annotation.Nullable final Boolean value) {
        this.isProcessing = value;
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. Possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue.
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetail value) {
        this.riskDetail = value;
    }
    /**
     * Sets the riskLastUpdatedDateTime property value. The date and time that the risky user was last updated.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the riskLastUpdatedDateTime property.
     */
    public void setRiskLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.riskLastUpdatedDateTime = value;
    }
    /**
     * Sets the riskLevel property value. Level of the detected risky user. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     * @param value Value to set for the riskLevel property.
     */
    public void setRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.riskLevel = value;
    }
    /**
     * Sets the riskState property value. State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @param value Value to set for the riskState property.
     */
    public void setRiskState(@jakarta.annotation.Nullable final RiskState value) {
        this.riskState = value;
    }
    /**
     * Sets the userDisplayName property value. Risky user display name.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. Risky user principal name.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
