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
public class PrintJobConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PrintJobConfiguration and sets the default values.
     */
    public PrintJobConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintJobConfiguration
     */
    @jakarta.annotation.Nonnull
    public static PrintJobConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintJobConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the collate property value. Whether the printer should collate pages wehen printing multiple copies of a multi-page document.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCollate() {
        return this.backingStore.get("collate");
    }
    /**
     * Gets the colorMode property value. The color mode the printer should use to print the job. Valid values are described in the table below. Read-only.
     * @return a PrintColorMode
     */
    @jakarta.annotation.Nullable
    public PrintColorMode getColorMode() {
        return this.backingStore.get("colorMode");
    }
    /**
     * Gets the copies property value. The number of copies that should be printed. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCopies() {
        return this.backingStore.get("copies");
    }
    /**
     * Gets the dpi property value. The resolution to use when printing the job, expressed in dots per inch (DPI). Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDpi() {
        return this.backingStore.get("dpi");
    }
    /**
     * Gets the duplexMode property value. The duplex mode the printer should use when printing the job. Valid values are described in the table below. Read-only.
     * @return a PrintDuplexMode
     */
    @jakarta.annotation.Nullable
    public PrintDuplexMode getDuplexMode() {
        return this.backingStore.get("duplexMode");
    }
    /**
     * Gets the feedOrientation property value. The orientation to use when feeding media into the printer. Valid values are described in the following table. Read-only.
     * @return a PrinterFeedOrientation
     */
    @jakarta.annotation.Nullable
    public PrinterFeedOrientation getFeedOrientation() {
        return this.backingStore.get("feedOrientation");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("collate", (n) -> { this.setCollate(n.getBooleanValue()); });
        deserializerMap.put("colorMode", (n) -> { this.setColorMode(n.getEnumValue(PrintColorMode::forValue)); });
        deserializerMap.put("copies", (n) -> { this.setCopies(n.getIntegerValue()); });
        deserializerMap.put("dpi", (n) -> { this.setDpi(n.getIntegerValue()); });
        deserializerMap.put("duplexMode", (n) -> { this.setDuplexMode(n.getEnumValue(PrintDuplexMode::forValue)); });
        deserializerMap.put("feedOrientation", (n) -> { this.setFeedOrientation(n.getEnumValue(PrinterFeedOrientation::forValue)); });
        deserializerMap.put("finishings", (n) -> { this.setFinishings(n.getCollectionOfEnumValues(PrintFinishing::forValue)); });
        deserializerMap.put("fitPdfToPage", (n) -> { this.setFitPdfToPage(n.getBooleanValue()); });
        deserializerMap.put("inputBin", (n) -> { this.setInputBin(n.getStringValue()); });
        deserializerMap.put("margin", (n) -> { this.setMargin(n.getObjectValue(PrintMargin::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaSize", (n) -> { this.setMediaSize(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("multipageLayout", (n) -> { this.setMultipageLayout(n.getEnumValue(PrintMultipageLayout::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientation", (n) -> { this.setOrientation(n.getEnumValue(PrintOrientation::forValue)); });
        deserializerMap.put("outputBin", (n) -> { this.setOutputBin(n.getStringValue()); });
        deserializerMap.put("pageRanges", (n) -> { this.setPageRanges(n.getCollectionOfObjectValues(IntegerRange::createFromDiscriminatorValue)); });
        deserializerMap.put("pagesPerSheet", (n) -> { this.setPagesPerSheet(n.getIntegerValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(PrintQuality::forValue)); });
        deserializerMap.put("scaling", (n) -> { this.setScaling(n.getEnumValue(PrintScaling::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the finishings property value. Finishing processes to use when printing.
     * @return a java.util.List<PrintFinishing>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this.backingStore.get("finishings");
    }
    /**
     * Gets the fitPdfToPage property value. The fitPdfToPage property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFitPdfToPage() {
        return this.backingStore.get("fitPdfToPage");
    }
    /**
     * Gets the inputBin property value. The input bin (tray) to use when printing. See the printer's capabilities for a list of supported input bins.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInputBin() {
        return this.backingStore.get("inputBin");
    }
    /**
     * Gets the margin property value. The margin settings to use when printing.
     * @return a PrintMargin
     */
    @jakarta.annotation.Nullable
    public PrintMargin getMargin() {
        return this.backingStore.get("margin");
    }
    /**
     * Gets the mediaSize property value. The media size to use when printing. Supports standard size names for ISO and ANSI media sizes.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMediaSize() {
        return this.backingStore.get("mediaSize");
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMediaType() {
        return this.backingStore.get("mediaType");
    }
    /**
     * Gets the multipageLayout property value. The multipageLayout property
     * @return a PrintMultipageLayout
     */
    @jakarta.annotation.Nullable
    public PrintMultipageLayout getMultipageLayout() {
        return this.backingStore.get("multipageLayout");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the orientation property value. The orientation property
     * @return a PrintOrientation
     */
    @jakarta.annotation.Nullable
    public PrintOrientation getOrientation() {
        return this.backingStore.get("orientation");
    }
    /**
     * Gets the outputBin property value. The outputBin property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOutputBin() {
        return this.backingStore.get("outputBin");
    }
    /**
     * Gets the pageRanges property value. The pageRanges property
     * @return a java.util.List<IntegerRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntegerRange> getPageRanges() {
        return this.backingStore.get("pageRanges");
    }
    /**
     * Gets the pagesPerSheet property value. The pagesPerSheet property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPagesPerSheet() {
        return this.backingStore.get("pagesPerSheet");
    }
    /**
     * Gets the quality property value. The quality property
     * @return a PrintQuality
     */
    @jakarta.annotation.Nullable
    public PrintQuality getQuality() {
        return this.backingStore.get("quality");
    }
    /**
     * Gets the scaling property value. The scaling property
     * @return a PrintScaling
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
        writer.writeBooleanValue("collate", this.getCollate());
        writer.writeEnumValue("colorMode", this.getColorMode());
        writer.writeIntegerValue("copies", this.getCopies());
        writer.writeIntegerValue("dpi", this.getDpi());
        writer.writeEnumValue("duplexMode", this.getDuplexMode());
        writer.writeEnumValue("feedOrientation", this.getFeedOrientation());
        writer.writeCollectionOfEnumValues("finishings", this.getFinishings());
        writer.writeBooleanValue("fitPdfToPage", this.getFitPdfToPage());
        writer.writeStringValue("inputBin", this.getInputBin());
        writer.writeObjectValue("margin", this.getMargin());
        writer.writeStringValue("mediaSize", this.getMediaSize());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeEnumValue("multipageLayout", this.getMultipageLayout());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("orientation", this.getOrientation());
        writer.writeStringValue("outputBin", this.getOutputBin());
        writer.writeCollectionOfObjectValues("pageRanges", this.getPageRanges());
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
     * Sets the collate property value. Whether the printer should collate pages wehen printing multiple copies of a multi-page document.
     * @param value Value to set for the collate property.
     */
    public void setCollate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("collate", value);
    }
    /**
     * Sets the colorMode property value. The color mode the printer should use to print the job. Valid values are described in the table below. Read-only.
     * @param value Value to set for the colorMode property.
     */
    public void setColorMode(@jakarta.annotation.Nullable final PrintColorMode value) {
        this.backingStore.set("colorMode", value);
    }
    /**
     * Sets the copies property value. The number of copies that should be printed. Read-only.
     * @param value Value to set for the copies property.
     */
    public void setCopies(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("copies", value);
    }
    /**
     * Sets the dpi property value. The resolution to use when printing the job, expressed in dots per inch (DPI). Read-only.
     * @param value Value to set for the dpi property.
     */
    public void setDpi(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dpi", value);
    }
    /**
     * Sets the duplexMode property value. The duplex mode the printer should use when printing the job. Valid values are described in the table below. Read-only.
     * @param value Value to set for the duplexMode property.
     */
    public void setDuplexMode(@jakarta.annotation.Nullable final PrintDuplexMode value) {
        this.backingStore.set("duplexMode", value);
    }
    /**
     * Sets the feedOrientation property value. The orientation to use when feeding media into the printer. Valid values are described in the following table. Read-only.
     * @param value Value to set for the feedOrientation property.
     */
    public void setFeedOrientation(@jakarta.annotation.Nullable final PrinterFeedOrientation value) {
        this.backingStore.set("feedOrientation", value);
    }
    /**
     * Sets the finishings property value. Finishing processes to use when printing.
     * @param value Value to set for the finishings property.
     */
    public void setFinishings(@jakarta.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.backingStore.set("finishings", value);
    }
    /**
     * Sets the fitPdfToPage property value. The fitPdfToPage property
     * @param value Value to set for the fitPdfToPage property.
     */
    public void setFitPdfToPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fitPdfToPage", value);
    }
    /**
     * Sets the inputBin property value. The input bin (tray) to use when printing. See the printer's capabilities for a list of supported input bins.
     * @param value Value to set for the inputBin property.
     */
    public void setInputBin(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inputBin", value);
    }
    /**
     * Sets the margin property value. The margin settings to use when printing.
     * @param value Value to set for the margin property.
     */
    public void setMargin(@jakarta.annotation.Nullable final PrintMargin value) {
        this.backingStore.set("margin", value);
    }
    /**
     * Sets the mediaSize property value. The media size to use when printing. Supports standard size names for ISO and ANSI media sizes.
     * @param value Value to set for the mediaSize property.
     */
    public void setMediaSize(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaSize", value);
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     */
    public void setMediaType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaType", value);
    }
    /**
     * Sets the multipageLayout property value. The multipageLayout property
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
     * Sets the orientation property value. The orientation property
     * @param value Value to set for the orientation property.
     */
    public void setOrientation(@jakarta.annotation.Nullable final PrintOrientation value) {
        this.backingStore.set("orientation", value);
    }
    /**
     * Sets the outputBin property value. The outputBin property
     * @param value Value to set for the outputBin property.
     */
    public void setOutputBin(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outputBin", value);
    }
    /**
     * Sets the pageRanges property value. The pageRanges property
     * @param value Value to set for the pageRanges property.
     */
    public void setPageRanges(@jakarta.annotation.Nullable final java.util.List<IntegerRange> value) {
        this.backingStore.set("pageRanges", value);
    }
    /**
     * Sets the pagesPerSheet property value. The pagesPerSheet property
     * @param value Value to set for the pagesPerSheet property.
     */
    public void setPagesPerSheet(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pagesPerSheet", value);
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final PrintQuality value) {
        this.backingStore.set("quality", value);
    }
    /**
     * Sets the scaling property value. The scaling property
     * @param value Value to set for the scaling property.
     */
    public void setScaling(@jakarta.annotation.Nullable final PrintScaling value) {
        this.backingStore.set("scaling", value);
    }
}
