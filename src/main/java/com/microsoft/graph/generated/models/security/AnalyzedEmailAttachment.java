package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyzedEmailAttachment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AnalyzedEmailAttachment} and sets the default values.
     */
    public AnalyzedEmailAttachment() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyzedEmailAttachment}
     */
    @jakarta.annotation.Nonnull
    public static AnalyzedEmailAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedEmailAttachment();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the detonationDetails property value. The detonation details of the attachment.
     * @return a {@link DetonationDetails}
     */
    @jakarta.annotation.Nullable
    public DetonationDetails getDetonationDetails() {
        return this.backingStore.get("detonationDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("detonationDetails", (n) -> { this.setDetonationDetails(n.getObjectValue(DetonationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("fileExtension", (n) -> { this.setFileExtension(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getIntegerValue()); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        deserializerMap.put("malwareFamily", (n) -> { this.setMalwareFamily(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sha256", (n) -> { this.setSha256(n.getStringValue()); });
        deserializerMap.put("tenantAllowBlockListDetailInfo", (n) -> { this.setTenantAllowBlockListDetailInfo(n.getStringValue()); });
        deserializerMap.put("threatType", (n) -> { this.setThreatType(n.getEnumValue(ThreatType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileExtension property value. Extension of the file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileExtension() {
        return this.backingStore.get("fileExtension");
    }
    /**
     * Gets the fileName property value. The name of the attachment in the email.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Gets the fileSize property value. Size of the file.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFileSize() {
        return this.backingStore.get("fileSize");
    }
    /**
     * Gets the fileType property value. The type of the attachment in the email.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileType() {
        return this.backingStore.get("fileType");
    }
    /**
     * Gets the malwareFamily property value. The threat name associated with the threat type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMalwareFamily() {
        return this.backingStore.get("malwareFamily");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the sha256 property value. The SHA256 file hash of the attachment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha256() {
        return this.backingStore.get("sha256");
    }
    /**
     * Gets the tenantAllowBlockListDetailInfo property value. Details of entries in tenant allow/block list configured by tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantAllowBlockListDetailInfo() {
        return this.backingStore.get("tenantAllowBlockListDetailInfo");
    }
    /**
     * Gets the threatType property value. The threat type associated with the attachment. The possible values are: unknown, spam, malware, phishing, none, unknownFutureValue.
     * @return a {@link ThreatType}
     */
    @jakarta.annotation.Nullable
    public ThreatType getThreatType() {
        return this.backingStore.get("threatType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("detonationDetails", this.getDetonationDetails());
        writer.writeStringValue("fileExtension", this.getFileExtension());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeIntegerValue("fileSize", this.getFileSize());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeStringValue("malwareFamily", this.getMalwareFamily());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sha256", this.getSha256());
        writer.writeStringValue("tenantAllowBlockListDetailInfo", this.getTenantAllowBlockListDetailInfo());
        writer.writeEnumValue("threatType", this.getThreatType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the detonationDetails property value. The detonation details of the attachment.
     * @param value Value to set for the detonationDetails property.
     */
    public void setDetonationDetails(@jakarta.annotation.Nullable final DetonationDetails value) {
        this.backingStore.set("detonationDetails", value);
    }
    /**
     * Sets the fileExtension property value. Extension of the file.
     * @param value Value to set for the fileExtension property.
     */
    public void setFileExtension(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileExtension", value);
    }
    /**
     * Sets the fileName property value. The name of the attachment in the email.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
    /**
     * Sets the fileSize property value. Size of the file.
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("fileSize", value);
    }
    /**
     * Sets the fileType property value. The type of the attachment in the email.
     * @param value Value to set for the fileType property.
     */
    public void setFileType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileType", value);
    }
    /**
     * Sets the malwareFamily property value. The threat name associated with the threat type.
     * @param value Value to set for the malwareFamily property.
     */
    public void setMalwareFamily(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("malwareFamily", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sha256 property value. The SHA256 file hash of the attachment.
     * @param value Value to set for the sha256 property.
     */
    public void setSha256(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha256", value);
    }
    /**
     * Sets the tenantAllowBlockListDetailInfo property value. Details of entries in tenant allow/block list configured by tenant.
     * @param value Value to set for the tenantAllowBlockListDetailInfo property.
     */
    public void setTenantAllowBlockListDetailInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantAllowBlockListDetailInfo", value);
    }
    /**
     * Sets the threatType property value. The threat type associated with the attachment. The possible values are: unknown, spam, malware, phishing, none, unknownFutureValue.
     * @param value Value to set for the threatType property.
     */
    public void setThreatType(@jakarta.annotation.Nullable final ThreatType value) {
        this.backingStore.set("threatType", value);
    }
}
