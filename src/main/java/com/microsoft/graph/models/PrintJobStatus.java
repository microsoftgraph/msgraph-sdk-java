package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintJobStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A human-readable description of the print job's current processing state. Read-only.
     */
    private String description;
    /**
     * Additional details for print job state. Valid values are described in the following table. Read-only.
     */
    private java.util.List<PrintJobStateDetail> details;
    /**
     * True if the job was acknowledged by a printer; false otherwise. Read-only.
     */
    private Boolean isAcquiredByPrinter;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The state property
     */
    private PrintJobProcessingState state;
    /**
     * Instantiates a new PrintJobStatus and sets the default values.
     */
    public PrintJobStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintJobStatus
     */
    @jakarta.annotation.Nonnull
    public static PrintJobStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintJobStatus();
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
     * Gets the description property value. A human-readable description of the print job's current processing state. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the details property value. Additional details for print job state. Valid values are described in the following table. Read-only.
     * @return a java.util.List<PrintJobStateDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintJobStateDetail> getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfEnumValues(PrintJobStateDetail.class)); });
        deserializerMap.put("isAcquiredByPrinter", (n) -> { this.setIsAcquiredByPrinter(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(PrintJobProcessingState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAcquiredByPrinter property value. True if the job was acknowledged by a printer; false otherwise. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAcquiredByPrinter() {
        return this.isAcquiredByPrinter;
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
     * Gets the state property value. The state property
     * @return a PrintJobProcessingState
     */
    @jakarta.annotation.Nullable
    public PrintJobProcessingState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfEnumValues("details", this.getDetails());
        writer.writeBooleanValue("isAcquiredByPrinter", this.getIsAcquiredByPrinter());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the description property value. A human-readable description of the print job's current processing state. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the details property value. Additional details for print job state. Valid values are described in the following table. Read-only.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<PrintJobStateDetail> value) {
        this.details = value;
    }
    /**
     * Sets the isAcquiredByPrinter property value. True if the job was acknowledged by a printer; false otherwise. Read-only.
     * @param value Value to set for the isAcquiredByPrinter property.
     */
    public void setIsAcquiredByPrinter(@jakarta.annotation.Nullable final Boolean value) {
        this.isAcquiredByPrinter = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final PrintJobProcessingState value) {
        this.state = value;
    }
}
