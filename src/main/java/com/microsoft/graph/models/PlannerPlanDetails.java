package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerPlanDetails extends Entity implements Parsable {
    /**
     * Instantiates a new PlannerPlanDetails and sets the default values.
     */
    public PlannerPlanDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerPlanDetails
     */
    @jakarta.annotation.Nonnull
    public static PlannerPlanDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanDetails();
    }
    /**
     * Gets the categoryDescriptions property value. An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan.
     * @return a PlannerCategoryDescriptions
     */
    @jakarta.annotation.Nullable
    public PlannerCategoryDescriptions getCategoryDescriptions() {
        return this.getBackingStore().get("categoryDescriptions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categoryDescriptions", (n) -> { this.setCategoryDescriptions(n.getObjectValue(PlannerCategoryDescriptions::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedWith", (n) -> { this.setSharedWith(n.getObjectValue(PlannerUserIds::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sharedWith property value. Set of user IDs that this plan is shared with. If you're using Microsoft 365 groups, use the Groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it isn't required for them to access the plan owned by the group.
     * @return a PlannerUserIds
     */
    @jakarta.annotation.Nullable
    public PlannerUserIds getSharedWith() {
        return this.getBackingStore().get("sharedWith");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("categoryDescriptions", this.getCategoryDescriptions());
        writer.writeObjectValue("sharedWith", this.getSharedWith());
    }
    /**
     * Sets the categoryDescriptions property value. An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan.
     * @param value Value to set for the categoryDescriptions property.
     */
    public void setCategoryDescriptions(@jakarta.annotation.Nullable final PlannerCategoryDescriptions value) {
        this.getBackingStore().set("categoryDescriptions", value);
    }
    /**
     * Sets the sharedWith property value. Set of user IDs that this plan is shared with. If you're using Microsoft 365 groups, use the Groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it isn't required for them to access the plan owned by the group.
     * @param value Value to set for the sharedWith property.
     */
    public void setSharedWith(@jakarta.annotation.Nullable final PlannerUserIds value) {
        this.getBackingStore().set("sharedWith", value);
    }
}
