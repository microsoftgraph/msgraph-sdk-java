package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndUserNotification extends Entity implements Parsable {
    /**
     * Identity of the user who created the notification.
     */
    private EmailIdentity createdBy;
    /**
     * Date and time when the notification was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description of the notification as defined by the user.
     */
    private String description;
    /**
     * The details property
     */
    private java.util.List<EndUserNotificationDetail> details;
    /**
     * Name of the notification as defined by the user.
     */
    private String displayName;
    /**
     * Identity of the user who last modified the notification.
     */
    private EmailIdentity lastModifiedBy;
    /**
     * Date and time when the notification was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Type of notification. Possible values are: unknown, positiveReinforcement, noTraining, trainingAssignment, trainingReminder, unknownFutureValue.
     */
    private EndUserNotificationType notificationType;
    /**
     * The source of the content. Possible values are: unknown, global, tenant, unknownFutureValue.
     */
    private SimulationContentSource source;
    /**
     * The status of the notification. Possible values are: unknown, draft, ready, archive, delete, unknownFutureValue.
     */
    private SimulationContentStatus status;
    /**
     * Supported locales for endUserNotification content.
     */
    private java.util.List<String> supportedLocales;
    /**
     * Instantiates a new EndUserNotification and sets the default values.
     */
    public EndUserNotification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EndUserNotification
     */
    @jakarta.annotation.Nonnull
    public static EndUserNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndUserNotification();
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the notification.
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time when the notification was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description of the notification as defined by the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the details property value. The details property
     * @return a java.util.List<EndUserNotificationDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EndUserNotificationDetail> getDetails() {
        return this.details;
    }
    /**
     * Gets the displayName property value. Name of the notification as defined by the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(EndUserNotificationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notificationType", (n) -> { this.setNotificationType(n.getEnumValue(EndUserNotificationType.class)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SimulationContentSource.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationContentStatus.class)); });
        deserializerMap.put("supportedLocales", (n) -> { this.setSupportedLocales(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the notification.
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the notification was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the notificationType property value. Type of notification. Possible values are: unknown, positiveReinforcement, noTraining, trainingAssignment, trainingReminder, unknownFutureValue.
     * @return a EndUserNotificationType
     */
    @jakarta.annotation.Nullable
    public EndUserNotificationType getNotificationType() {
        return this.notificationType;
    }
    /**
     * Gets the source property value. The source of the content. Possible values are: unknown, global, tenant, unknownFutureValue.
     * @return a SimulationContentSource
     */
    @jakarta.annotation.Nullable
    public SimulationContentSource getSource() {
        return this.source;
    }
    /**
     * Gets the status property value. The status of the notification. Possible values are: unknown, draft, ready, archive, delete, unknownFutureValue.
     * @return a SimulationContentStatus
     */
    @jakarta.annotation.Nullable
    public SimulationContentStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the supportedLocales property value. Supported locales for endUserNotification content.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedLocales() {
        return this.supportedLocales;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("notificationType", this.getNotificationType());
        writer.writeEnumValue("source", this.getSource());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfPrimitiveValues("supportedLocales", this.getSupportedLocales());
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the notification.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time when the notification was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the notification as defined by the user.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<EndUserNotificationDetail> value) {
        this.details = value;
    }
    /**
     * Sets the displayName property value. Name of the notification as defined by the user.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the notification.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the notification was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the notificationType property value. Type of notification. Possible values are: unknown, positiveReinforcement, noTraining, trainingAssignment, trainingReminder, unknownFutureValue.
     * @param value Value to set for the notificationType property.
     */
    public void setNotificationType(@jakarta.annotation.Nullable final EndUserNotificationType value) {
        this.notificationType = value;
    }
    /**
     * Sets the source property value. The source of the content. Possible values are: unknown, global, tenant, unknownFutureValue.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SimulationContentSource value) {
        this.source = value;
    }
    /**
     * Sets the status property value. The status of the notification. Possible values are: unknown, draft, ready, archive, delete, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationContentStatus value) {
        this.status = value;
    }
    /**
     * Sets the supportedLocales property value. Supported locales for endUserNotification content.
     * @param value Value to set for the supportedLocales property.
     */
    public void setSupportedLocales(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportedLocales = value;
    }
}
