package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventRegistration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventRegistration} and sets the default values.
     */
    public VirtualEventRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventRegistration}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistration();
    }
    /**
     * Gets the cancelationDateTime property value. Date and time when the registrant cancels their registration for the virtual event. Only appears when applicable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCancelationDateTime() {
        return this.backingStore.get("cancelationDateTime");
    }
    /**
     * Gets the email property value. Email address of the registrant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * Gets the externalRegistrationInformation property value. The external information for a virtual event registration.
     * @return a {@link VirtualEventExternalRegistrationInformation}
     */
    @jakarta.annotation.Nullable
    public VirtualEventExternalRegistrationInformation getExternalRegistrationInformation() {
        return this.backingStore.get("externalRegistrationInformation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cancelationDateTime", (n) -> { this.setCancelationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("externalRegistrationInformation", (n) -> { this.setExternalRegistrationInformation(n.getObjectValue(VirtualEventExternalRegistrationInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("preferredLanguage", (n) -> { this.setPreferredLanguage(n.getStringValue()); });
        deserializerMap.put("preferredTimezone", (n) -> { this.setPreferredTimezone(n.getStringValue()); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("registrationQuestionAnswers", (n) -> { this.setRegistrationQuestionAnswers(n.getCollectionOfObjectValues(VirtualEventRegistrationQuestionAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(VirtualEventSession::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(VirtualEventAttendeeRegistrationStatus::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. First name of the registrant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.backingStore.get("firstName");
    }
    /**
     * Gets the lastName property value. Last name of the registrant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.backingStore.get("lastName");
    }
    /**
     * Gets the preferredLanguage property value. The registrant&apos;s preferred language.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredLanguage() {
        return this.backingStore.get("preferredLanguage");
    }
    /**
     * Gets the preferredTimezone property value. The registrant&apos;s time zone details.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredTimezone() {
        return this.backingStore.get("preferredTimezone");
    }
    /**
     * Gets the registrationDateTime property value. Date and time when the registrant registers for the virtual event. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.backingStore.get("registrationDateTime");
    }
    /**
     * Gets the registrationQuestionAnswers property value. The registrant&apos;s answer to the registration questions.
     * @return a {@link java.util.List<VirtualEventRegistrationQuestionAnswer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistrationQuestionAnswer> getRegistrationQuestionAnswers() {
        return this.backingStore.get("registrationQuestionAnswers");
    }
    /**
     * Gets the sessions property value. Sessions for a registration.
     * @return a {@link java.util.List<VirtualEventSession>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventSession> getSessions() {
        return this.backingStore.get("sessions");
    }
    /**
     * Gets the status property value. Registration status of the registrant. Read-only. Possible values are registered, canceled, waitlisted, pendingApproval, rejectedByOrganizer, and unknownFutureValue.
     * @return a {@link VirtualEventAttendeeRegistrationStatus}
     */
    @jakarta.annotation.Nullable
    public VirtualEventAttendeeRegistrationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userId property value. The registrant&apos;s ID in Microsoft Entra ID. Only appears when the registrant is registered in Microsoft Entra ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("cancelationDateTime", this.getCancelationDateTime());
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("externalRegistrationInformation", this.getExternalRegistrationInformation());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("preferredLanguage", this.getPreferredLanguage());
        writer.writeStringValue("preferredTimezone", this.getPreferredTimezone());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeCollectionOfObjectValues("registrationQuestionAnswers", this.getRegistrationQuestionAnswers());
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the cancelationDateTime property value. Date and time when the registrant cancels their registration for the virtual event. Only appears when applicable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the cancelationDateTime property.
     */
    public void setCancelationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("cancelationDateTime", value);
    }
    /**
     * Sets the email property value. Email address of the registrant.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the externalRegistrationInformation property value. The external information for a virtual event registration.
     * @param value Value to set for the externalRegistrationInformation property.
     */
    public void setExternalRegistrationInformation(@jakarta.annotation.Nullable final VirtualEventExternalRegistrationInformation value) {
        this.backingStore.set("externalRegistrationInformation", value);
    }
    /**
     * Sets the firstName property value. First name of the registrant.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("firstName", value);
    }
    /**
     * Sets the lastName property value. Last name of the registrant.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastName", value);
    }
    /**
     * Sets the preferredLanguage property value. The registrant&apos;s preferred language.
     * @param value Value to set for the preferredLanguage property.
     */
    public void setPreferredLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredLanguage", value);
    }
    /**
     * Sets the preferredTimezone property value. The registrant&apos;s time zone details.
     * @param value Value to set for the preferredTimezone property.
     */
    public void setPreferredTimezone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredTimezone", value);
    }
    /**
     * Sets the registrationDateTime property value. Date and time when the registrant registers for the virtual event. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the registrationDateTime property.
     */
    public void setRegistrationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("registrationDateTime", value);
    }
    /**
     * Sets the registrationQuestionAnswers property value. The registrant&apos;s answer to the registration questions.
     * @param value Value to set for the registrationQuestionAnswers property.
     */
    public void setRegistrationQuestionAnswers(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistrationQuestionAnswer> value) {
        this.backingStore.set("registrationQuestionAnswers", value);
    }
    /**
     * Sets the sessions property value. Sessions for a registration.
     * @param value Value to set for the sessions property.
     */
    public void setSessions(@jakarta.annotation.Nullable final java.util.List<VirtualEventSession> value) {
        this.backingStore.set("sessions", value);
    }
    /**
     * Sets the status property value. Registration status of the registrant. Read-only. Possible values are registered, canceled, waitlisted, pendingApproval, rejectedByOrganizer, and unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final VirtualEventAttendeeRegistrationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userId property value. The registrant&apos;s ID in Microsoft Entra ID. Only appears when the registrant is registered in Microsoft Entra ID.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
