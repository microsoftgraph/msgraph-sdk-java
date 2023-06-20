package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookOperation extends Entity implements Parsable {
    /** The error returned by the operation. */
    private WorkbookOperationError error;
    /** The resource URI for the result. */
    private String resourceLocation;
    /** The status property */
    private WorkbookOperationStatus status;
    /**
     * Instantiates a new workbookOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(WorkbookOperationError::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(WorkbookOperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceLocation property value. The resource URI for the result.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceLocation() {
        return this.resourceLocation;
    }
    /**
     * Gets the status property value. The status property
     * @return a WorkbookOperationStatus
     */
    @javax.annotation.Nullable
    public WorkbookOperationStatus getStatus() {
        return this.status;
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
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the error property value. The error returned by the operation.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final WorkbookOperationError value) {
        this.error = value;
    }
    /**
     * Sets the resourceLocation property value. The resource URI for the result.
     * @param value Value to set for the resourceLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceLocation(@javax.annotation.Nullable final String value) {
        this.resourceLocation = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final WorkbookOperationStatus value) {
        this.status = value;
    }
}
