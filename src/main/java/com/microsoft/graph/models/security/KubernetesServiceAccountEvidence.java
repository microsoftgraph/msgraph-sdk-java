package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesServiceAccountEvidence extends AlertEvidence implements Parsable {
    /**
     * The name property
     */
    private String name;
    /**
     * The namespace property
     */
    private KubernetesNamespaceEvidence namespace;
    /**
     * Instantiates a new kubernetesServiceAccountEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public KubernetesServiceAccountEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesServiceAccountEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesServiceAccountEvidence
     */
    @javax.annotation.Nonnull
    public static KubernetesServiceAccountEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesServiceAccountEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("namespace", (n) -> { this.setNamespace(n.getObjectValue(KubernetesNamespaceEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("namespace", this.getNamespace());
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
}
