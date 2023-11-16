package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KubernetesNamespaceEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new KubernetesNamespaceEvidence and sets the default values.
     */
    public KubernetesNamespaceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesNamespaceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KubernetesNamespaceEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesNamespaceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesNamespaceEvidence();
    }
    /**
     * Gets the cluster property value. The namespace cluster.
     * @return a KubernetesClusterEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesClusterEvidence getCluster() {
        return this.BackingStore.get("cluster");
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
     * @return a Dictionary
     */
    @jakarta.annotation.Nullable
    public Dictionary getLabels() {
        return this.BackingStore.get("labels");
    }
    /**
     * Gets the name property value. The namespace name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setCluster(@jakarta.annotation.Nullable final KubernetesClusterEvidence value) {
        this.BackingStore.set("cluster", value);
    }
    /**
     * Sets the labels property value. The labels for the Kubernetes pod.
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Dictionary value) {
        this.BackingStore.set("labels", value);
    }
    /**
     * Sets the name property value. The namespace name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
}
