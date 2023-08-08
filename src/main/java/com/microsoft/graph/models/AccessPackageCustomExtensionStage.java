package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccessPackageCustomExtensionStage implements ValuedEnum {
    AssignmentRequestCreated("assignmentRequestCreated"),
    AssignmentRequestApproved("assignmentRequestApproved"),
    AssignmentRequestGranted("assignmentRequestGranted"),
    AssignmentRequestRemoved("assignmentRequestRemoved"),
    AssignmentFourteenDaysBeforeExpiration("assignmentFourteenDaysBeforeExpiration"),
    AssignmentOneDayBeforeExpiration("assignmentOneDayBeforeExpiration"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageCustomExtensionStage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageCustomExtensionStage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assignmentRequestCreated": return AssignmentRequestCreated;
            case "assignmentRequestApproved": return AssignmentRequestApproved;
            case "assignmentRequestGranted": return AssignmentRequestGranted;
            case "assignmentRequestRemoved": return AssignmentRequestRemoved;
            case "assignmentFourteenDaysBeforeExpiration": return AssignmentFourteenDaysBeforeExpiration;
            case "assignmentOneDayBeforeExpiration": return AssignmentOneDayBeforeExpiration;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
