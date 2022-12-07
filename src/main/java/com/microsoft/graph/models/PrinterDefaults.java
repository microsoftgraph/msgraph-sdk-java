package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterDefaults implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The default color mode to use when printing the document. Valid values are described in the following table. */
    private PrintColorMode _colorMode;
    /** The default content (MIME) type to use when processing documents. */
    private String _contentType;
    /** The default number of copies printed per job. */
    private Integer _copiesPerJob;
    /** The default resolution in DPI to use when printing the job. */
    private Integer _dpi;
    /** The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table. */
    private PrintDuplexMode _duplexMode;
    /** The default set of finishings to apply to print jobs. Valid values are described in the following table. */
    private java.util.List<PrintFinishing> _finishings;
    /** The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions. */
    private Boolean _fitPdfToPage;
    /** The inputBin property */
    private String _inputBin;
    /** The default media (such as paper) color to print the document on. */
    private String _mediaColor;
    /** The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic. */
    private String _mediaSize;
    /** The default media (such as paper) type to print the document on. */
    private String _mediaType;
    /** The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table. */
    private PrintMultipageLayout _multipageLayout;
    /** The OdataType property */
    private String _odataType;
    /** The default orientation to use when printing the document. Valid values are described in the following table. */
    private PrintOrientation _orientation;
    /** The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins. */
    private String _outputBin;
    /** The default number of document pages to print on each sheet. */
    private Integer _pagesPerSheet;
    /** The default quality to use when printing the document. Valid values are described in the following table. */
    private PrintQuality _quality;
    /** Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table. */
    private PrintScaling _scaling;
    /**
     * Instantiates a new printerDefaults and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrinterDefaults() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerDefaults
     */
    @javax.annotation.Nonnull
    public static PrinterDefaults createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterDefaults();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @return a printColorMode
     */
    @javax.annotation.Nullable
    public PrintColorMode getColorMode() {
        return this._colorMode;
    }
    /**
     * Gets the contentType property value. The default content (MIME) type to use when processing documents.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * Gets the copiesPerJob property value. The default number of copies printed per job.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCopiesPerJob() {
        return this._copiesPerJob;
    }
    /**
     * Gets the dpi property value. The default resolution in DPI to use when printing the job.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDpi() {
        return this._dpi;
    }
    /**
     * Gets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @return a printDuplexMode
     */
    @javax.annotation.Nullable
    public PrintDuplexMode getDuplexMode() {
        return this._duplexMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(18);
        deserializerMap.put("colorMode", (n) -> { this.setColorMode(n.getEnumValue(PrintColorMode.class)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("copiesPerJob", (n) -> { this.setCopiesPerJob(n.getIntegerValue()); });
        deserializerMap.put("dpi", (n) -> { this.setDpi(n.getIntegerValue()); });
        deserializerMap.put("duplexMode", (n) -> { this.setDuplexMode(n.getEnumValue(PrintDuplexMode.class)); });
        deserializerMap.put("finishings", (n) -> { this.setFinishings(n.getCollectionOfEnumValues(PrintFinishing.class)); });
        deserializerMap.put("fitPdfToPage", (n) -> { this.setFitPdfToPage(n.getBooleanValue()); });
        deserializerMap.put("inputBin", (n) -> { this.setInputBin(n.getStringValue()); });
        deserializerMap.put("mediaColor", (n) -> { this.setMediaColor(n.getStringValue()); });
        deserializerMap.put("mediaSize", (n) -> { this.setMediaSize(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("multipageLayout", (n) -> { this.setMultipageLayout(n.getEnumValue(PrintMultipageLayout.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientation", (n) -> { this.setOrientation(n.getEnumValue(PrintOrientation.class)); });
        deserializerMap.put("outputBin", (n) -> { this.setOutputBin(n.getStringValue()); });
        deserializerMap.put("pagesPerSheet", (n) -> { this.setPagesPerSheet(n.getIntegerValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(PrintQuality.class)); });
        deserializerMap.put("scaling", (n) -> { this.setScaling(n.getEnumValue(PrintScaling.class)); });
        return deserializerMap;
    }
    /**
     * Gets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @return a printFinishing
     */
    @javax.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this._finishings;
    }
    /**
     * Gets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFitPdfToPage() {
        return this._fitPdfToPage;
    }
    /**
     * Gets the inputBin property value. The inputBin property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInputBin() {
        return this._inputBin;
    }
    /**
     * Gets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaColor() {
        return this._mediaColor;
    }
    /**
     * Gets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaSize() {
        return this._mediaSize;
    }
    /**
     * Gets the mediaType property value. The default media (such as paper) type to print the document on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaType() {
        return this._mediaType;
    }
    /**
     * Gets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @return a printMultipageLayout
     */
    @javax.annotation.Nullable
    public PrintMultipageLayout getMultipageLayout() {
        return this._multipageLayout;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @return a printOrientation
     */
    @javax.annotation.Nullable
    public PrintOrientation getOrientation() {
        return this._orientation;
    }
    /**
     * Gets the outputBin property value. The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputBin() {
        return this._outputBin;
    }
    /**
     * Gets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPagesPerSheet() {
        return this._pagesPerSheet;
    }
    /**
     * Gets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @return a printQuality
     */
    @javax.annotation.Nullable
    public PrintQuality getQuality() {
        return this._quality;
    }
    /**
     * Gets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @return a printScaling
     */
    @javax.annotation.Nullable
    public PrintScaling getScaling() {
        return this._scaling;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the colorMode property value. The default color mode to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the colorMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColorMode(@javax.annotation.Nullable final PrintColorMode value) {
        this._colorMode = value;
    }
    /**
     * Sets the contentType property value. The default content (MIME) type to use when processing documents.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
    /**
     * Sets the copiesPerJob property value. The default number of copies printed per job.
     * @param value Value to set for the copiesPerJob property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopiesPerJob(@javax.annotation.Nullable final Integer value) {
        this._copiesPerJob = value;
    }
    /**
     * Sets the dpi property value. The default resolution in DPI to use when printing the job.
     * @param value Value to set for the dpi property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDpi(@javax.annotation.Nullable final Integer value) {
        this._dpi = value;
    }
    /**
     * Sets the duplexMode property value. The default duplex (double-sided) configuration to use when printing a document. Valid values are described in the following table.
     * @param value Value to set for the duplexMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuplexMode(@javax.annotation.Nullable final PrintDuplexMode value) {
        this._duplexMode = value;
    }
    /**
     * Sets the finishings property value. The default set of finishings to apply to print jobs. Valid values are described in the following table.
     * @param value Value to set for the finishings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFinishings(@javax.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this._finishings = value;
    }
    /**
     * Sets the fitPdfToPage property value. The default fitPdfToPage setting. True to fit each page of a PDF document to a physical sheet of media; false to let the printer decide how to lay out impressions.
     * @param value Value to set for the fitPdfToPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFitPdfToPage(@javax.annotation.Nullable final Boolean value) {
        this._fitPdfToPage = value;
    }
    /**
     * Sets the inputBin property value. The inputBin property
     * @param value Value to set for the inputBin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInputBin(@javax.annotation.Nullable final String value) {
        this._inputBin = value;
    }
    /**
     * Sets the mediaColor property value. The default media (such as paper) color to print the document on.
     * @param value Value to set for the mediaColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaColor(@javax.annotation.Nullable final String value) {
        this._mediaColor = value;
    }
    /**
     * Sets the mediaSize property value. The default media size to use. Supports standard size names for ISO and ANSI media sizes. Valid values are listed in the printerCapabilities topic.
     * @param value Value to set for the mediaSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaSize(@javax.annotation.Nullable final String value) {
        this._mediaSize = value;
    }
    /**
     * Sets the mediaType property value. The default media (such as paper) type to print the document on.
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaType(@javax.annotation.Nullable final String value) {
        this._mediaType = value;
    }
    /**
     * Sets the multipageLayout property value. The default direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     * @param value Value to set for the multipageLayout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultipageLayout(@javax.annotation.Nullable final PrintMultipageLayout value) {
        this._multipageLayout = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the orientation property value. The default orientation to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the orientation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrientation(@javax.annotation.Nullable final PrintOrientation value) {
        this._orientation = value;
    }
    /**
     * Sets the outputBin property value. The default output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     * @param value Value to set for the outputBin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputBin(@javax.annotation.Nullable final String value) {
        this._outputBin = value;
    }
    /**
     * Sets the pagesPerSheet property value. The default number of document pages to print on each sheet.
     * @param value Value to set for the pagesPerSheet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPagesPerSheet(@javax.annotation.Nullable final Integer value) {
        this._pagesPerSheet = value;
    }
    /**
     * Sets the quality property value. The default quality to use when printing the document. Valid values are described in the following table.
     * @param value Value to set for the quality property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuality(@javax.annotation.Nullable final PrintQuality value) {
        this._quality = value;
    }
    /**
     * Sets the scaling property value. Specifies how the printer scales the document data to fit the requested media. Valid values are described in the following table.
     * @param value Value to set for the scaling property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScaling(@javax.annotation.Nullable final PrintScaling value) {
        this._scaling = value;
    }
}
