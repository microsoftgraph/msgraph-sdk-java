package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KubernetesServiceAccountEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link KubernetesServiceAccountEvidence} and sets the default values.
     */
    public KubernetesServiceAccountEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.kubernetesServiceAccountEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link KubernetesServiceAccountEvidence}
     */
    @jakarta.annotation.Nonnull
    public static KubernetesServiceAccountEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubernetesServiceAccountEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the namespace property value. The service account namespace.
     * @return a {@link KubernetesNamespaceEvidence}
     */
    @jakarta.annotation.Nullable
    public KubernetesNamespaceEvidence getNamespace() {
        return this.backingStore.get("namespace");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("namespace", this.getNamespace());
    }
    /**
     * Sets the name property value. The service account name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the namespace property value. The service account namespace.
     * @param value Value to set for the namespace property.
     */
    public void setNamespace(@jakarta.annotation.Nullable final KubernetesNamespaceEvidence value) {
        this.backingStore.set("namespace", value);
    }
}
