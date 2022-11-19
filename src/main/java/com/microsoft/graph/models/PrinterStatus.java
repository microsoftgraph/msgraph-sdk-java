package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A human-readable description of the printer's current processing state. Read-only. */
    private String _description;
    /** The list of details describing why the printer is in the current state. Valid values are described in the following table. Read-only. */
    private java.util.List<PrinterProcessingStateDetail> _details;
    /** The OdataType property */
    private String _odataType;
    /** The state property */
    private PrinterProcessingState _state;
    /**
     * Instantiates a new printerStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrinterStatus() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.printerStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerStatus
     */
    @javax.annotation.Nonnull
    public static PrinterStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrinterStatus();
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
     * Gets the description property value. A human-readable description of the printer's current processing state. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the details property value. The list of details describing why the printer is in the current state. Valid values are described in the following table. Read-only.
     * @return a printerProcessingStateDetail
     */
    @javax.annotation.Nullable
    public java.util.List<PrinterProcessingStateDetail> getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrinterStatus currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("details", (n) -> { currentObject.setDetails(n.getCollectionOfEnumValues(PrinterProcessingStateDetail.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { currentObject.setState(n.getEnumValue(PrinterProcessingState.class)); });
        return deserializerMap;
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
     * Gets the state property value. The state property
     * @return a printerProcessingState
     */
    @javax.annotation.Nullable
    public PrinterProcessingState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfEnumValues("details", this.getDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the description property value. A human-readable description of the printer's current processing state. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the details property value. The list of details describing why the printer is in the current state. Valid values are described in the following table. Read-only.
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final java.util.List<PrinterProcessingStateDetail> value) {
        this._details = value;
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
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final PrinterProcessingState value) {
        this._state = value;
    }
}
