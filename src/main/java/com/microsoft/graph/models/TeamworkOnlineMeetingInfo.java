package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkOnlineMeetingInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The identifier of the calendar event associated with the meeting.  */
    private String _calendarEventId;
    /** The URL which can be clicked on to join or uniquely identify the meeting.  */
    private String _joinWebUrl;
    /** The organizer of the meeting.  */
    private TeamworkUserIdentity _organizer;
    /**
     * Instantiates a new teamworkOnlineMeetingInfo and sets the default values.
     * @return a void
     */
    public TeamworkOnlineMeetingInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkOnlineMeetingInfo
     */
    @javax.annotation.Nonnull
    public static TeamworkOnlineMeetingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkOnlineMeetingInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the calendarEventId property value. The identifier of the calendar event associated with the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCalendarEventId() {
        return this._calendarEventId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkOnlineMeetingInfo currentObject = this;
        return new HashMap<>(3) {{
            this.put("calendarEventId", (n) -> { currentObject.setCalendarEventId(n.getStringValue()); });
            this.put("joinWebUrl", (n) -> { currentObject.setJoinWebUrl(n.getStringValue()); });
            this.put("organizer", (n) -> { currentObject.setOrganizer(n.getObjectValue(TeamworkUserIdentity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the joinWebUrl property value. The URL which can be clicked on to join or uniquely identify the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinWebUrl() {
        return this._joinWebUrl;
    }
    /**
     * Gets the organizer property value. The organizer of the meeting.
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nullable
    public TeamworkUserIdentity getOrganizer() {
        return this._organizer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("calendarEventId", this.getCalendarEventId());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeObjectValue("organizer", this.getOrganizer());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the calendarEventId property value. The identifier of the calendar event associated with the meeting.
     * @param value Value to set for the calendarEventId property.
     * @return a void
     */
    public void setCalendarEventId(@javax.annotation.Nullable final String value) {
        this._calendarEventId = value;
    }
    /**
     * Sets the joinWebUrl property value. The URL which can be clicked on to join or uniquely identify the meeting.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    public void setJoinWebUrl(@javax.annotation.Nullable final String value) {
        this._joinWebUrl = value;
    }
    /**
     * Sets the organizer property value. The organizer of the meeting.
     * @param value Value to set for the organizer property.
     * @return a void
     */
    public void setOrganizer(@javax.annotation.Nullable final TeamworkUserIdentity value) {
        this._organizer = value;
    }
}
