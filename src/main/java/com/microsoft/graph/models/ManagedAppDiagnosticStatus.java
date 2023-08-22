package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents diagnostics status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppDiagnosticStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instruction on how to mitigate a failed validation
     */
    private String mitigationInstruction;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The state of the operation
     */
    private String state;
    /**
     * The validation friendly name
     */
    private String validationName;
    /**
     * Instantiates a new managedAppDiagnosticStatus and sets the default values.
     */
    public ManagedAppDiagnosticStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAppDiagnosticStatus
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppDiagnosticStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppDiagnosticStatus();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
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
    @jakarta.annotation.Nullable
    public String getMitigationInstruction() {
        return this.mitigationInstruction;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the state property value. The state of the operation
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the validationName property value. The validation friendly name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getValidationName() {
        return this.validationName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("mitigationInstruction", this.getMitigationInstruction());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("validationName", this.getValidationName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the mitigationInstruction property value. Instruction on how to mitigate a failed validation
     * @param value Value to set for the mitigationInstruction property.
     */
    public void setMitigationInstruction(@jakarta.annotation.Nullable final String value) {
        this.mitigationInstruction = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. The state of the operation
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the validationName property value. The validation friendly name
     * @param value Value to set for the validationName property.
     */
    public void setValidationName(@jakarta.annotation.Nullable final String value) {
        this.validationName = value;
    }
}
