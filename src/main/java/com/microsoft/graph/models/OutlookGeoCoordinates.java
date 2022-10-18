package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OutlookGeoCoordinates implements AdditionalDataHolder, Parsable {
    /** The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters. */
    private Double _accuracy;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The altitude of the location. */
    private Double _altitude;
    /** The accuracy of the altitude. */
    private Double _altitudeAccuracy;
    /** The latitude of the location. */
    private Double _latitude;
    /** The longitude of the location. */
    private Double _longitude;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new outlookGeoCoordinates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OutlookGeoCoordinates() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.outlookGeoCoordinates");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a outlookGeoCoordinates
     */
    @javax.annotation.Nonnull
    public static OutlookGeoCoordinates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookGeoCoordinates();
    }
    /**
     * Gets the accuracy property value. The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAccuracy() {
        return this._accuracy;
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
     * Gets the altitude property value. The altitude of the location.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAltitude() {
        return this._altitude;
    }
    /**
     * Gets the altitudeAccuracy property value. The accuracy of the altitude.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAltitudeAccuracy() {
        return this._altitudeAccuracy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OutlookGeoCoordinates currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("accuracy", (n) -> { currentObject.setAccuracy(n.getDoubleValue()); });
            this.put("altitude", (n) -> { currentObject.setAltitude(n.getDoubleValue()); });
            this.put("altitudeAccuracy", (n) -> { currentObject.setAltitudeAccuracy(n.getDoubleValue()); });
            this.put("latitude", (n) -> { currentObject.setLatitude(n.getDoubleValue()); });
            this.put("longitude", (n) -> { currentObject.setLongitude(n.getDoubleValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the latitude property value. The latitude of the location.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLatitude() {
        return this._latitude;
    }
    /**
     * Gets the longitude property value. The longitude of the location.
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("accuracy", this.getAccuracy());
        writer.writeDoubleValue("altitude", this.getAltitude());
        writer.writeDoubleValue("altitudeAccuracy", this.getAltitudeAccuracy());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accuracy property value. The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     * @param value Value to set for the accuracy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccuracy(@javax.annotation.Nullable final Double value) {
        this._accuracy = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the altitude property value. The altitude of the location.
     * @param value Value to set for the altitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAltitude(@javax.annotation.Nullable final Double value) {
        this._altitude = value;
    }
    /**
     * Sets the altitudeAccuracy property value. The accuracy of the altitude.
     * @param value Value to set for the altitudeAccuracy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAltitudeAccuracy(@javax.annotation.Nullable final Double value) {
        this._altitudeAccuracy = value;
    }
    /**
     * Sets the latitude property value. The latitude of the location.
     * @param value Value to set for the latitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatitude(@javax.annotation.Nullable final Double value) {
        this._latitude = value;
    }
    /**
     * Sets the longitude property value. The longitude of the location.
     * @param value Value to set for the longitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLongitude(@javax.annotation.Nullable final Double value) {
        this._longitude = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
