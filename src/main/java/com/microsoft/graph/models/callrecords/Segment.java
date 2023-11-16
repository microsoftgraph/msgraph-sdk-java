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
public class Segment extends Entity implements Parsable {
    /**
     * Instantiates a new Segment and sets the default values.
     */
    public Segment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Segment
     */
    @jakarta.annotation.Nonnull
    public static Segment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Segment();
    }
    /**
     * Gets the callee property value. Endpoint that answered this segment.
     * @return a Endpoint
     */
    @jakarta.annotation.Nullable
    public Endpoint getCallee() {
        return this.BackingStore.get("callee");
    }
    /**
     * Gets the caller property value. Endpoint that initiated this segment.
     * @return a Endpoint
     */
    @jakarta.annotation.Nullable
    public Endpoint getCaller() {
        return this.BackingStore.get("caller");
    }
    /**
     * Gets the endDateTime property value. UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.BackingStore.get("endDateTime");
    }
    /**
     * Gets the failureInfo property value. Failure information associated with the segment if it failed.
     * @return a FailureInfo
     */
    @jakarta.annotation.Nullable
    public FailureInfo getFailureInfo() {
        return this.BackingStore.get("failureInfo");
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
        deserializerMap.put("media", (n) -> { this.setMedia(n.getCollectionOfObjectValues(Media::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the media property value. Media associated with this segment.
     * @return a java.util.List<Media>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Media> getMedia() {
        return this.BackingStore.get("media");
    }
    /**
     * Gets the startDateTime property value. UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.BackingStore.get("startDateTime");
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
        writer.writeCollectionOfObjectValues("media", this.getMedia());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the callee property value. Endpoint that answered this segment.
     * @param value Value to set for the callee property.
     */
    public void setCallee(@jakarta.annotation.Nullable final Endpoint value) {
        this.BackingStore.set("callee", value);
    }
    /**
     * Sets the caller property value. Endpoint that initiated this segment.
     * @param value Value to set for the caller property.
     */
    public void setCaller(@jakarta.annotation.Nullable final Endpoint value) {
        this.BackingStore.set("caller", value);
    }
    /**
     * Sets the endDateTime property value. UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("endDateTime", value);
    }
    /**
     * Sets the failureInfo property value. Failure information associated with the segment if it failed.
     * @param value Value to set for the failureInfo property.
     */
    public void setFailureInfo(@jakarta.annotation.Nullable final FailureInfo value) {
        this.BackingStore.set("failureInfo", value);
    }
    /**
     * Sets the media property value. Media associated with this segment.
     * @param value Value to set for the media property.
     */
    public void setMedia(@jakarta.annotation.Nullable final java.util.List<Media> value) {
        this.BackingStore.set("media", value);
    }
    /**
     * Sets the startDateTime property value. UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("startDateTime", value);
    }
}
