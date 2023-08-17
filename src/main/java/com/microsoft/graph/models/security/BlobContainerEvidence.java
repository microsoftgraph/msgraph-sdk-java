package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BlobContainerEvidence extends AlertEvidence implements Parsable {
    /**
     * The name of the blob container.
     */
    private String name;
    /**
     * The storage which the blob container belongs to.
     */
    private AzureResourceEvidence storageResource;
    /**
     * The full URL representation of the blob container.
     */
    private String url;
    /**
     * Instantiates a new blobContainerEvidence and sets the default values.
     */
    public BlobContainerEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.blobContainerEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a blobContainerEvidence
     */
    @jakarta.annotation.Nonnull
    public static BlobContainerEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlobContainerEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("storageResource", (n) -> { this.setStorageResource(n.getObjectValue(AzureResourceEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the blob container.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the storageResource property value. The storage which the blob container belongs to.
     * @return a azureResourceEvidence
     */
    @jakarta.annotation.Nullable
    public AzureResourceEvidence getStorageResource() {
        return this.storageResource;
    }
    /**
     * Gets the url property value. The full URL representation of the blob container.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("storageResource", this.getStorageResource());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the name property value. The name of the blob container.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the storageResource property value. The storage which the blob container belongs to.
     * @param value Value to set for the storageResource property.
     */
    public void setStorageResource(@jakarta.annotation.Nullable final AzureResourceEvidence value) {
        this.storageResource = value;
    }
    /**
     * Sets the url property value. The full URL representation of the blob container.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
