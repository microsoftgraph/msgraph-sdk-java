package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device location
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceGeoLocation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Altitude, given in meters above sea level
     */
    private Double altitude;
    /**
     * Heading in degrees from true north
     */
    private Double heading;
    /**
     * Accuracy of longitude and latitude in meters
     */
    private Double horizontalAccuracy;
    /**
     * Time at which location was recorded, relative to UTC
     */
    private OffsetDateTime lastCollectedDateTime;
    /**
     * Latitude coordinate of the device's location
     */
    private Double latitude;
    /**
     * Longitude coordinate of the device's location
     */
    private Double longitude;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Speed the device is traveling in meters per second
     */
    private Double speed;
    /**
     * Accuracy of altitude in meters
     */
    private Double verticalAccuracy;
    /**
     * Instantiates a new deviceGeoLocation and sets the default values.
     */
    public DeviceGeoLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceGeoLocation
     */
    @jakarta.annotation.Nonnull
    public static DeviceGeoLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceGeoLocation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the altitude property value. Altitude, given in meters above sea level
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getAltitude() {
        return this.altitude;
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
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getHeading() {
        return this.heading;
    }
    /**
     * Gets the horizontalAccuracy property value. Accuracy of longitude and latitude in meters
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }
    /**
     * Gets the lastCollectedDateTime property value. Time at which location was recorded, relative to UTC
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCollectedDateTime() {
        return this.lastCollectedDateTime;
    }
    /**
     * Gets the latitude property value. Latitude coordinate of the device's location
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the longitude property value. Longitude coordinate of the device's location
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the speed property value. Speed the device is traveling in meters per second
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getSpeed() {
        return this.speed;
    }
    /**
     * Gets the verticalAccuracy property value. Accuracy of altitude in meters
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getVerticalAccuracy() {
        return this.verticalAccuracy;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the altitude property value. Altitude, given in meters above sea level
     * @param value Value to set for the altitude property.
     */
    public void setAltitude(@jakarta.annotation.Nullable final Double value) {
        this.altitude = value;
    }
    /**
     * Sets the heading property value. Heading in degrees from true north
     * @param value Value to set for the heading property.
     */
    public void setHeading(@jakarta.annotation.Nullable final Double value) {
        this.heading = value;
    }
    /**
     * Sets the horizontalAccuracy property value. Accuracy of longitude and latitude in meters
     * @param value Value to set for the horizontalAccuracy property.
     */
    public void setHorizontalAccuracy(@jakarta.annotation.Nullable final Double value) {
        this.horizontalAccuracy = value;
    }
    /**
     * Sets the lastCollectedDateTime property value. Time at which location was recorded, relative to UTC
     * @param value Value to set for the lastCollectedDateTime property.
     */
    public void setLastCollectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastCollectedDateTime = value;
    }
    /**
     * Sets the latitude property value. Latitude coordinate of the device's location
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the longitude property value. Longitude coordinate of the device's location
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.longitude = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the speed property value. Speed the device is traveling in meters per second
     * @param value Value to set for the speed property.
     */
    public void setSpeed(@jakarta.annotation.Nullable final Double value) {
        this.speed = value;
    }
    /**
     * Sets the verticalAccuracy property value. Accuracy of altitude in meters
     * @param value Value to set for the verticalAccuracy property.
     */
    public void setVerticalAccuracy(@jakarta.annotation.Nullable final Double value) {
        this.verticalAccuracy = value;
    }
}
