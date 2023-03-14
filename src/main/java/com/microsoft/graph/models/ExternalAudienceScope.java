package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ExternalAudienceScope implements ValuedEnum {
    None("none"),
    ContactsOnly("contactsOnly"),
    All("all");
    public final String value;
    ExternalAudienceScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ExternalAudienceScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "contactsOnly": return ContactsOnly;
            case "all": return All;
            default: return null;
        }
    }
}
