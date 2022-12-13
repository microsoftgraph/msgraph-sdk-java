package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the admin singleton.
 */
public class Incident extends Entity implements Parsable {
    /** The alerts property */
    private java.util.List<Alert> _alerts;
    /** The assignedTo property */
    private String _assignedTo;
    /** The classification property */
    private AlertClassification _classification;
    /** The comments property */
    private java.util.List<AlertComment> _comments;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The customTags property */
    private java.util.List<String> _customTags;
    /** The determination property */
    private AlertDetermination _determination;
    /** The displayName property */
    private String _displayName;
    /** The incidentWebUrl property */
    private String _incidentWebUrl;
    /** The lastUpdateDateTime property */
    private OffsetDateTime _lastUpdateDateTime;
    /** The redirectIncidentId property */
    private String _redirectIncidentId;
    /** The severity property */
    private AlertSeverity _severity;
    /** The status property */
    private IncidentStatus _status;
    /** The tenantId property */
    private String _tenantId;
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
     * Gets the alerts property value. The alerts property
     * @return a alert
     */
    @javax.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this._alerts;
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedTo() {
        return this._assignedTo;
    }
    /**
     * Gets the classification property value. The classification property
     * @return a alertClassification
     */
    @javax.annotation.Nullable
    public AlertClassification getClassification() {
        return this._classification;
    }
    /**
     * Gets the comments property value. The comments property
     * @return a alertComment
     */
    @javax.annotation.Nullable
    public java.util.List<AlertComment> getComments() {
        return this._comments;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the customTags property value. The customTags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCustomTags() {
        return this._customTags;
    }
    /**
     * Gets the determination property value. The determination property
     * @return a alertDetermination
     */
    @javax.annotation.Nullable
    public AlertDetermination getDetermination() {
        return this._determination;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * Gets the incidentWebUrl property value. The incidentWebUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIncidentWebUrl() {
        return this._incidentWebUrl;
    }
    /**
     * Gets the lastUpdateDateTime property value. The lastUpdateDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this._lastUpdateDateTime;
    }
    /**
     * Gets the redirectIncidentId property value. The redirectIncidentId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectIncidentId() {
        return this._redirectIncidentId;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a alertSeverity
     */
    @javax.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this._severity;
    }
    /**
     * Gets the status property value. The status property
     * @return a incidentStatus
     */
    @javax.annotation.Nullable
    public IncidentStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
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
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlerts(@javax.annotation.Nullable final java.util.List<Alert> value) {
        this._alerts = value;
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedTo(@javax.annotation.Nullable final String value) {
        this._assignedTo = value;
    }
    /**
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassification(@javax.annotation.Nullable final AlertClassification value) {
        this._classification = value;
    }
    /**
     * Sets the comments property value. The comments property
     * @param value Value to set for the comments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComments(@javax.annotation.Nullable final java.util.List<AlertComment> value) {
        this._comments = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the customTags property value. The customTags property
     * @param value Value to set for the customTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._customTags = value;
    }
    /**
     * Sets the determination property value. The determination property
     * @param value Value to set for the determination property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetermination(@javax.annotation.Nullable final AlertDetermination value) {
        this._determination = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the incidentWebUrl property value. The incidentWebUrl property
     * @param value Value to set for the incidentWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidentWebUrl(@javax.annotation.Nullable final String value) {
        this._incidentWebUrl = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. The lastUpdateDateTime property
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdateDateTime = value;
    }
    /**
     * Sets the redirectIncidentId property value. The redirectIncidentId property
     * @param value Value to set for the redirectIncidentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectIncidentId(@javax.annotation.Nullable final String value) {
        this._redirectIncidentId = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final AlertSeverity value) {
        this._severity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final IncidentStatus value) {
        this._status = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
