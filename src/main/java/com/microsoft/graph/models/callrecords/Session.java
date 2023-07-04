package com.microsoft.graph.models.callrecords;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Session extends Entity implements Parsable {
    /**
     * Endpoint that answered the session.
     */
    private Endpoint callee;
    /**
     * Endpoint that initiated the session.
     */
    private Endpoint caller;
    /**
     * UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime endDateTime;
    /**
     * Failure information associated with the session if the session failed.
     */
    private FailureInfo failureInfo;
    /**
     * Specifies whether the session is a test.
     */
    private Boolean isTest;
    /**
     * List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     */
    private java.util.List<Modality> modalities;
    /**
     * The list of segments involved in the session. Read-only. Nullable.
     */
    private java.util.List<Segment> segments;
    /**
     * UTC time when the first user joined the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime startDateTime;
    /**
     * Instantiates a new session and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Session() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a session
     */
    @javax.annotation.Nonnull
    public static Session createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Session();
    }
    /**
     * Gets the callee property value. Endpoint that answered the session.
     * @return a endpoint
     */
    @javax.annotation.Nullable
    public Endpoint getCallee() {
        return this.callee;
    }
    /**
     * Gets the caller property value. Endpoint that initiated the session.
     * @return a endpoint
     */
    @javax.annotation.Nullable
    public Endpoint getCaller() {
        return this.caller;
    }
    /**
     * Gets the endDateTime property value. UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the failureInfo property value. Failure information associated with the session if the session failed.
     * @return a failureInfo
     */
    @javax.annotation.Nullable
    public FailureInfo getFailureInfo() {
        return this.failureInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callee", (n) -> { this.setCallee(n.getObjectValue(Endpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("caller", (n) -> { this.setCaller(n.getObjectValue(Endpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureInfo", (n) -> { this.setFailureInfo(n.getObjectValue(FailureInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("isTest", (n) -> { this.setIsTest(n.getBooleanValue()); });
        deserializerMap.put("modalities", (n) -> { this.setModalities(n.getCollectionOfEnumValues(Modality.class)); });
        deserializerMap.put("segments", (n) -> { this.setSegments(n.getCollectionOfObjectValues(Segment::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTest property value. Specifies whether the session is a test.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTest() {
        return this.isTest;
    }
    /**
     * Gets the modalities property value. List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @return a Modality
     */
    @javax.annotation.Nullable
    public java.util.List<Modality> getModalities() {
        return this.modalities;
    }
    /**
     * Gets the segments property value. The list of segments involved in the session. Read-only. Nullable.
     * @return a segment
     */
    @javax.annotation.Nullable
    public java.util.List<Segment> getSegments() {
        return this.segments;
    }
    /**
     * Gets the startDateTime property value. UTC time when the first user joined the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
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
        writer.writeObjectValue("callee", this.getCallee());
        writer.writeObjectValue("caller", this.getCaller());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("failureInfo", this.getFailureInfo());
        writer.writeBooleanValue("isTest", this.getIsTest());
        writer.writeCollectionOfEnumValues("modalities", this.getModalities());
        writer.writeCollectionOfObjectValues("segments", this.getSegments());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the callee property value. Endpoint that answered the session.
     * @param value Value to set for the callee property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallee(@javax.annotation.Nullable final Endpoint value) {
        this.callee = value;
    }
    /**
     * Sets the caller property value. Endpoint that initiated the session.
     * @param value Value to set for the caller property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCaller(@javax.annotation.Nullable final Endpoint value) {
        this.caller = value;
    }
    /**
     * Sets the endDateTime property value. UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the failureInfo property value. Failure information associated with the session if the session failed.
     * @param value Value to set for the failureInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureInfo(@javax.annotation.Nullable final FailureInfo value) {
        this.failureInfo = value;
    }
    /**
     * Sets the isTest property value. Specifies whether the session is a test.
     * @param value Value to set for the isTest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsTest(@javax.annotation.Nullable final Boolean value) {
        this.isTest = value;
    }
    /**
     * Sets the modalities property value. List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @param value Value to set for the modalities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModalities(@javax.annotation.Nullable final java.util.List<Modality> value) {
        this.modalities = value;
    }
    /**
     * Sets the segments property value. The list of segments involved in the session. Read-only. Nullable.
     * @param value Value to set for the segments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSegments(@javax.annotation.Nullable final java.util.List<Segment> value) {
        this.segments = value;
    }
    /**
     * Sets the startDateTime property value. UTC time when the first user joined the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
}
