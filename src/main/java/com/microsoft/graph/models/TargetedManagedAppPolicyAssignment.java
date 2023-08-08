package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The type for deployment of groups or apps.
 */
public class TargetedManagedAppPolicyAssignment extends Entity implements Parsable {
    /**
     * Identifier for deployment to a group or app
     */
    private DeviceAndAppManagementAssignmentTarget target;
    /**
     * Instantiates a new targetedManagedAppPolicyAssignment and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TargetedManagedAppPolicyAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a targetedManagedAppPolicyAssignment
     */
    @jakarta.annotation.Nonnull
    public static TargetedManagedAppPolicyAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedManagedAppPolicyAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target property value. Identifier for deployment to a group or app
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the target property value. Identifier for deployment to a group or app
     * @param value Value to set for the target property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.target = value;
    }
}
