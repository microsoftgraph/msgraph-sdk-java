package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamworkApplicationIdentityType implements ValuedEnum {
    AadApplication("aadApplication"),
    Bot("bot"),
    TenantBot("tenantBot"),
    Office365Connector("office365Connector"),
    OutgoingWebhook("outgoingWebhook"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkApplicationIdentityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkApplicationIdentityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aadApplication": return AadApplication;
            case "bot": return Bot;
            case "tenantBot": return TenantBot;
            case "office365Connector": return Office365Connector;
            case "outgoingWebhook": return OutgoingWebhook;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
