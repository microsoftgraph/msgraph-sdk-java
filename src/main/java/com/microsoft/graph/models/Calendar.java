package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Calendar extends Entity implements Parsable {
    /** Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness. */
    private java.util.List<OnlineMeetingProviderType> _allowedOnlineMeetingProviders;
    /** The permissions of the users with whom the calendar is shared. */
    private java.util.List<CalendarPermission> _calendarPermissions;
    /** The calendar view for the calendar. Navigation property. Read-only. */
    private java.util.List<Event> _calendarView;
    /** true if the user can write to the calendar, false otherwise. This property is true for the user who created the calendar. This property is also true for a user who has been shared a calendar and granted write access. */
    private Boolean _canEdit;
    /** true if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can share it. */
    private Boolean _canShare;
    /** true if the user can read calendar items that have been marked private, false otherwise. */
    private Boolean _canViewPrivateItems;
    /** Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only. */
    private String _changeKey;
    /** Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: auto, lightBlue, lightGreen, lightOrange, lightGray, lightYellow, lightTeal, lightPink, lightBrown, lightRed, maxColor. */
    private CalendarColor _color;
    /** The default online meeting provider for meetings sent from this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness. */
    private OnlineMeetingProviderType _defaultOnlineMeetingProvider;
    /** The events in the calendar. Navigation property. Read-only. */
    private java.util.List<Event> _events;
    /** The calendar color, expressed in a hex color code of three hexadecimal values, each ranging from 00 to FF and representing the red, green, or blue components of the color in the RGB color space. If the user has never explicitly set a color for the calendar, this property is empty. Read-only. */
    private String _hexColor;
    /** true if this is the default calendar where new events are created by default, false otherwise. */
    private Boolean _isDefaultCalendar;
    /** Indicates whether this user calendar can be deleted from the user mailbox. */
    private Boolean _isRemovable;
    /** Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses. */
    private Boolean _isTallyingResponses;
    /** The collection of multi-value extended properties defined for the calendar. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> _multiValueExtendedProperties;
    /** The calendar name. */
    private String _name;
    /** If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who shared that calendar with the user. */
    private EmailAddress _owner;
    /** The collection of single-value extended properties defined for the calendar. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> _singleValueExtendedProperties;
    /**
     * Instantiates a new calendar and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Calendar() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a calendar
     */
    @javax.annotation.Nonnull
    public static Calendar createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Calendar();
    }
    /**
     * Gets the allowedOnlineMeetingProviders property value. Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     * @return a onlineMeetingProviderType
     */
    @javax.annotation.Nullable
    public java.util.List<OnlineMeetingProviderType> getAllowedOnlineMeetingProviders() {
        return this._allowedOnlineMeetingProviders;
    }
    /**
     * Gets the calendarPermissions property value. The permissions of the users with whom the calendar is shared.
     * @return a calendarPermission
     */
    @javax.annotation.Nullable
    public java.util.List<CalendarPermission> getCalendarPermissions() {
        return this._calendarPermissions;
    }
    /**
     * Gets the calendarView property value. The calendar view for the calendar. Navigation property. Read-only.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getCalendarView() {
        return this._calendarView;
    }
    /**
     * Gets the canEdit property value. true if the user can write to the calendar, false otherwise. This property is true for the user who created the calendar. This property is also true for a user who has been shared a calendar and granted write access.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCanEdit() {
        return this._canEdit;
    }
    /**
     * Gets the canShare property value. true if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can share it.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCanShare() {
        return this._canShare;
    }
    /**
     * Gets the canViewPrivateItems property value. true if the user can read calendar items that have been marked private, false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCanViewPrivateItems() {
        return this._canViewPrivateItems;
    }
    /**
     * Gets the changeKey property value. Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeKey() {
        return this._changeKey;
    }
    /**
     * Gets the color property value. Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: auto, lightBlue, lightGreen, lightOrange, lightGray, lightYellow, lightTeal, lightPink, lightBrown, lightRed, maxColor.
     * @return a calendarColor
     */
    @javax.annotation.Nullable
    public CalendarColor getColor() {
        return this._color;
    }
    /**
     * Gets the defaultOnlineMeetingProvider property value. The default online meeting provider for meetings sent from this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     * @return a onlineMeetingProviderType
     */
    @javax.annotation.Nullable
    public OnlineMeetingProviderType getDefaultOnlineMeetingProvider() {
        return this._defaultOnlineMeetingProvider;
    }
    /**
     * Gets the events property value. The events in the calendar. Navigation property. Read-only.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getEvents() {
        return this._events;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Calendar currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedOnlineMeetingProviders", (n) -> { currentObject.setAllowedOnlineMeetingProviders(n.getCollectionOfEnumValues(OnlineMeetingProviderType.class)); });
            this.put("calendarPermissions", (n) -> { currentObject.setCalendarPermissions(n.getCollectionOfObjectValues(CalendarPermission::createFromDiscriminatorValue)); });
            this.put("calendarView", (n) -> { currentObject.setCalendarView(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
            this.put("canEdit", (n) -> { currentObject.setCanEdit(n.getBooleanValue()); });
            this.put("canShare", (n) -> { currentObject.setCanShare(n.getBooleanValue()); });
            this.put("canViewPrivateItems", (n) -> { currentObject.setCanViewPrivateItems(n.getBooleanValue()); });
            this.put("changeKey", (n) -> { currentObject.setChangeKey(n.getStringValue()); });
            this.put("color", (n) -> { currentObject.setColor(n.getEnumValue(CalendarColor.class)); });
            this.put("defaultOnlineMeetingProvider", (n) -> { currentObject.setDefaultOnlineMeetingProvider(n.getEnumValue(OnlineMeetingProviderType.class)); });
            this.put("events", (n) -> { currentObject.setEvents(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
            this.put("hexColor", (n) -> { currentObject.setHexColor(n.getStringValue()); });
            this.put("isDefaultCalendar", (n) -> { currentObject.setIsDefaultCalendar(n.getBooleanValue()); });
            this.put("isRemovable", (n) -> { currentObject.setIsRemovable(n.getBooleanValue()); });
            this.put("isTallyingResponses", (n) -> { currentObject.setIsTallyingResponses(n.getBooleanValue()); });
            this.put("multiValueExtendedProperties", (n) -> { currentObject.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("owner", (n) -> { currentObject.setOwner(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
            this.put("singleValueExtendedProperties", (n) -> { currentObject.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hexColor property value. The calendar color, expressed in a hex color code of three hexadecimal values, each ranging from 00 to FF and representing the red, green, or blue components of the color in the RGB color space. If the user has never explicitly set a color for the calendar, this property is empty. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHexColor() {
        return this._hexColor;
    }
    /**
     * Gets the isDefaultCalendar property value. true if this is the default calendar where new events are created by default, false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultCalendar() {
        return this._isDefaultCalendar;
    }
    /**
     * Gets the isRemovable property value. Indicates whether this user calendar can be deleted from the user mailbox.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRemovable() {
        return this._isRemovable;
    }
    /**
     * Gets the isTallyingResponses property value. Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTallyingResponses() {
        return this._isTallyingResponses;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this._multiValueExtendedProperties;
    }
    /**
     * Gets the name property value. The calendar name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the owner property value. If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who shared that calendar with the user.
     * @return a emailAddress
     */
    @javax.annotation.Nullable
    public EmailAddress getOwner() {
        return this._owner;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this._singleValueExtendedProperties;
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
        writer.writeCollectionOfEnumValues("allowedOnlineMeetingProviders", this.getAllowedOnlineMeetingProviders());
        writer.writeCollectionOfObjectValues("calendarPermissions", this.getCalendarPermissions());
        writer.writeCollectionOfObjectValues("calendarView", this.getCalendarView());
        writer.writeBooleanValue("canEdit", this.getCanEdit());
        writer.writeBooleanValue("canShare", this.getCanShare());
        writer.writeBooleanValue("canViewPrivateItems", this.getCanViewPrivateItems());
        writer.writeStringValue("changeKey", this.getChangeKey());
        writer.writeEnumValue("color", this.getColor());
        writer.writeEnumValue("defaultOnlineMeetingProvider", this.getDefaultOnlineMeetingProvider());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeStringValue("hexColor", this.getHexColor());
        writer.writeBooleanValue("isDefaultCalendar", this.getIsDefaultCalendar());
        writer.writeBooleanValue("isRemovable", this.getIsRemovable());
        writer.writeBooleanValue("isTallyingResponses", this.getIsTallyingResponses());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("owner", this.getOwner());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
    }
    /**
     * Sets the allowedOnlineMeetingProviders property value. Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     * @param value Value to set for the allowedOnlineMeetingProviders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedOnlineMeetingProviders(@javax.annotation.Nullable final java.util.List<OnlineMeetingProviderType> value) {
        this._allowedOnlineMeetingProviders = value;
    }
    /**
     * Sets the calendarPermissions property value. The permissions of the users with whom the calendar is shared.
     * @param value Value to set for the calendarPermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendarPermissions(@javax.annotation.Nullable final java.util.List<CalendarPermission> value) {
        this._calendarPermissions = value;
    }
    /**
     * Sets the calendarView property value. The calendar view for the calendar. Navigation property. Read-only.
     * @param value Value to set for the calendarView property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendarView(@javax.annotation.Nullable final java.util.List<Event> value) {
        this._calendarView = value;
    }
    /**
     * Sets the canEdit property value. true if the user can write to the calendar, false otherwise. This property is true for the user who created the calendar. This property is also true for a user who has been shared a calendar and granted write access.
     * @param value Value to set for the canEdit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCanEdit(@javax.annotation.Nullable final Boolean value) {
        this._canEdit = value;
    }
    /**
     * Sets the canShare property value. true if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can share it.
     * @param value Value to set for the canShare property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCanShare(@javax.annotation.Nullable final Boolean value) {
        this._canShare = value;
    }
    /**
     * Sets the canViewPrivateItems property value. true if the user can read calendar items that have been marked private, false otherwise.
     * @param value Value to set for the canViewPrivateItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCanViewPrivateItems(@javax.annotation.Nullable final Boolean value) {
        this._canViewPrivateItems = value;
    }
    /**
     * Sets the changeKey property value. Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * @param value Value to set for the changeKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangeKey(@javax.annotation.Nullable final String value) {
        this._changeKey = value;
    }
    /**
     * Sets the color property value. Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: auto, lightBlue, lightGreen, lightOrange, lightGray, lightYellow, lightTeal, lightPink, lightBrown, lightRed, maxColor.
     * @param value Value to set for the color property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColor(@javax.annotation.Nullable final CalendarColor value) {
        this._color = value;
    }
    /**
     * Sets the defaultOnlineMeetingProvider property value. The default online meeting provider for meetings sent from this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     * @param value Value to set for the defaultOnlineMeetingProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultOnlineMeetingProvider(@javax.annotation.Nullable final OnlineMeetingProviderType value) {
        this._defaultOnlineMeetingProvider = value;
    }
    /**
     * Sets the events property value. The events in the calendar. Navigation property. Read-only.
     * @param value Value to set for the events property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvents(@javax.annotation.Nullable final java.util.List<Event> value) {
        this._events = value;
    }
    /**
     * Sets the hexColor property value. The calendar color, expressed in a hex color code of three hexadecimal values, each ranging from 00 to FF and representing the red, green, or blue components of the color in the RGB color space. If the user has never explicitly set a color for the calendar, this property is empty. Read-only.
     * @param value Value to set for the hexColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHexColor(@javax.annotation.Nullable final String value) {
        this._hexColor = value;
    }
    /**
     * Sets the isDefaultCalendar property value. true if this is the default calendar where new events are created by default, false otherwise.
     * @param value Value to set for the isDefaultCalendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultCalendar(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultCalendar = value;
    }
    /**
     * Sets the isRemovable property value. Indicates whether this user calendar can be deleted from the user mailbox.
     * @param value Value to set for the isRemovable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRemovable(@javax.annotation.Nullable final Boolean value) {
        this._isRemovable = value;
    }
    /**
     * Sets the isTallyingResponses property value. Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     * @param value Value to set for the isTallyingResponses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsTallyingResponses(@javax.annotation.Nullable final Boolean value) {
        this._isTallyingResponses = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this._multiValueExtendedProperties = value;
    }
    /**
     * Sets the name property value. The calendar name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the owner property value. If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who shared that calendar with the user.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final EmailAddress value) {
        this._owner = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this._singleValueExtendedProperties = value;
    }
}
