package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppRegistryRule extends Win32LobAppRule implements Parsable {
    /** A value indicating whether to search the 32-bit registry on 64-bit systems. */
    private Boolean _check32BitOn64System;
    /** The registry comparison value. */
    private String _comparisonValue;
    /** The full path of the registry entry containing the value to detect. */
    private String _keyPath;
    /** Contains all supported registry data detection type. */
    private Win32LobAppRegistryRuleOperationType _operationType;
    /** Contains properties for detection operator. */
    private Win32LobAppRuleOperator _operator;
    /** The name of the registry value to detect. */
    private String _valueName;
    /**
     * Instantiates a new Win32LobAppRegistryRule and sets the default values.
     * @return a void
     */
    public Win32LobAppRegistryRule() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppRegistryRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppRegistryRule
     */
    @javax.annotation.Nonnull
    public static Win32LobAppRegistryRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppRegistryRule();
    }
    /**
     * Gets the check32BitOn64System property value. A value indicating whether to search the 32-bit registry on 64-bit systems.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCheck32BitOn64System() {
        return this._check32BitOn64System;
    }
    /**
     * Gets the comparisonValue property value. The registry comparison value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComparisonValue() {
        return this._comparisonValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppRegistryRule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("check32BitOn64System", (n) -> { currentObject.setCheck32BitOn64System(n.getBooleanValue()); });
            this.put("comparisonValue", (n) -> { currentObject.setComparisonValue(n.getStringValue()); });
            this.put("keyPath", (n) -> { currentObject.setKeyPath(n.getStringValue()); });
            this.put("operationType", (n) -> { currentObject.setOperationType(n.getEnumValue(Win32LobAppRegistryRuleOperationType.class)); });
            this.put("operator", (n) -> { currentObject.setOperator(n.getEnumValue(Win32LobAppRuleOperator.class)); });
            this.put("valueName", (n) -> { currentObject.setValueName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the keyPath property value. The full path of the registry entry containing the value to detect.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyPath() {
        return this._keyPath;
    }
    /**
     * Gets the operationType property value. Contains all supported registry data detection type.
     * @return a win32LobAppRegistryRuleOperationType
     */
    @javax.annotation.Nullable
    public Win32LobAppRegistryRuleOperationType getOperationType() {
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
     * Gets the valueName property value. The name of the registry value to detect.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueName() {
        return this._valueName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("check32BitOn64System", this.getCheck32BitOn64System());
        writer.writeStringValue("comparisonValue", this.getComparisonValue());
        writer.writeStringValue("keyPath", this.getKeyPath());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("valueName", this.getValueName());
    }
    /**
     * Sets the check32BitOn64System property value. A value indicating whether to search the 32-bit registry on 64-bit systems.
     * @param value Value to set for the check32BitOn64System property.
     * @return a void
     */
    public void setCheck32BitOn64System(@javax.annotation.Nullable final Boolean value) {
        this._check32BitOn64System = value;
    }
    /**
     * Sets the comparisonValue property value. The registry comparison value.
     * @param value Value to set for the comparisonValue property.
     * @return a void
     */
    public void setComparisonValue(@javax.annotation.Nullable final String value) {
        this._comparisonValue = value;
    }
    /**
     * Sets the keyPath property value. The full path of the registry entry containing the value to detect.
     * @param value Value to set for the keyPath property.
     * @return a void
     */
    public void setKeyPath(@javax.annotation.Nullable final String value) {
        this._keyPath = value;
    }
    /**
     * Sets the operationType property value. Contains all supported registry data detection type.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    public void setOperationType(@javax.annotation.Nullable final Win32LobAppRegistryRuleOperationType value) {
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
     * Sets the valueName property value. The name of the registry value to detect.
     * @param value Value to set for the valueName property.
     * @return a void
     */
    public void setValueName(@javax.annotation.Nullable final String value) {
        this._valueName = value;
    }
}
