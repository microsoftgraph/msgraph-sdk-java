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
public class PrinterCapabilities implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new PrinterCapabilities and sets the default values.
     */
    public PrinterCapabilities() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrinterCapabilities
     */
    @jakarta.annotation.Nonnull
    public static PrinterCapabilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterCapabilities();
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
     * Gets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getBottomMargins() {
        return this.backingStore.get("bottomMargins");
    }
    /**
     * Gets the collation property value. True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCollation() {
        return this.backingStore.get("collation");
    }
    /**
     * Gets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @return a java.util.List<PrintColorMode>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintColorMode> getColorModes() {
        return this.backingStore.get("colorModes");
    }
    /**
     * Gets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContentTypes() {
        return this.backingStore.get("contentTypes");
    }
    /**
     * Gets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @return a IntegerRange
     */
    @jakarta.annotation.Nullable
    public IntegerRange getCopiesPerJob() {
        return this.backingStore.get("copiesPerJob");
    }
    /**
     * Gets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getDpis() {
        return this.backingStore.get("dpis");
    }
    /**
     * Gets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @return a java.util.List<PrintDuplexMode>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintDuplexMode> getDuplexModes() {
        return this.backingStore.get("duplexModes");
    }
    /**
     * Gets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @return a java.util.List<PrinterFeedOrientation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrinterFeedOrientation> getFeedOrientations() {
        return this.backingStore.get("feedOrientations");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<PrintFinishing>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintFinishing> getFinishings() {
        return this.backingStore.get("finishings");
    }
    /**
     * Gets the inputBins property value. Supported input bins for the printer.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputBins() {
        return this.backingStore.get("inputBins");
    }
    /**
     * Gets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsColorPrintingSupported() {
        return this.backingStore.get("isColorPrintingSupported");
    }
    /**
     * Gets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPageRangeSupported() {
        return this.backingStore.get("isPageRangeSupported");
    }
    /**
     * Gets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getLeftMargins() {
        return this.backingStore.get("leftMargins");
    }
    /**
     * Gets the mediaColors property value. The media (i.e., paper) colors supported by the printer.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMediaColors() {
        return this.backingStore.get("mediaColors");
    }
    /**
     * Gets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMediaSizes() {
        return this.backingStore.get("mediaSizes");
    }
    /**
     * Gets the mediaTypes property value. The media types supported by the printer.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMediaTypes() {
        return this.backingStore.get("mediaTypes");
    }
    /**
     * Gets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @return a java.util.List<PrintMultipageLayout>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintMultipageLayout> getMultipageLayouts() {
        return this.backingStore.get("multipageLayouts");
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
     * Gets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @return a java.util.List<PrintOrientation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintOrientation> getOrientations() {
        return this.backingStore.get("orientations");
    }
    /**
     * Gets the outputBins property value. The printer's supported output bins (trays).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOutputBins() {
        return this.backingStore.get("outputBins");
    }
    /**
     * Gets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getPagesPerSheet() {
        return this.backingStore.get("pagesPerSheet");
    }
    /**
     * Gets the qualities property value. The print qualities supported by the printer.
     * @return a java.util.List<PrintQuality>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintQuality> getQualities() {
        return this.backingStore.get("qualities");
    }
    /**
     * Gets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getRightMargins() {
        return this.backingStore.get("rightMargins");
    }
    /**
     * Gets the scalings property value. Supported print scalings.
     * @return a java.util.List<PrintScaling>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintScaling> getScalings() {
        return this.backingStore.get("scalings");
    }
    /**
     * Gets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportsFitPdfToPage() {
        return this.backingStore.get("supportsFitPdfToPage");
    }
    /**
     * Gets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getTopMargins() {
        return this.backingStore.get("topMargins");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the bottomMargins property value. A list of supported bottom margins(in microns) for the printer.
     * @param value Value to set for the bottomMargins property.
     */
    public void setBottomMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("bottomMargins", value);
    }
    /**
     * Sets the collation property value. True if the printer supports collating when printing muliple copies of a multi-page document; false otherwise.
     * @param value Value to set for the collation property.
     */
    public void setCollation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("collation", value);
    }
    /**
     * Sets the colorModes property value. The color modes supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the colorModes property.
     */
    public void setColorModes(@jakarta.annotation.Nullable final java.util.List<PrintColorMode> value) {
        this.backingStore.set("colorModes", value);
    }
    /**
     * Sets the contentTypes property value. A list of supported content (MIME) types that the printer supports. It is not guaranteed that the Universal Print service supports printing all of these MIME types.
     * @param value Value to set for the contentTypes property.
     */
    public void setContentTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contentTypes", value);
    }
    /**
     * Sets the copiesPerJob property value. The range of copies per job supported by the printer.
     * @param value Value to set for the copiesPerJob property.
     */
    public void setCopiesPerJob(@jakarta.annotation.Nullable final IntegerRange value) {
        this.backingStore.set("copiesPerJob", value);
    }
    /**
     * Sets the dpis property value. The list of print resolutions in DPI that are supported by the printer.
     * @param value Value to set for the dpis property.
     */
    public void setDpis(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("dpis", value);
    }
    /**
     * Sets the duplexModes property value. The list of duplex modes that are supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the duplexModes property.
     */
    public void setDuplexModes(@jakarta.annotation.Nullable final java.util.List<PrintDuplexMode> value) {
        this.backingStore.set("duplexModes", value);
    }
    /**
     * Sets the feedOrientations property value. The list of feed orientations that are supported by the printer.
     * @param value Value to set for the feedOrientations property.
     */
    public void setFeedOrientations(@jakarta.annotation.Nullable final java.util.List<PrinterFeedOrientation> value) {
        this.backingStore.set("feedOrientations", value);
    }
    /**
     * Sets the finishings property value. Finishing processes the printer supports for a printed document.
     * @param value Value to set for the finishings property.
     */
    public void setFinishings(@jakarta.annotation.Nullable final java.util.List<PrintFinishing> value) {
        this.backingStore.set("finishings", value);
    }
    /**
     * Sets the inputBins property value. Supported input bins for the printer.
     * @param value Value to set for the inputBins property.
     */
    public void setInputBins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("inputBins", value);
    }
    /**
     * Sets the isColorPrintingSupported property value. True if color printing is supported by the printer; false otherwise. Read-only.
     * @param value Value to set for the isColorPrintingSupported property.
     */
    public void setIsColorPrintingSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isColorPrintingSupported", value);
    }
    /**
     * Sets the isPageRangeSupported property value. True if the printer supports printing by page ranges; false otherwise.
     * @param value Value to set for the isPageRangeSupported property.
     */
    public void setIsPageRangeSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPageRangeSupported", value);
    }
    /**
     * Sets the leftMargins property value. A list of supported left margins(in microns) for the printer.
     * @param value Value to set for the leftMargins property.
     */
    public void setLeftMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("leftMargins", value);
    }
    /**
     * Sets the mediaColors property value. The media (i.e., paper) colors supported by the printer.
     * @param value Value to set for the mediaColors property.
     */
    public void setMediaColors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mediaColors", value);
    }
    /**
     * Sets the mediaSizes property value. The media sizes supported by the printer. Supports standard size names for ISO and ANSI media sizes. Valid values are in the following table.
     * @param value Value to set for the mediaSizes property.
     */
    public void setMediaSizes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mediaSizes", value);
    }
    /**
     * Sets the mediaTypes property value. The media types supported by the printer.
     * @param value Value to set for the mediaTypes property.
     */
    public void setMediaTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("mediaTypes", value);
    }
    /**
     * Sets the multipageLayouts property value. The presentation directions supported by the printer. Supported values are described in the following table.
     * @param value Value to set for the multipageLayouts property.
     */
    public void setMultipageLayouts(@jakarta.annotation.Nullable final java.util.List<PrintMultipageLayout> value) {
        this.backingStore.set("multipageLayouts", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the orientations property value. The print orientations supported by the printer. Valid values are described in the following table.
     * @param value Value to set for the orientations property.
     */
    public void setOrientations(@jakarta.annotation.Nullable final java.util.List<PrintOrientation> value) {
        this.backingStore.set("orientations", value);
    }
    /**
     * Sets the outputBins property value. The printer's supported output bins (trays).
     * @param value Value to set for the outputBins property.
     */
    public void setOutputBins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("outputBins", value);
    }
    /**
     * Sets the pagesPerSheet property value. Supported number of Input Pages to impose upon a single Impression.
     * @param value Value to set for the pagesPerSheet property.
     */
    public void setPagesPerSheet(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("pagesPerSheet", value);
    }
    /**
     * Sets the qualities property value. The print qualities supported by the printer.
     * @param value Value to set for the qualities property.
     */
    public void setQualities(@jakarta.annotation.Nullable final java.util.List<PrintQuality> value) {
        this.backingStore.set("qualities", value);
    }
    /**
     * Sets the rightMargins property value. A list of supported right margins(in microns) for the printer.
     * @param value Value to set for the rightMargins property.
     */
    public void setRightMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("rightMargins", value);
    }
    /**
     * Sets the scalings property value. Supported print scalings.
     * @param value Value to set for the scalings property.
     */
    public void setScalings(@jakarta.annotation.Nullable final java.util.List<PrintScaling> value) {
        this.backingStore.set("scalings", value);
    }
    /**
     * Sets the supportsFitPdfToPage property value. True if the printer supports scaling PDF pages to match the print media size; false otherwise.
     * @param value Value to set for the supportsFitPdfToPage property.
     */
    public void setSupportsFitPdfToPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("supportsFitPdfToPage", value);
    }
    /**
     * Sets the topMargins property value. A list of supported top margins(in microns) for the printer.
     * @param value Value to set for the topMargins property.
     */
    public void setTopMargins(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("topMargins", value);
    }
}
