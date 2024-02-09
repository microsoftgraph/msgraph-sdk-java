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
public class AccessPackageAssignmentRequestRequirements implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AccessPackageAssignmentRequestRequirements} and sets the default values.
     */
    public AccessPackageAssignmentRequestRequirements() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageAssignmentRequestRequirements}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequestRequirements createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestRequirements();
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
     * Gets the allowCustomAssignmentSchedule property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCustomAssignmentSchedule() {
        return this.backingStore.get("allowCustomAssignmentSchedule");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("allowCustomAssignmentSchedule", (n) -> { this.setAllowCustomAssignmentSchedule(n.getBooleanValue()); });
        deserializerMap.put("isApprovalRequiredForAdd", (n) -> { this.setIsApprovalRequiredForAdd(n.getBooleanValue()); });
        deserializerMap.put("isApprovalRequiredForUpdate", (n) -> { this.setIsApprovalRequiredForUpdate(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyDescription", (n) -> { this.setPolicyDescription(n.getStringValue()); });
        deserializerMap.put("policyDisplayName", (n) -> { this.setPolicyDisplayName(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(AccessPackageQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(EntitlementManagementSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isApprovalRequiredForAdd property value. Indicates whether a request to add must be approved by an approver.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequiredForAdd() {
        return this.backingStore.get("isApprovalRequiredForAdd");
    }
    /**
     * Gets the isApprovalRequiredForUpdate property value. Indicates whether a request to update must be approved by an approver.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequiredForUpdate() {
        return this.backingStore.get("isApprovalRequiredForUpdate");
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
     * Gets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyDescription() {
        return this.backingStore.get("policyDescription");
    }
    /**
     * Gets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyDisplayName() {
        return this.backingStore.get("policyDisplayName");
    }
    /**
     * Gets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the questions property value. The questions property
     * @return a {@link java.util.List<AccessPackageQuestion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.backingStore.get("questions");
    }
    /**
     * Gets the schedule property value. Schedule restrictions enforced, if any.
     * @return a {@link EntitlementManagementSchedule}
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCustomAssignmentSchedule", this.getAllowCustomAssignmentSchedule());
        writer.writeBooleanValue("isApprovalRequiredForAdd", this.getIsApprovalRequiredForAdd());
        writer.writeBooleanValue("isApprovalRequiredForUpdate", this.getIsApprovalRequiredForUpdate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyDescription", this.getPolicyDescription());
        writer.writeStringValue("policyDisplayName", this.getPolicyDisplayName());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the allowCustomAssignmentSchedule property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @param value Value to set for the allowCustomAssignmentSchedule property.
     */
    public void setAllowCustomAssignmentSchedule(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCustomAssignmentSchedule", value);
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
     * Sets the isApprovalRequiredForAdd property value. Indicates whether a request to add must be approved by an approver.
     * @param value Value to set for the isApprovalRequiredForAdd property.
     */
    public void setIsApprovalRequiredForAdd(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApprovalRequiredForAdd", value);
    }
    /**
     * Sets the isApprovalRequiredForUpdate property value. Indicates whether a request to update must be approved by an approver.
     * @param value Value to set for the isApprovalRequiredForUpdate property.
     */
    public void setIsApprovalRequiredForUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isApprovalRequiredForUpdate", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDescription property.
     */
    public void setPolicyDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyDescription", value);
    }
    /**
     * Sets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDisplayName property.
     */
    public void setPolicyDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyDisplayName", value);
    }
    /**
     * Sets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the questions property value. The questions property
     * @param value Value to set for the questions property.
     */
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.backingStore.set("questions", value);
    }
    /**
     * Sets the schedule property value. Schedule restrictions enforced, if any.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final EntitlementManagementSchedule value) {
        this.backingStore.set("schedule", value);
    }
}
