package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesControllerEvidence extends AlertEvidence implements Parsable {
    /**
     * The labels for the Kubernetes pod.
     */
    private Dictionary labels;
    /**
     * The controller name.
     */
    private String name;
    /**
     * The service account namespace.
     */
    private KubernetesNamespaceEvidence namespace;
    /**
     * The controller type.
     */
    private String type;
    /**
     * Instantiates a new kubernetesControllerEvidence and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public KubernetesControllerEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesControllerEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesControllerEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesControllerEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesControllerEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Dictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("namespace", (n) -> { this.setNamespace(n.getObjectValue(KubernetesNamespaceEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
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
     * Gets the name property value. The controller name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the namespace property value. The service account namespace.
     * @return a kubernetesNamespaceEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesNamespaceEvidence getNamespace() {
        return this.namespace;
    }
    /**
     * Gets the type property value. The controller type.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
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
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("namespace", this.getNamespace());
        writer.writeStringValue("type", this.getType());
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
     * Sets the name property value. The controller name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the namespace property value. The service account namespace.
     * @param value Value to set for the namespace property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNamespace(@jakarta.annotation.Nullable final KubernetesNamespaceEvidence value) {
        this.namespace = value;
    }
    /**
     * Sets the type property value. The controller type.
     * @param value Value to set for the type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
