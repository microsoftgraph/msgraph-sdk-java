package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpeakerAssignmentSubmission extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SpeakerAssignmentSubmission} and sets the default values.
     */
    public SpeakerAssignmentSubmission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpeakerAssignmentSubmission}
     */
    @jakarta.annotation.Nonnull
    public static SpeakerAssignmentSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpeakerAssignmentSubmission();
    }
    /**
     * Gets the assignmentId property value. ID of the assignment with which this submission is associated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentId() {
        return this.backingStore.get("assignmentId");
    }
    /**
     * Gets the averageWordsPerMinutePace property value. The average speaking pace of the student, measured in words per minute.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAverageWordsPerMinutePace() {
        return this.backingStore.get("averageWordsPerMinutePace");
    }
    /**
     * Gets the classId property value. ID of the class this speaker progress is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClassId() {
        return this.backingStore.get("classId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentId", (n) -> { this.setAssignmentId(n.getStringValue()); });
        deserializerMap.put("averageWordsPerMinutePace", (n) -> { this.setAverageWordsPerMinutePace(n.getLongValue()); });
        deserializerMap.put("classId", (n) -> { this.setClassId(n.getStringValue()); });
        deserializerMap.put("fillerWordsOccurrencesCount", (n) -> { this.setFillerWordsOccurrencesCount(n.getLongValue()); });
        deserializerMap.put("incorrectCameraDistanceOccurrencesCount", (n) -> { this.setIncorrectCameraDistanceOccurrencesCount(n.getLongValue()); });
        deserializerMap.put("lengthOfSubmissionInSeconds", (n) -> { this.setLengthOfSubmissionInSeconds(n.getDoubleValue()); });
        deserializerMap.put("lostEyeContactOccurrencesCount", (n) -> { this.setLostEyeContactOccurrencesCount(n.getLongValue()); });
        deserializerMap.put("monotoneOccurrencesCount", (n) -> { this.setMonotoneOccurrencesCount(n.getLongValue()); });
        deserializerMap.put("nonInclusiveLanguageOccurrencesCount", (n) -> { this.setNonInclusiveLanguageOccurrencesCount(n.getLongValue()); });
        deserializerMap.put("obstructedViewOccurrencesCount", (n) -> { this.setObstructedViewOccurrencesCount(n.getLongValue()); });
        deserializerMap.put("repetitiveLanguageOccurrencesCount", (n) -> { this.setRepetitiveLanguageOccurrencesCount(n.getLongValue()); });
        deserializerMap.put("studentId", (n) -> { this.setStudentId(n.getStringValue()); });
        deserializerMap.put("submissionDateTime", (n) -> { this.setSubmissionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("submissionId", (n) -> { this.setSubmissionId(n.getStringValue()); });
        deserializerMap.put("topFillerWords", (n) -> { this.setTopFillerWords(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("topMispronouncedWords", (n) -> { this.setTopMispronouncedWords(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("topNonInclusiveWordsAndPhrases", (n) -> { this.setTopNonInclusiveWordsAndPhrases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("topRepetitiveWordsAndPhrases", (n) -> { this.setTopRepetitiveWordsAndPhrases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("wordsSpokenCount", (n) -> { this.setWordsSpokenCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fillerWordsOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for using a filler word.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFillerWordsOccurrencesCount() {
        return this.backingStore.get("fillerWordsOccurrencesCount");
    }
    /**
     * Gets the incorrectCameraDistanceOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for being either too close or too far away from the camera.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getIncorrectCameraDistanceOccurrencesCount() {
        return this.backingStore.get("incorrectCameraDistanceOccurrencesCount");
    }
    /**
     * Gets the lengthOfSubmissionInSeconds property value. The length of the student submission in seconds.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLengthOfSubmissionInSeconds() {
        return this.backingStore.get("lengthOfSubmissionInSeconds");
    }
    /**
     * Gets the lostEyeContactOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for losing eye contact with the camera.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLostEyeContactOccurrencesCount() {
        return this.backingStore.get("lostEyeContactOccurrencesCount");
    }
    /**
     * Gets the monotoneOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for speaking in monotone.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMonotoneOccurrencesCount() {
        return this.backingStore.get("monotoneOccurrencesCount");
    }
    /**
     * Gets the nonInclusiveLanguageOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for using non-inclusive or sensitive language.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getNonInclusiveLanguageOccurrencesCount() {
        return this.backingStore.get("nonInclusiveLanguageOccurrencesCount");
    }
    /**
     * Gets the obstructedViewOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for obstructing the view of their face.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getObstructedViewOccurrencesCount() {
        return this.backingStore.get("obstructedViewOccurrencesCount");
    }
    /**
     * Gets the repetitiveLanguageOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for using repetitive language.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRepetitiveLanguageOccurrencesCount() {
        return this.backingStore.get("repetitiveLanguageOccurrencesCount");
    }
    /**
     * Gets the studentId property value. ID of the user this speaker progress is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStudentId() {
        return this.backingStore.get("studentId");
    }
    /**
     * Gets the submissionDateTime property value. Date and time of the submission this speaker progress is associated with. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmissionDateTime() {
        return this.backingStore.get("submissionDateTime");
    }
    /**
     * Gets the submissionId property value. ID of the submission this speaker progress is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubmissionId() {
        return this.backingStore.get("submissionId");
    }
    /**
     * Gets the topFillerWords property value. The filler words used most by the student.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTopFillerWords() {
        return this.backingStore.get("topFillerWords");
    }
    /**
     * Gets the topMispronouncedWords property value. The words mispronounced most by the student.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTopMispronouncedWords() {
        return this.backingStore.get("topMispronouncedWords");
    }
    /**
     * Gets the topNonInclusiveWordsAndPhrases property value. The non-inclusive or sensitive words and phrases most used by the student.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTopNonInclusiveWordsAndPhrases() {
        return this.backingStore.get("topNonInclusiveWordsAndPhrases");
    }
    /**
     * Gets the topRepetitiveWordsAndPhrases property value. The words and phrases most repeated by the student.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTopRepetitiveWordsAndPhrases() {
        return this.backingStore.get("topRepetitiveWordsAndPhrases");
    }
    /**
     * Gets the wordsSpokenCount property value. Total number of words spoken by the student in the submission.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getWordsSpokenCount() {
        return this.backingStore.get("wordsSpokenCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignmentId", this.getAssignmentId());
        writer.writeLongValue("averageWordsPerMinutePace", this.getAverageWordsPerMinutePace());
        writer.writeStringValue("classId", this.getClassId());
        writer.writeLongValue("fillerWordsOccurrencesCount", this.getFillerWordsOccurrencesCount());
        writer.writeLongValue("incorrectCameraDistanceOccurrencesCount", this.getIncorrectCameraDistanceOccurrencesCount());
        writer.writeDoubleValue("lengthOfSubmissionInSeconds", this.getLengthOfSubmissionInSeconds());
        writer.writeLongValue("lostEyeContactOccurrencesCount", this.getLostEyeContactOccurrencesCount());
        writer.writeLongValue("monotoneOccurrencesCount", this.getMonotoneOccurrencesCount());
        writer.writeLongValue("nonInclusiveLanguageOccurrencesCount", this.getNonInclusiveLanguageOccurrencesCount());
        writer.writeLongValue("obstructedViewOccurrencesCount", this.getObstructedViewOccurrencesCount());
        writer.writeLongValue("repetitiveLanguageOccurrencesCount", this.getRepetitiveLanguageOccurrencesCount());
        writer.writeStringValue("studentId", this.getStudentId());
        writer.writeOffsetDateTimeValue("submissionDateTime", this.getSubmissionDateTime());
        writer.writeStringValue("submissionId", this.getSubmissionId());
        writer.writeCollectionOfPrimitiveValues("topFillerWords", this.getTopFillerWords());
        writer.writeCollectionOfPrimitiveValues("topMispronouncedWords", this.getTopMispronouncedWords());
        writer.writeCollectionOfPrimitiveValues("topNonInclusiveWordsAndPhrases", this.getTopNonInclusiveWordsAndPhrases());
        writer.writeCollectionOfPrimitiveValues("topRepetitiveWordsAndPhrases", this.getTopRepetitiveWordsAndPhrases());
        writer.writeLongValue("wordsSpokenCount", this.getWordsSpokenCount());
    }
    /**
     * Sets the assignmentId property value. ID of the assignment with which this submission is associated.
     * @param value Value to set for the assignmentId property.
     */
    public void setAssignmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentId", value);
    }
    /**
     * Sets the averageWordsPerMinutePace property value. The average speaking pace of the student, measured in words per minute.
     * @param value Value to set for the averageWordsPerMinutePace property.
     */
    public void setAverageWordsPerMinutePace(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("averageWordsPerMinutePace", value);
    }
    /**
     * Sets the classId property value. ID of the class this speaker progress is associated with.
     * @param value Value to set for the classId property.
     */
    public void setClassId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("classId", value);
    }
    /**
     * Sets the fillerWordsOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for using a filler word.
     * @param value Value to set for the fillerWordsOccurrencesCount property.
     */
    public void setFillerWordsOccurrencesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("fillerWordsOccurrencesCount", value);
    }
    /**
     * Sets the incorrectCameraDistanceOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for being either too close or too far away from the camera.
     * @param value Value to set for the incorrectCameraDistanceOccurrencesCount property.
     */
    public void setIncorrectCameraDistanceOccurrencesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("incorrectCameraDistanceOccurrencesCount", value);
    }
    /**
     * Sets the lengthOfSubmissionInSeconds property value. The length of the student submission in seconds.
     * @param value Value to set for the lengthOfSubmissionInSeconds property.
     */
    public void setLengthOfSubmissionInSeconds(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("lengthOfSubmissionInSeconds", value);
    }
    /**
     * Sets the lostEyeContactOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for losing eye contact with the camera.
     * @param value Value to set for the lostEyeContactOccurrencesCount property.
     */
    public void setLostEyeContactOccurrencesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("lostEyeContactOccurrencesCount", value);
    }
    /**
     * Sets the monotoneOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for speaking in monotone.
     * @param value Value to set for the monotoneOccurrencesCount property.
     */
    public void setMonotoneOccurrencesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("monotoneOccurrencesCount", value);
    }
    /**
     * Sets the nonInclusiveLanguageOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for using non-inclusive or sensitive language.
     * @param value Value to set for the nonInclusiveLanguageOccurrencesCount property.
     */
    public void setNonInclusiveLanguageOccurrencesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("nonInclusiveLanguageOccurrencesCount", value);
    }
    /**
     * Sets the obstructedViewOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for obstructing the view of their face.
     * @param value Value to set for the obstructedViewOccurrencesCount property.
     */
    public void setObstructedViewOccurrencesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("obstructedViewOccurrencesCount", value);
    }
    /**
     * Sets the repetitiveLanguageOccurrencesCount property value. The number of times the student was flagged by Speaker Coach for using repetitive language.
     * @param value Value to set for the repetitiveLanguageOccurrencesCount property.
     */
    public void setRepetitiveLanguageOccurrencesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("repetitiveLanguageOccurrencesCount", value);
    }
    /**
     * Sets the studentId property value. ID of the user this speaker progress is associated with.
     * @param value Value to set for the studentId property.
     */
    public void setStudentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("studentId", value);
    }
    /**
     * Sets the submissionDateTime property value. Date and time of the submission this speaker progress is associated with. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the submissionDateTime property.
     */
    public void setSubmissionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("submissionDateTime", value);
    }
    /**
     * Sets the submissionId property value. ID of the submission this speaker progress is associated with.
     * @param value Value to set for the submissionId property.
     */
    public void setSubmissionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("submissionId", value);
    }
    /**
     * Sets the topFillerWords property value. The filler words used most by the student.
     * @param value Value to set for the topFillerWords property.
     */
    public void setTopFillerWords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("topFillerWords", value);
    }
    /**
     * Sets the topMispronouncedWords property value. The words mispronounced most by the student.
     * @param value Value to set for the topMispronouncedWords property.
     */
    public void setTopMispronouncedWords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("topMispronouncedWords", value);
    }
    /**
     * Sets the topNonInclusiveWordsAndPhrases property value. The non-inclusive or sensitive words and phrases most used by the student.
     * @param value Value to set for the topNonInclusiveWordsAndPhrases property.
     */
    public void setTopNonInclusiveWordsAndPhrases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("topNonInclusiveWordsAndPhrases", value);
    }
    /**
     * Sets the topRepetitiveWordsAndPhrases property value. The words and phrases most repeated by the student.
     * @param value Value to set for the topRepetitiveWordsAndPhrases property.
     */
    public void setTopRepetitiveWordsAndPhrases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("topRepetitiveWordsAndPhrases", value);
    }
    /**
     * Sets the wordsSpokenCount property value. Total number of words spoken by the student in the submission.
     * @param value Value to set for the wordsSpokenCount property.
     */
    public void setWordsSpokenCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("wordsSpokenCount", value);
    }
}
