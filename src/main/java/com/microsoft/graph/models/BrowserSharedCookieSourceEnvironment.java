package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BrowserSharedCookieSourceEnvironment implements ValuedEnum {
    /** Share session cookies from Microsoft Edge to Internet Explorer. */
    MicrosoftEdge("microsoftEdge"),
    /** Share session cookies from Internet Explorer to Microsoft Edge. */
    InternetExplorer11("internetExplorer11"),
    /** Share session cookies to and from Microsoft Edge and Internet Explorer. */
    Both("both"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowserSharedCookieSourceEnvironment(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowserSharedCookieSourceEnvironment forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftEdge": return MicrosoftEdge;
            case "internetExplorer11": return InternetExplorer11;
            case "both": return Both;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
