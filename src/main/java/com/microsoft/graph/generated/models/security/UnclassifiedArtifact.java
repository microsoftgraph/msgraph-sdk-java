package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnclassifiedArtifact extends Artifact implements Parsable {
    /**
     * Instantiates a new {@link UnclassifiedArtifact} and sets the default values.
     */
    public UnclassifiedArtifact() {
        super();
        this.setOdataType("#microsoft.graph.security.unclassifiedArtifact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnclassifiedArtifact}
     */
    @jakarta.annotation.Nonnull
    public static UnclassifiedArtifact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnclassifiedArtifact();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kind property value. The kind for this unclassifiedArtifact resource, describing what this value means.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKind() {
        return this.backingStore.get("kind");
    }
    /**
     * Gets the value property value. The value for this unclassifiedArtifact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("kind", this.getKind());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the kind property value. The kind for this unclassifiedArtifact resource, describing what this value means.
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kind", value);
    }
    /**
     * Sets the value property value. The value for this unclassifiedArtifact.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
