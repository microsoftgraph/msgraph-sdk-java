package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ToneInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** An incremental identifier used for ordering DTMF events. */
    private Long _sequenceId;
    /** Possible values are: tone0, tone1, tone2, tone3, tone4, tone5, tone6, tone7, tone8, tone9, star, pound, a, b, c, d, flash. */
    private Tone _tone;
    /**
     * Instantiates a new toneInfo and sets the default values.
     * @return a void
     */
    public ToneInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a toneInfo
     */
    @javax.annotation.Nonnull
    public static ToneInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ToneInfo();
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
        final ToneInfo currentObject = this;
        return new HashMap<>(2) {{
            this.put("sequenceId", (n) -> { currentObject.setSequenceId(n.getLongValue()); });
            this.put("tone", (n) -> { currentObject.setTone(n.getEnumValue(Tone.class)); });
        }};
    }
    /**
     * Gets the sequenceId property value. An incremental identifier used for ordering DTMF events.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSequenceId() {
        return this._sequenceId;
    }
    /**
     * Gets the tone property value. Possible values are: tone0, tone1, tone2, tone3, tone4, tone5, tone6, tone7, tone8, tone9, star, pound, a, b, c, d, flash.
     * @return a tone
     */
    @javax.annotation.Nullable
    public Tone getTone() {
        return this._tone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("sequenceId", this.getSequenceId());
        writer.writeEnumValue("tone", this.getTone());
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
     * Sets the sequenceId property value. An incremental identifier used for ordering DTMF events.
     * @param value Value to set for the sequenceId property.
     * @return a void
     */
    public void setSequenceId(@javax.annotation.Nullable final Long value) {
        this._sequenceId = value;
    }
    /**
     * Sets the tone property value. Possible values are: tone0, tone1, tone2, tone3, tone4, tone5, tone6, tone7, tone8, tone9, star, pound, a, b, c, d, flash.
     * @param value Value to set for the tone property.
     * @return a void
     */
    public void setTone(@javax.annotation.Nullable final Tone value) {
        this._tone = value;
    }
}
