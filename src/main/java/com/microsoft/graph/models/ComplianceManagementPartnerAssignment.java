package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** User group targeting for Compliance Management Partner */
public class ComplianceManagementPartnerAssignment implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Group assignment target. */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new complianceManagementPartnerAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ComplianceManagementPartnerAssignment() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.complianceManagementPartnerAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a complianceManagementPartnerAssignment
     */
    @javax.annotation.Nonnull
    public static ComplianceManagementPartnerAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplianceManagementPartnerAssignment();
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
        final ComplianceManagementPartnerAssignment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
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
     * Gets the target property value. Group assignment target.
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("target", this.getTarget());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the target property value. Group assignment target.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
