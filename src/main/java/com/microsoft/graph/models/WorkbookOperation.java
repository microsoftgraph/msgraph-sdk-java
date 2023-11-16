package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookOperation extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookOperation and sets the default values.
     */
    public WorkbookOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookOperation
     */
    @jakarta.annotation.Nonnull
    public static WorkbookOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookOperation();
    }
    /**
     * Gets the error property value. The error returned by the operation.
     * @return a WorkbookOperationError
     */
    @jakarta.annotation.Nullable
    public WorkbookOperationError getError() {
        return this.BackingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(WorkbookOperationError::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(WorkbookOperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceLocation property value. The resource URI for the result.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceLocation() {
        return this.BackingStore.get("resourceLocation");
    }
    /**
     * Gets the status property value. The status property
     * @return a WorkbookOperationStatus
     */
    @jakarta.annotation.Nullable
    public WorkbookOperationStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the error property value. The error returned by the operation.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final WorkbookOperationError value) {
        this.BackingStore.set("error", value);
    }
    /**
     * Sets the resourceLocation property value. The resource URI for the result.
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceLocation", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final WorkbookOperationStatus value) {
        this.BackingStore.set("status", value);
    }
}
