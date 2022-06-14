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
    /** The rule type indicating the purpose of the rule. Possible values are: detection, requirement. */
    private Win32LobAppRuleType _ruleType;
    /**
     * Instantiates a new win32LobAppRule and sets the default values.
     * @return a void
     */
    public Win32LobAppRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppRule
     */
    @javax.annotation.Nonnull
    public static Win32LobAppRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
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
        return new HashMap<>(1) {{
            this.put("ruleType", (n) -> { currentObject.setRuleType(n.getEnumValue(Win32LobAppRuleType.class)); });
        }};
    }
    /**
     * Gets the ruleType property value. The rule type indicating the purpose of the rule. Possible values are: detection, requirement.
     * @return a win32LobAppRuleType
     */
    @javax.annotation.Nullable
    public Win32LobAppRuleType getRuleType() {
        return this._ruleType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("ruleType", this.getRuleType());
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
     * Sets the ruleType property value. The rule type indicating the purpose of the rule. Possible values are: detection, requirement.
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    public void setRuleType(@javax.annotation.Nullable final Win32LobAppRuleType value) {
        this._ruleType = value;
    }
}
