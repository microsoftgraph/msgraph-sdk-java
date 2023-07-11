package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LearningSelfInitiatedCourse extends LearningCourseActivity implements Parsable {
    /**
     * The date time value on which the self-initiated course was started by the learner. Optional.
     */
    private OffsetDateTime startedDateTime;
    /**
     * Instantiates a new learningSelfInitiatedCourse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LearningSelfInitiatedCourse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a learningSelfInitiatedCourse
     */
    @javax.annotation.Nonnull
    public static LearningSelfInitiatedCourse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LearningSelfInitiatedCourse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startedDateTime property value. The date time value on which the self-initiated course was started by the learner. Optional.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
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
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
    }
    /**
     * Sets the startedDateTime property value. The date time value on which the self-initiated course was started by the learner. Optional.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startedDateTime = value;
    }
}
