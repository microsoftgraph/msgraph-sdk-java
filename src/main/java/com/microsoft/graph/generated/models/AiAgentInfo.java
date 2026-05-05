package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiAgentInfo extends AiInteractionEntity implements Parsable {
    /**
     * Instantiates a new {@link AiAgentInfo} and sets the default values.
     */
    public AiAgentInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiAgentInfo}
     */
    @jakarta.annotation.Nonnull
    public static AiAgentInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiAgentInfo();
    }
    /**
     * Gets the blueprintId property value. The unique identifier of the parent agent blueprint that defines the identity and configuration of this agent instance. This identifier is provided by Microsoft Entra.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBlueprintId() {
        return this.backingStore.get("blueprintId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blueprintId", (n) -> { this.setBlueprintId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("blueprintId", this.getBlueprintId());
    }
    /**
     * Sets the blueprintId property value. The unique identifier of the parent agent blueprint that defines the identity and configuration of this agent instance. This identifier is provided by Microsoft Entra.
     * @param value Value to set for the blueprintId property.
     */
    public void setBlueprintId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("blueprintId", value);
    }
}
