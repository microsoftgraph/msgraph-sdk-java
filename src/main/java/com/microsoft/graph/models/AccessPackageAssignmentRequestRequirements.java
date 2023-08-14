package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestRequirements implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the requestor is allowed to set a custom schedule.
     */
    private Boolean allowCustomAssignmentSchedule;
    /**
     * Indicates whether a request to add must be approved by an approver.
     */
    private Boolean isApprovalRequiredForAdd;
    /**
     * Indicates whether a request to update must be approved by an approver.
     */
    private Boolean isApprovalRequiredForUpdate;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The description of the policy that the user is trying to request access using.
     */
    private String policyDescription;
    /**
     * The display name of the policy that the user is trying to request access using.
     */
    private String policyDisplayName;
    /**
     * The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     */
    private String policyId;
    /**
     * The questions property
     */
    private java.util.List<AccessPackageQuestion> questions;
    /**
     * Schedule restrictions enforced, if any.
     */
    private EntitlementManagementSchedule schedule;
    /**
     * Instantiates a new accessPackageAssignmentRequestRequirements and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequestRequirements() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentRequestRequirements
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequestRequirements createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestRequirements();
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
     * Gets the allowCustomAssignmentSchedule property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCustomAssignmentSchedule() {
        return this.allowCustomAssignmentSchedule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequiredForAdd() {
        return this.isApprovalRequiredForAdd;
    }
    /**
     * Gets the isApprovalRequiredForUpdate property value. Indicates whether a request to update must be approved by an approver.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovalRequiredForUpdate() {
        return this.isApprovalRequiredForUpdate;
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
     * Gets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyDescription() {
        return this.policyDescription;
    }
    /**
     * Gets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyDisplayName() {
        return this.policyDisplayName;
    }
    /**
     * Gets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the questions property value. The questions property
     * @return a accessPackageQuestion
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.questions;
    }
    /**
     * Gets the schedule property value. Schedule restrictions enforced, if any.
     * @return a entitlementManagementSchedule
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowCustomAssignmentSchedule property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @param value Value to set for the allowCustomAssignmentSchedule property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowCustomAssignmentSchedule(@jakarta.annotation.Nullable final Boolean value) {
        this.allowCustomAssignmentSchedule = value;
    }
    /**
     * Sets the isApprovalRequiredForAdd property value. Indicates whether a request to add must be approved by an approver.
     * @param value Value to set for the isApprovalRequiredForAdd property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsApprovalRequiredForAdd(@jakarta.annotation.Nullable final Boolean value) {
        this.isApprovalRequiredForAdd = value;
    }
    /**
     * Sets the isApprovalRequiredForUpdate property value. Indicates whether a request to update must be approved by an approver.
     * @param value Value to set for the isApprovalRequiredForUpdate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsApprovalRequiredForUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.isApprovalRequiredForUpdate = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDescription property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicyDescription(@jakarta.annotation.Nullable final String value) {
        this.policyDescription = value;
    }
    /**
     * Sets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDisplayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicyDisplayName(@jakarta.annotation.Nullable final String value) {
        this.policyDisplayName = value;
    }
    /**
     * Sets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @param value Value to set for the policyId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the questions property value. The questions property
     * @param value Value to set for the questions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.questions = value;
    }
    /**
     * Sets the schedule property value. Schedule restrictions enforced, if any.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSchedule(@jakarta.annotation.Nullable final EntitlementManagementSchedule value) {
        this.schedule = value;
    }
}
