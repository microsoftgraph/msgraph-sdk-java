package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Photo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Camera manufacturer. Read-only. */
    private String cameraMake;
    /** Camera model. Read-only. */
    private String cameraModel;
    /** The denominator for the exposure time fraction from the camera. Read-only. */
    private Double exposureDenominator;
    /** The numerator for the exposure time fraction from the camera. Read-only. */
    private Double exposureNumerator;
    /** The F-stop value from the camera. Read-only. */
    private Double fNumber;
    /** The focal length from the camera. Read-only. */
    private Double focalLength;
    /** The ISO value from the camera. Read-only. */
    private Integer iso;
    /** The OdataType property */
    private String odataType;
    /** The orientation value from the camera. Writable on OneDrive Personal. */
    private Integer orientation;
    /** Represents the date and time the photo was taken. Read-only. */
    private OffsetDateTime takenDateTime;
    /**
     * Instantiates a new photo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the cameraMake property value. Camera manufacturer. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCameraMake() {
        return this.cameraMake;
    }
    /**
     * Gets the cameraModel property value. Camera model. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCameraModel() {
        return this.cameraModel;
    }
    /**
     * Gets the exposureDenominator property value. The denominator for the exposure time fraction from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getExposureDenominator() {
        return this.exposureDenominator;
    }
    /**
     * Gets the exposureNumerator property value. The numerator for the exposure time fraction from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getExposureNumerator() {
        return this.exposureNumerator;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("cameraMake", (n) -> { this.setCameraMake(n.getStringValue()); });
        deserializerMap.put("cameraModel", (n) -> { this.setCameraModel(n.getStringValue()); });
        deserializerMap.put("exposureDenominator", (n) -> { this.setExposureDenominator(n.getDoubleValue()); });
        deserializerMap.put("exposureNumerator", (n) -> { this.setExposureNumerator(n.getDoubleValue()); });
        deserializerMap.put("fNumber", (n) -> { this.setFNumber(n.getDoubleValue()); });
        deserializerMap.put("focalLength", (n) -> { this.setFocalLength(n.getDoubleValue()); });
        deserializerMap.put("iso", (n) -> { this.setIso(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientation", (n) -> { this.setOrientation(n.getIntegerValue()); });
        deserializerMap.put("takenDateTime", (n) -> { this.setTakenDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fNumber property value. The F-stop value from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getFNumber() {
        return this.fNumber;
    }
    /**
     * Gets the focalLength property value. The focal length from the camera. Read-only.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getFocalLength() {
        return this.focalLength;
    }
    /**
     * Gets the iso property value. The ISO value from the camera. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIso() {
        return this.iso;
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
     * Gets the orientation property value. The orientation value from the camera. Writable on OneDrive Personal.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOrientation() {
        return this.orientation;
    }
    /**
     * Gets the takenDateTime property value. Represents the date and time the photo was taken. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTakenDateTime() {
        return this.takenDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cameraMake", this.getCameraMake());
        writer.writeStringValue("cameraModel", this.getCameraModel());
        writer.writeDoubleValue("exposureDenominator", this.getExposureDenominator());
        writer.writeDoubleValue("exposureNumerator", this.getExposureNumerator());
        writer.writeDoubleValue("fNumber", this.getFNumber());
        writer.writeDoubleValue("focalLength", this.getFocalLength());
        writer.writeIntegerValue("iso", this.getIso());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("orientation", this.getOrientation());
        writer.writeOffsetDateTimeValue("takenDateTime", this.getTakenDateTime());
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
     * Sets the cameraMake property value. Camera manufacturer. Read-only.
     * @param value Value to set for the cameraMake property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraMake(@javax.annotation.Nullable final String value) {
        this.cameraMake = value;
    }
    /**
     * Sets the cameraModel property value. Camera model. Read-only.
     * @param value Value to set for the cameraModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraModel(@javax.annotation.Nullable final String value) {
        this.cameraModel = value;
    }
    /**
     * Sets the exposureDenominator property value. The denominator for the exposure time fraction from the camera. Read-only.
     * @param value Value to set for the exposureDenominator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExposureDenominator(@javax.annotation.Nullable final Double value) {
        this.exposureDenominator = value;
    }
    /**
     * Sets the exposureNumerator property value. The numerator for the exposure time fraction from the camera. Read-only.
     * @param value Value to set for the exposureNumerator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExposureNumerator(@javax.annotation.Nullable final Double value) {
        this.exposureNumerator = value;
    }
    /**
     * Sets the fNumber property value. The F-stop value from the camera. Read-only.
     * @param value Value to set for the fNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFNumber(@javax.annotation.Nullable final Double value) {
        this.fNumber = value;
    }
    /**
     * Sets the focalLength property value. The focal length from the camera. Read-only.
     * @param value Value to set for the focalLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFocalLength(@javax.annotation.Nullable final Double value) {
        this.focalLength = value;
    }
    /**
     * Sets the iso property value. The ISO value from the camera. Read-only.
     * @param value Value to set for the iso property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIso(@javax.annotation.Nullable final Integer value) {
        this.iso = value;
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
    /**
     * Sets the orientation property value. The orientation value from the camera. Writable on OneDrive Personal.
     * @param value Value to set for the orientation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrientation(@javax.annotation.Nullable final Integer value) {
        this.orientation = value;
    }
    /**
     * Sets the takenDateTime property value. Represents the date and time the photo was taken. Read-only.
     * @param value Value to set for the takenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTakenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.takenDateTime = value;
    }
}
