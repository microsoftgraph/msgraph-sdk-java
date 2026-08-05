package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventRegistrationConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventRegistrationConfiguration} and sets the default values.
     */
    public VirtualEventRegistrationConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventRegistrationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistrationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.virtualEventTownhallRegistrationConfiguration": return new VirtualEventTownhallRegistrationConfiguration();
                case "#microsoft.graph.virtualEventWebinarRegistrationConfiguration": return new VirtualEventWebinarRegistrationConfiguration();
            }
        }
        return new VirtualEventRegistrationConfiguration();
    }
    /**
     * Gets the capacity property value. Total capacity of the virtual event.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCapacity() {
        return this.backingStore.get("capacity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("isManualApprovalEnabled", (n) -> { this.setIsManualApprovalEnabled(n.getBooleanValue()); });
        deserializerMap.put("isWaitlistEnabled", (n) -> { this.setIsWaitlistEnabled(n.getBooleanValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(VirtualEventRegistrationQuestionBase::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationWebUrl", (n) -> { this.setRegistrationWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isManualApprovalEnabled property value. Indicates whether registrations require organizer approval before a participant is confirmed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsManualApprovalEnabled() {
        return this.backingStore.get("isManualApprovalEnabled");
    }
    /**
     * Gets the isWaitlistEnabled property value. Indicates whether more registrants are automatically placed on a waitlist when capacity is reached.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWaitlistEnabled() {
        return this.backingStore.get("isWaitlistEnabled");
    }
    /**
     * Gets the questions property value. Registration questions.
     * @return a {@link java.util.List<VirtualEventRegistrationQuestionBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistrationQuestionBase> getQuestions() {
        return this.backingStore.get("questions");
    }
    /**
     * Gets the registrationWebUrl property value. Registration URL of the virtual event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegistrationWebUrl() {
        return this.backingStore.get("registrationWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeBooleanValue("isManualApprovalEnabled", this.getIsManualApprovalEnabled());
        writer.writeBooleanValue("isWaitlistEnabled", this.getIsWaitlistEnabled());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeStringValue("registrationWebUrl", this.getRegistrationWebUrl());
    }
    /**
     * Sets the capacity property value. Total capacity of the virtual event.
     * @param value Value to set for the capacity property.
     */
    public void setCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("capacity", value);
    }
    /**
     * Sets the isManualApprovalEnabled property value. Indicates whether registrations require organizer approval before a participant is confirmed.
     * @param value Value to set for the isManualApprovalEnabled property.
     */
    public void setIsManualApprovalEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isManualApprovalEnabled", value);
    }
    /**
     * Sets the isWaitlistEnabled property value. Indicates whether more registrants are automatically placed on a waitlist when capacity is reached.
     * @param value Value to set for the isWaitlistEnabled property.
     */
    public void setIsWaitlistEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isWaitlistEnabled", value);
    }
    /**
     * Sets the questions property value. Registration questions.
     * @param value Value to set for the questions property.
     */
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistrationQuestionBase> value) {
        this.backingStore.set("questions", value);
    }
    /**
     * Sets the registrationWebUrl property value. Registration URL of the virtual event.
     * @param value Value to set for the registrationWebUrl property.
     */
    public void setRegistrationWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("registrationWebUrl", value);
    }
}
