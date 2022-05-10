package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ActivityHistoryItem extends Entity implements Parsable {
    /** Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and lastActiveDateTime. */
    private Integer _activeDurationSeconds;
    /** The activity property */
    private UserActivity _activity;
    /** Set by the server. DateTime in UTC when the object was created on the server. */
    private OffsetDateTime _createdDateTime;
    /** Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client. */
    private OffsetDateTime _expirationDateTime;
    /** Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null, historyItem status should be Ongoing. */
    private OffsetDateTime _lastActiveDateTime;
    /** Set by the server. DateTime in UTC when the object was modified on the server. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history. */
    private OffsetDateTime _startedDateTime;
    /** Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored. */
    private Status _status;
    /** Optional. The timezone in which the user's device used to generate the activity was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform representation. */
    private String _userTimezone;
    /**
     * Instantiates a new activityHistoryItem and sets the default values.
     * @return a void
     */
    public ActivityHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activityHistoryItem
     */
    @javax.annotation.Nonnull
    public static ActivityHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivityHistoryItem();
    }
    /**
     * Gets the activeDurationSeconds property value. Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and lastActiveDateTime.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDurationSeconds() {
        return this._activeDurationSeconds;
    }
    /**
     * Gets the activity property value. The activity property
     * @return a userActivity
     */
    @javax.annotation.Nullable
    public UserActivity getActivity() {
        return this._activity;
    }
    /**
     * Gets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the expirationDateTime property value. Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ActivityHistoryItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeDurationSeconds", (n) -> { currentObject.setActiveDurationSeconds(n.getIntegerValue()); });
            this.put("activity", (n) -> { currentObject.setActivity(n.getObjectValue(UserActivity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastActiveDateTime", (n) -> { currentObject.setLastActiveDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("startedDateTime", (n) -> { currentObject.setStartedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(Status.class)); });
            this.put("userTimezone", (n) -> { currentObject.setUserTimezone(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActiveDateTime property value. Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null, historyItem status should be Ongoing.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActiveDateTime() {
        return this._lastActiveDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the startedDateTime property value. Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this._startedDateTime;
    }
    /**
     * Gets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @return a status
     */
    @javax.annotation.Nullable
    public Status getStatus() {
        return this._status;
    }
    /**
     * Gets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform representation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserTimezone() {
        return this._userTimezone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDurationSeconds", this.getActiveDurationSeconds());
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastActiveDateTime", this.getLastActiveDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userTimezone", this.getUserTimezone());
    }
    /**
     * Sets the activeDurationSeconds property value. Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and lastActiveDateTime.
     * @param value Value to set for the activeDurationSeconds property.
     * @return a void
     */
    public void setActiveDurationSeconds(@javax.annotation.Nullable final Integer value) {
        this._activeDurationSeconds = value;
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     * @return a void
     */
    public void setActivity(@javax.annotation.Nullable final UserActivity value) {
        this._activity = value;
    }
    /**
     * Sets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the lastActiveDateTime property value. Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null, historyItem status should be Ongoing.
     * @param value Value to set for the lastActiveDateTime property.
     * @return a void
     */
    public void setLastActiveDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActiveDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startedDateTime = value;
    }
    /**
     * Sets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final Status value) {
        this._status = value;
    }
    /**
     * Sets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform representation.
     * @param value Value to set for the userTimezone property.
     * @return a void
     */
    public void setUserTimezone(@javax.annotation.Nullable final String value) {
        this._userTimezone = value;
    }
}
