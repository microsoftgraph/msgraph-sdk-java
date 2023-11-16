package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkHostedContent extends Entity implements Parsable {
    /**
     * Instantiates a new TeamworkHostedContent and sets the default values.
     */
    public TeamworkHostedContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkHostedContent
     */
    @jakarta.annotation.Nonnull
    public static TeamworkHostedContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.chatMessageHostedContent": return new ChatMessageHostedContent();
            }
        }
        return new TeamworkHostedContent();
    }
    /**
     * Gets the contentBytes property value. Write only. Bytes for the hosted content (such as images).
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContentBytes() {
        return this.BackingStore.get("contentBytes");
    }
    /**
     * Gets the contentType property value. Write only. Content type. such as image/png, image/jpg.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.BackingStore.get("contentType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentBytes", (n) -> { this.setContentBytes(n.getByteArrayValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("contentBytes", this.getContentBytes());
        writer.writeStringValue("contentType", this.getContentType());
    }
    /**
     * Sets the contentBytes property value. Write only. Bytes for the hosted content (such as images).
     * @param value Value to set for the contentBytes property.
     */
    public void setContentBytes(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("contentBytes", value);
    }
    /**
     * Sets the contentType property value. Write only. Content type. such as image/png, image/jpg.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("contentType", value);
    }
}
