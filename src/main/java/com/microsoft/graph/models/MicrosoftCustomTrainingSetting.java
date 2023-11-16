package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftCustomTrainingSetting extends TrainingSetting implements Parsable {
    /**
     * Instantiates a new MicrosoftCustomTrainingSetting and sets the default values.
     */
    public MicrosoftCustomTrainingSetting() {
        super();
        this.setOdataType("#microsoft.graph.microsoftCustomTrainingSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftCustomTrainingSetting
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftCustomTrainingSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftCustomTrainingSetting();
    }
    /**
     * Gets the completionDateTime property value. The completion date and time of the training. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.BackingStore.get("completionDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionDateTime", (n) -> { this.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("trainingAssignmentMappings", (n) -> { this.setTrainingAssignmentMappings(n.getCollectionOfObjectValues(MicrosoftTrainingAssignmentMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingCompletionDuration", (n) -> { this.setTrainingCompletionDuration(n.getEnumValue(TrainingCompletionDuration.class)); });
        return deserializerMap;
    }
    /**
     * Gets the trainingAssignmentMappings property value. The mapping details of the associated training.
     * @return a java.util.List<MicrosoftTrainingAssignmentMapping>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftTrainingAssignmentMapping> getTrainingAssignmentMappings() {
        return this.BackingStore.get("trainingAssignmentMappings");
    }
    /**
     * Gets the trainingCompletionDuration property value. The training completion duration that needs to be provided before scheduling the training. Possible values are: week, fortnite, month, unknownFutureValue.
     * @return a TrainingCompletionDuration
     */
    @jakarta.annotation.Nullable
    public TrainingCompletionDuration getTrainingCompletionDuration() {
        return this.BackingStore.get("trainingCompletionDuration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeCollectionOfObjectValues("trainingAssignmentMappings", this.getTrainingAssignmentMappings());
        writer.writeEnumValue("trainingCompletionDuration", this.getTrainingCompletionDuration());
    }
    /**
     * Sets the completionDateTime property value. The completion date and time of the training. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("completionDateTime", value);
    }
    /**
     * Sets the trainingAssignmentMappings property value. The mapping details of the associated training.
     * @param value Value to set for the trainingAssignmentMappings property.
     */
    public void setTrainingAssignmentMappings(@jakarta.annotation.Nullable final java.util.List<MicrosoftTrainingAssignmentMapping> value) {
        this.BackingStore.set("trainingAssignmentMappings", value);
    }
    /**
     * Sets the trainingCompletionDuration property value. The training completion duration that needs to be provided before scheduling the training. Possible values are: week, fortnite, month, unknownFutureValue.
     * @param value Value to set for the trainingCompletionDuration property.
     */
    public void setTrainingCompletionDuration(@jakarta.annotation.Nullable final TrainingCompletionDuration value) {
        this.BackingStore.set("trainingCompletionDuration", value);
    }
}
