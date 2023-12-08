package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Scheduled Action for Rule
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceScheduledActionForRule extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceComplianceScheduledActionForRule and sets the default values.
     */
    public DeviceComplianceScheduledActionForRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComplianceScheduledActionForRule
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScheduledActionForRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScheduledActionForRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ruleName", (n) -> { this.setRuleName(n.getStringValue()); });
        deserializerMap.put("scheduledActionConfigurations", (n) -> { this.setScheduledActionConfigurations(n.getCollectionOfObjectValues(DeviceComplianceActionItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ruleName property value. Name of the rule which this scheduled action applies to. Currently scheduled actions are created per policy instead of per rule, thus RuleName is always set to default value PasswordRequired.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRuleName() {
        return this.backingStore.get("ruleName");
    }
    /**
     * Gets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. Compliance policy must have one and only one block scheduled action.
     * @return a java.util.List<DeviceComplianceActionItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceActionItem> getScheduledActionConfigurations() {
        return this.backingStore.get("scheduledActionConfigurations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("ruleName", this.getRuleName());
        writer.writeCollectionOfObjectValues("scheduledActionConfigurations", this.getScheduledActionConfigurations());
    }
    /**
     * Sets the ruleName property value. Name of the rule which this scheduled action applies to. Currently scheduled actions are created per policy instead of per rule, thus RuleName is always set to default value PasswordRequired.
     * @param value Value to set for the ruleName property.
     */
    public void setRuleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ruleName", value);
    }
    /**
     * Sets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. Compliance policy must have one and only one block scheduled action.
     * @param value Value to set for the scheduledActionConfigurations property.
     */
    public void setScheduledActionConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceActionItem> value) {
        this.backingStore.set("scheduledActionConfigurations", value);
    }
}
