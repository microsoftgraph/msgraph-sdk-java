package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Media implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Device information associated with the callee endpoint of this media.
     */
    private DeviceInfo calleeDevice;
    /**
     * Network information associated with the callee endpoint of this media.
     */
    private NetworkInfo calleeNetwork;
    /**
     * Device information associated with the caller endpoint of this media.
     */
    private DeviceInfo callerDevice;
    /**
     * Network information associated with the caller endpoint of this media.
     */
    private NetworkInfo callerNetwork;
    /**
     * How the media was identified during media negotiation stage.
     */
    private String label;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Network streams associated with this media.
     */
    private java.util.List<MediaStream> streams;
    /**
     * Instantiates a new media and sets the default values.
     */
    public Media() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a media
     */
    @jakarta.annotation.Nonnull
    public static Media createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Media();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the calleeDevice property value. Device information associated with the callee endpoint of this media.
     * @return a deviceInfo
     */
    @jakarta.annotation.Nullable
    public DeviceInfo getCalleeDevice() {
        return this.calleeDevice;
    }
    /**
     * Gets the calleeNetwork property value. Network information associated with the callee endpoint of this media.
     * @return a networkInfo
     */
    @jakarta.annotation.Nullable
    public NetworkInfo getCalleeNetwork() {
        return this.calleeNetwork;
    }
    /**
     * Gets the callerDevice property value. Device information associated with the caller endpoint of this media.
     * @return a deviceInfo
     */
    @jakarta.annotation.Nullable
    public DeviceInfo getCallerDevice() {
        return this.callerDevice;
    }
    /**
     * Gets the callerNetwork property value. Network information associated with the caller endpoint of this media.
     * @return a networkInfo
     */
    @jakarta.annotation.Nullable
    public NetworkInfo getCallerNetwork() {
        return this.callerNetwork;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("calleeDevice", (n) -> { this.setCalleeDevice(n.getObjectValue(DeviceInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("calleeNetwork", (n) -> { this.setCalleeNetwork(n.getObjectValue(NetworkInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("callerDevice", (n) -> { this.setCallerDevice(n.getObjectValue(DeviceInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("callerNetwork", (n) -> { this.setCallerNetwork(n.getObjectValue(NetworkInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("streams", (n) -> { this.setStreams(n.getCollectionOfObjectValues(MediaStream::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. How the media was identified during media negotiation stage.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the streams property value. Network streams associated with this media.
     * @return a mediaStream
     */
    @jakarta.annotation.Nullable
    public java.util.List<MediaStream> getStreams() {
        return this.streams;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the calleeDevice property value. Device information associated with the callee endpoint of this media.
     * @param value Value to set for the calleeDevice property.
     */
    public void setCalleeDevice(@jakarta.annotation.Nullable final DeviceInfo value) {
        this.calleeDevice = value;
    }
    /**
     * Sets the calleeNetwork property value. Network information associated with the callee endpoint of this media.
     * @param value Value to set for the calleeNetwork property.
     */
    public void setCalleeNetwork(@jakarta.annotation.Nullable final NetworkInfo value) {
        this.calleeNetwork = value;
    }
    /**
     * Sets the callerDevice property value. Device information associated with the caller endpoint of this media.
     * @param value Value to set for the callerDevice property.
     */
    public void setCallerDevice(@jakarta.annotation.Nullable final DeviceInfo value) {
        this.callerDevice = value;
    }
    /**
     * Sets the callerNetwork property value. Network information associated with the caller endpoint of this media.
     * @param value Value to set for the callerNetwork property.
     */
    public void setCallerNetwork(@jakarta.annotation.Nullable final NetworkInfo value) {
        this.callerNetwork = value;
    }
    /**
     * Sets the label property value. How the media was identified during media negotiation stage.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the streams property value. Network streams associated with this media.
     * @param value Value to set for the streams property.
     */
    public void setStreams(@jakarta.annotation.Nullable final java.util.List<MediaStream> value) {
        this.streams = value;
    }
}
