package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintJobConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether the printer should collate pages wehen printing multiple copies of a multi-page document.
     */
    private Boolean collate;
    /**
     * The color mode the printer should use to print the job. Valid values are described in the table below. Read-only.
     */
    private PrintColorMode colorMode;
    /**
     * The number of copies that should be printed. Read-only.
     */
    private Integer copies;
    /**
     * The resolution to use when printing the job, expressed in dots per inch (DPI). Read-only.
     */
    private Integer dpi;
    /**
     * The duplex mode the printer should use when printing the job. Valid values are described in the table below. Read-only.
     */
    private PrintDuplexMode duplexMode;
    /**
     * The orientation to use when feeding media into the printer. Valid values are described in the following table. Read-only.
     */
    private PrinterFeedOrientation feedOrientation;
    /**
     * Finishing processes to use when printing.
     */
    private java.util.List<PrintFinishing> finishings;
    /**
     * The fitPdfToPage property
     */
    private Boolean fitPdfToPage;
    /**
     * The input bin (tray) to use when printing. See the printer's capabilities for a list of supported input bins.
     */
    private String inputBin;
    /**
     * The margin settings to use when printing.
     */
    private PrintMargin margin;
    /**
     * The media size to use when printing. Supports standard size names for ISO and ANSI media sizes.
     */
    private String mediaSize;
    /**
     * The mediaType property
     */
    private String mediaType;
    /**
     * The multipageLayout property
     */
    private PrintMultipageLayout multipageLayout;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The orientation property
     */
    private PrintOrientation orientation;
    /**
     * The outputBin property
     */
    private String outputBin;
    /**
     * The pageRanges property
     */
    private java.util.List<IntegerRange> pageRanges;
    /**
     * The pagesPerSheet property
     */
    private Integer pagesPerSheet;
    /**
     * The quality property
     */
    private PrintQuality quality;
    /**
     * The scaling property
     */
    private PrintScaling scaling;
    /**
     * Instantiates a new printJobConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintJobConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printJobConfiguration
     */
    @javax.annotation.Nonnull
    public static PrintJobConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintJobConfiguration();
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
     * Gets the collate property value. Whether the printer should collate pages wehen printing multiple copies of a multi-page document.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCollate() {
        return this.collate;
    }
    /**
     * Gets the colorMode property value. The color mode the printer should use to print the job. Valid values are described in the table below. Read-only.
     * @return a printColorMode
     */
    @javax.annotation.Nullable
    public PrintColorMode getColorMode() {
        return this.colorMode;
    }
    /**
     * Gets the copies property value. The number of copies that should be printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCopies() {
        return this.copies;
    }
    /**
     * Gets the dpi property value. The resolution to use when printing the job, expressed in dots per inch (DPI). Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDpi() {
        return this.dpi;
    }
    /**
     * Gets the duplexMode property value. The duplex mode the printer should use when printing the job. Valid values are described in the table below. Read-only.
     * @return a printDuplexMode
     */
    @javax.annotation.Nullable
    public PrintDuplexMode getDuplexMode() {
        return this.duplexMode;
    }
    /**
     * Gets the feedOrientation property value. The orientation to use when feeding media into the printer. Valid values are described in the following table. Read-only.
     * @return a printerFeedOrientation
     */
    @javax.annotation.Nullable
    public PrinterFeedOrientation getFeedOrientation() {
        return this.feedOrientation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("collate", (n) -> { this.setCollate(n.getBooleanValue()); });
        deserializerMap.put("colorMode", (n) -> { this.setColorMode(n.getEnumValue(PrintColorMode.class)); });
        deserializerMap.put("copies", (n) -> { this.setCopies(n.getIntegerValue()); });
        deserializerMap.put("dpi", (n) -> { this.setDpi(n.getIntegerValue()); });
        deserializerMap.put("duplexMode", (n) -> { this.setDuplexMode(n.getEnumValue(PrintDuplexMode.class)); });
        deserializerMap.put("feedOrientation", (n) -> { this.setFeedOrientation(n.getEnumValue(PrinterFeedOrientation.class)); });
        deserializerMap.put("finishings", (n) -> { this.setFinishings(n.getCollectionOfEnumValues(PrintFinishing.class)); });
        deserializerMap.put("fitPdfToPage", (n) -> { this.setFitPdfToPage(n.getBooleanValue()); });
        deserializerMap.put("inputBin", (n) -> { this.setInputBin(n.getStringValue()); });
        deserializerMap.put("margin", (n) -> { this.setMargin(n.getObjectValue(PrintMargin::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaSize", (n) -> { this.setMediaSize(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("multipageLayout", (n) -> { this.setMultipageLayout(n.getEnumValue(PrintMultipageLayout.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientation", (n) -> { this.setOrientation(n.getEnumValue(PrintOrientation.class)); });
        deserializerMap.put("outputBin", (n) -> { this.setOutputBin(n.getStringValue()); });
        deserializerMap.put("pageRanges", (n) -> { this.setPageRanges(n.getCollectionOfObjectValues(IntegerRange::createFromDiscriminatorValue)); });
        deserializerMap.put("pagesPerSheet", (n) -> { this.setPagesPerSheet(n.getIntegerValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(PrintQuality.class)); });
        deserializerMap.put("scaling", (n) -> { this.setScaling(n.getEnumValue(PrintScaling.class)); });
        return deserializerMap;
    }
    /**
     * Gets the finishings property value. Finishing processes to use when printing.
     * @return a printFinishing
     */
    @javax.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this.finishings;
    }
    /**
     * Gets the fitPdfToPage property value. The fitPdfToPage property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFitPdfToPage() {
        return this.fitPdfToPage;
    }
    /**
     * Gets the inputBin property value. The input bin (tray) to use when printing. See the printer's capabilities for a list of supported input bins.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInputBin() {
        return this.inputBin;
    }
    /**
     * Gets the margin property value. The margin settings to use when printing.
     * @return a printMargin
     */
    @javax.annotation.Nullable
    public PrintMargin getMargin() {
        return this.margin;
    }
    /**
     * Gets the mediaSize property value. The media size to use when printing. Supports standard size names for ISO and ANSI media sizes.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaSize() {
        return this.mediaSize;
    }
    /**
     * Gets the mediaType property value. The mediaType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaType() {
        return this.mediaType;
    }
    /**
     * Gets the multipageLayout property value. The multipageLayout property
     * @return a printMultipageLayout
     */
    @javax.annotation.Nullable
    public PrintMultipageLayout getMultipageLayout() {
        return this.multipageLayout;
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
     * Gets the orientation property value. The orientation property
     * @return a printOrientation
     */
    @javax.annotation.Nullable
    public PrintOrientation getOrientation() {
        return this.orientation;
    }
    /**
     * Gets the outputBin property value. The outputBin property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputBin() {
        return this.outputBin;
    }
    /**
     * Gets the pageRanges property value. The pageRanges property
     * @return a integerRange
     */
    @javax.annotation.Nullable
    public java.util.List<IntegerRange> getPageRanges() {
        return this.pageRanges;
    }
    /**
     * Gets the pagesPerSheet property value. The pagesPerSheet property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPagesPerSheet() {
        return this.pagesPerSheet;
    }
    /**
     * Gets the quality property value. The quality property
     * @return a printQuality
     */
    @javax.annotation.Nullable
    public PrintQuality getQuality() {
        return this.quality;
    }
    /**
     * Gets the scaling property value. The scaling property
     * @return a printScaling
     */
    @javax.annotation.Nullable
    public PrintScaling getScaling() {
        return this.scaling;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the collate property value. Whether the printer should collate pages wehen printing multiple copies of a multi-page document.
     * @param value Value to set for the collate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCollate(@javax.annotation.Nullable final Boolean value) {
        this.collate = value;
    }
    /**
     * Sets the colorMode property value. The color mode the printer should use to print the job. Valid values are described in the table below. Read-only.
     * @param value Value to set for the colorMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColorMode(@javax.annotation.Nullable final PrintColorMode value) {
        this.colorMode = value;
    }
    /**
     * Sets the copies property value. The number of copies that should be printed. Read-only.
     * @param value Value to set for the copies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopies(@javax.annotation.Nullable final Integer value) {
        this.copies = value;
    }
    /**
     * Sets the dpi property value. The resolution to use when printing the job, expressed in dots per inch (DPI). Read-only.
     * @param value Value to set for the dpi property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDpi(@javax.annotation.Nullable final Integer value) {
        this.dpi = value;
    }
    /**
     * Sets the duplexMode property value. The duplex mode the printer should use when printing the job. Valid values are described in the table below. Read-only.
     * @param value Value to set for the duplexMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuplexMode(@javax.annotation.Nullable final PrintDuplexMode value) {
        this.duplexMode = value;
    }
    /**
     * Sets the feedOrientation property value. The orientation to use when feeding media into the printer. Valid values are described in the following table. Read-only.
     * @param value Value to set for the feedOrientation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeedOrientation(@javax.annotation.Nullable final PrinterFeedOrientation value) {
        this.feedOrientation = value;
    }
    /**
     * Sets the finishings property value. Finishing processes to use when printing.
     * @param value Value to set for the finishings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFinishings(@javax.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.finishings = value;
    }
    /**
     * Sets the fitPdfToPage property value. The fitPdfToPage property
     * @param value Value to set for the fitPdfToPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFitPdfToPage(@javax.annotation.Nullable final Boolean value) {
        this.fitPdfToPage = value;
    }
    /**
     * Sets the inputBin property value. The input bin (tray) to use when printing. See the printer's capabilities for a list of supported input bins.
     * @param value Value to set for the inputBin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInputBin(@javax.annotation.Nullable final String value) {
        this.inputBin = value;
    }
    /**
     * Sets the margin property value. The margin settings to use when printing.
     * @param value Value to set for the margin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMargin(@javax.annotation.Nullable final PrintMargin value) {
        this.margin = value;
    }
    /**
     * Sets the mediaSize property value. The media size to use when printing. Supports standard size names for ISO and ANSI media sizes.
     * @param value Value to set for the mediaSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaSize(@javax.annotation.Nullable final String value) {
        this.mediaSize = value;
    }
    /**
     * Sets the mediaType property value. The mediaType property
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaType(@javax.annotation.Nullable final String value) {
        this.mediaType = value;
    }
    /**
     * Sets the multipageLayout property value. The multipageLayout property
     * @param value Value to set for the multipageLayout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultipageLayout(@javax.annotation.Nullable final PrintMultipageLayout value) {
        this.multipageLayout = value;
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
    /**
     * Sets the orientation property value. The orientation property
     * @param value Value to set for the orientation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrientation(@javax.annotation.Nullable final PrintOrientation value) {
        this.orientation = value;
    }
    /**
     * Sets the outputBin property value. The outputBin property
     * @param value Value to set for the outputBin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputBin(@javax.annotation.Nullable final String value) {
        this.outputBin = value;
    }
    /**
     * Sets the pageRanges property value. The pageRanges property
     * @param value Value to set for the pageRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPageRanges(@javax.annotation.Nullable final java.util.List<IntegerRange> value) {
        this.pageRanges = value;
    }
    /**
     * Sets the pagesPerSheet property value. The pagesPerSheet property
     * @param value Value to set for the pagesPerSheet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPagesPerSheet(@javax.annotation.Nullable final Integer value) {
        this.pagesPerSheet = value;
    }
    /**
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuality(@javax.annotation.Nullable final PrintQuality value) {
        this.quality = value;
    }
    /**
     * Sets the scaling property value. The scaling property
     * @param value Value to set for the scaling property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScaling(@javax.annotation.Nullable final PrintScaling value) {
        this.scaling = value;
    }
}
