package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Alert extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Alert} and sets the default values.
     */
    public Alert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Alert}
     */
    @jakarta.annotation.Nonnull
    public static Alert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Alert();
    }
    /**
     * Gets the actorDisplayName property value. The adversary or activity group that is associated with this alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorDisplayName() {
        return this.backingStore.get("actorDisplayName");
    }
    /**
     * Gets the additionalData property value. A collection of other alert properties, including user-defined properties. Any custom details defined in the alert, and any dynamic content in the alert details, are stored here.
     * @return a {@link Dictionary}
     */
    @jakarta.annotation.Nullable
    public Dictionary getAdditionalDataProperty() {
        return this.backingStore.get("additionalDataProperty");
    }
    /**
     * Gets the alertPolicyId property value. The ID of the policy that generated the alert, and populated when there is a specific policy that generated the alert, whether configured by a customer or a built-in policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlertPolicyId() {
        return this.backingStore.get("alertPolicyId");
    }
    /**
     * Gets the alertWebUrl property value. URL for the Microsoft 365 Defender portal alert page.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlertWebUrl() {
        return this.backingStore.get("alertWebUrl");
    }
    /**
     * Gets the assignedTo property value. Owner of the alert, or null if no owner is assigned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the category property value. The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&amp;CK framework.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the classification property value. Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue.
     * @return a {@link AlertClassification}
     */
    @jakarta.annotation.Nullable
    public AlertClassification getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * Gets the comments property value. Array of comments created by the Security Operations (SecOps) team during the alert management process.
     * @return a {@link java.util.List<AlertComment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertComment> getComments() {
        return this.backingStore.get("comments");
    }
    /**
     * Gets the createdDateTime property value. Time when Microsoft 365 Defender created the alert.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. String value describing each alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the detectionSource property value. Detection technology or sensor that identified the notable component or activity. Possible values are: unknown, microsoftDefenderForEndpoint, antivirus, smartScreen, customTi, microsoftDefenderForOffice365, automatedInvestigation, microsoftThreatExperts, customDetection, microsoftDefenderForIdentity, cloudAppSecurity, microsoft365Defender, azureAdIdentityProtection, manual, microsoftDataLossPrevention, appGovernancePolicy, appGovernanceDetection, unknownFutureValue, microsoftDefenderForCloud, microsoftDefenderForIoT, microsoftDefenderForServers, microsoftDefenderForStorage, microsoftDefenderForDNS, microsoftDefenderForDatabases, microsoftDefenderForContainers, microsoftDefenderForNetwork, microsoftDefenderForAppService, microsoftDefenderForKeyVault, microsoftDefenderForResourceManager, microsoftDefenderForApiManagement, microsoftSentinel, nrtAlerts, scheduledAlerts, microsoftDefenderThreatIntelligenceAnalytics, builtInMl. Use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud, microsoftDefenderForIoT, microsoftDefenderForServers, microsoftDefenderForStorage, microsoftDefenderForDNS, microsoftDefenderForDatabases, microsoftDefenderForContainers, microsoftDefenderForNetwork, microsoftDefenderForAppService, microsoftDefenderForKeyVault, microsoftDefenderForResourceManager, microsoftDefenderForApiManagement, microsoftSentinel, nrtAlerts, scheduledAlerts, microsoftDefenderThreatIntelligenceAnalytics, builtInMl.
     * @return a {@link DetectionSource}
     */
    @jakarta.annotation.Nullable
    public DetectionSource getDetectionSource() {
        return this.backingStore.get("detectionSource");
    }
    /**
     * Gets the detectorId property value. The ID of the detector that triggered the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetectorId() {
        return this.backingStore.get("detectorId");
    }
    /**
     * Gets the determination property value. Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedAccount, phishing, maliciousUserActivity, notMalicious, notEnoughDataToValidate, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @return a {@link AlertDetermination}
     */
    @jakarta.annotation.Nullable
    public AlertDetermination getDetermination() {
        return this.backingStore.get("determination");
    }
    /**
     * Gets the evidence property value. Collection of evidence related to the alert.
     * @return a {@link java.util.List<AlertEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertEvidence> getEvidence() {
        return this.backingStore.get("evidence");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actorDisplayName", (n) -> { this.setActorDisplayName(n.getStringValue()); });
        deserializerMap.put("additionalData", (n) -> { this.setAdditionalDataProperty(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("alertPolicyId", (n) -> { this.setAlertPolicyId(n.getStringValue()); });
        deserializerMap.put("alertWebUrl", (n) -> { this.setAlertWebUrl(n.getStringValue()); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(AlertClassification::forValue)); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfObjectValues(AlertComment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionSource", (n) -> { this.setDetectionSource(n.getEnumValue(DetectionSource::forValue)); });
        deserializerMap.put("detectorId", (n) -> { this.setDetectorId(n.getStringValue()); });
        deserializerMap.put("determination", (n) -> { this.setDetermination(n.getEnumValue(AlertDetermination::forValue)); });
        deserializerMap.put("evidence", (n) -> { this.setEvidence(n.getCollectionOfObjectValues(AlertEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("firstActivityDateTime", (n) -> { this.setFirstActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("incidentId", (n) -> { this.setIncidentId(n.getStringValue()); });
        deserializerMap.put("incidentWebUrl", (n) -> { this.setIncidentWebUrl(n.getStringValue()); });
        deserializerMap.put("lastActivityDateTime", (n) -> { this.setLastActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mitreTechniques", (n) -> { this.setMitreTechniques(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("providerAlertId", (n) -> { this.setProviderAlertId(n.getStringValue()); });
        deserializerMap.put("recommendedActions", (n) -> { this.setRecommendedActions(n.getStringValue()); });
        deserializerMap.put("resolvedDateTime", (n) -> { this.setResolvedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serviceSource", (n) -> { this.setServiceSource(n.getEnumValue(ServiceSource::forValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AlertStatus::forValue)); });
        deserializerMap.put("systemTags", (n) -> { this.setSystemTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("threatDisplayName", (n) -> { this.setThreatDisplayName(n.getStringValue()); });
        deserializerMap.put("threatFamilyName", (n) -> { this.setThreatFamilyName(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstActivityDateTime property value. The earliest activity associated with the alert.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstActivityDateTime() {
        return this.backingStore.get("firstActivityDateTime");
    }
    /**
     * Gets the incidentId property value. Unique identifier to represent the incident this alert resource is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncidentId() {
        return this.backingStore.get("incidentId");
    }
    /**
     * Gets the incidentWebUrl property value. URL for the incident page in the Microsoft 365 Defender portal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncidentWebUrl() {
        return this.backingStore.get("incidentWebUrl");
    }
    /**
     * Gets the lastActivityDateTime property value. The oldest activity associated with the alert.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActivityDateTime() {
        return this.backingStore.get("lastActivityDateTime");
    }
    /**
     * Gets the lastUpdateDateTime property value. Time when the alert was last updated at Microsoft 365 Defender.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.backingStore.get("lastUpdateDateTime");
    }
    /**
     * Gets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&amp;CK framework.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMitreTechniques() {
        return this.backingStore.get("mitreTechniques");
    }
    /**
     * Gets the productName property value. The name of the product which published this alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.backingStore.get("productName");
    }
    /**
     * Gets the providerAlertId property value. The ID of the alert as it appears in the security provider product that generated the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderAlertId() {
        return this.backingStore.get("providerAlertId");
    }
    /**
     * Gets the recommendedActions property value. Recommended response and remediation actions to take in the event this alert was generated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecommendedActions() {
        return this.backingStore.get("recommendedActions");
    }
    /**
     * Gets the resolvedDateTime property value. Time when the alert was resolved.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResolvedDateTime() {
        return this.backingStore.get("resolvedDateTime");
    }
    /**
     * Gets the serviceSource property value. The serviceSource property
     * @return a {@link ServiceSource}
     */
    @jakarta.annotation.Nullable
    public ServiceSource getServiceSource() {
        return this.backingStore.get("serviceSource");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link AlertSeverity}
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link AlertStatus}
     */
    @jakarta.annotation.Nullable
    public AlertStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the systemTags property value. The system tags associated with the alert.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSystemTags() {
        return this.backingStore.get("systemTags");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant the alert was created in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the threatDisplayName property value. The threat associated with this alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreatDisplayName() {
        return this.backingStore.get("threatDisplayName");
    }
    /**
     * Gets the threatFamilyName property value. Threat family associated with this alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreatFamilyName() {
        return this.backingStore.get("threatFamilyName");
    }
    /**
     * Gets the title property value. Brief identifying string value describing the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actorDisplayName", this.getActorDisplayName());
        writer.writeObjectValue("additionalData", this.getAdditionalDataProperty());
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
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("providerAlertId", this.getProviderAlertId());
        writer.writeStringValue("recommendedActions", this.getRecommendedActions());
        writer.writeOffsetDateTimeValue("resolvedDateTime", this.getResolvedDateTime());
        writer.writeEnumValue("serviceSource", this.getServiceSource());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfPrimitiveValues("systemTags", this.getSystemTags());
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
        this.backingStore.set("actorDisplayName", value);
    }
    /**
     * Sets the additionalData property value. A collection of other alert properties, including user-defined properties. Any custom details defined in the alert, and any dynamic content in the alert details, are stored here.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalDataProperty(@jakarta.annotation.Nullable final Dictionary value) {
        this.backingStore.set("additionalDataProperty", value);
    }
    /**
     * Sets the alertPolicyId property value. The ID of the policy that generated the alert, and populated when there is a specific policy that generated the alert, whether configured by a customer or a built-in policy.
     * @param value Value to set for the alertPolicyId property.
     */
    public void setAlertPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertPolicyId", value);
    }
    /**
     * Sets the alertWebUrl property value. URL for the Microsoft 365 Defender portal alert page.
     * @param value Value to set for the alertWebUrl property.
     */
    public void setAlertWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertWebUrl", value);
    }
    /**
     * Sets the assignedTo property value. Owner of the alert, or null if no owner is assigned.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the category property value. The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&amp;CK framework.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the classification property value. Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue.
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final AlertClassification value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the comments property value. Array of comments created by the Security Operations (SecOps) team during the alert management process.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final java.util.List<AlertComment> value) {
        this.backingStore.set("comments", value);
    }
    /**
     * Sets the createdDateTime property value. Time when Microsoft 365 Defender created the alert.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. String value describing each alert.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the detectionSource property value. Detection technology or sensor that identified the notable component or activity. Possible values are: unknown, microsoftDefenderForEndpoint, antivirus, smartScreen, customTi, microsoftDefenderForOffice365, automatedInvestigation, microsoftThreatExperts, customDetection, microsoftDefenderForIdentity, cloudAppSecurity, microsoft365Defender, azureAdIdentityProtection, manual, microsoftDataLossPrevention, appGovernancePolicy, appGovernanceDetection, unknownFutureValue, microsoftDefenderForCloud, microsoftDefenderForIoT, microsoftDefenderForServers, microsoftDefenderForStorage, microsoftDefenderForDNS, microsoftDefenderForDatabases, microsoftDefenderForContainers, microsoftDefenderForNetwork, microsoftDefenderForAppService, microsoftDefenderForKeyVault, microsoftDefenderForResourceManager, microsoftDefenderForApiManagement, microsoftSentinel, nrtAlerts, scheduledAlerts, microsoftDefenderThreatIntelligenceAnalytics, builtInMl. Use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud, microsoftDefenderForIoT, microsoftDefenderForServers, microsoftDefenderForStorage, microsoftDefenderForDNS, microsoftDefenderForDatabases, microsoftDefenderForContainers, microsoftDefenderForNetwork, microsoftDefenderForAppService, microsoftDefenderForKeyVault, microsoftDefenderForResourceManager, microsoftDefenderForApiManagement, microsoftSentinel, nrtAlerts, scheduledAlerts, microsoftDefenderThreatIntelligenceAnalytics, builtInMl.
     * @param value Value to set for the detectionSource property.
     */
    public void setDetectionSource(@jakarta.annotation.Nullable final DetectionSource value) {
        this.backingStore.set("detectionSource", value);
    }
    /**
     * Sets the detectorId property value. The ID of the detector that triggered the alert.
     * @param value Value to set for the detectorId property.
     */
    public void setDetectorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detectorId", value);
    }
    /**
     * Sets the determination property value. Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedAccount, phishing, maliciousUserActivity, notMalicious, notEnoughDataToValidate, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @param value Value to set for the determination property.
     */
    public void setDetermination(@jakarta.annotation.Nullable final AlertDetermination value) {
        this.backingStore.set("determination", value);
    }
    /**
     * Sets the evidence property value. Collection of evidence related to the alert.
     * @param value Value to set for the evidence property.
     */
    public void setEvidence(@jakarta.annotation.Nullable final java.util.List<AlertEvidence> value) {
        this.backingStore.set("evidence", value);
    }
    /**
     * Sets the firstActivityDateTime property value. The earliest activity associated with the alert.
     * @param value Value to set for the firstActivityDateTime property.
     */
    public void setFirstActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstActivityDateTime", value);
    }
    /**
     * Sets the incidentId property value. Unique identifier to represent the incident this alert resource is associated with.
     * @param value Value to set for the incidentId property.
     */
    public void setIncidentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("incidentId", value);
    }
    /**
     * Sets the incidentWebUrl property value. URL for the incident page in the Microsoft 365 Defender portal.
     * @param value Value to set for the incidentWebUrl property.
     */
    public void setIncidentWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("incidentWebUrl", value);
    }
    /**
     * Sets the lastActivityDateTime property value. The oldest activity associated with the alert.
     * @param value Value to set for the lastActivityDateTime property.
     */
    public void setLastActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActivityDateTime", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. Time when the alert was last updated at Microsoft 365 Defender.
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdateDateTime", value);
    }
    /**
     * Sets the mitreTechniques property value. The attack techniques, as aligned with the MITRE ATT&amp;CK framework.
     * @param value Value to set for the mitreTechniques property.
     */
    public void setMitreTechniques(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mitreTechniques", value);
    }
    /**
     * Sets the productName property value. The name of the product which published this alert.
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productName", value);
    }
    /**
     * Sets the providerAlertId property value. The ID of the alert as it appears in the security provider product that generated the alert.
     * @param value Value to set for the providerAlertId property.
     */
    public void setProviderAlertId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerAlertId", value);
    }
    /**
     * Sets the recommendedActions property value. Recommended response and remediation actions to take in the event this alert was generated.
     * @param value Value to set for the recommendedActions property.
     */
    public void setRecommendedActions(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendedActions", value);
    }
    /**
     * Sets the resolvedDateTime property value. Time when the alert was resolved.
     * @param value Value to set for the resolvedDateTime property.
     */
    public void setResolvedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("resolvedDateTime", value);
    }
    /**
     * Sets the serviceSource property value. The serviceSource property
     * @param value Value to set for the serviceSource property.
     */
    public void setServiceSource(@jakarta.annotation.Nullable final ServiceSource value) {
        this.backingStore.set("serviceSource", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AlertStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the systemTags property value. The system tags associated with the alert.
     * @param value Value to set for the systemTags property.
     */
    public void setSystemTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("systemTags", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant the alert was created in.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the threatDisplayName property value. The threat associated with this alert.
     * @param value Value to set for the threatDisplayName property.
     */
    public void setThreatDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threatDisplayName", value);
    }
    /**
     * Sets the threatFamilyName property value. Threat family associated with this alert.
     * @param value Value to set for the threatFamilyName property.
     */
    public void setThreatFamilyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threatFamilyName", value);
    }
    /**
     * Sets the title property value. Brief identifying string value describing the alert.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
