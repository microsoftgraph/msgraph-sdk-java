package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventWebinar extends VirtualEvent implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventWebinar} and sets the default values.
     */
    public VirtualEventWebinar() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventWebinar}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventWebinar createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventWebinar();
    }
    /**
     * Gets the audience property value. To whom the webinar is visible.
     * @return a {@link MeetingAudience}
     */
    @jakarta.annotation.Nullable
    public MeetingAudience getAudience() {
        return this.backingStore.get("audience");
    }
    /**
     * Gets the coOrganizers property value. Identity information of coorganizers of the webinar.
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
        deserializerMap.put("coOrganizers", (n) -> { this.setCoOrganizers(n.getCollectionOfObjectValues(CommunicationsUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("registrations", (n) -> { this.setRegistrations(n.getCollectionOfObjectValues(VirtualEventRegistration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the registrations property value. Registration records of the webinar.
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
        writer.writeCollectionOfObjectValues("coOrganizers", this.getCoOrganizers());
        writer.writeCollectionOfObjectValues("registrations", this.getRegistrations());
    }
    /**
     * Sets the audience property value. To whom the webinar is visible.
     * @param value Value to set for the audience property.
     */
    public void setAudience(@jakarta.annotation.Nullable final MeetingAudience value) {
        this.backingStore.set("audience", value);
    }
    /**
     * Sets the coOrganizers property value. Identity information of coorganizers of the webinar.
     * @param value Value to set for the coOrganizers property.
     */
    public void setCoOrganizers(@jakarta.annotation.Nullable final java.util.List<CommunicationsUserIdentity> value) {
        this.backingStore.set("coOrganizers", value);
    }
    /**
     * Sets the registrations property value. Registration records of the webinar.
     * @param value Value to set for the registrations property.
     */
    public void setRegistrations(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistration> value) {
        this.backingStore.set("registrations", value);
    }
}
