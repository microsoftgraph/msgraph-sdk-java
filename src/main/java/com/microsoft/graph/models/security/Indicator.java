package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Indicator extends Entity implements Parsable {
    /**
     * Instantiates a new Indicator and sets the default values.
     */
    public Indicator() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Indicator
     */
    @jakarta.annotation.Nonnull
    public static Indicator createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.articleIndicator": return new ArticleIndicator();
                case "#microsoft.graph.security.intelligenceProfileIndicator": return new IntelligenceProfileIndicator();
            }
        }
        return new Indicator();
    }
    /**
     * Gets the artifact property value. The artifact property
     * @return a Artifact
     */
    @jakarta.annotation.Nullable
    public Artifact getArtifact() {
        return this.backingStore.get("artifact");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("artifact", (n) -> { this.setArtifact(n.getObjectValue(Artifact::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(IndicatorSource.class)); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. The source property
     * @return a IndicatorSource
     */
    @jakarta.annotation.Nullable
    public IndicatorSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("artifact", this.getArtifact());
        writer.writeEnumValue("source", this.getSource());
    }
    /**
     * Sets the artifact property value. The artifact property
     * @param value Value to set for the artifact property.
     */
    public void setArtifact(@jakarta.annotation.Nullable final Artifact value) {
        this.backingStore.set("artifact", value);
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final IndicatorSource value) {
        this.backingStore.set("source", value);
    }
}
