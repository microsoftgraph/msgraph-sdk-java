package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CalendarSharingMessage extends Message implements Parsable {
    /** The canAccept property */
    private Boolean _canAccept;
    /** The sharingMessageAction property */
    private CalendarSharingMessageAction _sharingMessageAction;
    /** The sharingMessageActions property */
    private java.util.List<CalendarSharingMessageAction> _sharingMessageActions;
    /** The suggestedCalendarName property */
    private String _suggestedCalendarName;
    /**
     * Instantiates a new CalendarSharingMessage and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static CalendarSharingMessage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalendarSharingMessage();
    }
    /**
     * Gets the canAccept property value. The canAccept property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCanAccept() {
        return this._canAccept;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CalendarSharingMessage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("canAccept", (n) -> { currentObject.setCanAccept(n.getBooleanValue()); });
            this.put("sharingMessageAction", (n) -> { currentObject.setSharingMessageAction(n.getObjectValue(CalendarSharingMessageAction::createFromDiscriminatorValue)); });
            this.put("sharingMessageActions", (n) -> { currentObject.setSharingMessageActions(n.getCollectionOfObjectValues(CalendarSharingMessageAction::createFromDiscriminatorValue)); });
            this.put("suggestedCalendarName", (n) -> { currentObject.setSuggestedCalendarName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the sharingMessageAction property value. The sharingMessageAction property
     * @return a calendarSharingMessageAction
     */
    @javax.annotation.Nullable
    public CalendarSharingMessageAction getSharingMessageAction() {
        return this._sharingMessageAction;
    }
    /**
     * Gets the sharingMessageActions property value. The sharingMessageActions property
     * @return a calendarSharingMessageAction
     */
    @javax.annotation.Nullable
    public java.util.List<CalendarSharingMessageAction> getSharingMessageActions() {
        return this._sharingMessageActions;
    }
    /**
     * Gets the suggestedCalendarName property value. The suggestedCalendarName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSuggestedCalendarName() {
        return this._suggestedCalendarName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setCanAccept(@javax.annotation.Nullable final Boolean value) {
        this._canAccept = value;
    }
    /**
     * Sets the sharingMessageAction property value. The sharingMessageAction property
     * @param value Value to set for the sharingMessageAction property.
     * @return a void
     */
    public void setSharingMessageAction(@javax.annotation.Nullable final CalendarSharingMessageAction value) {
        this._sharingMessageAction = value;
    }
    /**
     * Sets the sharingMessageActions property value. The sharingMessageActions property
     * @param value Value to set for the sharingMessageActions property.
     * @return a void
     */
    public void setSharingMessageActions(@javax.annotation.Nullable final java.util.List<CalendarSharingMessageAction> value) {
        this._sharingMessageActions = value;
    }
    /**
     * Sets the suggestedCalendarName property value. The suggestedCalendarName property
     * @param value Value to set for the suggestedCalendarName property.
     * @return a void
     */
    public void setSuggestedCalendarName(@javax.annotation.Nullable final String value) {
        this._suggestedCalendarName = value;
    }
}
