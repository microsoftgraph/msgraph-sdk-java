package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcAuditEvent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcAuditEvent} and sets the default values.
     */
    public CloudPcAuditEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcAuditEvent}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcAuditEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAuditEvent();
    }
    /**
     * Gets the activity property value. The friendly name of the audit activity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the activityDateTime property value. The date time in UTC when the activity was performed.Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.backingStore.get("activityDateTime");
    }
    /**
     * Gets the activityOperationType property value. The activityOperationType property
     * @return a {@link CloudPcAuditActivityOperationType}
     */
    @jakarta.annotation.Nullable
    public CloudPcAuditActivityOperationType getActivityOperationType() {
        return this.backingStore.get("activityOperationType");
    }
    /**
     * Gets the activityResult property value. The activityResult property
     * @return a {@link CloudPcAuditActivityResult}
     */
    @jakarta.annotation.Nullable
    public CloudPcAuditActivityResult getActivityResult() {
        return this.backingStore.get("activityResult");
    }
    /**
     * Gets the activityType property value. The type of activity that was performed.Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivityType() {
        return this.backingStore.get("activityType");
    }
    /**
     * Gets the actor property value. The actor property
     * @return a {@link CloudPcAuditActor}
     */
    @jakarta.annotation.Nullable
    public CloudPcAuditActor getActor() {
        return this.backingStore.get("actor");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link CloudPcAuditCategory}
     */
    @jakarta.annotation.Nullable
    public CloudPcAuditCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the componentName property value. The component name for the audit event. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComponentName() {
        return this.backingStore.get("componentName");
    }
    /**
     * Gets the correlationId property value. The client request ID that is used to correlate activity within the system.Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the displayName property value. The display name for the audit event. Read-only.
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
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("activityOperationType", (n) -> { this.setActivityOperationType(n.getEnumValue(CloudPcAuditActivityOperationType::forValue)); });
        deserializerMap.put("activityResult", (n) -> { this.setActivityResult(n.getEnumValue(CloudPcAuditActivityResult::forValue)); });
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getStringValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(CloudPcAuditActor::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(CloudPcAuditCategory::forValue)); });
        deserializerMap.put("componentName", (n) -> { this.setComponentName(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(CloudPcAuditResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. The list of cloudPcAuditResource objects.Read-only.
     * @return a {@link java.util.List<CloudPcAuditResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcAuditResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeEnumValue("activityOperationType", this.getActivityOperationType());
        writer.writeEnumValue("activityResult", this.getActivityResult());
        writer.writeStringValue("activityType", this.getActivityType());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("componentName", this.getComponentName());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
    }
    /**
     * Sets the activity property value. The friendly name of the audit activity.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the activityDateTime property value. The date time in UTC when the activity was performed.Read-only.
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("activityDateTime", value);
    }
    /**
     * Sets the activityOperationType property value. The activityOperationType property
     * @param value Value to set for the activityOperationType property.
     */
    public void setActivityOperationType(@jakarta.annotation.Nullable final CloudPcAuditActivityOperationType value) {
        this.backingStore.set("activityOperationType", value);
    }
    /**
     * Sets the activityResult property value. The activityResult property
     * @param value Value to set for the activityResult property.
     */
    public void setActivityResult(@jakarta.annotation.Nullable final CloudPcAuditActivityResult value) {
        this.backingStore.set("activityResult", value);
    }
    /**
     * Sets the activityType property value. The type of activity that was performed.Read-only.
     * @param value Value to set for the activityType property.
     */
    public void setActivityType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityType", value);
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final CloudPcAuditActor value) {
        this.backingStore.set("actor", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final CloudPcAuditCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the componentName property value. The component name for the audit event. Read-only.
     * @param value Value to set for the componentName property.
     */
    public void setComponentName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("componentName", value);
    }
    /**
     * Sets the correlationId property value. The client request ID that is used to correlate activity within the system.Read-only.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the displayName property value. The display name for the audit event. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the resources property value. The list of cloudPcAuditResource objects.Read-only.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<CloudPcAuditResource> value) {
        this.backingStore.set("resources", value);
    }
}
