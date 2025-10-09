package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReadingCoachPassage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ReadingCoachPassage} and sets the default values.
     */
    public ReadingCoachPassage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReadingCoachPassage}
     */
    @jakarta.annotation.Nonnull
    public static ReadingCoachPassage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReadingCoachPassage();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isReadingCompleted", (n) -> { this.setIsReadingCompleted(n.getBooleanValue()); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("practicedAtDateTime", (n) -> { this.setPracticedAtDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("practiceWords", (n) -> { this.setPracticeWords(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("storyType", (n) -> { this.setStoryType(n.getEnumValue(ReadingCoachStoryType::forValue)); });
        deserializerMap.put("studentId", (n) -> { this.setStudentId(n.getStringValue()); });
        deserializerMap.put("timeSpentReadingInSeconds", (n) -> { this.setTimeSpentReadingInSeconds(n.getDoubleValue()); });
        deserializerMap.put("wordsAccuracyPercentage", (n) -> { this.setWordsAccuracyPercentage(n.getDoubleValue()); });
        deserializerMap.put("wordsPerMinute", (n) -> { this.setWordsPerMinute(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isReadingCompleted property value. Indicates if the reading passage was completed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReadingCompleted() {
        return this.backingStore.get("isReadingCompleted");
    }
    /**
     * Gets the languageTag property value. The language of the reading passage.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.backingStore.get("languageTag");
    }
    /**
     * Gets the practicedAtDateTime property value. The date and time when the Reading Coach passage was practiced. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPracticedAtDateTime() {
        return this.backingStore.get("practicedAtDateTime");
    }
    /**
     * Gets the practiceWords property value. The list of challenging words for the student that they can practice further.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPracticeWords() {
        return this.backingStore.get("practiceWords");
    }
    /**
     * Gets the storyType property value. The storyType property
     * @return a {@link ReadingCoachStoryType}
     */
    @jakarta.annotation.Nullable
    public ReadingCoachStoryType getStoryType() {
        return this.backingStore.get("storyType");
    }
    /**
     * Gets the studentId property value. ID of the student that practiced the reading passage.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStudentId() {
        return this.backingStore.get("studentId");
    }
    /**
     * Gets the timeSpentReadingInSeconds property value. The time the student spent reading in seconds.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTimeSpentReadingInSeconds() {
        return this.backingStore.get("timeSpentReadingInSeconds");
    }
    /**
     * Gets the wordsAccuracyPercentage property value. The percentage of words that the student read correctly.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWordsAccuracyPercentage() {
        return this.backingStore.get("wordsAccuracyPercentage");
    }
    /**
     * Gets the wordsPerMinute property value. The rate the student read at in words per minute.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWordsPerMinute() {
        return this.backingStore.get("wordsPerMinute");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isReadingCompleted", this.getIsReadingCompleted());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeOffsetDateTimeValue("practicedAtDateTime", this.getPracticedAtDateTime());
        writer.writeCollectionOfPrimitiveValues("practiceWords", this.getPracticeWords());
        writer.writeEnumValue("storyType", this.getStoryType());
        writer.writeStringValue("studentId", this.getStudentId());
        writer.writeDoubleValue("timeSpentReadingInSeconds", this.getTimeSpentReadingInSeconds());
        writer.writeDoubleValue("wordsAccuracyPercentage", this.getWordsAccuracyPercentage());
        writer.writeDoubleValue("wordsPerMinute", this.getWordsPerMinute());
    }
    /**
     * Sets the isReadingCompleted property value. Indicates if the reading passage was completed.
     * @param value Value to set for the isReadingCompleted property.
     */
    public void setIsReadingCompleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReadingCompleted", value);
    }
    /**
     * Sets the languageTag property value. The language of the reading passage.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("languageTag", value);
    }
    /**
     * Sets the practicedAtDateTime property value. The date and time when the Reading Coach passage was practiced. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the practicedAtDateTime property.
     */
    public void setPracticedAtDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("practicedAtDateTime", value);
    }
    /**
     * Sets the practiceWords property value. The list of challenging words for the student that they can practice further.
     * @param value Value to set for the practiceWords property.
     */
    public void setPracticeWords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("practiceWords", value);
    }
    /**
     * Sets the storyType property value. The storyType property
     * @param value Value to set for the storyType property.
     */
    public void setStoryType(@jakarta.annotation.Nullable final ReadingCoachStoryType value) {
        this.backingStore.set("storyType", value);
    }
    /**
     * Sets the studentId property value. ID of the student that practiced the reading passage.
     * @param value Value to set for the studentId property.
     */
    public void setStudentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("studentId", value);
    }
    /**
     * Sets the timeSpentReadingInSeconds property value. The time the student spent reading in seconds.
     * @param value Value to set for the timeSpentReadingInSeconds property.
     */
    public void setTimeSpentReadingInSeconds(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("timeSpentReadingInSeconds", value);
    }
    /**
     * Sets the wordsAccuracyPercentage property value. The percentage of words that the student read correctly.
     * @param value Value to set for the wordsAccuracyPercentage property.
     */
    public void setWordsAccuracyPercentage(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("wordsAccuracyPercentage", value);
    }
    /**
     * Sets the wordsPerMinute property value. The rate the student read at in words per minute.
     * @param value Value to set for the wordsPerMinute property.
     */
    public void setWordsPerMinute(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("wordsPerMinute", value);
    }
}
