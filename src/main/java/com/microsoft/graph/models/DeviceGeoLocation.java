package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device location
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceGeoLocation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new DeviceGeoLocation and sets the default values.
     */
    public DeviceGeoLocation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceGeoLocation
     */
    @jakarta.annotation.Nonnull
    public static DeviceGeoLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceGeoLocation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the altitude property value. Altitude, given in meters above sea level
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAltitude() {
        return this.backingStore.get("altitude");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("altitude", (n) -> { this.setAltitude(n.getDoubleValue()); });
        deserializerMap.put("heading", (n) -> { this.setHeading(n.getDoubleValue()); });
        deserializerMap.put("horizontalAccuracy", (n) -> { this.setHorizontalAccuracy(n.getDoubleValue()); });
        deserializerMap.put("lastCollectedDateTime", (n) -> { this.setLastCollectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("speed", (n) -> { this.setSpeed(n.getDoubleValue()); });
        deserializerMap.put("verticalAccuracy", (n) -> { this.setVerticalAccuracy(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the heading property value. Heading in degrees from true north
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getHeading() {
        return this.backingStore.get("heading");
    }
    /**
     * Gets the horizontalAccuracy property value. Accuracy of longitude and latitude in meters
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getHorizontalAccuracy() {
        return this.backingStore.get("horizontalAccuracy");
    }
    /**
     * Gets the lastCollectedDateTime property value. Time at which location was recorded, relative to UTC
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCollectedDateTime() {
        return this.backingStore.get("lastCollectedDateTime");
    }
    /**
     * Gets the latitude property value. Latitude coordinate of the device's location
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.backingStore.get("latitude");
    }
    /**
     * Gets the longitude property value. Longitude coordinate of the device's location
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.backingStore.get("longitude");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the speed property value. Speed the device is traveling in meters per second
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSpeed() {
        return this.backingStore.get("speed");
    }
    /**
     * Gets the verticalAccuracy property value. Accuracy of altitude in meters
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getVerticalAccuracy() {
        return this.backingStore.get("verticalAccuracy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("altitude", this.getAltitude());
        writer.writeDoubleValue("heading", this.getHeading());
        writer.writeDoubleValue("horizontalAccuracy", this.getHorizontalAccuracy());
        writer.writeOffsetDateTimeValue("lastCollectedDateTime", this.getLastCollectedDateTime());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("speed", this.getSpeed());
        writer.writeDoubleValue("verticalAccuracy", this.getVerticalAccuracy());
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
     * Sets the altitude property value. Altitude, given in meters above sea level
     * @param value Value to set for the altitude property.
     */
    public void setAltitude(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("altitude", value);
    }
    /**
     * Sets the heading property value. Heading in degrees from true north
     * @param value Value to set for the heading property.
     */
    public void setHeading(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("heading", value);
    }
    /**
     * Sets the horizontalAccuracy property value. Accuracy of longitude and latitude in meters
     * @param value Value to set for the horizontalAccuracy property.
     */
    public void setHorizontalAccuracy(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("horizontalAccuracy", value);
    }
    /**
     * Sets the lastCollectedDateTime property value. Time at which location was recorded, relative to UTC
     * @param value Value to set for the lastCollectedDateTime property.
     */
    public void setLastCollectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCollectedDateTime", value);
    }
    /**
     * Sets the latitude property value. Latitude coordinate of the device's location
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("latitude", value);
    }
    /**
     * Sets the longitude property value. Longitude coordinate of the device's location
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
     * Sets the speed property value. Speed the device is traveling in meters per second
     * @param value Value to set for the speed property.
     */
    public void setSpeed(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("speed", value);
    }
    /**
     * Sets the verticalAccuracy property value. Accuracy of altitude in meters
     * @param value Value to set for the verticalAccuracy property.
     */
    public void setVerticalAccuracy(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("verticalAccuracy", value);
    }
}
