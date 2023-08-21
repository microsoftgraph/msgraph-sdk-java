package com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.setorder;

import com.microsoft.graph.models.AssignmentOrder;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SetOrderPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The newAssignmentOrder property
     */
    private AssignmentOrder newAssignmentOrder;
    /**
     * Instantiates a new setOrderPostRequestBody and sets the default values.
     */
    public SetOrderPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setOrderPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SetOrderPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetOrderPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("newAssignmentOrder", (n) -> { this.setNewAssignmentOrder(n.getObjectValue(AssignmentOrder::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the newAssignmentOrder property value. The newAssignmentOrder property
     * @return a assignmentOrder
     */
    @jakarta.annotation.Nullable
    public AssignmentOrder getNewAssignmentOrder() {
        return this.newAssignmentOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("newAssignmentOrder", this.getNewAssignmentOrder());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the newAssignmentOrder property value. The newAssignmentOrder property
     * @param value Value to set for the newAssignmentOrder property.
     */
    public void setNewAssignmentOrder(@jakarta.annotation.Nullable final AssignmentOrder value) {
        this.newAssignmentOrder = value;
    }
}
