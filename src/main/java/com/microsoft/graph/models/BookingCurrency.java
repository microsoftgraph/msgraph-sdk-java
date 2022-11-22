package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingCurrency extends Entity implements Parsable {
    /** The currency symbol. For example, the currency symbol for the US dollar and for the Australian dollar is $. */
    private String _symbol;
    /**
     * Instantiates a new BookingCurrency and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingCurrency() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingCurrency
     */
    @javax.annotation.Nonnull
    public static BookingCurrency createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCurrency();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("symbol", (n) -> { this.setSymbol(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the symbol property value. The currency symbol. For example, the currency symbol for the US dollar and for the Australian dollar is $.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSymbol() {
        return this._symbol;
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
        writer.writeStringValue("symbol", this.getSymbol());
    }
    /**
     * Sets the symbol property value. The currency symbol. For example, the currency symbol for the US dollar and for the Australian dollar is $.
     * @param value Value to set for the symbol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSymbol(@javax.annotation.Nullable final String value) {
        this._symbol = value;
    }
}
