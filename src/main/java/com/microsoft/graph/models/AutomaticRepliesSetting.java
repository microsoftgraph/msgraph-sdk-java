package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AutomaticRepliesSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. Possible values are: none, contactsOnly, all.  */
    private ExternalAudienceScope _externalAudience;
    /** The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.  */
    private String _externalReplyMessage;
    /** The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.  */
    private String _internalReplyMessage;
    /** The date and time that automatic replies are set to end, if Status is set to Scheduled.  */
    private DateTimeTimeZone _scheduledEndDateTime;
    /** The date and time that automatic replies are set to begin, if Status is set to Scheduled.  */
    private DateTimeTimeZone _scheduledStartDateTime;
    /** Configurations status for automatic replies. Possible values are: disabled, alwaysEnabled, scheduled.  */
    private AutomaticRepliesStatus _status;
    /**
     * Instantiates a new automaticRepliesSetting and sets the default values.
     * @return a void
     */
    public AutomaticRepliesSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a automaticRepliesSetting
     */
    @javax.annotation.Nonnull
    public static AutomaticRepliesSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomaticRepliesSetting();
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
     * Gets the externalAudience property value. The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. Possible values are: none, contactsOnly, all.
     * @return a externalAudienceScope
     */
    @javax.annotation.Nullable
    public ExternalAudienceScope getExternalAudience() {
        return this._externalAudience;
    }
    /**
     * Gets the externalReplyMessage property value. The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalReplyMessage() {
        return this._externalReplyMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AutomaticRepliesSetting currentObject = this;
        return new HashMap<>(6) {{
            this.put("externalAudience", (n) -> { currentObject.setExternalAudience(n.getEnumValue(ExternalAudienceScope.class)); });
            this.put("externalReplyMessage", (n) -> { currentObject.setExternalReplyMessage(n.getStringValue()); });
            this.put("internalReplyMessage", (n) -> { currentObject.setInternalReplyMessage(n.getStringValue()); });
            this.put("scheduledEndDateTime", (n) -> { currentObject.setScheduledEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("scheduledStartDateTime", (n) -> { currentObject.setScheduledStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AutomaticRepliesStatus.class)); });
        }};
    }
    /**
     * Gets the internalReplyMessage property value. The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternalReplyMessage() {
        return this._internalReplyMessage;
    }
    /**
     * Gets the scheduledEndDateTime property value. The date and time that automatic replies are set to end, if Status is set to Scheduled.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getScheduledEndDateTime() {
        return this._scheduledEndDateTime;
    }
    /**
     * Gets the scheduledStartDateTime property value. The date and time that automatic replies are set to begin, if Status is set to Scheduled.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getScheduledStartDateTime() {
        return this._scheduledStartDateTime;
    }
    /**
     * Gets the status property value. Configurations status for automatic replies. Possible values are: disabled, alwaysEnabled, scheduled.
     * @return a automaticRepliesStatus
     */
    @javax.annotation.Nullable
    public AutomaticRepliesStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("externalAudience", this.getExternalAudience());
        writer.writeStringValue("externalReplyMessage", this.getExternalReplyMessage());
        writer.writeStringValue("internalReplyMessage", this.getInternalReplyMessage());
        writer.writeObjectValue("scheduledEndDateTime", this.getScheduledEndDateTime());
        writer.writeObjectValue("scheduledStartDateTime", this.getScheduledStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the externalAudience property value. The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. Possible values are: none, contactsOnly, all.
     * @param value Value to set for the externalAudience property.
     * @return a void
     */
    public void setExternalAudience(@javax.annotation.Nullable final ExternalAudienceScope value) {
        this._externalAudience = value;
    }
    /**
     * Sets the externalReplyMessage property value. The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
     * @param value Value to set for the externalReplyMessage property.
     * @return a void
     */
    public void setExternalReplyMessage(@javax.annotation.Nullable final String value) {
        this._externalReplyMessage = value;
    }
    /**
     * Sets the internalReplyMessage property value. The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.
     * @param value Value to set for the internalReplyMessage property.
     * @return a void
     */
    public void setInternalReplyMessage(@javax.annotation.Nullable final String value) {
        this._internalReplyMessage = value;
    }
    /**
     * Sets the scheduledEndDateTime property value. The date and time that automatic replies are set to end, if Status is set to Scheduled.
     * @param value Value to set for the scheduledEndDateTime property.
     * @return a void
     */
    public void setScheduledEndDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._scheduledEndDateTime = value;
    }
    /**
     * Sets the scheduledStartDateTime property value. The date and time that automatic replies are set to begin, if Status is set to Scheduled.
     * @param value Value to set for the scheduledStartDateTime property.
     * @return a void
     */
    public void setScheduledStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._scheduledStartDateTime = value;
    }
    /**
     * Sets the status property value. Configurations status for automatic replies. Possible values are: disabled, alwaysEnabled, scheduled.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AutomaticRepliesStatus value) {
        this._status = value;
    }
}
