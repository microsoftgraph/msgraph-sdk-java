package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KubernetesServiceEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new KubernetesServiceEvidence and sets the default values.
     */
    public KubernetesServiceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesServiceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KubernetesServiceEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesServiceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesServiceEvidence();
    }
    /**
     * Gets the clusterIP property value. The service cluster IP.
     * @return a IpEvidence
     */
    @jakarta.annotation.Nullable
    public IpEvidence getClusterIP() {
        return this.BackingStore.get("clusterIP");
    }
    /**
     * Gets the externalIPs property value. The service external IPs.
     * @return a java.util.List<IpEvidence>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpEvidence> getExternalIPs() {
        return this.BackingStore.get("externalIPs");
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
     * @return a Dictionary
     */
    @jakarta.annotation.Nullable
    public Dictionary getLabels() {
        return this.BackingStore.get("labels");
    }
    /**
     * Gets the name property value. The service name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the namespace property value. The service namespace.
     * @return a KubernetesNamespaceEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesNamespaceEvidence getNamespace() {
        return this.BackingStore.get("namespace");
    }
    /**
     * Gets the selector property value. The service selector.
     * @return a Dictionary
     */
    @jakarta.annotation.Nullable
    public Dictionary getSelector() {
        return this.BackingStore.get("selector");
    }
    /**
     * Gets the servicePorts property value. The list of service ports.
     * @return a java.util.List<KubernetesServicePort>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KubernetesServicePort> getServicePorts() {
        return this.BackingStore.get("servicePorts");
    }
    /**
     * Gets the serviceType property value. The serviceType property
     * @return a KubernetesServiceType
     */
    @jakarta.annotation.Nullable
    public KubernetesServiceType getServiceType() {
        return this.BackingStore.get("serviceType");
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
        this.BackingStore.set("clusterIP", value);
    }
    /**
     * Sets the externalIPs property value. The service external IPs.
     * @param value Value to set for the externalIPs property.
     */
    public void setExternalIPs(@jakarta.annotation.Nullable final java.util.List<IpEvidence> value) {
        this.BackingStore.set("externalIPs", value);
    }
    /**
     * Sets the labels property value. The service labels.
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Dictionary value) {
        this.BackingStore.set("labels", value);
    }
    /**
     * Sets the name property value. The service name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the namespace property value. The service namespace.
     * @param value Value to set for the namespace property.
     */
    public void setNamespace(@jakarta.annotation.Nullable final KubernetesNamespaceEvidence value) {
        this.BackingStore.set("namespace", value);
    }
    /**
     * Sets the selector property value. The service selector.
     * @param value Value to set for the selector property.
     */
    public void setSelector(@jakarta.annotation.Nullable final Dictionary value) {
        this.BackingStore.set("selector", value);
    }
    /**
     * Sets the servicePorts property value. The list of service ports.
     * @param value Value to set for the servicePorts property.
     */
    public void setServicePorts(@jakarta.annotation.Nullable final java.util.List<KubernetesServicePort> value) {
        this.BackingStore.set("servicePorts", value);
    }
    /**
     * Sets the serviceType property value. The serviceType property
     * @param value Value to set for the serviceType property.
     */
    public void setServiceType(@jakarta.annotation.Nullable final KubernetesServiceType value) {
        this.BackingStore.set("serviceType", value);
    }
}
