package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class M365CapabilityBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link M365CapabilityBase} and sets the default values.
     */
    public M365CapabilityBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link M365CapabilityBase}
     */
    @jakarta.annotation.Nonnull
    public static M365CapabilityBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.crossTenantCalendarAvailabilityBasic": return new CrossTenantCalendarAvailabilityBasic();
                case "#microsoft.graph.crossTenantCalendarAvailabilityLimitedDetails": return new CrossTenantCalendarAvailabilityLimitedDetails();
                case "#microsoft.graph.crossTenantCalendarSharingFreeBusyDetail": return new CrossTenantCalendarSharingFreeBusyDetail();
                case "#microsoft.graph.crossTenantCalendarSharingFreeBusyReviewer": return new CrossTenantCalendarSharingFreeBusyReviewer();
                case "#microsoft.graph.crossTenantCalendarSharingFreeBusySimple": return new CrossTenantCalendarSharingFreeBusySimple();
                case "#microsoft.graph.crossTenantMailTipsAll": return new CrossTenantMailTipsAll();
                case "#microsoft.graph.crossTenantMailTipsLimited": return new CrossTenantMailTipsLimited();
                case "#microsoft.graph.crossTenantMigration": return new CrossTenantMigration();
                case "#microsoft.graph.crossTenantOpenProfileCard": return new CrossTenantOpenProfileCard();
                case "#microsoft.graph.crossTenantPlacesDeskBooking": return new CrossTenantPlacesDeskBooking();
                case "#microsoft.graph.crossTenantPlacesRoomBooking": return new CrossTenantPlacesRoomBooking();
            }
        }
        return new M365CapabilityBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inboundAccess", (n) -> { this.setInboundAccess(n.getObjectValue(M365CapabilityInboundAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundAccess property value. The inbound access settings for the capability.
     * @return a {@link M365CapabilityInboundAccess}
     */
    @jakarta.annotation.Nullable
    public M365CapabilityInboundAccess getInboundAccess() {
        return this.backingStore.get("inboundAccess");
    }
    /**
     * Gets the lastModifiedDateTime property value. The automatically updated last modified timestamp for the capability. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the name property value. The name or identifier of the capability. Key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("inboundAccess", this.getInboundAccess());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the inboundAccess property value. The inbound access settings for the capability.
     * @param value Value to set for the inboundAccess property.
     */
    public void setInboundAccess(@jakarta.annotation.Nullable final M365CapabilityInboundAccess value) {
        this.backingStore.set("inboundAccess", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The automatically updated last modified timestamp for the capability. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the name property value. The name or identifier of the capability. Key.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
}
