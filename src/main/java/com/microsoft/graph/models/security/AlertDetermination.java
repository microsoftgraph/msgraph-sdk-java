package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AlertDetermination implements ValuedEnum {
    Unknown("unknown"),
    Apt("apt"),
    Malware("malware"),
    SecurityPersonnel("securityPersonnel"),
    SecurityTesting("securityTesting"),
    UnwantedSoftware("unwantedSoftware"),
    Other("other"),
    MultiStagedAttack("multiStagedAttack"),
    CompromisedAccount("compromisedAccount"),
    Phishing("phishing"),
    MaliciousUserActivity("maliciousUserActivity"),
    NotMalicious("notMalicious"),
    NotEnoughDataToValidate("notEnoughDataToValidate"),
    ConfirmedActivity("confirmedActivity"),
    LineOfBusinessApplication("lineOfBusinessApplication"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AlertDetermination(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertDetermination forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "apt": return Apt;
            case "malware": return Malware;
            case "securityPersonnel": return SecurityPersonnel;
            case "securityTesting": return SecurityTesting;
            case "unwantedSoftware": return UnwantedSoftware;
            case "other": return Other;
            case "multiStagedAttack": return MultiStagedAttack;
            case "compromisedAccount": return CompromisedAccount;
            case "phishing": return Phishing;
            case "maliciousUserActivity": return MaliciousUserActivity;
            case "notMalicious": return NotMalicious;
            case "notEnoughDataToValidate": return NotEnoughDataToValidate;
            case "confirmedActivity": return ConfirmedActivity;
            case "lineOfBusinessApplication": return LineOfBusinessApplication;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
