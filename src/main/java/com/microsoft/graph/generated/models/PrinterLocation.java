package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrinterLocation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PrinterLocation} and sets the default values.
     */
    public PrinterLocation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrinterLocation}
     */
    @jakarta.annotation.Nonnull
    public static PrinterLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterLocation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the altitudeInMeters property value. The altitude, in meters, that the printer is located at.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAltitudeInMeters() {
        return this.backingStore.get("altitudeInMeters");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the building property value. The building that the printer is located in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuilding() {
        return this.backingStore.get("building");
    }
    /**
     * Gets the city property value. The city that the printer is located in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.backingStore.get("city");
    }
    /**
     * Gets the countryOrRegion property value. The country or region that the printer is located in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryOrRegion() {
        return this.backingStore.get("countryOrRegion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFloor() {
        return this.backingStore.get("floor");
    }
    /**
     * Gets the floorDescription property value. The description of the floor that the printer is located on.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFloorDescription() {
        return this.backingStore.get("floorDescription");
    }
    /**
     * Gets the latitude property value. The latitude that the printer is located at.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.backingStore.get("latitude");
    }
    /**
     * Gets the longitude property value. The longitude that the printer is located at.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.backingStore.get("longitude");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the organization property value. The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOrganization() {
        return this.backingStore.get("organization");
    }
    /**
     * Gets the postalCode property value. The postal code that the printer is located in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.backingStore.get("postalCode");
    }
    /**
     * Gets the roomDescription property value. The description of the room that the printer is located in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoomDescription() {
        return this.backingStore.get("roomDescription");
    }
    /**
     * Gets the roomName property value. The room that the printer is located in. Only numerical values are supported right now.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoomName() {
        return this.backingStore.get("roomName");
    }
    /**
     * Gets the site property value. The site that the printer is located in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSite() {
        return this.backingStore.get("site");
    }
    /**
     * Gets the stateOrProvince property value. The state or province that the printer is located in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStateOrProvince() {
        return this.backingStore.get("stateOrProvince");
    }
    /**
     * Gets the streetAddress property value. The street address where the printer is located.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreetAddress() {
        return this.backingStore.get("streetAddress");
    }
    /**
     * Gets the subdivision property value. The subdivision that the printer is located in. The elements should be in hierarchical order.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubdivision() {
        return this.backingStore.get("subdivision");
    }
    /**
     * Gets the subunit property value. The subunit property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubunit() {
        return this.backingStore.get("subunit");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the altitudeInMeters property value. The altitude, in meters, that the printer is located at.
     * @param value Value to set for the altitudeInMeters property.
     */
    public void setAltitudeInMeters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("altitudeInMeters", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the building property value. The building that the printer is located in.
     * @param value Value to set for the building property.
     */
    public void setBuilding(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("building", value);
    }
    /**
     * Sets the city property value. The city that the printer is located in.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("city", value);
    }
    /**
     * Sets the countryOrRegion property value. The country or region that the printer is located in.
     * @param value Value to set for the countryOrRegion property.
     */
    public void setCountryOrRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("countryOrRegion", value);
    }
    /**
     * Sets the floor property value. The floor that the printer is located on. Only numerical values are supported right now.
     * @param value Value to set for the floor property.
     */
    public void setFloor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("floor", value);
    }
    /**
     * Sets the floorDescription property value. The description of the floor that the printer is located on.
     * @param value Value to set for the floorDescription property.
     */
    public void setFloorDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("floorDescription", value);
    }
    /**
     * Sets the latitude property value. The latitude that the printer is located at.
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("latitude", value);
    }
    /**
     * Sets the longitude property value. The longitude that the printer is located at.
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("longitude", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the organization property value. The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("organization", value);
    }
    /**
     * Sets the postalCode property value. The postal code that the printer is located in.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("postalCode", value);
    }
    /**
     * Sets the roomDescription property value. The description of the room that the printer is located in.
     * @param value Value to set for the roomDescription property.
     */
    public void setRoomDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roomDescription", value);
    }
    /**
     * Sets the roomName property value. The room that the printer is located in. Only numerical values are supported right now.
     * @param value Value to set for the roomName property.
     */
    public void setRoomName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roomName", value);
    }
    /**
     * Sets the site property value. The site that the printer is located in.
     * @param value Value to set for the site property.
     */
    public void setSite(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("site", value);
    }
    /**
     * Sets the stateOrProvince property value. The state or province that the printer is located in.
     * @param value Value to set for the stateOrProvince property.
     */
    public void setStateOrProvince(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("stateOrProvince", value);
    }
    /**
     * Sets the streetAddress property value. The street address where the printer is located.
     * @param value Value to set for the streetAddress property.
     */
    public void setStreetAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("streetAddress", value);
    }
    /**
     * Sets the subdivision property value. The subdivision that the printer is located in. The elements should be in hierarchical order.
     * @param value Value to set for the subdivision property.
     */
    public void setSubdivision(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("subdivision", value);
    }
    /**
     * Sets the subunit property value. The subunit property
     * @param value Value to set for the subunit property.
     */
    public void setSubunit(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("subunit", value);
    }
}
