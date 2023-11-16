package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SwapShiftsChangeRequest extends OfferShiftRequest implements Parsable {
    /**
     * Instantiates a new SwapShiftsChangeRequest and sets the default values.
     */
    public SwapShiftsChangeRequest() {
        super();
        this.setOdataType("#microsoft.graph.swapShiftsChangeRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SwapShiftsChangeRequest
     */
    @jakarta.annotation.Nonnull
    public static SwapShiftsChangeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SwapShiftsChangeRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recipientShiftId", (n) -> { this.setRecipientShiftId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recipientShiftId property value. ShiftId for the recipient user with whom the request is to swap.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecipientShiftId() {
        return this.BackingStore.get("recipientShiftId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("recipientShiftId", this.getRecipientShiftId());
    }
    /**
     * Sets the recipientShiftId property value. ShiftId for the recipient user with whom the request is to swap.
     * @param value Value to set for the recipientShiftId property.
     */
    public void setRecipientShiftId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("recipientShiftId", value);
    }
}
