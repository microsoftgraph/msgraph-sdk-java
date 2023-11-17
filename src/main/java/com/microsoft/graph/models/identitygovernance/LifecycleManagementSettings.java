package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.EmailSettings;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecycleManagementSettings extends Entity implements Parsable {
    /**
     * Instantiates a new LifecycleManagementSettings and sets the default values.
     */
    public LifecycleManagementSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LifecycleManagementSettings
     */
    @jakarta.annotation.Nonnull
    public static LifecycleManagementSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecycleManagementSettings();
    }
    /**
     * Gets the emailSettings property value. The emailSettings property
     * @return a EmailSettings
     */
    @jakarta.annotation.Nullable
    public EmailSettings getEmailSettings() {
        return this.backingStore.get("emailSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailSettings", (n) -> { this.setEmailSettings(n.getObjectValue(EmailSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("workflowScheduleIntervalInHours", (n) -> { this.setWorkflowScheduleIntervalInHours(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the workflowScheduleIntervalInHours property value. The interval in hours at which all workflows running in the tenant should be scheduled for execution. This interval has a minimum value of 1 and a maximum value of 24. The default value is 3 hours.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWorkflowScheduleIntervalInHours() {
        return this.backingStore.get("workflowScheduleIntervalInHours");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("emailSettings", this.getEmailSettings());
        writer.writeIntegerValue("workflowScheduleIntervalInHours", this.getWorkflowScheduleIntervalInHours());
    }
    /**
     * Sets the emailSettings property value. The emailSettings property
     * @param value Value to set for the emailSettings property.
     */
    public void setEmailSettings(@jakarta.annotation.Nullable final EmailSettings value) {
        this.backingStore.set("emailSettings", value);
    }
    /**
     * Sets the workflowScheduleIntervalInHours property value. The interval in hours at which all workflows running in the tenant should be scheduled for execution. This interval has a minimum value of 1 and a maximum value of 24. The default value is 3 hours.
     * @param value Value to set for the workflowScheduleIntervalInHours property.
     */
    public void setWorkflowScheduleIntervalInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workflowScheduleIntervalInHours", value);
    }
}
