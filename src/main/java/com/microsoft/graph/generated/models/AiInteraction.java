package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiInteraction extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiInteraction} and sets the default values.
     */
    public AiInteraction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiInteraction}
     */
    @jakarta.annotation.Nonnull
    public static AiInteraction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiInteraction();
    }
    /**
     * Gets the appClass property value. The appClass property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppClass() {
        return this.backingStore.get("appClass");
    }
    /**
     * Gets the attachments property value. The attachments property
     * @return a {@link java.util.List<AiInteractionAttachment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiInteractionAttachment> getAttachments() {
        return this.backingStore.get("attachments");
    }
    /**
     * Gets the body property value. The body property
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.backingStore.get("body");
    }
    /**
     * Gets the contexts property value. The contexts property
     * @return a {@link java.util.List<AiInteractionContext>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiInteractionContext> getContexts() {
        return this.backingStore.get("contexts");
    }
    /**
     * Gets the conversationType property value. The conversationType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationType() {
        return this.backingStore.get("conversationType");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the etag property value. The etag property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEtag() {
        return this.backingStore.get("etag");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appClass", (n) -> { this.setAppClass(n.getStringValue()); });
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(AiInteractionAttachment::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("contexts", (n) -> { this.setContexts(n.getCollectionOfObjectValues(AiInteractionContext::createFromDiscriminatorValue)); });
        deserializerMap.put("conversationType", (n) -> { this.setConversationType(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("etag", (n) -> { this.setEtag(n.getStringValue()); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("interactionType", (n) -> { this.setInteractionType(n.getEnumValue(AiInteractionType::forValue)); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(AiInteractionLink::createFromDiscriminatorValue)); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("mentions", (n) -> { this.setMentions(n.getCollectionOfObjectValues(AiInteractionMention::createFromDiscriminatorValue)); });
        deserializerMap.put("requestId", (n) -> { this.setRequestId(n.getStringValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. The from property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getFrom() {
        return this.backingStore.get("from");
    }
    /**
     * Gets the interactionType property value. The interactionType property
     * @return a {@link AiInteractionType}
     */
    @jakarta.annotation.Nullable
    public AiInteractionType getInteractionType() {
        return this.backingStore.get("interactionType");
    }
    /**
     * Gets the links property value. The links property
     * @return a {@link java.util.List<AiInteractionLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiInteractionLink> getLinks() {
        return this.backingStore.get("links");
    }
    /**
     * Gets the locale property value. The locale property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
    }
    /**
     * Gets the mentions property value. The mentions property
     * @return a {@link java.util.List<AiInteractionMention>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AiInteractionMention> getMentions() {
        return this.backingStore.get("mentions");
    }
    /**
     * Gets the requestId property value. The requestId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return this.backingStore.get("requestId");
    }
    /**
     * Gets the sessionId property value. The sessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.backingStore.get("sessionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appClass", this.getAppClass());
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeObjectValue("body", this.getBody());
        writer.writeCollectionOfObjectValues("contexts", this.getContexts());
        writer.writeStringValue("conversationType", this.getConversationType());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("etag", this.getEtag());
        writer.writeObjectValue("from", this.getFrom());
        writer.writeEnumValue("interactionType", this.getInteractionType());
        writer.writeCollectionOfObjectValues("links", this.getLinks());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeCollectionOfObjectValues("mentions", this.getMentions());
        writer.writeStringValue("requestId", this.getRequestId());
        writer.writeStringValue("sessionId", this.getSessionId());
    }
    /**
     * Sets the appClass property value. The appClass property
     * @param value Value to set for the appClass property.
     */
    public void setAppClass(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appClass", value);
    }
    /**
     * Sets the attachments property value. The attachments property
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<AiInteractionAttachment> value) {
        this.backingStore.set("attachments", value);
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("body", value);
    }
    /**
     * Sets the contexts property value. The contexts property
     * @param value Value to set for the contexts property.
     */
    public void setContexts(@jakarta.annotation.Nullable final java.util.List<AiInteractionContext> value) {
        this.backingStore.set("contexts", value);
    }
    /**
     * Sets the conversationType property value. The conversationType property
     * @param value Value to set for the conversationType property.
     */
    public void setConversationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conversationType", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the etag property value. The etag property
     * @param value Value to set for the etag property.
     */
    public void setEtag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("etag", value);
    }
    /**
     * Sets the from property value. The from property
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("from", value);
    }
    /**
     * Sets the interactionType property value. The interactionType property
     * @param value Value to set for the interactionType property.
     */
    public void setInteractionType(@jakarta.annotation.Nullable final AiInteractionType value) {
        this.backingStore.set("interactionType", value);
    }
    /**
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final java.util.List<AiInteractionLink> value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the locale property value. The locale property
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locale", value);
    }
    /**
     * Sets the mentions property value. The mentions property
     * @param value Value to set for the mentions property.
     */
    public void setMentions(@jakarta.annotation.Nullable final java.util.List<AiInteractionMention> value) {
        this.backingStore.set("mentions", value);
    }
    /**
     * Sets the requestId property value. The requestId property
     * @param value Value to set for the requestId property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestId", value);
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sessionId", value);
    }
}
