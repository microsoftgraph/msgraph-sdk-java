package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BrowserSiteCompatibilityMode implements ValuedEnum {
    /** Loads the site using default compatibility mode. */
    Default("default"),
    /** Loads the site in internetExplorer8 Enterprise Mode */
    InternetExplorer8Enterprise("internetExplorer8Enterprise"),
    /** Loads the site in internetExplorer7 Enterprise Mode */
    InternetExplorer7Enterprise("internetExplorer7Enterprise"),
    /** Loads the site in internetExplorer11 */
    InternetExplorer11("internetExplorer11"),
    /** Loads the site in internetExplorer10 */
    InternetExplorer10("internetExplorer10"),
    /** Loads the site in internetExplorer9 */
    InternetExplorer9("internetExplorer9"),
    /** Loads the site in internetExplorer8 */
    InternetExplorer8("internetExplorer8"),
    /** Loads the site in internetExplorer7 */
    InternetExplorer7("internetExplorer7"),
    /** Loads the site in internetExplorer5 */
    InternetExplorer5("internetExplorer5"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowserSiteCompatibilityMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BrowserSiteCompatibilityMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "internetExplorer8Enterprise": return InternetExplorer8Enterprise;
            case "internetExplorer7Enterprise": return InternetExplorer7Enterprise;
            case "internetExplorer11": return InternetExplorer11;
            case "internetExplorer10": return InternetExplorer10;
            case "internetExplorer9": return InternetExplorer9;
            case "internetExplorer8": return InternetExplorer8;
            case "internetExplorer7": return InternetExplorer7;
            case "internetExplorer5": return InternetExplorer5;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
