package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceInfo} and sets the default values.
     */
    public DeviceInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceInfo}
     */
    @jakarta.annotation.Nonnull
    public static DeviceInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the captureDeviceDriver property value. Name of the capture device driver used by the media endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptureDeviceDriver() {
        return this.backingStore.get("captureDeviceDriver");
    }
    /**
     * Gets the captureDeviceName property value. Name of the capture device used by the media endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaptureDeviceName() {
        return this.backingStore.get("captureDeviceName");
    }
    /**
     * Gets the captureNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the capture device was not working properly.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getCaptureNotFunctioningEventRatio() {
        return this.backingStore.get("captureNotFunctioningEventRatio");
    }
    /**
     * Gets the cpuInsufficentEventRatio property value. Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor quality of the audio sent and received.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getCpuInsufficentEventRatio() {
        return this.backingStore.get("cpuInsufficentEventRatio");
    }
    /**
     * Gets the deviceClippingEventRatio property value. Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the audio being sent.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getDeviceClippingEventRatio() {
        return this.backingStore.get("deviceClippingEventRatio");
    }
    /**
     * Gets the deviceGlitchEventRatio property value. Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor quality of the audio being sent or received.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getDeviceGlitchEventRatio() {
        return this.backingStore.get("deviceGlitchEventRatio");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
        deserializerMap.put("captureDeviceDriver", (n) -> { this.setCaptureDeviceDriver(n.getStringValue()); });
        deserializerMap.put("captureDeviceName", (n) -> { this.setCaptureDeviceName(n.getStringValue()); });
        deserializerMap.put("captureNotFunctioningEventRatio", (n) -> { this.setCaptureNotFunctioningEventRatio(n.getFloatValue()); });
        deserializerMap.put("cpuInsufficentEventRatio", (n) -> { this.setCpuInsufficentEventRatio(n.getFloatValue()); });
        deserializerMap.put("deviceClippingEventRatio", (n) -> { this.setDeviceClippingEventRatio(n.getFloatValue()); });
        deserializerMap.put("deviceGlitchEventRatio", (n) -> { this.setDeviceGlitchEventRatio(n.getFloatValue()); });
        deserializerMap.put("howlingEventCount", (n) -> { this.setHowlingEventCount(n.getIntegerValue()); });
        deserializerMap.put("initialSignalLevelRootMeanSquare", (n) -> { this.setInitialSignalLevelRootMeanSquare(n.getFloatValue()); });
        deserializerMap.put("lowSpeechLevelEventRatio", (n) -> { this.setLowSpeechLevelEventRatio(n.getFloatValue()); });
        deserializerMap.put("lowSpeechToNoiseEventRatio", (n) -> { this.setLowSpeechToNoiseEventRatio(n.getFloatValue()); });
        deserializerMap.put("micGlitchRate", (n) -> { this.setMicGlitchRate(n.getFloatValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("receivedNoiseLevel", (n) -> { this.setReceivedNoiseLevel(n.getIntegerValue()); });
        deserializerMap.put("receivedSignalLevel", (n) -> { this.setReceivedSignalLevel(n.getIntegerValue()); });
        deserializerMap.put("renderDeviceDriver", (n) -> { this.setRenderDeviceDriver(n.getStringValue()); });
        deserializerMap.put("renderDeviceName", (n) -> { this.setRenderDeviceName(n.getStringValue()); });
        deserializerMap.put("renderMuteEventRatio", (n) -> { this.setRenderMuteEventRatio(n.getFloatValue()); });
        deserializerMap.put("renderNotFunctioningEventRatio", (n) -> { this.setRenderNotFunctioningEventRatio(n.getFloatValue()); });
        deserializerMap.put("renderZeroVolumeEventRatio", (n) -> { this.setRenderZeroVolumeEventRatio(n.getFloatValue()); });
        deserializerMap.put("sentNoiseLevel", (n) -> { this.setSentNoiseLevel(n.getIntegerValue()); });
        deserializerMap.put("sentSignalLevel", (n) -> { this.setSentSignalLevel(n.getIntegerValue()); });
        deserializerMap.put("speakerGlitchRate", (n) -> { this.setSpeakerGlitchRate(n.getFloatValue()); });
        return deserializerMap;
    }
    /**
     * Gets the howlingEventCount property value. Number of times during the call that the media endpoint detected howling or screeching audio.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHowlingEventCount() {
        return this.backingStore.get("howlingEventCount");
    }
    /**
     * Gets the initialSignalLevelRootMeanSquare property value. The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getInitialSignalLevelRootMeanSquare() {
        return this.backingStore.get("initialSignalLevelRootMeanSquare");
    }
    /**
     * Gets the lowSpeechLevelEventRatio property value. Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being sent.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getLowSpeechLevelEventRatio() {
        return this.backingStore.get("lowSpeechLevelEventRatio");
    }
    /**
     * Gets the lowSpeechToNoiseEventRatio property value. Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio being sent.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getLowSpeechToNoiseEventRatio() {
        return this.backingStore.get("lowSpeechToNoiseEventRatio");
    }
    /**
     * Gets the micGlitchRate property value. Glitches per 5 minute interval for the media endpoint's microphone.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getMicGlitchRate() {
        return this.backingStore.get("micGlitchRate");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the receivedNoiseLevel property value. Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReceivedNoiseLevel() {
        return this.backingStore.get("receivedNoiseLevel");
    }
    /**
     * Gets the receivedSignalLevel property value. Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReceivedSignalLevel() {
        return this.backingStore.get("receivedSignalLevel");
    }
    /**
     * Gets the renderDeviceDriver property value. Name of the render device driver used by the media endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRenderDeviceDriver() {
        return this.backingStore.get("renderDeviceDriver");
    }
    /**
     * Gets the renderDeviceName property value. Name of the render device used by the media endpoint.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRenderDeviceName() {
        return this.backingStore.get("renderDeviceName");
    }
    /**
     * Gets the renderMuteEventRatio property value. Fraction of the call that media endpoint detected device render is muted.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getRenderMuteEventRatio() {
        return this.backingStore.get("renderMuteEventRatio");
    }
    /**
     * Gets the renderNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the render device was not working properly.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getRenderNotFunctioningEventRatio() {
        return this.backingStore.get("renderNotFunctioningEventRatio");
    }
    /**
     * Gets the renderZeroVolumeEventRatio property value. Fraction of the call that media endpoint detected device render volume is set to 0.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getRenderZeroVolumeEventRatio() {
        return this.backingStore.get("renderZeroVolumeEventRatio");
    }
    /**
     * Gets the sentNoiseLevel property value. Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSentNoiseLevel() {
        return this.backingStore.get("sentNoiseLevel");
    }
    /**
     * Gets the sentSignalLevel property value. Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSentSignalLevel() {
        return this.backingStore.get("sentSignalLevel");
    }
    /**
     * Gets the speakerGlitchRate property value. Glitches per 5 minute internal for the media endpoint's loudspeaker.
     * @return a {@link Float}
     */
    @jakarta.annotation.Nullable
    public Float getSpeakerGlitchRate() {
        return this.backingStore.get("speakerGlitchRate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("captureDeviceDriver", this.getCaptureDeviceDriver());
        writer.writeStringValue("captureDeviceName", this.getCaptureDeviceName());
        writer.writeFloatValue("captureNotFunctioningEventRatio", this.getCaptureNotFunctioningEventRatio());
        writer.writeFloatValue("cpuInsufficentEventRatio", this.getCpuInsufficentEventRatio());
        writer.writeFloatValue("deviceClippingEventRatio", this.getDeviceClippingEventRatio());
        writer.writeFloatValue("deviceGlitchEventRatio", this.getDeviceGlitchEventRatio());
        writer.writeIntegerValue("howlingEventCount", this.getHowlingEventCount());
        writer.writeFloatValue("initialSignalLevelRootMeanSquare", this.getInitialSignalLevelRootMeanSquare());
        writer.writeFloatValue("lowSpeechLevelEventRatio", this.getLowSpeechLevelEventRatio());
        writer.writeFloatValue("lowSpeechToNoiseEventRatio", this.getLowSpeechToNoiseEventRatio());
        writer.writeFloatValue("micGlitchRate", this.getMicGlitchRate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("receivedNoiseLevel", this.getReceivedNoiseLevel());
        writer.writeIntegerValue("receivedSignalLevel", this.getReceivedSignalLevel());
        writer.writeStringValue("renderDeviceDriver", this.getRenderDeviceDriver());
        writer.writeStringValue("renderDeviceName", this.getRenderDeviceName());
        writer.writeFloatValue("renderMuteEventRatio", this.getRenderMuteEventRatio());
        writer.writeFloatValue("renderNotFunctioningEventRatio", this.getRenderNotFunctioningEventRatio());
        writer.writeFloatValue("renderZeroVolumeEventRatio", this.getRenderZeroVolumeEventRatio());
        writer.writeIntegerValue("sentNoiseLevel", this.getSentNoiseLevel());
        writer.writeIntegerValue("sentSignalLevel", this.getSentSignalLevel());
        writer.writeFloatValue("speakerGlitchRate", this.getSpeakerGlitchRate());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the captureDeviceDriver property value. Name of the capture device driver used by the media endpoint.
     * @param value Value to set for the captureDeviceDriver property.
     */
    public void setCaptureDeviceDriver(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("captureDeviceDriver", value);
    }
    /**
     * Sets the captureDeviceName property value. Name of the capture device used by the media endpoint.
     * @param value Value to set for the captureDeviceName property.
     */
    public void setCaptureDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("captureDeviceName", value);
    }
    /**
     * Sets the captureNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the capture device was not working properly.
     * @param value Value to set for the captureNotFunctioningEventRatio property.
     */
    public void setCaptureNotFunctioningEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("captureNotFunctioningEventRatio", value);
    }
    /**
     * Sets the cpuInsufficentEventRatio property value. Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor quality of the audio sent and received.
     * @param value Value to set for the cpuInsufficentEventRatio property.
     */
    public void setCpuInsufficentEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("cpuInsufficentEventRatio", value);
    }
    /**
     * Sets the deviceClippingEventRatio property value. Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the audio being sent.
     * @param value Value to set for the deviceClippingEventRatio property.
     */
    public void setDeviceClippingEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("deviceClippingEventRatio", value);
    }
    /**
     * Sets the deviceGlitchEventRatio property value. Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor quality of the audio being sent or received.
     * @param value Value to set for the deviceGlitchEventRatio property.
     */
    public void setDeviceGlitchEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("deviceGlitchEventRatio", value);
    }
    /**
     * Sets the howlingEventCount property value. Number of times during the call that the media endpoint detected howling or screeching audio.
     * @param value Value to set for the howlingEventCount property.
     */
    public void setHowlingEventCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("howlingEventCount", value);
    }
    /**
     * Sets the initialSignalLevelRootMeanSquare property value. The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
     * @param value Value to set for the initialSignalLevelRootMeanSquare property.
     */
    public void setInitialSignalLevelRootMeanSquare(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("initialSignalLevelRootMeanSquare", value);
    }
    /**
     * Sets the lowSpeechLevelEventRatio property value. Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being sent.
     * @param value Value to set for the lowSpeechLevelEventRatio property.
     */
    public void setLowSpeechLevelEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("lowSpeechLevelEventRatio", value);
    }
    /**
     * Sets the lowSpeechToNoiseEventRatio property value. Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio being sent.
     * @param value Value to set for the lowSpeechToNoiseEventRatio property.
     */
    public void setLowSpeechToNoiseEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("lowSpeechToNoiseEventRatio", value);
    }
    /**
     * Sets the micGlitchRate property value. Glitches per 5 minute interval for the media endpoint's microphone.
     * @param value Value to set for the micGlitchRate property.
     */
    public void setMicGlitchRate(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("micGlitchRate", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the receivedNoiseLevel property value. Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @param value Value to set for the receivedNoiseLevel property.
     */
    public void setReceivedNoiseLevel(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("receivedNoiseLevel", value);
    }
    /**
     * Sets the receivedSignalLevel property value. Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @param value Value to set for the receivedSignalLevel property.
     */
    public void setReceivedSignalLevel(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("receivedSignalLevel", value);
    }
    /**
     * Sets the renderDeviceDriver property value. Name of the render device driver used by the media endpoint.
     * @param value Value to set for the renderDeviceDriver property.
     */
    public void setRenderDeviceDriver(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("renderDeviceDriver", value);
    }
    /**
     * Sets the renderDeviceName property value. Name of the render device used by the media endpoint.
     * @param value Value to set for the renderDeviceName property.
     */
    public void setRenderDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("renderDeviceName", value);
    }
    /**
     * Sets the renderMuteEventRatio property value. Fraction of the call that media endpoint detected device render is muted.
     * @param value Value to set for the renderMuteEventRatio property.
     */
    public void setRenderMuteEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("renderMuteEventRatio", value);
    }
    /**
     * Sets the renderNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the render device was not working properly.
     * @param value Value to set for the renderNotFunctioningEventRatio property.
     */
    public void setRenderNotFunctioningEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("renderNotFunctioningEventRatio", value);
    }
    /**
     * Sets the renderZeroVolumeEventRatio property value. Fraction of the call that media endpoint detected device render volume is set to 0.
     * @param value Value to set for the renderZeroVolumeEventRatio property.
     */
    public void setRenderZeroVolumeEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("renderZeroVolumeEventRatio", value);
    }
    /**
     * Sets the sentNoiseLevel property value. Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @param value Value to set for the sentNoiseLevel property.
     */
    public void setSentNoiseLevel(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sentNoiseLevel", value);
    }
    /**
     * Sets the sentSignalLevel property value. Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @param value Value to set for the sentSignalLevel property.
     */
    public void setSentSignalLevel(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sentSignalLevel", value);
    }
    /**
     * Sets the speakerGlitchRate property value. Glitches per 5 minute internal for the media endpoint's loudspeaker.
     * @param value Value to set for the speakerGlitchRate property.
     */
    public void setSpeakerGlitchRate(@jakarta.annotation.Nullable final Float value) {
        this.backingStore.set("speakerGlitchRate", value);
    }
}
