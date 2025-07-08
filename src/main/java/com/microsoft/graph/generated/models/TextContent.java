package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TextContent extends ContentBase implements Parsable {
    /**
     * Instantiates a new {@link TextContent} and sets the default values.
     */
    public TextContent() {
        super();
        this.setOdataType("#microsoft.graph.textContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TextContent}
     */
    @jakarta.annotation.Nonnull
    public static TextContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TextContent();
    }
    /**
     * Gets the data property value. The text content data. Inherits properties from contentBase.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getData() {
        return this.backingStore.get("data");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("data", (n) -> { this.setData(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("data", this.getData());
    }
    /**
     * Sets the data property value. The text content data. Inherits properties from contentBase.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("data", value);
    }
}
