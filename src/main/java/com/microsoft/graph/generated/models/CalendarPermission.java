package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CalendarPermission extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CalendarPermission} and sets the default values.
     */
    public CalendarPermission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CalendarPermission}
     */
    @jakarta.annotation.Nonnull
    public static CalendarPermission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalendarPermission();
    }
    /**
     * Gets the allowedRoles property value. List of allowed sharing or delegating permission levels for the calendar. Possible values are: none, freeBusyRead, limitedRead, read, write, delegateWithoutPrivateEventAccess, delegateWithPrivateEventAccess, custom.
     * @return a {@link java.util.List<CalendarRoleType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CalendarRoleType> getAllowedRoles() {
        return this.backingStore.get("allowedRoles");
    }
    /**
     * Gets the emailAddress property value. Represents a share recipient or delegate who has access to the calendar. For the &apos;My Organization&apos; share recipient, the address property is null. Read-only.
     * @return a {@link EmailAddress}
     */
    @jakarta.annotation.Nullable
    public EmailAddress getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedRoles", (n) -> { this.setAllowedRoles(n.getCollectionOfEnumValues(CalendarRoleType::forValue)); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getObjectValue(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("isInsideOrganization", (n) -> { this.setIsInsideOrganization(n.getBooleanValue()); });
        deserializerMap.put("isRemovable", (n) -> { this.setIsRemovable(n.getBooleanValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(CalendarRoleType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isInsideOrganization property value. True if the user in context (recipient or delegate) is inside the same organization as the calendar owner.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInsideOrganization() {
        return this.backingStore.get("isInsideOrganization");
    }
    /**
     * Gets the isRemovable property value. True if the user can be removed from the list of recipients or delegates for the specified calendar, false otherwise. The &apos;My organization&apos; user determines the permissions other people within your organization have to the given calendar. You can&apos;t remove &apos;My organization&apos; as a share recipient to a calendar.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRemovable() {
        return this.backingStore.get("isRemovable");
    }
    /**
     * Gets the role property value. Current permission level of the calendar share recipient or delegate.
     * @return a {@link CalendarRoleType}
     */
    @jakarta.annotation.Nullable
    public CalendarRoleType getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAllowedRoles(@jakarta.annotation.Nullable final java.util.List<CalendarRoleType> value) {
        this.backingStore.set("allowedRoles", value);
    }
    /**
     * Sets the emailAddress property value. Represents a share recipient or delegate who has access to the calendar. For the &apos;My Organization&apos; share recipient, the address property is null. Read-only.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final EmailAddress value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the isInsideOrganization property value. True if the user in context (recipient or delegate) is inside the same organization as the calendar owner.
     * @param value Value to set for the isInsideOrganization property.
     */
    public void setIsInsideOrganization(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInsideOrganization", value);
    }
    /**
     * Sets the isRemovable property value. True if the user can be removed from the list of recipients or delegates for the specified calendar, false otherwise. The &apos;My organization&apos; user determines the permissions other people within your organization have to the given calendar. You can&apos;t remove &apos;My organization&apos; as a share recipient to a calendar.
     * @param value Value to set for the isRemovable property.
     */
    public void setIsRemovable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRemovable", value);
    }
    /**
     * Sets the role property value. Current permission level of the calendar share recipient or delegate.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final CalendarRoleType value) {
        this.backingStore.set("role", value);
    }
}
