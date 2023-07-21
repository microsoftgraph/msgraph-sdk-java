package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterCapabilities implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of supported bottom margins(in microns) for the printer.
     */
    private java.util.List<Integer> bottomMargins;
    /**
     * True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
     */
    private Boolean collation;
    /**
     * The color modes supported by the printer. Valid values are described in the following table.
     */
    private java.util.List<PrintColorMode> colorModes;
    /**
     * A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types.
     */
    private java.util.List<String> contentTypes;
    /**
     * The range of copies per job supported by the printer.
     */
    private IntegerRange copiesPerJob;
    /**
     * The list of print resolutions in DPI that are supported by the printer.
     */
    private java.util.List<Integer> dpis;
    /**
     * The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     */
    private java.util.List<PrintDuplexMode> duplexModes;
    /**
     * The list of feed orientations that are supported by the printer.
     */
    private java.util.List<PrinterFeedOrientation> feedOrientations;
    /**
     * Finishing processes the printer supports for a printed document.
     */
    private java.util.List<PrintFinishing> finishings;
    /**
     * Supported input bins for the printer.
     */
    private java.util.List<String> inputBins;
    /**
     * True if color printing is supported by the printer; false otherwise. Read-only.
     */
    private Boolean isColorPrintingSupported;
    /**
     * True if the printer supports printing by page ranges; false otherwise.
     */
    private Boolean isPageRangeSupported;
    /**
     * A list of supported left margins(in microns) for the printer.
     */
    private java.util.List<Integer> leftMargins;
    /**
     * The media (i.e., paper) colors supported by the printer.
     */
    private java.util.List<String> mediaColors;
    /**
     * The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     */
    private java.util.List<String> mediaSizes;
    /**
     * The media types supported by the printer.
     */
    private java.util.List<String> mediaTypes;
    /**
     * The presentation directions supported by the printer. Supported values are described in the following table.
     */
    private java.util.List<PrintMultipageLayout> multipageLayouts;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The print orientations supported by the printer. Valid values are described in the following table.
     */
    private java.util.List<PrintOrientation> orientations;
    /**
     * The printer's supported output bins (trays).
     */
    private java.util.List<String> outputBins;
    /**
     * Supported number of Input Pages to impose upon a single Impression.
     */
    private java.util.List<Integer> pagesPerSheet;
    /**
     * The print qualities supported by the printer.
     */
    private java.util.List<PrintQuality> qualities;
    /**
     * A list of supported right margins(in microns) for the printer.
     */
    private java.util.List<Integer> rightMargins;
    /**
     * Supported print scalings.
     */
    private java.util.List<PrintScaling> scalings;
    /**
     * True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     */
    private Boolean supportsFitPdfToPage;
    /**
     * A list of supported top margins(in microns) for the printer.
     */
    private java.util.List<Integer> topMargins;
    /**
     * Instantiates a new printerCapabilities and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrinterCapabilities() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerCapabilities
     */
    @javax.annotation.Nonnull
    public static PrinterCapabilities createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterCapabilities();
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
     * Gets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getBottomMargins() {
        return this.bottomMargins;
    }
    /**
     * Gets the collation property value. True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCollation() {
        return this.collation;
    }
    /**
     * Gets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @return a printColorMode
     */
    @javax.annotation.Nullable
    public java.util.List<PrintColorMode> getColorModes() {
        return this.colorModes;
    }
    /**
     * Gets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getContentTypes() {
        return this.contentTypes;
    }
    /**
     * Gets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @return a integerRange
     */
    @javax.annotation.Nullable
    public IntegerRange getCopiesPerJob() {
        return this.copiesPerJob;
    }
    /**
     * Gets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getDpis() {
        return this.dpis;
    }
    /**
     * Gets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @return a printDuplexMode
     */
    @javax.annotation.Nullable
    public java.util.List<PrintDuplexMode> getDuplexModes() {
        return this.duplexModes;
    }
    /**
     * Gets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @return a printerFeedOrientation
     */
    @javax.annotation.Nullable
    public java.util.List<PrinterFeedOrientation> getFeedOrientations() {
        return this.feedOrientations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(26);
        deserializerMap.put("bottomMargins", (n) -> { this.setBottomMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("collation", (n) -> { this.setCollation(n.getBooleanValue()); });
        deserializerMap.put("colorModes", (n) -> { this.setColorModes(n.getCollectionOfEnumValues(PrintColorMode.class)); });
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("copiesPerJob", (n) -> { this.setCopiesPerJob(n.getObjectValue(IntegerRange::createFromDiscriminatorValue)); });
        deserializerMap.put("dpis", (n) -> { this.setDpis(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("duplexModes", (n) -> { this.setDuplexModes(n.getCollectionOfEnumValues(PrintDuplexMode.class)); });
        deserializerMap.put("feedOrientations", (n) -> { this.setFeedOrientations(n.getCollectionOfEnumValues(PrinterFeedOrientation.class)); });
        deserializerMap.put("finishings", (n) -> { this.setFinishings(n.getCollectionOfEnumValues(PrintFinishing.class)); });
        deserializerMap.put("inputBins", (n) -> { this.setInputBins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isColorPrintingSupported", (n) -> { this.setIsColorPrintingSupported(n.getBooleanValue()); });
        deserializerMap.put("isPageRangeSupported", (n) -> { this.setIsPageRangeSupported(n.getBooleanValue()); });
        deserializerMap.put("leftMargins", (n) -> { this.setLeftMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("mediaColors", (n) -> { this.setMediaColors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mediaSizes", (n) -> { this.setMediaSizes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mediaTypes", (n) -> { this.setMediaTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("multipageLayouts", (n) -> { this.setMultipageLayouts(n.getCollectionOfEnumValues(PrintMultipageLayout.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orientations", (n) -> { this.setOrientations(n.getCollectionOfEnumValues(PrintOrientation.class)); });
        deserializerMap.put("outputBins", (n) -> { this.setOutputBins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("pagesPerSheet", (n) -> { this.setPagesPerSheet(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("qualities", (n) -> { this.setQualities(n.getCollectionOfEnumValues(PrintQuality.class)); });
        deserializerMap.put("rightMargins", (n) -> { this.setRightMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("scalings", (n) -> { this.setScalings(n.getCollectionOfEnumValues(PrintScaling.class)); });
        deserializerMap.put("supportsFitPdfToPage", (n) -> { this.setSupportsFitPdfToPage(n.getBooleanValue()); });
        deserializerMap.put("topMargins", (n) -> { this.setTopMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        return deserializerMap;
    }
    /**
     * Gets the finishings property value. Finishing processes the printer supports for a printed document.
     * @return a printFinishing
     */
    @javax.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this.finishings;
    }
    /**
     * Gets the inputBins property value. Supported input bins for the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInputBins() {
        return this.inputBins;
    }
    /**
     * Gets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsColorPrintingSupported() {
        return this.isColorPrintingSupported;
    }
    /**
     * Gets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPageRangeSupported() {
        return this.isPageRangeSupported;
    }
    /**
     * Gets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getLeftMargins() {
        return this.leftMargins;
    }
    /**
     * Gets the mediaColors property value. The media (i.e., paper) colors supported by the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMediaColors() {
        return this.mediaColors;
    }
    /**
     * Gets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMediaSizes() {
        return this.mediaSizes;
    }
    /**
     * Gets the mediaTypes property value. The media types supported by the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMediaTypes() {
        return this.mediaTypes;
    }
    /**
     * Gets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @return a printMultipageLayout
     */
    @javax.annotation.Nullable
    public java.util.List<PrintMultipageLayout> getMultipageLayouts() {
        return this.multipageLayouts;
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
     * Gets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @return a printOrientation
     */
    @javax.annotation.Nullable
    public java.util.List<PrintOrientation> getOrientations() {
        return this.orientations;
    }
    /**
     * Gets the outputBins property value. The printer's supported output bins (trays).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOutputBins() {
        return this.outputBins;
    }
    /**
     * Gets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getPagesPerSheet() {
        return this.pagesPerSheet;
    }
    /**
     * Gets the qualities property value. The print qualities supported by the printer.
     * @return a printQuality
     */
    @javax.annotation.Nullable
    public java.util.List<PrintQuality> getQualities() {
        return this.qualities;
    }
    /**
     * Gets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getRightMargins() {
        return this.rightMargins;
    }
    /**
     * Gets the scalings property value. Supported print scalings.
     * @return a printScaling
     */
    @javax.annotation.Nullable
    public java.util.List<PrintScaling> getScalings() {
        return this.scalings;
    }
    /**
     * Gets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsFitPdfToPage() {
        return this.supportsFitPdfToPage;
    }
    /**
     * Gets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getTopMargins() {
        return this.topMargins;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("bottomMargins", this.getBottomMargins());
        writer.writeBooleanValue("collation", this.getCollation());
        writer.writeCollectionOfEnumValues("colorModes", this.getColorModes());
        writer.writeCollectionOfPrimitiveValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("copiesPerJob", this.getCopiesPerJob());
        writer.writeCollectionOfPrimitiveValues("dpis", this.getDpis());
        writer.writeCollectionOfEnumValues("duplexModes", this.getDuplexModes());
        writer.writeCollectionOfEnumValues("feedOrientations", this.getFeedOrientations());
        writer.writeCollectionOfEnumValues("finishings", this.getFinishings());
        writer.writeCollectionOfPrimitiveValues("inputBins", this.getInputBins());
        writer.writeBooleanValue("isColorPrintingSupported", this.getIsColorPrintingSupported());
        writer.writeBooleanValue("isPageRangeSupported", this.getIsPageRangeSupported());
        writer.writeCollectionOfPrimitiveValues("leftMargins", this.getLeftMargins());
        writer.writeCollectionOfPrimitiveValues("mediaColors", this.getMediaColors());
        writer.writeCollectionOfPrimitiveValues("mediaSizes", this.getMediaSizes());
        writer.writeCollectionOfPrimitiveValues("mediaTypes", this.getMediaTypes());
        writer.writeCollectionOfEnumValues("multipageLayouts", this.getMultipageLayouts());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("orientations", this.getOrientations());
        writer.writeCollectionOfPrimitiveValues("outputBins", this.getOutputBins());
        writer.writeCollectionOfPrimitiveValues("pagesPerSheet", this.getPagesPerSheet());
        writer.writeCollectionOfEnumValues("qualities", this.getQualities());
        writer.writeCollectionOfPrimitiveValues("rightMargins", this.getRightMargins());
        writer.writeCollectionOfEnumValues("scalings", this.getScalings());
        writer.writeBooleanValue("supportsFitPdfToPage", this.getSupportsFitPdfToPage());
        writer.writeCollectionOfPrimitiveValues("topMargins", this.getTopMargins());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @param value Value to set for the bottomMargins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBottomMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this.bottomMargins = value;
    }
    /**
     * Sets the collation property value. True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
     * @param value Value to set for the collation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCollation(@javax.annotation.Nullable final Boolean value) {
        this.collation = value;
    }
    /**
     * Sets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the colorModes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColorModes(@javax.annotation.Nullable final java.util.List<PrintColorMode> value) {
        this.colorModes = value;
    }
    /**
     * Sets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types.
     * @param value Value to set for the contentTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.contentTypes = value;
    }
    /**
     * Sets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @param value Value to set for the copiesPerJob property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopiesPerJob(@javax.annotation.Nullable final IntegerRange value) {
        this.copiesPerJob = value;
    }
    /**
     * Sets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @param value Value to set for the dpis property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDpis(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this.dpis = value;
    }
    /**
     * Sets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the duplexModes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuplexModes(@javax.annotation.Nullable final java.util.List<PrintDuplexMode> value) {
        this.duplexModes = value;
    }
    /**
     * Sets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @param value Value to set for the feedOrientations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeedOrientations(@javax.annotation.Nullable final java.util.List<PrinterFeedOrientation> value) {
        this.feedOrientations = value;
    }
    /**
     * Sets the finishings property value. Finishing processes the printer supports for a printed document.
     * @param value Value to set for the finishings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFinishings(@javax.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.finishings = value;
    }
    /**
     * Sets the inputBins property value. Supported input bins for the printer.
     * @param value Value to set for the inputBins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInputBins(@javax.annotation.Nullable final java.util.List<String> value) {
        this.inputBins = value;
    }
    /**
     * Sets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @param value Value to set for the isColorPrintingSupported property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsColorPrintingSupported(@javax.annotation.Nullable final Boolean value) {
        this.isColorPrintingSupported = value;
    }
    /**
     * Sets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @param value Value to set for the isPageRangeSupported property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPageRangeSupported(@javax.annotation.Nullable final Boolean value) {
        this.isPageRangeSupported = value;
    }
    /**
     * Sets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @param value Value to set for the leftMargins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeftMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this.leftMargins = value;
    }
    /**
     * Sets the mediaColors property value. The media (i.e., paper) colors supported by the printer.
     * @param value Value to set for the mediaColors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaColors(@javax.annotation.Nullable final java.util.List<String> value) {
        this.mediaColors = value;
    }
    /**
     * Sets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @param value Value to set for the mediaSizes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaSizes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.mediaSizes = value;
    }
    /**
     * Sets the mediaTypes property value. The media types supported by the printer.
     * @param value Value to set for the mediaTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.mediaTypes = value;
    }
    /**
     * Sets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @param value Value to set for the multipageLayouts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultipageLayouts(@javax.annotation.Nullable final java.util.List<PrintMultipageLayout> value) {
        this.multipageLayouts = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the orientations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrientations(@javax.annotation.Nullable final java.util.List<PrintOrientation> value) {
        this.orientations = value;
    }
    /**
     * Sets the outputBins property value. The printer's supported output bins (trays).
     * @param value Value to set for the outputBins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputBins(@javax.annotation.Nullable final java.util.List<String> value) {
        this.outputBins = value;
    }
    /**
     * Sets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @param value Value to set for the pagesPerSheet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPagesPerSheet(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this.pagesPerSheet = value;
    }
    /**
     * Sets the qualities property value. The print qualities supported by the printer.
     * @param value Value to set for the qualities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQualities(@javax.annotation.Nullable final java.util.List<PrintQuality> value) {
        this.qualities = value;
    }
    /**
     * Sets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @param value Value to set for the rightMargins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRightMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this.rightMargins = value;
    }
    /**
     * Sets the scalings property value. Supported print scalings.
     * @param value Value to set for the scalings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScalings(@javax.annotation.Nullable final java.util.List<PrintScaling> value) {
        this.scalings = value;
    }
    /**
     * Sets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @param value Value to set for the supportsFitPdfToPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportsFitPdfToPage(@javax.annotation.Nullable final Boolean value) {
        this.supportsFitPdfToPage = value;
    }
    /**
     * Sets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @param value Value to set for the topMargins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this.topMargins = value;
    }
}
