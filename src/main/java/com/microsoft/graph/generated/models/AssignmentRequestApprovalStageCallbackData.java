package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentRequestApprovalStageCallbackData extends AccessPackageAssignmentRequestCallbackData implements Parsable {
    /**
     * Instantiates a new {@link AssignmentRequestApprovalStageCallbackData} and sets the default values.
     */
    public AssignmentRequestApprovalStageCallbackData() {
        super();
        this.setOdataType("#microsoft.graph.assignmentRequestApprovalStageCallbackData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AssignmentRequestApprovalStageCallbackData}
     */
    @jakarta.annotation.Nonnull
    public static AssignmentRequestApprovalStageCallbackData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentRequestApprovalStageCallbackData();
    }
    /**
     * Gets the approvalStage property value. The stage in the approval decision.
     * @return a {@link AccessPackageApprovalStage}
     */
    @jakarta.annotation.Nullable
    public AccessPackageApprovalStage getApprovalStage() {
        return this.backingStore.get("approvalStage");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalStage", (n) -> { this.setApprovalStage(n.getObjectValue(AccessPackageApprovalStage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("approvalStage", this.getApprovalStage());
    }
    /**
     * Sets the approvalStage property value. The stage in the approval decision.
     * @param value Value to set for the approvalStage property.
     */
    public void setApprovalStage(@jakarta.annotation.Nullable final AccessPackageApprovalStage value) {
        this.backingStore.set("approvalStage", value);
    }
}
