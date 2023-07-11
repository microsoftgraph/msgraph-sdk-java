package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppLogCollectionDownloadDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The appLogDecryptionAlgorithm property
     */
    private AppLogDecryptionAlgorithm appLogDecryptionAlgorithm;
    /**
     * Decryption key that used to decrypt the log.
     */
    private String decryptionKey;
    /**
     * Download SAS (Shared Access Signature) Url for completed app log request.
     */
    private String downloadUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new appLogCollectionDownloadDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppLogCollectionDownloadDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appLogCollectionDownloadDetails
     */
    @javax.annotation.Nonnull
    public static AppLogCollectionDownloadDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppLogCollectionDownloadDetails();
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
     * Gets the appLogDecryptionAlgorithm property value. The appLogDecryptionAlgorithm property
     * @return a appLogDecryptionAlgorithm
     */
    @javax.annotation.Nullable
    public AppLogDecryptionAlgorithm getAppLogDecryptionAlgorithm() {
        return this.appLogDecryptionAlgorithm;
    }
    /**
     * Gets the decryptionKey property value. Decryption key that used to decrypt the log.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecryptionKey() {
        return this.decryptionKey;
    }
    /**
     * Gets the downloadUrl property value. Download SAS (Shared Access Signature) Url for completed app log request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("appLogDecryptionAlgorithm", (n) -> { this.setAppLogDecryptionAlgorithm(n.getEnumValue(AppLogDecryptionAlgorithm.class)); });
        deserializerMap.put("decryptionKey", (n) -> { this.setDecryptionKey(n.getStringValue()); });
        deserializerMap.put("downloadUrl", (n) -> { this.setDownloadUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appLogDecryptionAlgorithm", this.getAppLogDecryptionAlgorithm());
        writer.writeStringValue("decryptionKey", this.getDecryptionKey());
        writer.writeStringValue("downloadUrl", this.getDownloadUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the appLogDecryptionAlgorithm property value. The appLogDecryptionAlgorithm property
     * @param value Value to set for the appLogDecryptionAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppLogDecryptionAlgorithm(@javax.annotation.Nullable final AppLogDecryptionAlgorithm value) {
        this.appLogDecryptionAlgorithm = value;
    }
    /**
     * Sets the decryptionKey property value. Decryption key that used to decrypt the log.
     * @param value Value to set for the decryptionKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDecryptionKey(@javax.annotation.Nullable final String value) {
        this.decryptionKey = value;
    }
    /**
     * Sets the downloadUrl property value. Download SAS (Shared Access Signature) Url for completed app log request.
     * @param value Value to set for the downloadUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDownloadUrl(@javax.annotation.Nullable final String value) {
        this.downloadUrl = value;
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
}
