package com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduleactionsforrules;

import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the scheduleActionsForRules method. */
public class ScheduleActionsForRulesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceComplianceScheduledActionForRules property */
    private java.util.List<DeviceComplianceScheduledActionForRule> _deviceComplianceScheduledActionForRules;
    /**
     * Instantiates a new scheduleActionsForRulesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ScheduleActionsForRulesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a scheduleActionsForRulesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ScheduleActionsForRulesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduleActionsForRulesPostRequestBody();
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
     * Gets the deviceComplianceScheduledActionForRules property value. The deviceComplianceScheduledActionForRules property
     * @return a deviceComplianceScheduledActionForRule
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScheduledActionForRule> getDeviceComplianceScheduledActionForRules() {
        return this._deviceComplianceScheduledActionForRules;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ScheduleActionsForRulesPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("deviceComplianceScheduledActionForRules", (n) -> { currentObject.setDeviceComplianceScheduledActionForRules(n.getCollectionOfObjectValues(DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("deviceComplianceScheduledActionForRules", this.getDeviceComplianceScheduledActionForRules());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceComplianceScheduledActionForRules property value. The deviceComplianceScheduledActionForRules property
     * @param value Value to set for the deviceComplianceScheduledActionForRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceScheduledActionForRules(@javax.annotation.Nullable final java.util.List<DeviceComplianceScheduledActionForRule> value) {
        this._deviceComplianceScheduledActionForRules = value;
    }
}
