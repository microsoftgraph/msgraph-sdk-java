package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Information Protection AppLocker File */
public class WindowsInformationProtectionAppLockerFile extends Entity implements Parsable {
    /** The friendly name */
    private String _displayName;
    /** File as a byte array */
    private byte[] _file;
    /** SHA256 hash of the file */
    private String _fileHash;
    /** Version of the entity. */
    private String _version;
    /**
     * Instantiates a new windowsInformationProtectionAppLockerFile and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionAppLockerFile() {
        super();
        this.setOdataType("#microsoft.graph.windowsInformationProtectionAppLockerFile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionAppLockerFile
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionAppLockerFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionAppLockerFile();
    }
    /**
     * Gets the displayName property value. The friendly name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionAppLockerFile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("file", (n) -> { currentObject.setFile(n.getByteArrayValue()); });
            this.put("fileHash", (n) -> { currentObject.setFileHash(n.getStringValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the file property value. File as a byte array
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getFile() {
        return this._file;
    }
    /**
     * Gets the fileHash property value. SHA256 hash of the file
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileHash() {
        return this._fileHash;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeByteArrayValue("file", this.getFile());
        writer.writeStringValue("fileHash", this.getFileHash());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The friendly name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the file property value. File as a byte array
     * @param value Value to set for the file property.
     * @return a void
     */
    public void setFile(@javax.annotation.Nullable final byte[] value) {
        this._file = value;
    }
    /**
     * Sets the fileHash property value. SHA256 hash of the file
     * @param value Value to set for the fileHash property.
     * @return a void
     */
    public void setFileHash(@javax.annotation.Nullable final String value) {
        this._fileHash = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
