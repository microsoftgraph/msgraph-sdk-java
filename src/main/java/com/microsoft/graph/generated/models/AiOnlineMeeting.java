package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiOnlineMeeting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiOnlineMeeting} and sets the default values.
     */
    public AiOnlineMeeting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiOnlineMeeting}
     */
    @jakarta.annotation.Nonnull
    public static AiOnlineMeeting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiOnlineMeeting();
    }
    /**
     * Gets the aiInsights property value. The aiInsights property
     * @return a {@link java.util.List<CallAiInsight>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallAiInsight> getAiInsights() {
        return this.backingStore.get("aiInsights");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aiInsights", (n) -> { this.setAiInsights(n.getCollectionOfObjectValues(CallAiInsight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("aiInsights", this.getAiInsights());
    }
    /**
     * Sets the aiInsights property value. The aiInsights property
     * @param value Value to set for the aiInsights property.
     */
    public void setAiInsights(@jakarta.annotation.Nullable final java.util.List<CallAiInsight> value) {
        this.backingStore.set("aiInsights", value);
    }
}
