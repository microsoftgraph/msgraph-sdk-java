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
public class DeviceComplianceScheduledActionForRule extends Entity implements Parsable {
    /**
     * Name of the rule which this scheduled action applies to. Currently scheduled actions are created per policy instead of per rule, thus RuleName is always set to default value PasswordRequired.
     */
    private String ruleName;
    /**
     * The list of scheduled action configurations for this compliance policy. Compliance policy must have one and only one block scheduled action.
     */
    private java.util.List<DeviceComplianceActionItem> scheduledActionConfigurations;
    /**
     * Instantiates a new deviceComplianceScheduledActionForRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceScheduledActionForRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScheduledActionForRule
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScheduledActionForRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScheduledActionForRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ruleName", (n) -> { this.setRuleName(n.getStringValue()); });
        deserializerMap.put("scheduledActionConfigurations", (n) -> { this.setScheduledActionConfigurations(n.getCollectionOfObjectValues(DeviceComplianceActionItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ruleName property value. Name of the rule which this scheduled action applies to. Currently scheduled actions are created per policy instead of per rule, thus RuleName is always set to default value PasswordRequired.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuleName() {
        return this.ruleName;
    }
    /**
     * Gets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. Compliance policy must have one and only one block scheduled action.
     * @return a deviceComplianceActionItem
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceActionItem> getScheduledActionConfigurations() {
        return this.scheduledActionConfigurations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("ruleName", this.getRuleName());
        writer.writeCollectionOfObjectValues("scheduledActionConfigurations", this.getScheduledActionConfigurations());
    }
    /**
     * Sets the ruleName property value. Name of the rule which this scheduled action applies to. Currently scheduled actions are created per policy instead of per rule, thus RuleName is always set to default value PasswordRequired.
     * @param value Value to set for the ruleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuleName(@javax.annotation.Nullable final String value) {
        this.ruleName = value;
    }
    /**
     * Sets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. Compliance policy must have one and only one block scheduled action.
     * @param value Value to set for the scheduledActionConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduledActionConfigurations(@javax.annotation.Nullable final java.util.List<DeviceComplianceActionItem> value) {
        this.scheduledActionConfigurations = value;
    }
}
