package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerAssignedToTaskBoardTaskFormat extends Entity implements Parsable {
    /**
     * Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
     */
    private PlannerOrderHintsByAssignee orderHintsByAssignee;
    /**
     * Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format is defined as outlined here.
     */
    private String unassignedOrderHint;
    /**
     * Instantiates a new plannerAssignedToTaskBoardTaskFormat and sets the default values.
     */
    public PlannerAssignedToTaskBoardTaskFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerAssignedToTaskBoardTaskFormat
     */
    @jakarta.annotation.Nonnull
    public static PlannerAssignedToTaskBoardTaskFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerAssignedToTaskBoardTaskFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("orderHintsByAssignee", (n) -> { this.setOrderHintsByAssignee(n.getObjectValue(PlannerOrderHintsByAssignee::createFromDiscriminatorValue)); });
        deserializerMap.put("unassignedOrderHint", (n) -> { this.setUnassignedOrderHint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the orderHintsByAssignee property value. Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
     * @return a plannerOrderHintsByAssignee
     */
    @jakarta.annotation.Nullable
    public PlannerOrderHintsByAssignee getOrderHintsByAssignee() {
        return this.orderHintsByAssignee;
    }
    /**
     * Gets the unassignedOrderHint property value. Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format is defined as outlined here.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUnassignedOrderHint() {
        return this.unassignedOrderHint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("orderHintsByAssignee", this.getOrderHintsByAssignee());
        writer.writeStringValue("unassignedOrderHint", this.getUnassignedOrderHint());
    }
    /**
     * Sets the orderHintsByAssignee property value. Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
     * @param value Value to set for the orderHintsByAssignee property.
     */
    public void setOrderHintsByAssignee(@jakarta.annotation.Nullable final PlannerOrderHintsByAssignee value) {
        this.orderHintsByAssignee = value;
    }
    /**
     * Sets the unassignedOrderHint property value. Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format is defined as outlined here.
     * @param value Value to set for the unassignedOrderHint property.
     */
    public void setUnassignedOrderHint(@jakarta.annotation.Nullable final String value) {
        this.unassignedOrderHint = value;
    }
}
