package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CalendarGroup extends Entity implements Parsable {
    /** The calendars in the calendar group. Navigation property. Read-only. Nullable. */
    private java.util.List<Calendar> _calendars;
    /** Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only. */
    private String _changeKey;
    /** The class identifier. Read-only. */
    private String _classId;
    /** The group name. */
    private String _name;
    /**
     * Instantiates a new calendarGroup and sets the default values.
     * @return a void
     */
    public CalendarGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a calendarGroup
     */
    @javax.annotation.Nonnull
    public static CalendarGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalendarGroup();
    }
    /**
     * Gets the calendars property value. The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * @return a calendar
     */
    @javax.annotation.Nullable
    public java.util.List<Calendar> getCalendars() {
        return this._calendars;
    }
    /**
     * Gets the changeKey property value. Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeKey() {
        return this._changeKey;
    }
    /**
     * Gets the classId property value. The class identifier. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassId() {
        return this._classId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CalendarGroup currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("calendars", (n) -> { currentObject.setCalendars(n.getCollectionOfObjectValues(Calendar::createFromDiscriminatorValue)); });
            this.put("changeKey", (n) -> { currentObject.setChangeKey(n.getStringValue()); });
            this.put("classId", (n) -> { currentObject.setClassId(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. The group name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("calendars", this.getCalendars());
        writer.writeStringValue("changeKey", this.getChangeKey());
        writer.writeStringValue("classId", this.getClassId());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the calendars property value. The calendars in the calendar group. Navigation property. Read-only. Nullable.
     * @param value Value to set for the calendars property.
     * @return a void
     */
    public void setCalendars(@javax.annotation.Nullable final java.util.List<Calendar> value) {
        this._calendars = value;
    }
    /**
     * Sets the changeKey property value. Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * @param value Value to set for the changeKey property.
     * @return a void
     */
    public void setChangeKey(@javax.annotation.Nullable final String value) {
        this._changeKey = value;
    }
    /**
     * Sets the classId property value. The class identifier. Read-only.
     * @param value Value to set for the classId property.
     * @return a void
     */
    public void setClassId(@javax.annotation.Nullable final String value) {
        this._classId = value;
    }
    /**
     * Sets the name property value. The group name.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
}
