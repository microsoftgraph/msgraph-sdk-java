package microsoft.graph.communications.calls.logteleconferencedevicequality;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.TeleconferenceDeviceQuality;
/** Provides operations to call the logTeleconferenceDeviceQuality method. */
public class LogTeleconferenceDeviceQualityRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The quality property */
    private TeleconferenceDeviceQuality _quality;
    /**
     * Instantiates a new logTeleconferenceDeviceQualityRequestBody and sets the default values.
     * @return a void
     */
    public LogTeleconferenceDeviceQualityRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a logTeleconferenceDeviceQualityRequestBody
     */
    @javax.annotation.Nonnull
    public static LogTeleconferenceDeviceQualityRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogTeleconferenceDeviceQualityRequestBody();
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
        final LogTeleconferenceDeviceQualityRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("quality", (n) -> { currentObject.setQuality(n.getObjectValue(TeleconferenceDeviceQuality::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the quality property value. The quality property
     * @return a teleconferenceDeviceQuality
     */
    @javax.annotation.Nullable
    public TeleconferenceDeviceQuality getQuality() {
        return this._quality;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("quality", this.getQuality());
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
     * Sets the quality property value. The quality property
     * @param value Value to set for the quality property.
     * @return a void
     */
    public void setQuality(@javax.annotation.Nullable final TeleconferenceDeviceQuality value) {
        this._quality = value;
    }
}
