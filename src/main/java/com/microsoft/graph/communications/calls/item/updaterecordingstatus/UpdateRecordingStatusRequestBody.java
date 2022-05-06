package microsoft.graph.communications.calls.item.updaterecordingstatus;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.RecordingStatus;
/** Provides operations to call the updateRecordingStatus method.  */
public class UpdateRecordingStatusRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The clientContext property  */
    private String _clientContext;
    /** The status property  */
    private RecordingStatus _status;
    /**
     * Instantiates a new updateRecordingStatusRequestBody and sets the default values.
     * @return a void
     */
    public UpdateRecordingStatusRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateRecordingStatusRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateRecordingStatusRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRecordingStatusRequestBody();
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
     * Gets the clientContext property value. The clientContext property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientContext() {
        return this._clientContext;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateRecordingStatusRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("clientContext", (n) -> { currentObject.setClientContext(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(RecordingStatus.class)); });
        }};
    }
    /**
     * Gets the status property value. The status property
     * @return a recordingStatus
     */
    @javax.annotation.Nullable
    public RecordingStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     * @return a void
     */
    public void setClientContext(@javax.annotation.Nullable final String value) {
        this._clientContext = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final RecordingStatus value) {
        this._status = value;
    }
}
