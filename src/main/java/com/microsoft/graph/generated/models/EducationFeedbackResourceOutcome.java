package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationFeedbackResourceOutcome extends EducationOutcome implements Parsable {
    /**
     * Instantiates a new EducationFeedbackResourceOutcome and sets the default values.
     */
    public EducationFeedbackResourceOutcome() {
        super();
        this.setOdataType("#microsoft.graph.educationFeedbackResourceOutcome");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationFeedbackResourceOutcome
     */
    @jakarta.annotation.Nonnull
    public static EducationFeedbackResourceOutcome createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationFeedbackResourceOutcome();
    }
    /**
     * Gets the feedbackResource property value. The actual feedback resource.
     * @return a EducationResource
     */
    @jakarta.annotation.Nullable
    public EducationResource getFeedbackResource() {
        return this.backingStore.get("feedbackResource");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("feedbackResource", (n) -> { this.setFeedbackResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceStatus", (n) -> { this.setResourceStatus(n.getEnumValue(EducationFeedbackResourceOutcomeStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceStatus property value. The status of the feedback resource. The possible values are: notPublished, pendingPublish, published, failedPublish, unknownFutureValue.
     * @return a EducationFeedbackResourceOutcomeStatus
     */
    @jakarta.annotation.Nullable
    public EducationFeedbackResourceOutcomeStatus getResourceStatus() {
        return this.backingStore.get("resourceStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("feedbackResource", this.getFeedbackResource());
        writer.writeEnumValue("resourceStatus", this.getResourceStatus());
    }
    /**
     * Sets the feedbackResource property value. The actual feedback resource.
     * @param value Value to set for the feedbackResource property.
     */
    public void setFeedbackResource(@jakarta.annotation.Nullable final EducationResource value) {
        this.backingStore.set("feedbackResource", value);
    }
    /**
     * Sets the resourceStatus property value. The status of the feedback resource. The possible values are: notPublished, pendingPublish, published, failedPublish, unknownFutureValue.
     * @param value Value to set for the resourceStatus property.
     */
    public void setResourceStatus(@jakarta.annotation.Nullable final EducationFeedbackResourceOutcomeStatus value) {
        this.backingStore.set("resourceStatus", value);
    }
}
