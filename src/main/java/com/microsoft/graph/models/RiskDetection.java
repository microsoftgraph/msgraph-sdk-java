package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RiskDetection extends Entity implements Parsable {
    /** Indicates the activity type the detected risk is linked to. The possible values are signin, user, unknownFutureValue.  */
    private ActivityType _activity;
    /** Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _activityDateTime;
    /** Additional information associated with the risk detection in JSON format.  */
    private String _additionalInfo;
    /** Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.  */
    private String _correlationId;
    /** Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _detectedDateTime;
    /** Timing of the detected risk (real-time/offline). The possible values are notDefined, realtime, nearRealtime, offline, unknownFutureValue.  */
    private RiskDetectionTimingType _detectionTimingType;
    /** Provides the IP address of the client from where the risk occurred.  */
    private String _ipAddress;
    /** Date and time that the risk detection was last updated.  */
    private OffsetDateTime _lastUpdatedDateTime;
    /** Location of the sign-in.  */
    private SignInLocation _location;
    /** Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.  */
    private String _requestId;
    /** Details of the detected risk. The possible values are none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden.  */
    private RiskDetail _riskDetail;
    /** The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, mcasImpossibleTravel, mcasSuspiciousInboxManipulationRules, investigationsThreatIntelligenceSigninLinked, maliciousIPAddressValidCredentialsBlockedIP, and unknownFutureValue.  For more information about each value, see riskEventType values.  */
    private String _riskEventType;
    /** Level of the detected risk. The possible values are low, medium, high, hidden, none, unknownFutureValue. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden.  */
    private RiskLevel _riskLevel;
    /** The state of a detected risky user or sign-in. The possible values are none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, and unknownFutureValue.  */
    private RiskState _riskState;
    /** Source of the risk detection. For example, activeDirectory.  */
    private String _source;
    /** Indicates the type of token issuer for the detected sign-in risk. The possible values are AzureAD, ADFederationServices, and unknownFutureValue.  */
    private TokenIssuerType _tokenIssuerType;
    /** Name of the user.  */
    private String _userDisplayName;
    /** Unique ID of the user.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private String _userId;
    /** The user principal name (UPN) of the user.  */
    private String _userPrincipalName;
    /**
     * Instantiates a new riskDetection and sets the default values.
     * @return a void
     */
    public RiskDetection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a riskDetection
     */
    @javax.annotation.Nonnull
    public static RiskDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskDetection();
    }
    /**
     * Gets the activity property value. Indicates the activity type the detected risk is linked to. The possible values are signin, user, unknownFutureValue.
     * @return a activityType
     */
    @javax.annotation.Nullable
    public ActivityType getActivity() {
        return this._activity;
    }
    /**
     * Gets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this._activityDateTime;
    }
    /**
     * Gets the additionalInfo property value. Additional information associated with the risk detection in JSON format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInfo() {
        return this._additionalInfo;
    }
    /**
     * Gets the correlationId property value. Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this._detectedDateTime;
    }
    /**
     * Gets the detectionTimingType property value. Timing of the detected risk (real-time/offline). The possible values are notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @return a riskDetectionTimingType
     */
    @javax.annotation.Nullable
    public RiskDetectionTimingType getDetectionTimingType() {
        return this._detectionTimingType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RiskDetection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activity", (n) -> { currentObject.setActivity(n.getEnumValue(ActivityType.class)); });
            this.put("activityDateTime", (n) -> { currentObject.setActivityDateTime(n.getOffsetDateTimeValue()); });
            this.put("additionalInfo", (n) -> { currentObject.setAdditionalInfo(n.getStringValue()); });
            this.put("correlationId", (n) -> { currentObject.setCorrelationId(n.getStringValue()); });
            this.put("detectedDateTime", (n) -> { currentObject.setDetectedDateTime(n.getOffsetDateTimeValue()); });
            this.put("detectionTimingType", (n) -> { currentObject.setDetectionTimingType(n.getEnumValue(RiskDetectionTimingType.class)); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(SignInLocation::createFromDiscriminatorValue)); });
            this.put("requestId", (n) -> { currentObject.setRequestId(n.getStringValue()); });
            this.put("riskDetail", (n) -> { currentObject.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
            this.put("riskEventType", (n) -> { currentObject.setRiskEventType(n.getStringValue()); });
            this.put("riskLevel", (n) -> { currentObject.setRiskLevel(n.getEnumValue(RiskLevel.class)); });
            this.put("riskState", (n) -> { currentObject.setRiskState(n.getEnumValue(RiskState.class)); });
            this.put("source", (n) -> { currentObject.setSource(n.getStringValue()); });
            this.put("tokenIssuerType", (n) -> { currentObject.setTokenIssuerType(n.getEnumValue(TokenIssuerType.class)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time that the risk detection was last updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the location property value. Location of the sign-in.
     * @return a signInLocation
     */
    @javax.annotation.Nullable
    public SignInLocation getLocation() {
        return this._location;
    }
    /**
     * Gets the requestId property value. Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestId() {
        return this._requestId;
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. The possible values are none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden.
     * @return a riskDetail
     */
    @javax.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this._riskDetail;
    }
    /**
     * Gets the riskEventType property value. The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, mcasImpossibleTravel, mcasSuspiciousInboxManipulationRules, investigationsThreatIntelligenceSigninLinked, maliciousIPAddressValidCredentialsBlockedIP, and unknownFutureValue.  For more information about each value, see riskEventType values.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskEventType() {
        return this._riskEventType;
    }
    /**
     * Gets the riskLevel property value. Level of the detected risk. The possible values are low, medium, high, hidden, none, unknownFutureValue. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this._riskLevel;
    }
    /**
     * Gets the riskState property value. The state of a detected risky user or sign-in. The possible values are none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, and unknownFutureValue.
     * @return a riskState
     */
    @javax.annotation.Nullable
    public RiskState getRiskState() {
        return this._riskState;
    }
    /**
     * Gets the source property value. Source of the risk detection. For example, activeDirectory.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSource() {
        return this._source;
    }
    /**
     * Gets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are AzureAD, ADFederationServices, and unknownFutureValue.
     * @return a tokenIssuerType
     */
    @javax.annotation.Nullable
    public TokenIssuerType getTokenIssuerType() {
        return this._tokenIssuerType;
    }
    /**
     * Gets the userDisplayName property value. Name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userId property value. Unique ID of the user.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user.
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
        writer.writeEnumValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("additionalInfo", this.getAdditionalInfo());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("detectedDateTime", this.getDetectedDateTime());
        writer.writeEnumValue("detectionTimingType", this.getDetectionTimingType());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("requestId", this.getRequestId());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeStringValue("riskEventType", this.getRiskEventType());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeStringValue("source", this.getSource());
        writer.writeEnumValue("tokenIssuerType", this.getTokenIssuerType());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the activity property value. Indicates the activity type the detected risk is linked to. The possible values are signin, user, unknownFutureValue.
     * @param value Value to set for the activity property.
     * @return a void
     */
    public void setActivity(@javax.annotation.Nullable final ActivityType value) {
        this._activity = value;
    }
    /**
     * Sets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the additionalInfo property value. Additional information associated with the risk detection in JSON format.
     * @param value Value to set for the additionalInfo property.
     * @return a void
     */
    public void setAdditionalInfo(@javax.annotation.Nullable final String value) {
        this._additionalInfo = value;
    }
    /**
     * Sets the correlationId property value. Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the detectedDateTime property.
     * @return a void
     */
    public void setDetectedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._detectedDateTime = value;
    }
    /**
     * Sets the detectionTimingType property value. Timing of the detected risk (real-time/offline). The possible values are notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @param value Value to set for the detectionTimingType property.
     * @return a void
     */
    public void setDetectionTimingType(@javax.annotation.Nullable final RiskDetectionTimingType value) {
        this._detectionTimingType = value;
    }
    /**
     * Sets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time that the risk detection was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the location property value. Location of the sign-in.
     * @param value Value to set for the location property.
     * @return a void
     */
    public void setLocation(@javax.annotation.Nullable final SignInLocation value) {
        this._location = value;
    }
    /**
     * Sets the requestId property value. Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @param value Value to set for the requestId property.
     * @return a void
     */
    public void setRequestId(@javax.annotation.Nullable final String value) {
        this._requestId = value;
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. The possible values are none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden.
     * @param value Value to set for the riskDetail property.
     * @return a void
     */
    public void setRiskDetail(@javax.annotation.Nullable final RiskDetail value) {
        this._riskDetail = value;
    }
    /**
     * Sets the riskEventType property value. The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, mcasImpossibleTravel, mcasSuspiciousInboxManipulationRules, investigationsThreatIntelligenceSigninLinked, maliciousIPAddressValidCredentialsBlockedIP, and unknownFutureValue.  For more information about each value, see riskEventType values.
     * @param value Value to set for the riskEventType property.
     * @return a void
     */
    public void setRiskEventType(@javax.annotation.Nullable final String value) {
        this._riskEventType = value;
    }
    /**
     * Sets the riskLevel property value. Level of the detected risk. The possible values are low, medium, high, hidden, none, unknownFutureValue. Note: Details for this property are only available for Azure AD Premium P2 customers. P1 customers will be returned hidden.
     * @param value Value to set for the riskLevel property.
     * @return a void
     */
    public void setRiskLevel(@javax.annotation.Nullable final RiskLevel value) {
        this._riskLevel = value;
    }
    /**
     * Sets the riskState property value. The state of a detected risky user or sign-in. The possible values are none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, and unknownFutureValue.
     * @param value Value to set for the riskState property.
     * @return a void
     */
    public void setRiskState(@javax.annotation.Nullable final RiskState value) {
        this._riskState = value;
    }
    /**
     * Sets the source property value. Source of the risk detection. For example, activeDirectory.
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final String value) {
        this._source = value;
    }
    /**
     * Sets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are AzureAD, ADFederationServices, and unknownFutureValue.
     * @param value Value to set for the tokenIssuerType property.
     * @return a void
     */
    public void setTokenIssuerType(@javax.annotation.Nullable final TokenIssuerType value) {
        this._tokenIssuerType = value;
    }
    /**
     * Sets the userDisplayName property value. Name of the user.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. Unique ID of the user.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
