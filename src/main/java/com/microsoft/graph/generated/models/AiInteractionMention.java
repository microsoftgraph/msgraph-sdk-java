package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiInteractionMention extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiInteractionMention} and sets the default values.
     */
    public AiInteractionMention() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiInteractionMention}
     */
    @jakarta.annotation.Nonnull
    public static AiInteractionMention createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiInteractionMention();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mentioned", (n) -> { this.setMentioned(n.getObjectValue(AiInteractionMentionedIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("mentionId", (n) -> { this.setMentionId(n.getIntegerValue()); });
        deserializerMap.put("mentionText", (n) -> { this.setMentionText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mentioned property value. The entity mentioned in the message.
     * @return a {@link AiInteractionMentionedIdentitySet}
     */
    @jakarta.annotation.Nullable
    public AiInteractionMentionedIdentitySet getMentioned() {
        return this.backingStore.get("mentioned");
    }
    /**
     * Gets the mentionId property value. The identifier for the mention.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMentionId() {
        return this.backingStore.get("mentionId");
    }
    /**
     * Gets the mentionText property value. The text mentioned in the message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMentionText() {
        return this.backingStore.get("mentionText");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("mentioned", this.getMentioned());
        writer.writeIntegerValue("mentionId", this.getMentionId());
        writer.writeStringValue("mentionText", this.getMentionText());
    }
    /**
     * Sets the mentioned property value. The entity mentioned in the message.
     * @param value Value to set for the mentioned property.
     */
    public void setMentioned(@jakarta.annotation.Nullable final AiInteractionMentionedIdentitySet value) {
        this.backingStore.set("mentioned", value);
    }
    /**
     * Sets the mentionId property value. The identifier for the mention.
     * @param value Value to set for the mentionId property.
     */
    public void setMentionId(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("mentionId", value);
    }
    /**
     * Sets the mentionText property value. The text mentioned in the message.
     * @param value Value to set for the mentionText property.
     */
    public void setMentionText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mentionText", value);
    }
}
