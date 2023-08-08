package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContainerImageEvidence extends AlertEvidence implements Parsable {
    /**
     * The digest image entity, in case this is a tag image.
     */
    private ContainerImageEvidence digestImage;
    /**
     * The unique identifier for the container image entity.
     */
    private String imageId;
    /**
     * The container registry for this image.
     */
    private ContainerRegistryEvidence registry;
    /**
     * Instantiates a new containerImageEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ContainerImageEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.containerImageEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a containerImageEvidence
     */
    @javax.annotation.Nonnull
    public static ContainerImageEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContainerImageEvidence();
    }
    /**
     * Gets the digestImage property value. The digest image entity, in case this is a tag image.
     * @return a containerImageEvidence
     */
    @javax.annotation.Nullable
    public ContainerImageEvidence getDigestImage() {
        return this.digestImage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("digestImage", (n) -> { this.setDigestImage(n.getObjectValue(ContainerImageEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("imageId", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("registry", (n) -> { this.setRegistry(n.getObjectValue(ContainerRegistryEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the imageId property value. The unique identifier for the container image entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImageId() {
        return this.imageId;
    }
    /**
     * Gets the registry property value. The container registry for this image.
     * @return a containerRegistryEvidence
     */
    @javax.annotation.Nullable
    public ContainerRegistryEvidence getRegistry() {
        return this.registry;
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
        writer.writeObjectValue("digestImage", this.getDigestImage());
        writer.writeStringValue("imageId", this.getImageId());
        writer.writeObjectValue("registry", this.getRegistry());
    }
    /**
     * Sets the digestImage property value. The digest image entity, in case this is a tag image.
     * @param value Value to set for the digestImage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDigestImage(@javax.annotation.Nullable final ContainerImageEvidence value) {
        this.digestImage = value;
    }
    /**
     * Sets the imageId property value. The unique identifier for the container image entity.
     * @param value Value to set for the imageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageId(@javax.annotation.Nullable final String value) {
        this.imageId = value;
    }
    /**
     * Sets the registry property value. The container registry for this image.
     * @param value Value to set for the registry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistry(@javax.annotation.Nullable final ContainerRegistryEvidence value) {
        this.registry = value;
    }
}
