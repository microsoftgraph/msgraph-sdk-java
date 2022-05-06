package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FailureInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Classification of why a call or portion of a call failed.  */
    private String _reason;
    /** The stage when the failure occurred. Possible values are: unknown, callSetup, midcall, unknownFutureValue.  */
    private FailureStage _stage;
    /**
     * Instantiates a new failureInfo and sets the default values.
     * @return a void
     */
    public FailureInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a failureInfo
     */
    @javax.annotation.Nonnull
    public static FailureInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FailureInfo();
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
        final FailureInfo currentObject = this;
        return new HashMap<>(2) {{
            this.put("reason", (n) -> { currentObject.setReason(n.getStringValue()); });
            this.put("stage", (n) -> { currentObject.setStage(n.getEnumValue(FailureStage.class)); });
        }};
    }
    /**
     * Gets the reason property value. Classification of why a call or portion of a call failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this._reason;
    }
    /**
     * Gets the stage property value. The stage when the failure occurred. Possible values are: unknown, callSetup, midcall, unknownFutureValue.
     * @return a failureStage
     */
    @javax.annotation.Nullable
    public FailureStage getStage() {
        return this._stage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("reason", this.getReason());
        writer.writeEnumValue("stage", this.getStage());
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
     * Sets the reason property value. Classification of why a call or portion of a call failed.
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final String value) {
        this._reason = value;
    }
    /**
     * Sets the stage property value. The stage when the failure occurred. Possible values are: unknown, callSetup, midcall, unknownFutureValue.
     * @param value Value to set for the stage property.
     * @return a void
     */
    public void setStage(@javax.annotation.Nullable final FailureStage value) {
        this._stage = value;
    }
}
