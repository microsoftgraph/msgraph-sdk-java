package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcProvisioningPolicyAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcProvisioningPolicyAssignment} and sets the default values.
     */
    public CloudPcProvisioningPolicyAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcProvisioningPolicyAssignment}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcProvisioningPolicyAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcProvisioningPolicyAssignment();
    }
    /**
     * Gets the assignedUsers property value. The assignment targeted users for the provisioning policy. This list of users is computed based on assignments, licenses, group memberships, and policies. Read-only. Supports$expand.
     * @return a {@link java.util.List<User>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getAssignedUsers() {
        return this.backingStore.get("assignedUsers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedUsers", (n) -> { this.setAssignedUsers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(CloudPcManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target property value. The assignment target for the provisioning policy. Currently, the only target supported for this policy is a user group. For details, see cloudPcManagementGroupAssignmentTarget.
     * @return a {@link CloudPcManagementAssignmentTarget}
     */
    @jakarta.annotation.Nullable
    public CloudPcManagementAssignmentTarget getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignedUsers", this.getAssignedUsers());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the assignedUsers property value. The assignment targeted users for the provisioning policy. This list of users is computed based on assignments, licenses, group memberships, and policies. Read-only. Supports$expand.
     * @param value Value to set for the assignedUsers property.
     */
    public void setAssignedUsers(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.backingStore.set("assignedUsers", value);
    }
    /**
     * Sets the target property value. The assignment target for the provisioning policy. Currently, the only target supported for this policy is a user group. For details, see cloudPcManagementGroupAssignmentTarget.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final CloudPcManagementAssignmentTarget value) {
        this.backingStore.set("target", value);
    }
}
