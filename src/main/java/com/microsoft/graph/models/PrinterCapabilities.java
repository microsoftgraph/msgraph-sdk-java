package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterCapabilities implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A list of supported bottom margins(in microns) for the printer. */
    private java.util.List<Integer> _bottomMargins;
    /** True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise. */
    private Boolean _collation;
    /** The color modes supported by the printer. Valid values are described in the following table. */
    private java.util.List<String> _colorModes;
    /** A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types. */
    private java.util.List<String> _contentTypes;
    /** The range of copies per job supported by the printer. */
    private IntegerRange _copiesPerJob;
    /** The list of print resolutions in DPI that are supported by the printer. */
    private java.util.List<Integer> _dpis;
    /** The list of duplex modes that are supported by the printer. Valid values are described in the following table. */
    private java.util.List<String> _duplexModes;
    /** The list of feed orientations that are supported by the printer. */
    private java.util.List<String> _feedOrientations;
    /** Finishing processes the printer supports for a printed document. */
    private java.util.List<String> _finishings;
    /** Supported input bins for the printer. */
    private java.util.List<String> _inputBins;
    /** True if color printing is supported by the printer; false otherwise. Read-only. */
    private Boolean _isColorPrintingSupported;
    /** True if the printer supports printing by page ranges; false otherwise. */
    private Boolean _isPageRangeSupported;
    /** A list of supported left margins(in microns) for the printer. */
    private java.util.List<Integer> _leftMargins;
    /** The media (i.e., paper) colors supported by the printer. */
    private java.util.List<String> _mediaColors;
    /** The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table. */
    private java.util.List<String> _mediaSizes;
    /** The media types supported by the printer. */
    private java.util.List<String> _mediaTypes;
    /** The presentation directions supported by the printer. Supported values are described in the following table. */
    private java.util.List<String> _multipageLayouts;
    /** The OdataType property */
    private String _odataType;
    /** The print orientations supported by the printer. Valid values are described in the following table. */
    private java.util.List<String> _orientations;
    /** The printer's supported output bins (trays). */
    private java.util.List<String> _outputBins;
    /** Supported number of Input Pages to impose upon a single Impression. */
    private java.util.List<Integer> _pagesPerSheet;
    /** The print qualities supported by the printer. */
    private java.util.List<String> _qualities;
    /** A list of supported right margins(in microns) for the printer. */
    private java.util.List<Integer> _rightMargins;
    /** Supported print scalings. */
    private java.util.List<String> _scalings;
    /** True if the printer supports scaling PDF pages to match the print media size; false otherwise. */
    private Boolean _supportsFitPdfToPage;
    /** A list of supported top margins(in microns) for the printer. */
    private java.util.List<Integer> _topMargins;
    /**
     * Instantiates a new printerCapabilities and sets the default values.
     * @return a void
     */
    public PrinterCapabilities() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.printerCapabilities");
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
        return this._additionalData;
    }
    /**
     * Gets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getBottomMargins() {
        return this._bottomMargins;
    }
    /**
     * Gets the collation property value. True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCollation() {
        return this._collation;
    }
    /**
     * Gets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getColorModes() {
        return this._colorModes;
    }
    /**
     * Gets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getContentTypes() {
        return this._contentTypes;
    }
    /**
     * Gets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @return a integerRange
     */
    @javax.annotation.Nullable
    public IntegerRange getCopiesPerJob() {
        return this._copiesPerJob;
    }
    /**
     * Gets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getDpis() {
        return this._dpis;
    }
    /**
     * Gets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDuplexModes() {
        return this._duplexModes;
    }
    /**
     * Gets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFeedOrientations() {
        return this._feedOrientations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrinterCapabilities currentObject = this;
        return new HashMap<>(26) {{
            this.put("bottomMargins", (n) -> { currentObject.setBottomMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
            this.put("collation", (n) -> { currentObject.setCollation(n.getBooleanValue()); });
            this.put("colorModes", (n) -> { currentObject.setColorModes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("contentTypes", (n) -> { currentObject.setContentTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("copiesPerJob", (n) -> { currentObject.setCopiesPerJob(n.getObjectValue(IntegerRange::createFromDiscriminatorValue)); });
            this.put("dpis", (n) -> { currentObject.setDpis(n.getCollectionOfPrimitiveValues(Integer.class)); });
            this.put("duplexModes", (n) -> { currentObject.setDuplexModes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("feedOrientations", (n) -> { currentObject.setFeedOrientations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("finishings", (n) -> { currentObject.setFinishings(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("inputBins", (n) -> { currentObject.setInputBins(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isColorPrintingSupported", (n) -> { currentObject.setIsColorPrintingSupported(n.getBooleanValue()); });
            this.put("isPageRangeSupported", (n) -> { currentObject.setIsPageRangeSupported(n.getBooleanValue()); });
            this.put("leftMargins", (n) -> { currentObject.setLeftMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
            this.put("mediaColors", (n) -> { currentObject.setMediaColors(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("mediaSizes", (n) -> { currentObject.setMediaSizes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("mediaTypes", (n) -> { currentObject.setMediaTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("multipageLayouts", (n) -> { currentObject.setMultipageLayouts(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("orientations", (n) -> { currentObject.setOrientations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("outputBins", (n) -> { currentObject.setOutputBins(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("pagesPerSheet", (n) -> { currentObject.setPagesPerSheet(n.getCollectionOfPrimitiveValues(Integer.class)); });
            this.put("qualities", (n) -> { currentObject.setQualities(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("rightMargins", (n) -> { currentObject.setRightMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
            this.put("scalings", (n) -> { currentObject.setScalings(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("supportsFitPdfToPage", (n) -> { currentObject.setSupportsFitPdfToPage(n.getBooleanValue()); });
            this.put("topMargins", (n) -> { currentObject.setTopMargins(n.getCollectionOfPrimitiveValues(Integer.class)); });
        }};
    }
    /**
     * Gets the finishings property value. Finishing processes the printer supports for a printed document.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFinishings() {
        return this._finishings;
    }
    /**
     * Gets the inputBins property value. Supported input bins for the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInputBins() {
        return this._inputBins;
    }
    /**
     * Gets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsColorPrintingSupported() {
        return this._isColorPrintingSupported;
    }
    /**
     * Gets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPageRangeSupported() {
        return this._isPageRangeSupported;
    }
    /**
     * Gets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getLeftMargins() {
        return this._leftMargins;
    }
    /**
     * Gets the mediaColors property value. The media (i.e., paper) colors supported by the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMediaColors() {
        return this._mediaColors;
    }
    /**
     * Gets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMediaSizes() {
        return this._mediaSizes;
    }
    /**
     * Gets the mediaTypes property value. The media types supported by the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMediaTypes() {
        return this._mediaTypes;
    }
    /**
     * Gets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMultipageLayouts() {
        return this._multipageLayouts;
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
     * Gets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrientations() {
        return this._orientations;
    }
    /**
     * Gets the outputBins property value. The printer's supported output bins (trays).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOutputBins() {
        return this._outputBins;
    }
    /**
     * Gets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getPagesPerSheet() {
        return this._pagesPerSheet;
    }
    /**
     * Gets the qualities property value. The print qualities supported by the printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getQualities() {
        return this._qualities;
    }
    /**
     * Gets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getRightMargins() {
        return this._rightMargins;
    }
    /**
     * Gets the scalings property value. Supported print scalings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getScalings() {
        return this._scalings;
    }
    /**
     * Gets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsFitPdfToPage() {
        return this._supportsFitPdfToPage;
    }
    /**
     * Gets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public java.util.List<Integer> getTopMargins() {
        return this._topMargins;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("bottomMargins", this.getBottomMargins());
        writer.writeBooleanValue("collation", this.getCollation());
        writer.writeCollectionOfPrimitiveValues("colorModes", this.getColorModes());
        writer.writeCollectionOfPrimitiveValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("copiesPerJob", this.getCopiesPerJob());
        writer.writeCollectionOfPrimitiveValues("dpis", this.getDpis());
        writer.writeCollectionOfPrimitiveValues("duplexModes", this.getDuplexModes());
        writer.writeCollectionOfPrimitiveValues("feedOrientations", this.getFeedOrientations());
        writer.writeCollectionOfPrimitiveValues("finishings", this.getFinishings());
        writer.writeCollectionOfPrimitiveValues("inputBins", this.getInputBins());
        writer.writeBooleanValue("isColorPrintingSupported", this.getIsColorPrintingSupported());
        writer.writeBooleanValue("isPageRangeSupported", this.getIsPageRangeSupported());
        writer.writeCollectionOfPrimitiveValues("leftMargins", this.getLeftMargins());
        writer.writeCollectionOfPrimitiveValues("mediaColors", this.getMediaColors());
        writer.writeCollectionOfPrimitiveValues("mediaSizes", this.getMediaSizes());
        writer.writeCollectionOfPrimitiveValues("mediaTypes", this.getMediaTypes());
        writer.writeCollectionOfPrimitiveValues("multipageLayouts", this.getMultipageLayouts());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("orientations", this.getOrientations());
        writer.writeCollectionOfPrimitiveValues("outputBins", this.getOutputBins());
        writer.writeCollectionOfPrimitiveValues("pagesPerSheet", this.getPagesPerSheet());
        writer.writeCollectionOfPrimitiveValues("qualities", this.getQualities());
        writer.writeCollectionOfPrimitiveValues("rightMargins", this.getRightMargins());
        writer.writeCollectionOfPrimitiveValues("scalings", this.getScalings());
        writer.writeBooleanValue("supportsFitPdfToPage", this.getSupportsFitPdfToPage());
        writer.writeCollectionOfPrimitiveValues("topMargins", this.getTopMargins());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @param value Value to set for the bottomMargins property.
     * @return a void
     */
    public void setBottomMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this._bottomMargins = value;
    }
    /**
     * Sets the collation property value. True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
     * @param value Value to set for the collation property.
     * @return a void
     */
    public void setCollation(@javax.annotation.Nullable final Boolean value) {
        this._collation = value;
    }
    /**
     * Sets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the colorModes property.
     * @return a void
     */
    public void setColorModes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._colorModes = value;
    }
    /**
     * Sets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types.
     * @param value Value to set for the contentTypes property.
     * @return a void
     */
    public void setContentTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._contentTypes = value;
    }
    /**
     * Sets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @param value Value to set for the copiesPerJob property.
     * @return a void
     */
    public void setCopiesPerJob(@javax.annotation.Nullable final IntegerRange value) {
        this._copiesPerJob = value;
    }
    /**
     * Sets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @param value Value to set for the dpis property.
     * @return a void
     */
    public void setDpis(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this._dpis = value;
    }
    /**
     * Sets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the duplexModes property.
     * @return a void
     */
    public void setDuplexModes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._duplexModes = value;
    }
    /**
     * Sets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @param value Value to set for the feedOrientations property.
     * @return a void
     */
    public void setFeedOrientations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._feedOrientations = value;
    }
    /**
     * Sets the finishings property value. Finishing processes the printer supports for a printed document.
     * @param value Value to set for the finishings property.
     * @return a void
     */
    public void setFinishings(@javax.annotation.Nullable final java.util.List<String> value) {
        this._finishings = value;
    }
    /**
     * Sets the inputBins property value. Supported input bins for the printer.
     * @param value Value to set for the inputBins property.
     * @return a void
     */
    public void setInputBins(@javax.annotation.Nullable final java.util.List<String> value) {
        this._inputBins = value;
    }
    /**
     * Sets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @param value Value to set for the isColorPrintingSupported property.
     * @return a void
     */
    public void setIsColorPrintingSupported(@javax.annotation.Nullable final Boolean value) {
        this._isColorPrintingSupported = value;
    }
    /**
     * Sets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @param value Value to set for the isPageRangeSupported property.
     * @return a void
     */
    public void setIsPageRangeSupported(@javax.annotation.Nullable final Boolean value) {
        this._isPageRangeSupported = value;
    }
    /**
     * Sets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @param value Value to set for the leftMargins property.
     * @return a void
     */
    public void setLeftMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this._leftMargins = value;
    }
    /**
     * Sets the mediaColors property value. The media (i.e., paper) colors supported by the printer.
     * @param value Value to set for the mediaColors property.
     * @return a void
     */
    public void setMediaColors(@javax.annotation.Nullable final java.util.List<String> value) {
        this._mediaColors = value;
    }
    /**
     * Sets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @param value Value to set for the mediaSizes property.
     * @return a void
     */
    public void setMediaSizes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._mediaSizes = value;
    }
    /**
     * Sets the mediaTypes property value. The media types supported by the printer.
     * @param value Value to set for the mediaTypes property.
     * @return a void
     */
    public void setMediaTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._mediaTypes = value;
    }
    /**
     * Sets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @param value Value to set for the multipageLayouts property.
     * @return a void
     */
    public void setMultipageLayouts(@javax.annotation.Nullable final java.util.List<String> value) {
        this._multipageLayouts = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the orientations property.
     * @return a void
     */
    public void setOrientations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._orientations = value;
    }
    /**
     * Sets the outputBins property value. The printer's supported output bins (trays).
     * @param value Value to set for the outputBins property.
     * @return a void
     */
    public void setOutputBins(@javax.annotation.Nullable final java.util.List<String> value) {
        this._outputBins = value;
    }
    /**
     * Sets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @param value Value to set for the pagesPerSheet property.
     * @return a void
     */
    public void setPagesPerSheet(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this._pagesPerSheet = value;
    }
    /**
     * Sets the qualities property value. The print qualities supported by the printer.
     * @param value Value to set for the qualities property.
     * @return a void
     */
    public void setQualities(@javax.annotation.Nullable final java.util.List<String> value) {
        this._qualities = value;
    }
    /**
     * Sets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @param value Value to set for the rightMargins property.
     * @return a void
     */
    public void setRightMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this._rightMargins = value;
    }
    /**
     * Sets the scalings property value. Supported print scalings.
     * @param value Value to set for the scalings property.
     * @return a void
     */
    public void setScalings(@javax.annotation.Nullable final java.util.List<String> value) {
        this._scalings = value;
    }
    /**
     * Sets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @param value Value to set for the supportsFitPdfToPage property.
     * @return a void
     */
    public void setSupportsFitPdfToPage(@javax.annotation.Nullable final Boolean value) {
        this._supportsFitPdfToPage = value;
    }
    /**
     * Sets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @param value Value to set for the topMargins property.
     * @return a void
     */
    public void setTopMargins(@javax.annotation.Nullable final java.util.List<Integer> value) {
        this._topMargins = value;
    }
}
