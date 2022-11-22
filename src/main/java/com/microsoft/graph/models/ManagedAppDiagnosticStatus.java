package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents diagnostics status. */
public class ManagedAppDiagnosticStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Instruction on how to mitigate a failed validation */
    private String _mitigationInstruction;
    /** The OdataType property */
    private String _odataType;
    /** The state of the operation */
    private String _state;
    /** The validation friendly name */
    private String _validationName;
    /**
     * Instantiates a new managedAppDiagnosticStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAppDiagnosticStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAppDiagnosticStatus
     */
    @javax.annotation.Nonnull
    public static ManagedAppDiagnosticStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppDiagnosticStatus();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("mitigationInstruction", (n) -> { this.setMitigationInstruction(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("validationName", (n) -> { this.setValidationName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mitigationInstruction property value. Instruction on how to mitigate a failed validation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMitigationInstruction() {
        return this._mitigationInstruction;
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
     * Gets the state property value. The state of the operation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the validationName property value. The validation friendly name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValidationName() {
        return this._validationName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("mitigationInstruction", this.getMitigationInstruction());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("validationName", this.getValidationName());
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
     * Sets the mitigationInstruction property value. Instruction on how to mitigate a failed validation
     * @param value Value to set for the mitigationInstruction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMitigationInstruction(@javax.annotation.Nullable final String value) {
        this._mitigationInstruction = value;
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
     * Sets the state property value. The state of the operation
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the validationName property value. The validation friendly name
     * @param value Value to set for the validationName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidationName(@javax.annotation.Nullable final String value) {
        this._validationName = value;
    }
}
