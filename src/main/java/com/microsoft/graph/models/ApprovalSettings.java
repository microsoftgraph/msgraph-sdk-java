package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ApprovalSettings and sets the default values.
     */
    public ApprovalSettings() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApprovalSettings
     */
    @jakarta.annotation.Nonnull
    public static ApprovalSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the approvalMode property value. One of SingleStage, Serial, Parallel, NoApproval (default). NoApproval is used when isApprovalRequired is false.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApprovalMode() {
        return this.BackingStore.get("approvalMode");
    }
    /**
     * Gets the approvalStages property value. If approval is required, the one or two elements of this collection define each of the stages of approval. An empty array if no approval is required.
     * @return a java.util.List<UnifiedApprovalStage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedApprovalStage> getApprovalStages() {
        return this.BackingStore.get("approvalStages");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("approvalMode", (n) -> { this.setApprovalMode(n.getStringValue()); });
        deserializerMap.put("approvalStages", (n) -> { this.setApprovalStages(n.getCollectionOfObjectValues(UnifiedApprovalStage::createFromDiscriminatorValue)); });
        deserializerMap.put("isApprovalRequired", (n) -> { this.setIsApprovalRequired(n.getBooleanValue()); });
        deserializerMap.put("isApprovalRequiredForExtension", (n) -> { this.setIsApprovalRequiredForExtension(n.getBooleanValue()); });
        deserializerMap.put("isRequestorJustificationRequired", (n) -> { this.setIsRequestorJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isApprovalRequired property value. Indicates whether approval is required for requests in this policy.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequired() {
        return this.BackingStore.get("isApprovalRequired");
    }
    /**
     * Gets the isApprovalRequiredForExtension property value. Indicates whether approval is required for a user to extend their assignment.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequiredForExtension() {
        return this.BackingStore.get("isApprovalRequiredForExtension");
    }
    /**
     * Gets the isRequestorJustificationRequired property value. Indicates whether the requestor is required to supply a justification in their request.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequestorJustificationRequired() {
        return this.BackingStore.get("isRequestorJustificationRequired");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the approvalMode property value. One of SingleStage, Serial, Parallel, NoApproval (default). NoApproval is used when isApprovalRequired is false.
     * @param value Value to set for the approvalMode property.
     */
    public void setApprovalMode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("approvalMode", value);
    }
    /**
     * Sets the approvalStages property value. If approval is required, the one or two elements of this collection define each of the stages of approval. An empty array if no approval is required.
     * @param value Value to set for the approvalStages property.
     */
    public void setApprovalStages(@jakarta.annotation.Nullable final java.util.List<UnifiedApprovalStage> value) {
        this.BackingStore.set("approvalStages", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the isApprovalRequired property value. Indicates whether approval is required for requests in this policy.
     * @param value Value to set for the isApprovalRequired property.
     */
    public void setIsApprovalRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isApprovalRequired", value);
    }
    /**
     * Sets the isApprovalRequiredForExtension property value. Indicates whether approval is required for a user to extend their assignment.
     * @param value Value to set for the isApprovalRequiredForExtension property.
     */
    public void setIsApprovalRequiredForExtension(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isApprovalRequiredForExtension", value);
    }
    /**
     * Sets the isRequestorJustificationRequired property value. Indicates whether the requestor is required to supply a justification in their request.
     * @param value Value to set for the isRequestorJustificationRequired property.
     */
    public void setIsRequestorJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isRequestorJustificationRequired", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
