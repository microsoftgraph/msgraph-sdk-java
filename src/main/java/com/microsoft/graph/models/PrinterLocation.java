package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterLocation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The altitude, in meters, that the printer is located at. */
    private Integer altitudeInMeters;
    /** The building that the printer is located in. */
    private String building;
    /** The city that the printer is located in. */
    private String city;
    /** The country or region that the printer is located in. */
    private String countryOrRegion;
    /** The floor that the printer is located on. Only numerical values are supported right now. */
    private String floor;
    /** The description of the floor that the printer is located on. */
    private String floorDescription;
    /** The latitude that the printer is located at. */
    private Double latitude;
    /** The longitude that the printer is located at. */
    private Double longitude;
    /** The OdataType property */
    private String odataType;
    /** The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order. */
    private java.util.List<String> organization;
    /** The postal code that the printer is located in. */
    private String postalCode;
    /** The description of the room that the printer is located in. */
    private String roomDescription;
    /** The room that the printer is located in. Only numerical values are supported right now. */
    private String roomName;
    /** The site that the printer is located in. */
    private String site;
    /** The state or province that the printer is located in. */
    private String stateOrProvince;
    /** The street address where the printer is located. */
    private String streetAddress;
    /** The subdivision that the printer is located in. The elements should be in hierarchical order. */
    private java.util.List<String> subdivision;
    /** The subunit property */
    private java.util.List<String> subunit;
    /**
     * Instantiates a new printerLocation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the altitudeInMeters property value. The altitude, in meters, that the printer is located at.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAltitudeInMeters() {
        return this.altitudeInMeters;
    }
    /**
     * Gets the building property value. The building that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuilding() {
        return this.building;
    }
    /**
     * Gets the city property value. The city that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the countryOrRegion property value. The country or region that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegion() {
        return this.countryOrRegion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("altitudeInMeters", (n) -> { this.setAltitudeInMeters(n.getIntegerValue()); });
        deserializerMap.put("building", (n) -> { this.setBuilding(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("countryOrRegion", (n) -> { this.setCountryOrRegion(n.getStringValue()); });
        deserializerMap.put("floor", (n) -> { this.setFloor(n.getStringValue()); });
        deserializerMap.put("floorDescription", (n) -> { this.setFloorDescription(n.getStringValue()); });
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("roomDescription", (n) -> { this.setRoomDescription(n.getStringValue()); });
        deserializerMap.put("roomName", (n) -> { this.setRoomName(n.getStringValue()); });
        deserializerMap.put("site", (n) -> { this.setSite(n.getStringValue()); });
        deserializerMap.put("stateOrProvince", (n) -> { this.setStateOrProvince(n.getStringValue()); });
        deserializerMap.put("streetAddress", (n) -> { this.setStreetAddress(n.getStringValue()); });
        deserializerMap.put("subdivision", (n) -> { this.setSubdivision(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subunit", (n) -> { this.setSubunit(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the floor property value. The floor that the printer is located on. Only numerical values are supported right now.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFloor() {
        return this.floor;
    }
    /**
     * Gets the floorDescription property value. The description of the floor that the printer is located on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFloorDescription() {
        return this.floorDescription;
    }
    /**
     * Gets the latitude property value. The latitude that the printer is located at.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the longitude property value. The longitude that the printer is located at.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the organization property value. The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrganization() {
        return this.organization;
    }
    /**
     * Gets the postalCode property value. The postal code that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the roomDescription property value. The description of the room that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoomDescription() {
        return this.roomDescription;
    }
    /**
     * Gets the roomName property value. The room that the printer is located in. Only numerical values are supported right now.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoomName() {
        return this.roomName;
    }
    /**
     * Gets the site property value. The site that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSite() {
        return this.site;
    }
    /**
     * Gets the stateOrProvince property value. The state or province that the printer is located in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStateOrProvince() {
        return this.stateOrProvince;
    }
    /**
     * Gets the streetAddress property value. The street address where the printer is located.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreetAddress() {
        return this.streetAddress;
    }
    /**
     * Gets the subdivision property value. The subdivision that the printer is located in. The elements should be in hierarchical order.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSubdivision() {
        return this.subdivision;
    }
    /**
     * Gets the subunit property value. The subunit property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSubunit() {
        return this.subunit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
        writer.writeStringValue("@odata.type", this.getOdataType());
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the altitudeInMeters property value. The altitude, in meters, that the printer is located at.
     * @param value Value to set for the altitudeInMeters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAltitudeInMeters(@javax.annotation.Nullable final Integer value) {
        this.altitudeInMeters = value;
    }
    /**
     * Sets the building property value. The building that the printer is located in.
     * @param value Value to set for the building property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuilding(@javax.annotation.Nullable final String value) {
        this.building = value;
    }
    /**
     * Sets the city property value. The city that the printer is located in.
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the countryOrRegion property value. The country or region that the printer is located in.
     * @param value Value to set for the countryOrRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryOrRegion(@javax.annotation.Nullable final String value) {
        this.countryOrRegion = value;
    }
    /**
     * Sets the floor property value. The floor that the printer is located on. Only numerical values are supported right now.
     * @param value Value to set for the floor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFloor(@javax.annotation.Nullable final String value) {
        this.floor = value;
    }
    /**
     * Sets the floorDescription property value. The description of the floor that the printer is located on.
     * @param value Value to set for the floorDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFloorDescription(@javax.annotation.Nullable final String value) {
        this.floorDescription = value;
    }
    /**
     * Sets the latitude property value. The latitude that the printer is located at.
     * @param value Value to set for the latitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatitude(@javax.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the longitude property value. The longitude that the printer is located at.
     * @param value Value to set for the longitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLongitude(@javax.annotation.Nullable final Double value) {
        this.longitude = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the organization property value. The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
     * @param value Value to set for the organization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganization(@javax.annotation.Nullable final java.util.List<String> value) {
        this.organization = value;
    }
    /**
     * Sets the postalCode property value. The postal code that the printer is located in.
     * @param value Value to set for the postalCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostalCode(@javax.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the roomDescription property value. The description of the room that the printer is located in.
     * @param value Value to set for the roomDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoomDescription(@javax.annotation.Nullable final String value) {
        this.roomDescription = value;
    }
    /**
     * Sets the roomName property value. The room that the printer is located in. Only numerical values are supported right now.
     * @param value Value to set for the roomName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoomName(@javax.annotation.Nullable final String value) {
        this.roomName = value;
    }
    /**
     * Sets the site property value. The site that the printer is located in.
     * @param value Value to set for the site property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSite(@javax.annotation.Nullable final String value) {
        this.site = value;
    }
    /**
     * Sets the stateOrProvince property value. The state or province that the printer is located in.
     * @param value Value to set for the stateOrProvince property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStateOrProvince(@javax.annotation.Nullable final String value) {
        this.stateOrProvince = value;
    }
    /**
     * Sets the streetAddress property value. The street address where the printer is located.
     * @param value Value to set for the streetAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStreetAddress(@javax.annotation.Nullable final String value) {
        this.streetAddress = value;
    }
    /**
     * Sets the subdivision property value. The subdivision that the printer is located in. The elements should be in hierarchical order.
     * @param value Value to set for the subdivision property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubdivision(@javax.annotation.Nullable final java.util.List<String> value) {
        this.subdivision = value;
    }
    /**
     * Sets the subunit property value. The subunit property
     * @param value Value to set for the subunit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubunit(@javax.annotation.Nullable final java.util.List<String> value) {
        this.subunit = value;
    }
}
