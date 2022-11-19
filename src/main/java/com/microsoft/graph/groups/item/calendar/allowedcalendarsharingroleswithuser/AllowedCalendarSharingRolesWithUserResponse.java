package com.microsoft.graph.groups.item.calendar.allowedcalendarsharingroleswithuser;

import com.microsoft.graph.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.models.CalendarRoleType;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the allowedCalendarSharingRoles method. */
public class AllowedCalendarSharingRolesWithUserResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /** The value property */
    private java.util.List<CalendarRoleType> _value;
    /**
     * Instantiates a new allowedCalendarSharingRolesWithUserResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AllowedCalendarSharingRolesWithUserResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a allowedCalendarSharingRolesWithUserResponse
     */
    @javax.annotation.Nonnull
    public static AllowedCalendarSharingRolesWithUserResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllowedCalendarSharingRolesWithUserResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AllowedCalendarSharingRolesWithUserResponse currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { currentObject.setValue(n.getCollectionOfEnumValues(CalendarRoleType.class)); });
        return deserializerMap
    }
    /**
     * Gets the value property value. The value property
     * @return a calendarRoleType
     */
    @javax.annotation.Nullable
    public java.util.List<CalendarRoleType> getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final java.util.List<CalendarRoleType> value) {
        this._value = value;
    }
}
