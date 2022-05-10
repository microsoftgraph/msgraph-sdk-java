package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SignInLocation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity. */
    private String _city;
    /** Provides the country code info (2 letter code) where the sign-in originated.  This is calculated using latitude/longitude information from the sign-in activity. */
    private String _countryOrRegion;
    /** Provides the latitude, longitude and altitude where the sign-in originated. */
    private GeoCoordinates _geoCoordinates;
    /** Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity. */
    private String _state;
    /**
     * Instantiates a new signInLocation and sets the default values.
     * @return a void
     */
    public SignInLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signInLocation
     */
    @javax.annotation.Nonnull
    public static SignInLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInLocation();
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
     * Gets the city property value. Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the countryOrRegion property value. Provides the country code info (2 letter code) where the sign-in originated.  This is calculated using latitude/longitude information from the sign-in activity.
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
        final SignInLocation currentObject = this;
        return new HashMap<>(4) {{
            this.put("city", (n) -> { currentObject.setCity(n.getStringValue()); });
            this.put("countryOrRegion", (n) -> { currentObject.setCountryOrRegion(n.getStringValue()); });
            this.put("geoCoordinates", (n) -> { currentObject.setGeoCoordinates(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
        }};
    }
    /**
     * Gets the geoCoordinates property value. Provides the latitude, longitude and altitude where the sign-in originated.
     * @return a geoCoordinates
     */
    @javax.annotation.Nullable
    public GeoCoordinates getGeoCoordinates() {
        return this._geoCoordinates;
    }
    /**
     * Gets the state property value. Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("countryOrRegion", this.getCountryOrRegion());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
        writer.writeStringValue("state", this.getState());
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
     * Sets the city property value. Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity.
     * @param value Value to set for the city property.
     * @return a void
     */
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the countryOrRegion property value. Provides the country code info (2 letter code) where the sign-in originated.  This is calculated using latitude/longitude information from the sign-in activity.
     * @param value Value to set for the countryOrRegion property.
     * @return a void
     */
    public void setCountryOrRegion(@javax.annotation.Nullable final String value) {
        this._countryOrRegion = value;
    }
    /**
     * Sets the geoCoordinates property value. Provides the latitude, longitude and altitude where the sign-in originated.
     * @param value Value to set for the geoCoordinates property.
     * @return a void
     */
    public void setGeoCoordinates(@javax.annotation.Nullable final GeoCoordinates value) {
        this._geoCoordinates = value;
    }
    /**
     * Sets the state property value. Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the sign-in activity.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
}
