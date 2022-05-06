package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Color in RGB.  */
public class RgbColor implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Blue value  */
    private Byte _b;
    /** Green value  */
    private Byte _g;
    /** Red value  */
    private Byte _r;
    /**
     * Instantiates a new rgbColor and sets the default values.
     * @return a void
     */
    public RgbColor() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rgbColor
     */
    @javax.annotation.Nonnull
    public static RgbColor createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RgbColor();
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
     * Gets the b property value. Blue value
     * @return a byte
     */
    @javax.annotation.Nullable
    public Byte getB() {
        return this._b;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RgbColor currentObject = this;
        return new HashMap<>(3) {{
            this.put("b", (n) -> { currentObject.setB(n.getByteValue()); });
            this.put("g", (n) -> { currentObject.setG(n.getByteValue()); });
            this.put("r", (n) -> { currentObject.setR(n.getByteValue()); });
        }};
    }
    /**
     * Gets the g property value. Green value
     * @return a byte
     */
    @javax.annotation.Nullable
    public Byte getG() {
        return this._g;
    }
    /**
     * Gets the r property value. Red value
     * @return a byte
     */
    @javax.annotation.Nullable
    public Byte getR() {
        return this._r;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteValue("b", this.getB());
        writer.writeByteValue("g", this.getG());
        writer.writeByteValue("r", this.getR());
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
     * Sets the b property value. Blue value
     * @param value Value to set for the b property.
     * @return a void
     */
    public void setB(@javax.annotation.Nullable final Byte value) {
        this._b = value;
    }
    /**
     * Sets the g property value. Green value
     * @param value Value to set for the g property.
     * @return a void
     */
    public void setG(@javax.annotation.Nullable final Byte value) {
        this._g = value;
    }
    /**
     * Sets the r property value. Red value
     * @param value Value to set for the r property.
     * @return a void
     */
    public void setR(@javax.annotation.Nullable final Byte value) {
        this._r = value;
    }
}
