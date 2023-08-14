package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KubernetesServiceAccountEvidence extends AlertEvidence implements Parsable {
    /**
     * The service account name.
     */
    private String name;
    /**
     * The service account namespace.
     */
    private KubernetesNamespaceEvidence namespace;
    /**
     * Instantiates a new kubernetesServiceAccountEvidence and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public KubernetesServiceAccountEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesServiceAccountEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a kubernetesServiceAccountEvidence
     */
    @jakarta.annotation.Nonnull
    public static KubernetesServiceAccountEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesServiceAccountEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("namespace", (n) -> { this.setNamespace(n.getObjectValue(KubernetesNamespaceEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The service account name.
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("namespace", this.getNamespace());
    }
    /**
     * Sets the name property value. The service account name.
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
}
