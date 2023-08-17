package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Alert extends Entity implements Parsable {
    /**
     * The adversary or activity group that is associated with this alert.
     */
    private String actorDisplayName;
    /**
     * The alertPolicyId property
     */
    private String alertPolicyId;
    /**
     * URL for the alert page in the Microsoft 365 Defender portal.
     */
    private String alertWebUrl;
    /**
     * Owner of the alert, or null if no owner is assigned.
     */
    private String assignedTo;
    /**
     * The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&CK framework.
     */
    private String category;
    /**
     * Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, benignPositive, unknownFutureValue.
     */
    private AlertClassification classification;
    /**
     * Array of comments created by the Security Operations (SecOps) team during the alert management process.
     */
    private java.util.List<AlertComment> comments;
    /**
     * Time when Microsoft 365 Defender created the alert.
     */
    private OffsetDateTime createdDateTime;
    /**
     * String value describing each alert.
     */
    private String description;
    /**
     * Detection technology or sensor that identified the notable component or activity. Possible values are: unknown, microsoftDefenderForEndpoint, antivirus, smartScreen, customTi, microsoftDefenderForOffice365, automatedInvestigation, microsoftThreatExperts, customDetection, microsoftDefenderForIdentity, cloudAppSecurity, microsoft365Defender, azureAdIdentityProtection, manual, microsoftDataLossPrevention, appGovernancePolicy, appGovernanceDetection, unknownFutureValue, microsoftDefenderForCloud. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud.
     */
    private DetectionSource detectionSource;
    /**
     * The ID of the detector that triggered the alert.
     */
    private String detectorId;
    /**
     * Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     */
    private AlertDetermination determination;
    /**
     * Collection of evidence related to the alert.
     */
    private java.util.List<AlertEvidence> evidence;
    /**
     * The earliest activity associated with the alert.
     */
    private OffsetDateTime firstActivityDateTime;
    /**
     * Unique identifier to represent the incident this alert resource is associated with.
     */
    private String incidentId;
    /**
     * URL for the incident page in the Microsoft 365 Defender portal.
     */
    private String incidentWebUrl;
    /**
     * The oldest activity associated with the alert.
     */
    private OffsetDateTime lastActivityDateTime;
    /**
     * Time when the alert was last updated at Microsoft 365 Defender.
     */
    private OffsetDateTime lastUpdateDateTime;
    /**
     * The attack techniques, as aligned with the MITRE ATT&CK framework.
     */
    private java.util.List<String> mitreTechniques;
    /**
     * The ID of the alert as it appears in the security provider product that generated the alert.
     */
    private String providerAlertId;
    /**
     * Recommended response and remediation actions to take in the event this alert was generated.
     */
    private String recommendedActions;
    /**
     * Time when the alert was resolved.
     */
    private OffsetDateTime resolvedDateTime;
    /**
     * The serviceSource property
     */
    private ServiceSource serviceSource;
    /**
     * The severity property
     */
    private AlertSeverity severity;
    /**
     * The status property
     */
    private AlertStatus status;
    /**
     * The Azure Active Directory tenant the alert was created in.
     */
    private String tenantId;
    /**
     * The threat associated with this alert.
     */
    private String threatDisplayName;
    /**
     * Threat family associated with this alert.
     */
    private String threatFamilyName;
    /**
     * Brief identifying string value describing the alert.
     */
    private String title;
    /**
     * Instantiates a new alert and sets the default values.
     */
    public Alert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alert
     */
    @jakarta.annotation.Nonnull
    public static Alert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Alert();
    }
    /**
     * Gets the actorDisplayName property value. The adversary or activity group that is associated with this alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActorDisplayName() {
        return this.actorDisplayName;
    }
    /**
     * Gets the alertPolicyId property value. The alertPolicyId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertPolicyId() {
        return this.alertPolicyId;
    }
    /**
     * Gets the alertWebUrl property value. URL for the alert page in the Microsoft 365 Defender portal.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertWebUrl() {
        return this.alertWebUrl;
    }
    /**
     * Gets the assignedTo property value. Owner of the alert, or null if no owner is assigned.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the category property value. The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&CK framework.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the classification property value. Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, benignPositive, unknownFutureValue.
     * @return a alertClassification
     */
    @jakarta.annotation.Nullable
    public AlertClassification getClassification() {
        return this.classification;
    }
    /**
     * Gets the comments property value. Array of comments created by the Security Operations (SecOps) team during the alert management process.
     * @return a alertComment
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertComment> getComments() {
        return this.comments;
    }
    /**
     * Gets the createdDateTime property value. Time when Microsoft 365 Defender created the alert.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. String value describing each alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the detectionSource property value. Detection technology or sensor that identified the notable component or activity. Possible values are: unknown, microsoftDefenderForEndpoint, antivirus, smartScreen, customTi, microsoftDefenderForOffice365, automatedInvestigation, microsoftThreatExperts, customDetection, microsoftDefenderForIdentity, cloudAppSecurity, microsoft365Defender, azureAdIdentityProtection, manual, microsoftDataLossPrevention, appGovernancePolicy, appGovernanceDetection, unknownFutureValue, microsoftDefenderForCloud. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud.
     * @return a detectionSource
     */
    @jakarta.annotation.Nullable
    public DetectionSource getDetectionSource() {
        return this.detectionSource;
    }
    /**
     * Gets the detectorId property value. The ID of the detector that triggered the alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDetectorId() {
        return this.detectorId;
    }
    /**
     * Gets the determination property value. Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @return a alertDetermination
     */
    @jakarta.annotation.Nullable
    public AlertDetermination getDetermination() {
        return this.determination;
    }
    /**
     * Gets the evidence property value. Collection of evidence related to the alert.
     * @return a alertEvidence
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertEvidence> getEvidence() {
        return this.evidence;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actorDisplayName", (n) -> { this.setActorDisplayName(n.getStringValue()); });
        deserializerMap.put("alertPolicyId", (n) -> { this.setAlertPolicyId(n.getStringValue()); });
        deserializerMap.put("alertWebUrl", (n) -> { this.setAlertWebUrl(n.getStringValue()); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(AlertClassification.class)); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfObjectValues(AlertComment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionSource", (n) -> { this.setDetectionSource(n.getEnumValue(DetectionSource.class)); });
        deserializerMap.put("detectorId", (n) -> { this.setDetectorId(n.getStringValue()); });
        deserializerMap.put("determination", (n) -> { this.setDetermination(n.getEnumValue(AlertDetermination.class)); });
        deserializerMap.put("evidence", (n) -> { this.setEvidence(n.getCollectionOfObjectValues(AlertEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("firstActivityDateTime", (n) -> { this.setFirstActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("incidentId", (n) -> { this.setIncidentId(n.getStringValue()); });
        deserializerMap.put("incidentWebUrl", (n) -> { this.setIncidentWebUrl(n.getStringValue()); });
        deserializerMap.put("lastActivityDateTime", (n) -> { this.setLastActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mitreTechniques", (n) -> { this.setMitreTechniques(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("providerAlertId", (n) -> { this.setProviderAlertId(n.getStringValue()); });
        deserializerMap.put("recommendedActions", (n) -> { this.setRecommendedActions(n.getStringValue()); });
        deserializerMap.put("resolvedDateTime", (n) -> { this.setResolvedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serviceSource", (n) -> { this.setServiceSource(n.getEnumValue(ServiceSource.class)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AlertStatus.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("threatDisplayName", (n) -> { this.setThreatDisplayName(n.getStringValue()); });
        deserializerMap.put("threatFamilyName", (n) -> { this.setThreatFamilyName(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstActivityDateTime property value. The earliest activity associated with the alert.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstActivityDateTime() {
        return this.firstActivityDateTime;
    }
    /**
     * Gets the incidentId property value. Unique identifier to represent the incident this alert resource is associated with.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIncidentId() {
        return this.incidentId;
    }
    /**
     * Gets the incidentWebUrl property value. URL for the incident page in the Microsoft 365 Defender portal.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIncidentWebUrl() {
        return this.incidentWebUrl;
    }
    /**
     * Gets the lastActivityDateTime property value. The oldest activity associated with the alert.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActivityDateTime() {
        return this.lastActivityDateTime;
    }
    /**
     * Gets the lastUpdateDateTime property value. Time when the alert was last updated at Microsoft 365 Defender.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }
    /**
     * Gets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&CK framework.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMitreTechniques() {
        return this.mitreTechniques;
    }
    /**
     * Gets the providerAlertId property value. The ID of the alert as it appears in the security provider product that generated the alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProviderAlertId() {
        return this.providerAlertId;
    }
    /**
     * Gets the recommendedActions property value. Recommended response and remediation actions to take in the event this alert was generated.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecommendedActions() {
        return this.recommendedActions;
    }
    /**
     * Gets the resolvedDateTime property value. Time when the alert was resolved.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResolvedDateTime() {
        return this.resolvedDateTime;
    }
    /**
     * Gets the serviceSource property value. The serviceSource property
     * @return a serviceSource
     */
    @jakarta.annotation.Nullable
    public ServiceSource getServiceSource() {
        return this.serviceSource;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a alertSeverity
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the status property value. The status property
     * @return a alertStatus
     */
    @jakarta.annotation.Nullable
    public AlertStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant the alert was created in.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the threatDisplayName property value. The threat associated with this alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThreatDisplayName() {
        return this.threatDisplayName;
    }
    /**
     * Gets the threatFamilyName property value. Threat family associated with this alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThreatFamilyName() {
        return this.threatFamilyName;
    }
    /**
     * Gets the title property value. Brief identifying string value describing the alert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actorDisplayName", this.getActorDisplayName());
        writer.writeStringValue("alertPolicyId", this.getAlertPolicyId());
        writer.writeStringValue("alertWebUrl", this.getAlertWebUrl());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeStringValue("category", this.getCategory());
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeCollectionOfObjectValues("comments", this.getComments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("detectionSource", this.getDetectionSource());
        writer.writeStringValue("detectorId", this.getDetectorId());
        writer.writeEnumValue("determination", this.getDetermination());
        writer.writeCollectionOfObjectValues("evidence", this.getEvidence());
        writer.writeOffsetDateTimeValue("firstActivityDateTime", this.getFirstActivityDateTime());
        writer.writeStringValue("incidentId", this.getIncidentId());
        writer.writeStringValue("incidentWebUrl", this.getIncidentWebUrl());
        writer.writeOffsetDateTimeValue("lastActivityDateTime", this.getLastActivityDateTime());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeCollectionOfPrimitiveValues("mitreTechniques", this.getMitreTechniques());
        writer.writeStringValue("providerAlertId", this.getProviderAlertId());
        writer.writeStringValue("recommendedActions", this.getRecommendedActions());
        writer.writeOffsetDateTimeValue("resolvedDateTime", this.getResolvedDateTime());
        writer.writeEnumValue("serviceSource", this.getServiceSource());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("threatDisplayName", this.getThreatDisplayName());
        writer.writeStringValue("threatFamilyName", this.getThreatFamilyName());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the actorDisplayName property value. The adversary or activity group that is associated with this alert.
     * @param value Value to set for the actorDisplayName property.
     */
    public void setActorDisplayName(@jakarta.annotation.Nullable final String value) {
        this.actorDisplayName = value;
    }
    /**
     * Sets the alertPolicyId property value. The alertPolicyId property
     * @param value Value to set for the alertPolicyId property.
     */
    public void setAlertPolicyId(@jakarta.annotation.Nullable final String value) {
        this.alertPolicyId = value;
    }
    /**
     * Sets the alertWebUrl property value. URL for the alert page in the Microsoft 365 Defender portal.
     * @param value Value to set for the alertWebUrl property.
     */
    public void setAlertWebUrl(@jakarta.annotation.Nullable final String value) {
        this.alertWebUrl = value;
    }
    /**
     * Sets the assignedTo property value. Owner of the alert, or null if no owner is assigned.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.assignedTo = value;
    }
    /**
     * Sets the category property value. The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&CK framework.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the classification property value. Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, benignPositive, unknownFutureValue.
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final AlertClassification value) {
        this.classification = value;
    }
    /**
     * Sets the comments property value. Array of comments created by the Security Operations (SecOps) team during the alert management process.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final java.util.List<AlertComment> value) {
        this.comments = value;
    }
    /**
     * Sets the createdDateTime property value. Time when Microsoft 365 Defender created the alert.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. String value describing each alert.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the detectionSource property value. Detection technology or sensor that identified the notable component or activity. Possible values are: unknown, microsoftDefenderForEndpoint, antivirus, smartScreen, customTi, microsoftDefenderForOffice365, automatedInvestigation, microsoftThreatExperts, customDetection, microsoftDefenderForIdentity, cloudAppSecurity, microsoft365Defender, azureAdIdentityProtection, manual, microsoftDataLossPrevention, appGovernancePolicy, appGovernanceDetection, unknownFutureValue, microsoftDefenderForCloud. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud.
     * @param value Value to set for the detectionSource property.
     */
    public void setDetectionSource(@jakarta.annotation.Nullable final DetectionSource value) {
        this.detectionSource = value;
    }
    /**
     * Sets the detectorId property value. The ID of the detector that triggered the alert.
     * @param value Value to set for the detectorId property.
     */
    public void setDetectorId(@jakarta.annotation.Nullable final String value) {
        this.detectorId = value;
    }
    /**
     * Sets the determination property value. Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @param value Value to set for the determination property.
     */
    public void setDetermination(@jakarta.annotation.Nullable final AlertDetermination value) {
        this.determination = value;
    }
    /**
     * Sets the evidence property value. Collection of evidence related to the alert.
     * @param value Value to set for the evidence property.
     */
    public void setEvidence(@jakarta.annotation.Nullable final java.util.List<AlertEvidence> value) {
        this.evidence = value;
    }
    /**
     * Sets the firstActivityDateTime property value. The earliest activity associated with the alert.
     * @param value Value to set for the firstActivityDateTime property.
     */
    public void setFirstActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstActivityDateTime = value;
    }
    /**
     * Sets the incidentId property value. Unique identifier to represent the incident this alert resource is associated with.
     * @param value Value to set for the incidentId property.
     */
    public void setIncidentId(@jakarta.annotation.Nullable final String value) {
        this.incidentId = value;
    }
    /**
     * Sets the incidentWebUrl property value. URL for the incident page in the Microsoft 365 Defender portal.
     * @param value Value to set for the incidentWebUrl property.
     */
    public void setIncidentWebUrl(@jakarta.annotation.Nullable final String value) {
        this.incidentWebUrl = value;
    }
    /**
     * Sets the lastActivityDateTime property value. The oldest activity associated with the alert.
     * @param value Value to set for the lastActivityDateTime property.
     */
    public void setLastActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActivityDateTime = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. Time when the alert was last updated at Microsoft 365 Defender.
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdateDateTime = value;
    }
    /**
     * Sets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&CK framework.
     * @param value Value to set for the mitreTechniques property.
     */
    public void setMitreTechniques(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.mitreTechniques = value;
    }
    /**
     * Sets the providerAlertId property value. The ID of the alert as it appears in the security provider product that generated the alert.
     * @param value Value to set for the providerAlertId property.
     */
    public void setProviderAlertId(@jakarta.annotation.Nullable final String value) {
        this.providerAlertId = value;
    }
    /**
     * Sets the recommendedActions property value. Recommended response and remediation actions to take in the event this alert was generated.
     * @param value Value to set for the recommendedActions property.
     */
    public void setRecommendedActions(@jakarta.annotation.Nullable final String value) {
        this.recommendedActions = value;
    }
    /**
     * Sets the resolvedDateTime property value. Time when the alert was resolved.
     * @param value Value to set for the resolvedDateTime property.
     */
    public void setResolvedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.resolvedDateTime = value;
    }
    /**
     * Sets the serviceSource property value. The serviceSource property
     * @param value Value to set for the serviceSource property.
     */
    public void setServiceSource(@jakarta.annotation.Nullable final ServiceSource value) {
        this.serviceSource = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.severity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AlertStatus value) {
        this.status = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant the alert was created in.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the threatDisplayName property value. The threat associated with this alert.
     * @param value Value to set for the threatDisplayName property.
     */
    public void setThreatDisplayName(@jakarta.annotation.Nullable final String value) {
        this.threatDisplayName = value;
    }
    /**
     * Sets the threatFamilyName property value. Threat family associated with this alert.
     * @param value Value to set for the threatFamilyName property.
     */
    public void setThreatFamilyName(@jakarta.annotation.Nullable final String value) {
        this.threatFamilyName = value;
    }
    /**
     * Sets the title property value. Brief identifying string value describing the alert.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
