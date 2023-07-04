package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerUser extends Entity implements Parsable {
    /**
     * Read-only. Nullable. Returns the plannerTasks assigned to the user.
     */
    private java.util.List<PlannerPlan> plans;
    /**
     * Read-only. Nullable. Returns the plannerPlans shared with the user.
     */
    private java.util.List<PlannerTask> tasks;
    /**
     * Instantiates a new PlannerUser and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerUser
     */
    @javax.annotation.Nonnull
    public static PlannerUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the plans property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.plans;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Returns the plannerPlans shared with the user.
     * @return a plannerTask
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.tasks;
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
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the plans property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @param value Value to set for the plans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.plans = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Returns the plannerPlans shared with the user.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.tasks = value;
    }
}
