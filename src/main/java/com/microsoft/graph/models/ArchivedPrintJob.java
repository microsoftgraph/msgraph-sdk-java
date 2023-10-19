package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ArchivedPrintJob implements AdditionalDataHolder, Parsable {
    /**
     * True if the job was acquired by a printer; false otherwise. Read-only.
     */
    private Boolean acquiredByPrinter;
    /**
     * The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     */
    private OffsetDateTime acquiredDateTime;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
     */
    private OffsetDateTime completionDateTime;
    /**
     * The number of copies that were printed. Read-only.
     */
    private Integer copiesPrinted;
    /**
     * The user who created the print job. Read-only.
     */
    private UserIdentity createdBy;
    /**
     * The dateTimeOffset when the job was created. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The archived print job's GUID. Read-only.
     */
    private String id;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The printer ID that the job was queued for. Read-only.
     */
    private String printerId;
    /**
     * The printer name that the job was queued for. Read-only.
     */
    private String printerName;
    /**
     * The processingState property
     */
    private PrintJobProcessingState processingState;
    /**
     * Instantiates a new ArchivedPrintJob and sets the default values.
     */
    public ArchivedPrintJob() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ArchivedPrintJob
     */
    @jakarta.annotation.Nonnull
    public static ArchivedPrintJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ArchivedPrintJob();
    }
    /**
     * Gets the acquiredByPrinter property value. True if the job was acquired by a printer; false otherwise. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAcquiredByPrinter() {
        return this.acquiredByPrinter;
    }
    /**
     * Gets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAcquiredDateTime() {
        return this.acquiredDateTime;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.completionDateTime;
    }
    /**
     * Gets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCopiesPrinted() {
        return this.copiesPrinted;
    }
    /**
     * Gets the createdBy property value. The user who created the print job. Read-only.
     * @return a UserIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("acquiredByPrinter", (n) -> { this.setAcquiredByPrinter(n.getBooleanValue()); });
        deserializerMap.put("acquiredDateTime", (n) -> { this.setAcquiredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("completionDateTime", (n) -> { this.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("copiesPrinted", (n) -> { this.setCopiesPrinted(n.getIntegerValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("printerId", (n) -> { this.setPrinterId(n.getStringValue()); });
        deserializerMap.put("printerName", (n) -> { this.setPrinterName(n.getStringValue()); });
        deserializerMap.put("processingState", (n) -> { this.setProcessingState(n.getEnumValue(PrintJobProcessingState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The archived print job's GUID. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrinterId() {
        return this.printerId;
    }
    /**
     * Gets the printerName property value. The printer name that the job was queued for. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrinterName() {
        return this.printerName;
    }
    /**
     * Gets the processingState property value. The processingState property
     * @return a PrintJobProcessingState
     */
    @jakarta.annotation.Nullable
    public PrintJobProcessingState getProcessingState() {
        return this.processingState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("acquiredByPrinter", this.getAcquiredByPrinter());
        writer.writeOffsetDateTimeValue("acquiredDateTime", this.getAcquiredDateTime());
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeIntegerValue("copiesPrinted", this.getCopiesPrinted());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("printerId", this.getPrinterId());
        writer.writeStringValue("printerName", this.getPrinterName());
        writer.writeEnumValue("processingState", this.getProcessingState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acquiredByPrinter property value. True if the job was acquired by a printer; false otherwise. Read-only.
     * @param value Value to set for the acquiredByPrinter property.
     */
    public void setAcquiredByPrinter(@jakarta.annotation.Nullable final Boolean value) {
        this.acquiredByPrinter = value;
    }
    /**
     * Sets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @param value Value to set for the acquiredDateTime property.
     */
    public void setAcquiredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.acquiredDateTime = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completionDateTime = value;
    }
    /**
     * Sets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @param value Value to set for the copiesPrinted property.
     */
    public void setCopiesPrinted(@jakarta.annotation.Nullable final Integer value) {
        this.copiesPrinted = value;
    }
    /**
     * Sets the createdBy property value. The user who created the print job. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the id property value. The archived print job's GUID. Read-only.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @param value Value to set for the printerId property.
     */
    public void setPrinterId(@jakarta.annotation.Nullable final String value) {
        this.printerId = value;
    }
    /**
     * Sets the printerName property value. The printer name that the job was queued for. Read-only.
     * @param value Value to set for the printerName property.
     */
    public void setPrinterName(@jakarta.annotation.Nullable final String value) {
        this.printerName = value;
    }
    /**
     * Sets the processingState property value. The processingState property
     * @param value Value to set for the processingState property.
     */
    public void setProcessingState(@jakarta.annotation.Nullable final PrintJobProcessingState value) {
        this.processingState = value;
    }
}
