package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TemplateScenarios implements ValuedEnum {
    New("new"),
    SecureFoundation("secureFoundation"),
    ZeroTrust("zeroTrust"),
    RemoteWork("remoteWork"),
    ProtectAdmins("protectAdmins"),
    EmergingThreats("emergingThreats"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TemplateScenarios(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TemplateScenarios forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "new": return New;
            case "secureFoundation": return SecureFoundation;
            case "zeroTrust": return ZeroTrust;
            case "remoteWork": return RemoteWork;
            case "protectAdmins": return ProtectAdmins;
            case "emergingThreats": return EmergingThreats;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
