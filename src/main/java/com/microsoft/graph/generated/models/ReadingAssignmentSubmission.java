package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReadingAssignmentSubmission extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ReadingAssignmentSubmission} and sets the default values.
     */
    public ReadingAssignmentSubmission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReadingAssignmentSubmission}
     */
    @jakarta.annotation.Nonnull
    public static ReadingAssignmentSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReadingAssignmentSubmission();
    }
    /**
     * Gets the accuracyScore property value. Accuracy score of the reading progress.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAccuracyScore() {
        return this.backingStore.get("accuracyScore");
    }
    /**
     * Gets the action property value. Indicates whether the submission is an attempt by the student or a miscue edit done by the educator. The possible values are Attempt and EditMiscue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAction() {
        return this.backingStore.get("action");
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
     * Gets the challengingWords property value. List of words that the student found challenging during the reading session.
     * @return a {@link java.util.List<ChallengingWord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChallengingWord> getChallengingWords() {
        return this.backingStore.get("challengingWords");
    }
    /**
     * Gets the classId property value. ID of the class this reading progress is associated with.
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
        deserializerMap.put("accuracyScore", (n) -> { this.setAccuracyScore(n.getDoubleValue()); });
        deserializerMap.put("action", (n) -> { this.setAction(n.getStringValue()); });
        deserializerMap.put("assignmentId", (n) -> { this.setAssignmentId(n.getStringValue()); });
        deserializerMap.put("challengingWords", (n) -> { this.setChallengingWords(n.getCollectionOfObjectValues(ChallengingWord::createFromDiscriminatorValue)); });
        deserializerMap.put("classId", (n) -> { this.setClassId(n.getStringValue()); });
        deserializerMap.put("insertions", (n) -> { this.setInsertions(n.getLongValue()); });
        deserializerMap.put("mispronunciations", (n) -> { this.setMispronunciations(n.getLongValue()); });
        deserializerMap.put("missedExclamationMarks", (n) -> { this.setMissedExclamationMarks(n.getLongValue()); });
        deserializerMap.put("missedPeriods", (n) -> { this.setMissedPeriods(n.getLongValue()); });
        deserializerMap.put("missedQuestionMarks", (n) -> { this.setMissedQuestionMarks(n.getLongValue()); });
        deserializerMap.put("missedShorts", (n) -> { this.setMissedShorts(n.getLongValue()); });
        deserializerMap.put("monotoneScore", (n) -> { this.setMonotoneScore(n.getDoubleValue()); });
        deserializerMap.put("omissions", (n) -> { this.setOmissions(n.getLongValue()); });
        deserializerMap.put("repetitions", (n) -> { this.setRepetitions(n.getLongValue()); });
        deserializerMap.put("selfCorrections", (n) -> { this.setSelfCorrections(n.getLongValue()); });
        deserializerMap.put("studentId", (n) -> { this.setStudentId(n.getStringValue()); });
        deserializerMap.put("submissionDateTime", (n) -> { this.setSubmissionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("submissionId", (n) -> { this.setSubmissionId(n.getStringValue()); });
        deserializerMap.put("unexpectedPauses", (n) -> { this.setUnexpectedPauses(n.getLongValue()); });
        deserializerMap.put("wordCount", (n) -> { this.setWordCount(n.getLongValue()); });
        deserializerMap.put("wordsPerMinute", (n) -> { this.setWordsPerMinute(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the insertions property value. Insertions of the reading progress.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getInsertions() {
        return this.backingStore.get("insertions");
    }
    /**
     * Gets the mispronunciations property value. Mispronunciations of the reading progress.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMispronunciations() {
        return this.backingStore.get("mispronunciations");
    }
    /**
     * Gets the missedExclamationMarks property value. Number of exclamation marks missed in the reading passage.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMissedExclamationMarks() {
        return this.backingStore.get("missedExclamationMarks");
    }
    /**
     * Gets the missedPeriods property value. Number of periods missed in the reading passage.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMissedPeriods() {
        return this.backingStore.get("missedPeriods");
    }
    /**
     * Gets the missedQuestionMarks property value. Number of question marks missed in the reading passage.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMissedQuestionMarks() {
        return this.backingStore.get("missedQuestionMarks");
    }
    /**
     * Gets the missedShorts property value. Number of short words missed during the reading session.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMissedShorts() {
        return this.backingStore.get("missedShorts");
    }
    /**
     * Gets the monotoneScore property value. Score that reflects the student&apos;s use of intonation and expression. Lower scores indicate more monotone reading.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonotoneScore() {
        return this.backingStore.get("monotoneScore");
    }
    /**
     * Gets the omissions property value. Omissions of the reading progress.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOmissions() {
        return this.backingStore.get("omissions");
    }
    /**
     * Gets the repetitions property value. Number of times the student repeated words or phrases during the reading session.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRepetitions() {
        return this.backingStore.get("repetitions");
    }
    /**
     * Gets the selfCorrections property value. Number of times the student self-corrected their reading errors.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSelfCorrections() {
        return this.backingStore.get("selfCorrections");
    }
    /**
     * Gets the studentId property value. ID of the user this reading progress is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStudentId() {
        return this.backingStore.get("studentId");
    }
    /**
     * Gets the submissionDateTime property value. Date and time of the submission this reading progress is associated with. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmissionDateTime() {
        return this.backingStore.get("submissionDateTime");
    }
    /**
     * Gets the submissionId property value. ID of the submission this reading progress is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubmissionId() {
        return this.backingStore.get("submissionId");
    }
    /**
     * Gets the unexpectedPauses property value. Number of unexpected pauses made during the reading session.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUnexpectedPauses() {
        return this.backingStore.get("unexpectedPauses");
    }
    /**
     * Gets the wordCount property value. Words count of the reading progress.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getWordCount() {
        return this.backingStore.get("wordCount");
    }
    /**
     * Gets the wordsPerMinute property value. Words per minute of the reading progress.
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
        writer.writeDoubleValue("accuracyScore", this.getAccuracyScore());
        writer.writeStringValue("action", this.getAction());
        writer.writeStringValue("assignmentId", this.getAssignmentId());
        writer.writeCollectionOfObjectValues("challengingWords", this.getChallengingWords());
        writer.writeStringValue("classId", this.getClassId());
        writer.writeLongValue("insertions", this.getInsertions());
        writer.writeLongValue("mispronunciations", this.getMispronunciations());
        writer.writeLongValue("missedExclamationMarks", this.getMissedExclamationMarks());
        writer.writeLongValue("missedPeriods", this.getMissedPeriods());
        writer.writeLongValue("missedQuestionMarks", this.getMissedQuestionMarks());
        writer.writeLongValue("missedShorts", this.getMissedShorts());
        writer.writeDoubleValue("monotoneScore", this.getMonotoneScore());
        writer.writeLongValue("omissions", this.getOmissions());
        writer.writeLongValue("repetitions", this.getRepetitions());
        writer.writeLongValue("selfCorrections", this.getSelfCorrections());
        writer.writeStringValue("studentId", this.getStudentId());
        writer.writeOffsetDateTimeValue("submissionDateTime", this.getSubmissionDateTime());
        writer.writeStringValue("submissionId", this.getSubmissionId());
        writer.writeLongValue("unexpectedPauses", this.getUnexpectedPauses());
        writer.writeLongValue("wordCount", this.getWordCount());
        writer.writeDoubleValue("wordsPerMinute", this.getWordsPerMinute());
    }
    /**
     * Sets the accuracyScore property value. Accuracy score of the reading progress.
     * @param value Value to set for the accuracyScore property.
     */
    public void setAccuracyScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("accuracyScore", value);
    }
    /**
     * Sets the action property value. Indicates whether the submission is an attempt by the student or a miscue edit done by the educator. The possible values are Attempt and EditMiscue.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the assignmentId property value. ID of the assignment with which this submission is associated.
     * @param value Value to set for the assignmentId property.
     */
    public void setAssignmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentId", value);
    }
    /**
     * Sets the challengingWords property value. List of words that the student found challenging during the reading session.
     * @param value Value to set for the challengingWords property.
     */
    public void setChallengingWords(@jakarta.annotation.Nullable final java.util.List<ChallengingWord> value) {
        this.backingStore.set("challengingWords", value);
    }
    /**
     * Sets the classId property value. ID of the class this reading progress is associated with.
     * @param value Value to set for the classId property.
     */
    public void setClassId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("classId", value);
    }
    /**
     * Sets the insertions property value. Insertions of the reading progress.
     * @param value Value to set for the insertions property.
     */
    public void setInsertions(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("insertions", value);
    }
    /**
     * Sets the mispronunciations property value. Mispronunciations of the reading progress.
     * @param value Value to set for the mispronunciations property.
     */
    public void setMispronunciations(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("mispronunciations", value);
    }
    /**
     * Sets the missedExclamationMarks property value. Number of exclamation marks missed in the reading passage.
     * @param value Value to set for the missedExclamationMarks property.
     */
    public void setMissedExclamationMarks(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("missedExclamationMarks", value);
    }
    /**
     * Sets the missedPeriods property value. Number of periods missed in the reading passage.
     * @param value Value to set for the missedPeriods property.
     */
    public void setMissedPeriods(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("missedPeriods", value);
    }
    /**
     * Sets the missedQuestionMarks property value. Number of question marks missed in the reading passage.
     * @param value Value to set for the missedQuestionMarks property.
     */
    public void setMissedQuestionMarks(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("missedQuestionMarks", value);
    }
    /**
     * Sets the missedShorts property value. Number of short words missed during the reading session.
     * @param value Value to set for the missedShorts property.
     */
    public void setMissedShorts(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("missedShorts", value);
    }
    /**
     * Sets the monotoneScore property value. Score that reflects the student&apos;s use of intonation and expression. Lower scores indicate more monotone reading.
     * @param value Value to set for the monotoneScore property.
     */
    public void setMonotoneScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("monotoneScore", value);
    }
    /**
     * Sets the omissions property value. Omissions of the reading progress.
     * @param value Value to set for the omissions property.
     */
    public void setOmissions(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("omissions", value);
    }
    /**
     * Sets the repetitions property value. Number of times the student repeated words or phrases during the reading session.
     * @param value Value to set for the repetitions property.
     */
    public void setRepetitions(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("repetitions", value);
    }
    /**
     * Sets the selfCorrections property value. Number of times the student self-corrected their reading errors.
     * @param value Value to set for the selfCorrections property.
     */
    public void setSelfCorrections(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("selfCorrections", value);
    }
    /**
     * Sets the studentId property value. ID of the user this reading progress is associated with.
     * @param value Value to set for the studentId property.
     */
    public void setStudentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("studentId", value);
    }
    /**
     * Sets the submissionDateTime property value. Date and time of the submission this reading progress is associated with. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the submissionDateTime property.
     */
    public void setSubmissionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("submissionDateTime", value);
    }
    /**
     * Sets the submissionId property value. ID of the submission this reading progress is associated with.
     * @param value Value to set for the submissionId property.
     */
    public void setSubmissionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("submissionId", value);
    }
    /**
     * Sets the unexpectedPauses property value. Number of unexpected pauses made during the reading session.
     * @param value Value to set for the unexpectedPauses property.
     */
    public void setUnexpectedPauses(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("unexpectedPauses", value);
    }
    /**
     * Sets the wordCount property value. Words count of the reading progress.
     * @param value Value to set for the wordCount property.
     */
    public void setWordCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("wordCount", value);
    }
    /**
     * Sets the wordsPerMinute property value. Words per minute of the reading progress.
     * @param value Value to set for the wordsPerMinute property.
     */
    public void setWordsPerMinute(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("wordsPerMinute", value);
    }
}
