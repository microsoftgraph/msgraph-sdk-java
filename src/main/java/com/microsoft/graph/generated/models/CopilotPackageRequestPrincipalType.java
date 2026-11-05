package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotPackageRequestPrincipalType implements ValuedEnum {
    /** An explicit user principal. */
    User("user"),
    /** An explicit group principal; group membership is not expanded. */
    Group("group"),
    /** An agent application identifier reported by Governance. Not assumed to be a service principal object identifier. */
    AgentApplication("agentApplication"),
    /** An agent user principal. */
    AgentUser("agentUser"),
    /** An evolvable value also used when the source principal kind is missing or unrecognized. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotPackageRequestPrincipalType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotPackageRequestPrincipalType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "agentApplication": return AgentApplication;
            case "agentUser": return AgentUser;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
