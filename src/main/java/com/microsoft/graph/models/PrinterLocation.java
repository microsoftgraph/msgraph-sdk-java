package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterLocation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The altitude, in meters, that the printer is located at. */
    private Integer _altitudeInMeters;
    /** The building that the printer is located in. */
    private String _building;
    /** The city that the printer is located in. */
    private String _city;
    /** The country or region that the printer is located in. */
    private String _countryOrRegion;
    /** The floor that the printer is located on. Only numerical values are supported right now. */
    private String _floor;
    /** The description of the floor that the printer is located on. */
    private String _floorDescription;
    /** The latitude that the printer is located at. */
    private Double _latitude;
    /** The longitude that the printer is located at. */
    private Double _longitude;
    /** The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order. */
    private java.util.List<String> _organization;
    /** The postal code that the printer is located in. */
    private String _postalCode;
    /** The description of the room that the printer is located in. */
    private String _roomDescription;
    /** The room that the printer is located in. Only numerical values are supported right now. */
    private String _roomName;
    /** The site that the printer is located in. */
    private String _site;
    /** The state or province that the printer is located in. */
    private String _stateOrProvince;
    /** The street address where the printer is located. */
    private String _streetAddress;
    /** The subdivision that the printer is located in. The elements should be in hierarchical order. */
    private java.util.List<String> _subdivision;
    /** The subunit property */
    private java.util.List<String> _subunit;
    /**
     * Instantiates a new printerLocation and sets the default values.
     * @return a void
     */
    public PrinterLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerLocation
     */
    @javax.annotation.Nonnull
    public static PrinterLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterLocation();
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
     * Gets the altitudeInMeters property value. The altitude, in meters, that the printer is located at.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAltitudeInMeters() {
        return this._altitudeInMeters;
    }
    /**
     * Gets the building property value. The building that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuilding() {
        return this._building;
    }
    /**
     * Gets the city property value. The city that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the countryOrRegion property value. The country or region that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegion() {
        return this._countryOrRegion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrinterLocation currentObject = this;
        return new HashMap<>(17) {{
            this.put("altitudeInMeters", (n) -> { currentObject.setAltitudeInMeters(n.getIntegerValue()); });
            this.put("building", (n) -> { currentObject.setBuilding(n.getStringValue()); });
            this.put("city", (n) -> { currentObject.setCity(n.getStringValue()); });
            this.put("countryOrRegion", (n) -> { currentObject.setCountryOrRegion(n.getStringValue()); });
            this.put("floor", (n) -> { currentObject.setFloor(n.getStringValue()); });
            this.put("floorDescription", (n) -> { currentObject.setFloorDescription(n.getStringValue()); });
            this.put("latitude", (n) -> { currentObject.setLatitude(n.getDoubleValue()); });
            this.put("longitude", (n) -> { currentObject.setLongitude(n.getDoubleValue()); });
            this.put("organization", (n) -> { currentObject.setOrganization(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("postalCode", (n) -> { currentObject.setPostalCode(n.getStringValue()); });
            this.put("roomDescription", (n) -> { currentObject.setRoomDescription(n.getStringValue()); });
            this.put("roomName", (n) -> { currentObject.setRoomName(n.getStringValue()); });
            this.put("site", (n) -> { currentObject.setSite(n.getStringValue()); });
            this.put("stateOrProvince", (n) -> { currentObject.setStateOrProvince(n.getStringValue()); });
            this.put("streetAddress", (n) -> { currentObject.setStreetAddress(n.getStringValue()); });
            this.put("subdivision", (n) -> { currentObject.setSubdivision(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("subunit", (n) -> { currentObject.setSubunit(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the floor property value. The floor that the printer is located on. Only numerical values are supported right now.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFloor() {
        return this._floor;
    }
    /**
     * Gets the floorDescription property value. The description of the floor that the printer is located on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFloorDescription() {
        return this._floorDescription;
    }
    /**
     * Gets the latitude property value. The latitude that the printer is located at.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLatitude() {
        return this._latitude;
    }
    /**
     * Gets the longitude property value. The longitude that the printer is located at.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLongitude() {
        return this._longitude;
    }
    /**
     * Gets the organization property value. The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrganization() {
        return this._organization;
    }
    /**
     * Gets the postalCode property value. The postal code that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostalCode() {
        return this._postalCode;
    }
    /**
     * Gets the roomDescription property value. The description of the room that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoomDescription() {
        return this._roomDescription;
    }
    /**
     * Gets the roomName property value. The room that the printer is located in. Only numerical values are supported right now.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoomName() {
        return this._roomName;
    }
    /**
     * Gets the site property value. The site that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSite() {
        return this._site;
    }
    /**
     * Gets the stateOrProvince property value. The state or province that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStateOrProvince() {
        return this._stateOrProvince;
    }
    /**
     * Gets the streetAddress property value. The street address where the printer is located.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreetAddress() {
        return this._streetAddress;
    }
    /**
     * Gets the subdivision property value. The subdivision that the printer is located in. The elements should be in hierarchical order.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSubdivision() {
        return this._subdivision;
    }
    /**
     * Gets the subunit property value. The subunit property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSubunit() {
        return this._subunit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("altitudeInMeters", this.getAltitudeInMeters());
        writer.writeStringValue("building", this.getBuilding());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("countryOrRegion", this.getCountryOrRegion());
        writer.writeStringValue("floor", this.getFloor());
        writer.writeStringValue("floorDescription", this.getFloorDescription());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
        writer.writeCollectionOfPrimitiveValues("organization", this.getOrganization());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("roomDescription", this.getRoomDescription());
        writer.writeStringValue("roomName", this.getRoomName());
        writer.writeStringValue("site", this.getSite());
        writer.writeStringValue("stateOrProvince", this.getStateOrProvince());
        writer.writeStringValue("streetAddress", this.getStreetAddress());
        writer.writeCollectionOfPrimitiveValues("subdivision", this.getSubdivision());
        writer.writeCollectionOfPrimitiveValues("subunit", this.getSubunit());
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
     * Sets the altitudeInMeters property value. The altitude, in meters, that the printer is located at.
     * @param value Value to set for the altitudeInMeters property.
     * @return a void
     */
    public void setAltitudeInMeters(@javax.annotation.Nullable final Integer value) {
        this._altitudeInMeters = value;
    }
    /**
     * Sets the building property value. The building that the printer is located in.
     * @param value Value to set for the building property.
     * @return a void
     */
    public void setBuilding(@javax.annotation.Nullable final String value) {
        this._building = value;
    }
    /**
     * Sets the city property value. The city that the printer is located in.
     * @param value Value to set for the city property.
     * @return a void
     */
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the countryOrRegion property value. The country or region that the printer is located in.
     * @param value Value to set for the countryOrRegion property.
     * @return a void
     */
    public void setCountryOrRegion(@javax.annotation.Nullable final String value) {
        this._countryOrRegion = value;
    }
    /**
     * Sets the floor property value. The floor that the printer is located on. Only numerical values are supported right now.
     * @param value Value to set for the floor property.
     * @return a void
     */
    public void setFloor(@javax.annotation.Nullable final String value) {
        this._floor = value;
    }
    /**
     * Sets the floorDescription property value. The description of the floor that the printer is located on.
     * @param value Value to set for the floorDescription property.
     * @return a void
     */
    public void setFloorDescription(@javax.annotation.Nullable final String value) {
        this._floorDescription = value;
    }
    /**
     * Sets the latitude property value. The latitude that the printer is located at.
     * @param value Value to set for the latitude property.
     * @return a void
     */
    public void setLatitude(@javax.annotation.Nullable final Double value) {
        this._latitude = value;
    }
    /**
     * Sets the longitude property value. The longitude that the printer is located at.
     * @param value Value to set for the longitude property.
     * @return a void
     */
    public void setLongitude(@javax.annotation.Nullable final Double value) {
        this._longitude = value;
    }
    /**
     * Sets the organization property value. The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
     * @param value Value to set for the organization property.
     * @return a void
     */
    public void setOrganization(@javax.annotation.Nullable final java.util.List<String> value) {
        this._organization = value;
    }
    /**
     * Sets the postalCode property value. The postal code that the printer is located in.
     * @param value Value to set for the postalCode property.
     * @return a void
     */
    public void setPostalCode(@javax.annotation.Nullable final String value) {
        this._postalCode = value;
    }
    /**
     * Sets the roomDescription property value. The description of the room that the printer is located in.
     * @param value Value to set for the roomDescription property.
     * @return a void
     */
    public void setRoomDescription(@javax.annotation.Nullable final String value) {
        this._roomDescription = value;
    }
    /**
     * Sets the roomName property value. The room that the printer is located in. Only numerical values are supported right now.
     * @param value Value to set for the roomName property.
     * @return a void
     */
    public void setRoomName(@javax.annotation.Nullable final String value) {
        this._roomName = value;
    }
    /**
     * Sets the site property value. The site that the printer is located in.
     * @param value Value to set for the site property.
     * @return a void
     */
    public void setSite(@javax.annotation.Nullable final String value) {
        this._site = value;
    }
    /**
     * Sets the stateOrProvince property value. The state or province that the printer is located in.
     * @param value Value to set for the stateOrProvince property.
     * @return a void
     */
    public void setStateOrProvince(@javax.annotation.Nullable final String value) {
        this._stateOrProvince = value;
    }
    /**
     * Sets the streetAddress property value. The street address where the printer is located.
     * @param value Value to set for the streetAddress property.
     * @return a void
     */
    public void setStreetAddress(@javax.annotation.Nullable final String value) {
        this._streetAddress = value;
    }
    /**
     * Sets the subdivision property value. The subdivision that the printer is located in. The elements should be in hierarchical order.
     * @param value Value to set for the subdivision property.
     * @return a void
     */
    public void setSubdivision(@javax.annotation.Nullable final java.util.List<String> value) {
        this._subdivision = value;
    }
    /**
     * Sets the subunit property value. The subunit property
     * @param value Value to set for the subunit property.
     * @return a void
     */
    public void setSubunit(@javax.annotation.Nullable final java.util.List<String> value) {
        this._subunit = value;
    }
}
