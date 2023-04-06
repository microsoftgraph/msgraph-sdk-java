package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WebsiteType implements ValuedEnum {
    Other("other"),
    Home("home"),
    Work("work"),
    Blog("blog"),
    Profile("profile");
    public final String value;
    WebsiteType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WebsiteType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "other": return Other;
            case "home": return Home;
            case "work": return Work;
            case "blog": return Blog;
            case "profile": return Profile;
            default: return null;
        }
    }
}
