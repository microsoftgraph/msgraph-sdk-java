package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VerdictCategory implements ValuedEnum {
    None("none"),
    Malware("malware"),
    Phish("phish"),
    SiteUnavailable("siteUnavailable"),
    Spam("spam"),
    DecryptionFailed("decryptionFailed"),
    UnsupportedUriScheme("unsupportedUriScheme"),
    UnsupportedFileType("unsupportedFileType"),
    Undefined("undefined"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VerdictCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VerdictCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "malware": return Malware;
            case "phish": return Phish;
            case "siteUnavailable": return SiteUnavailable;
            case "spam": return Spam;
            case "decryptionFailed": return DecryptionFailed;
            case "unsupportedUriScheme": return UnsupportedUriScheme;
            case "unsupportedFileType": return UnsupportedFileType;
            case "undefined": return Undefined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
