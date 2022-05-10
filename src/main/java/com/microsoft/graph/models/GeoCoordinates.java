package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GeoCoordinates implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Optional. The altitude (height), in feet,  above sea level for the item. Read-only. */
    private Double _altitude;
    /** Optional. The latitude, in decimal, for the item. Writable on OneDrive Personal. */
    private Double _latitude;
    /** Optional. The longitude, in decimal, for the item. Writable on OneDrive Personal. */
    private Double _longitude;
    /**
     * Instantiates a new geoCoordinates and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * Gets the altitude property value. Optional. The altitude (height), in feet,  above sea level for the item. Read-only.
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
        final GeoCoordinates currentObject = this;
        return new HashMap<>(3) {{
            this.put("altitude", (n) -> { currentObject.setAltitude(n.getDoubleValue()); });
            this.put("latitude", (n) -> { currentObject.setLatitude(n.getDoubleValue()); });
            this.put("longitude", (n) -> { currentObject.setLongitude(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the latitude property value. Optional. The latitude, in decimal, for the item. Writable on OneDrive Personal.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLatitude() {
        return this._latitude;
    }
    /**
     * Gets the longitude property value. Optional. The longitude, in decimal, for the item. Writable on OneDrive Personal.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLongitude() {
        return this._longitude;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("altitude", this.getAltitude());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
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
     * Sets the altitude property value. Optional. The altitude (height), in feet,  above sea level for the item. Read-only.
     * @param value Value to set for the altitude property.
     * @return a void
     */
    public void setAltitude(@javax.annotation.Nullable final Double value) {
        this._altitude = value;
    }
    /**
     * Sets the latitude property value. Optional. The latitude, in decimal, for the item. Writable on OneDrive Personal.
     * @param value Value to set for the latitude property.
     * @return a void
     */
    public void setLatitude(@javax.annotation.Nullable final Double value) {
        this._latitude = value;
    }
    /**
     * Sets the longitude property value. Optional. The longitude, in decimal, for the item. Writable on OneDrive Personal.
     * @param value Value to set for the longitude property.
     * @return a void
     */
    public void setLongitude(@javax.annotation.Nullable final Double value) {
        this._longitude = value;
    }
}
