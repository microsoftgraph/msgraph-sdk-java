package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Calendar extends Entity implements Parsable {
    /**
     * Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     */
    private java.util.List<OnlineMeetingProviderType> allowedOnlineMeetingProviders;
    /**
     * The permissions of the users with whom the calendar is shared.
     */
    private java.util.List<CalendarPermission> calendarPermissions;
    /**
     * The calendar view for the calendar. Navigation property. Read-only.
     */
    private java.util.List<Event> calendarView;
    /**
     * true if the user can write to the calendar, false otherwise. This property is true for the user who created the calendar. This property is also true for a user who has been shared a calendar and granted write access.
     */
    private Boolean canEdit;
    /**
     * true if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can share it.
     */
    private Boolean canShare;
    /**
     * true if the user can read calendar items that have been marked private, false otherwise.
     */
    private Boolean canViewPrivateItems;
    /**
     * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     */
    private String changeKey;
    /**
     * Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: auto, lightBlue, lightGreen, lightOrange, lightGray, lightYellow, lightTeal, lightPink, lightBrown, lightRed, maxColor.
     */
    private CalendarColor color;
    /**
     * The default online meeting provider for meetings sent from this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     */
    private OnlineMeetingProviderType defaultOnlineMeetingProvider;
    /**
     * The events in the calendar. Navigation property. Read-only.
     */
    private java.util.List<Event> events;
    /**
     * The calendar color, expressed in a hex color code of three hexadecimal values, each ranging from 00 to FF and representing the red, green, or blue components of the color in the RGB color space. If the user has never explicitly set a color for the calendar, this property is empty. Read-only.
     */
    private String hexColor;
    /**
     * true if this is the default calendar where new events are created by default, false otherwise.
     */
    private Boolean isDefaultCalendar;
    /**
     * Indicates whether this user calendar can be deleted from the user mailbox.
     */
    private Boolean isRemovable;
    /**
     * Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     */
    private Boolean isTallyingResponses;
    /**
     * The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
     */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /**
     * The calendar name.
     */
    private String name;
    /**
     * If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who shared that calendar with the user.
     */
    private EmailAddress owner;
    /**
     * The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
     */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * Instantiates a new Calendar and sets the default values.
     */
    public Calendar() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Calendar
     */
    @jakarta.annotation.Nonnull
    public static Calendar createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Calendar();
    }
    /**
     * Gets the allowedOnlineMeetingProviders property value. Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     * @return a java.util.List<OnlineMeetingProviderType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnlineMeetingProviderType> getAllowedOnlineMeetingProviders() {
        return this.allowedOnlineMeetingProviders;
    }
    /**
     * Gets the calendarPermissions property value. The permissions of the users with whom the calendar is shared.
     * @return a java.util.List<CalendarPermission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CalendarPermission> getCalendarPermissions() {
        return this.calendarPermissions;
    }
    /**
     * Gets the calendarView property value. The calendar view for the calendar. Navigation property. Read-only.
     * @return a java.util.List<Event>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Event> getCalendarView() {
        return this.calendarView;
    }
    /**
     * Gets the canEdit property value. true if the user can write to the calendar, false otherwise. This property is true for the user who created the calendar. This property is also true for a user who has been shared a calendar and granted write access.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCanEdit() {
        return this.canEdit;
    }
    /**
     * Gets the canShare property value. true if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can share it.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCanShare() {
        return this.canShare;
    }
    /**
     * Gets the canViewPrivateItems property value. true if the user can read calendar items that have been marked private, false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCanViewPrivateItems() {
        return this.canViewPrivateItems;
    }
    /**
     * Gets the changeKey property value. Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getChangeKey() {
        return this.changeKey;
    }
    /**
     * Gets the color property value. Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: auto, lightBlue, lightGreen, lightOrange, lightGray, lightYellow, lightTeal, lightPink, lightBrown, lightRed, maxColor.
     * @return a CalendarColor
     */
    @jakarta.annotation.Nullable
    public CalendarColor getColor() {
        return this.color;
    }
    /**
     * Gets the defaultOnlineMeetingProvider property value. The default online meeting provider for meetings sent from this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     * @return a OnlineMeetingProviderType
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingProviderType getDefaultOnlineMeetingProvider() {
        return this.defaultOnlineMeetingProvider;
    }
    /**
     * Gets the events property value. The events in the calendar. Navigation property. Read-only.
     * @return a java.util.List<Event>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Event> getEvents() {
        return this.events;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedOnlineMeetingProviders", (n) -> { this.setAllowedOnlineMeetingProviders(n.getCollectionOfEnumValues(OnlineMeetingProviderType.class)); });
        deserializerMap.put("calendarPermissions", (n) -> { this.setCalendarPermissions(n.getCollectionOfObjectValues(CalendarPermission::createFromDiscriminatorValue)); });
        deserializerMap.put("calendarView", (n) -> { this.setCalendarView(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("canEdit", (n) -> { this.setCanEdit(n.getBooleanValue()); });
        deserializerMap.put("canShare", (n) -> { this.setCanShare(n.getBooleanValue()); });
        deserializerMap.put("canViewPrivateItems", (n) -> { this.setCanViewPrivateItems(n.getBooleanValue()); });
        deserializerMap.put("changeKey", (n) -> { this.setChangeKey(n.getStringValue()); });
        deserializerMap.put("color", (n) -> { this.setColor(n.getEnumValue(CalendarColor.class)); });
        deserializerMap.put("defaultOnlineMeetingProvider", (n) -> { this.setDefaultOnlineMeetingProvider(n.getEnumValue(OnlineMeetingProviderType.class)); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("hexColor", (n) -> { this.setHexColor(n.getStringValue()); });
        deserializerMap.put("isDefaultCalendar", (n) -> { this.setIsDefaultCalendar(n.getBooleanValue()); });
        deserializerMap.put("isRemovable", (n) -> { this.setIsRemovable(n.getBooleanValue()); });
        deserializerMap.put("isTallyingResponses", (n) -> { this.setIsTallyingResponses(n.getBooleanValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hexColor property value. The calendar color, expressed in a hex color code of three hexadecimal values, each ranging from 00 to FF and representing the red, green, or blue components of the color in the RGB color space. If the user has never explicitly set a color for the calendar, this property is empty. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHexColor() {
        return this.hexColor;
    }
    /**
     * Gets the isDefaultCalendar property value. true if this is the default calendar where new events are created by default, false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultCalendar() {
        return this.isDefaultCalendar;
    }
    /**
     * Gets the isRemovable property value. Indicates whether this user calendar can be deleted from the user mailbox.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRemovable() {
        return this.isRemovable;
    }
    /**
     * Gets the isTallyingResponses property value. Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTallyingResponses() {
        return this.isTallyingResponses;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
     * @return a java.util.List<MultiValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the name property value. The calendar name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the owner property value. If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who shared that calendar with the user.
     * @return a EmailAddress
     */
    @jakarta.annotation.Nullable
    public EmailAddress getOwner() {
        return this.owner;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
     * @return a java.util.List<SingleValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAllowedOnlineMeetingProviders(@jakarta.annotation.Nullable final java.util.List<OnlineMeetingProviderType> value) {
        this.allowedOnlineMeetingProviders = value;
    }
    /**
     * Sets the calendarPermissions property value. The permissions of the users with whom the calendar is shared.
     * @param value Value to set for the calendarPermissions property.
     */
    public void setCalendarPermissions(@jakarta.annotation.Nullable final java.util.List<CalendarPermission> value) {
        this.calendarPermissions = value;
    }
    /**
     * Sets the calendarView property value. The calendar view for the calendar. Navigation property. Read-only.
     * @param value Value to set for the calendarView property.
     */
    public void setCalendarView(@jakarta.annotation.Nullable final java.util.List<Event> value) {
        this.calendarView = value;
    }
    /**
     * Sets the canEdit property value. true if the user can write to the calendar, false otherwise. This property is true for the user who created the calendar. This property is also true for a user who has been shared a calendar and granted write access.
     * @param value Value to set for the canEdit property.
     */
    public void setCanEdit(@jakarta.annotation.Nullable final Boolean value) {
        this.canEdit = value;
    }
    /**
     * Sets the canShare property value. true if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can share it.
     * @param value Value to set for the canShare property.
     */
    public void setCanShare(@jakarta.annotation.Nullable final Boolean value) {
        this.canShare = value;
    }
    /**
     * Sets the canViewPrivateItems property value. true if the user can read calendar items that have been marked private, false otherwise.
     * @param value Value to set for the canViewPrivateItems property.
     */
    public void setCanViewPrivateItems(@jakarta.annotation.Nullable final Boolean value) {
        this.canViewPrivateItems = value;
    }
    /**
     * Sets the changeKey property value. Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     * @param value Value to set for the changeKey property.
     */
    public void setChangeKey(@jakarta.annotation.Nullable final String value) {
        this.changeKey = value;
    }
    /**
     * Sets the color property value. Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: auto, lightBlue, lightGreen, lightOrange, lightGray, lightYellow, lightTeal, lightPink, lightBrown, lightRed, maxColor.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final CalendarColor value) {
        this.color = value;
    }
    /**
     * Sets the defaultOnlineMeetingProvider property value. The default online meeting provider for meetings sent from this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     * @param value Value to set for the defaultOnlineMeetingProvider property.
     */
    public void setDefaultOnlineMeetingProvider(@jakarta.annotation.Nullable final OnlineMeetingProviderType value) {
        this.defaultOnlineMeetingProvider = value;
    }
    /**
     * Sets the events property value. The events in the calendar. Navigation property. Read-only.
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<Event> value) {
        this.events = value;
    }
    /**
     * Sets the hexColor property value. The calendar color, expressed in a hex color code of three hexadecimal values, each ranging from 00 to FF and representing the red, green, or blue components of the color in the RGB color space. If the user has never explicitly set a color for the calendar, this property is empty. Read-only.
     * @param value Value to set for the hexColor property.
     */
    public void setHexColor(@jakarta.annotation.Nullable final String value) {
        this.hexColor = value;
    }
    /**
     * Sets the isDefaultCalendar property value. true if this is the default calendar where new events are created by default, false otherwise.
     * @param value Value to set for the isDefaultCalendar property.
     */
    public void setIsDefaultCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefaultCalendar = value;
    }
    /**
     * Sets the isRemovable property value. Indicates whether this user calendar can be deleted from the user mailbox.
     * @param value Value to set for the isRemovable property.
     */
    public void setIsRemovable(@jakarta.annotation.Nullable final Boolean value) {
        this.isRemovable = value;
    }
    /**
     * Sets the isTallyingResponses property value. Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     * @param value Value to set for the isTallyingResponses property.
     */
    public void setIsTallyingResponses(@jakarta.annotation.Nullable final Boolean value) {
        this.isTallyingResponses = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the name property value. The calendar name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the owner property value. If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who shared that calendar with the user.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final EmailAddress value) {
        this.owner = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
}
