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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Photo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new Photo and sets the default values.
     */
    public Photo() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Photo
     */
    @jakarta.annotation.Nonnull
    public static Photo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Photo();
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
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the cameraMake property value. Camera manufacturer. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCameraMake() {
        return this.getBackingStore().get("cameraMake");
    }
    /**
     * Gets the cameraModel property value. Camera model. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCameraModel() {
        return this.getBackingStore().get("cameraModel");
    }
    /**
     * Gets the exposureDenominator property value. The denominator for the exposure time fraction from the camera. Read-only.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getExposureDenominator() {
        return this.getBackingStore().get("exposureDenominator");
    }
    /**
     * Gets the exposureNumerator property value. The numerator for the exposure time fraction from the camera. Read-only.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getExposureNumerator() {
        return this.getBackingStore().get("exposureNumerator");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getFNumber() {
        return this.getBackingStore().get("fNumber");
    }
    /**
     * Gets the focalLength property value. The focal length from the camera. Read-only.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getFocalLength() {
        return this.getBackingStore().get("focalLength");
    }
    /**
     * Gets the iso property value. The ISO value from the camera. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIso() {
        return this.getBackingStore().get("iso");
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
     * Gets the orientation property value. The orientation value from the camera. Writable on OneDrive Personal.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOrientation() {
        return this.getBackingStore().get("orientation");
    }
    /**
     * Gets the takenDateTime property value. Represents the date and time the photo was taken. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTakenDateTime() {
        return this.getBackingStore().get("takenDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the cameraMake property value. Camera manufacturer. Read-only.
     * @param value Value to set for the cameraMake property.
     */
    public void setCameraMake(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("cameraMake", value);
    }
    /**
     * Sets the cameraModel property value. Camera model. Read-only.
     * @param value Value to set for the cameraModel property.
     */
    public void setCameraModel(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("cameraModel", value);
    }
    /**
     * Sets the exposureDenominator property value. The denominator for the exposure time fraction from the camera. Read-only.
     * @param value Value to set for the exposureDenominator property.
     */
    public void setExposureDenominator(@jakarta.annotation.Nullable final Double value) {
        this.getBackingStore().set("exposureDenominator", value);
    }
    /**
     * Sets the exposureNumerator property value. The numerator for the exposure time fraction from the camera. Read-only.
     * @param value Value to set for the exposureNumerator property.
     */
    public void setExposureNumerator(@jakarta.annotation.Nullable final Double value) {
        this.getBackingStore().set("exposureNumerator", value);
    }
    /**
     * Sets the fNumber property value. The F-stop value from the camera. Read-only.
     * @param value Value to set for the fNumber property.
     */
    public void setFNumber(@jakarta.annotation.Nullable final Double value) {
        this.getBackingStore().set("fNumber", value);
    }
    /**
     * Sets the focalLength property value. The focal length from the camera. Read-only.
     * @param value Value to set for the focalLength property.
     */
    public void setFocalLength(@jakarta.annotation.Nullable final Double value) {
        this.getBackingStore().set("focalLength", value);
    }
    /**
     * Sets the iso property value. The ISO value from the camera. Read-only.
     * @param value Value to set for the iso property.
     */
    public void setIso(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("iso", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the orientation property value. The orientation value from the camera. Writable on OneDrive Personal.
     * @param value Value to set for the orientation property.
     */
    public void setOrientation(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("orientation", value);
    }
    /**
     * Sets the takenDateTime property value. Represents the date and time the photo was taken. Read-only.
     * @param value Value to set for the takenDateTime property.
     */
    public void setTakenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("takenDateTime", value);
    }
}
