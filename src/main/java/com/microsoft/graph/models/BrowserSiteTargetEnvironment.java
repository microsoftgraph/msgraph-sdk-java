package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BrowserSiteTargetEnvironment implements ValuedEnum {
    /** Open in Internet Explorer Mode */
    InternetExplorerMode("internetExplorerMode"),
    /** Open in standalone Internet Explorer 11 */
    InternetExplorer11("internetExplorer11"),
    /** Open in Microsoft Edge */
    MicrosoftEdge("microsoftEdge"),
    /** Configurable type */
    Configurable("configurable"),
    /** Open in the browser the employee chooses. */
    None("none"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowserSiteTargetEnvironment(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowserSiteTargetEnvironment forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internetExplorerMode": return InternetExplorerMode;
            case "internetExplorer11": return InternetExplorer11;
            case "microsoftEdge": return MicrosoftEdge;
            case "configurable": return Configurable;
            case "none": return None;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
