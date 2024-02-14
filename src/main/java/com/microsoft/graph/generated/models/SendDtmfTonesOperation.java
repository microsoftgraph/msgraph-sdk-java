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
     * Instantiates a new {@link SendDtmfTonesOperation} and sets the default values.
     */
    public SendDtmfTonesOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendDtmfTonesOperation}
     */
    @jakarta.annotation.Nonnull
    public static SendDtmfTonesOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendDtmfTonesOperation();
    }
    /**
     * Gets the completionReason property value. The results of the action. Possible values are: unknown, completedSuccessfully, mediaOperationCanceled, unknownfutureValue.
     * @return a {@link SendDtmfCompletionReason}
     */
    @jakarta.annotation.Nullable
    public SendDtmfCompletionReason getCompletionReason() {
        return this.backingStore.get("completionReason");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionReason", (n) -> { this.setCompletionReason(n.getEnumValue(SendDtmfCompletionReason::forValue)); });
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
     * Sets the completionReason property value. The results of the action. Possible values are: unknown, completedSuccessfully, mediaOperationCanceled, unknownfutureValue.
     * @param value Value to set for the completionReason property.
     */
    public void setCompletionReason(@jakarta.annotation.Nullable final SendDtmfCompletionReason value) {
        this.backingStore.set("completionReason", value);
    }
}
