package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPackage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotPackage} and sets the default values.
     */
    public CopilotPackage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPackage}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPackage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.copilotPackageDetail": return new CopilotPackageDetail();
            }
        }
        return new CopilotPackage();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the assetId property value. The assetId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssetId() {
        return this.backingStore.get("assetId");
    }
    /**
     * Gets the availableTo property value. The availableTo property
     * @return a {@link PackageStatus}
     */
    @jakarta.annotation.Nullable
    public PackageStatus getAvailableTo() {
        return this.backingStore.get("availableTo");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deployedTo property value. The deployedTo property
     * @return a {@link PackageStatus}
     */
    @jakarta.annotation.Nullable
    public PackageStatus getDeployedTo() {
        return this.backingStore.get("deployedTo");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the elementTypes property value. The elementTypes property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getElementTypes() {
        return this.backingStore.get("elementTypes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("assetId", (n) -> { this.setAssetId(n.getStringValue()); });
        deserializerMap.put("availableTo", (n) -> { this.setAvailableTo(n.getEnumValue(PackageStatus::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deployedTo", (n) -> { this.setDeployedTo(n.getEnumValue(PackageStatus::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("elementTypes", (n) -> { this.setElementTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isBlocked", (n) -> { this.setIsBlocked(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("manifestId", (n) -> { this.setManifestId(n.getStringValue()); });
        deserializerMap.put("manifestVersion", (n) -> { this.setManifestVersion(n.getStringValue()); });
        deserializerMap.put("ownerId", (n) -> { this.setOwnerId(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("shortDescription", (n) -> { this.setShortDescription(n.getStringValue()); });
        deserializerMap.put("supportedHosts", (n) -> { this.setSupportedHosts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PackageType::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        deserializerMap.put("zipFile", (n) -> { this.setZipFile(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBlocked property value. The isBlocked property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBlocked() {
        return this.backingStore.get("isBlocked");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the manifestId property value. The manifestId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManifestId() {
        return this.backingStore.get("manifestId");
    }
    /**
     * Gets the manifestVersion property value. The manifestVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManifestVersion() {
        return this.backingStore.get("manifestVersion");
    }
    /**
     * Gets the ownerId property value. The ownerId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerId() {
        return this.backingStore.get("ownerId");
    }
    /**
     * Gets the platform property value. The platform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the publisher property value. The publisher property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the shortDescription property value. The shortDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShortDescription() {
        return this.backingStore.get("shortDescription");
    }
    /**
     * Gets the supportedHosts property value. The supportedHosts property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedHosts() {
        return this.backingStore.get("supportedHosts");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link PackageType}
     */
    @jakarta.annotation.Nullable
    public PackageType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the zipFile property value. The zipFile property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getZipFile() {
        return this.backingStore.get("zipFile");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("assetId", this.getAssetId());
        writer.writeEnumValue("availableTo", this.getAvailableTo());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("deployedTo", this.getDeployedTo());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("elementTypes", this.getElementTypes());
        writer.writeBooleanValue("isBlocked", this.getIsBlocked());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("manifestId", this.getManifestId());
        writer.writeStringValue("manifestVersion", this.getManifestVersion());
        writer.writeStringValue("ownerId", this.getOwnerId());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeStringValue("shortDescription", this.getShortDescription());
        writer.writeCollectionOfPrimitiveValues("supportedHosts", this.getSupportedHosts());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("version", this.getVersion());
        writer.writeByteArrayValue("zipFile", this.getZipFile());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the assetId property value. The assetId property
     * @param value Value to set for the assetId property.
     */
    public void setAssetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assetId", value);
    }
    /**
     * Sets the availableTo property value. The availableTo property
     * @param value Value to set for the availableTo property.
     */
    public void setAvailableTo(@jakarta.annotation.Nullable final PackageStatus value) {
        this.backingStore.set("availableTo", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deployedTo property value. The deployedTo property
     * @param value Value to set for the deployedTo property.
     */
    public void setDeployedTo(@jakarta.annotation.Nullable final PackageStatus value) {
        this.backingStore.set("deployedTo", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the elementTypes property value. The elementTypes property
     * @param value Value to set for the elementTypes property.
     */
    public void setElementTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("elementTypes", value);
    }
    /**
     * Sets the isBlocked property value. The isBlocked property
     * @param value Value to set for the isBlocked property.
     */
    public void setIsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBlocked", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the manifestId property value. The manifestId property
     * @param value Value to set for the manifestId property.
     */
    public void setManifestId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manifestId", value);
    }
    /**
     * Sets the manifestVersion property value. The manifestVersion property
     * @param value Value to set for the manifestVersion property.
     */
    public void setManifestVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manifestVersion", value);
    }
    /**
     * Sets the ownerId property value. The ownerId property
     * @param value Value to set for the ownerId property.
     */
    public void setOwnerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerId", value);
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the publisher property value. The publisher property
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the shortDescription property value. The shortDescription property
     * @param value Value to set for the shortDescription property.
     */
    public void setShortDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("shortDescription", value);
    }
    /**
     * Sets the supportedHosts property value. The supportedHosts property
     * @param value Value to set for the supportedHosts property.
     */
    public void setSupportedHosts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedHosts", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PackageType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
    /**
     * Sets the zipFile property value. The zipFile property
     * @param value Value to set for the zipFile property.
     */
    public void setZipFile(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("zipFile", value);
    }
}
