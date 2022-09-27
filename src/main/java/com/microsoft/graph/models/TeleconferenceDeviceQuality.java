package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeleconferenceDeviceQuality implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId. */
    private String _callChainId;
    /** A geo-region where the service is deployed, such as ProdNoam. */
    private String _cloudServiceDeploymentEnvironment;
    /** A unique deployment identifier assigned by Azure. */
    private String _cloudServiceDeploymentId;
    /** The Azure deployed cloud service instance name, such as FrontEnd_IN_3. */
    private String _cloudServiceInstanceName;
    /** The Azure deployed cloud service name, such as contoso.cloudapp.net. */
    private String _cloudServiceName;
    /** Any additional description, such as VTC Bldg 30/21. */
    private String _deviceDescription;
    /** The user media agent name, such as Cisco SX80. */
    private String _deviceName;
    /** A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value. */
    private String _mediaLegId;
    /** The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality. */
    private java.util.List<TeleconferenceDeviceMediaQuality> _mediaQualityList;
    /** The OdataType property */
    private String _odataType;
    /** A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property. */
    private String _participantId;
    /**
     * Instantiates a new teleconferenceDeviceQuality and sets the default values.
     * @return a void
     */
    public TeleconferenceDeviceQuality() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teleconferenceDeviceQuality");
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
        return this._additionalData;
    }
    /**
     * Gets the callChainId property value. A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallChainId() {
        return this._callChainId;
    }
    /**
     * Gets the cloudServiceDeploymentEnvironment property value. A geo-region where the service is deployed, such as ProdNoam.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceDeploymentEnvironment() {
        return this._cloudServiceDeploymentEnvironment;
    }
    /**
     * Gets the cloudServiceDeploymentId property value. A unique deployment identifier assigned by Azure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceDeploymentId() {
        return this._cloudServiceDeploymentId;
    }
    /**
     * Gets the cloudServiceInstanceName property value. The Azure deployed cloud service instance name, such as FrontEnd_IN_3.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceInstanceName() {
        return this._cloudServiceInstanceName;
    }
    /**
     * Gets the cloudServiceName property value. The Azure deployed cloud service name, such as contoso.cloudapp.net.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudServiceName() {
        return this._cloudServiceName;
    }
    /**
     * Gets the deviceDescription property value. Any additional description, such as VTC Bldg 30/21.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDescription() {
        return this._deviceDescription;
    }
    /**
     * Gets the deviceName property value. The user media agent name, such as Cisco SX80.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeleconferenceDeviceQuality currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(11) {{
            this.put("callChainId", (n) -> { currentObject.setCallChainId(n.getStringValue()); });
            this.put("cloudServiceDeploymentEnvironment", (n) -> { currentObject.setCloudServiceDeploymentEnvironment(n.getStringValue()); });
            this.put("cloudServiceDeploymentId", (n) -> { currentObject.setCloudServiceDeploymentId(n.getStringValue()); });
            this.put("cloudServiceInstanceName", (n) -> { currentObject.setCloudServiceInstanceName(n.getStringValue()); });
            this.put("cloudServiceName", (n) -> { currentObject.setCloudServiceName(n.getStringValue()); });
            this.put("deviceDescription", (n) -> { currentObject.setDeviceDescription(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("mediaLegId", (n) -> { currentObject.setMediaLegId(n.getStringValue()); });
            this.put("mediaQualityList", (n) -> { currentObject.setMediaQualityList(n.getCollectionOfObjectValues(TeleconferenceDeviceMediaQuality::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("participantId", (n) -> { currentObject.setParticipantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the mediaLegId property value. A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaLegId() {
        return this._mediaLegId;
    }
    /**
     * Gets the mediaQualityList property value. The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality.
     * @return a teleconferenceDeviceMediaQuality
     */
    @javax.annotation.Nullable
    public java.util.List<TeleconferenceDeviceMediaQuality> getMediaQualityList() {
        return this._mediaQualityList;
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
     * Gets the participantId property value. A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParticipantId() {
        return this._participantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("callChainId", this.getCallChainId());
        writer.writeStringValue("cloudServiceDeploymentEnvironment", this.getCloudServiceDeploymentEnvironment());
        writer.writeStringValue("cloudServiceDeploymentId", this.getCloudServiceDeploymentId());
        writer.writeStringValue("cloudServiceInstanceName", this.getCloudServiceInstanceName());
        writer.writeStringValue("cloudServiceName", this.getCloudServiceName());
        writer.writeStringValue("deviceDescription", this.getDeviceDescription());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("mediaLegId", this.getMediaLegId());
        writer.writeCollectionOfObjectValues("mediaQualityList", this.getMediaQualityList());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("participantId", this.getParticipantId());
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
     * Sets the callChainId property value. A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @param value Value to set for the callChainId property.
     * @return a void
     */
    public void setCallChainId(@javax.annotation.Nullable final String value) {
        this._callChainId = value;
    }
    /**
     * Sets the cloudServiceDeploymentEnvironment property value. A geo-region where the service is deployed, such as ProdNoam.
     * @param value Value to set for the cloudServiceDeploymentEnvironment property.
     * @return a void
     */
    public void setCloudServiceDeploymentEnvironment(@javax.annotation.Nullable final String value) {
        this._cloudServiceDeploymentEnvironment = value;
    }
    /**
     * Sets the cloudServiceDeploymentId property value. A unique deployment identifier assigned by Azure.
     * @param value Value to set for the cloudServiceDeploymentId property.
     * @return a void
     */
    public void setCloudServiceDeploymentId(@javax.annotation.Nullable final String value) {
        this._cloudServiceDeploymentId = value;
    }
    /**
     * Sets the cloudServiceInstanceName property value. The Azure deployed cloud service instance name, such as FrontEnd_IN_3.
     * @param value Value to set for the cloudServiceInstanceName property.
     * @return a void
     */
    public void setCloudServiceInstanceName(@javax.annotation.Nullable final String value) {
        this._cloudServiceInstanceName = value;
    }
    /**
     * Sets the cloudServiceName property value. The Azure deployed cloud service name, such as contoso.cloudapp.net.
     * @param value Value to set for the cloudServiceName property.
     * @return a void
     */
    public void setCloudServiceName(@javax.annotation.Nullable final String value) {
        this._cloudServiceName = value;
    }
    /**
     * Sets the deviceDescription property value. Any additional description, such as VTC Bldg 30/21.
     * @param value Value to set for the deviceDescription property.
     * @return a void
     */
    public void setDeviceDescription(@javax.annotation.Nullable final String value) {
        this._deviceDescription = value;
    }
    /**
     * Sets the deviceName property value. The user media agent name, such as Cisco SX80.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the mediaLegId property value. A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value.
     * @param value Value to set for the mediaLegId property.
     * @return a void
     */
    public void setMediaLegId(@javax.annotation.Nullable final String value) {
        this._mediaLegId = value;
    }
    /**
     * Sets the mediaQualityList property value. The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality.
     * @param value Value to set for the mediaQualityList property.
     * @return a void
     */
    public void setMediaQualityList(@javax.annotation.Nullable final java.util.List<TeleconferenceDeviceMediaQuality> value) {
        this._mediaQualityList = value;
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
     * Sets the participantId property value. A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property.
     * @param value Value to set for the participantId property.
     * @return a void
     */
    public void setParticipantId(@javax.annotation.Nullable final String value) {
        this._participantId = value;
    }
}
