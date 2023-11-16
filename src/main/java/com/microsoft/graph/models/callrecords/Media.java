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
public class Media implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new Media and sets the default values.
     */
    public Media() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Media
     */
    @jakarta.annotation.Nonnull
    public static Media createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Media();
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
     * Gets the calleeDevice property value. Device information associated with the callee endpoint of this media.
     * @return a DeviceInfo
     */
    @jakarta.annotation.Nullable
    public DeviceInfo getCalleeDevice() {
        return this.backingStore.get("calleeDevice");
    }
    /**
     * Gets the calleeNetwork property value. Network information associated with the callee endpoint of this media.
     * @return a NetworkInfo
     */
    @jakarta.annotation.Nullable
    public NetworkInfo getCalleeNetwork() {
        return this.backingStore.get("calleeNetwork");
    }
    /**
     * Gets the callerDevice property value. Device information associated with the caller endpoint of this media.
     * @return a DeviceInfo
     */
    @jakarta.annotation.Nullable
    public DeviceInfo getCallerDevice() {
        return this.backingStore.get("callerDevice");
    }
    /**
     * Gets the callerNetwork property value. Network information associated with the caller endpoint of this media.
     * @return a NetworkInfo
     */
    @jakarta.annotation.Nullable
    public NetworkInfo getCallerNetwork() {
        return this.backingStore.get("callerNetwork");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.backingStore.get("label");
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
     * Gets the streams property value. Network streams associated with this media.
     * @return a java.util.List<MediaStream>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MediaStream> getStreams() {
        return this.backingStore.get("streams");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the calleeDevice property value. Device information associated with the callee endpoint of this media.
     * @param value Value to set for the calleeDevice property.
     */
    public void setCalleeDevice(@jakarta.annotation.Nullable final DeviceInfo value) {
        this.backingStore.set("calleeDevice", value);
    }
    /**
     * Sets the calleeNetwork property value. Network information associated with the callee endpoint of this media.
     * @param value Value to set for the calleeNetwork property.
     */
    public void setCalleeNetwork(@jakarta.annotation.Nullable final NetworkInfo value) {
        this.backingStore.set("calleeNetwork", value);
    }
    /**
     * Sets the callerDevice property value. Device information associated with the caller endpoint of this media.
     * @param value Value to set for the callerDevice property.
     */
    public void setCallerDevice(@jakarta.annotation.Nullable final DeviceInfo value) {
        this.backingStore.set("callerDevice", value);
    }
    /**
     * Sets the callerNetwork property value. Network information associated with the caller endpoint of this media.
     * @param value Value to set for the callerNetwork property.
     */
    public void setCallerNetwork(@jakarta.annotation.Nullable final NetworkInfo value) {
        this.backingStore.set("callerNetwork", value);
    }
    /**
     * Sets the label property value. How the media was identified during media negotiation stage.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("label", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the streams property value. Network streams associated with this media.
     * @param value Value to set for the streams property.
     */
    public void setStreams(@jakarta.annotation.Nullable final java.util.List<MediaStream> value) {
        this.backingStore.set("streams", value);
    }
}
