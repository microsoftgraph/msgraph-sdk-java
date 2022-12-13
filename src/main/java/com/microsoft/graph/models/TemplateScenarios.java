package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum TemplateScenarios implements ValuedEnum {
    New_escaped("new_escaped"),
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TemplateScenarios forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "new": return New_escaped;
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
