package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivityHistoryItem extends Entity implements Parsable {
    /**
     * Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and lastActiveDateTime.
     */
    private Integer activeDurationSeconds;
    /**
     * The activity property
     */
    private UserActivity activity;
    /**
     * Set by the server. DateTime in UTC when the object was created on the server.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null, historyItem status should be Ongoing.
     */
    private OffsetDateTime lastActiveDateTime;
    /**
     * Set by the server. DateTime in UTC when the object was modified on the server.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
     */
    private OffsetDateTime startedDateTime;
    /**
     * Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     */
    private Status status;
    /**
     * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform representation.
     */
    private String userTimezone;
    /**
     * Instantiates a new ActivityHistoryItem and sets the default values.
     */
    public ActivityHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ActivityHistoryItem
     */
    @jakarta.annotation.Nonnull
    public static ActivityHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivityHistoryItem();
    }
    /**
     * Gets the activeDurationSeconds property value. Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and lastActiveDateTime.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDurationSeconds() {
        return this.activeDurationSeconds;
    }
    /**
     * Gets the activity property value. The activity property
     * @return a UserActivity
     */
    @jakarta.annotation.Nullable
    public UserActivity getActivity() {
        return this.activity;
    }
    /**
     * Gets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the expirationDateTime property value. Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDurationSeconds", (n) -> { this.setActiveDurationSeconds(n.getIntegerValue()); });
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(UserActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastActiveDateTime", (n) -> { this.setLastActiveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(Status.class)); });
        deserializerMap.put("userTimezone", (n) -> { this.setUserTimezone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActiveDateTime property value. Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null, historyItem status should be Ongoing.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActiveDateTime() {
        return this.lastActiveDateTime;
    }
    /**
     * Gets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the startedDateTime property value. Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
    }
    /**
     * Gets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @return a Status
     */
    @jakarta.annotation.Nullable
    public Status getStatus() {
        return this.status;
    }
    /**
     * Gets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform representation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserTimezone() {
        return this.userTimezone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActiveDurationSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.activeDurationSeconds = value;
    }
    /**
     * Sets the activity property value. The activity property
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final UserActivity value) {
        this.activity = value;
    }
    /**
     * Sets the createdDateTime property value. Set by the server. DateTime in UTC when the object was created on the server.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the lastActiveDateTime property value. Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null, historyItem status should be Ongoing.
     * @param value Value to set for the lastActiveDateTime property.
     */
    public void setLastActiveDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActiveDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Set by the server. DateTime in UTC when the object was modified on the server.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the startedDateTime property value. Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
     * @param value Value to set for the startedDateTime property.
     */
    public void setStartedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedDateTime = value;
    }
    /**
     * Sets the status property value. Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Status value) {
        this.status = value;
    }
    /**
     * Sets the userTimezone property value. Optional. The timezone in which the user's device used to generate the activity was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform representation.
     * @param value Value to set for the userTimezone property.
     */
    public void setUserTimezone(@jakarta.annotation.Nullable final String value) {
        this.userTimezone = value;
    }
}
