package com.microsoft.graph.identity.b2xuserflows.item.userattributeassignments.setorder;

import com.microsoft.graph.models.AssignmentOrder;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the setOrder method. */
public class SetOrderPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The newAssignmentOrder property */
    private AssignmentOrder _newAssignmentOrder;
    /**
     * Instantiates a new setOrderPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SetOrderPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setOrderPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SetOrderPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetOrderPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SetOrderPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("newAssignmentOrder", (n) -> { currentObject.setNewAssignmentOrder(n.getObjectValue(AssignmentOrder::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the newAssignmentOrder property value. The newAssignmentOrder property
     * @return a assignmentOrder
     */
    @javax.annotation.Nullable
    public AssignmentOrder getNewAssignmentOrder() {
        return this._newAssignmentOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("newAssignmentOrder", this.getNewAssignmentOrder());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the newAssignmentOrder property value. The newAssignmentOrder property
     * @param value Value to set for the newAssignmentOrder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewAssignmentOrder(@javax.annotation.Nullable final AssignmentOrder value) {
        this._newAssignmentOrder = value;
    }
}
