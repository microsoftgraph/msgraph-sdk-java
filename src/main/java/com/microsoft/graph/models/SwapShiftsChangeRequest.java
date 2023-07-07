package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SwapShiftsChangeRequest extends OfferShiftRequest implements Parsable {
    /**
     * ShiftId for the recipient user with whom the request is to swap.
     */
    private String recipientShiftId;
    /**
     * Instantiates a new SwapShiftsChangeRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SwapShiftsChangeRequest() {
        super();
        this.setOdataType("#microsoft.graph.swapShiftsChangeRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SwapShiftsChangeRequest
     */
    @javax.annotation.Nonnull
    public static SwapShiftsChangeRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SwapShiftsChangeRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recipientShiftId", (n) -> { this.setRecipientShiftId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recipientShiftId property value. ShiftId for the recipient user with whom the request is to swap.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientShiftId() {
        return this.recipientShiftId;
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
        writer.writeStringValue("recipientShiftId", this.getRecipientShiftId());
    }
    /**
     * Sets the recipientShiftId property value. ShiftId for the recipient user with whom the request is to swap.
     * @param value Value to set for the recipientShiftId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientShiftId(@javax.annotation.Nullable final String value) {
        this.recipientShiftId = value;
    }
}
