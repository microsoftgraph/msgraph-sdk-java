package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LongRunningOperation extends Entity implements Parsable {
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The resourceLocation property */
    private String _resourceLocation;
    /** The status property */
    private LongRunningOperationStatus _status;
    /** The statusDetail property */
    private String _statusDetail;
    /**
     * Instantiates a new longRunningOperation and sets the default values.
     * @return a void
     */
    public LongRunningOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a longRunningOperation
     */
    @javax.annotation.Nonnull
    public static LongRunningOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LongRunningOperation();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LongRunningOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("resourceLocation", (n) -> { currentObject.setResourceLocation(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(LongRunningOperationStatus.class)); });
            this.put("statusDetail", (n) -> { currentObject.setStatusDetail(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the resourceLocation property value. The resourceLocation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceLocation() {
        return this._resourceLocation;
    }
    /**
     * Gets the status property value. The status property
     * @return a longRunningOperationStatus
     */
    @javax.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the statusDetail property value. The statusDetail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusDetail() {
        return this._statusDetail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusDetail", this.getStatusDetail());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the resourceLocation property value. The resourceLocation property
     * @param value Value to set for the resourceLocation property.
     * @return a void
     */
    public void setResourceLocation(@javax.annotation.Nullable final String value) {
        this._resourceLocation = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final LongRunningOperationStatus value) {
        this._status = value;
    }
    /**
     * Sets the statusDetail property value. The statusDetail property
     * @param value Value to set for the statusDetail property.
     * @return a void
     */
    public void setStatusDetail(@javax.annotation.Nullable final String value) {
        this._statusDetail = value;
    }
}
