package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentRequestRequirements implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the requestor is allowed to set a custom schedule. */
    private Boolean _allowCustomAssignmentSchedule;
    /** Indicates whether a request to add must be approved by an approver. */
    private Boolean _isApprovalRequiredForAdd;
    /** Indicates whether a request to update must be approved by an approver. */
    private Boolean _isApprovalRequiredForUpdate;
    /** The OdataType property */
    private String _odataType;
    /** The description of the policy that the user is trying to request access using. */
    private String _policyDescription;
    /** The display name of the policy that the user is trying to request access using. */
    private String _policyDisplayName;
    /** The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request. */
    private String _policyId;
    /** Schedule restrictions enforced, if any. */
    private EntitlementManagementSchedule _schedule;
    /**
     * Instantiates a new accessPackageAssignmentRequestRequirements and sets the default values.
     * @return a void
     */
    public AccessPackageAssignmentRequestRequirements() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageAssignmentRequestRequirements");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentRequestRequirements
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentRequestRequirements createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequestRequirements();
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
     * Gets the allowCustomAssignmentSchedule property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCustomAssignmentSchedule() {
        return this._allowCustomAssignmentSchedule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentRequestRequirements currentObject = this;
        return new HashMap<>(8) {{
            this.put("allowCustomAssignmentSchedule", (n) -> { currentObject.setAllowCustomAssignmentSchedule(n.getBooleanValue()); });
            this.put("isApprovalRequiredForAdd", (n) -> { currentObject.setIsApprovalRequiredForAdd(n.getBooleanValue()); });
            this.put("isApprovalRequiredForUpdate", (n) -> { currentObject.setIsApprovalRequiredForUpdate(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("policyDescription", (n) -> { currentObject.setPolicyDescription(n.getStringValue()); });
            this.put("policyDisplayName", (n) -> { currentObject.setPolicyDisplayName(n.getStringValue()); });
            this.put("policyId", (n) -> { currentObject.setPolicyId(n.getStringValue()); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(EntitlementManagementSchedule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isApprovalRequiredForAdd property value. Indicates whether a request to add must be approved by an approver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequiredForAdd() {
        return this._isApprovalRequiredForAdd;
    }
    /**
     * Gets the isApprovalRequiredForUpdate property value. Indicates whether a request to update must be approved by an approver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsApprovalRequiredForUpdate() {
        return this._isApprovalRequiredForUpdate;
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
     * Gets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyDescription() {
        return this._policyDescription;
    }
    /**
     * Gets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyDisplayName() {
        return this._policyDisplayName;
    }
    /**
     * Gets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this._policyId;
    }
    /**
     * Gets the schedule property value. Schedule restrictions enforced, if any.
     * @return a entitlementManagementSchedule
     */
    @javax.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowCustomAssignmentSchedule", this.getAllowCustomAssignmentSchedule());
        writer.writeBooleanValue("isApprovalRequiredForAdd", this.getIsApprovalRequiredForAdd());
        writer.writeBooleanValue("isApprovalRequiredForUpdate", this.getIsApprovalRequiredForUpdate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyDescription", this.getPolicyDescription());
        writer.writeStringValue("policyDisplayName", this.getPolicyDisplayName());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeObjectValue("schedule", this.getSchedule());
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
     * Sets the allowCustomAssignmentSchedule property value. Indicates whether the requestor is allowed to set a custom schedule.
     * @param value Value to set for the allowCustomAssignmentSchedule property.
     * @return a void
     */
    public void setAllowCustomAssignmentSchedule(@javax.annotation.Nullable final Boolean value) {
        this._allowCustomAssignmentSchedule = value;
    }
    /**
     * Sets the isApprovalRequiredForAdd property value. Indicates whether a request to add must be approved by an approver.
     * @param value Value to set for the isApprovalRequiredForAdd property.
     * @return a void
     */
    public void setIsApprovalRequiredForAdd(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequiredForAdd = value;
    }
    /**
     * Sets the isApprovalRequiredForUpdate property value. Indicates whether a request to update must be approved by an approver.
     * @param value Value to set for the isApprovalRequiredForUpdate property.
     * @return a void
     */
    public void setIsApprovalRequiredForUpdate(@javax.annotation.Nullable final Boolean value) {
        this._isApprovalRequiredForUpdate = value;
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
     * Sets the policyDescription property value. The description of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDescription property.
     * @return a void
     */
    public void setPolicyDescription(@javax.annotation.Nullable final String value) {
        this._policyDescription = value;
    }
    /**
     * Sets the policyDisplayName property value. The display name of the policy that the user is trying to request access using.
     * @param value Value to set for the policyDisplayName property.
     * @return a void
     */
    public void setPolicyDisplayName(@javax.annotation.Nullable final String value) {
        this._policyDisplayName = value;
    }
    /**
     * Sets the policyId property value. The identifier of the policy that these requirements are associated with. This identifier can be used when creating a new assignment request.
     * @param value Value to set for the policyId property.
     * @return a void
     */
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this._policyId = value;
    }
    /**
     * Sets the schedule property value. Schedule restrictions enforced, if any.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    public void setSchedule(@javax.annotation.Nullable final EntitlementManagementSchedule value) {
        this._schedule = value;
    }
}
