package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserConsentRequest extends Request implements Parsable {
    /** Approval decisions associated with a request. */
    private Approval _approval;
    /** The user's justification for requiring access to the app. Supports $filter (eq only) and $orderby. */
    private String _reason;
    /**
     * Instantiates a new userConsentRequest and sets the default values.
     * @return a void
     */
    public UserConsentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userConsentRequest
     */
    @javax.annotation.Nonnull
    public static UserConsentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserConsentRequest();
    }
    /**
     * Gets the approval property value. Approval decisions associated with a request.
     * @return a approval
     */
    @javax.annotation.Nullable
    public Approval getApproval() {
        return this._approval;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserConsentRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("approval", (n) -> { currentObject.setApproval(n.getObjectValue(Approval::createFromDiscriminatorValue)); });
            this.put("reason", (n) -> { currentObject.setReason(n.getStringValue()); });
        }};
    }
    /**
     * Gets the reason property value. The user's justification for requiring access to the app. Supports $filter (eq only) and $orderby.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this._reason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("approval", this.getApproval());
        writer.writeStringValue("reason", this.getReason());
    }
    /**
     * Sets the approval property value. Approval decisions associated with a request.
     * @param value Value to set for the approval property.
     * @return a void
     */
    public void setApproval(@javax.annotation.Nullable final Approval value) {
        this._approval = value;
    }
    /**
     * Sets the reason property value. The user's justification for requiring access to the app. Supports $filter (eq only) and $orderby.
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final String value) {
        this._reason = value;
    }
}
