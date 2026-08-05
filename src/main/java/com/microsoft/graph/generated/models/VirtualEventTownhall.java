package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventTownhall extends VirtualEvent implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventTownhall} and sets the default values.
     */
    public VirtualEventTownhall() {
        super();
        this.setOdataType("#microsoft.graph.virtualEventTownhall");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventTownhall}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventTownhall createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventTownhall();
    }
    /**
     * Gets the audience property value. The audience to whom the town hall is visible. The possible values are: everyone, organization, and unknownFutureValue.
     * @return a {@link MeetingAudience}
     */
    @jakarta.annotation.Nullable
    public MeetingAudience getAudience() {
        return this.backingStore.get("audience");
    }
    /**
     * Gets the capacity property value. Represents the expected number of attendees for the town hall.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCapacity() {
        return this.backingStore.get("capacity");
    }
    /**
     * Gets the coOrganizers property value. Identity information of the coorganizers of the town hall.
     * @return a {@link java.util.List<CommunicationsUserIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CommunicationsUserIdentity> getCoOrganizers() {
        return this.backingStore.get("coOrganizers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getEnumValue(MeetingAudience::forValue)); });
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("coOrganizers", (n) -> { this.setCoOrganizers(n.getCollectionOfObjectValues(CommunicationsUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("invitedAttendees", (n) -> { this.setInvitedAttendees(n.getCollectionOfObjectValues(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("isInviteOnly", (n) -> { this.setIsInviteOnly(n.getBooleanValue()); });
        deserializerMap.put("registrationConfiguration", (n) -> { this.setRegistrationConfiguration(n.getObjectValue(VirtualEventTownhallRegistrationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("registrations", (n) -> { this.setRegistrations(n.getCollectionOfObjectValues(VirtualEventRegistration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the invitedAttendees property value. The attendees invited to the town hall. The supported identities are: communicationsUserIdentity and communicationsGuestIdentity.
     * @return a {@link java.util.List<Identity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Identity> getInvitedAttendees() {
        return this.backingStore.get("invitedAttendees");
    }
    /**
     * Gets the isInviteOnly property value. Indicates whether the town hall is only open to invited people and groups within your organization. The isInviteOnly property can only be true if the value of the audience property is set to organization.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInviteOnly() {
        return this.backingStore.get("isInviteOnly");
    }
    /**
     * Gets the registrationConfiguration property value. Registration configuration of the town hall.
     * @return a {@link VirtualEventTownhallRegistrationConfiguration}
     */
    @jakarta.annotation.Nullable
    public VirtualEventTownhallRegistrationConfiguration getRegistrationConfiguration() {
        return this.backingStore.get("registrationConfiguration");
    }
    /**
     * Gets the registrations property value. Registration records of the town hall.
     * @return a {@link java.util.List<VirtualEventRegistration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistration> getRegistrations() {
        return this.backingStore.get("registrations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("audience", this.getAudience());
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeCollectionOfObjectValues("coOrganizers", this.getCoOrganizers());
        writer.writeCollectionOfObjectValues("invitedAttendees", this.getInvitedAttendees());
        writer.writeBooleanValue("isInviteOnly", this.getIsInviteOnly());
        writer.writeObjectValue("registrationConfiguration", this.getRegistrationConfiguration());
        writer.writeCollectionOfObjectValues("registrations", this.getRegistrations());
    }
    /**
     * Sets the audience property value. The audience to whom the town hall is visible. The possible values are: everyone, organization, and unknownFutureValue.
     * @param value Value to set for the audience property.
     */
    public void setAudience(@jakarta.annotation.Nullable final MeetingAudience value) {
        this.backingStore.set("audience", value);
    }
    /**
     * Sets the capacity property value. Represents the expected number of attendees for the town hall.
     * @param value Value to set for the capacity property.
     */
    public void setCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("capacity", value);
    }
    /**
     * Sets the coOrganizers property value. Identity information of the coorganizers of the town hall.
     * @param value Value to set for the coOrganizers property.
     */
    public void setCoOrganizers(@jakarta.annotation.Nullable final java.util.List<CommunicationsUserIdentity> value) {
        this.backingStore.set("coOrganizers", value);
    }
    /**
     * Sets the invitedAttendees property value. The attendees invited to the town hall. The supported identities are: communicationsUserIdentity and communicationsGuestIdentity.
     * @param value Value to set for the invitedAttendees property.
     */
    public void setInvitedAttendees(@jakarta.annotation.Nullable final java.util.List<Identity> value) {
        this.backingStore.set("invitedAttendees", value);
    }
    /**
     * Sets the isInviteOnly property value. Indicates whether the town hall is only open to invited people and groups within your organization. The isInviteOnly property can only be true if the value of the audience property is set to organization.
     * @param value Value to set for the isInviteOnly property.
     */
    public void setIsInviteOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInviteOnly", value);
    }
    /**
     * Sets the registrationConfiguration property value. Registration configuration of the town hall.
     * @param value Value to set for the registrationConfiguration property.
     */
    public void setRegistrationConfiguration(@jakarta.annotation.Nullable final VirtualEventTownhallRegistrationConfiguration value) {
        this.backingStore.set("registrationConfiguration", value);
    }
    /**
     * Sets the registrations property value. Registration records of the town hall.
     * @param value Value to set for the registrations property.
     */
    public void setRegistrations(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistration> value) {
        this.backingStore.set("registrations", value);
    }
}
