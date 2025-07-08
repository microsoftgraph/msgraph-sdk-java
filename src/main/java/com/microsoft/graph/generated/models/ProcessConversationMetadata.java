package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProcessConversationMetadata extends ProcessContentMetadataBase implements Parsable {
    /**
     * Instantiates a new {@link ProcessConversationMetadata} and sets the default values.
     */
    public ProcessConversationMetadata() {
        super();
        this.setOdataType("#microsoft.graph.processConversationMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessConversationMetadata}
     */
    @jakarta.annotation.Nonnull
    public static ProcessConversationMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessConversationMetadata();
    }
    /**
     * Gets the accessedResources property value. List of resources (for example, file URLs, web URLs) accessed during the generation of this message (relevant for bot interactions).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAccessedResources() {
        return this.backingStore.get("accessedResources");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessedResources", (n) -> { this.setAccessedResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("parentMessageId", (n) -> { this.setParentMessageId(n.getStringValue()); });
        deserializerMap.put("plugins", (n) -> { this.setPlugins(n.getCollectionOfObjectValues(AiInteractionPlugin::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the parentMessageId property value. Identifier of the parent message in a threaded conversation, if applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentMessageId() {
        return this.backingStore.get("parentMessageId");
    }
    /**
     * Gets the plugins property value. List of plugins used during the generation of this message (relevant for AI/bot interactions).
     * @return a {@link java.util.List<AiInteractionPlugin>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiInteractionPlugin> getPlugins() {
        return this.backingStore.get("plugins");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("accessedResources", this.getAccessedResources());
        writer.writeStringValue("parentMessageId", this.getParentMessageId());
        writer.writeCollectionOfObjectValues("plugins", this.getPlugins());
    }
    /**
     * Sets the accessedResources property value. List of resources (for example, file URLs, web URLs) accessed during the generation of this message (relevant for bot interactions).
     * @param value Value to set for the accessedResources property.
     */
    public void setAccessedResources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("accessedResources", value);
    }
    /**
     * Sets the parentMessageId property value. Identifier of the parent message in a threaded conversation, if applicable.
     * @param value Value to set for the parentMessageId property.
     */
    public void setParentMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentMessageId", value);
    }
    /**
     * Sets the plugins property value. List of plugins used during the generation of this message (relevant for AI/bot interactions).
     * @param value Value to set for the plugins property.
     */
    public void setPlugins(@jakarta.annotation.Nullable final java.util.List<AiInteractionPlugin> value) {
        this.backingStore.set("plugins", value);
    }
}
