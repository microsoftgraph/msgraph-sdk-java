package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CalendarPermission extends Entity implements Parsable {
    /** List of allowed sharing or delegating permission levels for the calendar. Possible values are: none, freeBusyRead, limitedRead, read, write, delegateWithoutPrivateEventAccess, delegateWithPrivateEventAccess, custom.  */
    private java.util.List<CalendarRoleType> _allowedRoles;
    /** Represents a sharee or delegate who has access to the calendar. For the 'My Organization' sharee, the address property is null. Read-only.  */
    private EmailAddress _emailAddress;
    /** True if the user in context (sharee or delegate) is inside the same organization as the calendar owner.  */
    private Boolean _isInsideOrganization;
    /** True if the user can be removed from the list of sharees or delegates for the specified calendar, false otherwise. The 'My organization' user determines the permissions other people within your organization have to the given calendar. You cannot remove 'My organization' as a sharee to a calendar.  */
    private Boolean _isRemovable;
    /** Current permission level of the calendar sharee or delegate.  */
    private CalendarRoleType _role;
    /**
     * Instantiates a new calendarPermission and sets the default values.
     * @return a void
     */
    public CalendarPermission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a calendarPermission
     */
    @javax.annotation.Nonnull
    public static CalendarPermission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalendarPermission();
    }
    /**
     * Gets the allowedRoles property value. List of allowed sharing or delegating permission levels for the calendar. Possible values are: none, freeBusyRead, limitedRead, read, write, delegateWithoutPrivateEventAccess, delegateWithPrivateEventAccess, custom.
     * @return a calendarRoleType
     */
    @javax.annotation.Nullable
    public java.util.List<CalendarRoleType> getAllowedRoles() {
        return this._allowedRoles;
    }
    /**
     * Gets the emailAddress property value. Represents a sharee or delegate who has access to the calendar. For the 'My Organization' sharee, the address property is null. Read-only.
     * @return a emailAddress
     */
    @javax.annotation.Nullable
    public EmailAddress getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CalendarPermission currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedRoles", (n) -> { currentObject.setAllowedRoles(n.getCollectionOfEnumValues(CalendarRoleType.class)); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
            this.put("isInsideOrganization", (n) -> { currentObject.setIsInsideOrganization(n.getBooleanValue()); });
            this.put("isRemovable", (n) -> { currentObject.setIsRemovable(n.getBooleanValue()); });
            this.put("role", (n) -> { currentObject.setRole(n.getEnumValue(CalendarRoleType.class)); });
        }};
    }
    /**
     * Gets the isInsideOrganization property value. True if the user in context (sharee or delegate) is inside the same organization as the calendar owner.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInsideOrganization() {
        return this._isInsideOrganization;
    }
    /**
     * Gets the isRemovable property value. True if the user can be removed from the list of sharees or delegates for the specified calendar, false otherwise. The 'My organization' user determines the permissions other people within your organization have to the given calendar. You cannot remove 'My organization' as a sharee to a calendar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRemovable() {
        return this._isRemovable;
    }
    /**
     * Gets the role property value. Current permission level of the calendar sharee or delegate.
     * @return a calendarRoleType
     */
    @javax.annotation.Nullable
    public CalendarRoleType getRole() {
        return this._role;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("allowedRoles", this.getAllowedRoles());
        writer.writeObjectValue("emailAddress", this.getEmailAddress());
        writer.writeBooleanValue("isInsideOrganization", this.getIsInsideOrganization());
        writer.writeBooleanValue("isRemovable", this.getIsRemovable());
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the allowedRoles property value. List of allowed sharing or delegating permission levels for the calendar. Possible values are: none, freeBusyRead, limitedRead, read, write, delegateWithoutPrivateEventAccess, delegateWithPrivateEventAccess, custom.
     * @param value Value to set for the allowedRoles property.
     * @return a void
     */
    public void setAllowedRoles(@javax.annotation.Nullable final java.util.List<CalendarRoleType> value) {
        this._allowedRoles = value;
    }
    /**
     * Sets the emailAddress property value. Represents a sharee or delegate who has access to the calendar. For the 'My Organization' sharee, the address property is null. Read-only.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    public void setEmailAddress(@javax.annotation.Nullable final EmailAddress value) {
        this._emailAddress = value;
    }
    /**
     * Sets the isInsideOrganization property value. True if the user in context (sharee or delegate) is inside the same organization as the calendar owner.
     * @param value Value to set for the isInsideOrganization property.
     * @return a void
     */
    public void setIsInsideOrganization(@javax.annotation.Nullable final Boolean value) {
        this._isInsideOrganization = value;
    }
    /**
     * Sets the isRemovable property value. True if the user can be removed from the list of sharees or delegates for the specified calendar, false otherwise. The 'My organization' user determines the permissions other people within your organization have to the given calendar. You cannot remove 'My organization' as a sharee to a calendar.
     * @param value Value to set for the isRemovable property.
     * @return a void
     */
    public void setIsRemovable(@javax.annotation.Nullable final Boolean value) {
        this._isRemovable = value;
    }
    /**
     * Sets the role property value. Current permission level of the calendar sharee or delegate.
     * @param value Value to set for the role property.
     * @return a void
     */
    public void setRole(@javax.annotation.Nullable final CalendarRoleType value) {
        this._role = value;
    }
}
