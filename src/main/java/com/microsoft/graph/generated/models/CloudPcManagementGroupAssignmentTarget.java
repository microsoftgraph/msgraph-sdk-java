package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcManagementGroupAssignmentTarget extends CloudPcManagementAssignmentTarget implements Parsable {
    /**
     * Instantiates a new {@link CloudPcManagementGroupAssignmentTarget} and sets the default values.
     */
    public CloudPcManagementGroupAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcManagementGroupAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcManagementGroupAssignmentTarget}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcManagementGroupAssignmentTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcManagementGroupAssignmentTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the servicePlanId property value. The servicePlanId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePlanId() {
        return this.backingStore.get("servicePlanId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
    }
    /**
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the servicePlanId property value. The servicePlanId property
     * @param value Value to set for the servicePlanId property.
     */
    public void setServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanId", value);
    }
}
