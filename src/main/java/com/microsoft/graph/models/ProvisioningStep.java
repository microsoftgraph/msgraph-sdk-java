package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisioningStep implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Summary of what occurred during the step. */
    private String _description;
    /** Details of what occurred during the step. */
    private DetailsInfo _details;
    /** Name of the step. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** Type of step. Possible values are: import, scoping, matching, processing, referenceResolution, export, unknownFutureValue. */
    private ProvisioningStepType _provisioningStepType;
    /** Status of the step. Possible values are: success, warning,  failure, skipped, unknownFutureValue. */
    private ProvisioningResult _status;
    /**
     * Instantiates a new provisioningStep and sets the default values.
     * @return a void
     */
    public ProvisioningStep() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.provisioningStep");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisioningStep
     */
    @javax.annotation.Nonnull
    public static ProvisioningStep createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisioningStep();
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
     * Gets the description property value. Summary of what occurred during the step.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the details property value. Details of what occurred during the step.
     * @return a detailsInfo
     */
    @javax.annotation.Nullable
    public DetailsInfo getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProvisioningStep currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("details", (n) -> { currentObject.setDetails(n.getObjectValue(DetailsInfo::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("provisioningStepType", (n) -> { currentObject.setProvisioningStepType(n.getEnumValue(ProvisioningStepType.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ProvisioningResult.class)); });
        }};
    }
    /**
     * Gets the name property value. Name of the step.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
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
     * Gets the provisioningStepType property value. Type of step. Possible values are: import, scoping, matching, processing, referenceResolution, export, unknownFutureValue.
     * @return a provisioningStepType
     */
    @javax.annotation.Nullable
    public ProvisioningStepType getProvisioningStepType() {
        return this._provisioningStepType;
    }
    /**
     * Gets the status property value. Status of the step. Possible values are: success, warning,  failure, skipped, unknownFutureValue.
     * @return a provisioningResult
     */
    @javax.annotation.Nullable
    public ProvisioningResult getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("provisioningStepType", this.getProvisioningStepType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the description property value. Summary of what occurred during the step.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the details property value. Details of what occurred during the step.
     * @param value Value to set for the details property.
     * @return a void
     */
    public void setDetails(@javax.annotation.Nullable final DetailsInfo value) {
        this._details = value;
    }
    /**
     * Sets the name property value. Name of the step.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
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
     * Sets the provisioningStepType property value. Type of step. Possible values are: import, scoping, matching, processing, referenceResolution, export, unknownFutureValue.
     * @param value Value to set for the provisioningStepType property.
     * @return a void
     */
    public void setProvisioningStepType(@javax.annotation.Nullable final ProvisioningStepType value) {
        this._provisioningStepType = value;
    }
    /**
     * Sets the status property value. Status of the step. Possible values are: success, warning,  failure, skipped, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ProvisioningResult value) {
        this._status = value;
    }
}
