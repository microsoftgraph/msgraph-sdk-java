package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MailboxConfigurationType implements ValuedEnum {
    MailForwardingRule("mailForwardingRule"),
    OwaSettings("owaSettings"),
    EwsSettings("ewsSettings"),
    MailDelegation("mailDelegation"),
    UserInboxRule("userInboxRule"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MailboxConfigurationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MailboxConfigurationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mailForwardingRule": return MailForwardingRule;
            case "owaSettings": return OwaSettings;
            case "ewsSettings": return EwsSettings;
            case "mailDelegation": return MailDelegation;
            case "userInboxRule": return UserInboxRule;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
