package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationState implements ValuedEnum {
    Activated("activated"),
    AssignmentPending("assignmentPending"),
    AssignmentFailed("assignmentFailed"),
    UpdatePending("updatePending"),
    UpdateFailed("updateFailed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActivationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "activated": return Activated;
            case "assignmentPending": return AssignmentPending;
            case "assignmentFailed": return AssignmentFailed;
            case "updatePending": return UpdatePending;
            case "updateFailed": return UpdateFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
