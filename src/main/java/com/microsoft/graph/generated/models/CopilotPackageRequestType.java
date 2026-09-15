package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of a package governance request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotPackageRequestType implements ValuedEnum {
    /** A request to publish a package. */
    Publish("publish"),
    /** A request to activate a package. */
    Activate("activate"),
    /** A request to grant package access. */
    Access("access"),
    /** A request to update a package. */
    Update("update"),
    /** An evolvable sentinel for future request types. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotPackageRequestType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotPackageRequestType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "publish": return Publish;
            case "activate": return Activate;
            case "access": return Access;
            case "update": return Update;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
