package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerAssignedToTaskBoardTaskFormat extends Entity implements Parsable {
    /** Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here. */
    private PlannerOrderHintsByAssignee _orderHintsByAssignee;
    /** Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format is defined as outlined here. */
    private String _unassignedOrderHint;
    /**
     * Instantiates a new plannerAssignedToTaskBoardTaskFormat and sets the default values.
     * @return a void
     */
    public PlannerAssignedToTaskBoardTaskFormat() {
        super();
        this.setOdataType("#microsoft.graph.plannerAssignedToTaskBoardTaskFormat");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerAssignedToTaskBoardTaskFormat
     */
    @javax.annotation.Nonnull
    public static PlannerAssignedToTaskBoardTaskFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerAssignedToTaskBoardTaskFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerAssignedToTaskBoardTaskFormat currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("orderHintsByAssignee", (n) -> { currentObject.setOrderHintsByAssignee(n.getObjectValue(PlannerOrderHintsByAssignee::createFromDiscriminatorValue)); });
            this.put("unassignedOrderHint", (n) -> { currentObject.setUnassignedOrderHint(n.getStringValue()); });
        }};
    }
    /**
     * Gets the orderHintsByAssignee property value. Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
     * @return a plannerOrderHintsByAssignee
     */
    @javax.annotation.Nullable
    public PlannerOrderHintsByAssignee getOrderHintsByAssignee() {
        return this._orderHintsByAssignee;
    }
    /**
     * Gets the unassignedOrderHint property value. Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format is defined as outlined here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnassignedOrderHint() {
        return this._unassignedOrderHint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("orderHintsByAssignee", this.getOrderHintsByAssignee());
        writer.writeStringValue("unassignedOrderHint", this.getUnassignedOrderHint());
    }
    /**
     * Sets the orderHintsByAssignee property value. Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
     * @param value Value to set for the orderHintsByAssignee property.
     * @return a void
     */
    public void setOrderHintsByAssignee(@javax.annotation.Nullable final PlannerOrderHintsByAssignee value) {
        this._orderHintsByAssignee = value;
    }
    /**
     * Sets the unassignedOrderHint property value. Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format is defined as outlined here.
     * @param value Value to set for the unassignedOrderHint property.
     * @return a void
     */
    public void setUnassignedOrderHint(@javax.annotation.Nullable final String value) {
        this._unassignedOrderHint = value;
    }
}
