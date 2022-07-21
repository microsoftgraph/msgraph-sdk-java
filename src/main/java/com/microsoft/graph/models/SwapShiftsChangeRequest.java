package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SwapShiftsChangeRequest extends OfferShiftRequest implements Parsable {
    /** Shift ID for the recipient user with whom the request is to swap. */
    private String _recipientShiftId;
    /**
     * Instantiates a new SwapShiftsChangeRequest and sets the default values.
     * @return a void
     */
    public SwapShiftsChangeRequest() {
        super();
        this.setOdataType("#microsoft.graph.swapShiftsChangeRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SwapShiftsChangeRequest
     */
    @javax.annotation.Nonnull
    public static SwapShiftsChangeRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SwapShiftsChangeRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SwapShiftsChangeRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("recipientShiftId", (n) -> { currentObject.setRecipientShiftId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the recipientShiftId property value. Shift ID for the recipient user with whom the request is to swap.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientShiftId() {
        return this._recipientShiftId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("recipientShiftId", this.getRecipientShiftId());
    }
    /**
     * Sets the recipientShiftId property value. Shift ID for the recipient user with whom the request is to swap.
     * @param value Value to set for the recipientShiftId property.
     * @return a void
     */
    public void setRecipientShiftId(@javax.annotation.Nullable final String value) {
        this._recipientShiftId = value;
    }
}
