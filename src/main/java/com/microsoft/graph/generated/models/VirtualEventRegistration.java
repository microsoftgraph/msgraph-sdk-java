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
     * Instantiates a new VirtualEventRegistration and sets the default values.
     */
    public VirtualEventRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventRegistration
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistration();
    }
    /**
     * Gets the cancelationDateTime property value. Date and time when the registrant cancels their registration for the virtual event. Only appears when applicable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCancelationDateTime() {
        return this.backingStore.get("cancelationDateTime");
    }
    /**
     * Gets the email property value. Email address of the registrant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cancelationDateTime", (n) -> { this.setCancelationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("registrationQuestionAnswers", (n) -> { this.setRegistrationQuestionAnswers(n.getCollectionOfObjectValues(VirtualEventRegistrationQuestionAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(VirtualEventAttendeeRegistrationStatus::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. First name of the registrant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.backingStore.get("firstName");
    }
    /**
     * Gets the lastName property value. Last name of the registrant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.backingStore.get("lastName");
    }
    /**
     * Gets the registrationDateTime property value. Date and time when the registrant registers for the virtual event. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.backingStore.get("registrationDateTime");
    }
    /**
     * Gets the registrationQuestionAnswers property value. The registrant's answer to the registration questions.
     * @return a java.util.List<VirtualEventRegistrationQuestionAnswer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistrationQuestionAnswer> getRegistrationQuestionAnswers() {
        return this.backingStore.get("registrationQuestionAnswers");
    }
    /**
     * Gets the status property value. Registration status of the registrant. Read-only.
     * @return a VirtualEventAttendeeRegistrationStatus
     */
    @jakarta.annotation.Nullable
    public VirtualEventAttendeeRegistrationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userId property value. The registrant's ID in Microsoft Entra ID. Only appears when the registrant is registered in Microsoft Entra ID.
     * @return a String
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
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeCollectionOfObjectValues("registrationQuestionAnswers", this.getRegistrationQuestionAnswers());
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
     * Sets the registrationDateTime property value. Date and time when the registrant registers for the virtual event. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the registrationDateTime property.
     */
    public void setRegistrationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("registrationDateTime", value);
    }
    /**
     * Sets the registrationQuestionAnswers property value. The registrant's answer to the registration questions.
     * @param value Value to set for the registrationQuestionAnswers property.
     */
    public void setRegistrationQuestionAnswers(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistrationQuestionAnswer> value) {
        this.backingStore.set("registrationQuestionAnswers", value);
    }
    /**
     * Sets the status property value. Registration status of the registrant. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final VirtualEventAttendeeRegistrationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userId property value. The registrant's ID in Microsoft Entra ID. Only appears when the registrant is registered in Microsoft Entra ID.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
