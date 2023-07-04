package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Contains properties for detection operator.
 */
public enum Win32LobAppRuleOperator implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Equal operator. */
    Equal("equal"),
    /** Not equal operator. */
    NotEqual("notEqual"),
    /** Greater than operator. */
    GreaterThan("greaterThan"),
    /** Greater than or equal operator. */
    GreaterThanOrEqual("greaterThanOrEqual"),
    /** Less than operator. */
    LessThan("lessThan"),
    /** Less than or equal operator. */
    LessThanOrEqual("lessThanOrEqual");
    public final String value;
    Win32LobAppRuleOperator(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Win32LobAppRuleOperator forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "equal": return Equal;
            case "notEqual": return NotEqual;
            case "greaterThan": return GreaterThan;
            case "greaterThanOrEqual": return GreaterThanOrEqual;
            case "lessThan": return LessThan;
            case "lessThanOrEqual": return LessThanOrEqual;
            default: return null;
        }
    }
}
