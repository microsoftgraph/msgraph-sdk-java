package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerPlan extends Entity implements Parsable {
    /** Read-only. Nullable. Collection of buckets in the plan. */
    private java.util.List<PlannerBucket> buckets;
    /** Identifies the container of the plan. Specify only the url, the containerId and type, or all properties. After it is set, this property cant be updated. Required. */
    private PlannerPlanContainer container;
    /** Read-only. The user who created the plan. */
    private IdentitySet createdBy;
    /** Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime createdDateTime;
    /** Read-only. Nullable. Additional details about the plan. */
    private PlannerPlanDetails details;
    /** The owner property */
    private String owner;
    /** Read-only. Nullable. Collection of tasks in the plan. */
    private java.util.List<PlannerTask> tasks;
    /** Required. Title of the plan. */
    private String title;
    /**
     * Instantiates a new plannerPlan and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerPlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerPlan
     */
    @javax.annotation.Nonnull
    public static PlannerPlan createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlan();
    }
    /**
     * Gets the buckets property value. Read-only. Nullable. Collection of buckets in the plan.
     * @return a plannerBucket
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerBucket> getBuckets() {
        return this.buckets;
    }
    /**
     * Gets the container property value. Identifies the container of the plan. Specify only the url, the containerId and type, or all properties. After it is set, this property cant be updated. Required.
     * @return a plannerPlanContainer
     */
    @javax.annotation.Nullable
    public PlannerPlanContainer getContainer() {
        return this.container;
    }
    /**
     * Gets the createdBy property value. Read-only. The user who created the plan.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the details property value. Read-only. Nullable. Additional details about the plan.
     * @return a plannerPlanDetails
     */
    @javax.annotation.Nullable
    public PlannerPlanDetails getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the owner property value. The owner property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this.owner;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Collection of tasks in the plan.
     * @return a plannerTask
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.tasks;
    }
    /**
     * Gets the title property value. Required. Title of the plan.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuckets(@javax.annotation.Nullable final java.util.List<PlannerBucket> value) {
        this.buckets = value;
    }
    /**
     * Sets the container property value. Identifies the container of the plan. Specify only the url, the containerId and type, or all properties. After it is set, this property cant be updated. Required.
     * @param value Value to set for the container property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainer(@javax.annotation.Nullable final PlannerPlanContainer value) {
        this.container = value;
    }
    /**
     * Sets the createdBy property value. Read-only. The user who created the plan.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the details property value. Read-only. Nullable. Additional details about the plan.
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final PlannerPlanDetails value) {
        this.details = value;
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this.owner = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Collection of tasks in the plan.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.tasks = value;
    }
    /**
     * Sets the title property value. Required. Title of the plan.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
}
