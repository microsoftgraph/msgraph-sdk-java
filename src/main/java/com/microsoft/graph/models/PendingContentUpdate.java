package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PendingContentUpdate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Date and time the pending binary operation was queued in UTC time. Read-only.  */
    private OffsetDateTime _queuedDateTime;
    /**
     * Instantiates a new pendingContentUpdate and sets the default values.
     * @return a void
     */
    public PendingContentUpdate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pendingContentUpdate
     */
    @javax.annotation.Nonnull
    public static PendingContentUpdate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PendingContentUpdate();
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
        final PendingContentUpdate currentObject = this;
        return new HashMap<>(1) {{
            this.put("queuedDateTime", (n) -> { currentObject.setQueuedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the queuedDateTime property value. Date and time the pending binary operation was queued in UTC time. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQueuedDateTime() {
        return this._queuedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("queuedDateTime", this.getQueuedDateTime());
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
     * Sets the queuedDateTime property value. Date and time the pending binary operation was queued in UTC time. Read-only.
     * @param value Value to set for the queuedDateTime property.
     * @return a void
     */
    public void setQueuedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._queuedDateTime = value;
    }
}
