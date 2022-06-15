package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of place entities. */
public class Place extends Entity implements Parsable {
    /** The street address of the place. */
    private PhysicalAddress _address;
    /** The name associated with the place. */
    private String _displayName;
    /** Specifies the place location in latitude, longitude and (optionally) altitude coordinates. */
    private OutlookGeoCoordinates _geoCoordinates;
    /** The phone number of the place. */
    private String _phone;
    /**
     * Instantiates a new place and sets the default values.
     * @return a void
     */
    public Place() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a place
     */
    @javax.annotation.Nonnull
    public static Place createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this._address;
    }
    /**
     * Gets the displayName property value. The name associated with the place.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Place currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("geoCoordinates", (n) -> { currentObject.setGeoCoordinates(n.getObjectValue(OutlookGeoCoordinates::createFromDiscriminatorValue)); });
            this.put("phone", (n) -> { currentObject.setPhone(n.getStringValue()); });
        }};
    }
    /**
     * Gets the geoCoordinates property value. Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
     * @return a outlookGeoCoordinates
     */
    @javax.annotation.Nullable
    public OutlookGeoCoordinates getGeoCoordinates() {
        return this._geoCoordinates;
    }
    /**
     * Gets the phone property value. The phone number of the place.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhone() {
        return this._phone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._address = value;
    }
    /**
     * Sets the displayName property value. The name associated with the place.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the geoCoordinates property value. Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
     * @param value Value to set for the geoCoordinates property.
     * @return a void
     */
    public void setGeoCoordinates(@javax.annotation.Nullable final OutlookGeoCoordinates value) {
        this._geoCoordinates = value;
    }
    /**
     * Sets the phone property value. The phone number of the place.
     * @param value Value to set for the phone property.
     * @return a void
     */
    public void setPhone(@javax.annotation.Nullable final String value) {
        this._phone = value;
    }
}
