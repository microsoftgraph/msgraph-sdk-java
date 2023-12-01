package com.microsoft.graph.models.callrecords;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Session extends Entity implements Parsable {
    /**
     * Instantiates a new Session and sets the default values.
     */
    public Session() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Session
     */
    @jakarta.annotation.Nonnull
    public static Session createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Session();
    }
    /**
     * Gets the callee property value. Endpoint that answered the session.
     * @return a Endpoint
     */
    @jakarta.annotation.Nullable
    public Endpoint getCallee() {
        return this.backingStore.get("callee");
    }
    /**
     * Gets the caller property value. Endpoint that initiated the session.
     * @return a Endpoint
     */
    @jakarta.annotation.Nullable
    public Endpoint getCaller() {
        return this.backingStore.get("caller");
    }
    /**
     * Gets the endDateTime property value. UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the failureInfo property value. Failure information associated with the session if the session failed.
     * @return a FailureInfo
     */
    @jakarta.annotation.Nullable
    public FailureInfo getFailureInfo() {
        return this.backingStore.get("failureInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callee", (n) -> { this.setCallee(n.getObjectValue(Endpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("caller", (n) -> { this.setCaller(n.getObjectValue(Endpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureInfo", (n) -> { this.setFailureInfo(n.getObjectValue(FailureInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("isTest", (n) -> { this.setIsTest(n.getBooleanValue()); });
        deserializerMap.put("modalities", (n) -> { this.setModalities(n.getCollectionOfEnumValues(Modality::forValue)); });
        deserializerMap.put("segments", (n) -> { this.setSegments(n.getCollectionOfObjectValues(Segment::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTest property value. Specifies whether the session is a test.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTest() {
        return this.backingStore.get("isTest");
    }
    /**
     * Gets the modalities property value. List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @return a java.util.List<Modality>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Modality> getModalities() {
        return this.backingStore.get("modalities");
    }
    /**
     * Gets the segments property value. The list of segments involved in the session. Read-only. Nullable.
     * @return a java.util.List<Segment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Segment> getSegments() {
        return this.backingStore.get("segments");
    }
    /**
     * Gets the startDateTime property value. UTC time when the first user joined the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCallee(@jakarta.annotation.Nullable final Endpoint value) {
        this.backingStore.set("callee", value);
    }
    /**
     * Sets the caller property value. Endpoint that initiated the session.
     * @param value Value to set for the caller property.
     */
    public void setCaller(@jakarta.annotation.Nullable final Endpoint value) {
        this.backingStore.set("caller", value);
    }
    /**
     * Sets the endDateTime property value. UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the failureInfo property value. Failure information associated with the session if the session failed.
     * @param value Value to set for the failureInfo property.
     */
    public void setFailureInfo(@jakarta.annotation.Nullable final FailureInfo value) {
        this.backingStore.set("failureInfo", value);
    }
    /**
     * Sets the isTest property value. Specifies whether the session is a test.
     * @param value Value to set for the isTest property.
     */
    public void setIsTest(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTest", value);
    }
    /**
     * Sets the modalities property value. List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @param value Value to set for the modalities property.
     */
    public void setModalities(@jakarta.annotation.Nullable final java.util.List<Modality> value) {
        this.backingStore.set("modalities", value);
    }
    /**
     * Sets the segments property value. The list of segments involved in the session. Read-only. Nullable.
     * @param value Value to set for the segments property.
     */
    public void setSegments(@jakarta.annotation.Nullable final java.util.List<Segment> value) {
        this.backingStore.set("segments", value);
    }
    /**
     * Sets the startDateTime property value. UTC time when the first user joined the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
}
