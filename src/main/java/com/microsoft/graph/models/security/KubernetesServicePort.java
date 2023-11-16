package com.microsoft.graph.models.security;

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
public class KubernetesServicePort implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new KubernetesServicePort and sets the default values.
     */
    public KubernetesServicePort() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KubernetesServicePort
     */
    @jakarta.annotation.Nonnull
    public static KubernetesServicePort createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesServicePort();
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
     * Gets the appProtocol property value. The application protocol for this port.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppProtocol() {
        return this.BackingStore.get("appProtocol");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the nodePort property value. The port on each node on which this service is exposed when the type is either NodePort or LoadBalancer.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNodePort() {
        return this.BackingStore.get("nodePort");
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
     * Gets the port property value. The port that this service exposes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.BackingStore.get("port");
    }
    /**
     * Gets the protocol property value. The protocol name. Possible values are: udp, tcp, sctp, unknownFutureValue.
     * @return a ContainerPortProtocol
     */
    @jakarta.annotation.Nullable
    public ContainerPortProtocol getProtocol() {
        return this.BackingStore.get("protocol");
    }
    /**
     * Gets the targetPort property value. The name or number of the port to access on the pods targeted by the service. The port number must be in the range 1 to 65535. The name must be an IANASVCNAME.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetPort() {
        return this.BackingStore.get("targetPort");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the appProtocol property value. The application protocol for this port.
     * @param value Value to set for the appProtocol property.
     */
    public void setAppProtocol(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appProtocol", value);
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
     * Sets the name property value. The name of this port within the service.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the nodePort property value. The port on each node on which this service is exposed when the type is either NodePort or LoadBalancer.
     * @param value Value to set for the nodePort property.
     */
    public void setNodePort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("nodePort", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the port property value. The port that this service exposes.
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("port", value);
    }
    /**
     * Sets the protocol property value. The protocol name. Possible values are: udp, tcp, sctp, unknownFutureValue.
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final ContainerPortProtocol value) {
        this.BackingStore.set("protocol", value);
    }
    /**
     * Sets the targetPort property value. The name or number of the port to access on the pods targeted by the service. The port number must be in the range 1 to 65535. The name must be an IANASVCNAME.
     * @param value Value to set for the targetPort property.
     */
    public void setTargetPort(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("targetPort", value);
    }
}
