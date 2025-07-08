package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LabelContentRight extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LabelContentRight} and sets the default values.
     */
    public LabelContentRight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LabelContentRight}
     */
    @jakarta.annotation.Nonnull
    public static LabelContentRight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LabelContentRight();
    }
    /**
     * Gets the cid property value. The content identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCid() {
        return this.backingStore.get("cid");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cid", (n) -> { this.setCid(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The content format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cid", this.getCid());
        writer.writeStringValue("format", this.getFormat());
    }
    /**
     * Sets the cid property value. The content identifier.
     * @param value Value to set for the cid property.
     */
    public void setCid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cid", value);
    }
    /**
     * Sets the format property value. The content format.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("format", value);
    }
}
