package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppProductCodeRule extends Win32LobAppRule implements Parsable {
    /** The product code of the app. */
    private String _productCode;
    /** The product version comparison value. */
    private String _productVersion;
    /** Contains properties for detection operator. */
    private Win32LobAppRuleOperator _productVersionOperator;
    /**
     * Instantiates a new Win32LobAppProductCodeRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppProductCodeRule() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppProductCodeRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppProductCodeRule
     */
    @javax.annotation.Nonnull
    public static Win32LobAppProductCodeRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppProductCodeRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("productCode", (n) -> { this.setProductCode(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("productVersionOperator", (n) -> { this.setProductVersionOperator(n.getEnumValue(Win32LobAppRuleOperator.class)); });
        return deserializerMap;
    }
    /**
     * Gets the productCode property value. The product code of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductCode() {
        return this._productCode;
    }
    /**
     * Gets the productVersion property value. The product version comparison value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this._productVersion;
    }
    /**
     * Gets the productVersionOperator property value. Contains properties for detection operator.
     * @return a win32LobAppRuleOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppRuleOperator getProductVersionOperator() {
        return this._productVersionOperator;
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
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeEnumValue("productVersionOperator", this.getProductVersionOperator());
    }
    /**
     * Sets the productCode property value. The product code of the app.
     * @param value Value to set for the productCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductCode(@javax.annotation.Nullable final String value) {
        this._productCode = value;
    }
    /**
     * Sets the productVersion property value. The product version comparison value.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this._productVersion = value;
    }
    /**
     * Sets the productVersionOperator property value. Contains properties for detection operator.
     * @param value Value to set for the productVersionOperator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductVersionOperator(@javax.annotation.Nullable final Win32LobAppRuleOperator value) {
        this._productVersionOperator = value;
    }
}
