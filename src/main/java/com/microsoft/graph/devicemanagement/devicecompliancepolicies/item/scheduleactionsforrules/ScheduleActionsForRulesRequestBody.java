package microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduleactionsforrules;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceComplianceScheduledActionForRule;
/** Provides operations to call the scheduleActionsForRules method. */
public class ScheduleActionsForRulesRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceComplianceScheduledActionForRules property */
    private java.util.List<DeviceComplianceScheduledActionForRule> _deviceComplianceScheduledActionForRules;
    /**
     * Instantiates a new scheduleActionsForRulesRequestBody and sets the default values.
     * @return a void
     */
    public ScheduleActionsForRulesRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a scheduleActionsForRulesRequestBody
     */
    @javax.annotation.Nonnull
    public static ScheduleActionsForRulesRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduleActionsForRulesRequestBody();
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
        final ScheduleActionsForRulesRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("deviceComplianceScheduledActionForRules", (n) -> { currentObject.setDeviceComplianceScheduledActionForRules(n.getCollectionOfObjectValues(DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceComplianceScheduledActionForRules property value. The deviceComplianceScheduledActionForRules property
     * @param value Value to set for the deviceComplianceScheduledActionForRules property.
     * @return a void
     */
    public void setDeviceComplianceScheduledActionForRules(@javax.annotation.Nullable final java.util.List<DeviceComplianceScheduledActionForRule> value) {
        this._deviceComplianceScheduledActionForRules = value;
    }
}
