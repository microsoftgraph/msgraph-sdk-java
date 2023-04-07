package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerGroup extends Entity implements Parsable {
    /** Read-only. Nullable. Returns the plannerPlans owned by the group. */
    private java.util.List<PlannerPlan> plans;
    /**
     * Instantiates a new plannerGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerGroup
     */
    @javax.annotation.Nonnull
    public static PlannerGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the plans property value. Read-only. Nullable. Returns the plannerPlans owned by the group.
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.plans;
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
    }
    /**
     * Sets the plans property value. Read-only. Nullable. Returns the plannerPlans owned by the group.
     * @param value Value to set for the plans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.plans = value;
    }
}
