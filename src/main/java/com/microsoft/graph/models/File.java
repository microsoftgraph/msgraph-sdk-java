package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class File implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Hashes of the file's binary content, if available. Read-only.
     */
    private Hashes hashes;
    /**
     * The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file was uploaded. Read-only.
     */
    private String mimeType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The processingMetadata property
     */
    private Boolean processingMetadata;
    /**
     * Instantiates a new file and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public File() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a file
     */
    @javax.annotation.Nonnull
    public static File createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new File();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("hashes", (n) -> { this.setHashes(n.getObjectValue(Hashes::createFromDiscriminatorValue)); });
        deserializerMap.put("mimeType", (n) -> { this.setMimeType(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("processingMetadata", (n) -> { this.setProcessingMetadata(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hashes property value. Hashes of the file's binary content, if available. Read-only.
     * @return a hashes
     */
    @javax.annotation.Nullable
    public Hashes getHashes() {
        return this.hashes;
    }
    /**
     * Gets the mimeType property value. The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file was uploaded. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMimeType() {
        return this.mimeType;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the processingMetadata property value. The processingMetadata property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProcessingMetadata() {
        return this.processingMetadata;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("hashes", this.getHashes());
        writer.writeStringValue("mimeType", this.getMimeType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("processingMetadata", this.getProcessingMetadata());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hashes property value. Hashes of the file's binary content, if available. Read-only.
     * @param value Value to set for the hashes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHashes(@javax.annotation.Nullable final Hashes value) {
        this.hashes = value;
    }
    /**
     * Sets the mimeType property value. The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file was uploaded. Read-only.
     * @param value Value to set for the mimeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMimeType(@javax.annotation.Nullable final String value) {
        this.mimeType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the processingMetadata property value. The processingMetadata property
     * @param value Value to set for the processingMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessingMetadata(@javax.annotation.Nullable final Boolean value) {
        this.processingMetadata = value;
    }
}
