package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppPowerShellScriptRule extends Win32LobAppRule implements Parsable {
    /** The script output comparison value. Do not specify a value if the rule is used for detection. */
    private String _comparisonValue;
    /** The display name for the rule. Do not specify this value if the rule is used for detection. */
    private String _displayName;
    /** A value indicating whether a signature check is enforced. */
    private Boolean _enforceSignatureCheck;
    /** Contains all supported Powershell Script output detection type. */
    private Win32LobAppPowerShellScriptRuleOperationType _operationType;
    /** Contains properties for detection operator. */
    private Win32LobAppRuleOperator _operator;
    /** A value indicating whether the script should run as 32-bit. */
    private Boolean _runAs32Bit;
    /** The execution context of the script. Do not specify this value if the rule is used for detection. Script detection rules will run in the same context as the associated app install context. Possible values are: system, user. */
    private RunAsAccountType _runAsAccount;
    /** The base64-encoded script content. */
    private String _scriptContent;
    /**
     * Instantiates a new Win32LobAppPowerShellScriptRule and sets the default values.
     * @return a void
     */
    public Win32LobAppPowerShellScriptRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppPowerShellScriptRule
     */
    @javax.annotation.Nonnull
    public static Win32LobAppPowerShellScriptRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppPowerShellScriptRule();
    }
    /**
     * Gets the comparisonValue property value. The script output comparison value. Do not specify a value if the rule is used for detection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComparisonValue() {
        return this._comparisonValue;
    }
    /**
     * Gets the displayName property value. The display name for the rule. Do not specify this value if the rule is used for detection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enforceSignatureCheck property value. A value indicating whether a signature check is enforced.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this._enforceSignatureCheck;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppPowerShellScriptRule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("comparisonValue", (n) -> { currentObject.setComparisonValue(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enforceSignatureCheck", (n) -> { currentObject.setEnforceSignatureCheck(n.getBooleanValue()); });
            this.put("operationType", (n) -> { currentObject.setOperationType(n.getEnumValue(Win32LobAppPowerShellScriptRuleOperationType.class)); });
            this.put("operator", (n) -> { currentObject.setOperator(n.getEnumValue(Win32LobAppRuleOperator.class)); });
            this.put("runAs32Bit", (n) -> { currentObject.setRunAs32Bit(n.getBooleanValue()); });
            this.put("runAsAccount", (n) -> { currentObject.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
            this.put("scriptContent", (n) -> { currentObject.setScriptContent(n.getStringValue()); });
        }};
    }
    /**
     * Gets the operationType property value. Contains all supported Powershell Script output detection type.
     * @return a win32LobAppPowerShellScriptRuleOperationType
     */
    @javax.annotation.Nullable
    public Win32LobAppPowerShellScriptRuleOperationType getOperationType() {
        return this._operationType;
    }
    /**
     * Gets the operator property value. Contains properties for detection operator.
     * @return a win32LobAppRuleOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppRuleOperator getOperator() {
        return this._operator;
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether the script should run as 32-bit.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this._runAs32Bit;
    }
    /**
     * Gets the runAsAccount property value. The execution context of the script. Do not specify this value if the rule is used for detection. Script detection rules will run in the same context as the associated app install context. Possible values are: system, user.
     * @return a runAsAccountType
     */
    @javax.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this._runAsAccount;
    }
    /**
     * Gets the scriptContent property value. The base64-encoded script content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScriptContent() {
        return this._scriptContent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setComparisonValue(@javax.annotation.Nullable final String value) {
        this._comparisonValue = value;
    }
    /**
     * Sets the displayName property value. The display name for the rule. Do not specify this value if the rule is used for detection.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enforceSignatureCheck property value. A value indicating whether a signature check is enforced.
     * @param value Value to set for the enforceSignatureCheck property.
     * @return a void
     */
    public void setEnforceSignatureCheck(@javax.annotation.Nullable final Boolean value) {
        this._enforceSignatureCheck = value;
    }
    /**
     * Sets the operationType property value. Contains all supported Powershell Script output detection type.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    public void setOperationType(@javax.annotation.Nullable final Win32LobAppPowerShellScriptRuleOperationType value) {
        this._operationType = value;
    }
    /**
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     * @return a void
     */
    public void setOperator(@javax.annotation.Nullable final Win32LobAppRuleOperator value) {
        this._operator = value;
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether the script should run as 32-bit.
     * @param value Value to set for the runAs32Bit property.
     * @return a void
     */
    public void setRunAs32Bit(@javax.annotation.Nullable final Boolean value) {
        this._runAs32Bit = value;
    }
    /**
     * Sets the runAsAccount property value. The execution context of the script. Do not specify this value if the rule is used for detection. Script detection rules will run in the same context as the associated app install context. Possible values are: system, user.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    public void setRunAsAccount(@javax.annotation.Nullable final RunAsAccountType value) {
        this._runAsAccount = value;
    }
    /**
     * Sets the scriptContent property value. The base64-encoded script content.
     * @param value Value to set for the scriptContent property.
     * @return a void
     */
    public void setScriptContent(@javax.annotation.Nullable final String value) {
        this._scriptContent = value;
    }
}
