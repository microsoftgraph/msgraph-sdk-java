package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerProgressTaskBoardTaskFormat extends Entity implements Parsable {
    /**
     * Hint value used to order the task on the progress view of the task board. For details about the supported format, see Using order hints in Planner.
     */
    private String orderHint;
    /**
     * Instantiates a new PlannerProgressTaskBoardTaskFormat and sets the default values.
     */
    public PlannerProgressTaskBoardTaskFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerProgressTaskBoardTaskFormat
     */
    @jakarta.annotation.Nonnull
    public static PlannerProgressTaskBoardTaskFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerProgressTaskBoardTaskFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("orderHint", (n) -> { this.setOrderHint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the orderHint property value. Hint value used to order the task on the progress view of the task board. For details about the supported format, see Using order hints in Planner.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrderHint() {
        return this.orderHint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("orderHint", this.getOrderHint());
    }
    /**
     * Sets the orderHint property value. Hint value used to order the task on the progress view of the task board. For details about the supported format, see Using order hints in Planner.
     * @param value Value to set for the orderHint property.
     */
    public void setOrderHint(@jakarta.annotation.Nullable final String value) {
        this.orderHint = value;
    }
}
