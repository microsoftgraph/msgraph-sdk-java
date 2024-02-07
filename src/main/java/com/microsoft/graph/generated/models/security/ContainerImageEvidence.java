package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContainerImageEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new ContainerImageEvidence and sets the default values.
     */
    public ContainerImageEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.containerImageEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContainerImageEvidence
     */
    @jakarta.annotation.Nonnull
    public static ContainerImageEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContainerImageEvidence();
    }
    /**
     * Gets the digestImage property value. The digest image entity, in case this is a tag image.
     * @return a ContainerImageEvidence
     */
    @jakarta.annotation.Nullable
    public ContainerImageEvidence getDigestImage() {
        return this.backingStore.get("digestImage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("digestImage", (n) -> { this.setDigestImage(n.getObjectValue(ContainerImageEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("imageId", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("registry", (n) -> { this.setRegistry(n.getObjectValue(ContainerRegistryEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the imageId property value. The unique identifier for the container image entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImageId() {
        return this.backingStore.get("imageId");
    }
    /**
     * Gets the registry property value. The container registry for this image.
     * @return a ContainerRegistryEvidence
     */
    @jakarta.annotation.Nullable
    public ContainerRegistryEvidence getRegistry() {
        return this.backingStore.get("registry");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("digestImage", this.getDigestImage());
        writer.writeStringValue("imageId", this.getImageId());
        writer.writeObjectValue("registry", this.getRegistry());
    }
    /**
     * Sets the digestImage property value. The digest image entity, in case this is a tag image.
     * @param value Value to set for the digestImage property.
     */
    public void setDigestImage(@jakarta.annotation.Nullable final ContainerImageEvidence value) {
        this.backingStore.set("digestImage", value);
    }
    /**
     * Sets the imageId property value. The unique identifier for the container image entity.
     * @param value Value to set for the imageId property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageId", value);
    }
    /**
     * Sets the registry property value. The container registry for this image.
     * @param value Value to set for the registry property.
     */
    public void setRegistry(@jakarta.annotation.Nullable final ContainerRegistryEvidence value) {
        this.backingStore.set("registry", value);
    }
}
