package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SignInFrequencySessionControl extends ConditionalAccessSessionControl implements Parsable {
    /** Possible values are: days, hours.  */
    private SigninFrequencyType _type;
    /** The number of days or hours.  */
    private Integer _value;
    /**
     * Instantiates a new signInFrequencySessionControl and sets the default values.
     * @return a void
     */
    public SignInFrequencySessionControl() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signInFrequencySessionControl
     */
    @javax.annotation.Nonnull
    public static SignInFrequencySessionControl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignInFrequencySessionControl();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SignInFrequencySessionControl currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(SigninFrequencyType.class)); });
            this.put("value", (n) -> { currentObject.setValue(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the type property value. Possible values are: days, hours.
     * @return a signinFrequencyType
     */
    @javax.annotation.Nullable
    public SigninFrequencyType getType() {
        return this._type;
    }
    /**
     * Gets the value property value. The number of days or hours.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("type", this.getType());
        writer.writeIntegerValue("value", this.getValue());
    }
    /**
     * Sets the type property value. Possible values are: days, hours.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final SigninFrequencyType value) {
        this._type = value;
    }
    /**
     * Sets the value property value. The number of days or hours.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final Integer value) {
        this._value = value;
    }
}
