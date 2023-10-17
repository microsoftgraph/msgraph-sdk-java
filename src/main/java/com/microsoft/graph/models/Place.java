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
     * The street address of the place.
     */
    private PhysicalAddress address;
    /**
     * The name associated with the place.
     */
    private String displayName;
    /**
     * Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
     */
    private OutlookGeoCoordinates geoCoordinates;
    /**
     * The phone number of the place.
     */
    private String phone;
    /**
     * Instantiates a new Place and sets the default values.
     */
    public Place() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Place
     */
    @jakarta.annotation.Nonnull
    public static Place createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.room": return new Room();
                case "#microsoft.graph.roomList": return new RoomList();
            }
        }
        return new Place();
    }
    /**
     * Gets the address property value. The street address of the place.
     * @return a PhysicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the displayName property value. The name associated with the place.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("geoCoordinates", (n) -> { this.setGeoCoordinates(n.getObjectValue(OutlookGeoCoordinates::createFromDiscriminatorValue)); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the geoCoordinates property value. Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
     * @return a OutlookGeoCoordinates
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinates getGeoCoordinates() {
        return this.geoCoordinates;
    }
    /**
     * Gets the phone property value. The phone number of the place.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
        writer.writeStringValue("phone", this.getPhone());
    }
    /**
     * Sets the address property value. The street address of the place.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.address = value;
    }
    /**
     * Sets the displayName property value. The name associated with the place.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the geoCoordinates property value. Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
     * @param value Value to set for the geoCoordinates property.
     */
    public void setGeoCoordinates(@jakarta.annotation.Nullable final OutlookGeoCoordinates value) {
        this.geoCoordinates = value;
    }
    /**
     * Sets the phone property value. The phone number of the place.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
}
