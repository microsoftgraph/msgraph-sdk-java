package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendDtmfTonesOperation extends CommsOperation implements Parsable {
    /**
     * Instantiates a new SendDtmfTonesOperation and sets the default values.
     */
    public SendDtmfTonesOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SendDtmfTonesOperation
     */
    @jakarta.annotation.Nonnull
    public static SendDtmfTonesOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendDtmfTonesOperation();
    }
    /**
     * Gets the completionReason property value. The completionReason property
     * @return a SendDtmfTonesOperationCompletionReason
     */
    @jakarta.annotation.Nullable
    public SendDtmfTonesOperationCompletionReason getCompletionReason() {
        return this.backingStore.get("completionReason");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionReason", (n) -> { this.setCompletionReason(n.getEnumValue(SendDtmfTonesOperationCompletionReason::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("completionReason", this.getCompletionReason());
    }
    /**
     * Sets the completionReason property value. The completionReason property
     * @param value Value to set for the completionReason property.
     */
    public void setCompletionReason(@jakarta.annotation.Nullable final SendDtmfTonesOperationCompletionReason value) {
        this.backingStore.set("completionReason", value);
    }
}
