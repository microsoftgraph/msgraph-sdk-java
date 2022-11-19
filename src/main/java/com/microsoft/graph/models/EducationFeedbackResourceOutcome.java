package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationFeedbackResourceOutcome extends EducationOutcome implements Parsable {
    /** The actual feedback resource. */
    private EducationResource _feedbackResource;
    /** The status of the feedback resource. The possible values are: notPublished, pendingPublish, published, failedPublish, unknownFutureValue. */
    private EducationFeedbackResourceOutcomeStatus _resourceStatus;
    /**
     * Instantiates a new EducationFeedbackResourceOutcome and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationFeedbackResourceOutcome() {
        super();
        this.setOdataType("#microsoft.graph.educationFeedbackResourceOutcome");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationFeedbackResourceOutcome
     */
    @javax.annotation.Nonnull
    public static EducationFeedbackResourceOutcome createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationFeedbackResourceOutcome();
    }
    /**
     * Gets the feedbackResource property value. The actual feedback resource.
     * @return a educationResource
     */
    @javax.annotation.Nullable
    public EducationResource getFeedbackResource() {
        return this._feedbackResource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationFeedbackResourceOutcome currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("feedbackResource", (n) -> { currentObject.setFeedbackResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceStatus", (n) -> { currentObject.setResourceStatus(n.getEnumValue(EducationFeedbackResourceOutcomeStatus.class)); });
        return deserializerMap
    }
    /**
     * Gets the resourceStatus property value. The status of the feedback resource. The possible values are: notPublished, pendingPublish, published, failedPublish, unknownFutureValue.
     * @return a educationFeedbackResourceOutcomeStatus
     */
    @javax.annotation.Nullable
    public EducationFeedbackResourceOutcomeStatus getResourceStatus() {
        return this._resourceStatus;
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
        writer.writeObjectValue("feedbackResource", this.getFeedbackResource());
        writer.writeEnumValue("resourceStatus", this.getResourceStatus());
    }
    /**
     * Sets the feedbackResource property value. The actual feedback resource.
     * @param value Value to set for the feedbackResource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeedbackResource(@javax.annotation.Nullable final EducationResource value) {
        this._feedbackResource = value;
    }
    /**
     * Sets the resourceStatus property value. The status of the feedback resource. The possible values are: notPublished, pendingPublish, published, failedPublish, unknownFutureValue.
     * @param value Value to set for the resourceStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceStatus(@javax.annotation.Nullable final EducationFeedbackResourceOutcomeStatus value) {
        this._resourceStatus = value;
    }
}
