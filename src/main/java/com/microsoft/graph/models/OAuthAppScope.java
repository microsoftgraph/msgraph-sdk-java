package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OAuthAppScope implements ValuedEnum {
    Unknown("unknown"),
    ReadCalendar("readCalendar"),
    ReadContact("readContact"),
    ReadMail("readMail"),
    ReadAllChat("readAllChat"),
    ReadAllFile("readAllFile"),
    ReadAndWriteMail("readAndWriteMail"),
    SendMail("sendMail"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OAuthAppScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OAuthAppScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "readCalendar": return ReadCalendar;
            case "readContact": return ReadContact;
            case "readMail": return ReadMail;
            case "readAllChat": return ReadAllChat;
            case "readAllFile": return ReadAllFile;
            case "readAndWriteMail": return ReadAndWriteMail;
            case "sendMail": return SendMail;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
