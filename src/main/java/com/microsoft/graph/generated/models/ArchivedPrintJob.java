package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ArchivedPrintJob implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ArchivedPrintJob} and sets the default values.
     */
    public ArchivedPrintJob() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ArchivedPrintJob}
     */
    @jakarta.annotation.Nonnull
    public static ArchivedPrintJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ArchivedPrintJob();
    }
    /**
     * Gets the acquiredByPrinter property value. True if the job was acquired by a printer; false otherwise. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAcquiredByPrinter() {
        return this.backingStore.get("acquiredByPrinter");
    }
    /**
     * Gets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAcquiredDateTime() {
        return this.backingStore.get("acquiredDateTime");
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
     * Gets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled, or aborted. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.backingStore.get("completionDateTime");
    }
    /**
     * Gets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCopiesPrinted() {
        return this.backingStore.get("copiesPrinted");
    }
    /**
     * Gets the createdBy property value. The user who created the print job. Read-only.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
        deserializerMap.put("processingState", (n) -> { this.setProcessingState(n.getEnumValue(PrintJobProcessingState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The archived print job's GUID. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
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
     * Gets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrinterId() {
        return this.backingStore.get("printerId");
    }
    /**
     * Gets the printerName property value. The printer name that the job was queued for. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrinterName() {
        return this.backingStore.get("printerName");
    }
    /**
     * Gets the processingState property value. The processingState property
     * @return a {@link PrintJobProcessingState}
     */
    @jakarta.annotation.Nullable
    public PrintJobProcessingState getProcessingState() {
        return this.backingStore.get("processingState");
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
        this.backingStore.set("acquiredByPrinter", value);
    }
    /**
     * Sets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @param value Value to set for the acquiredDateTime property.
     */
    public void setAcquiredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("acquiredDateTime", value);
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
     * Sets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled, or aborted. Read-only.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completionDateTime", value);
    }
    /**
     * Sets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @param value Value to set for the copiesPrinted property.
     */
    public void setCopiesPrinted(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("copiesPrinted", value);
    }
    /**
     * Sets the createdBy property value. The user who created the print job. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the id property value. The archived print job's GUID. Read-only.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @param value Value to set for the printerId property.
     */
    public void setPrinterId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("printerId", value);
    }
    /**
     * Sets the printerName property value. The printer name that the job was queued for. Read-only.
     * @param value Value to set for the printerName property.
     */
    public void setPrinterName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("printerName", value);
    }
    /**
     * Sets the processingState property value. The processingState property
     * @param value Value to set for the processingState property.
     */
    public void setProcessingState(@jakarta.annotation.Nullable final PrintJobProcessingState value) {
        this.backingStore.set("processingState", value);
    }
}
