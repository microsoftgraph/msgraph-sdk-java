package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomaticRepliesMailTips implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The automatic reply message.
     */
    private String message;
    /**
     * The language that the automatic reply message is in.
     */
    private LocaleInfo messageLanguage;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The date and time that automatic replies are set to end.
     */
    private DateTimeTimeZone scheduledEndTime;
    /**
     * The date and time that automatic replies are set to begin.
     */
    private DateTimeTimeZone scheduledStartTime;
    /**
     * Instantiates a new AutomaticRepliesMailTips and sets the default values.
     */
    public AutomaticRepliesMailTips() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AutomaticRepliesMailTips
     */
    @jakarta.annotation.Nonnull
    public static AutomaticRepliesMailTips createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomaticRepliesMailTips();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("messageLanguage", (n) -> { this.setMessageLanguage(n.getObjectValue(LocaleInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scheduledEndTime", (n) -> { this.setScheduledEndTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("scheduledStartTime", (n) -> { this.setScheduledStartTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The automatic reply message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the messageLanguage property value. The language that the automatic reply message is in.
     * @return a LocaleInfo
     */
    @jakarta.annotation.Nullable
    public LocaleInfo getMessageLanguage() {
        return this.messageLanguage;
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
     * Gets the scheduledEndTime property value. The date and time that automatic replies are set to end.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getScheduledEndTime() {
        return this.scheduledEndTime;
    }
    /**
     * Gets the scheduledStartTime property value. The date and time that automatic replies are set to begin.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getScheduledStartTime() {
        return this.scheduledStartTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("messageLanguage", this.getMessageLanguage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("scheduledEndTime", this.getScheduledEndTime());
        writer.writeObjectValue("scheduledStartTime", this.getScheduledStartTime());
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
     * Sets the message property value. The automatic reply message.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the messageLanguage property value. The language that the automatic reply message is in.
     * @param value Value to set for the messageLanguage property.
     */
    public void setMessageLanguage(@jakarta.annotation.Nullable final LocaleInfo value) {
        this.messageLanguage = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scheduledEndTime property value. The date and time that automatic replies are set to end.
     * @param value Value to set for the scheduledEndTime property.
     */
    public void setScheduledEndTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.scheduledEndTime = value;
    }
    /**
     * Sets the scheduledStartTime property value. The date and time that automatic replies are set to begin.
     * @param value Value to set for the scheduledStartTime property.
     */
    public void setScheduledStartTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.scheduledStartTime = value;
    }
}
