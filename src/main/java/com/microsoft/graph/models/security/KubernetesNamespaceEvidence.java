package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesNamespaceEvidence extends AlertEvidence implements Parsable {
    /**
     * The cluster property
     */
    private KubernetesClusterEvidence cluster;
    /**
     * The labels property
     */
    private Dictionary labels;
    /**
     * The name property
     */
    private String name;
    /**
     * Instantiates a new kubernetesNamespaceEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KubernetesNamespaceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesNamespaceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesNamespaceEvidence
     */
    @javax.annotation.Nonnull
    public static KubernetesNamespaceEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesNamespaceEvidence();
    }
    /**
     * Gets the cluster property value. The cluster property
     * @return a kubernetesClusterEvidence
     */
    @javax.annotation.Nullable
    public KubernetesClusterEvidence getCluster() {
        return this.cluster;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cluster", (n) -> { this.setCluster(n.getObjectValue(KubernetesClusterEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("cluster", this.getCluster());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
    }
    /**
     * Sets the cluster property value. The cluster property
     * @param value Value to set for the cluster property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCluster(@javax.annotation.Nullable final KubernetesClusterEvidence value) {
        this.cluster = value;
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
}
