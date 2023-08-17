package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A termsAndConditionsAssignment entity represents the assignment of a given Terms and Conditions (T&C) policy to a given group. Users in the group will be required to accept the terms in order to have devices enrolled into Intune.
 */
public class TermsAndConditionsAssignment extends Entity implements Parsable {
    /**
     * Assignment target that the T&C policy is assigned to.
     */
    private DeviceAndAppManagementAssignmentTarget target;
    /**
     * Instantiates a new termsAndConditionsAssignment and sets the default values.
     */
    public TermsAndConditionsAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a termsAndConditionsAssignment
     */
    @jakarta.annotation.Nonnull
    public static TermsAndConditionsAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TermsAndConditionsAssignment();
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
     * Gets the target property value. Assignment target that the T&C policy is assigned to.
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the target property value. Assignment target that the T&C policy is assigned to.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.target = value;
    }
}
