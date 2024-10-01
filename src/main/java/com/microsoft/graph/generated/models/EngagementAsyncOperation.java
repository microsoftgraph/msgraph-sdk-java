package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents the status of a Viva Engage async operation that is an operation that transcends thelifetime of a single API request. These operations are long-running or too expensive to completewithin the time frame of their original request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EngagementAsyncOperation extends LongRunningOperation implements Parsable {
    /**
     * Instantiates a new {@link EngagementAsyncOperation} and sets the default values.
     */
    public EngagementAsyncOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EngagementAsyncOperation}
     */
    @jakarta.annotation.Nonnull
    public static EngagementAsyncOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EngagementAsyncOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(EngagementAsyncOperationType::forValue)); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the operationType property value. The type of the long-running operation. The possible values are: createCommunity, unknownFutureValue.
     * @return a {@link EngagementAsyncOperationType}
     */
    @jakarta.annotation.Nullable
    public EngagementAsyncOperationType getOperationType() {
        return this.backingStore.get("operationType");
    }
    /**
     * Gets the resourceId property value. The ID of the object created or modified as a result of this async operation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeStringValue("resourceId", this.getResourceId());
    }
    /**
     * Sets the operationType property value. The type of the long-running operation. The possible values are: createCommunity, unknownFutureValue.
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final EngagementAsyncOperationType value) {
        this.backingStore.set("operationType", value);
    }
    /**
     * Sets the resourceId property value. The ID of the object created or modified as a result of this async operation.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
}
