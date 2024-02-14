package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LearningSelfInitiatedCourse extends LearningCourseActivity implements Parsable {
    /**
     * Instantiates a new {@link LearningSelfInitiatedCourse} and sets the default values.
     */
    public LearningSelfInitiatedCourse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LearningSelfInitiatedCourse}
     */
    @jakarta.annotation.Nonnull
    public static LearningSelfInitiatedCourse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LearningSelfInitiatedCourse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startedDateTime property value. The date and time on which the learner started the self-initiated course. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.backingStore.get("startedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
    }
    /**
     * Sets the startedDateTime property value. The date and time on which the learner started the self-initiated course. Optional.
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startedDateTime", value);
    }
}
