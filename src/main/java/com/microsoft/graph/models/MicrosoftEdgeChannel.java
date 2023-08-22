package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The enum to specify the channels for Microsoft Edge apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MicrosoftEdgeChannel implements ValuedEnum {
    /** The Dev Channel is intended to help you plan and develop with the latest capabilities of Microsoft Edge. */
    Dev("dev"),
    /** The Beta Channel is intended for production deployment to a representative sample set of users. New features ship about every 4 weeks. Security and quality updates ship as needed. */
    Beta("beta"),
    /** The Stable Channel is intended for broad deployment within organizations, and it's the channel that most users should be on. New features ship about every 4 weeks. Security and quality updates ship as needed. */
    Stable("stable"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MicrosoftEdgeChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MicrosoftEdgeChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dev": return Dev;
            case "beta": return Beta;
            case "stable": return Stable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
