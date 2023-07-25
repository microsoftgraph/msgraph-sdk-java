package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BlobContainerEvidence extends AlertEvidence implements Parsable {
    /**
     * The name property
     */
    private String name;
    /**
     * The storageResource property
     */
    private AzureResourceEvidence storageResource;
    /**
     * The url property
     */
    private String url;
    /**
     * Instantiates a new blobContainerEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BlobContainerEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.blobContainerEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a blobContainerEvidence
     */
    @javax.annotation.Nonnull
    public static BlobContainerEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlobContainerEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("storageResource", (n) -> { this.setStorageResource(n.getObjectValue(AzureResourceEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
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
     * Gets the storageResource property value. The storageResource property
     * @return a azureResourceEvidence
     */
    @javax.annotation.Nullable
    public AzureResourceEvidence getStorageResource() {
        return this.storageResource;
    }
    /**
     * Gets the url property value. The url property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this.url;
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
        writer.writeObjectValue("storageResource", this.getStorageResource());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the storageResource property value. The storageResource property
     * @param value Value to set for the storageResource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageResource(@javax.annotation.Nullable final AzureResourceEvidence value) {
        this.storageResource = value;
    }
    /**
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this.url = value;
    }
}
