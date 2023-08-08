package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesNamespaceEvidence extends AlertEvidence implements Parsable {
    /**
     * The namespace cluster.
     */
    private KubernetesClusterEvidence cluster;
    /**
     * The labels for the Kubernetes pod.
     */
    private Dictionary labels;
    /**
     * The namespace name.
     */
    private String name;
    /**
     * Instantiates a new kubernetesNamespaceEvidence and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public KubernetesNamespaceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesNamespaceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesNamespaceEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesNamespaceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesNamespaceEvidence();
    }
    /**
     * Gets the cluster property value. The namespace cluster.
     * @return a kubernetesClusterEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesClusterEvidence getCluster() {
        return this.cluster;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cluster", (n) -> { this.setCluster(n.getObjectValue(KubernetesClusterEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. The labels for the Kubernetes pod.
     * @return a dictionary
     */
    @jakarta.annotation.Nullable
    public Dictionary getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. The namespace name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("cluster", this.getCluster());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the cluster property value. The namespace cluster.
     * @param value Value to set for the cluster property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCluster(@jakarta.annotation.Nullable final KubernetesClusterEvidence value) {
        this.cluster = value;
    }
    /**
     * Sets the labels property value. The labels for the Kubernetes pod.
     * @param value Value to set for the labels property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLabels(@jakarta.annotation.Nullable final Dictionary value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. The namespace name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}
