package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TextWebPart extends WebPart implements Parsable {
    /**
     * Instantiates a new {@link TextWebPart} and sets the default values.
     */
    public TextWebPart() {
        super();
        this.setOdataType("#microsoft.graph.textWebPart");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TextWebPart}
     */
    @jakarta.annotation.Nonnull
    public static TextWebPart createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TextWebPart();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("innerHtml", (n) -> { this.setInnerHtml(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the innerHtml property value. The HTML string in text web part.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInnerHtml() {
        return this.backingStore.get("innerHtml");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("innerHtml", this.getInnerHtml());
    }
    /**
     * Sets the innerHtml property value. The HTML string in text web part.
     * @param value Value to set for the innerHtml property.
     */
    public void setInnerHtml(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("innerHtml", value);
    }
}
