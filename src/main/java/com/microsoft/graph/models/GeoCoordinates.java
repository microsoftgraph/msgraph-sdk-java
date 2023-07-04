package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GeoCoordinates implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional. The altitude (height), in feet,  above sea level for the item. Read-only.
     */
    private Double altitude;
    /**
     * Optional. The latitude, in decimal, for the item. Read-only.
     */
    private Double latitude;
    /**
     * Optional. The longitude, in decimal, for the item. Read-only.
     */
    private Double longitude;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new geoCoordinates and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GeoCoordinates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a geoCoordinates
     */
    @javax.annotation.Nonnull
    public static GeoCoordinates createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GeoCoordinates();
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
     * Gets the altitude property value. Optional. The altitude (height), in feet,  above sea level for the item. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAltitude() {
        return this.altitude;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("altitude", (n) -> { this.setAltitude(n.getDoubleValue()); });
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latitude property value. Optional. The latitude, in decimal, for the item. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the longitude property value. Optional. The longitude, in decimal, for the item. Read-only.
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("altitude", this.getAltitude());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the altitude property value. Optional. The altitude (height), in feet,  above sea level for the item. Read-only.
     * @param value Value to set for the altitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAltitude(@javax.annotation.Nullable final Double value) {
        this.altitude = value;
    }
    /**
     * Sets the latitude property value. Optional. The latitude, in decimal, for the item. Read-only.
     * @param value Value to set for the latitude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatitude(@javax.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the longitude property value. Optional. The longitude, in decimal, for the item. Read-only.
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
}
