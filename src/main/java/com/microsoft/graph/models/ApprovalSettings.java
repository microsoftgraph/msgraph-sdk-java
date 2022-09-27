package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApprovalSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** One of SingleStage, Serial, Parallel, NoApproval (default). NoApproval is used when isApprovalRequired is false. */
    private String _approvalMode;
    /** If approval is required, the one or two elements of this collection define each of the stages of approval. An empty array if no approval is required. */
    private java.util.List<UnifiedApprovalStage> _approvalStages;
    /** Indicates whether approval is required for requests in this policy. */
    private Boolean _isApprovalRequired;
    /** Indicates whether approval is required for a user to extend their assignment. */
    private Boolean _isApprovalRequiredForExtension;
    /** Indicates whether the requestor is required to supply a justification in their request. */
    private Boolean _isRequestorJustificationRequired;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new approvalSettings and sets the default values.
     * @return a void
     */
    public ApprovalSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.approvalSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approvalSettings
     */
    @javax.annotation.Nonnull
    public static ApprovalSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalSettings();
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
     * Gets the approvalMode property value. One of SingleStage, Serial, Parallel, NoApproval (default). NoApproval is used when isApprovalRequired is false.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApprovalMode() {
        return this._approvalMode;
    }
    /**
     * Gets the approvalStages property value. If approval is required, the one or two elements of this collection define each of the stages of approval. An empty array if no approval is required.
     * @return a unifiedApprovalStage
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedApprovalStage> getApprovalStages() {
        return this._approvalStages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApprovalSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("approvalMode", (n) -> { currentObject.setApprovalMode(n.getStringValue()); });
            this.put("approvalStages", (n) -> { currentObject.setApprovalStages(n.getCollectionOfObjectValues(UnifiedApprovalStage::createFromDiscriminatorValue)); });
            this.put("isApprovalRequired", (n) -> { currentObject.setIsApprovalRequired(n.getBooleanValue()); });
            this.put("isApprovalRequiredForExtension", (n) -> { currentObject.setIsApprovalRequiredForExtension(n.getBooleanValue()); });
            this.put("isRequestorJustificationRequired", (n) -> { currentObject.setIsRequestorJustificationRequired(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isApprovalRequired property value. Indicates whether approval is required for requests in this policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequired() {
        return this._isApprovalRequired;
    }
    /**
     * Gets the isApprovalRequiredForExtension property value. Indicates whether approval is required for a user to extend their assignment.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequiredForExtension() {
        return this._isApprovalRequiredForExtension;
    }
    /**
     * Gets the isRequestorJustificationRequired property value. Indicates whether the requestor is required to supply a justification in their request.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequestorJustificationRequired() {
        return this._isRequestorJustificationRequired;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("approvalMode", this.getApprovalMode());
        writer.writeCollectionOfObjectValues("approvalStages", this.getApprovalStages());
        writer.writeBooleanValue("isApprovalRequired", this.getIsApprovalRequired());
        writer.writeBooleanValue("isApprovalRequiredForExtension", this.getIsApprovalRequiredForExtension());
        writer.writeBooleanValue("isRequestorJustificationRequired", this.getIsRequestorJustificationRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the approvalMode property value. One of SingleStage, Serial, Parallel, NoApproval (default). NoApproval is used when isApprovalRequired is false.
     * @param value Value to set for the approvalMode property.
     * @return a void
     */
    public void setApprovalMode(@javax.annotation.Nullable final String value) {
        this._approvalMode = value;
    }
    /**
     * Sets the approvalStages property value. If approval is required, the one or two elements of this collection define each of the stages of approval. An empty array if no approval is required.
     * @param value Value to set for the approvalStages property.
     * @return a void
     */
    public void setApprovalStages(@javax.annotation.Nullable final java.util.List<UnifiedApprovalStage> value) {
        this._approvalStages = value;
    }
    /**
     * Sets the isApprovalRequired property value. Indicates whether approval is required for requests in this policy.
     * @param value Value to set for the isApprovalRequired property.
     * @return a void
     */
    public void setIsApprovalRequired(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequired = value;
    }
    /**
     * Sets the isApprovalRequiredForExtension property value. Indicates whether approval is required for a user to extend their assignment.
     * @param value Value to set for the isApprovalRequiredForExtension property.
     * @return a void
     */
    public void setIsApprovalRequiredForExtension(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequiredForExtension = value;
    }
    /**
     * Sets the isRequestorJustificationRequired property value. Indicates whether the requestor is required to supply a justification in their request.
     * @param value Value to set for the isRequestorJustificationRequired property.
     * @return a void
     */
    public void setIsRequestorJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRequestorJustificationRequired = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
