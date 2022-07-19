package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenShiftChangeRequest extends ScheduleChangeRequest implements Parsable {
    /** ID for the open shift. */
    private String _openShiftId;
    /**
     * Instantiates a new OpenShiftChangeRequest and sets the default values.
     * @return a void
     */
    public OpenShiftChangeRequest() {
        super();
        this.setOdataType("#microsoft.graph.openShiftChangeRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenShiftChangeRequest
     */
    @javax.annotation.Nonnull
    public static OpenShiftChangeRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenShiftChangeRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OpenShiftChangeRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("openShiftId", (n) -> { currentObject.setOpenShiftId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the openShiftId property value. ID for the open shift.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOpenShiftId() {
        return this._openShiftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("openShiftId", this.getOpenShiftId());
    }
    /**
     * Sets the openShiftId property value. ID for the open shift.
     * @param value Value to set for the openShiftId property.
     * @return a void
     */
    public void setOpenShiftId(@javax.annotation.Nullable final String value) {
        this._openShiftId = value;
    }
}
