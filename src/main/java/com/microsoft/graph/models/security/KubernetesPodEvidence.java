package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesPodEvidence extends AlertEvidence implements Parsable {
    /**
     * The containers property
     */
    private java.util.List<ContainerEvidence> containers;
    /**
     * The controller property
     */
    private KubernetesControllerEvidence controller;
    /**
     * The ephemeralContainers property
     */
    private java.util.List<ContainerEvidence> ephemeralContainers;
    /**
     * The initContainers property
     */
    private java.util.List<ContainerEvidence> initContainers;
    /**
     * The labels property
     */
    private Dictionary labels;
    /**
     * The name property
     */
    private String name;
    /**
     * The namespace property
     */
    private KubernetesNamespaceEvidence namespace;
    /**
     * The podIp property
     */
    private IpEvidence podIp;
    /**
     * The serviceAccount property
     */
    private KubernetesServiceAccountEvidence serviceAccount;
    /**
     * Instantiates a new kubernetesPodEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KubernetesPodEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesPodEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesPodEvidence
     */
    @javax.annotation.Nonnull
    public static KubernetesPodEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesPodEvidence();
    }
    /**
     * Gets the containers property value. The containers property
     * @return a containerEvidence
     */
    @javax.annotation.Nullable
    public java.util.List<ContainerEvidence> getContainers() {
        return this.containers;
    }
    /**
     * Gets the controller property value. The controller property
     * @return a kubernetesControllerEvidence
     */
    @javax.annotation.Nullable
    public KubernetesControllerEvidence getController() {
        return this.controller;
    }
    /**
     * Gets the ephemeralContainers property value. The ephemeralContainers property
     * @return a containerEvidence
     */
    @javax.annotation.Nullable
    public java.util.List<ContainerEvidence> getEphemeralContainers() {
        return this.ephemeralContainers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the initContainers property value. The initContainers property
     * @return a containerEvidence
     */
    @javax.annotation.Nullable
    public java.util.List<ContainerEvidence> getInitContainers() {
        return this.initContainers;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a dictionary
     */
    @javax.annotation.Nullable
    public Dictionary getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the namespace property value. The namespace property
     * @return a kubernetesNamespaceEvidence
     */
    @javax.annotation.Nullable
    public KubernetesNamespaceEvidence getNamespace() {
        return this.namespace;
    }
    /**
     * Gets the podIp property value. The podIp property
     * @return a ipEvidence
     */
    @javax.annotation.Nullable
    public IpEvidence getPodIp() {
        return this.podIp;
    }
    /**
     * Gets the serviceAccount property value. The serviceAccount property
     * @return a kubernetesServiceAccountEvidence
     */
    @javax.annotation.Nullable
    public KubernetesServiceAccountEvidence getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the containers property value. The containers property
     * @param value Value to set for the containers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainers(@javax.annotation.Nullable final java.util.List<ContainerEvidence> value) {
        this.containers = value;
    }
    /**
     * Sets the controller property value. The controller property
     * @param value Value to set for the controller property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setController(@javax.annotation.Nullable final KubernetesControllerEvidence value) {
        this.controller = value;
    }
    /**
     * Sets the ephemeralContainers property value. The ephemeralContainers property
     * @param value Value to set for the ephemeralContainers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEphemeralContainers(@javax.annotation.Nullable final java.util.List<ContainerEvidence> value) {
        this.ephemeralContainers = value;
    }
    /**
     * Sets the initContainers property value. The initContainers property
     * @param value Value to set for the initContainers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitContainers(@javax.annotation.Nullable final java.util.List<ContainerEvidence> value) {
        this.initContainers = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabels(@javax.annotation.Nullable final Dictionary value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the namespace property value. The namespace property
     * @param value Value to set for the namespace property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNamespace(@javax.annotation.Nullable final KubernetesNamespaceEvidence value) {
        this.namespace = value;
    }
    /**
     * Sets the podIp property value. The podIp property
     * @param value Value to set for the podIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPodIp(@javax.annotation.Nullable final IpEvidence value) {
        this.podIp = value;
    }
    /**
     * Sets the serviceAccount property value. The serviceAccount property
     * @param value Value to set for the serviceAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceAccount(@javax.annotation.Nullable final KubernetesServiceAccountEvidence value) {
        this.serviceAccount = value;
    }
}
