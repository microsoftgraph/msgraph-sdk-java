package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Incident extends Entity implements Parsable {
    /** The list of related alerts. Supports $expand. */
    private java.util.List<Alert> alerts;
    /** Owner of the incident, or null if no owner is assigned. Free editable text. */
    private String assignedTo;
    /** The specification for the incident. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue. */
    private AlertClassification classification;
    /** Array of comments created by the Security Operations (SecOps) team when the incident is managed. */
    private java.util.List<AlertComment> comments;
    /** Time when the incident was first created. */
    private OffsetDateTime createdDateTime;
    /** Array of custom tags associated with an incident. */
    private java.util.List<String> customTags;
    /** Specifies the determination of the incident. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue. */
    private AlertDetermination determination;
    /** The incident name. */
    private String displayName;
    /** The URL for the incident page in the Microsoft 365 Defender portal. */
    private String incidentWebUrl;
    /** Time when the incident was last updated. */
    private OffsetDateTime lastUpdateDateTime;
    /** Only populated in case an incident is grouped together with another incident, as part of the logic that processes incidents. In such a case, the status property is redirected. */
    private String redirectIncidentId;
    /** The severity property */
    private AlertSeverity severity;
    /** The status property */
    private IncidentStatus status;
    /** The Azure Active Directory tenant in which the alert was created. */
    private String tenantId;
    /**
     * Instantiates a new incident and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Incident() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a incident
     */
    @javax.annotation.Nonnull
    public static Incident createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Incident();
    }
    /**
     * Gets the alerts property value. The list of related alerts. Supports $expand.
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.alerts;
    }
    /**
     * Gets the assignedTo property value. Owner of the incident, or null if no owner is assigned. Free editable text.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this.assignedTo;
    }
    /**
     * Gets the classification property value. The specification for the incident. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue.
     * @return a alertClassification
     */
    @javax.annotation.Nullable
    public AlertClassification getClassification() {
        return this.classification;
    }
    /**
     * Gets the comments property value. Array of comments created by the Security Operations (SecOps) team when the incident is managed.
     * @return a alertComment
     */
    @javax.annotation.Nullable
    public java.util.List<AlertComment> getComments() {
        return this.comments;
    }
    /**
     * Gets the createdDateTime property value. Time when the incident was first created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the customTags property value. Array of custom tags associated with an incident.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCustomTags() {
        return this.customTags;
    }
    /**
     * Gets the determination property value. Specifies the determination of the incident. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @return a alertDetermination
     */
    @javax.annotation.Nullable
    public AlertDetermination getDetermination() {
        return this.determination;
    }
    /**
     * Gets the displayName property value. The incident name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getStringValue()); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(AlertClassification.class)); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfObjectValues(AlertComment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customTags", (n) -> { this.setCustomTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("determination", (n) -> { this.setDetermination(n.getEnumValue(AlertDetermination.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("incidentWebUrl", (n) -> { this.setIncidentWebUrl(n.getStringValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("redirectIncidentId", (n) -> { this.setRedirectIncidentId(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IncidentStatus.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incidentWebUrl property value. The URL for the incident page in the Microsoft 365 Defender portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIncidentWebUrl() {
        return this.incidentWebUrl;
    }
    /**
     * Gets the lastUpdateDateTime property value. Time when the incident was last updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }
    /**
     * Gets the redirectIncidentId property value. Only populated in case an incident is grouped together with another incident, as part of the logic that processes incidents. In such a case, the status property is redirected.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectIncidentId() {
        return this.redirectIncidentId;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a alertSeverity
     */
    @javax.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the status property value. The status property
     * @return a incidentStatus
     */
    @javax.annotation.Nullable
    public IncidentStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant in which the alert was created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
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
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeStringValue("assignedTo", this.getAssignedTo());
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeCollectionOfObjectValues("comments", this.getComments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfPrimitiveValues("customTags", this.getCustomTags());
        writer.writeEnumValue("determination", this.getDetermination());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("incidentWebUrl", this.getIncidentWebUrl());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeStringValue("redirectIncidentId", this.getRedirectIncidentId());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the alerts property value. The list of related alerts. Supports $expand.
     * @param value Value to set for the alerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlerts(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this.alerts = value;
    }
    /**
     * Sets the assignedTo property value. Owner of the incident, or null if no owner is assigned. Free editable text.
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this.assignedTo = value;
    }
    /**
     * Sets the classification property value. The specification for the incident. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue.
     * @param value Value to set for the classification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassification(@javax.annotation.Nullable final AlertClassification value) {
        this.classification = value;
    }
    /**
     * Sets the comments property value. Array of comments created by the Security Operations (SecOps) team when the incident is managed.
     * @param value Value to set for the comments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComments(@javax.annotation.Nullable final java.util.List<AlertComment> value) {
        this.comments = value;
    }
    /**
     * Sets the createdDateTime property value. Time when the incident was first created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customTags property value. Array of custom tags associated with an incident.
     * @param value Value to set for the customTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this.customTags = value;
    }
    /**
     * Sets the determination property value. Specifies the determination of the incident. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     * @param value Value to set for the determination property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetermination(@javax.annotation.Nullable final AlertDetermination value) {
        this.determination = value;
    }
    /**
     * Sets the displayName property value. The incident name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the incidentWebUrl property value. The URL for the incident page in the Microsoft 365 Defender portal.
     * @param value Value to set for the incidentWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidentWebUrl(@javax.annotation.Nullable final String value) {
        this.incidentWebUrl = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. Time when the incident was last updated.
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdateDateTime = value;
    }
    /**
     * Sets the redirectIncidentId property value. Only populated in case an incident is grouped together with another incident, as part of the logic that processes incidents. In such a case, the status property is redirected.
     * @param value Value to set for the redirectIncidentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectIncidentId(@javax.annotation.Nullable final String value) {
        this.redirectIncidentId = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final AlertSeverity value) {
        this.severity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final IncidentStatus value) {
        this.status = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant in which the alert was created.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
