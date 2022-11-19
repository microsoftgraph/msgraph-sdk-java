package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerBucketTaskBoardTaskFormat extends Entity implements Parsable {
    /** Hint used to order tasks in the Bucket view of the Task Board. The format is defined as outlined here. */
    private String _orderHint;
    /**
     * Instantiates a new plannerBucketTaskBoardTaskFormat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerBucketTaskBoardTaskFormat() {
        super();
        this.setOdataType("#microsoft.graph.plannerBucketTaskBoardTaskFormat");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerBucketTaskBoardTaskFormat
     */
    @javax.annotation.Nonnull
    public static PlannerBucketTaskBoardTaskFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerBucketTaskBoardTaskFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerBucketTaskBoardTaskFormat currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("orderHint", (n) -> { currentObject.setOrderHint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the orderHint property value. Hint used to order tasks in the Bucket view of the Task Board. The format is defined as outlined here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrderHint() {
        return this._orderHint;
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
        writer.writeStringValue("orderHint", this.getOrderHint());
    }
    /**
     * Sets the orderHint property value. Hint used to order tasks in the Bucket view of the Task Board. The format is defined as outlined here.
     * @param value Value to set for the orderHint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderHint(@javax.annotation.Nullable final String value) {
        this._orderHint = value;
    }
}
