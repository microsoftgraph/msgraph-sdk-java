package com.microsoft.graph.models;

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
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeleconferenceDeviceQuality implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeleconferenceDeviceQuality and sets the default values.
     */
    public TeleconferenceDeviceQuality() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeleconferenceDeviceQuality
     */
    @jakarta.annotation.Nonnull
    public static TeleconferenceDeviceQuality createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeleconferenceDeviceQuality();
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
     * Gets the callChainId property value. A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getCallChainId() {
        return this.BackingStore.get("callChainId");
    }
    /**
     * Gets the cloudServiceDeploymentEnvironment property value. A geo-region where the service is deployed, such as ProdNoam.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudServiceDeploymentEnvironment() {
        return this.BackingStore.get("cloudServiceDeploymentEnvironment");
    }
    /**
     * Gets the cloudServiceDeploymentId property value. A unique deployment identifier assigned by Azure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudServiceDeploymentId() {
        return this.BackingStore.get("cloudServiceDeploymentId");
    }
    /**
     * Gets the cloudServiceInstanceName property value. The Azure deployed cloud service instance name, such as FrontEndIN3.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudServiceInstanceName() {
        return this.BackingStore.get("cloudServiceInstanceName");
    }
    /**
     * Gets the cloudServiceName property value. The Azure deployed cloud service name, such as contoso.cloudapp.net.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudServiceName() {
        return this.BackingStore.get("cloudServiceName");
    }
    /**
     * Gets the deviceDescription property value. Any additional description, such as VTC Bldg 30/21.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceDescription() {
        return this.BackingStore.get("deviceDescription");
    }
    /**
     * Gets the deviceName property value. The user media agent name, such as Cisco SX80.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.BackingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("callChainId", (n) -> { this.setCallChainId(n.getUUIDValue()); });
        deserializerMap.put("cloudServiceDeploymentEnvironment", (n) -> { this.setCloudServiceDeploymentEnvironment(n.getStringValue()); });
        deserializerMap.put("cloudServiceDeploymentId", (n) -> { this.setCloudServiceDeploymentId(n.getStringValue()); });
        deserializerMap.put("cloudServiceInstanceName", (n) -> { this.setCloudServiceInstanceName(n.getStringValue()); });
        deserializerMap.put("cloudServiceName", (n) -> { this.setCloudServiceName(n.getStringValue()); });
        deserializerMap.put("deviceDescription", (n) -> { this.setDeviceDescription(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("mediaLegId", (n) -> { this.setMediaLegId(n.getUUIDValue()); });
        deserializerMap.put("mediaQualityList", (n) -> { this.setMediaQualityList(n.getCollectionOfObjectValues(TeleconferenceDeviceMediaQuality::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("participantId", (n) -> { this.setParticipantId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mediaLegId property value. A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getMediaLegId() {
        return this.BackingStore.get("mediaLegId");
    }
    /**
     * Gets the mediaQualityList property value. The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality.
     * @return a java.util.List<TeleconferenceDeviceMediaQuality>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeleconferenceDeviceMediaQuality> getMediaQualityList() {
        return this.BackingStore.get("mediaQualityList");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the participantId property value. A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getParticipantId() {
        return this.BackingStore.get("participantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeUUIDValue("callChainId", this.getCallChainId());
        writer.writeStringValue("cloudServiceDeploymentEnvironment", this.getCloudServiceDeploymentEnvironment());
        writer.writeStringValue("cloudServiceDeploymentId", this.getCloudServiceDeploymentId());
        writer.writeStringValue("cloudServiceInstanceName", this.getCloudServiceInstanceName());
        writer.writeStringValue("cloudServiceName", this.getCloudServiceName());
        writer.writeStringValue("deviceDescription", this.getDeviceDescription());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeUUIDValue("mediaLegId", this.getMediaLegId());
        writer.writeCollectionOfObjectValues("mediaQualityList", this.getMediaQualityList());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeUUIDValue("participantId", this.getParticipantId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the callChainId property value. A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @param value Value to set for the callChainId property.
     */
    public void setCallChainId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("callChainId", value);
    }
    /**
     * Sets the cloudServiceDeploymentEnvironment property value. A geo-region where the service is deployed, such as ProdNoam.
     * @param value Value to set for the cloudServiceDeploymentEnvironment property.
     */
    public void setCloudServiceDeploymentEnvironment(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("cloudServiceDeploymentEnvironment", value);
    }
    /**
     * Sets the cloudServiceDeploymentId property value. A unique deployment identifier assigned by Azure.
     * @param value Value to set for the cloudServiceDeploymentId property.
     */
    public void setCloudServiceDeploymentId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("cloudServiceDeploymentId", value);
    }
    /**
     * Sets the cloudServiceInstanceName property value. The Azure deployed cloud service instance name, such as FrontEndIN3.
     * @param value Value to set for the cloudServiceInstanceName property.
     */
    public void setCloudServiceInstanceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("cloudServiceInstanceName", value);
    }
    /**
     * Sets the cloudServiceName property value. The Azure deployed cloud service name, such as contoso.cloudapp.net.
     * @param value Value to set for the cloudServiceName property.
     */
    public void setCloudServiceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("cloudServiceName", value);
    }
    /**
     * Sets the deviceDescription property value. Any additional description, such as VTC Bldg 30/21.
     * @param value Value to set for the deviceDescription property.
     */
    public void setDeviceDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceDescription", value);
    }
    /**
     * Sets the deviceName property value. The user media agent name, such as Cisco SX80.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceName", value);
    }
    /**
     * Sets the mediaLegId property value. A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value.
     * @param value Value to set for the mediaLegId property.
     */
    public void setMediaLegId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("mediaLegId", value);
    }
    /**
     * Sets the mediaQualityList property value. The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality.
     * @param value Value to set for the mediaQualityList property.
     */
    public void setMediaQualityList(@jakarta.annotation.Nullable final java.util.List<TeleconferenceDeviceMediaQuality> value) {
        this.BackingStore.set("mediaQualityList", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the participantId property value. A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property.
     * @param value Value to set for the participantId property.
     */
    public void setParticipantId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("participantId", value);
    }
}
