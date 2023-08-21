package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Allows IT admind to set a predefined default search engine for MDM-Controlled devices
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EdgeSearchEngineType implements ValuedEnum {
    /** Uses factory settings of Edge to assign the default search engine as per the user market */
    Default("default"),
    /** Sets Bing as the default search engine */
    Bing("bing");
    public final String value;
    EdgeSearchEngineType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EdgeSearchEngineType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "bing": return Bing;
            default: return null;
        }
    }
}
