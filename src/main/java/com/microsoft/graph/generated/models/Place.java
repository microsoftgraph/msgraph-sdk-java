package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Place extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Place} and sets the default values.
     */
    public Place() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Place}
     */
    @jakarta.annotation.Nonnull
    public static Place createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.building": return new Building();
                case "#microsoft.graph.desk": return new Desk();
                case "#microsoft.graph.floor": return new Floor();
                case "#microsoft.graph.room": return new Room();
                case "#microsoft.graph.roomList": return new RoomList();
                case "#microsoft.graph.section": return new Section();
                case "#microsoft.graph.workspace": return new Workspace();
            }
        }
        return new Place();
    }
    /**
     * Gets the address property value. The physical address of the place, including the street, city, state, country or region, and postal code.
     * @return a {@link PhysicalAddress}
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.backingStore.get("address");
    }
    /**
     * Gets the checkIns property value. A subresource of a place object that indicates the check-in status of an Outlook calendar event booked at the place.
     * @return a {@link java.util.List<CheckInClaim>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CheckInClaim> getCheckIns() {
        return this.backingStore.get("checkIns");
    }
    /**
     * Gets the displayName property value. The name that is associated with the place.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("checkIns", (n) -> { this.setCheckIns(n.getCollectionOfObjectValues(CheckInClaim::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("geoCoordinates", (n) -> { this.setGeoCoordinates(n.getObjectValue(OutlookGeoCoordinates::createFromDiscriminatorValue)); });
        deserializerMap.put("isWheelChairAccessible", (n) -> { this.setIsWheelChairAccessible(n.getBooleanValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("parentId", (n) -> { this.setParentId(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the geoCoordinates property value. Specifies the place location in latitude, longitude, and (optionally) altitude coordinates.
     * @return a {@link OutlookGeoCoordinates}
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinates getGeoCoordinates() {
        return this.backingStore.get("geoCoordinates");
    }
    /**
     * Gets the isWheelChairAccessible property value. Indicates whether the place is wheelchair accessible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWheelChairAccessible() {
        return this.backingStore.get("isWheelChairAccessible");
    }
    /**
     * Gets the label property value. User-defined description of the place.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.backingStore.get("label");
    }
    /**
     * Gets the parentId property value. The ID of a parent place.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentId() {
        return this.backingStore.get("parentId");
    }
    /**
     * Gets the phone property value. The phone number of the place.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.backingStore.get("phone");
    }
    /**
     * Gets the tags property value. Custom tags that are associated with the place for categorization or filtering.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeCollectionOfObjectValues("checkIns", this.getCheckIns());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
        writer.writeBooleanValue("isWheelChairAccessible", this.getIsWheelChairAccessible());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("parentId", this.getParentId());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
    }
    /**
     * Sets the address property value. The physical address of the place, including the street, city, state, country or region, and postal code.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("address", value);
    }
    /**
     * Sets the checkIns property value. A subresource of a place object that indicates the check-in status of an Outlook calendar event booked at the place.
     * @param value Value to set for the checkIns property.
     */
    public void setCheckIns(@jakarta.annotation.Nullable final java.util.List<CheckInClaim> value) {
        this.backingStore.set("checkIns", value);
    }
    /**
     * Sets the displayName property value. The name that is associated with the place.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the geoCoordinates property value. Specifies the place location in latitude, longitude, and (optionally) altitude coordinates.
     * @param value Value to set for the geoCoordinates property.
     */
    public void setGeoCoordinates(@jakarta.annotation.Nullable final OutlookGeoCoordinates value) {
        this.backingStore.set("geoCoordinates", value);
    }
    /**
     * Sets the isWheelChairAccessible property value. Indicates whether the place is wheelchair accessible.
     * @param value Value to set for the isWheelChairAccessible property.
     */
    public void setIsWheelChairAccessible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isWheelChairAccessible", value);
    }
    /**
     * Sets the label property value. User-defined description of the place.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("label", value);
    }
    /**
     * Sets the parentId property value. The ID of a parent place.
     * @param value Value to set for the parentId property.
     */
    public void setParentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentId", value);
    }
    /**
     * Sets the phone property value. The phone number of the place.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phone", value);
    }
    /**
     * Sets the tags property value. Custom tags that are associated with the place for categorization or filtering.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
}
