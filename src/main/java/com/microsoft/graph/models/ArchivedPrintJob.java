package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ArchivedPrintJob implements AdditionalDataHolder, Parsable {
    /** True if the job was acquired by a printer; false otherwise. Read-only. */
    private Boolean _acquiredByPrinter;
    /** The dateTimeOffset when the job was acquired by the printer, if any. Read-only. */
    private OffsetDateTime _acquiredDateTime;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The dateTimeOffset when the job was completed, canceled or aborted. Read-only. */
    private OffsetDateTime _completionDateTime;
    /** The number of copies that were printed. Read-only. */
    private Integer _copiesPrinted;
    /** The user who created the print job. Read-only. */
    private UserIdentity _createdBy;
    /** The dateTimeOffset when the job was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The archived print job's GUID. Read-only. */
    private String _id;
    /** The OdataType property */
    private String _odataType;
    /** The printer ID that the job was queued for. Read-only. */
    private String _printerId;
    /** The processingState property */
    private PrintJobProcessingState _processingState;
    /**
     * Instantiates a new archivedPrintJob and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ArchivedPrintJob() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.archivedPrintJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a archivedPrintJob
     */
    @javax.annotation.Nonnull
    public static ArchivedPrintJob createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ArchivedPrintJob();
    }
    /**
     * Gets the acquiredByPrinter property value. True if the job was acquired by a printer; false otherwise. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAcquiredByPrinter() {
        return this._acquiredByPrinter;
    }
    /**
     * Gets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAcquiredDateTime() {
        return this._acquiredDateTime;
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
     * Gets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this._completionDateTime;
    }
    /**
     * Gets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCopiesPrinted() {
        return this._copiesPrinted;
    }
    /**
     * Gets the createdBy property value. The user who created the print job. Read-only.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ArchivedPrintJob currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(10);
        deserializerMap.put("acquiredByPrinter", (n) -> { currentObject.setAcquiredByPrinter(n.getBooleanValue()); });
        deserializerMap.put("acquiredDateTime", (n) -> { currentObject.setAcquiredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("completionDateTime", (n) -> { currentObject.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("copiesPrinted", (n) -> { currentObject.setCopiesPrinted(n.getIntegerValue()); });
        deserializerMap.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("printerId", (n) -> { currentObject.setPrinterId(n.getStringValue()); });
        deserializerMap.put("processingState", (n) -> { currentObject.setProcessingState(n.getEnumValue(PrintJobProcessingState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The archived print job's GUID. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
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
     * Gets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterId() {
        return this._printerId;
    }
    /**
     * Gets the processingState property value. The processingState property
     * @return a printJobProcessingState
     */
    @javax.annotation.Nullable
    public PrintJobProcessingState getProcessingState() {
        return this._processingState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeEnumValue("processingState", this.getProcessingState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acquiredByPrinter property value. True if the job was acquired by a printer; false otherwise. Read-only.
     * @param value Value to set for the acquiredByPrinter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcquiredByPrinter(@javax.annotation.Nullable final Boolean value) {
        this._acquiredByPrinter = value;
    }
    /**
     * Sets the acquiredDateTime property value. The dateTimeOffset when the job was acquired by the printer, if any. Read-only.
     * @param value Value to set for the acquiredDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcquiredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._acquiredDateTime = value;
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
     * Sets the completionDateTime property value. The dateTimeOffset when the job was completed, canceled or aborted. Read-only.
     * @param value Value to set for the completionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completionDateTime = value;
    }
    /**
     * Sets the copiesPrinted property value. The number of copies that were printed. Read-only.
     * @param value Value to set for the copiesPrinted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopiesPrinted(@javax.annotation.Nullable final Integer value) {
        this._copiesPrinted = value;
    }
    /**
     * Sets the createdBy property value. The user who created the print job. Read-only.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The dateTimeOffset when the job was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the id property value. The archived print job's GUID. Read-only.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
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
     * Sets the printerId property value. The printer ID that the job was queued for. Read-only.
     * @param value Value to set for the printerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterId(@javax.annotation.Nullable final String value) {
        this._printerId = value;
    }
    /**
     * Sets the processingState property value. The processingState property
     * @param value Value to set for the processingState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessingState(@javax.annotation.Nullable final PrintJobProcessingState value) {
        this._processingState = value;
    }
}
