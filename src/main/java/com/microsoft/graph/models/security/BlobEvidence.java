package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BlobEvidence extends AlertEvidence implements Parsable {
    /**
     * The blobContainer property
     */
    private BlobContainerEvidence blobContainer;
    /**
     * The etag property
     */
    private String etag;
    /**
     * The fileHashes property
     */
    private java.util.List<FileHash> fileHashes;
    /**
     * The name property
     */
    private String name;
    /**
     * The url property
     */
    private String url;
    /**
     * Instantiates a new blobEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BlobEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.blobEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a blobEvidence
     */
    @javax.annotation.Nonnull
    public static BlobEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlobEvidence();
    }
    /**
     * Gets the blobContainer property value. The blobContainer property
     * @return a blobContainerEvidence
     */
    @javax.annotation.Nullable
    public BlobContainerEvidence getBlobContainer() {
        return this.blobContainer;
    }
    /**
     * Gets the etag property value. The etag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEtag() {
        return this.etag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blobContainer", (n) -> { this.setBlobContainer(n.getObjectValue(BlobContainerEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("etag", (n) -> { this.setEtag(n.getStringValue()); });
        deserializerMap.put("fileHashes", (n) -> { this.setFileHashes(n.getCollectionOfObjectValues(FileHash::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileHashes property value. The fileHashes property
     * @return a fileHash
     */
    @javax.annotation.Nullable
    public java.util.List<FileHash> getFileHashes() {
        return this.fileHashes;
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
        writer.writeObjectValue("blobContainer", this.getBlobContainer());
        writer.writeStringValue("etag", this.getEtag());
        writer.writeCollectionOfObjectValues("fileHashes", this.getFileHashes());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the blobContainer property value. The blobContainer property
     * @param value Value to set for the blobContainer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlobContainer(@javax.annotation.Nullable final BlobContainerEvidence value) {
        this.blobContainer = value;
    }
    /**
     * Sets the etag property value. The etag property
     * @param value Value to set for the etag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEtag(@javax.annotation.Nullable final String value) {
        this.etag = value;
    }
    /**
     * Sets the fileHashes property value. The fileHashes property
     * @param value Value to set for the fileHashes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileHashes(@javax.annotation.Nullable final java.util.List<FileHash> value) {
        this.fileHashes = value;
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
     * Sets the url property value. The url property
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this.url = value;
    }
}
