package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Media implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Device information associated with the callee endpoint of this media. */
    private DeviceInfo _calleeDevice;
    /** Network information associated with the callee endpoint of this media. */
    private NetworkInfo _calleeNetwork;
    /** Device information associated with the caller endpoint of this media. */
    private DeviceInfo _callerDevice;
    /** Network information associated with the caller endpoint of this media. */
    private NetworkInfo _callerNetwork;
    /** How the media was identified during media negotiation stage. */
    private String _label;
    /** The OdataType property */
    private String _odataType;
    /** Network streams associated with this media. */
    private java.util.List<MediaStream> _streams;
    /**
     * Instantiates a new media and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Media() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callRecords.media");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a media
     */
    @javax.annotation.Nonnull
    public static Media createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Media();
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
     * Gets the calleeDevice property value. Device information associated with the callee endpoint of this media.
     * @return a deviceInfo
     */
    @javax.annotation.Nullable
    public DeviceInfo getCalleeDevice() {
        return this._calleeDevice;
    }
    /**
     * Gets the calleeNetwork property value. Network information associated with the callee endpoint of this media.
     * @return a networkInfo
     */
    @javax.annotation.Nullable
    public NetworkInfo getCalleeNetwork() {
        return this._calleeNetwork;
    }
    /**
     * Gets the callerDevice property value. Device information associated with the caller endpoint of this media.
     * @return a deviceInfo
     */
    @javax.annotation.Nullable
    public DeviceInfo getCallerDevice() {
        return this._callerDevice;
    }
    /**
     * Gets the callerNetwork property value. Network information associated with the caller endpoint of this media.
     * @return a networkInfo
     */
    @javax.annotation.Nullable
    public NetworkInfo getCallerNetwork() {
        return this._callerNetwork;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Media currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
        deserializerMap.put("calleeDevice", (n) -> { currentObject.setCalleeDevice(n.getObjectValue(DeviceInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("calleeNetwork", (n) -> { currentObject.setCalleeNetwork(n.getObjectValue(NetworkInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("callerDevice", (n) -> { currentObject.setCallerDevice(n.getObjectValue(DeviceInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("callerNetwork", (n) -> { currentObject.setCallerNetwork(n.getObjectValue(NetworkInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("streams", (n) -> { currentObject.setStreams(n.getCollectionOfObjectValues(MediaStream::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. How the media was identified during media negotiation stage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
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
     * Gets the streams property value. Network streams associated with this media.
     * @return a mediaStream
     */
    @javax.annotation.Nullable
    public java.util.List<MediaStream> getStreams() {
        return this._streams;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("calleeDevice", this.getCalleeDevice());
        writer.writeObjectValue("calleeNetwork", this.getCalleeNetwork());
        writer.writeObjectValue("callerDevice", this.getCallerDevice());
        writer.writeObjectValue("callerNetwork", this.getCallerNetwork());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("streams", this.getStreams());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the calleeDevice property value. Device information associated with the callee endpoint of this media.
     * @param value Value to set for the calleeDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalleeDevice(@javax.annotation.Nullable final DeviceInfo value) {
        this._calleeDevice = value;
    }
    /**
     * Sets the calleeNetwork property value. Network information associated with the callee endpoint of this media.
     * @param value Value to set for the calleeNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalleeNetwork(@javax.annotation.Nullable final NetworkInfo value) {
        this._calleeNetwork = value;
    }
    /**
     * Sets the callerDevice property value. Device information associated with the caller endpoint of this media.
     * @param value Value to set for the callerDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallerDevice(@javax.annotation.Nullable final DeviceInfo value) {
        this._callerDevice = value;
    }
    /**
     * Sets the callerNetwork property value. Network information associated with the caller endpoint of this media.
     * @param value Value to set for the callerNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallerNetwork(@javax.annotation.Nullable final NetworkInfo value) {
        this._callerNetwork = value;
    }
    /**
     * Sets the label property value. How the media was identified during media negotiation stage.
     * @param value Value to set for the label property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
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
    /**
     * Sets the streams property value. Network streams associated with this media.
     * @param value Value to set for the streams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStreams(@javax.annotation.Nullable final java.util.List<MediaStream> value) {
        this._streams = value;
    }
}
