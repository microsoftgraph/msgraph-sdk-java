package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftTrainingAssignmentMapping extends TrainingSetting implements Parsable {
    /**
     * Instantiates a new MicrosoftTrainingAssignmentMapping and sets the default values.
     */
    public MicrosoftTrainingAssignmentMapping() {
        super();
        this.setOdataType("#microsoft.graph.microsoftTrainingAssignmentMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftTrainingAssignmentMapping
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTrainingAssignmentMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTrainingAssignmentMapping();
    }
    /**
     * Gets the assignedTo property value. A user collection that specifies to whom the training should be assigned. Possible values are: none, allUsers, clickedPayload, compromised, reportedPhish, readButNotClicked, didNothing, unknownFutureValue.
     * @return a java.util.List<TrainingAssignedTo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrainingAssignedTo> getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getCollectionOfEnumValues(TrainingAssignedTo::forValue)); });
        deserializerMap.put("training", (n) -> { this.setTraining(n.getObjectValue(Training::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the training property value. The training property
     * @return a Training
     */
    @jakarta.annotation.Nullable
    public Training getTraining() {
        return this.backingStore.get("training");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("assignedTo", this.getAssignedTo());
        writer.writeObjectValue("training", this.getTraining());
    }
    /**
     * Sets the assignedTo property value. A user collection that specifies to whom the training should be assigned. Possible values are: none, allUsers, clickedPayload, compromised, reportedPhish, readButNotClicked, didNothing, unknownFutureValue.
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final java.util.List<TrainingAssignedTo> value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the training property value. The training property
     * @param value Value to set for the training property.
     */
    public void setTraining(@jakarta.annotation.Nullable final Training value) {
        this.backingStore.set("training", value);
    }
}
