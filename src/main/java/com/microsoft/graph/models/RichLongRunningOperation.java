package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RichLongRunningOperation extends LongRunningOperation implements Parsable {
    /** Error that caused the operation to fail. */
    private PublicError _error;
    /** A value between 0 and 100 that indicates the progress of the operation. */
    private Integer _percentageComplete;
    /** The unique identifier for the result. */
    private String _resourceId;
    /** The type of the operation. */
    private String _type;
    /**
     * Instantiates a new RichLongRunningOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RichLongRunningOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RichLongRunningOperation
     */
    @javax.annotation.Nonnull
    public static RichLongRunningOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RichLongRunningOperation();
    }
    /**
     * Gets the error property value. Error that caused the operation to fail.
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
        deserializerMap.put("percentageComplete", (n) -> { this.setPercentageComplete(n.getIntegerValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentageComplete property value. A value between 0 and 100 that indicates the progress of the operation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentageComplete() {
        return this._percentageComplete;
    }
    /**
     * Gets the resourceId property value. The unique identifier for the result.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the type property value. The type of the operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
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
        writer.writeIntegerValue("percentageComplete", this.getPercentageComplete());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the error property value. Error that caused the operation to fail.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final PublicError value) {
        this._error = value;
    }
    /**
     * Sets the percentageComplete property value. A value between 0 and 100 that indicates the progress of the operation.
     * @param value Value to set for the percentageComplete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentageComplete(@javax.annotation.Nullable final Integer value) {
        this._percentageComplete = value;
    }
    /**
     * Sets the resourceId property value. The unique identifier for the result.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the type property value. The type of the operation.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
