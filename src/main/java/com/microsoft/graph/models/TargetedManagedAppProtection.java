package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Policy used to configure detailed management settings targeted to specific security groups */
public class TargetedManagedAppProtection extends ManagedAppProtection implements Parsable {
    /** Navigation property to list of inclusion and exclusion groups to which the policy is deployed. */
    private java.util.List<TargetedManagedAppPolicyAssignment> _assignments;
    /** Indicates if the policy is deployed to any inclusion groups or not. */
    private Boolean _isAssigned;
    /**
     * Instantiates a new targetedManagedAppProtection and sets the default values.
     * @return a void
     */
    public TargetedManagedAppProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a targetedManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static TargetedManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.targetedManagedAppProtection": return new TargetedManagedAppProtection();
            }
        }
        return new TargetedManagedAppProtection();
    }
    /**
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a targetedManagedAppPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TargetedManagedAppProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("isAssigned", (n) -> { currentObject.setIsAssigned(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this._isAssigned;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this._isAssigned = value;
    }
}
