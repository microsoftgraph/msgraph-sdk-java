package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SizeRange implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.  */
    private Integer _maximumSize;
    /** The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.  */
    private Integer _minimumSize;
    /**
     * Instantiates a new sizeRange and sets the default values.
     * @return a void
     */
    public SizeRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sizeRange
     */
    @javax.annotation.Nonnull
    public static SizeRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SizeRange();
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
        final SizeRange currentObject = this;
        return new HashMap<>(2) {{
            this.put("maximumSize", (n) -> { currentObject.setMaximumSize(n.getIntegerValue()); });
            this.put("minimumSize", (n) -> { currentObject.setMinimumSize(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the maximumSize property value. The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumSize() {
        return this._maximumSize;
    }
    /**
     * Gets the minimumSize property value. The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumSize() {
        return this._minimumSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("maximumSize", this.getMaximumSize());
        writer.writeIntegerValue("minimumSize", this.getMinimumSize());
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
     * Sets the maximumSize property value. The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
     * @param value Value to set for the maximumSize property.
     * @return a void
     */
    public void setMaximumSize(@javax.annotation.Nullable final Integer value) {
        this._maximumSize = value;
    }
    /**
     * Sets the minimumSize property value. The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
     * @param value Value to set for the minimumSize property.
     * @return a void
     */
    public void setMinimumSize(@javax.annotation.Nullable final Integer value) {
        this._minimumSize = value;
    }
}
