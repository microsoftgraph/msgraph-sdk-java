package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppRegistryRule extends Win32LobAppRule implements Parsable {
    /** A value indicating whether to search the 32-bit registry on 64-bit systems. */
    private Boolean check32BitOn64System;
    /** The registry comparison value. */
    private String comparisonValue;
    /** The full path of the registry entry containing the value to detect. */
    private String keyPath;
    /** Contains all supported registry data detection type. */
    private Win32LobAppRegistryRuleOperationType operationType;
    /** Contains properties for detection operator. */
    private Win32LobAppRuleOperator operator;
    /** The name of the registry value to detect. */
    private String valueName;
    /**
     * Instantiates a new Win32LobAppRegistryRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.check32BitOn64System;
    }
    /**
     * Gets the comparisonValue property value. The registry comparison value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComparisonValue() {
        return this.comparisonValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("check32BitOn64System", (n) -> { this.setCheck32BitOn64System(n.getBooleanValue()); });
        deserializerMap.put("comparisonValue", (n) -> { this.setComparisonValue(n.getStringValue()); });
        deserializerMap.put("keyPath", (n) -> { this.setKeyPath(n.getStringValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(Win32LobAppRegistryRuleOperationType.class)); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(Win32LobAppRuleOperator.class)); });
        deserializerMap.put("valueName", (n) -> { this.setValueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyPath property value. The full path of the registry entry containing the value to detect.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyPath() {
        return this.keyPath;
    }
    /**
     * Gets the operationType property value. Contains all supported registry data detection type.
     * @return a win32LobAppRegistryRuleOperationType
     */
    @javax.annotation.Nullable
    public Win32LobAppRegistryRuleOperationType getOperationType() {
        return this.operationType;
    }
    /**
     * Gets the operator property value. Contains properties for detection operator.
     * @return a win32LobAppRuleOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppRuleOperator getOperator() {
        return this.operator;
    }
    /**
     * Gets the valueName property value. The name of the registry value to detect.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueName() {
        return this.valueName;
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
    @javax.annotation.Nonnull
    public void setCheck32BitOn64System(@javax.annotation.Nullable final Boolean value) {
        this.check32BitOn64System = value;
    }
    /**
     * Sets the comparisonValue property value. The registry comparison value.
     * @param value Value to set for the comparisonValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComparisonValue(@javax.annotation.Nullable final String value) {
        this.comparisonValue = value;
    }
    /**
     * Sets the keyPath property value. The full path of the registry entry containing the value to detect.
     * @param value Value to set for the keyPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyPath(@javax.annotation.Nullable final String value) {
        this.keyPath = value;
    }
    /**
     * Sets the operationType property value. Contains all supported registry data detection type.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final Win32LobAppRegistryRuleOperationType value) {
        this.operationType = value;
    }
    /**
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final Win32LobAppRuleOperator value) {
        this.operator = value;
    }
    /**
     * Sets the valueName property value. The name of the registry value to detect.
     * @param value Value to set for the valueName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueName(@javax.annotation.Nullable final String value) {
        this.valueName = value;
    }
}
