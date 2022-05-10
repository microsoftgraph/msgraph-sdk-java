package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class File implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Hashes of the file's binary content, if available. Read-only. */
    private Hashes _hashes;
    /** The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file was uploaded. Read-only. */
    private String _mimeType;
    /** The processingMetadata property */
    private Boolean _processingMetadata;
    /**
     * Instantiates a new file and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final File currentObject = this;
        return new HashMap<>(3) {{
            this.put("hashes", (n) -> { currentObject.setHashes(n.getObjectValue(Hashes::createFromDiscriminatorValue)); });
            this.put("mimeType", (n) -> { currentObject.setMimeType(n.getStringValue()); });
            this.put("processingMetadata", (n) -> { currentObject.setProcessingMetadata(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the hashes property value. Hashes of the file's binary content, if available. Read-only.
     * @return a hashes
     */
    @javax.annotation.Nullable
    public Hashes getHashes() {
        return this._hashes;
    }
    /**
     * Gets the mimeType property value. The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file was uploaded. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMimeType() {
        return this._mimeType;
    }
    /**
     * Gets the processingMetadata property value. The processingMetadata property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProcessingMetadata() {
        return this._processingMetadata;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("hashes", this.getHashes());
        writer.writeStringValue("mimeType", this.getMimeType());
        writer.writeBooleanValue("processingMetadata", this.getProcessingMetadata());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the hashes property value. Hashes of the file's binary content, if available. Read-only.
     * @param value Value to set for the hashes property.
     * @return a void
     */
    public void setHashes(@javax.annotation.Nullable final Hashes value) {
        this._hashes = value;
    }
    /**
     * Sets the mimeType property value. The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file was uploaded. Read-only.
     * @param value Value to set for the mimeType property.
     * @return a void
     */
    public void setMimeType(@javax.annotation.Nullable final String value) {
        this._mimeType = value;
    }
    /**
     * Sets the processingMetadata property value. The processingMetadata property
     * @param value Value to set for the processingMetadata property.
     * @return a void
     */
    public void setProcessingMetadata(@javax.annotation.Nullable final Boolean value) {
        this._processingMetadata = value;
    }
}
