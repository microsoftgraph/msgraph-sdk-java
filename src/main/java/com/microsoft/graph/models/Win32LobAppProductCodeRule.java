package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type to store the product code and version rule data for a Win32 LOB app. This rule is not supported as a requirement rule.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppProductCodeRule extends Win32LobAppRule implements Parsable {
    /**
     * Instantiates a new Win32LobAppProductCodeRule and sets the default values.
     */
    public Win32LobAppProductCodeRule() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppProductCodeRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppProductCodeRule
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppProductCodeRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppProductCodeRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("productCode", (n) -> { this.setProductCode(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("productVersionOperator", (n) -> { this.setProductVersionOperator(n.getEnumValue(Win32LobAppRuleOperator.class)); });
        return deserializerMap;
    }
    /**
     * Gets the productCode property value. The product code of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductCode() {
        return this.BackingStore.get("productCode");
    }
    /**
     * Gets the productVersion property value. The product version comparison value.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductVersion() {
        return this.BackingStore.get("productVersion");
    }
    /**
     * Gets the productVersionOperator property value. Contains properties for detection operator.
     * @return a Win32LobAppRuleOperator
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRuleOperator getProductVersionOperator() {
        return this.BackingStore.get("productVersionOperator");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeEnumValue("productVersionOperator", this.getProductVersionOperator());
    }
    /**
     * Sets the productCode property value. The product code of the app.
     * @param value Value to set for the productCode property.
     */
    public void setProductCode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("productCode", value);
    }
    /**
     * Sets the productVersion property value. The product version comparison value.
     * @param value Value to set for the productVersion property.
     */
    public void setProductVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("productVersion", value);
    }
    /**
     * Sets the productVersionOperator property value. Contains properties for detection operator.
     * @param value Value to set for the productVersionOperator property.
     */
    public void setProductVersionOperator(@jakarta.annotation.Nullable final Win32LobAppRuleOperator value) {
        this.BackingStore.set("productVersionOperator", value);
    }
}
