package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RiskyUser extends Entity implements Parsable {
    /** The activity related to user risk level change */
    private java.util.List<RiskyUserHistoryItem> _history;
    /** Indicates whether the user is deleted. Possible values are: true, false. */
    private Boolean _isDeleted;
    /** Indicates whether a user's risky state is being processed by the backend. */
    private Boolean _isProcessing;
    /** The possible values are none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue. */
    private RiskDetail _riskDetail;
    /** The date and time that the risky user was last updated.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _riskLastUpdatedDateTime;
    /** Level of the detected risky user. The possible values are low, medium, high, hidden, none, unknownFutureValue. */
    private RiskLevel _riskLevel;
    /** State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue. */
    private RiskState _riskState;
    /** Risky user display name. */
    private String _userDisplayName;
    /** Risky user principal name. */
    private String _userPrincipalName;
    /**
     * Instantiates a new riskyUser and sets the default values.
     * @return a void
     */
    public RiskyUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a riskyUser
     */
    @javax.annotation.Nonnull
    public static RiskyUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskyUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RiskyUser currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("history", (n) -> { currentObject.setHistory(n.getCollectionOfObjectValues(RiskyUserHistoryItem::createFromDiscriminatorValue)); });
            this.put("isDeleted", (n) -> { currentObject.setIsDeleted(n.getBooleanValue()); });
            this.put("isProcessing", (n) -> { currentObject.setIsProcessing(n.getBooleanValue()); });
            this.put("riskDetail", (n) -> { currentObject.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
            this.put("riskLastUpdatedDateTime", (n) -> { currentObject.setRiskLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("riskLevel", (n) -> { currentObject.setRiskLevel(n.getEnumValue(RiskLevel.class)); });
            this.put("riskState", (n) -> { currentObject.setRiskState(n.getEnumValue(RiskState.class)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the history property value. The activity related to user risk level change
     * @return a riskyUserHistoryItem
     */
    @javax.annotation.Nullable
    public java.util.List<RiskyUserHistoryItem> getHistory() {
        return this._history;
    }
    /**
     * Gets the isDeleted property value. Indicates whether the user is deleted. Possible values are: true, false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeleted() {
        return this._isDeleted;
    }
    /**
     * Gets the isProcessing property value. Indicates whether a user's risky state is being processed by the backend.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsProcessing() {
        return this._isProcessing;
    }
    /**
     * Gets the riskDetail property value. The possible values are none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue.
     * @return a riskDetail
     */
    @javax.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this._riskDetail;
    }
    /**
     * Gets the riskLastUpdatedDateTime property value. The date and time that the risky user was last updated.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRiskLastUpdatedDateTime() {
        return this._riskLastUpdatedDateTime;
    }
    /**
     * Gets the riskLevel property value. Level of the detected risky user. The possible values are low, medium, high, hidden, none, unknownFutureValue.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this._riskLevel;
    }
    /**
     * Gets the riskState property value. State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @return a riskState
     */
    @javax.annotation.Nullable
    public RiskState getRiskState() {
        return this._riskState;
    }
    /**
     * Gets the userDisplayName property value. Risky user display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. Risky user principal name.
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
     * @return a void
     */
    public void setHistory(@javax.annotation.Nullable final java.util.List<RiskyUserHistoryItem> value) {
        this._history = value;
    }
    /**
     * Sets the isDeleted property value. Indicates whether the user is deleted. Possible values are: true, false.
     * @param value Value to set for the isDeleted property.
     * @return a void
     */
    public void setIsDeleted(@javax.annotation.Nullable final Boolean value) {
        this._isDeleted = value;
    }
    /**
     * Sets the isProcessing property value. Indicates whether a user's risky state is being processed by the backend.
     * @param value Value to set for the isProcessing property.
     * @return a void
     */
    public void setIsProcessing(@javax.annotation.Nullable final Boolean value) {
        this._isProcessing = value;
    }
    /**
     * Sets the riskDetail property value. The possible values are none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue.
     * @param value Value to set for the riskDetail property.
     * @return a void
     */
    public void setRiskDetail(@javax.annotation.Nullable final RiskDetail value) {
        this._riskDetail = value;
    }
    /**
     * Sets the riskLastUpdatedDateTime property value. The date and time that the risky user was last updated.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the riskLastUpdatedDateTime property.
     * @return a void
     */
    public void setRiskLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._riskLastUpdatedDateTime = value;
    }
    /**
     * Sets the riskLevel property value. Level of the detected risky user. The possible values are low, medium, high, hidden, none, unknownFutureValue.
     * @param value Value to set for the riskLevel property.
     * @return a void
     */
    public void setRiskLevel(@javax.annotation.Nullable final RiskLevel value) {
        this._riskLevel = value;
    }
    /**
     * Sets the riskState property value. State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @param value Value to set for the riskState property.
     * @return a void
     */
    public void setRiskState(@javax.annotation.Nullable final RiskState value) {
        this._riskState = value;
    }
    /**
     * Sets the userDisplayName property value. Risky user display name.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. Risky user principal name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
