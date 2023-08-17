package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RiskDetection extends Entity implements Parsable {
    /**
     * Indicates the activity type the detected risk is linked to. Possible values are: signin, user, unknownFutureValue.
     */
    private ActivityType activity;
    /**
     * Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     */
    private OffsetDateTime activityDateTime;
    /**
     * Additional information associated with the risk detection in JSON format. For example, '[{/'Key/':/'userAgent/',/'Value/':/'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36/'}]'. Possible keys in the additionalInfo JSON string are: userAgent, alertUrl, relatedEventTimeInUtc, relatedUserAgent, deviceInformation, relatedLocation, requestId, correlationId, lastActivityTimeInUtc, malwareName, clientLocation, clientIp, riskReasons. For more information about riskReasons and possible values, see riskReasons values.
     */
    private String additionalInfo;
    /**
     * Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     */
    private String correlationId;
    /**
     * Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: 2014-01-01T00:00:00Z
     */
    private OffsetDateTime detectedDateTime;
    /**
     * Timing of the detected risk (real-time/offline). Possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     */
    private RiskDetectionTimingType detectionTimingType;
    /**
     * Provides the IP address of the client from where the risk occurred.
     */
    private String ipAddress;
    /**
     * Date and time that the risk detection was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * Location of the sign-in.
     */
    private SignInLocation location;
    /**
     * Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     */
    private String requestId;
    /**
     * Details of the detected risk. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue, m365DAdminDismissedDetection. Note that you must use the Prefer: include - unknown -enum-members request header to get the following value(s) in this evolvable enum: m365DAdminDismissedDetection.
     */
    private RiskDetail riskDetail;
    /**
     * The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, passwordSpray, impossibleTravel, newCountry, anomalousToken, tokenIssuerAnomaly,suspiciousBrowser, riskyIPAddress, mcasSuspiciousInboxManipulationRules, suspiciousInboxForwarding, and anomalousUserActivity. If the risk detection is a premium detection, will show generic. For more information about each value, see riskEventType values.
     */
    private String riskEventType;
    /**
     * Level of the detected risk. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     */
    private RiskLevel riskLevel;
    /**
     * The state of a detected risky user or sign-in. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     */
    private RiskState riskState;
    /**
     * Source of the risk detection. For example, activeDirectory.
     */
    private String source;
    /**
     * Indicates the type of token issuer for the detected sign-in risk. Possible values are: AzureAD, ADFederationServices, UnknownFutureValue.
     */
    private TokenIssuerType tokenIssuerType;
    /**
     * The user principal name (UPN) of the user.
     */
    private String userDisplayName;
    /**
     * Unique ID of the user.
     */
    private String userId;
    /**
     * The user principal name (UPN) of the user.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new riskDetection and sets the default values.
     */
    public RiskDetection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a riskDetection
     */
    @jakarta.annotation.Nonnull
    public static RiskDetection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskDetection();
    }
    /**
     * Gets the activity property value. Indicates the activity type the detected risk is linked to. Possible values are: signin, user, unknownFutureValue.
     * @return a activityType
     */
    @jakarta.annotation.Nullable
    public ActivityType getActivity() {
        return this.activity;
    }
    /**
     * Gets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.activityDateTime;
    }
    /**
     * Gets the additionalInfo property value. Additional information associated with the risk detection in JSON format. For example, '[{/'Key/':/'userAgent/',/'Value/':/'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36/'}]'. Possible keys in the additionalInfo JSON string are: userAgent, alertUrl, relatedEventTimeInUtc, relatedUserAgent, deviceInformation, relatedLocation, requestId, correlationId, lastActivityTimeInUtc, malwareName, clientLocation, clientIp, riskReasons. For more information about riskReasons and possible values, see riskReasons values.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }
    /**
     * Gets the correlationId property value. Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this.detectedDateTime;
    }
    /**
     * Gets the detectionTimingType property value. Timing of the detected risk (real-time/offline). Possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @return a riskDetectionTimingType
     */
    @jakarta.annotation.Nullable
    public RiskDetectionTimingType getDetectionTimingType() {
        return this.detectionTimingType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getEnumValue(ActivityType.class)); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("detectedDateTime", (n) -> { this.setDetectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("detectionTimingType", (n) -> { this.setDetectionTimingType(n.getEnumValue(RiskDetectionTimingType.class)); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(SignInLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("requestId", (n) -> { this.setRequestId(n.getStringValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
        deserializerMap.put("riskEventType", (n) -> { this.setRiskEventType(n.getStringValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState.class)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("tokenIssuerType", (n) -> { this.setTokenIssuerType(n.getEnumValue(TokenIssuerType.class)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time that the risk detection was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the location property value. Location of the sign-in.
     * @return a signInLocation
     */
    @jakarta.annotation.Nullable
    public SignInLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the requestId property value. Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return this.requestId;
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue, m365DAdminDismissedDetection. Note that you must use the Prefer: include - unknown -enum-members request header to get the following value(s) in this evolvable enum: m365DAdminDismissedDetection.
     * @return a riskDetail
     */
    @jakarta.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this.riskDetail;
    }
    /**
     * Gets the riskEventType property value. The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, passwordSpray, impossibleTravel, newCountry, anomalousToken, tokenIssuerAnomaly,suspiciousBrowser, riskyIPAddress, mcasSuspiciousInboxManipulationRules, suspiciousInboxForwarding, and anomalousUserActivity. If the risk detection is a premium detection, will show generic. For more information about each value, see riskEventType values.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRiskEventType() {
        return this.riskEventType;
    }
    /**
     * Gets the riskLevel property value. Level of the detected risk. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     * @return a riskLevel
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this.riskLevel;
    }
    /**
     * Gets the riskState property value. The state of a detected risky user or sign-in. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @return a riskState
     */
    @jakarta.annotation.Nullable
    public RiskState getRiskState() {
        return this.riskState;
    }
    /**
     * Gets the source property value. Source of the risk detection. For example, activeDirectory.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.source;
    }
    /**
     * Gets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. Possible values are: AzureAD, ADFederationServices, UnknownFutureValue.
     * @return a tokenIssuerType
     */
    @jakarta.annotation.Nullable
    public TokenIssuerType getTokenIssuerType() {
        return this.tokenIssuerType;
    }
    /**
     * Gets the userDisplayName property value. The user principal name (UPN) of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. Unique ID of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user.
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
     * Sets the activity property value. Indicates the activity type the detected risk is linked to. Possible values are: signin, user, unknownFutureValue.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final ActivityType value) {
        this.activity = value;
    }
    /**
     * Sets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.activityDateTime = value;
    }
    /**
     * Sets the additionalInfo property value. Additional information associated with the risk detection in JSON format. For example, '[{/'Key/':/'userAgent/',/'Value/':/'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36/'}]'. Possible keys in the additionalInfo JSON string are: userAgent, alertUrl, relatedEventTimeInUtc, relatedUserAgent, deviceInformation, relatedLocation, requestId, correlationId, lastActivityTimeInUtc, malwareName, clientLocation, clientIp, riskReasons. For more information about riskReasons and possible values, see riskReasons values.
     * @param value Value to set for the additionalInfo property.
     */
    public void setAdditionalInfo(@jakarta.annotation.Nullable final String value) {
        this.additionalInfo = value;
    }
    /**
     * Sets the correlationId property value. Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: 2014-01-01T00:00:00Z
     * @param value Value to set for the detectedDateTime property.
     */
    public void setDetectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.detectedDateTime = value;
    }
    /**
     * Sets the detectionTimingType property value. Timing of the detected risk (real-time/offline). Possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @param value Value to set for the detectionTimingType property.
     */
    public void setDetectionTimingType(@jakarta.annotation.Nullable final RiskDetectionTimingType value) {
        this.detectionTimingType = value;
    }
    /**
     * Sets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time that the risk detection was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the location property value. Location of the sign-in.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final SignInLocation value) {
        this.location = value;
    }
    /**
     * Sets the requestId property value. Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @param value Value to set for the requestId property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final String value) {
        this.requestId = value;
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue, m365DAdminDismissedDetection. Note that you must use the Prefer: include - unknown -enum-members request header to get the following value(s) in this evolvable enum: m365DAdminDismissedDetection.
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetail value) {
        this.riskDetail = value;
    }
    /**
     * Sets the riskEventType property value. The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, passwordSpray, impossibleTravel, newCountry, anomalousToken, tokenIssuerAnomaly,suspiciousBrowser, riskyIPAddress, mcasSuspiciousInboxManipulationRules, suspiciousInboxForwarding, and anomalousUserActivity. If the risk detection is a premium detection, will show generic. For more information about each value, see riskEventType values.
     * @param value Value to set for the riskEventType property.
     */
    public void setRiskEventType(@jakarta.annotation.Nullable final String value) {
        this.riskEventType = value;
    }
    /**
     * Sets the riskLevel property value. Level of the detected risk. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     * @param value Value to set for the riskLevel property.
     */
    public void setRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.riskLevel = value;
    }
    /**
     * Sets the riskState property value. The state of a detected risky user or sign-in. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     * @param value Value to set for the riskState property.
     */
    public void setRiskState(@jakarta.annotation.Nullable final RiskState value) {
        this.riskState = value;
    }
    /**
     * Sets the source property value. Source of the risk detection. For example, activeDirectory.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
    /**
     * Sets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. Possible values are: AzureAD, ADFederationServices, UnknownFutureValue.
     * @param value Value to set for the tokenIssuerType property.
     */
    public void setTokenIssuerType(@jakarta.annotation.Nullable final TokenIssuerType value) {
        this.tokenIssuerType = value;
    }
    /**
     * Sets the userDisplayName property value. The user principal name (UPN) of the user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. Unique ID of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
