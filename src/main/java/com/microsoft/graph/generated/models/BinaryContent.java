package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BinaryContent extends ContentBase implements Parsable {
    /**
     * Instantiates a new {@link BinaryContent} and sets the default values.
     */
    public BinaryContent() {
        super();
        this.setOdataType("#microsoft.graph.binaryContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BinaryContent}
     */
    @jakarta.annotation.Nonnull
    public static BinaryContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BinaryContent();
    }
    /**
     * Gets the data property value. The binary content, encoded as a Base64 string. Inherited from contentBase.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getData() {
        return this.backingStore.get("data");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("data", (n) -> { this.setData(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("data", this.getData());
    }
    /**
     * Sets the data property value. The binary content, encoded as a Base64 string. Inherited from contentBase.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("data", value);
    }
}
