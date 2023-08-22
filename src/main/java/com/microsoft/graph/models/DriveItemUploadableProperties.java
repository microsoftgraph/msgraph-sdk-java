package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveItemUploadableProperties implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
     */
    private String description;
    /**
     * Provides an expected file size to perform a quota check prior to upload. Only on OneDrive Personal.
     */
    private Long fileSize;
    /**
     * File system information on client. Read-write.
     */
    private FileSystemInfo fileSystemInfo;
    /**
     * The name of the item (filename and extension). Read-write.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new driveItemUploadableProperties and sets the default values.
     */
    public DriveItemUploadableProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a driveItemUploadableProperties
     */
    @jakarta.annotation.Nonnull
    public static DriveItemUploadableProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItemUploadableProperties();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the description property value. Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("fileSystemInfo", (n) -> { this.setFileSystemInfo(n.getObjectValue(FileSystemInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileSize property value. Provides an expected file size to perform a quota check prior to upload. Only on OneDrive Personal.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getFileSize() {
        return this.fileSize;
    }
    /**
     * Gets the fileSystemInfo property value. File system information on client. Read-write.
     * @return a fileSystemInfo
     */
    @jakarta.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this.fileSystemInfo;
    }
    /**
     * Gets the name property value. The name of the item (filename and extension). Read-write.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeObjectValue("fileSystemInfo", this.getFileSystemInfo());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the description property value. Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the fileSize property value. Provides an expected file size to perform a quota check prior to upload. Only on OneDrive Personal.
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Long value) {
        this.fileSize = value;
    }
    /**
     * Sets the fileSystemInfo property value. File system information on client. Read-write.
     * @param value Value to set for the fileSystemInfo property.
     */
    public void setFileSystemInfo(@jakarta.annotation.Nullable final FileSystemInfo value) {
        this.fileSystemInfo = value;
    }
    /**
     * Sets the name property value. The name of the item (filename and extension). Read-write.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
