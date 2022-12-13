package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of agreement entities.
 */
public class ServicePrincipalRiskDetection extends Entity implements Parsable {
    /** Indicates the activity type the detected risk is linked to.  The possible values are: signin, servicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: servicePrincipal. */
    private ActivityType _activity;
    /** Date and time when the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _activityDateTime;
    /** Additional information associated with the risk detection. This string value is represented as a JSON object with the quotations escaped. */
    private String _additionalInfo;
    /** The unique identifier for the associated application. */
    private String _appId;
    /** Correlation ID of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity. */
    private String _correlationId;
    /** Date and time when the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _detectedDateTime;
    /** Timing of the detected risk , whether real-time or offline. The possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue. */
    private RiskDetectionTimingType _detectionTimingType;
    /** Provides the IP address of the client from where the risk occurred. */
    private String _ipAddress;
    /** The unique identifier for the key credential associated with the risk detection. */
    private java.util.List<String> _keyIds;
    /** Date and time when the risk detection was last updated. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** Location from where the sign-in was initiated. */
    private SignInLocation _location;
    /** Request identifier of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity. Supports $filter (eq). */
    private String _requestId;
    /** Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal. */
    private RiskDetail _riskDetail;
    /** The type of risk event detected. The possible values are: investigationsThreatIntelligence, generic, adminConfirmedServicePrincipalCompromised, suspiciousSignins, leakedCredentials, anomalousServicePrincipalActivity, maliciousApplication, suspiciousApplication. */
    private String _riskEventType;
    /** Level of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: low, medium, high, hidden, none. */
    private RiskLevel _riskLevel;
    /** The state of a detected risky service principal or sign-in activity. The possible values are: none, dismissed, atRisk, confirmedCompromised. */
    private RiskState _riskState;
    /** The display name for the service principal. */
    private String _servicePrincipalDisplayName;
    /** The unique identifier for the service principal. Supports $filter (eq). */
    private String _servicePrincipalId;
    /** Source of the risk detection. For example, identityProtection. */
    private String _source;
    /** Indicates the type of token issuer for the detected sign-in risk. The possible values are: AzureAD. */
    private TokenIssuerType _tokenIssuerType;
    /**
     * Instantiates a new servicePrincipalRiskDetection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrincipalRiskDetection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a servicePrincipalRiskDetection
     */
    @javax.annotation.Nonnull
    public static ServicePrincipalRiskDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalRiskDetection();
    }
    /**
     * Gets the activity property value. Indicates the activity type the detected risk is linked to.  The possible values are: signin, servicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: servicePrincipal.
     * @return a activityType
     */
    @javax.annotation.Nullable
    public ActivityType getActivity() {
        return this._activity;
    }
    /**
     * Gets the activityDateTime property value. Date and time when the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this._activityDateTime;
    }
    /**
     * Gets the additionalInfo property value. Additional information associated with the risk detection. This string value is represented as a JSON object with the quotations escaped.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInfo() {
        return this._additionalInfo;
    }
    /**
     * Gets the appId property value. The unique identifier for the associated application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the correlationId property value. Correlation ID of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the detectedDateTime property value. Date and time when the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this._detectedDateTime;
    }
    /**
     * Gets the detectionTimingType property value. Timing of the detected risk , whether real-time or offline. The possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getEnumValue(ActivityType.class)); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("detectedDateTime", (n) -> { this.setDetectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("detectionTimingType", (n) -> { this.setDetectionTimingType(n.getEnumValue(RiskDetectionTimingType.class)); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("keyIds", (n) -> { this.setKeyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(SignInLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("requestId", (n) -> { this.setRequestId(n.getStringValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
        deserializerMap.put("riskEventType", (n) -> { this.setRiskEventType(n.getStringValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState.class)); });
        deserializerMap.put("servicePrincipalDisplayName", (n) -> { this.setServicePrincipalDisplayName(n.getStringValue()); });
        deserializerMap.put("servicePrincipalId", (n) -> { this.setServicePrincipalId(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("tokenIssuerType", (n) -> { this.setTokenIssuerType(n.getEnumValue(TokenIssuerType.class)); });
        return deserializerMap;
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
     * Gets the keyIds property value. The unique identifier for the key credential associated with the risk detection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKeyIds() {
        return this._keyIds;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time when the risk detection was last updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the location property value. Location from where the sign-in was initiated.
     * @return a signInLocation
     */
    @javax.annotation.Nullable
    public SignInLocation getLocation() {
        return this._location;
    }
    /**
     * Gets the requestId property value. Request identifier of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestId() {
        return this._requestId;
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @return a riskDetail
     */
    @javax.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this._riskDetail;
    }
    /**
     * Gets the riskEventType property value. The type of risk event detected. The possible values are: investigationsThreatIntelligence, generic, adminConfirmedServicePrincipalCompromised, suspiciousSignins, leakedCredentials, anomalousServicePrincipalActivity, maliciousApplication, suspiciousApplication.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskEventType() {
        return this._riskEventType;
    }
    /**
     * Gets the riskLevel property value. Level of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: low, medium, high, hidden, none.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this._riskLevel;
    }
    /**
     * Gets the riskState property value. The state of a detected risky service principal or sign-in activity. The possible values are: none, dismissed, atRisk, confirmedCompromised.
     * @return a riskState
     */
    @javax.annotation.Nullable
    public RiskState getRiskState() {
        return this._riskState;
    }
    /**
     * Gets the servicePrincipalDisplayName property value. The display name for the service principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalDisplayName() {
        return this._servicePrincipalDisplayName;
    }
    /**
     * Gets the servicePrincipalId property value. The unique identifier for the service principal. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalId() {
        return this._servicePrincipalId;
    }
    /**
     * Gets the source property value. Source of the risk detection. For example, identityProtection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSource() {
        return this._source;
    }
    /**
     * Gets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are: AzureAD.
     * @return a tokenIssuerType
     */
    @javax.annotation.Nullable
    public TokenIssuerType getTokenIssuerType() {
        return this._tokenIssuerType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("additionalInfo", this.getAdditionalInfo());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("detectedDateTime", this.getDetectedDateTime());
        writer.writeEnumValue("detectionTimingType", this.getDetectionTimingType());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeCollectionOfPrimitiveValues("keyIds", this.getKeyIds());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("requestId", this.getRequestId());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeStringValue("riskEventType", this.getRiskEventType());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeStringValue("servicePrincipalDisplayName", this.getServicePrincipalDisplayName());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
        writer.writeStringValue("source", this.getSource());
        writer.writeEnumValue("tokenIssuerType", this.getTokenIssuerType());
    }
    /**
     * Sets the activity property value. Indicates the activity type the detected risk is linked to.  The possible values are: signin, servicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: servicePrincipal.
     * @param value Value to set for the activity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivity(@javax.annotation.Nullable final ActivityType value) {
        this._activity = value;
    }
    /**
     * Sets the activityDateTime property value. Date and time when the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the additionalInfo property value. Additional information associated with the risk detection. This string value is represented as a JSON object with the quotations escaped.
     * @param value Value to set for the additionalInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalInfo(@javax.annotation.Nullable final String value) {
        this._additionalInfo = value;
    }
    /**
     * Sets the appId property value. The unique identifier for the associated application.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the correlationId property value. Correlation ID of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the detectedDateTime property value. Date and time when the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the detectedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._detectedDateTime = value;
    }
    /**
     * Sets the detectionTimingType property value. Timing of the detected risk , whether real-time or offline. The possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @param value Value to set for the detectionTimingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionTimingType(@javax.annotation.Nullable final RiskDetectionTimingType value) {
        this._detectionTimingType = value;
    }
    /**
     * Sets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the keyIds property value. The unique identifier for the key credential associated with the risk detection.
     * @param value Value to set for the keyIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._keyIds = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time when the risk detection was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the location property value. Location from where the sign-in was initiated.
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final SignInLocation value) {
        this._location = value;
    }
    /**
     * Sets the requestId property value. Request identifier of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity. Supports $filter (eq).
     * @param value Value to set for the requestId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestId(@javax.annotation.Nullable final String value) {
        this._requestId = value;
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @param value Value to set for the riskDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskDetail(@javax.annotation.Nullable final RiskDetail value) {
        this._riskDetail = value;
    }
    /**
     * Sets the riskEventType property value. The type of risk event detected. The possible values are: investigationsThreatIntelligence, generic, adminConfirmedServicePrincipalCompromised, suspiciousSignins, leakedCredentials, anomalousServicePrincipalActivity, maliciousApplication, suspiciousApplication.
     * @param value Value to set for the riskEventType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskEventType(@javax.annotation.Nullable final String value) {
        this._riskEventType = value;
    }
    /**
     * Sets the riskLevel property value. Level of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: low, medium, high, hidden, none.
     * @param value Value to set for the riskLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskLevel(@javax.annotation.Nullable final RiskLevel value) {
        this._riskLevel = value;
    }
    /**
     * Sets the riskState property value. The state of a detected risky service principal or sign-in activity. The possible values are: none, dismissed, atRisk, confirmedCompromised.
     * @param value Value to set for the riskState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskState(@javax.annotation.Nullable final RiskState value) {
        this._riskState = value;
    }
    /**
     * Sets the servicePrincipalDisplayName property value. The display name for the service principal.
     * @param value Value to set for the servicePrincipalDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalDisplayName(@javax.annotation.Nullable final String value) {
        this._servicePrincipalDisplayName = value;
    }
    /**
     * Sets the servicePrincipalId property value. The unique identifier for the service principal. Supports $filter (eq).
     * @param value Value to set for the servicePrincipalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalId(@javax.annotation.Nullable final String value) {
        this._servicePrincipalId = value;
    }
    /**
     * Sets the source property value. Source of the risk detection. For example, identityProtection.
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final String value) {
        this._source = value;
    }
    /**
     * Sets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are: AzureAD.
     * @param value Value to set for the tokenIssuerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTokenIssuerType(@javax.annotation.Nullable final TokenIssuerType value) {
        this._tokenIssuerType = value;
    }
}
