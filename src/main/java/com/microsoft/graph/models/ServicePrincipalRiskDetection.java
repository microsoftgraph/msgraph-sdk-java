package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalRiskDetection extends Entity implements Parsable {
    /**
     * Instantiates a new ServicePrincipalRiskDetection and sets the default values.
     */
    public ServicePrincipalRiskDetection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePrincipalRiskDetection
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipalRiskDetection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalRiskDetection();
    }
    /**
     * Gets the activity property value. Indicates the activity type the detected risk is linked to.  The possible values are: signin, servicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: servicePrincipal.
     * @return a ActivityType
     */
    @jakarta.annotation.Nullable
    public ActivityType getActivity() {
        return this.getBackingStore().get("activity");
    }
    /**
     * Gets the activityDateTime property value. Date and time when the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.getBackingStore().get("activityDateTime");
    }
    /**
     * Gets the additionalInfo property value. Additional information associated with the risk detection. This string value is represented as a JSON object with the quotations escaped.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInfo() {
        return this.getBackingStore().get("additionalInfo");
    }
    /**
     * Gets the appId property value. The unique identifier for the associated application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.getBackingStore().get("appId");
    }
    /**
     * Gets the correlationId property value. Correlation ID of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.getBackingStore().get("correlationId");
    }
    /**
     * Gets the detectedDateTime property value. Date and time when the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this.getBackingStore().get("detectedDateTime");
    }
    /**
     * Gets the detectionTimingType property value. Timing of the detected risk , whether real-time or offline. The possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @return a RiskDetectionTimingType
     */
    @jakarta.annotation.Nullable
    public RiskDetectionTimingType getDetectionTimingType() {
        return this.getBackingStore().get("detectionTimingType");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.getBackingStore().get("ipAddress");
    }
    /**
     * Gets the keyIds property value. The unique identifier for the key credential associated with the risk detection.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKeyIds() {
        return this.getBackingStore().get("keyIds");
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time when the risk detection was last updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.getBackingStore().get("lastUpdatedDateTime");
    }
    /**
     * Gets the location property value. Location from where the sign-in was initiated.
     * @return a SignInLocation
     */
    @jakarta.annotation.Nullable
    public SignInLocation getLocation() {
        return this.getBackingStore().get("location");
    }
    /**
     * Gets the requestId property value. Request identifier of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return this.getBackingStore().get("requestId");
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @return a RiskDetail
     */
    @jakarta.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this.getBackingStore().get("riskDetail");
    }
    /**
     * Gets the riskEventType property value. The type of risk event detected. The possible values are: investigationsThreatIntelligence, generic, adminConfirmedServicePrincipalCompromised, suspiciousSignins, leakedCredentials, anomalousServicePrincipalActivity, maliciousApplication, suspiciousApplication.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRiskEventType() {
        return this.getBackingStore().get("riskEventType");
    }
    /**
     * Gets the riskLevel property value. Level of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: low, medium, high, hidden, none.
     * @return a RiskLevel
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this.getBackingStore().get("riskLevel");
    }
    /**
     * Gets the riskState property value. The state of a detected risky service principal or sign-in activity. The possible values are: none, dismissed, atRisk, confirmedCompromised.
     * @return a RiskState
     */
    @jakarta.annotation.Nullable
    public RiskState getRiskState() {
        return this.getBackingStore().get("riskState");
    }
    /**
     * Gets the servicePrincipalDisplayName property value. The display name for the service principal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalDisplayName() {
        return this.getBackingStore().get("servicePrincipalDisplayName");
    }
    /**
     * Gets the servicePrincipalId property value. The unique identifier for the service principal. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalId() {
        return this.getBackingStore().get("servicePrincipalId");
    }
    /**
     * Gets the source property value. Source of the risk detection. For example, identityProtection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.getBackingStore().get("source");
    }
    /**
     * Gets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are: AzureAD.
     * @return a TokenIssuerType
     */
    @jakarta.annotation.Nullable
    public TokenIssuerType getTokenIssuerType() {
        return this.getBackingStore().get("tokenIssuerType");
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
     */
    public void setActivity(@jakarta.annotation.Nullable final ActivityType value) {
        this.getBackingStore().set("activity", value);
    }
    /**
     * Sets the activityDateTime property value. Date and time when the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("activityDateTime", value);
    }
    /**
     * Sets the additionalInfo property value. Additional information associated with the risk detection. This string value is represented as a JSON object with the quotations escaped.
     * @param value Value to set for the additionalInfo property.
     */
    public void setAdditionalInfo(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("additionalInfo", value);
    }
    /**
     * Sets the appId property value. The unique identifier for the associated application.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("appId", value);
    }
    /**
     * Sets the correlationId property value. Correlation ID of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("correlationId", value);
    }
    /**
     * Sets the detectedDateTime property value. Date and time when the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the detectedDateTime property.
     */
    public void setDetectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("detectedDateTime", value);
    }
    /**
     * Sets the detectionTimingType property value. Timing of the detected risk , whether real-time or offline. The possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @param value Value to set for the detectionTimingType property.
     */
    public void setDetectionTimingType(@jakarta.annotation.Nullable final RiskDetectionTimingType value) {
        this.getBackingStore().set("detectionTimingType", value);
    }
    /**
     * Sets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("ipAddress", value);
    }
    /**
     * Sets the keyIds property value. The unique identifier for the key credential associated with the risk detection.
     * @param value Value to set for the keyIds property.
     */
    public void setKeyIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("keyIds", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time when the risk detection was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the location property value. Location from where the sign-in was initiated.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final SignInLocation value) {
        this.getBackingStore().set("location", value);
    }
    /**
     * Sets the requestId property value. Request identifier of the sign-in activity associated with the risk detection. This property is null if the risk detection is not associated with a sign-in activity. Supports $filter (eq).
     * @param value Value to set for the requestId property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("requestId", value);
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetail value) {
        this.getBackingStore().set("riskDetail", value);
    }
    /**
     * Sets the riskEventType property value. The type of risk event detected. The possible values are: investigationsThreatIntelligence, generic, adminConfirmedServicePrincipalCompromised, suspiciousSignins, leakedCredentials, anomalousServicePrincipalActivity, maliciousApplication, suspiciousApplication.
     * @param value Value to set for the riskEventType property.
     */
    public void setRiskEventType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("riskEventType", value);
    }
    /**
     * Sets the riskLevel property value. Level of the detected risk. Note: Details for this property are only available for Workload Identities Premium customers. Events in tenants without this license will be returned hidden. The possible values are: low, medium, high, hidden, none.
     * @param value Value to set for the riskLevel property.
     */
    public void setRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.getBackingStore().set("riskLevel", value);
    }
    /**
     * Sets the riskState property value. The state of a detected risky service principal or sign-in activity. The possible values are: none, dismissed, atRisk, confirmedCompromised.
     * @param value Value to set for the riskState property.
     */
    public void setRiskState(@jakarta.annotation.Nullable final RiskState value) {
        this.getBackingStore().set("riskState", value);
    }
    /**
     * Sets the servicePrincipalDisplayName property value. The display name for the service principal.
     * @param value Value to set for the servicePrincipalDisplayName property.
     */
    public void setServicePrincipalDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("servicePrincipalDisplayName", value);
    }
    /**
     * Sets the servicePrincipalId property value. The unique identifier for the service principal. Supports $filter (eq).
     * @param value Value to set for the servicePrincipalId property.
     */
    public void setServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("servicePrincipalId", value);
    }
    /**
     * Sets the source property value. Source of the risk detection. For example, identityProtection.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("source", value);
    }
    /**
     * Sets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are: AzureAD.
     * @param value Value to set for the tokenIssuerType property.
     */
    public void setTokenIssuerType(@jakarta.annotation.Nullable final TokenIssuerType value) {
        this.getBackingStore().set("tokenIssuerType", value);
    }
}
