package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Web Browser Cookie Settings.
 */
public enum WebBrowserCookieSettings implements ValuedEnum {
    /** Browser default value, no intent. */
    BrowserDefault("browserDefault"),
    /** Always block cookies. */
    BlockAlways("blockAlways"),
    /** Allow cookies from current Web site. */
    AllowCurrentWebSite("allowCurrentWebSite"),
    /** Allow Cookies from websites visited. */
    AllowFromWebsitesVisited("allowFromWebsitesVisited"),
    /** Always allow cookies. */
    AllowAlways("allowAlways");
    public final String value;
    WebBrowserCookieSettings(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WebBrowserCookieSettings forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "browserDefault": return BrowserDefault;
            case "blockAlways": return BlockAlways;
            case "allowCurrentWebSite": return AllowCurrentWebSite;
            case "allowFromWebsitesVisited": return AllowFromWebsitesVisited;
            case "allowAlways": return AllowAlways;
            default: return null;
        }
    }
}
