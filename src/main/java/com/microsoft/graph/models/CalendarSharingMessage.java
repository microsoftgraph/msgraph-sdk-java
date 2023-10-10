package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalendarSharingMessage extends Message implements Parsable {
    /**
     * The canAccept property
     */
    private Boolean canAccept;
    /**
     * The sharingMessageAction property
     */
    private CalendarSharingMessageAction sharingMessageAction;
    /**
     * The sharingMessageActions property
     */
    private java.util.List<CalendarSharingMessageAction> sharingMessageActions;
    /**
     * The suggestedCalendarName property
     */
    private String suggestedCalendarName;
    /**
     * Instantiates a new CalendarSharingMessage and sets the default values.
     */
    public CalendarSharingMessage() {
        super();
        this.setOdataType("#microsoft.graph.calendarSharingMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CalendarSharingMessage
     */
    @jakarta.annotation.Nonnull
    public static CalendarSharingMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalendarSharingMessage();
    }
    /**
     * Gets the canAccept property value. The canAccept property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCanAccept() {
        return this.canAccept;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("canAccept", (n) -> { this.setCanAccept(n.getBooleanValue()); });
        deserializerMap.put("sharingMessageAction", (n) -> { this.setSharingMessageAction(n.getObjectValue(CalendarSharingMessageAction::createFromDiscriminatorValue)); });
        deserializerMap.put("sharingMessageActions", (n) -> { this.setSharingMessageActions(n.getCollectionOfObjectValues(CalendarSharingMessageAction::createFromDiscriminatorValue)); });
        deserializerMap.put("suggestedCalendarName", (n) -> { this.setSuggestedCalendarName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sharingMessageAction property value. The sharingMessageAction property
     * @return a CalendarSharingMessageAction
     */
    @jakarta.annotation.Nullable
    public CalendarSharingMessageAction getSharingMessageAction() {
        return this.sharingMessageAction;
    }
    /**
     * Gets the sharingMessageActions property value. The sharingMessageActions property
     * @return a java.util.List<CalendarSharingMessageAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CalendarSharingMessageAction> getSharingMessageActions() {
        return this.sharingMessageActions;
    }
    /**
     * Gets the suggestedCalendarName property value. The suggestedCalendarName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSuggestedCalendarName() {
        return this.suggestedCalendarName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("canAccept", this.getCanAccept());
        writer.writeObjectValue("sharingMessageAction", this.getSharingMessageAction());
        writer.writeCollectionOfObjectValues("sharingMessageActions", this.getSharingMessageActions());
        writer.writeStringValue("suggestedCalendarName", this.getSuggestedCalendarName());
    }
    /**
     * Sets the canAccept property value. The canAccept property
     * @param value Value to set for the canAccept property.
     */
    public void setCanAccept(@jakarta.annotation.Nullable final Boolean value) {
        this.canAccept = value;
    }
    /**
     * Sets the sharingMessageAction property value. The sharingMessageAction property
     * @param value Value to set for the sharingMessageAction property.
     */
    public void setSharingMessageAction(@jakarta.annotation.Nullable final CalendarSharingMessageAction value) {
        this.sharingMessageAction = value;
    }
    /**
     * Sets the sharingMessageActions property value. The sharingMessageActions property
     * @param value Value to set for the sharingMessageActions property.
     */
    public void setSharingMessageActions(@jakarta.annotation.Nullable final java.util.List<CalendarSharingMessageAction> value) {
        this.sharingMessageActions = value;
    }
    /**
     * Sets the suggestedCalendarName property value. The suggestedCalendarName property
     * @param value Value to set for the suggestedCalendarName property.
     */
    public void setSuggestedCalendarName(@jakarta.annotation.Nullable final String value) {
        this.suggestedCalendarName = value;
    }
}
