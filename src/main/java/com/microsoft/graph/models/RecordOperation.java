package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the recordResponse method. */
public class RecordOperation extends CommsOperation implements Parsable {
    /** The access token required to retrieve the recording. */
    private String _recordingAccessToken;
    /** The location where the recording is located. */
    private String _recordingLocation;
    /**
     * Instantiates a new recordOperation and sets the default values.
     * @return a void
     */
    public RecordOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recordOperation
     */
    @javax.annotation.Nonnull
    public static RecordOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RecordOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("recordingAccessToken", (n) -> { currentObject.setRecordingAccessToken(n.getStringValue()); });
            this.put("recordingLocation", (n) -> { currentObject.setRecordingLocation(n.getStringValue()); });
        }};
    }
    /**
     * Gets the recordingAccessToken property value. The access token required to retrieve the recording.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecordingAccessToken() {
        return this._recordingAccessToken;
    }
    /**
     * Gets the recordingLocation property value. The location where the recording is located.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecordingLocation() {
        return this._recordingLocation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("recordingAccessToken", this.getRecordingAccessToken());
        writer.writeStringValue("recordingLocation", this.getRecordingLocation());
    }
    /**
     * Sets the recordingAccessToken property value. The access token required to retrieve the recording.
     * @param value Value to set for the recordingAccessToken property.
     * @return a void
     */
    public void setRecordingAccessToken(@javax.annotation.Nullable final String value) {
        this._recordingAccessToken = value;
    }
    /**
     * Sets the recordingLocation property value. The location where the recording is located.
     * @param value Value to set for the recordingLocation property.
     * @return a void
     */
    public void setRecordingLocation(@javax.annotation.Nullable final String value) {
        this._recordingLocation = value;
    }
}
