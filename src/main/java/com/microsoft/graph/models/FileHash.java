package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileHash implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** File hash type. Possible values are: unknown, sha1, sha256, md5, authenticodeHash256, lsHash, ctph, peSha1, peSha256. */
    private FileHashType _hashType;
    /** Value of the file hash. */
    private String _hashValue;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new fileHash and sets the default values.
     * @return a void
     */
    public FileHash() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.fileHash");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileHash
     */
    @javax.annotation.Nonnull
    public static FileHash createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileHash();
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
        final FileHash currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("hashType", (n) -> { currentObject.setHashType(n.getEnumValue(FileHashType.class)); });
            this.put("hashValue", (n) -> { currentObject.setHashValue(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hashType property value. File hash type. Possible values are: unknown, sha1, sha256, md5, authenticodeHash256, lsHash, ctph, peSha1, peSha256.
     * @return a fileHashType
     */
    @javax.annotation.Nullable
    public FileHashType getHashType() {
        return this._hashType;
    }
    /**
     * Gets the hashValue property value. Value of the file hash.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHashValue() {
        return this._hashValue;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("hashType", this.getHashType());
        writer.writeStringValue("hashValue", this.getHashValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the hashType property value. File hash type. Possible values are: unknown, sha1, sha256, md5, authenticodeHash256, lsHash, ctph, peSha1, peSha256.
     * @param value Value to set for the hashType property.
     * @return a void
     */
    public void setHashType(@javax.annotation.Nullable final FileHashType value) {
        this._hashType = value;
    }
    /**
     * Sets the hashValue property value. Value of the file hash.
     * @param value Value to set for the hashValue property.
     * @return a void
     */
    public void setHashValue(@javax.annotation.Nullable final String value) {
        this._hashValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
