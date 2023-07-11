package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Indicator extends Entity implements Parsable {
    /**
     * The artifact property
     */
    private Artifact artifact;
    /**
     * The source property
     */
    private IndicatorSource source;
    /**
     * Instantiates a new indicator and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Indicator() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a indicator
     */
    @javax.annotation.Nonnull
    public static Indicator createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a artifact
     */
    @javax.annotation.Nullable
    public Artifact getArtifact() {
        return this.artifact;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("artifact", (n) -> { this.setArtifact(n.getObjectValue(Artifact::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(IndicatorSource.class)); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. The source property
     * @return a indicatorSource
     */
    @javax.annotation.Nullable
    public IndicatorSource getSource() {
        return this.source;
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
        writer.writeObjectValue("artifact", this.getArtifact());
        writer.writeEnumValue("source", this.getSource());
    }
    /**
     * Sets the artifact property value. The artifact property
     * @param value Value to set for the artifact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArtifact(@javax.annotation.Nullable final Artifact value) {
        this.artifact = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final IndicatorSource value) {
        this.source = value;
    }
}
