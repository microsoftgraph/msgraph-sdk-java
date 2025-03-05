package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerPlan extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlannerPlan} and sets the default values.
     */
    public PlannerPlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerPlan}
     */
    @jakarta.annotation.Nonnull
    public static PlannerPlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlan();
    }
    /**
     * Gets the buckets property value. Read-only. Nullable. Collection of buckets in the plan.
     * @return a {@link java.util.List<PlannerBucket>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerBucket> getBuckets() {
        return this.backingStore.get("buckets");
    }
    /**
     * Gets the container property value. Identifies the container of the plan. Specify only the url, the containerId and type, or all properties. After it&apos;s set, this property cant be updated. Required.
     * @return a {@link PlannerPlanContainer}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanContainer getContainer() {
        return this.backingStore.get("container");
    }
    /**
     * Gets the createdBy property value. Read-only. The user who created the plan.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the details property value. Read-only. Nullable. Extra details about the plan.
     * @return a {@link PlannerPlanDetails}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanDetails getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerBucket::createFromDiscriminatorValue)); });
        deserializerMap.put("container", (n) -> { this.setContainer(n.getObjectValue(PlannerPlanContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(PlannerPlanDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the owner property value. Use the container property instead. ID of the group that owns the plan. After it&apos;s set, this property cant be updated. This property won&apos;t return a valid group ID if the container of the plan isn&apos;t a group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Collection of tasks in the plan.
     * @return a {@link java.util.List<PlannerTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Gets the title property value. Required. Title of the plan.
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
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeObjectValue("container", this.getContainer());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the buckets property value. Read-only. Nullable. Collection of buckets in the plan.
     * @param value Value to set for the buckets property.
     */
    public void setBuckets(@jakarta.annotation.Nullable final java.util.List<PlannerBucket> value) {
        this.backingStore.set("buckets", value);
    }
    /**
     * Sets the container property value. Identifies the container of the plan. Specify only the url, the containerId and type, or all properties. After it&apos;s set, this property cant be updated. Required.
     * @param value Value to set for the container property.
     */
    public void setContainer(@jakarta.annotation.Nullable final PlannerPlanContainer value) {
        this.backingStore.set("container", value);
    }
    /**
     * Sets the createdBy property value. Read-only. The user who created the plan.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the details property value. Read-only. Nullable. Extra details about the plan.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final PlannerPlanDetails value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the owner property value. Use the container property instead. ID of the group that owns the plan. After it&apos;s set, this property cant be updated. This property won&apos;t return a valid group ID if the container of the plan isn&apos;t a group.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Collection of tasks in the plan.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.backingStore.set("tasks", value);
    }
    /**
     * Sets the title property value. Required. Title of the plan.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
