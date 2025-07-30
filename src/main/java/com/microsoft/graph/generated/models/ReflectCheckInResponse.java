package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReflectCheckInResponse extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ReflectCheckInResponse} and sets the default values.
     */
    public ReflectCheckInResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReflectCheckInResponse}
     */
    @jakarta.annotation.Nonnull
    public static ReflectCheckInResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReflectCheckInResponse();
    }
    /**
     * Gets the checkInId property value. Identifier for the Reflect check-in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCheckInId() {
        return this.backingStore.get("checkInId");
    }
    /**
     * Gets the checkInTitle property value. The question or prompt of the Reflect check-in that this response addresses.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCheckInTitle() {
        return this.backingStore.get("checkInTitle");
    }
    /**
     * Gets the classId property value. ID of the class associated with the Reflect check-in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClassId() {
        return this.backingStore.get("classId");
    }
    /**
     * Gets the createdDateTime property value. Date and time when the Reflect check-in was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the creatorId property value. ID of the user who created the Reflect check-in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatorId() {
        return this.backingStore.get("creatorId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("checkInId", (n) -> { this.setCheckInId(n.getStringValue()); });
        deserializerMap.put("checkInTitle", (n) -> { this.setCheckInTitle(n.getStringValue()); });
        deserializerMap.put("classId", (n) -> { this.setClassId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creatorId", (n) -> { this.setCreatorId(n.getStringValue()); });
        deserializerMap.put("isClosed", (n) -> { this.setIsClosed(n.getBooleanValue()); });
        deserializerMap.put("responderId", (n) -> { this.setResponderId(n.getStringValue()); });
        deserializerMap.put("responseEmotion", (n) -> { this.setResponseEmotion(n.getEnumValue(ResponseEmotionType::forValue)); });
        deserializerMap.put("responseFeedback", (n) -> { this.setResponseFeedback(n.getEnumValue(ResponseFeedbackType::forValue)); });
        deserializerMap.put("submitDateTime", (n) -> { this.setSubmitDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isClosed property value. Indicates whether the Reflect check-in is closed (true) or open (false).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsClosed() {
        return this.backingStore.get("isClosed");
    }
    /**
     * Gets the responderId property value. ID of the user who responded to the Reflect check-in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResponderId() {
        return this.backingStore.get("responderId");
    }
    /**
     * Gets the responseEmotion property value. The responseEmotion property
     * @return a {@link ResponseEmotionType}
     */
    @jakarta.annotation.Nullable
    public ResponseEmotionType getResponseEmotion() {
        return this.backingStore.get("responseEmotion");
    }
    /**
     * Gets the responseFeedback property value. The responseFeedback property
     * @return a {@link ResponseFeedbackType}
     */
    @jakarta.annotation.Nullable
    public ResponseFeedbackType getResponseFeedback() {
        return this.backingStore.get("responseFeedback");
    }
    /**
     * Gets the submitDateTime property value. Date and time when the response to the Reflect check-in was submitted. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmitDateTime() {
        return this.backingStore.get("submitDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("checkInId", this.getCheckInId());
        writer.writeStringValue("checkInTitle", this.getCheckInTitle());
        writer.writeStringValue("classId", this.getClassId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("creatorId", this.getCreatorId());
        writer.writeBooleanValue("isClosed", this.getIsClosed());
        writer.writeStringValue("responderId", this.getResponderId());
        writer.writeEnumValue("responseEmotion", this.getResponseEmotion());
        writer.writeEnumValue("responseFeedback", this.getResponseFeedback());
        writer.writeOffsetDateTimeValue("submitDateTime", this.getSubmitDateTime());
    }
    /**
     * Sets the checkInId property value. Identifier for the Reflect check-in.
     * @param value Value to set for the checkInId property.
     */
    public void setCheckInId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("checkInId", value);
    }
    /**
     * Sets the checkInTitle property value. The question or prompt of the Reflect check-in that this response addresses.
     * @param value Value to set for the checkInTitle property.
     */
    public void setCheckInTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("checkInTitle", value);
    }
    /**
     * Sets the classId property value. ID of the class associated with the Reflect check-in.
     * @param value Value to set for the classId property.
     */
    public void setClassId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("classId", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time when the Reflect check-in was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the creatorId property value. ID of the user who created the Reflect check-in.
     * @param value Value to set for the creatorId property.
     */
    public void setCreatorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("creatorId", value);
    }
    /**
     * Sets the isClosed property value. Indicates whether the Reflect check-in is closed (true) or open (false).
     * @param value Value to set for the isClosed property.
     */
    public void setIsClosed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isClosed", value);
    }
    /**
     * Sets the responderId property value. ID of the user who responded to the Reflect check-in.
     * @param value Value to set for the responderId property.
     */
    public void setResponderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("responderId", value);
    }
    /**
     * Sets the responseEmotion property value. The responseEmotion property
     * @param value Value to set for the responseEmotion property.
     */
    public void setResponseEmotion(@jakarta.annotation.Nullable final ResponseEmotionType value) {
        this.backingStore.set("responseEmotion", value);
    }
    /**
     * Sets the responseFeedback property value. The responseFeedback property
     * @param value Value to set for the responseFeedback property.
     */
    public void setResponseFeedback(@jakarta.annotation.Nullable final ResponseFeedbackType value) {
        this.backingStore.set("responseFeedback", value);
    }
    /**
     * Sets the submitDateTime property value. Date and time when the response to the Reflect check-in was submitted. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the submitDateTime property.
     */
    public void setSubmitDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("submitDateTime", value);
    }
}
