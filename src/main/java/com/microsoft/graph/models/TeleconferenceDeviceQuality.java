package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class TeleconferenceDeviceQuality implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId. */
    private UUID callChainId;
    /** A geo-region where the service is deployed, such as ProdNoam. */
    private String cloudServiceDeploymentEnvironment;
    /** A unique deployment identifier assigned by Azure. */
    private String cloudServiceDeploymentId;
    /** The Azure deployed cloud service instance name, such as FrontEnd_IN_3. */
    private String cloudServiceInstanceName;
    /** The Azure deployed cloud service name, such as contoso.cloudapp.net. */
    private String cloudServiceName;
    /** Any additional description, such as VTC Bldg 30/21. */
    private String deviceDescription;
    /** The user media agent name, such as Cisco SX80. */
    private String deviceName;
    /** A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value. */
    private UUID mediaLegId;
    /** The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality. */
    private java.util.List<TeleconferenceDeviceMediaQuality> mediaQualityList;
    /** The OdataType property */
    private String odataType;
    /** A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property. */
    private UUID participantId;
    /**
     * Instantiates a new teleconferenceDeviceQuality and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeleconferenceDeviceQuality() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teleconferenceDeviceQuality
     */
    @javax.annotation.Nonnull
    public static TeleconferenceDeviceQuality createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeleconferenceDeviceQuality();
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
     * Gets the callChainId property value. A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getCallChainId() {
        return this.callChainId;
    }
    /**
     * Gets the cloudServiceDeploymentEnvironment property value. A geo-region where the service is deployed, such as ProdNoam.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceDeploymentEnvironment() {
        return this.cloudServiceDeploymentEnvironment;
    }
    /**
     * Gets the cloudServiceDeploymentId property value. A unique deployment identifier assigned by Azure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceDeploymentId() {
        return this.cloudServiceDeploymentId;
    }
    /**
     * Gets the cloudServiceInstanceName property value. The Azure deployed cloud service instance name, such as FrontEnd_IN_3.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceInstanceName() {
        return this.cloudServiceInstanceName;
    }
    /**
     * Gets the cloudServiceName property value. The Azure deployed cloud service name, such as contoso.cloudapp.net.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceName() {
        return this.cloudServiceName;
    }
    /**
     * Gets the deviceDescription property value. Any additional description, such as VTC Bldg 30/21.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDescription() {
        return this.deviceDescription;
    }
    /**
     * Gets the deviceName property value. The user media agent name, such as Cisco SX80.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public UUID getMediaLegId() {
        return this.mediaLegId;
    }
    /**
     * Gets the mediaQualityList property value. The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality.
     * @return a teleconferenceDeviceMediaQuality
     */
    @javax.annotation.Nullable
    public java.util.List<TeleconferenceDeviceMediaQuality> getMediaQualityList() {
        return this.mediaQualityList;
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
     * Gets the participantId property value. A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getParticipantId() {
        return this.participantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the callChainId property value. A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @param value Value to set for the callChainId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallChainId(@javax.annotation.Nullable final UUID value) {
        this.callChainId = value;
    }
    /**
     * Sets the cloudServiceDeploymentEnvironment property value. A geo-region where the service is deployed, such as ProdNoam.
     * @param value Value to set for the cloudServiceDeploymentEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudServiceDeploymentEnvironment(@javax.annotation.Nullable final String value) {
        this.cloudServiceDeploymentEnvironment = value;
    }
    /**
     * Sets the cloudServiceDeploymentId property value. A unique deployment identifier assigned by Azure.
     * @param value Value to set for the cloudServiceDeploymentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudServiceDeploymentId(@javax.annotation.Nullable final String value) {
        this.cloudServiceDeploymentId = value;
    }
    /**
     * Sets the cloudServiceInstanceName property value. The Azure deployed cloud service instance name, such as FrontEnd_IN_3.
     * @param value Value to set for the cloudServiceInstanceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudServiceInstanceName(@javax.annotation.Nullable final String value) {
        this.cloudServiceInstanceName = value;
    }
    /**
     * Sets the cloudServiceName property value. The Azure deployed cloud service name, such as contoso.cloudapp.net.
     * @param value Value to set for the cloudServiceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudServiceName(@javax.annotation.Nullable final String value) {
        this.cloudServiceName = value;
    }
    /**
     * Sets the deviceDescription property value. Any additional description, such as VTC Bldg 30/21.
     * @param value Value to set for the deviceDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDescription(@javax.annotation.Nullable final String value) {
        this.deviceDescription = value;
    }
    /**
     * Sets the deviceName property value. The user media agent name, such as Cisco SX80.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the mediaLegId property value. A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value.
     * @param value Value to set for the mediaLegId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaLegId(@javax.annotation.Nullable final UUID value) {
        this.mediaLegId = value;
    }
    /**
     * Sets the mediaQualityList property value. The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality.
     * @param value Value to set for the mediaQualityList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaQualityList(@javax.annotation.Nullable final java.util.List<TeleconferenceDeviceMediaQuality> value) {
        this.mediaQualityList = value;
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
     * Sets the participantId property value. A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property.
     * @param value Value to set for the participantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipantId(@javax.annotation.Nullable final UUID value) {
        this.participantId = value;
    }
}
