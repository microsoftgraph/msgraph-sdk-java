package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the capture device driver used by the media endpoint. */
    private String _captureDeviceDriver;
    /** Name of the capture device used by the media endpoint. */
    private String _captureDeviceName;
    /** Fraction of the call that the media endpoint detected the capture device was not working properly. */
    private Float _captureNotFunctioningEventRatio;
    /** Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor quality of the audio sent and received. */
    private Float _cpuInsufficentEventRatio;
    /** Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the audio being sent. */
    private Float _deviceClippingEventRatio;
    /** Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor quality of the audio being sent or received. */
    private Float _deviceGlitchEventRatio;
    /** Number of times during the call that the media endpoint detected howling or screeching audio. */
    private Integer _howlingEventCount;
    /** The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call. */
    private Float _initialSignalLevelRootMeanSquare;
    /** Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being sent. */
    private Float _lowSpeechLevelEventRatio;
    /** Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio being sent. */
    private Float _lowSpeechToNoiseEventRatio;
    /** Glitches per 5 minute interval for the media endpoint's microphone. */
    private Float _micGlitchRate;
    /** The OdataType property */
    private String _odataType;
    /** Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media endpoint. */
    private Integer _receivedNoiseLevel;
    /** Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint. */
    private Integer _receivedSignalLevel;
    /** Name of the render device driver used by the media endpoint. */
    private String _renderDeviceDriver;
    /** Name of the render device used by the media endpoint. */
    private String _renderDeviceName;
    /** Fraction of the call that media endpoint detected device render is muted. */
    private Float _renderMuteEventRatio;
    /** Fraction of the call that the media endpoint detected the render device was not working properly. */
    private Float _renderNotFunctioningEventRatio;
    /** Fraction of the call that media endpoint detected device render volume is set to 0. */
    private Float _renderZeroVolumeEventRatio;
    /** Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media endpoint. */
    private Integer _sentNoiseLevel;
    /** Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint. */
    private Integer _sentSignalLevel;
    /** Glitches per 5 minute internal for the media endpoint's loudspeaker. */
    private Float _speakerGlitchRate;
    /**
     * Instantiates a new deviceInfo and sets the default values.
     * @return a void
     */
    public DeviceInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callRecords.deviceInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceInfo
     */
    @javax.annotation.Nonnull
    public static DeviceInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceInfo();
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
     * Gets the captureDeviceDriver property value. Name of the capture device driver used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCaptureDeviceDriver() {
        return this._captureDeviceDriver;
    }
    /**
     * Gets the captureDeviceName property value. Name of the capture device used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCaptureDeviceName() {
        return this._captureDeviceName;
    }
    /**
     * Gets the captureNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the capture device was not working properly.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getCaptureNotFunctioningEventRatio() {
        return this._captureNotFunctioningEventRatio;
    }
    /**
     * Gets the cpuInsufficentEventRatio property value. Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor quality of the audio sent and received.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getCpuInsufficentEventRatio() {
        return this._cpuInsufficentEventRatio;
    }
    /**
     * Gets the deviceClippingEventRatio property value. Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the audio being sent.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getDeviceClippingEventRatio() {
        return this._deviceClippingEventRatio;
    }
    /**
     * Gets the deviceGlitchEventRatio property value. Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor quality of the audio being sent or received.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getDeviceGlitchEventRatio() {
        return this._deviceGlitchEventRatio;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceInfo currentObject = this;
        return new HashMap<>(22) {{
            this.put("captureDeviceDriver", (n) -> { currentObject.setCaptureDeviceDriver(n.getStringValue()); });
            this.put("captureDeviceName", (n) -> { currentObject.setCaptureDeviceName(n.getStringValue()); });
            this.put("captureNotFunctioningEventRatio", (n) -> { currentObject.setCaptureNotFunctioningEventRatio(n.getFloatValue()); });
            this.put("cpuInsufficentEventRatio", (n) -> { currentObject.setCpuInsufficentEventRatio(n.getFloatValue()); });
            this.put("deviceClippingEventRatio", (n) -> { currentObject.setDeviceClippingEventRatio(n.getFloatValue()); });
            this.put("deviceGlitchEventRatio", (n) -> { currentObject.setDeviceGlitchEventRatio(n.getFloatValue()); });
            this.put("howlingEventCount", (n) -> { currentObject.setHowlingEventCount(n.getIntegerValue()); });
            this.put("initialSignalLevelRootMeanSquare", (n) -> { currentObject.setInitialSignalLevelRootMeanSquare(n.getFloatValue()); });
            this.put("lowSpeechLevelEventRatio", (n) -> { currentObject.setLowSpeechLevelEventRatio(n.getFloatValue()); });
            this.put("lowSpeechToNoiseEventRatio", (n) -> { currentObject.setLowSpeechToNoiseEventRatio(n.getFloatValue()); });
            this.put("micGlitchRate", (n) -> { currentObject.setMicGlitchRate(n.getFloatValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("receivedNoiseLevel", (n) -> { currentObject.setReceivedNoiseLevel(n.getIntegerValue()); });
            this.put("receivedSignalLevel", (n) -> { currentObject.setReceivedSignalLevel(n.getIntegerValue()); });
            this.put("renderDeviceDriver", (n) -> { currentObject.setRenderDeviceDriver(n.getStringValue()); });
            this.put("renderDeviceName", (n) -> { currentObject.setRenderDeviceName(n.getStringValue()); });
            this.put("renderMuteEventRatio", (n) -> { currentObject.setRenderMuteEventRatio(n.getFloatValue()); });
            this.put("renderNotFunctioningEventRatio", (n) -> { currentObject.setRenderNotFunctioningEventRatio(n.getFloatValue()); });
            this.put("renderZeroVolumeEventRatio", (n) -> { currentObject.setRenderZeroVolumeEventRatio(n.getFloatValue()); });
            this.put("sentNoiseLevel", (n) -> { currentObject.setSentNoiseLevel(n.getIntegerValue()); });
            this.put("sentSignalLevel", (n) -> { currentObject.setSentSignalLevel(n.getIntegerValue()); });
            this.put("speakerGlitchRate", (n) -> { currentObject.setSpeakerGlitchRate(n.getFloatValue()); });
        }};
    }
    /**
     * Gets the howlingEventCount property value. Number of times during the call that the media endpoint detected howling or screeching audio.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHowlingEventCount() {
        return this._howlingEventCount;
    }
    /**
     * Gets the initialSignalLevelRootMeanSquare property value. The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getInitialSignalLevelRootMeanSquare() {
        return this._initialSignalLevelRootMeanSquare;
    }
    /**
     * Gets the lowSpeechLevelEventRatio property value. Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being sent.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getLowSpeechLevelEventRatio() {
        return this._lowSpeechLevelEventRatio;
    }
    /**
     * Gets the lowSpeechToNoiseEventRatio property value. Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio being sent.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getLowSpeechToNoiseEventRatio() {
        return this._lowSpeechToNoiseEventRatio;
    }
    /**
     * Gets the micGlitchRate property value. Glitches per 5 minute interval for the media endpoint's microphone.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getMicGlitchRate() {
        return this._micGlitchRate;
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
     * Gets the receivedNoiseLevel property value. Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReceivedNoiseLevel() {
        return this._receivedNoiseLevel;
    }
    /**
     * Gets the receivedSignalLevel property value. Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReceivedSignalLevel() {
        return this._receivedSignalLevel;
    }
    /**
     * Gets the renderDeviceDriver property value. Name of the render device driver used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRenderDeviceDriver() {
        return this._renderDeviceDriver;
    }
    /**
     * Gets the renderDeviceName property value. Name of the render device used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRenderDeviceName() {
        return this._renderDeviceName;
    }
    /**
     * Gets the renderMuteEventRatio property value. Fraction of the call that media endpoint detected device render is muted.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getRenderMuteEventRatio() {
        return this._renderMuteEventRatio;
    }
    /**
     * Gets the renderNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the render device was not working properly.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getRenderNotFunctioningEventRatio() {
        return this._renderNotFunctioningEventRatio;
    }
    /**
     * Gets the renderZeroVolumeEventRatio property value. Fraction of the call that media endpoint detected device render volume is set to 0.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getRenderZeroVolumeEventRatio() {
        return this._renderZeroVolumeEventRatio;
    }
    /**
     * Gets the sentNoiseLevel property value. Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSentNoiseLevel() {
        return this._sentNoiseLevel;
    }
    /**
     * Gets the sentSignalLevel property value. Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSentSignalLevel() {
        return this._sentSignalLevel;
    }
    /**
     * Gets the speakerGlitchRate property value. Glitches per 5 minute internal for the media endpoint's loudspeaker.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getSpeakerGlitchRate() {
        return this._speakerGlitchRate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the captureDeviceDriver property value. Name of the capture device driver used by the media endpoint.
     * @param value Value to set for the captureDeviceDriver property.
     * @return a void
     */
    public void setCaptureDeviceDriver(@javax.annotation.Nullable final String value) {
        this._captureDeviceDriver = value;
    }
    /**
     * Sets the captureDeviceName property value. Name of the capture device used by the media endpoint.
     * @param value Value to set for the captureDeviceName property.
     * @return a void
     */
    public void setCaptureDeviceName(@javax.annotation.Nullable final String value) {
        this._captureDeviceName = value;
    }
    /**
     * Sets the captureNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the capture device was not working properly.
     * @param value Value to set for the captureNotFunctioningEventRatio property.
     * @return a void
     */
    public void setCaptureNotFunctioningEventRatio(@javax.annotation.Nullable final Float value) {
        this._captureNotFunctioningEventRatio = value;
    }
    /**
     * Sets the cpuInsufficentEventRatio property value. Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor quality of the audio sent and received.
     * @param value Value to set for the cpuInsufficentEventRatio property.
     * @return a void
     */
    public void setCpuInsufficentEventRatio(@javax.annotation.Nullable final Float value) {
        this._cpuInsufficentEventRatio = value;
    }
    /**
     * Sets the deviceClippingEventRatio property value. Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the audio being sent.
     * @param value Value to set for the deviceClippingEventRatio property.
     * @return a void
     */
    public void setDeviceClippingEventRatio(@javax.annotation.Nullable final Float value) {
        this._deviceClippingEventRatio = value;
    }
    /**
     * Sets the deviceGlitchEventRatio property value. Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor quality of the audio being sent or received.
     * @param value Value to set for the deviceGlitchEventRatio property.
     * @return a void
     */
    public void setDeviceGlitchEventRatio(@javax.annotation.Nullable final Float value) {
        this._deviceGlitchEventRatio = value;
    }
    /**
     * Sets the howlingEventCount property value. Number of times during the call that the media endpoint detected howling or screeching audio.
     * @param value Value to set for the howlingEventCount property.
     * @return a void
     */
    public void setHowlingEventCount(@javax.annotation.Nullable final Integer value) {
        this._howlingEventCount = value;
    }
    /**
     * Sets the initialSignalLevelRootMeanSquare property value. The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
     * @param value Value to set for the initialSignalLevelRootMeanSquare property.
     * @return a void
     */
    public void setInitialSignalLevelRootMeanSquare(@javax.annotation.Nullable final Float value) {
        this._initialSignalLevelRootMeanSquare = value;
    }
    /**
     * Sets the lowSpeechLevelEventRatio property value. Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being sent.
     * @param value Value to set for the lowSpeechLevelEventRatio property.
     * @return a void
     */
    public void setLowSpeechLevelEventRatio(@javax.annotation.Nullable final Float value) {
        this._lowSpeechLevelEventRatio = value;
    }
    /**
     * Sets the lowSpeechToNoiseEventRatio property value. Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio being sent.
     * @param value Value to set for the lowSpeechToNoiseEventRatio property.
     * @return a void
     */
    public void setLowSpeechToNoiseEventRatio(@javax.annotation.Nullable final Float value) {
        this._lowSpeechToNoiseEventRatio = value;
    }
    /**
     * Sets the micGlitchRate property value. Glitches per 5 minute interval for the media endpoint's microphone.
     * @param value Value to set for the micGlitchRate property.
     * @return a void
     */
    public void setMicGlitchRate(@javax.annotation.Nullable final Float value) {
        this._micGlitchRate = value;
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
     * Sets the receivedNoiseLevel property value. Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @param value Value to set for the receivedNoiseLevel property.
     * @return a void
     */
    public void setReceivedNoiseLevel(@javax.annotation.Nullable final Integer value) {
        this._receivedNoiseLevel = value;
    }
    /**
     * Sets the receivedSignalLevel property value. Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @param value Value to set for the receivedSignalLevel property.
     * @return a void
     */
    public void setReceivedSignalLevel(@javax.annotation.Nullable final Integer value) {
        this._receivedSignalLevel = value;
    }
    /**
     * Sets the renderDeviceDriver property value. Name of the render device driver used by the media endpoint.
     * @param value Value to set for the renderDeviceDriver property.
     * @return a void
     */
    public void setRenderDeviceDriver(@javax.annotation.Nullable final String value) {
        this._renderDeviceDriver = value;
    }
    /**
     * Sets the renderDeviceName property value. Name of the render device used by the media endpoint.
     * @param value Value to set for the renderDeviceName property.
     * @return a void
     */
    public void setRenderDeviceName(@javax.annotation.Nullable final String value) {
        this._renderDeviceName = value;
    }
    /**
     * Sets the renderMuteEventRatio property value. Fraction of the call that media endpoint detected device render is muted.
     * @param value Value to set for the renderMuteEventRatio property.
     * @return a void
     */
    public void setRenderMuteEventRatio(@javax.annotation.Nullable final Float value) {
        this._renderMuteEventRatio = value;
    }
    /**
     * Sets the renderNotFunctioningEventRatio property value. Fraction of the call that the media endpoint detected the render device was not working properly.
     * @param value Value to set for the renderNotFunctioningEventRatio property.
     * @return a void
     */
    public void setRenderNotFunctioningEventRatio(@javax.annotation.Nullable final Float value) {
        this._renderNotFunctioningEventRatio = value;
    }
    /**
     * Sets the renderZeroVolumeEventRatio property value. Fraction of the call that media endpoint detected device render volume is set to 0.
     * @param value Value to set for the renderZeroVolumeEventRatio property.
     * @return a void
     */
    public void setRenderZeroVolumeEventRatio(@javax.annotation.Nullable final Float value) {
        this._renderZeroVolumeEventRatio = value;
    }
    /**
     * Sets the sentNoiseLevel property value. Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     * @param value Value to set for the sentNoiseLevel property.
     * @return a void
     */
    public void setSentNoiseLevel(@javax.annotation.Nullable final Integer value) {
        this._sentNoiseLevel = value;
    }
    /**
     * Sets the sentSignalLevel property value. Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     * @param value Value to set for the sentSignalLevel property.
     * @return a void
     */
    public void setSentSignalLevel(@javax.annotation.Nullable final Integer value) {
        this._sentSignalLevel = value;
    }
    /**
     * Sets the speakerGlitchRate property value. Glitches per 5 minute internal for the media endpoint's loudspeaker.
     * @param value Value to set for the speakerGlitchRate property.
     * @return a void
     */
    public void setSpeakerGlitchRate(@javax.annotation.Nullable final Float value) {
        this._speakerGlitchRate = value;
    }
}
