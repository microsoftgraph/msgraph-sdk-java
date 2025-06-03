package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiInteractionContext extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AiInteractionContext} and sets the default values.
     */
    public AiInteractionContext() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiInteractionContext}
     */
    @jakarta.annotation.Nonnull
    public static AiInteractionContext createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiInteractionContext();
    }
    /**
     * Gets the contextReference property value. The full file URL where the interaction happened.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContextReference() {
        return this.backingStore.get("contextReference");
    }
    /**
     * Gets the contextType property value. The type of the file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContextType() {
        return this.backingStore.get("contextType");
    }
    /**
     * Gets the displayName property value. The name of the file.
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
        deserializerMap.put("contextReference", (n) -> { this.setContextReference(n.getStringValue()); });
        deserializerMap.put("contextType", (n) -> { this.setContextType(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contextReference", this.getContextReference());
        writer.writeStringValue("contextType", this.getContextType());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the contextReference property value. The full file URL where the interaction happened.
     * @param value Value to set for the contextReference property.
     */
    public void setContextReference(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contextReference", value);
    }
    /**
     * Sets the contextType property value. The type of the file.
     * @param value Value to set for the contextType property.
     */
    public void setContextType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contextType", value);
    }
    /**
     * Sets the displayName property value. The name of the file.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
