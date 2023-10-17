package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomaticRepliesSetting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
     */
    private ExternalAudienceScope externalAudience;
    /**
     * The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
     */
    private String externalReplyMessage;
    /**
     * The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.
     */
    private String internalReplyMessage;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The date and time that automatic replies are set to end, if Status is set to Scheduled.
     */
    private DateTimeTimeZone scheduledEndDateTime;
    /**
     * The date and time that automatic replies are set to begin, if Status is set to Scheduled.
     */
    private DateTimeTimeZone scheduledStartDateTime;
    /**
     * Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
     */
    private AutomaticRepliesStatus status;
    /**
     * Instantiates a new AutomaticRepliesSetting and sets the default values.
     */
    public AutomaticRepliesSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AutomaticRepliesSetting
     */
    @jakarta.annotation.Nonnull
    public static AutomaticRepliesSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomaticRepliesSetting();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the externalAudience property value. The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
     * @return a ExternalAudienceScope
     */
    @jakarta.annotation.Nullable
    public ExternalAudienceScope getExternalAudience() {
        return this.externalAudience;
    }
    /**
     * Gets the externalReplyMessage property value. The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalReplyMessage() {
        return this.externalReplyMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("externalAudience", (n) -> { this.setExternalAudience(n.getEnumValue(ExternalAudienceScope.class)); });
        deserializerMap.put("externalReplyMessage", (n) -> { this.setExternalReplyMessage(n.getStringValue()); });
        deserializerMap.put("internalReplyMessage", (n) -> { this.setInternalReplyMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scheduledEndDateTime", (n) -> { this.setScheduledEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("scheduledStartDateTime", (n) -> { this.setScheduledStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AutomaticRepliesStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the internalReplyMessage property value. The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInternalReplyMessage() {
        return this.internalReplyMessage;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the scheduledEndDateTime property value. The date and time that automatic replies are set to end, if Status is set to Scheduled.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getScheduledEndDateTime() {
        return this.scheduledEndDateTime;
    }
    /**
     * Gets the scheduledStartDateTime property value. The date and time that automatic replies are set to begin, if Status is set to Scheduled.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getScheduledStartDateTime() {
        return this.scheduledStartDateTime;
    }
    /**
     * Gets the status property value. Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
     * @return a AutomaticRepliesStatus
     */
    @jakarta.annotation.Nullable
    public AutomaticRepliesStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("externalAudience", this.getExternalAudience());
        writer.writeStringValue("externalReplyMessage", this.getExternalReplyMessage());
        writer.writeStringValue("internalReplyMessage", this.getInternalReplyMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("scheduledEndDateTime", this.getScheduledEndDateTime());
        writer.writeObjectValue("scheduledStartDateTime", this.getScheduledStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the externalAudience property value. The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
     * @param value Value to set for the externalAudience property.
     */
    public void setExternalAudience(@jakarta.annotation.Nullable final ExternalAudienceScope value) {
        this.externalAudience = value;
    }
    /**
     * Sets the externalReplyMessage property value. The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
     * @param value Value to set for the externalReplyMessage property.
     */
    public void setExternalReplyMessage(@jakarta.annotation.Nullable final String value) {
        this.externalReplyMessage = value;
    }
    /**
     * Sets the internalReplyMessage property value. The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.
     * @param value Value to set for the internalReplyMessage property.
     */
    public void setInternalReplyMessage(@jakarta.annotation.Nullable final String value) {
        this.internalReplyMessage = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scheduledEndDateTime property value. The date and time that automatic replies are set to end, if Status is set to Scheduled.
     * @param value Value to set for the scheduledEndDateTime property.
     */
    public void setScheduledEndDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.scheduledEndDateTime = value;
    }
    /**
     * Sets the scheduledStartDateTime property value. The date and time that automatic replies are set to begin, if Status is set to Scheduled.
     * @param value Value to set for the scheduledStartDateTime property.
     */
    public void setScheduledStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.scheduledStartDateTime = value;
    }
    /**
     * Sets the status property value. Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AutomaticRepliesStatus value) {
        this.status = value;
    }
}
