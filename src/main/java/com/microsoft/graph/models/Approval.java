package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Approval extends Entity implements Parsable {
    /** A collection of stages in the approval decision. */
    private java.util.List<ApprovalStage> _stages;
    /**
     * Instantiates a new approval and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Approval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approval
     */
    @javax.annotation.Nonnull
    public static Approval createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Approval();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Approval currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("stages", (n) -> { currentObject.setStages(n.getCollectionOfObjectValues(ApprovalStage::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the stages property value. A collection of stages in the approval decision.
     * @return a approvalStage
     */
    @javax.annotation.Nullable
    public java.util.List<ApprovalStage> getStages() {
        return this._stages;
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
        writer.writeCollectionOfObjectValues("stages", this.getStages());
    }
    /**
     * Sets the stages property value. A collection of stages in the approval decision.
     * @param value Value to set for the stages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStages(@javax.annotation.Nullable final java.util.List<ApprovalStage> value) {
        this._stages = value;
    }
}
