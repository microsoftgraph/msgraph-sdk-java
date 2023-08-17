package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerBucket extends Entity implements Parsable {
    /**
     * Name of the bucket.
     */
    private String name;
    /**
     * Hint used to order items of this type in a list view. For details about the supported format, see Using order hints in Planner.
     */
    private String orderHint;
    /**
     * Plan ID to which the bucket belongs.
     */
    private String planId;
    /**
     * Read-only. Nullable. The collection of tasks in the bucket.
     */
    private java.util.List<PlannerTask> tasks;
    /**
     * Instantiates a new plannerBucket and sets the default values.
     */
    public PlannerBucket() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerBucket
     */
    @jakarta.annotation.Nonnull
    public static PlannerBucket createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerBucket();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("orderHint", (n) -> { this.setOrderHint(n.getStringValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name of the bucket.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the orderHint property value. Hint used to order items of this type in a list view. For details about the supported format, see Using order hints in Planner.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOrderHint() {
        return this.orderHint;
    }
    /**
     * Gets the planId property value. Plan ID to which the bucket belongs.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. The collection of tasks in the bucket.
     * @return a plannerTask
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("orderHint", this.getOrderHint());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the name property value. Name of the bucket.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the orderHint property value. Hint used to order items of this type in a list view. For details about the supported format, see Using order hints in Planner.
     * @param value Value to set for the orderHint property.
     */
    public void setOrderHint(@jakarta.annotation.Nullable final String value) {
        this.orderHint = value;
    }
    /**
     * Sets the planId property value. Plan ID to which the bucket belongs.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.planId = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. The collection of tasks in the bucket.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.tasks = value;
    }
}
