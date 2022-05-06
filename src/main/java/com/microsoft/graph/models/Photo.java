package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Photo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Camera manufacturer. Read-only.  */
    private String _cameraMake;
    /** Camera model. Read-only.  */
    private String _cameraModel;
    /** The denominator for the exposure time fraction from the camera. Read-only.  */
    private Double _exposureDenominator;
    /** The numerator for the exposure time fraction from the camera. Read-only.  */
    private Double _exposureNumerator;
    /** The F-stop value from the camera. Read-only.  */
    private Double _fNumber;
    /** The focal length from the camera. Read-only.  */
    private Double _focalLength;
    /** The ISO value from the camera. Read-only.  */
    private Integer _iso;
    /** The orientation value from the camera. Writable on OneDrive Personal.  */
    private Integer _orientation;
    /** The date and time the photo was taken in UTC time. Read-only.  */
    private OffsetDateTime _takenDateTime;
    /**
     * Instantiates a new photo and sets the default values.
     * @return a void
     */
    public Photo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a photo
     */
    @javax.annotation.Nonnull
    public static Photo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Photo();
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
     * Gets the cameraMake property value. Camera manufacturer. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCameraMake() {
        return this._cameraMake;
    }
    /**
     * Gets the cameraModel property value. Camera model. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCameraModel() {
        return this._cameraModel;
    }
    /**
     * Gets the exposureDenominator property value. The denominator for the exposure time fraction from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getExposureDenominator() {
        return this._exposureDenominator;
    }
    /**
     * Gets the exposureNumerator property value. The numerator for the exposure time fraction from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getExposureNumerator() {
        return this._exposureNumerator;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Photo currentObject = this;
        return new HashMap<>(9) {{
            this.put("cameraMake", (n) -> { currentObject.setCameraMake(n.getStringValue()); });
            this.put("cameraModel", (n) -> { currentObject.setCameraModel(n.getStringValue()); });
            this.put("exposureDenominator", (n) -> { currentObject.setExposureDenominator(n.getDoubleValue()); });
            this.put("exposureNumerator", (n) -> { currentObject.setExposureNumerator(n.getDoubleValue()); });
            this.put("fNumber", (n) -> { currentObject.setFNumber(n.getDoubleValue()); });
            this.put("focalLength", (n) -> { currentObject.setFocalLength(n.getDoubleValue()); });
            this.put("iso", (n) -> { currentObject.setIso(n.getIntegerValue()); });
            this.put("orientation", (n) -> { currentObject.setOrientation(n.getIntegerValue()); });
            this.put("takenDateTime", (n) -> { currentObject.setTakenDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the fNumber property value. The F-stop value from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getFNumber() {
        return this._fNumber;
    }
    /**
     * Gets the focalLength property value. The focal length from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getFocalLength() {
        return this._focalLength;
    }
    /**
     * Gets the iso property value. The ISO value from the camera. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIso() {
        return this._iso;
    }
    /**
     * Gets the orientation property value. The orientation value from the camera. Writable on OneDrive Personal.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOrientation() {
        return this._orientation;
    }
    /**
     * Gets the takenDateTime property value. The date and time the photo was taken in UTC time. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTakenDateTime() {
        return this._takenDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cameraMake", this.getCameraMake());
        writer.writeStringValue("cameraModel", this.getCameraModel());
        writer.writeDoubleValue("exposureDenominator", this.getExposureDenominator());
        writer.writeDoubleValue("exposureNumerator", this.getExposureNumerator());
        writer.writeDoubleValue("fNumber", this.getFNumber());
        writer.writeDoubleValue("focalLength", this.getFocalLength());
        writer.writeIntegerValue("iso", this.getIso());
        writer.writeIntegerValue("orientation", this.getOrientation());
        writer.writeOffsetDateTimeValue("takenDateTime", this.getTakenDateTime());
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
     * Sets the cameraMake property value. Camera manufacturer. Read-only.
     * @param value Value to set for the cameraMake property.
     * @return a void
     */
    public void setCameraMake(@javax.annotation.Nullable final String value) {
        this._cameraMake = value;
    }
    /**
     * Sets the cameraModel property value. Camera model. Read-only.
     * @param value Value to set for the cameraModel property.
     * @return a void
     */
    public void setCameraModel(@javax.annotation.Nullable final String value) {
        this._cameraModel = value;
    }
    /**
     * Sets the exposureDenominator property value. The denominator for the exposure time fraction from the camera. Read-only.
     * @param value Value to set for the exposureDenominator property.
     * @return a void
     */
    public void setExposureDenominator(@javax.annotation.Nullable final Double value) {
        this._exposureDenominator = value;
    }
    /**
     * Sets the exposureNumerator property value. The numerator for the exposure time fraction from the camera. Read-only.
     * @param value Value to set for the exposureNumerator property.
     * @return a void
     */
    public void setExposureNumerator(@javax.annotation.Nullable final Double value) {
        this._exposureNumerator = value;
    }
    /**
     * Sets the fNumber property value. The F-stop value from the camera. Read-only.
     * @param value Value to set for the fNumber property.
     * @return a void
     */
    public void setFNumber(@javax.annotation.Nullable final Double value) {
        this._fNumber = value;
    }
    /**
     * Sets the focalLength property value. The focal length from the camera. Read-only.
     * @param value Value to set for the focalLength property.
     * @return a void
     */
    public void setFocalLength(@javax.annotation.Nullable final Double value) {
        this._focalLength = value;
    }
    /**
     * Sets the iso property value. The ISO value from the camera. Read-only.
     * @param value Value to set for the iso property.
     * @return a void
     */
    public void setIso(@javax.annotation.Nullable final Integer value) {
        this._iso = value;
    }
    /**
     * Sets the orientation property value. The orientation value from the camera. Writable on OneDrive Personal.
     * @param value Value to set for the orientation property.
     * @return a void
     */
    public void setOrientation(@javax.annotation.Nullable final Integer value) {
        this._orientation = value;
    }
    /**
     * Sets the takenDateTime property value. The date and time the photo was taken in UTC time. Read-only.
     * @param value Value to set for the takenDateTime property.
     * @return a void
     */
    public void setTakenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._takenDateTime = value;
    }
}
