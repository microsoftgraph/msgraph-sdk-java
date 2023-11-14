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
     * The audience property
     */
    private MeetingAudience audience;
    /**
     * The coOrganizers property
     */
    private java.util.List<CommunicationsUserIdentity> coOrganizers;
    /**
     * The registrations property
     */
    private java.util.List<VirtualEventRegistration> registrations;
    /**
     * Instantiates a new VirtualEventWebinar and sets the default values.
     */
    public VirtualEventWebinar() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventWebinar
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventWebinar createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventWebinar();
    }
    /**
     * Gets the audience property value. The audience property
     * @return a MeetingAudience
     */
    @jakarta.annotation.Nullable
    public MeetingAudience getAudience() {
        return this.audience;
    }
    /**
     * Gets the coOrganizers property value. The coOrganizers property
     * @return a java.util.List<CommunicationsUserIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CommunicationsUserIdentity> getCoOrganizers() {
        return this.coOrganizers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getEnumValue(MeetingAudience.class)); });
        deserializerMap.put("coOrganizers", (n) -> { this.setCoOrganizers(n.getCollectionOfObjectValues(CommunicationsUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("registrations", (n) -> { this.setRegistrations(n.getCollectionOfObjectValues(VirtualEventRegistration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the registrations property value. The registrations property
     * @return a java.util.List<VirtualEventRegistration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistration> getRegistrations() {
        return this.registrations;
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
     * Sets the audience property value. The audience property
     * @param value Value to set for the audience property.
     */
    public void setAudience(@jakarta.annotation.Nullable final MeetingAudience value) {
        this.audience = value;
    }
    /**
     * Sets the coOrganizers property value. The coOrganizers property
     * @param value Value to set for the coOrganizers property.
     */
    public void setCoOrganizers(@jakarta.annotation.Nullable final java.util.List<CommunicationsUserIdentity> value) {
        this.coOrganizers = value;
    }
    /**
     * Sets the registrations property value. The registrations property
     * @param value Value to set for the registrations property.
     */
    public void setRegistrations(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistration> value) {
        this.registrations = value;
    }
}
