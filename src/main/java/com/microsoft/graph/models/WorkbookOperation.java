package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookOperation extends Entity implements Parsable {
    /** The error returned by the operation.  */
    private WorkbookOperationError _error;
    /** The resource URI for the result.  */
    private String _resourceLocation;
    /** The current status of the operation. Possible values are: notStarted, running, succeeded, failed.  */
    private WorkbookOperationStatus _status;
    /**
     * Instantiates a new workbookOperation and sets the default values.
     * @return a void
     */
    public WorkbookOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookOperation
     */
    @javax.annotation.Nonnull
    public static WorkbookOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookOperation();
    }
    /**
     * Gets the error property value. The error returned by the operation.
     * @return a workbookOperationError
     */
    @javax.annotation.Nullable
    public WorkbookOperationError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(WorkbookOperationError::createFromDiscriminatorValue)); });
            this.put("resourceLocation", (n) -> { currentObject.setResourceLocation(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(WorkbookOperationStatus.class)); });
        }};
    }
    /**
     * Gets the resourceLocation property value. The resource URI for the result.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceLocation() {
        return this._resourceLocation;
    }
    /**
     * Gets the status property value. The current status of the operation. Possible values are: notStarted, running, succeeded, failed.
     * @return a workbookOperationStatus
     */
    @javax.annotation.Nullable
    public WorkbookOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the error property value. The error returned by the operation.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final WorkbookOperationError value) {
        this._error = value;
    }
    /**
     * Sets the resourceLocation property value. The resource URI for the result.
     * @param value Value to set for the resourceLocation property.
     * @return a void
     */
    public void setResourceLocation(@javax.annotation.Nullable final String value) {
        this._resourceLocation = value;
    }
    /**
     * Sets the status property value. The current status of the operation. Possible values are: notStarted, running, succeeded, failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final WorkbookOperationStatus value) {
        this._status = value;
    }
}
