package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible script lifecycle states.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileAppContentScriptState implements ValuedEnum {
    /** Indicates that the script content is in a pending state. */
    CommitPending("commitPending"),
    /** Indicates that the script content is ready. */
    CommitSuccess("commitSuccess"),
    /** Indicates that the script is in an unusable state. */
    CommitFailed("commitFailed"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MobileAppContentScriptState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppContentScriptState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "commitPending": return CommitPending;
            case "commitSuccess": return CommitSuccess;
            case "commitFailed": return CommitFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
