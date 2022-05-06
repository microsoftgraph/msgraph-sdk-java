package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileSecurityState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Complex type containing file hashes (cryptographic and location-sensitive).  */
    private FileHash _fileHash;
    /** File name (without path).  */
    private String _name;
    /** Full file path of the file/imageFile.  */
    private String _path;
    /** Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a percentage.  */
    private String _riskScore;
    /**
     * Instantiates a new fileSecurityState and sets the default values.
     * @return a void
     */
    public FileSecurityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileSecurityState
     */
    @javax.annotation.Nonnull
    public static FileSecurityState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileSecurityState();
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
        final FileSecurityState currentObject = this;
        return new HashMap<>(4) {{
            this.put("fileHash", (n) -> { currentObject.setFileHash(n.getObjectValue(FileHash::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("path", (n) -> { currentObject.setPath(n.getStringValue()); });
            this.put("riskScore", (n) -> { currentObject.setRiskScore(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @return a fileHash
     */
    @javax.annotation.Nullable
    public FileHash getFileHash() {
        return this._fileHash;
    }
    /**
     * Gets the name property value. File name (without path).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the path property value. Full file path of the file/imageFile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this._path;
    }
    /**
     * Gets the riskScore property value. Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a percentage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this._riskScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fileHash", this.getFileHash());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("path", this.getPath());
        writer.writeStringValue("riskScore", this.getRiskScore());
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
     * Sets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @param value Value to set for the fileHash property.
     * @return a void
     */
    public void setFileHash(@javax.annotation.Nullable final FileHash value) {
        this._fileHash = value;
    }
    /**
     * Sets the name property value. File name (without path).
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the path property value. Full file path of the file/imageFile.
     * @param value Value to set for the path property.
     * @return a void
     */
    public void setPath(@javax.annotation.Nullable final String value) {
        this._path = value;
    }
    /**
     * Sets the riskScore property value. Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this._riskScore = value;
    }
}
