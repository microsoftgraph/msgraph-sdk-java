package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device location */
public class DeviceGeoLocation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Altitude, given in meters above sea level */
    private Double _altitude;
    /** Heading in degrees from true north */
    private Double _heading;
    /** Accuracy of longitude and latitude in meters */
    private Double _horizontalAccuracy;
    /** Time at which location was recorded, relative to UTC */
    private OffsetDateTime _lastCollectedDateTime;
    /** Latitude coordinate of the device's location */
    private Double _latitude;
    /** Longitude coordinate of the device's location */
    private Double _longitude;
    /** The OdataType property */
    private String _odataType;
    /** Speed the device is traveling in meters per second */
    private Double _speed;
    /** Accuracy of altitude in meters */
    private Double _verticalAccuracy;
    /**
     * Instantiates a new deviceGeoLocation and sets the default values.
     * @return a void
     */
    public DeviceGeoLocation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceGeoLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceGeoLocation
     */
    @javax.annotation.Nonnull
    public static DeviceGeoLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceGeoLocation();
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
     * Gets the altitude property value. Altitude, given in meters above sea level
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAltitude() {
        return this._altitude;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceGeoLocation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(9) {{
            this.put("altitude", (n) -> { currentObject.setAltitude(n.getDoubleValue()); });
            this.put("heading", (n) -> { currentObject.setHeading(n.getDoubleValue()); });
            this.put("horizontalAccuracy", (n) -> { currentObject.setHorizontalAccuracy(n.getDoubleValue()); });
            this.put("lastCollectedDateTime", (n) -> { currentObject.setLastCollectedDateTime(n.getOffsetDateTimeValue()); });
            this.put("latitude", (n) -> { currentObject.setLatitude(n.getDoubleValue()); });
            this.put("longitude", (n) -> { currentObject.setLongitude(n.getDoubleValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("speed", (n) -> { currentObject.setSpeed(n.getDoubleValue()); });
            this.put("verticalAccuracy", (n) -> { currentObject.setVerticalAccuracy(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the heading property value. Heading in degrees from true north
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getHeading() {
        return this._heading;
    }
    /**
     * Gets the horizontalAccuracy property value. Accuracy of longitude and latitude in meters
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getHorizontalAccuracy() {
        return this._horizontalAccuracy;
    }
    /**
     * Gets the lastCollectedDateTime property value. Time at which location was recorded, relative to UTC
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCollectedDateTime() {
        return this._lastCollectedDateTime;
    }
    /**
     * Gets the latitude property value. Latitude coordinate of the device's location
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLatitude() {
        return this._latitude;
    }
    /**
     * Gets the longitude property value. Longitude coordinate of the device's location
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLongitude() {
        return this._longitude;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the speed property value. Speed the device is traveling in meters per second
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSpeed() {
        return this._speed;
    }
    /**
     * Gets the verticalAccuracy property value. Accuracy of altitude in meters
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getVerticalAccuracy() {
        return this._verticalAccuracy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the altitude property value. Altitude, given in meters above sea level
     * @param value Value to set for the altitude property.
     * @return a void
     */
    public void setAltitude(@javax.annotation.Nullable final Double value) {
        this._altitude = value;
    }
    /**
     * Sets the heading property value. Heading in degrees from true north
     * @param value Value to set for the heading property.
     * @return a void
     */
    public void setHeading(@javax.annotation.Nullable final Double value) {
        this._heading = value;
    }
    /**
     * Sets the horizontalAccuracy property value. Accuracy of longitude and latitude in meters
     * @param value Value to set for the horizontalAccuracy property.
     * @return a void
     */
    public void setHorizontalAccuracy(@javax.annotation.Nullable final Double value) {
        this._horizontalAccuracy = value;
    }
    /**
     * Sets the lastCollectedDateTime property value. Time at which location was recorded, relative to UTC
     * @param value Value to set for the lastCollectedDateTime property.
     * @return a void
     */
    public void setLastCollectedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCollectedDateTime = value;
    }
    /**
     * Sets the latitude property value. Latitude coordinate of the device's location
     * @param value Value to set for the latitude property.
     * @return a void
     */
    public void setLatitude(@javax.annotation.Nullable final Double value) {
        this._latitude = value;
    }
    /**
     * Sets the longitude property value. Longitude coordinate of the device's location
     * @param value Value to set for the longitude property.
     * @return a void
     */
    public void setLongitude(@javax.annotation.Nullable final Double value) {
        this._longitude = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the speed property value. Speed the device is traveling in meters per second
     * @param value Value to set for the speed property.
     * @return a void
     */
    public void setSpeed(@javax.annotation.Nullable final Double value) {
        this._speed = value;
    }
    /**
     * Sets the verticalAccuracy property value. Accuracy of altitude in meters
     * @param value Value to set for the verticalAccuracy property.
     * @return a void
     */
    public void setVerticalAccuracy(@javax.annotation.Nullable final Double value) {
        this._verticalAccuracy = value;
    }
}
