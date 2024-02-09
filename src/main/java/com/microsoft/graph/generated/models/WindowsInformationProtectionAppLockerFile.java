package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Information Protection AppLocker File
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsInformationProtectionAppLockerFile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsInformationProtectionAppLockerFile} and sets the default values.
     */
    public WindowsInformationProtectionAppLockerFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsInformationProtectionAppLockerFile}
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionAppLockerFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionAppLockerFile();
    }
    /**
     * Gets the displayName property value. The friendly name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getByteArrayValue()); });
        deserializerMap.put("fileHash", (n) -> { this.setFileHash(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. File as a byte array
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getFile() {
        return this.backingStore.get("file");
    }
    /**
     * Gets the fileHash property value. SHA256 hash of the file
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileHash() {
        return this.backingStore.get("fileHash");
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the file property value. File as a byte array
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("file", value);
    }
    /**
     * Sets the fileHash property value. SHA256 hash of the file
     * @param value Value to set for the fileHash property.
     */
    public void setFileHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileHash", value);
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
