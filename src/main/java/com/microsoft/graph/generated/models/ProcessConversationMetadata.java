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
     * Gets the accessedResources_v2 property value. The accessedResources_v2 property
     * @return a {@link java.util.List<ResourceAccessDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceAccessDetail> getAccessedResourcesV2() {
        return this.backingStore.get("accessedResourcesV2");
    }
    /**
     * Gets the agents property value. The agents property
     * @return a {@link java.util.List<AiAgentInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiAgentInfo> getAgents() {
        return this.backingStore.get("agents");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessedResources", (n) -> { this.setAccessedResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("accessedResources_v2", (n) -> { this.setAccessedResourcesV2(n.getCollectionOfObjectValues(ResourceAccessDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("agents", (n) -> { this.setAgents(n.getCollectionOfObjectValues(AiAgentInfo::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("accessedResources_v2", this.getAccessedResourcesV2());
        writer.writeCollectionOfObjectValues("agents", this.getAgents());
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
     * Sets the accessedResources_v2 property value. The accessedResources_v2 property
     * @param value Value to set for the accessedResources_v2 property.
     */
    public void setAccessedResourcesV2(@jakarta.annotation.Nullable final java.util.List<ResourceAccessDetail> value) {
        this.backingStore.set("accessedResourcesV2", value);
    }
    /**
     * Sets the agents property value. The agents property
     * @param value Value to set for the agents property.
     */
    public void setAgents(@jakarta.annotation.Nullable final java.util.List<AiAgentInfo> value) {
        this.backingStore.set("agents", value);
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
