package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDefenderAdvancedThreatProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /** Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule */
    private Boolean _allowSampleSharing;
    /** Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency. */
    private Boolean _enableExpeditedTelemetryReporting;
    /**
     * Instantiates a new WindowsDefenderAdvancedThreatProtectionConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDefenderAdvancedThreatProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDefenderAdvancedThreatProtectionConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderAdvancedThreatProtectionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderAdvancedThreatProtectionConfiguration();
    }
    /**
     * Gets the allowSampleSharing property value. Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowSampleSharing() {
        return this._allowSampleSharing;
    }
    /**
     * Gets the enableExpeditedTelemetryReporting property value. Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableExpeditedTelemetryReporting() {
        return this._enableExpeditedTelemetryReporting;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowSampleSharing", (n) -> { this.setAllowSampleSharing(n.getBooleanValue()); });
        deserializerMap.put("enableExpeditedTelemetryReporting", (n) -> { this.setEnableExpeditedTelemetryReporting(n.getBooleanValue()); });
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
        super.serialize(writer);
        writer.writeBooleanValue("allowSampleSharing", this.getAllowSampleSharing());
        writer.writeBooleanValue("enableExpeditedTelemetryReporting", this.getEnableExpeditedTelemetryReporting());
    }
    /**
     * Sets the allowSampleSharing property value. Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
     * @param value Value to set for the allowSampleSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowSampleSharing(@javax.annotation.Nullable final Boolean value) {
        this._allowSampleSharing = value;
    }
    /**
     * Sets the enableExpeditedTelemetryReporting property value. Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
     * @param value Value to set for the enableExpeditedTelemetryReporting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableExpeditedTelemetryReporting(@javax.annotation.Nullable final Boolean value) {
        this._enableExpeditedTelemetryReporting = value;
    }
}
