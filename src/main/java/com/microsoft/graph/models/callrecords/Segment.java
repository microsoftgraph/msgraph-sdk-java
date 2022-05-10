package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class Segment extends Entity implements Parsable {
    /** Endpoint that answered this segment. */
    private Endpoint _callee;
    /** Endpoint that initiated this segment. */
    private Endpoint _caller;
    /** UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _endDateTime;
    /** Failure information associated with the segment if it failed. */
    private FailureInfo _failureInfo;
    /** Media associated with this segment. */
    private java.util.List<Media> _media;
    /** UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new segment and sets the default values.
     * @return a void
     */
    public Segment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a segment
     */
    @javax.annotation.Nonnull
    public static Segment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Segment();
    }
    /**
     * Gets the callee property value. Endpoint that answered this segment.
     * @return a endpoint
     */
    @javax.annotation.Nullable
    public Endpoint getCallee() {
        return this._callee;
    }
    /**
     * Gets the caller property value. Endpoint that initiated this segment.
     * @return a endpoint
     */
    @javax.annotation.Nullable
    public Endpoint getCaller() {
        return this._caller;
    }
    /**
     * Gets the endDateTime property value. UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the failureInfo property value. Failure information associated with the segment if it failed.
     * @return a failureInfo
     */
    @javax.annotation.Nullable
    public FailureInfo getFailureInfo() {
        return this._failureInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Segment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("callee", (n) -> { currentObject.setCallee(n.getObjectValue(Endpoint::createFromDiscriminatorValue)); });
            this.put("caller", (n) -> { currentObject.setCaller(n.getObjectValue(Endpoint::createFromDiscriminatorValue)); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("failureInfo", (n) -> { currentObject.setFailureInfo(n.getObjectValue(FailureInfo::createFromDiscriminatorValue)); });
            this.put("media", (n) -> { currentObject.setMedia(n.getCollectionOfObjectValues(Media::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the media property value. Media associated with this segment.
     * @return a media
     */
    @javax.annotation.Nullable
    public java.util.List<Media> getMedia() {
        return this._media;
    }
    /**
     * Gets the startDateTime property value. UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setCallee(@javax.annotation.Nullable final Endpoint value) {
        this._callee = value;
    }
    /**
     * Sets the caller property value. Endpoint that initiated this segment.
     * @param value Value to set for the caller property.
     * @return a void
     */
    public void setCaller(@javax.annotation.Nullable final Endpoint value) {
        this._caller = value;
    }
    /**
     * Sets the endDateTime property value. UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the failureInfo property value. Failure information associated with the segment if it failed.
     * @param value Value to set for the failureInfo property.
     * @return a void
     */
    public void setFailureInfo(@javax.annotation.Nullable final FailureInfo value) {
        this._failureInfo = value;
    }
    /**
     * Sets the media property value. Media associated with this segment.
     * @param value Value to set for the media property.
     * @return a void
     */
    public void setMedia(@javax.annotation.Nullable final java.util.List<Media> value) {
        this._media = value;
    }
    /**
     * Sets the startDateTime property value. UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}
