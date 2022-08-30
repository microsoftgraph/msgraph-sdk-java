package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getMailTips method. */
public enum RecipientScopeType implements ValuedEnum {
    None("none"),
    Internal("internal"),
    External("external"),
    ExternalPartner("externalPartner"),
    ExternalNonPartner("externalNonPartner");
    public final String value;
    RecipientScopeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RecipientScopeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "internal": return Internal;
            case "external": return External;
            case "externalPartner": return ExternalPartner;
            case "externalNonPartner": return ExternalNonPartner;
            default: return null;
        }
    }
}
