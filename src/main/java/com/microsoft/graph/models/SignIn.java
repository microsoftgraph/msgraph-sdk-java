package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignIn extends Entity implements Parsable {
    /**
     * App name displayed in the Microsoft Entra admin center.  Supports $filter (eq, startsWith).
     */
    private String appDisplayName;
    /**
     * Unique GUID representing the app ID in the Azure Active Directory.  Supports $filter (eq).
     */
    private String appId;
    /**
     * Provides a list of conditional access policies that are triggered by the corresponding sign-in activity.
     */
    private java.util.List<AppliedConditionalAccessPolicy> appliedConditionalAccessPolicies;
    /**
     * Identifies the client used for the sign-in activity. Modern authentication clients include Browser, modern clients. Legacy authentication clients include Exchange ActiveSync, IMAP, MAPI, SMTP, POP, and other clients.  Supports $filter (eq).
     */
    private String clientAppUsed;
    /**
     * Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and unknownFutureValue.  Supports $filter (eq).
     */
    private ConditionalAccessStatus conditionalAccessStatus;
    /**
     * The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity.  Supports $filter (eq).
     */
    private String correlationId;
    /**
     * Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as 2014-01-01T00:00:00Z.  Supports $orderby, $filter (eq, le, and ge).
     */
    private OffsetDateTime createdDateTime;
    /**
     * Device information from where the sign-in occurred; includes device ID, operating system, and browser.  Supports $filter (eq, startsWith) on browser and operatingSytem properties.
     */
    private DeviceDetail deviceDetail;
    /**
     * IP address of the client used to sign in.  Supports $filter (eq, startsWith).
     */
    private String ipAddress;
    /**
     * Indicates if a sign-in is interactive or not.
     */
    private Boolean isInteractive;
    /**
     * Provides the city, state, and country code where the sign-in originated.  Supports $filter (eq, startsWith) on city, state, and countryOrRegion properties.
     */
    private SignInLocation location;
    /**
     * Name of the resource the user signed into.  Supports $filter (eq).
     */
    private String resourceDisplayName;
    /**
     * ID of the resource that the user signed into.  Supports $filter (eq).
     */
    private String resourceId;
    /**
     * Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far.  Supports $filter (eq).Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the value hidden.
     */
    private RiskDetail riskDetail;
    /**
     * Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, and unknownFutureValue.  Supports $filter (eq).
     */
    private java.util.List<RiskEventType> riskEventTypes;
    /**
     * The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue.  Supports $filter (eq, startsWith).
     */
    private java.util.List<String> riskEventTypesV2;
    /**
     * Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Azure AD Identity Protection.  Supports $filter (eq).  Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     */
    private RiskLevel riskLevelAggregated;
    /**
     * Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Azure AD Identity Protection.  Supports $filter (eq).  Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     */
    private RiskLevel riskLevelDuringSignIn;
    /**
     * Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.  Supports $filter (eq).
     */
    private RiskState riskState;
    /**
     * Sign-in status. Includes the error code and description of the error (if there's a sign-in failure).  Supports $filter (eq) on errorCode property.
     */
    private SignInStatus status;
    /**
     * Display name of the user that initiated the sign-in.  Supports $filter (eq, startsWith).
     */
    private String userDisplayName;
    /**
     * ID of the user that initiated the sign-in.  Supports $filter (eq).
     */
    private String userId;
    /**
     * User principal name of the user that initiated the sign-in.  Supports $filter (eq, startsWith).
     */
    private String userPrincipalName;
    /**
     * Instantiates a new SignIn and sets the default values.
     */
    public SignIn() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SignIn
     */
    @jakarta.annotation.Nonnull
    public static SignIn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignIn();
    }
    /**
     * Gets the appDisplayName property value. App name displayed in the Microsoft Entra admin center.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the appId property value. Unique GUID representing the app ID in the Azure Active Directory.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the appliedConditionalAccessPolicies property value. Provides a list of conditional access policies that are triggered by the corresponding sign-in activity.
     * @return a java.util.List<AppliedConditionalAccessPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppliedConditionalAccessPolicy> getAppliedConditionalAccessPolicies() {
        return this.appliedConditionalAccessPolicies;
    }
    /**
     * Gets the clientAppUsed property value. Identifies the client used for the sign-in activity. Modern authentication clients include Browser, modern clients. Legacy authentication clients include Exchange ActiveSync, IMAP, MAPI, SMTP, POP, and other clients.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientAppUsed() {
        return this.clientAppUsed;
    }
    /**
     * Gets the conditionalAccessStatus property value. Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and unknownFutureValue.  Supports $filter (eq).
     * @return a ConditionalAccessStatus
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessStatus getConditionalAccessStatus() {
        return this.conditionalAccessStatus;
    }
    /**
     * Gets the correlationId property value. The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the createdDateTime property value. Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as 2014-01-01T00:00:00Z.  Supports $orderby, $filter (eq, le, and ge).
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deviceDetail property value. Device information from where the sign-in occurred; includes device ID, operating system, and browser.  Supports $filter (eq, startsWith) on browser and operatingSytem properties.
     * @return a DeviceDetail
     */
    @jakarta.annotation.Nullable
    public DeviceDetail getDeviceDetail() {
        return this.deviceDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appliedConditionalAccessPolicies", (n) -> { this.setAppliedConditionalAccessPolicies(n.getCollectionOfObjectValues(AppliedConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("clientAppUsed", (n) -> { this.setClientAppUsed(n.getStringValue()); });
        deserializerMap.put("conditionalAccessStatus", (n) -> { this.setConditionalAccessStatus(n.getEnumValue(ConditionalAccessStatus.class)); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceDetail", (n) -> { this.setDeviceDetail(n.getObjectValue(DeviceDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("isInteractive", (n) -> { this.setIsInteractive(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(SignInLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceDisplayName", (n) -> { this.setResourceDisplayName(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
        deserializerMap.put("riskEventTypes", (n) -> { this.setRiskEventTypes(n.getCollectionOfEnumValues(RiskEventType.class)); });
        deserializerMap.put("riskEventTypes_v2", (n) -> { this.setRiskEventTypesV2(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("riskLevelAggregated", (n) -> { this.setRiskLevelAggregated(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskLevelDuringSignIn", (n) -> { this.setRiskLevelDuringSignIn(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(SignInStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IP address of the client used to sign in.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the isInteractive property value. Indicates if a sign-in is interactive or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInteractive() {
        return this.isInteractive;
    }
    /**
     * Gets the location property value. Provides the city, state, and country code where the sign-in originated.  Supports $filter (eq, startsWith) on city, state, and countryOrRegion properties.
     * @return a SignInLocation
     */
    @jakarta.annotation.Nullable
    public SignInLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the resourceDisplayName property value. Name of the resource the user signed into.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceDisplayName() {
        return this.resourceDisplayName;
    }
    /**
     * Gets the resourceId property value. ID of the resource that the user signed into.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Gets the riskDetail property value. Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far.  Supports $filter (eq).Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the value hidden.
     * @return a RiskDetail
     */
    @jakarta.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this.riskDetail;
    }
    /**
     * Gets the riskEventTypes property value. Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, and unknownFutureValue.  Supports $filter (eq).
     * @return a java.util.List<RiskEventType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RiskEventType> getRiskEventTypes() {
        return this.riskEventTypes;
    }
    /**
     * Gets the riskEventTypes_v2 property value. The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue.  Supports $filter (eq, startsWith).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRiskEventTypesV2() {
        return this.riskEventTypesV2;
    }
    /**
     * Gets the riskLevelAggregated property value. Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Azure AD Identity Protection.  Supports $filter (eq).  Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @return a RiskLevel
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevelAggregated() {
        return this.riskLevelAggregated;
    }
    /**
     * Gets the riskLevelDuringSignIn property value. Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Azure AD Identity Protection.  Supports $filter (eq).  Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @return a RiskLevel
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevelDuringSignIn() {
        return this.riskLevelDuringSignIn;
    }
    /**
     * Gets the riskState property value. Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.  Supports $filter (eq).
     * @return a RiskState
     */
    @jakarta.annotation.Nullable
    public RiskState getRiskState() {
        return this.riskState;
    }
    /**
     * Gets the status property value. Sign-in status. Includes the error code and description of the error (if there's a sign-in failure).  Supports $filter (eq) on errorCode property.
     * @return a SignInStatus
     */
    @jakarta.annotation.Nullable
    public SignInStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user that initiated the sign-in.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. ID of the user that initiated the sign-in.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. User principal name of the user that initiated the sign-in.  Supports $filter (eq, startsWith).
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
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfObjectValues("appliedConditionalAccessPolicies", this.getAppliedConditionalAccessPolicies());
        writer.writeStringValue("clientAppUsed", this.getClientAppUsed());
        writer.writeEnumValue("conditionalAccessStatus", this.getConditionalAccessStatus());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("deviceDetail", this.getDeviceDetail());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeBooleanValue("isInteractive", this.getIsInteractive());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("resourceDisplayName", this.getResourceDisplayName());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeCollectionOfEnumValues("riskEventTypes", this.getRiskEventTypes());
        writer.writeCollectionOfPrimitiveValues("riskEventTypes_v2", this.getRiskEventTypesV2());
        writer.writeEnumValue("riskLevelAggregated", this.getRiskLevelAggregated());
        writer.writeEnumValue("riskLevelDuringSignIn", this.getRiskLevelDuringSignIn());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the appDisplayName property value. App name displayed in the Microsoft Entra admin center.  Supports $filter (eq, startsWith).
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the appId property value. Unique GUID representing the app ID in the Azure Active Directory.  Supports $filter (eq).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the appliedConditionalAccessPolicies property value. Provides a list of conditional access policies that are triggered by the corresponding sign-in activity.
     * @param value Value to set for the appliedConditionalAccessPolicies property.
     */
    public void setAppliedConditionalAccessPolicies(@jakarta.annotation.Nullable final java.util.List<AppliedConditionalAccessPolicy> value) {
        this.appliedConditionalAccessPolicies = value;
    }
    /**
     * Sets the clientAppUsed property value. Identifies the client used for the sign-in activity. Modern authentication clients include Browser, modern clients. Legacy authentication clients include Exchange ActiveSync, IMAP, MAPI, SMTP, POP, and other clients.  Supports $filter (eq).
     * @param value Value to set for the clientAppUsed property.
     */
    public void setClientAppUsed(@jakarta.annotation.Nullable final String value) {
        this.clientAppUsed = value;
    }
    /**
     * Sets the conditionalAccessStatus property value. Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and unknownFutureValue.  Supports $filter (eq).
     * @param value Value to set for the conditionalAccessStatus property.
     */
    public void setConditionalAccessStatus(@jakarta.annotation.Nullable final ConditionalAccessStatus value) {
        this.conditionalAccessStatus = value;
    }
    /**
     * Sets the correlationId property value. The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity.  Supports $filter (eq).
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as 2014-01-01T00:00:00Z.  Supports $orderby, $filter (eq, le, and ge).
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deviceDetail property value. Device information from where the sign-in occurred; includes device ID, operating system, and browser.  Supports $filter (eq, startsWith) on browser and operatingSytem properties.
     * @param value Value to set for the deviceDetail property.
     */
    public void setDeviceDetail(@jakarta.annotation.Nullable final DeviceDetail value) {
        this.deviceDetail = value;
    }
    /**
     * Sets the ipAddress property value. IP address of the client used to sign in.  Supports $filter (eq, startsWith).
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the isInteractive property value. Indicates if a sign-in is interactive or not.
     * @param value Value to set for the isInteractive property.
     */
    public void setIsInteractive(@jakarta.annotation.Nullable final Boolean value) {
        this.isInteractive = value;
    }
    /**
     * Sets the location property value. Provides the city, state, and country code where the sign-in originated.  Supports $filter (eq, startsWith) on city, state, and countryOrRegion properties.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final SignInLocation value) {
        this.location = value;
    }
    /**
     * Sets the resourceDisplayName property value. Name of the resource the user signed into.  Supports $filter (eq).
     * @param value Value to set for the resourceDisplayName property.
     */
    public void setResourceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.resourceDisplayName = value;
    }
    /**
     * Sets the resourceId property value. ID of the resource that the user signed into.  Supports $filter (eq).
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.resourceId = value;
    }
    /**
     * Sets the riskDetail property value. Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far.  Supports $filter (eq).Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the value hidden.
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetail value) {
        this.riskDetail = value;
    }
    /**
     * Sets the riskEventTypes property value. Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, and unknownFutureValue.  Supports $filter (eq).
     * @param value Value to set for the riskEventTypes property.
     */
    public void setRiskEventTypes(@jakarta.annotation.Nullable final java.util.List<RiskEventType> value) {
        this.riskEventTypes = value;
    }
    /**
     * Sets the riskEventTypes_v2 property value. The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue.  Supports $filter (eq, startsWith).
     * @param value Value to set for the riskEventTypes_v2 property.
     */
    public void setRiskEventTypesV2(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.riskEventTypesV2 = value;
    }
    /**
     * Sets the riskLevelAggregated property value. Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Azure AD Identity Protection.  Supports $filter (eq).  Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskLevelAggregated property.
     */
    public void setRiskLevelAggregated(@jakarta.annotation.Nullable final RiskLevel value) {
        this.riskLevelAggregated = value;
    }
    /**
     * Sets the riskLevelDuringSignIn property value. Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Azure AD Identity Protection.  Supports $filter (eq).  Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskLevelDuringSignIn property.
     */
    public void setRiskLevelDuringSignIn(@jakarta.annotation.Nullable final RiskLevel value) {
        this.riskLevelDuringSignIn = value;
    }
    /**
     * Sets the riskState property value. Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.  Supports $filter (eq).
     * @param value Value to set for the riskState property.
     */
    public void setRiskState(@jakarta.annotation.Nullable final RiskState value) {
        this.riskState = value;
    }
    /**
     * Sets the status property value. Sign-in status. Includes the error code and description of the error (if there's a sign-in failure).  Supports $filter (eq) on errorCode property.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SignInStatus value) {
        this.status = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user that initiated the sign-in.  Supports $filter (eq, startsWith).
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. ID of the user that initiated the sign-in.  Supports $filter (eq).
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name of the user that initiated the sign-in.  Supports $filter (eq, startsWith).
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
