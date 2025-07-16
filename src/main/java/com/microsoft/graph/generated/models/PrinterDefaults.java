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
public class PrinterDefaults implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PrinterDefaults} and sets the default values.
     */
    public PrinterDefaults() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrinterDefaults}
     */
    @jakarta.annotation.Nonnull
    public static PrinterDefaults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterDefaults();
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
     * Gets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @return a {@link PrintColorMode}
     */
    @jakarta.annotation.Nullable
    public PrintColorMode getColorMode() {
        return this.backingStore.get("colorMode");
    }
    /**
     * Gets the contentType property value. The default content (MIME) type to use when processing documents.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * Gets the copiesPerJob property value. The default number of copies printed per job.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCopiesPerJob() {
        return this.backingStore.get("copiesPerJob");
    }
    /**
     * Gets the dpi property value. The default resolution in DPI to use when printing the job.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDpi() {
        return this.backingStore.get("dpi");
    }
    /**
     * Gets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @return a {@link PrintDuplexMode}
     */
    @jakarta.annotation.Nullable
    public PrintDuplexMode getDuplexMode() {
        return this.backingStore.get("duplexMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("colorMode", (n) -> { this.setColorMode(n.getEnumValue(PrintColorMode::forValue)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("copiesPerJob", (n) -> { this.setCopiesPerJob(n.getIntegerValue()); });
        deserializerMap.put("dpi", (n) -> { this.setDpi(n.getIntegerValue()); });
        deserializerMap.put("duplexMode", (n) -> { this.setDuplexMode(n.getEnumValue(PrintDuplexMode::forValue)); });
        deserializerMap.put("finishings", (n) -> { this.setFinishings(n.getCollectionOfEnumValues(PrintFinishing::forValue)); });
        deserializerMap.put("fitPdfToPage", (n) -> { this.setFitPdfToPage(n.getBooleanValue()); });
        deserializerMap.put("inputBin", (n) -> { this.setInputBin(n.getStringValue()); });
        deserializerMap.put("mediaColor", (n) -> { this.setMediaColor(n.getStringValue()); });
        deserializerMap.put("mediaSize", (n) -> { this.setMediaSize(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("multipageLayout", (n) -> { this.setMultipageLayout(n.getEnumValue(PrintMultipageLayout::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientation", (n) -> { this.setOrientation(n.getEnumValue(PrintOrientation::forValue)); });
        deserializerMap.put("outputBin", (n) -> { this.setOutputBin(n.getStringValue()); });
        deserializerMap.put("pagesPerSheet", (n) -> { this.setPagesPerSheet(n.getIntegerValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(PrintQuality::forValue)); });
        deserializerMap.put("scaling", (n) -> { this.setScaling(n.getEnumValue(PrintScaling::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @return a {@link java.util.List<PrintFinishing>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this.backingStore.get("finishings");
    }
    /**
     * Gets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFitPdfToPage() {
        return this.backingStore.get("fitPdfToPage");
    }
    /**
     * Gets the inputBin property value. The default input bin that serves as the paper source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInputBin() {
        return this.backingStore.get("inputBin");
    }
    /**
     * Gets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaColor() {
        return this.backingStore.get("mediaColor");
    }
    /**
     * Gets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaSize() {
        return this.backingStore.get("mediaSize");
    }
    /**
     * Gets the mediaType property value. The default media (such as paper) type to print the document on.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.backingStore.get("mediaType");
    }
    /**
     * Gets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @return a {@link PrintMultipageLayout}
     */
    @jakarta.annotation.Nullable
    public PrintMultipageLayout getMultipageLayout() {
        return this.backingStore.get("multipageLayout");
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
     * Gets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @return a {@link PrintOrientation}
     */
    @jakarta.annotation.Nullable
    public PrintOrientation getOrientation() {
        return this.backingStore.get("orientation");
    }
    /**
     * Gets the outputBin property value. The default output bin to place completed prints into. See the printer&apos;s capabilities for a list of supported output bins.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutputBin() {
        return this.backingStore.get("outputBin");
    }
    /**
     * Gets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPagesPerSheet() {
        return this.backingStore.get("pagesPerSheet");
    }
    /**
     * Gets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @return a {@link PrintQuality}
     */
    @jakarta.annotation.Nullable
    public PrintQuality getQuality() {
        return this.backingStore.get("quality");
    }
    /**
     * Gets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @return a {@link PrintScaling}
     */
    @jakarta.annotation.Nullable
    public PrintScaling getScaling() {
        return this.backingStore.get("scaling");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("colorMode", this.getColorMode());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeIntegerValue("copiesPerJob", this.getCopiesPerJob());
        writer.writeIntegerValue("dpi", this.getDpi());
        writer.writeEnumValue("duplexMode", this.getDuplexMode());
        writer.writeCollectionOfEnumValues("finishings", this.getFinishings());
        writer.writeBooleanValue("fitPdfToPage", this.getFitPdfToPage());
        writer.writeStringValue("inputBin", this.getInputBin());
        writer.writeStringValue("mediaColor", this.getMediaColor());
        writer.writeStringValue("mediaSize", this.getMediaSize());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeEnumValue("multipageLayout", this.getMultipageLayout());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("orientation", this.getOrientation());
        writer.writeStringValue("outputBin", this.getOutputBin());
        writer.writeIntegerValue("pagesPerSheet", this.getPagesPerSheet());
        writer.writeEnumValue("quality", this.getQuality());
        writer.writeEnumValue("scaling", this.getScaling());
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
     * Sets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the colorMode property.
     */
    public void setColorMode(@jakarta.annotation.Nullable final PrintColorMode value) {
        this.backingStore.set("colorMode", value);
    }
    /**
     * Sets the contentType property value. The default content (MIME) type to use when processing documents.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the copiesPerJob property value. The default number of copies printed per job.
     * @param value Value to set for the copiesPerJob property.
     */
    public void setCopiesPerJob(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("copiesPerJob", value);
    }
    /**
     * Sets the dpi property value. The default resolution in DPI to use when printing the job.
     * @param value Value to set for the dpi property.
     */
    public void setDpi(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dpi", value);
    }
    /**
     * Sets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @param value Value to set for the duplexMode property.
     */
    public void setDuplexMode(@jakarta.annotation.Nullable final PrintDuplexMode value) {
        this.backingStore.set("duplexMode", value);
    }
    /**
     * Sets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @param value Value to set for the finishings property.
     */
    public void setFinishings(@jakarta.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.backingStore.set("finishings", value);
    }
    /**
     * Sets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @param value Value to set for the fitPdfToPage property.
     */
    public void setFitPdfToPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fitPdfToPage", value);
    }
    /**
     * Sets the inputBin property value. The default input bin that serves as the paper source.
     * @param value Value to set for the inputBin property.
     */
    public void setInputBin(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inputBin", value);
    }
    /**
     * Sets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @param value Value to set for the mediaColor property.
     */
    public void setMediaColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaColor", value);
    }
    /**
     * Sets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @param value Value to set for the mediaSize property.
     */
    public void setMediaSize(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaSize", value);
    }
    /**
     * Sets the mediaType property value. The default media (such as paper) type to print the document on.
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaType", value);
    }
    /**
     * Sets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @param value Value to set for the multipageLayout property.
     */
    public void setMultipageLayout(@jakarta.annotation.Nullable final PrintMultipageLayout value) {
        this.backingStore.set("multipageLayout", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the orientation property.
     */
    public void setOrientation(@jakarta.annotation.Nullable final PrintOrientation value) {
        this.backingStore.set("orientation", value);
    }
    /**
     * Sets the outputBin property value. The default output bin to place completed prints into. See the printer&apos;s capabilities for a list of supported output bins.
     * @param value Value to set for the outputBin property.
     */
    public void setOutputBin(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outputBin", value);
    }
    /**
     * Sets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @param value Value to set for the pagesPerSheet property.
     */
    public void setPagesPerSheet(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pagesPerSheet", value);
    }
    /**
     * Sets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final PrintQuality value) {
        this.backingStore.set("quality", value);
    }
    /**
     * Sets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @param value Value to set for the scaling property.
     */
    public void setScaling(@jakarta.annotation.Nullable final PrintScaling value) {
        this.backingStore.set("scaling", value);
    }
}
