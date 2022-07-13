package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A base complex type to store the detection or requirement rule data for a Win32 LOB app. */
public class Win32LobAppRule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Contains rule types for Win32 LOB apps. */
    private Win32LobAppRuleType _ruleType;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new win32LobAppRule and sets the default values.
     * @return a void
     */
    public Win32LobAppRule() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.win32LobAppRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppRule
     */
    @javax.annotation.Nonnull
    public static Win32LobAppRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.win32LobAppFileSystemRule": return new Win32LobAppFileSystemRule();
                case "#microsoft.graph.win32LobAppPowerShellScriptRule": return new Win32LobAppPowerShellScriptRule();
                case "#microsoft.graph.win32LobAppProductCodeRule": return new Win32LobAppProductCodeRule();
                case "#microsoft.graph.win32LobAppRegistryRule": return new Win32LobAppRegistryRule();
            }
        }
        return new Win32LobAppRule();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppRule currentObject = this;
        return new HashMap<>(2) {{
            this.put("ruleType", (n) -> { currentObject.setRuleType(n.getEnumValue(Win32LobAppRuleType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ruleType property value. Contains rule types for Win32 LOB apps.
     * @return a win32LobAppRuleType
     */
    @javax.annotation.Nullable
    public Win32LobAppRuleType getRuleType() {
        return this._ruleType;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("ruleType", this.getRuleType());
        writer.writeStringValue("@odata.type", this.getType());
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
     * Sets the ruleType property value. Contains rule types for Win32 LOB apps.
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    public void setRuleType(@javax.annotation.Nullable final Win32LobAppRuleType value) {
        this._ruleType = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
