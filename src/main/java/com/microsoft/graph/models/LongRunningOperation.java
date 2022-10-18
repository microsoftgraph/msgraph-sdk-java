package com.microsoft.graph.models;

import com.microsoft.graph.models.RichLongRunningOperation;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class LongRunningOperation extends Entity implements Parsable {
    /** The start time of the operation. */
    private OffsetDateTime _createdDateTime;
    /** The time of the last action in the operation. */
    private OffsetDateTime _lastActionDateTime;
    /** URI of the resource that the operation is performed on. */
    private String _resourceLocation;
    /** The status of the operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue. */
    private LongRunningOperationStatus _status;
    /** Details about the status of the operation. */
    private String _statusDetail;
    /**
     * Instantiates a new longRunningOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LongRunningOperation() {
        super();
        this.setOdataType("#microsoft.graph.longRunningOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a longRunningOperation
     */
    @javax.annotation.Nonnull
    public static LongRunningOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.richLongRunningOperation": return new RichLongRunningOperation();
            }
        }
        return new LongRunningOperation();
    }
    /**
     * Gets the createdDateTime property value. The start time of the operation.
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
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("resourceLocation", (n) -> { currentObject.setResourceLocation(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(LongRunningOperationStatus.class)); });
            this.put("statusDetail", (n) -> { currentObject.setStatusDetail(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActionDateTime property value. The time of the last action in the operation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the resourceLocation property value. URI of the resource that the operation is performed on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceLocation() {
        return this._resourceLocation;
    }
    /**
     * Gets the status property value. The status of the operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
     * @return a longRunningOperationStatus
     */
    @javax.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the statusDetail property value. Details about the status of the operation.
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
    @javax.annotation.Nonnull
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
     * Sets the createdDateTime property value. The start time of the operation.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastActionDateTime property value. The time of the last action in the operation.
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the resourceLocation property value. URI of the resource that the operation is performed on.
     * @param value Value to set for the resourceLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceLocation(@javax.annotation.Nullable final String value) {
        this._resourceLocation = value;
    }
    /**
     * Sets the status property value. The status of the operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final LongRunningOperationStatus value) {
        this._status = value;
    }
    /**
     * Sets the statusDetail property value. Details about the status of the operation.
     * @param value Value to set for the statusDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusDetail(@javax.annotation.Nullable final String value) {
        this._statusDetail = value;
    }
}
