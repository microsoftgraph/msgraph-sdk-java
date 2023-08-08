package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesServicePort implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The application protocol for this port.
     */
    private String appProtocol;
    /**
     * The name of this port within the service.
     */
    private String name;
    /**
     * The port on each node on which this service is exposed when the type is either NodePort or LoadBalancer.
     */
    private Integer nodePort;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The port that this service exposes.
     */
    private Integer port;
    /**
     * The protocol name. Possible values are: udp, tcp, sctp, unknownFutureValue.
     */
    private ContainerPortProtocol protocol;
    /**
     * The name or number of the port to access on the pods targeted by the service. The port number must be in the range 1 to 65535. The name must be an IANASVCNAME.
     */
    private String targetPort;
    /**
     * Instantiates a new kubernetesServicePort and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public KubernetesServicePort() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesServicePort
     */
    @jakarta.annotation.Nonnull
    public static KubernetesServicePort createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesServicePort();
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
     * Gets the appProtocol property value. The application protocol for this port.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppProtocol() {
        return this.appProtocol;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("appProtocol", (n) -> { this.setAppProtocol(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("nodePort", (n) -> { this.setNodePort(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(ContainerPortProtocol.class)); });
        deserializerMap.put("targetPort", (n) -> { this.setTargetPort(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of this port within the service.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the nodePort property value. The port on each node on which this service is exposed when the type is either NodePort or LoadBalancer.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNodePort() {
        return this.nodePort;
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
     * Gets the port property value. The port that this service exposes.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the protocol property value. The protocol name. Possible values are: udp, tcp, sctp, unknownFutureValue.
     * @return a containerPortProtocol
     */
    @jakarta.annotation.Nullable
    public ContainerPortProtocol getProtocol() {
        return this.protocol;
    }
    /**
     * Gets the targetPort property value. The name or number of the port to access on the pods targeted by the service. The port number must be in the range 1 to 65535. The name must be an IANASVCNAME.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetPort() {
        return this.targetPort;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appProtocol", this.getAppProtocol());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("nodePort", this.getNodePort());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeStringValue("targetPort", this.getTargetPort());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appProtocol property value. The application protocol for this port.
     * @param value Value to set for the appProtocol property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppProtocol(@jakarta.annotation.Nullable final String value) {
        this.appProtocol = value;
    }
    /**
     * Sets the name property value. The name of this port within the service.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the nodePort property value. The port on each node on which this service is exposed when the type is either NodePort or LoadBalancer.
     * @param value Value to set for the nodePort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNodePort(@jakarta.annotation.Nullable final Integer value) {
        this.nodePort = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the port property value. The port that this service exposes.
     * @param value Value to set for the port property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the protocol property value. The protocol name. Possible values are: udp, tcp, sctp, unknownFutureValue.
     * @param value Value to set for the protocol property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProtocol(@jakarta.annotation.Nullable final ContainerPortProtocol value) {
        this.protocol = value;
    }
    /**
     * Sets the targetPort property value. The name or number of the port to access on the pods targeted by the service. The port number must be in the range 1 to 65535. The name must be an IANASVCNAME.
     * @param value Value to set for the targetPort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargetPort(@jakarta.annotation.Nullable final String value) {
        this.targetPort = value;
    }
}
