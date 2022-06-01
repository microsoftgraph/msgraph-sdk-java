package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the identityProtectionRoot singleton. */
public class RiskyUserHistoryItem extends RiskyUser implements Parsable {
    /** The activity related to user risk level change. */
    private RiskUserActivity _activity;
    /** The id of actor that does the operation. */
    private String _initiatedBy;
    /** The id of the user. */
    private String _userId;
    /**
     * Instantiates a new riskyUserHistoryItem and sets the default values.
     * @return a void
     */
    public RiskyUserHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a riskyUserHistoryItem
     */
    @javax.annotation.Nonnull
    public static RiskyUserHistoryItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskyUserHistoryItem();
    }
    /**
     * Gets the activity property value. The activity related to user risk level change.
     * @return a riskUserActivity
     */
    @javax.annotation.Nullable
    public RiskUserActivity getActivity() {
        return this._activity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RiskyUserHistoryItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activity", (n) -> { currentObject.setActivity(n.getObjectValue(RiskUserActivity::createFromDiscriminatorValue)); });
            this.put("initiatedBy", (n) -> { currentObject.setInitiatedBy(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the initiatedBy property value. The id of actor that does the operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedBy() {
        return this._initiatedBy;
    }
    /**
     * Gets the userId property value. The id of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeStringValue("initiatedBy", this.getInitiatedBy());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the activity property value. The activity related to user risk level change.
     * @param value Value to set for the activity property.
     * @return a void
     */
    public void setActivity(@javax.annotation.Nullable final RiskUserActivity value) {
        this._activity = value;
    }
    /**
     * Sets the initiatedBy property value. The id of actor that does the operation.
     * @param value Value to set for the initiatedBy property.
     * @return a void
     */
    public void setInitiatedBy(@javax.annotation.Nullable final String value) {
        this._initiatedBy = value;
    }
    /**
     * Sets the userId property value. The id of the user.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
