package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallTranscript extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CallTranscript} and sets the default values.
     */
    public CallTranscript() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CallTranscript}
     */
    @jakarta.annotation.Nonnull
    public static CallTranscript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallTranscript();
    }
    /**
     * Gets the content property value. The content of the transcript. Read-only.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdDateTime property value. Date and time at which the transcript was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("meetingId", (n) -> { this.setMeetingId(n.getStringValue()); });
        deserializerMap.put("meetingOrganizer", (n) -> { this.setMeetingOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("metadataContent", (n) -> { this.setMetadataContent(n.getByteArrayValue()); });
        deserializerMap.put("transcriptContentUrl", (n) -> { this.setTranscriptContentUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingId property value. The unique identifier of the online meeting related to this transcript. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMeetingId() {
        return this.backingStore.get("meetingId");
    }
    /**
     * Gets the meetingOrganizer property value. The identity information of the organizer of the onlineMeeting related to this transcript. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getMeetingOrganizer() {
        return this.backingStore.get("meetingOrganizer");
    }
    /**
     * Gets the metadataContent property value. The time-aligned metadata of the utterances in the transcript. Read-only.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getMetadataContent() {
        return this.backingStore.get("metadataContent");
    }
    /**
     * Gets the transcriptContentUrl property value. The URL that can be used to access the content of the transcript. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTranscriptContentUrl() {
        return this.backingStore.get("transcriptContentUrl");
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
        writer.writeByteArrayValue("metadataContent", this.getMetadataContent());
        writer.writeStringValue("transcriptContentUrl", this.getTranscriptContentUrl());
    }
    /**
     * Sets the content property value. The content of the transcript. Read-only.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time at which the transcript was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the meetingId property value. The unique identifier of the online meeting related to this transcript. Read-only.
     * @param value Value to set for the meetingId property.
     */
    public void setMeetingId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("meetingId", value);
    }
    /**
     * Sets the meetingOrganizer property value. The identity information of the organizer of the onlineMeeting related to this transcript. Read-only.
     * @param value Value to set for the meetingOrganizer property.
     */
    public void setMeetingOrganizer(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("meetingOrganizer", value);
    }
    /**
     * Sets the metadataContent property value. The time-aligned metadata of the utterances in the transcript. Read-only.
     * @param value Value to set for the metadataContent property.
     */
    public void setMetadataContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("metadataContent", value);
    }
    /**
     * Sets the transcriptContentUrl property value. The URL that can be used to access the content of the transcript. Read-only.
     * @param value Value to set for the transcriptContentUrl property.
     */
    public void setTranscriptContentUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("transcriptContentUrl", value);
    }
}
