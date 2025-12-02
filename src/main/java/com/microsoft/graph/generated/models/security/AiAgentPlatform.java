package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AiAgentPlatform implements ValuedEnum {
    Unknown("unknown"),
    AzureAIFoundry("azureAIFoundry"),
    CopilotStudio("copilotStudio"),
    Copilot("copilot"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AiAgentPlatform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AiAgentPlatform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "azureAIFoundry": return AzureAIFoundry;
            case "copilotStudio": return CopilotStudio;
            case "copilot": return Copilot;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
