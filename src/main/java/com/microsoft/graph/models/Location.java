package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Location implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The street address of the location.  */
    private PhysicalAddress _address;
    /** The geographic coordinates and elevation of the location.  */
    private OutlookGeoCoordinates _coordinates;
    /** The name associated with the location.  */
    private String _displayName;
    /** Optional email address of the location.  */
    private String _locationEmailAddress;
    /** The type of location. Possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.  */
    private LocationType _locationType;
    /** Optional URI representing the location.  */
    private String _locationUri;
    /** For internal use only.  */
    private String _uniqueId;
    /** For internal use only.  */
    private LocationUniqueIdType _uniqueIdType;
    /**
     * Instantiates a new location and sets the default values.
     * @return a void
     */
    public Location() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a location
     */
    @javax.annotation.Nonnull
    public static Location createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Location();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the address property value. The street address of the location.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this._address;
    }
    /**
     * Gets the coordinates property value. The geographic coordinates and elevation of the location.
     * @return a outlookGeoCoordinates
     */
    @javax.annotation.Nullable
    public OutlookGeoCoordinates getCoordinates() {
        return this._coordinates;
    }
    /**
     * Gets the displayName property value. The name associated with the location.
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
        final Location currentObject = this;
        return new HashMap<>(8) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("coordinates", (n) -> { currentObject.setCoordinates(n.getObjectValue(OutlookGeoCoordinates::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("locationEmailAddress", (n) -> { currentObject.setLocationEmailAddress(n.getStringValue()); });
            this.put("locationType", (n) -> { currentObject.setLocationType(n.getEnumValue(LocationType.class)); });
            this.put("locationUri", (n) -> { currentObject.setLocationUri(n.getStringValue()); });
            this.put("uniqueId", (n) -> { currentObject.setUniqueId(n.getStringValue()); });
            this.put("uniqueIdType", (n) -> { currentObject.setUniqueIdType(n.getEnumValue(LocationUniqueIdType.class)); });
        }};
    }
    /**
     * Gets the locationEmailAddress property value. Optional email address of the location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocationEmailAddress() {
        return this._locationEmailAddress;
    }
    /**
     * Gets the locationType property value. The type of location. Possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
     * @return a locationType
     */
    @javax.annotation.Nullable
    public LocationType getLocationType() {
        return this._locationType;
    }
    /**
     * Gets the locationUri property value. Optional URI representing the location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocationUri() {
        return this._locationUri;
    }
    /**
     * Gets the uniqueId property value. For internal use only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUniqueId() {
        return this._uniqueId;
    }
    /**
     * Gets the uniqueIdType property value. For internal use only.
     * @return a locationUniqueIdType
     */
    @javax.annotation.Nullable
    public LocationUniqueIdType getUniqueIdType() {
        return this._uniqueIdType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("coordinates", this.getCoordinates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("locationEmailAddress", this.getLocationEmailAddress());
        writer.writeEnumValue("locationType", this.getLocationType());
        writer.writeStringValue("locationUri", this.getLocationUri());
        writer.writeStringValue("uniqueId", this.getUniqueId());
        writer.writeEnumValue("uniqueIdType", this.getUniqueIdType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the address property value. The street address of the location.
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._address = value;
    }
    /**
     * Sets the coordinates property value. The geographic coordinates and elevation of the location.
     * @param value Value to set for the coordinates property.
     * @return a void
     */
    public void setCoordinates(@javax.annotation.Nullable final OutlookGeoCoordinates value) {
        this._coordinates = value;
    }
    /**
     * Sets the displayName property value. The name associated with the location.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the locationEmailAddress property value. Optional email address of the location.
     * @param value Value to set for the locationEmailAddress property.
     * @return a void
     */
    public void setLocationEmailAddress(@javax.annotation.Nullable final String value) {
        this._locationEmailAddress = value;
    }
    /**
     * Sets the locationType property value. The type of location. Possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
     * @param value Value to set for the locationType property.
     * @return a void
     */
    public void setLocationType(@javax.annotation.Nullable final LocationType value) {
        this._locationType = value;
    }
    /**
     * Sets the locationUri property value. Optional URI representing the location.
     * @param value Value to set for the locationUri property.
     * @return a void
     */
    public void setLocationUri(@javax.annotation.Nullable final String value) {
        this._locationUri = value;
    }
    /**
     * Sets the uniqueId property value. For internal use only.
     * @param value Value to set for the uniqueId property.
     * @return a void
     */
    public void setUniqueId(@javax.annotation.Nullable final String value) {
        this._uniqueId = value;
    }
    /**
     * Sets the uniqueIdType property value. For internal use only.
     * @param value Value to set for the uniqueIdType property.
     * @return a void
     */
    public void setUniqueIdType(@javax.annotation.Nullable final LocationUniqueIdType value) {
        this._uniqueIdType = value;
    }
}
