package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallRecording extends Entity implements Parsable {
    /**
     * The content property
     */
    private byte[] content;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The meetingId property
     */
    private String meetingId;
    /**
     * The meetingOrganizer property
     */
    private IdentitySet meetingOrganizer;
    /**
     * The recordingContentUrl property
     */
    private String recordingContentUrl;
    /**
     * Instantiates a new CallRecording and sets the default values.
     */
    public CallRecording() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallRecording
     */
    @jakarta.annotation.Nonnull
    public static CallRecording createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRecording();
    }
    /**
     * Gets the content property value. The content property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("meetingId", (n) -> { this.setMeetingId(n.getStringValue()); });
        deserializerMap.put("meetingOrganizer", (n) -> { this.setMeetingOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("recordingContentUrl", (n) -> { this.setRecordingContentUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingId property value. The meetingId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMeetingId() {
        return this.meetingId;
    }
    /**
     * Gets the meetingOrganizer property value. The meetingOrganizer property
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getMeetingOrganizer() {
        return this.meetingOrganizer;
    }
    /**
     * Gets the recordingContentUrl property value. The recordingContentUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecordingContentUrl() {
        return this.recordingContentUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("meetingId", this.getMeetingId());
        writer.writeObjectValue("meetingOrganizer", this.getMeetingOrganizer());
        writer.writeStringValue("recordingContentUrl", this.getRecordingContentUrl());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the meetingId property value. The meetingId property
     * @param value Value to set for the meetingId property.
     */
    public void setMeetingId(@jakarta.annotation.Nullable final String value) {
        this.meetingId = value;
    }
    /**
     * Sets the meetingOrganizer property value. The meetingOrganizer property
     * @param value Value to set for the meetingOrganizer property.
     */
    public void setMeetingOrganizer(@jakarta.annotation.Nullable final IdentitySet value) {
        this.meetingOrganizer = value;
    }
    /**
     * Sets the recordingContentUrl property value. The recordingContentUrl property
     * @param value Value to set for the recordingContentUrl property.
     */
    public void setRecordingContentUrl(@jakarta.annotation.Nullable final String value) {
        this.recordingContentUrl = value;
    }
}
