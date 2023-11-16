package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KubernetesPodEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new KubernetesPodEvidence and sets the default values.
     */
    public KubernetesPodEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesPodEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KubernetesPodEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesPodEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesPodEvidence();
    }
    /**
     * Gets the containers property value. The list of pod containers which are not init or ephemeral containers.
     * @return a java.util.List<ContainerEvidence>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContainerEvidence> getContainers() {
        return this.BackingStore.get("containers");
    }
    /**
     * Gets the controller property value. The pod controller.
     * @return a KubernetesControllerEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesControllerEvidence getController() {
        return this.BackingStore.get("controller");
    }
    /**
     * Gets the ephemeralContainers property value. The list of pod ephemeral containers.
     * @return a java.util.List<ContainerEvidence>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContainerEvidence> getEphemeralContainers() {
        return this.BackingStore.get("ephemeralContainers");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containers", (n) -> { this.setContainers(n.getCollectionOfObjectValues(ContainerEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("controller", (n) -> { this.setController(n.getObjectValue(KubernetesControllerEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("ephemeralContainers", (n) -> { this.setEphemeralContainers(n.getCollectionOfObjectValues(ContainerEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("initContainers", (n) -> { this.setInitContainers(n.getCollectionOfObjectValues(ContainerEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("namespace", (n) -> { this.setNamespace(n.getObjectValue(KubernetesNamespaceEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("podIp", (n) -> { this.setPodIp(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceAccount", (n) -> { this.setServiceAccount(n.getObjectValue(KubernetesServiceAccountEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initContainers property value. The list of pod init containers.
     * @return a java.util.List<ContainerEvidence>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContainerEvidence> getInitContainers() {
        return this.BackingStore.get("initContainers");
    }
    /**
     * Gets the labels property value. The pod labels.
     * @return a Dictionary
     */
    @jakarta.annotation.Nullable
    public Dictionary getLabels() {
        return this.BackingStore.get("labels");
    }
    /**
     * Gets the name property value. The pod name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the namespace property value. The pod namespace.
     * @return a KubernetesNamespaceEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesNamespaceEvidence getNamespace() {
        return this.BackingStore.get("namespace");
    }
    /**
     * Gets the podIp property value. The pod IP.
     * @return a IpEvidence
     */
    @jakarta.annotation.Nullable
    public IpEvidence getPodIp() {
        return this.BackingStore.get("podIp");
    }
    /**
     * Gets the serviceAccount property value. The pod service account.
     * @return a KubernetesServiceAccountEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesServiceAccountEvidence getServiceAccount() {
        return this.BackingStore.get("serviceAccount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("containers", this.getContainers());
        writer.writeObjectValue("controller", this.getController());
        writer.writeCollectionOfObjectValues("ephemeralContainers", this.getEphemeralContainers());
        writer.writeCollectionOfObjectValues("initContainers", this.getInitContainers());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("namespace", this.getNamespace());
        writer.writeObjectValue("podIp", this.getPodIp());
        writer.writeObjectValue("serviceAccount", this.getServiceAccount());
    }
    /**
     * Sets the containers property value. The list of pod containers which are not init or ephemeral containers.
     * @param value Value to set for the containers property.
     */
    public void setContainers(@jakarta.annotation.Nullable final java.util.List<ContainerEvidence> value) {
        this.BackingStore.set("containers", value);
    }
    /**
     * Sets the controller property value. The pod controller.
     * @param value Value to set for the controller property.
     */
    public void setController(@jakarta.annotation.Nullable final KubernetesControllerEvidence value) {
        this.BackingStore.set("controller", value);
    }
    /**
     * Sets the ephemeralContainers property value. The list of pod ephemeral containers.
     * @param value Value to set for the ephemeralContainers property.
     */
    public void setEphemeralContainers(@jakarta.annotation.Nullable final java.util.List<ContainerEvidence> value) {
        this.BackingStore.set("ephemeralContainers", value);
    }
    /**
     * Sets the initContainers property value. The list of pod init containers.
     * @param value Value to set for the initContainers property.
     */
    public void setInitContainers(@jakarta.annotation.Nullable final java.util.List<ContainerEvidence> value) {
        this.BackingStore.set("initContainers", value);
    }
    /**
     * Sets the labels property value. The pod labels.
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Dictionary value) {
        this.BackingStore.set("labels", value);
    }
    /**
     * Sets the name property value. The pod name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the namespace property value. The pod namespace.
     * @param value Value to set for the namespace property.
     */
    public void setNamespace(@jakarta.annotation.Nullable final KubernetesNamespaceEvidence value) {
        this.BackingStore.set("namespace", value);
    }
    /**
     * Sets the podIp property value. The pod IP.
     * @param value Value to set for the podIp property.
     */
    public void setPodIp(@jakarta.annotation.Nullable final IpEvidence value) {
        this.BackingStore.set("podIp", value);
    }
    /**
     * Sets the serviceAccount property value. The pod service account.
     * @param value Value to set for the serviceAccount property.
     */
    public void setServiceAccount(@jakarta.annotation.Nullable final KubernetesServiceAccountEvidence value) {
        this.BackingStore.set("serviceAccount", value);
    }
}
