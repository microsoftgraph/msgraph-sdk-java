package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Approval extends Entity implements Parsable {
    /**
     * Instantiates a new Approval and sets the default values.
     */
    public Approval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Approval
     */
    @jakarta.annotation.Nonnull
    public static Approval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Approval();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("stages", (n) -> { this.setStages(n.getCollectionOfObjectValues(ApprovalStage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the stages property value. A collection of stages in the approval decision.
     * @return a java.util.List<ApprovalStage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalStage> getStages() {
        return this.getBackingStore().get("stages");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("stages", this.getStages());
    }
    /**
     * Sets the stages property value. A collection of stages in the approval decision.
     * @param value Value to set for the stages property.
     */
    public void setStages(@jakarta.annotation.Nullable final java.util.List<ApprovalStage> value) {
        this.getBackingStore().set("stages", value);
    }
}
