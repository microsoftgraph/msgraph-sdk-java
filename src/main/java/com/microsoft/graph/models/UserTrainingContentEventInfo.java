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
public class UserTrainingContentEventInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new UserTrainingContentEventInfo and sets the default values.
     */
    public UserTrainingContentEventInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserTrainingContentEventInfo
     */
    @jakarta.annotation.Nonnull
    public static UserTrainingContentEventInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTrainingContentEventInfo();
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
     * Gets the browser property value. Browser of the user from where the training event was generated.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.backingStore.get("browser");
    }
    /**
     * Gets the contentDateTime property value. Date and time of the training content playback by the user.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getContentDateTime() {
        return this.backingStore.get("contentDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("contentDateTime", (n) -> { this.setContentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osPlatformDeviceDetails", (n) -> { this.setOsPlatformDeviceDetails(n.getStringValue()); });
        deserializerMap.put("potentialScoreImpact", (n) -> { this.setPotentialScoreImpact(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IP address of the user for the training event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
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
     * Gets the osPlatformDeviceDetails property value. The operating system, platform, and device details of the user for the training event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsPlatformDeviceDetails() {
        return this.backingStore.get("osPlatformDeviceDetails");
    }
    /**
     * Gets the potentialScoreImpact property value. Potential improvement in the tenant security posture after completion of the training by the user.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getPotentialScoreImpact() {
        return this.backingStore.get("potentialScoreImpact");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeOffsetDateTimeValue("contentDateTime", this.getContentDateTime());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osPlatformDeviceDetails", this.getOsPlatformDeviceDetails());
        writer.writeDoubleValue("potentialScoreImpact", this.getPotentialScoreImpact());
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
     * Sets the browser property value. Browser of the user from where the training event was generated.
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browser", value);
    }
    /**
     * Sets the contentDateTime property value. Date and time of the training content playback by the user.
     * @param value Value to set for the contentDateTime property.
     */
    public void setContentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("contentDateTime", value);
    }
    /**
     * Sets the ipAddress property value. IP address of the user for the training event.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the osPlatformDeviceDetails property value. The operating system, platform, and device details of the user for the training event.
     * @param value Value to set for the osPlatformDeviceDetails property.
     */
    public void setOsPlatformDeviceDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osPlatformDeviceDetails", value);
    }
    /**
     * Sets the potentialScoreImpact property value. Potential improvement in the tenant security posture after completion of the training by the user.
     * @param value Value to set for the potentialScoreImpact property.
     */
    public void setPotentialScoreImpact(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("potentialScoreImpact", value);
    }
}
