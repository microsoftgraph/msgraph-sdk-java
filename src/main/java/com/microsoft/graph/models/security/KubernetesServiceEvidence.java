package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesServiceEvidence extends AlertEvidence implements Parsable {
    /**
     * The service cluster IP.
     */
    private IpEvidence clusterIP;
    /**
     * The service external IPs.
     */
    private java.util.List<IpEvidence> externalIPs;
    /**
     * The service labels.
     */
    private Dictionary labels;
    /**
     * The service name.
     */
    private String name;
    /**
     * The service namespace.
     */
    private KubernetesNamespaceEvidence namespace;
    /**
     * The service selector.
     */
    private Dictionary selector;
    /**
     * The list of service ports.
     */
    private java.util.List<KubernetesServicePort> servicePorts;
    /**
     * The serviceType property
     */
    private KubernetesServiceType serviceType;
    /**
     * Instantiates a new kubernetesServiceEvidence and sets the default values.
     */
    public KubernetesServiceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesServiceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesServiceEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesServiceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesServiceEvidence();
    }
    /**
     * Gets the clusterIP property value. The service cluster IP.
     * @return a ipEvidence
     */
    @jakarta.annotation.Nullable
    public IpEvidence getClusterIP() {
        return this.clusterIP;
    }
    /**
     * Gets the externalIPs property value. The service external IPs.
     * @return a ipEvidence
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpEvidence> getExternalIPs() {
        return this.externalIPs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clusterIP", (n) -> { this.setClusterIP(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("externalIPs", (n) -> { this.setExternalIPs(n.getCollectionOfObjectValues(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("namespace", (n) -> { this.setNamespace(n.getObjectValue(KubernetesNamespaceEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("selector", (n) -> { this.setSelector(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePorts", (n) -> { this.setServicePorts(n.getCollectionOfObjectValues(KubernetesServicePort::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceType", (n) -> { this.setServiceType(n.getEnumValue(KubernetesServiceType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. The service labels.
     * @return a dictionary
     */
    @jakarta.annotation.Nullable
    public Dictionary getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. The service name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the namespace property value. The service namespace.
     * @return a kubernetesNamespaceEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesNamespaceEvidence getNamespace() {
        return this.namespace;
    }
    /**
     * Gets the selector property value. The service selector.
     * @return a dictionary
     */
    @jakarta.annotation.Nullable
    public Dictionary getSelector() {
        return this.selector;
    }
    /**
     * Gets the servicePorts property value. The list of service ports.
     * @return a kubernetesServicePort
     */
    @jakarta.annotation.Nullable
    public java.util.List<KubernetesServicePort> getServicePorts() {
        return this.servicePorts;
    }
    /**
     * Gets the serviceType property value. The serviceType property
     * @return a kubernetesServiceType
     */
    @jakarta.annotation.Nullable
    public KubernetesServiceType getServiceType() {
        return this.serviceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("clusterIP", this.getClusterIP());
        writer.writeCollectionOfObjectValues("externalIPs", this.getExternalIPs());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("namespace", this.getNamespace());
        writer.writeObjectValue("selector", this.getSelector());
        writer.writeCollectionOfObjectValues("servicePorts", this.getServicePorts());
        writer.writeEnumValue("serviceType", this.getServiceType());
    }
    /**
     * Sets the clusterIP property value. The service cluster IP.
     * @param value Value to set for the clusterIP property.
     */
    public void setClusterIP(@jakarta.annotation.Nullable final IpEvidence value) {
        this.clusterIP = value;
    }
    /**
     * Sets the externalIPs property value. The service external IPs.
     * @param value Value to set for the externalIPs property.
     */
    public void setExternalIPs(@jakarta.annotation.Nullable final java.util.List<IpEvidence> value) {
        this.externalIPs = value;
    }
    /**
     * Sets the labels property value. The service labels.
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Dictionary value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. The service name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the namespace property value. The service namespace.
     * @param value Value to set for the namespace property.
     */
    public void setNamespace(@jakarta.annotation.Nullable final KubernetesNamespaceEvidence value) {
        this.namespace = value;
    }
    /**
     * Sets the selector property value. The service selector.
     * @param value Value to set for the selector property.
     */
    public void setSelector(@jakarta.annotation.Nullable final Dictionary value) {
        this.selector = value;
    }
    /**
     * Sets the servicePorts property value. The list of service ports.
     * @param value Value to set for the servicePorts property.
     */
    public void setServicePorts(@jakarta.annotation.Nullable final java.util.List<KubernetesServicePort> value) {
        this.servicePorts = value;
    }
    /**
     * Sets the serviceType property value. The serviceType property
     * @param value Value to set for the serviceType property.
     */
    public void setServiceType(@jakarta.annotation.Nullable final KubernetesServiceType value) {
        this.serviceType = value;
    }
}
