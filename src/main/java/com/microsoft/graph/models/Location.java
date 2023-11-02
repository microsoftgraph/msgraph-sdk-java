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
public class Location implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new Location and sets the default values.
     */
    public Location() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Location
     */
    @jakarta.annotation.Nonnull
    public static Location createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.locationConstraintItem": return new LocationConstraintItem();
            }
        }
        return new Location();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the address property value. The street address of the location.
     * @return a PhysicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.getBackingStore().get("address");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the coordinates property value. The geographic coordinates and elevation of the location.
     * @return a OutlookGeoCoordinates
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinates getCoordinates() {
        return this.getBackingStore().get("coordinates");
    }
    /**
     * Gets the displayName property value. The name associated with the location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.getBackingStore().get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("coordinates", (n) -> { this.setCoordinates(n.getObjectValue(OutlookGeoCoordinates::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("locationEmailAddress", (n) -> { this.setLocationEmailAddress(n.getStringValue()); });
        deserializerMap.put("locationType", (n) -> { this.setLocationType(n.getEnumValue(LocationType.class)); });
        deserializerMap.put("locationUri", (n) -> { this.setLocationUri(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("uniqueId", (n) -> { this.setUniqueId(n.getStringValue()); });
        deserializerMap.put("uniqueIdType", (n) -> { this.setUniqueIdType(n.getEnumValue(LocationUniqueIdType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the locationEmailAddress property value. Optional email address of the location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocationEmailAddress() {
        return this.getBackingStore().get("locationEmailAddress");
    }
    /**
     * Gets the locationType property value. The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
     * @return a LocationType
     */
    @jakarta.annotation.Nullable
    public LocationType getLocationType() {
        return this.getBackingStore().get("locationType");
    }
    /**
     * Gets the locationUri property value. Optional URI representing the location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocationUri() {
        return this.getBackingStore().get("locationUri");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the uniqueId property value. For internal use only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUniqueId() {
        return this.getBackingStore().get("uniqueId");
    }
    /**
     * Gets the uniqueIdType property value. For internal use only.
     * @return a LocationUniqueIdType
     */
    @jakarta.annotation.Nullable
    public LocationUniqueIdType getUniqueIdType() {
        return this.getBackingStore().get("uniqueIdType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("coordinates", this.getCoordinates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("locationEmailAddress", this.getLocationEmailAddress());
        writer.writeEnumValue("locationType", this.getLocationType());
        writer.writeStringValue("locationUri", this.getLocationUri());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("uniqueId", this.getUniqueId());
        writer.writeEnumValue("uniqueIdType", this.getUniqueIdType());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the address property value. The street address of the location.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.getBackingStore().set("address", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the coordinates property value. The geographic coordinates and elevation of the location.
     * @param value Value to set for the coordinates property.
     */
    public void setCoordinates(@jakarta.annotation.Nullable final OutlookGeoCoordinates value) {
        this.getBackingStore().set("coordinates", value);
    }
    /**
     * Sets the displayName property value. The name associated with the location.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("displayName", value);
    }
    /**
     * Sets the locationEmailAddress property value. Optional email address of the location.
     * @param value Value to set for the locationEmailAddress property.
     */
    public void setLocationEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("locationEmailAddress", value);
    }
    /**
     * Sets the locationType property value. The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
     * @param value Value to set for the locationType property.
     */
    public void setLocationType(@jakarta.annotation.Nullable final LocationType value) {
        this.getBackingStore().set("locationType", value);
    }
    /**
     * Sets the locationUri property value. Optional URI representing the location.
     * @param value Value to set for the locationUri property.
     */
    public void setLocationUri(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("locationUri", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the uniqueId property value. For internal use only.
     * @param value Value to set for the uniqueId property.
     */
    public void setUniqueId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("uniqueId", value);
    }
    /**
     * Sets the uniqueIdType property value. For internal use only.
     * @param value Value to set for the uniqueIdType property.
     */
    public void setUniqueIdType(@jakarta.annotation.Nullable final LocationUniqueIdType value) {
        this.getBackingStore().set("uniqueIdType", value);
    }
}
