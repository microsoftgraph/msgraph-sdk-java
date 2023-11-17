package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingCurrency extends Entity implements Parsable {
    /**
     * Instantiates a new BookingCurrency and sets the default values.
     */
    public BookingCurrency() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingCurrency
     */
    @jakarta.annotation.Nonnull
    public static BookingCurrency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCurrency();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("symbol", (n) -> { this.setSymbol(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the symbol property value. The currency symbol. For example, the currency symbol for the US dollar and for the Australian dollar is $.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSymbol() {
        return this.backingStore.get("symbol");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("symbol", this.getSymbol());
    }
    /**
     * Sets the symbol property value. The currency symbol. For example, the currency symbol for the US dollar and for the Australian dollar is $.
     * @param value Value to set for the symbol property.
     */
    public void setSymbol(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("symbol", value);
    }
}
