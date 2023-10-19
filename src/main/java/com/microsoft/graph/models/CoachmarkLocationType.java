package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CoachmarkLocationType implements ValuedEnum {
    Unknown("unknown"),
    FromEmail("fromEmail"),
    Subject("subject"),
    ExternalTag("externalTag"),
    DisplayName("displayName"),
    MessageBody("messageBody"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CoachmarkLocationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CoachmarkLocationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "fromEmail": return FromEmail;
            case "subject": return Subject;
            case "externalTag": return ExternalTag;
            case "displayName": return DisplayName;
            case "messageBody": return MessageBody;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
