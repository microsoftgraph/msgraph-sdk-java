package com.microsoft.graph.models;

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
public class QrCodeImageDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link QrCodeImageDetails} and sets the default values.
     */
    public QrCodeImageDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QrCodeImageDetails}
     */
    @jakarta.annotation.Nonnull
    public static QrCodeImageDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QrCodeImageDetails();
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
     * Gets the binaryValue property value. The binary representation of the QR code image.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getBinaryValue() {
        return this.backingStore.get("binaryValue");
    }
    /**
     * Gets the errorCorrectionLevel property value. The error correction level of the QR code, which determines how much of the QR code can be damaged while still being readable. The possible values are: l, m, q, h, unknownFutureValue.
     * @return a {@link ErrorCorrectionLevel}
     */
    @jakarta.annotation.Nullable
    public ErrorCorrectionLevel getErrorCorrectionLevel() {
        return this.backingStore.get("errorCorrectionLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("binaryValue", (n) -> { this.setBinaryValue(n.getByteArrayValue()); });
        deserializerMap.put("errorCorrectionLevel", (n) -> { this.setErrorCorrectionLevel(n.getEnumValue(ErrorCorrectionLevel::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rawContent", (n) -> { this.setRawContent(n.getByteArrayValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the rawContent property value. The raw encoded content embedded in the QR code.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getRawContent() {
        return this.backingStore.get("rawContent");
    }
    /**
     * Gets the version property value. The version number of the QR code, which determines its size and data capacity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("binaryValue", this.getBinaryValue());
        writer.writeEnumValue("errorCorrectionLevel", this.getErrorCorrectionLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeByteArrayValue("rawContent", this.getRawContent());
        writer.writeIntegerValue("version", this.getVersion());
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
     * Sets the binaryValue property value. The binary representation of the QR code image.
     * @param value Value to set for the binaryValue property.
     */
    public void setBinaryValue(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("binaryValue", value);
    }
    /**
     * Sets the errorCorrectionLevel property value. The error correction level of the QR code, which determines how much of the QR code can be damaged while still being readable. The possible values are: l, m, q, h, unknownFutureValue.
     * @param value Value to set for the errorCorrectionLevel property.
     */
    public void setErrorCorrectionLevel(@jakarta.annotation.Nullable final ErrorCorrectionLevel value) {
        this.backingStore.set("errorCorrectionLevel", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the rawContent property value. The raw encoded content embedded in the QR code.
     * @param value Value to set for the rawContent property.
     */
    public void setRawContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("rawContent", value);
    }
    /**
     * Sets the version property value. The version number of the QR code, which determines its size and data capacity.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}
