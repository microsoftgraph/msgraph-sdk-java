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
public class PrintSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PrintSettings} and sets the default values.
     */
    public PrintSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrintSettings}
     */
    @jakarta.annotation.Nonnull
    public static PrintSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintSettings();
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
     * Gets the documentConversionEnabled property value. Specifies whether document conversion is enabled for the tenant. If document conversion is enabled, Universal Print service converts documents into a format compatible with the printer (xps to pdf) when needed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDocumentConversionEnabled() {
        return this.backingStore.get("documentConversionEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("documentConversionEnabled", (n) -> { this.setDocumentConversionEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("printerDiscoverySettings", (n) -> { this.setPrinterDiscoverySettings(n.getObjectValue(PrinterDiscoverySettings::createFromDiscriminatorValue)); });
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
     * Gets the printerDiscoverySettings property value. Specifies settings that affect printer discovery when using Universal Print.
     * @return a {@link PrinterDiscoverySettings}
     */
    @jakarta.annotation.Nullable
    public PrinterDiscoverySettings getPrinterDiscoverySettings() {
        return this.backingStore.get("printerDiscoverySettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("documentConversionEnabled", this.getDocumentConversionEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("printerDiscoverySettings", this.getPrinterDiscoverySettings());
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
     * Sets the documentConversionEnabled property value. Specifies whether document conversion is enabled for the tenant. If document conversion is enabled, Universal Print service converts documents into a format compatible with the printer (xps to pdf) when needed.
     * @param value Value to set for the documentConversionEnabled property.
     */
    public void setDocumentConversionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("documentConversionEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the printerDiscoverySettings property value. Specifies settings that affect printer discovery when using Universal Print.
     * @param value Value to set for the printerDiscoverySettings property.
     */
    public void setPrinterDiscoverySettings(@jakarta.annotation.Nullable final PrinterDiscoverySettings value) {
        this.backingStore.set("printerDiscoverySettings", value);
    }
}
