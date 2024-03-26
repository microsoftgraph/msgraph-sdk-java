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
public class Incident extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Incident} and sets the default values.
     */
    public Incident() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Incident}
     */
    @jakarta.annotation.Nonnull
    public static Incident createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Incident();
    }
    /**
     * Gets the alerts property value. The list of related alerts. Supports $expand.
     * @return a {@link java.util.List<Alert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.backingStore.get("alerts");
    }
    /**
     * Gets the assignedTo property value. Owner of the incident, or null if no owner is assigned. Free editable text.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the classification property value. The specification for the incident. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue.
     * @return a {@link AlertClassification}
     */
    @jakarta.annotation.Nullable
    public AlertClassification getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * Gets the comments property value. Array of comments created by the Security Operations (SecOps) team when the incident is managed.
     * @return a {@link java.util.List<AlertComment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertComment> getComments() {
        return this.backingStore.get("comments");
    }
    /**
     * Gets the createdDateTime property value. Time when the incident was first created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customTags property value. Array of custom tags associated with an incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCustomTags() {
        return this.backingStore.get("customTags");
    }
    /**
     * Gets the description property value. Description of the incident.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the determination property value. Specifies the determination of the incident. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @return a {@link AlertDetermination}
     */
    @jakarta.annotation.Nullable
    public AlertDetermination getDetermination() {
        return this.backingStore.get("determination");
    }
    /**
     * Gets the displayName property value. The incident name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(AlertClassification::forValue)); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfObjectValues(AlertComment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customTags", (n) -> { this.setCustomTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("determination", (n) -> { this.setDetermination(n.getEnumValue(AlertDetermination::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("incidentWebUrl", (n) -> { this.setIncidentWebUrl(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("redirectIncidentId", (n) -> { this.setRedirectIncidentId(n.getStringValue()); });
        deserializerMap.put("resolvingComment", (n) -> { this.setResolvingComment(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IncidentStatus::forValue)); });
        deserializerMap.put("systemTags", (n) -> { this.setSystemTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incidentWebUrl property value. The URL for the incident page in the Microsoft 365 Defender portal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncidentWebUrl() {
        return this.backingStore.get("incidentWebUrl");
    }
    /**
     * Gets the lastModifiedBy property value. The identity that last modified the incident.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastUpdateDateTime property value. Time when the incident was last updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.backingStore.get("lastUpdateDateTime");
    }
    /**
     * Gets the redirectIncidentId property value. Only populated in case an incident is grouped with another incident, as part of the logic that processes incidents. In such a case, the status property is redirected.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRedirectIncidentId() {
        return this.backingStore.get("redirectIncidentId");
    }
    /**
     * Gets the resolvingComment property value. The resolvingComment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResolvingComment() {
        return this.backingStore.get("resolvingComment");
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
     * @return a {@link IncidentStatus}
     */
    @jakarta.annotation.Nullable
    public IncidentStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the systemTags property value. The system tags associated with the incident.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSystemTags() {
        return this.backingStore.get("systemTags");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant in which the alert was created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeCollectionOfObjectValues("comments", this.getComments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfPrimitiveValues("customTags", this.getCustomTags());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("determination", this.getDetermination());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("incidentWebUrl", this.getIncidentWebUrl());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeStringValue("redirectIncidentId", this.getRedirectIncidentId());
        writer.writeStringValue("resolvingComment", this.getResolvingComment());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfPrimitiveValues("systemTags", this.getSystemTags());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the alerts property value. The list of related alerts. Supports $expand.
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.backingStore.set("alerts", value);
    }
    /**
     * Sets the assignedTo property value. Owner of the incident, or null if no owner is assigned. Free editable text.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the classification property value. The specification for the incident. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue.
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final AlertClassification value) {
        this.backingStore.set("classification", value);
    }
    /**
     * Sets the comments property value. Array of comments created by the Security Operations (SecOps) team when the incident is managed.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final java.util.List<AlertComment> value) {
        this.backingStore.set("comments", value);
    }
    /**
     * Sets the createdDateTime property value. Time when the incident was first created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customTags property value. Array of custom tags associated with an incident.
     * @param value Value to set for the customTags property.
     */
    public void setCustomTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("customTags", value);
    }
    /**
     * Sets the description property value. Description of the incident.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the determination property value. Specifies the determination of the incident. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @param value Value to set for the determination property.
     */
    public void setDetermination(@jakarta.annotation.Nullable final AlertDetermination value) {
        this.backingStore.set("determination", value);
    }
    /**
     * Sets the displayName property value. The incident name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the incidentWebUrl property value. The URL for the incident page in the Microsoft 365 Defender portal.
     * @param value Value to set for the incidentWebUrl property.
     */
    public void setIncidentWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("incidentWebUrl", value);
    }
    /**
     * Sets the lastModifiedBy property value. The identity that last modified the incident.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. Time when the incident was last updated.
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdateDateTime", value);
    }
    /**
     * Sets the redirectIncidentId property value. Only populated in case an incident is grouped with another incident, as part of the logic that processes incidents. In such a case, the status property is redirected.
     * @param value Value to set for the redirectIncidentId property.
     */
    public void setRedirectIncidentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("redirectIncidentId", value);
    }
    /**
     * Sets the resolvingComment property value. The resolvingComment property
     * @param value Value to set for the resolvingComment property.
     */
    public void setResolvingComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resolvingComment", value);
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
    public void setStatus(@jakarta.annotation.Nullable final IncidentStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the systemTags property value. The system tags associated with the incident.
     * @param value Value to set for the systemTags property.
     */
    public void setSystemTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("systemTags", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant in which the alert was created.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
