package microsoft.graph.users.item.onlinemeetings.createorget;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ChatInfo;
import microsoft.graph.models.MeetingParticipants;
/** Provides operations to call the createOrGet method.  */
public class CreateOrGetRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The chatInfo property  */
    private ChatInfo _chatInfo;
    /** The endDateTime property  */
    private OffsetDateTime _endDateTime;
    /** The externalId property  */
    private String _externalId;
    /** The participants property  */
    private MeetingParticipants _participants;
    /** The startDateTime property  */
    private OffsetDateTime _startDateTime;
    /** The subject property  */
    private String _subject;
    /**
     * Instantiates a new createOrGetRequestBody and sets the default values.
     * @return a void
     */
    public CreateOrGetRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createOrGetRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateOrGetRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateOrGetRequestBody();
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
     * Gets the chatInfo property value. The chatInfo property
     * @return a chatInfo
     */
    @javax.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this._chatInfo;
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the externalId property value. The externalId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CreateOrGetRequestBody currentObject = this;
        return new HashMap<>(6) {{
            this.put("chatInfo", (n) -> { currentObject.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("participants", (n) -> { currentObject.setParticipants(n.getObjectValue(MeetingParticipants::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        }};
    }
    /**
     * Gets the participants property value. The participants property
     * @return a meetingParticipants
     */
    @javax.annotation.Nullable
    public MeetingParticipants getParticipants() {
        return this._participants;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeObjectValue("participants", this.getParticipants());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("subject", this.getSubject());
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
     * Sets the chatInfo property value. The chatInfo property
     * @param value Value to set for the chatInfo property.
     * @return a void
     */
    public void setChatInfo(@javax.annotation.Nullable final ChatInfo value) {
        this._chatInfo = value;
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the participants property value. The participants property
     * @param value Value to set for the participants property.
     * @return a void
     */
    public void setParticipants(@javax.annotation.Nullable final MeetingParticipants value) {
        this._participants = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
}
