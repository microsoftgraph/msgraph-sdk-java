package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RichLongRunningOperation extends LongRunningOperation implements Parsable {
    /**
     * Error that caused the operation to fail.
     */
    private PublicError error;
    /**
     * A value between 0 and 100 that indicates the progress of the operation.
     */
    private Integer percentageComplete;
    /**
     * The unique identifier for the result.
     */
    private String resourceId;
    /**
     * The type of the operation.
     */
    private String type;
    /**
     * Instantiates a new richLongRunningOperation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RichLongRunningOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a richLongRunningOperation
     */
    @jakarta.annotation.Nonnull
    public static RichLongRunningOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RichLongRunningOperation();
    }
    /**
     * Gets the error property value. Error that caused the operation to fail.
     * @return a publicError
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @jakarta.annotation.Nullable
    public Integer getPercentageComplete() {
        return this.percentageComplete;
    }
    /**
     * Gets the resourceId property value. The unique identifier for the result.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Gets the type property value. The type of the operation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.error = value;
    }
    /**
     * Sets the percentageComplete property value. A value between 0 and 100 that indicates the progress of the operation.
     * @param value Value to set for the percentageComplete property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPercentageComplete(@jakarta.annotation.Nullable final Integer value) {
        this.percentageComplete = value;
    }
    /**
     * Sets the resourceId property value. The unique identifier for the result.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.resourceId = value;
    }
    /**
     * Sets the type property value. The type of the operation.
     * @param value Value to set for the type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
