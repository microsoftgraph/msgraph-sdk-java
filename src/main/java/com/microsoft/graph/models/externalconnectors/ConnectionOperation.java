package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.PublicError;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class ConnectionOperation extends Entity implements Parsable {
    /** If status is failed, provides more information about the error that caused the failure. */
    private PublicError _error;
    /** Indicates the status of the asynchronous operation. Possible values are: unspecified, inprogress, completed, failed, unknownFutureValue. */
    private ConnectionOperationStatus _status;
    /**
     * Instantiates a new connectionOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectionOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectionOperation
     */
    @javax.annotation.Nonnull
    public static ConnectionOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectionOperation();
    }
    /**
     * Gets the error property value. If status is failed, provides more information about the error that caused the failure.
     * @return a publicError
     */
    @javax.annotation.Nullable
    public PublicError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectionOperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. Indicates the status of the asynchronous operation. Possible values are: unspecified, inprogress, completed, failed, unknownFutureValue.
     * @return a connectionOperationStatus
     */
    @javax.annotation.Nullable
    public ConnectionOperationStatus getStatus() {
        return this._status;
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
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the error property value. If status is failed, provides more information about the error that caused the failure.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final PublicError value) {
        this._error = value;
    }
    /**
     * Sets the status property value. Indicates the status of the asynchronous operation. Possible values are: unspecified, inprogress, completed, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ConnectionOperationStatus value) {
        this._status = value;
    }
}
