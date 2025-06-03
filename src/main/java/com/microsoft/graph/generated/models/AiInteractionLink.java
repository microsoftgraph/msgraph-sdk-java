package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiInteractionLink extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiInteractionLink} and sets the default values.
     */
    public AiInteractionLink() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiInteractionLink}
     */
    @jakarta.annotation.Nonnull
    public static AiInteractionLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiInteractionLink();
    }
    /**
     * Gets the displayName property value. The name of the link.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("linkType", (n) -> { this.setLinkType(n.getStringValue()); });
        deserializerMap.put("linkUrl", (n) -> { this.setLinkUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the linkType property value. Information about a link in an app chat or Business Chat (BizChat) interaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkType() {
        return this.backingStore.get("linkType");
    }
    /**
     * Gets the linkUrl property value. The URL of the link.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkUrl() {
        return this.backingStore.get("linkUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("linkType", this.getLinkType());
        writer.writeStringValue("linkUrl", this.getLinkUrl());
    }
    /**
     * Sets the displayName property value. The name of the link.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the linkType property value. Information about a link in an app chat or Business Chat (BizChat) interaction.
     * @param value Value to set for the linkType property.
     */
    public void setLinkType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("linkType", value);
    }
    /**
     * Sets the linkUrl property value. The URL of the link.
     * @param value Value to set for the linkUrl property.
     */
    public void setLinkUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("linkUrl", value);
    }
}
