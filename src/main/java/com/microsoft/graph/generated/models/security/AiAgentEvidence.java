package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AiAgentEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link AiAgentEvidence} and sets the default values.
     */
    public AiAgentEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.aiAgentEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AiAgentEvidence}
     */
    @jakarta.annotation.Nonnull
    public static AiAgentEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AiAgentEvidence();
    }
    /**
     * Gets the agentId property value. The unique identifier for the AI agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentId() {
        return this.backingStore.get("agentId");
    }
    /**
     * Gets the agentName property value. The display name for the AI agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentName() {
        return this.backingStore.get("agentName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentId", (n) -> { this.setAgentId(n.getStringValue()); });
        deserializerMap.put("agentName", (n) -> { this.setAgentName(n.getStringValue()); });
        deserializerMap.put("hostingPlatformType", (n) -> { this.setHostingPlatformType(n.getEnumValue(AiAgentPlatform::forValue)); });
        deserializerMap.put("instructions", (n) -> { this.setInstructions(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostingPlatformType property value. Type of the platform the agent runs on. The possible values are: unknown, azureAIFoundry, copilotStudio, copilot, unknownFutureValue.
     * @return a {@link AiAgentPlatform}
     */
    @jakarta.annotation.Nullable
    public AiAgentPlatform getHostingPlatformType() {
        return this.backingStore.get("hostingPlatformType");
    }
    /**
     * Gets the instructions property value. The instructions of the agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstructions() {
        return this.backingStore.get("instructions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agentId", this.getAgentId());
        writer.writeStringValue("agentName", this.getAgentName());
        writer.writeEnumValue("hostingPlatformType", this.getHostingPlatformType());
        writer.writeStringValue("instructions", this.getInstructions());
    }
    /**
     * Sets the agentId property value. The unique identifier for the AI agent.
     * @param value Value to set for the agentId property.
     */
    public void setAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentId", value);
    }
    /**
     * Sets the agentName property value. The display name for the AI agent.
     * @param value Value to set for the agentName property.
     */
    public void setAgentName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentName", value);
    }
    /**
     * Sets the hostingPlatformType property value. Type of the platform the agent runs on. The possible values are: unknown, azureAIFoundry, copilotStudio, copilot, unknownFutureValue.
     * @param value Value to set for the hostingPlatformType property.
     */
    public void setHostingPlatformType(@jakarta.annotation.Nullable final AiAgentPlatform value) {
        this.backingStore.set("hostingPlatformType", value);
    }
    /**
     * Sets the instructions property value. The instructions of the agent.
     * @param value Value to set for the instructions property.
     */
    public void setInstructions(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("instructions", value);
    }
}
