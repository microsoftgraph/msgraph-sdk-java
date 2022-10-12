package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerPlan extends Entity implements Parsable {
    /** Read-only. Nullable. Collection of buckets in the plan. */
    private java.util.List<PlannerBucket> _buckets;
    /** The container property */
    private PlannerPlanContainer _container;
    /** The createdBy property */
    private IdentitySet _createdBy;
    /** Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _createdDateTime;
    /** The details property */
    private PlannerPlanDetails _details;
    /** The owner property */
    private String _owner;
    /** Read-only. Nullable. Collection of tasks in the plan. */
    private java.util.List<PlannerTask> _tasks;
    /** Required. Title of the plan. */
    private String _title;
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
        return this._buckets;
    }
    /**
     * Gets the container property value. The container property
     * @return a plannerPlanContainer
     */
    @javax.annotation.Nullable
    public PlannerPlanContainer getContainer() {
        return this._container;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the details property value. The details property
     * @return a plannerPlanDetails
     */
    @javax.annotation.Nullable
    public PlannerPlanDetails getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerPlan currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("buckets", (n) -> { currentObject.setBuckets(n.getCollectionOfObjectValues(PlannerBucket::createFromDiscriminatorValue)); });
            this.put("container", (n) -> { currentObject.setContainer(n.getObjectValue(PlannerPlanContainer::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("details", (n) -> { currentObject.setDetails(n.getObjectValue(PlannerPlanDetails::createFromDiscriminatorValue)); });
            this.put("owner", (n) -> { currentObject.setOwner(n.getStringValue()); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the owner property value. The owner property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwner() {
        return this._owner;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Collection of tasks in the plan.
     * @return a plannerTask
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this._tasks;
    }
    /**
     * Gets the title property value. Required. Title of the plan.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
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
        this._buckets = value;
    }
    /**
     * Sets the container property value. The container property
     * @param value Value to set for the container property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainer(@javax.annotation.Nullable final PlannerPlanContainer value) {
        this._container = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final PlannerPlanDetails value) {
        this._details = value;
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final String value) {
        this._owner = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Collection of tasks in the plan.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<PlannerTask> value) {
        this._tasks = value;
    }
    /**
     * Sets the title property value. Required. Title of the plan.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
