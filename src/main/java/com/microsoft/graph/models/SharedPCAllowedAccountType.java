package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of accounts that are allowed to share the PC.
 */
public enum SharedPCAllowedAccountType implements ValuedEnum {
    /** Only guest accounts. */
    Guest("guest"),
    /** Only domain-joined accounts. */
    Domain("domain");
    public final String value;
    SharedPCAllowedAccountType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SharedPCAllowedAccountType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "guest": return Guest;
            case "domain": return Domain;
            default: return null;
        }
    }
}
