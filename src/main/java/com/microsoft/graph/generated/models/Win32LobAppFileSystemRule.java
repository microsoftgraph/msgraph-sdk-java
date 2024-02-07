package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type to store file or folder rule data for a Win32 LOB app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppFileSystemRule extends Win32LobAppRule implements Parsable {
    /**
     * Instantiates a new Win32LobAppFileSystemRule and sets the default values.
     */
    public Win32LobAppFileSystemRule() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppFileSystemRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppFileSystemRule
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppFileSystemRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppFileSystemRule();
    }
    /**
     * Gets the check32BitOn64System property value. A value indicating whether to expand environment variables in the 32-bit context on 64-bit systems.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCheck32BitOn64System() {
        return this.backingStore.get("check32BitOn64System");
    }
    /**
     * Gets the comparisonValue property value. The file or folder comparison value.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComparisonValue() {
        return this.backingStore.get("comparisonValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("check32BitOn64System", (n) -> { this.setCheck32BitOn64System(n.getBooleanValue()); });
        deserializerMap.put("comparisonValue", (n) -> { this.setComparisonValue(n.getStringValue()); });
        deserializerMap.put("fileOrFolderName", (n) -> { this.setFileOrFolderName(n.getStringValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(Win32LobAppFileSystemOperationType::forValue)); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(Win32LobAppRuleOperator::forValue)); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileOrFolderName property value. The file or folder name to look up.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileOrFolderName() {
        return this.backingStore.get("fileOrFolderName");
    }
    /**
     * Gets the operationType property value. Contains all supported file system detection type.
     * @return a Win32LobAppFileSystemOperationType
     */
    @jakarta.annotation.Nullable
    public Win32LobAppFileSystemOperationType getOperationType() {
        return this.backingStore.get("operationType");
    }
    /**
     * Gets the operator property value. Contains properties for detection operator.
     * @return a Win32LobAppRuleOperator
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRuleOperator getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Gets the path property value. The file or folder path to look up.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.backingStore.get("path");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("check32BitOn64System", this.getCheck32BitOn64System());
        writer.writeStringValue("comparisonValue", this.getComparisonValue());
        writer.writeStringValue("fileOrFolderName", this.getFileOrFolderName());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("path", this.getPath());
    }
    /**
     * Sets the check32BitOn64System property value. A value indicating whether to expand environment variables in the 32-bit context on 64-bit systems.
     * @param value Value to set for the check32BitOn64System property.
     */
    public void setCheck32BitOn64System(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("check32BitOn64System", value);
    }
    /**
     * Sets the comparisonValue property value. The file or folder comparison value.
     * @param value Value to set for the comparisonValue property.
     */
    public void setComparisonValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comparisonValue", value);
    }
    /**
     * Sets the fileOrFolderName property value. The file or folder name to look up.
     * @param value Value to set for the fileOrFolderName property.
     */
    public void setFileOrFolderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileOrFolderName", value);
    }
    /**
     * Sets the operationType property value. Contains all supported file system detection type.
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final Win32LobAppFileSystemOperationType value) {
        this.backingStore.set("operationType", value);
    }
    /**
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final Win32LobAppRuleOperator value) {
        this.backingStore.set("operator", value);
    }
    /**
     * Sets the path property value. The file or folder path to look up.
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("path", value);
    }
}
