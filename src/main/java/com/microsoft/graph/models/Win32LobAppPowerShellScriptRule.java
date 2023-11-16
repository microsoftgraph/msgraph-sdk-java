package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type to store the PowerShell script rule data for a Win32 LOB app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppPowerShellScriptRule extends Win32LobAppRule implements Parsable {
    /**
     * Instantiates a new Win32LobAppPowerShellScriptRule and sets the default values.
     */
    public Win32LobAppPowerShellScriptRule() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppPowerShellScriptRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppPowerShellScriptRule
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppPowerShellScriptRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppPowerShellScriptRule();
    }
    /**
     * Gets the comparisonValue property value. The script output comparison value. Do not specify a value if the rule is used for detection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComparisonValue() {
        return this.BackingStore.get("comparisonValue");
    }
    /**
     * Gets the displayName property value. The display name for the rule. Do not specify this value if the rule is used for detection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the enforceSignatureCheck property value. A value indicating whether a signature check is enforced.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this.BackingStore.get("enforceSignatureCheck");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("comparisonValue", (n) -> { this.setComparisonValue(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(Win32LobAppPowerShellScriptRuleOperationType.class)); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(Win32LobAppRuleOperator.class)); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        deserializerMap.put("scriptContent", (n) -> { this.setScriptContent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the operationType property value. Contains all supported Powershell Script output detection type.
     * @return a Win32LobAppPowerShellScriptRuleOperationType
     */
    @jakarta.annotation.Nullable
    public Win32LobAppPowerShellScriptRuleOperationType getOperationType() {
        return this.BackingStore.get("operationType");
    }
    /**
     * Gets the operator property value. Contains properties for detection operator.
     * @return a Win32LobAppRuleOperator
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRuleOperator getOperator() {
        return this.BackingStore.get("operator");
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether the script should run as 32-bit.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this.BackingStore.get("runAs32Bit");
    }
    /**
     * Gets the runAsAccount property value. The execution context of the script. Do not specify this value if the rule is used for detection. Script detection rules will run in the same context as the associated app install context. Possible values are: system, user.
     * @return a RunAsAccountType
     */
    @jakarta.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this.BackingStore.get("runAsAccount");
    }
    /**
     * Gets the scriptContent property value. The base64-encoded script content.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScriptContent() {
        return this.BackingStore.get("scriptContent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("comparisonValue", this.getComparisonValue());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
        writer.writeStringValue("scriptContent", this.getScriptContent());
    }
    /**
     * Sets the comparisonValue property value. The script output comparison value. Do not specify a value if the rule is used for detection.
     * @param value Value to set for the comparisonValue property.
     */
    public void setComparisonValue(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("comparisonValue", value);
    }
    /**
     * Sets the displayName property value. The display name for the rule. Do not specify this value if the rule is used for detection.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the enforceSignatureCheck property value. A value indicating whether a signature check is enforced.
     * @param value Value to set for the enforceSignatureCheck property.
     */
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enforceSignatureCheck", value);
    }
    /**
     * Sets the operationType property value. Contains all supported Powershell Script output detection type.
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final Win32LobAppPowerShellScriptRuleOperationType value) {
        this.BackingStore.set("operationType", value);
    }
    /**
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final Win32LobAppRuleOperator value) {
        this.BackingStore.set("operator", value);
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether the script should run as 32-bit.
     * @param value Value to set for the runAs32Bit property.
     */
    public void setRunAs32Bit(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("runAs32Bit", value);
    }
    /**
     * Sets the runAsAccount property value. The execution context of the script. Do not specify this value if the rule is used for detection. Script detection rules will run in the same context as the associated app install context. Possible values are: system, user.
     * @param value Value to set for the runAsAccount property.
     */
    public void setRunAsAccount(@jakarta.annotation.Nullable final RunAsAccountType value) {
        this.BackingStore.set("runAsAccount", value);
    }
    /**
     * Sets the scriptContent property value. The base64-encoded script content.
     * @param value Value to set for the scriptContent property.
     */
    public void setScriptContent(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("scriptContent", value);
    }
}
