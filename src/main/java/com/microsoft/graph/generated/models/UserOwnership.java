package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserOwnership implements ValuedEnum {
    None("none"),
    LawfulBasisForProcessing("lawfulBasisForProcessing"),
    RightToAccess("rightToAccess"),
    RightToBeInformed("rightToBeInformed"),
    RightToDataPortability("rightToDataPortability"),
    RightToObject("rightToObject"),
    RightToRectification("rightToRectification"),
    RightToRestrictionOfProcessing("rightToRestrictionOfProcessing"),
    RightsRelatedToAutomatedDecisionMaking("rightsRelatedToAutomatedDecisionMaking"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserOwnership(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserOwnership forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "lawfulBasisForProcessing": return LawfulBasisForProcessing;
            case "rightToAccess": return RightToAccess;
            case "rightToBeInformed": return RightToBeInformed;
            case "rightToDataPortability": return RightToDataPortability;
            case "rightToObject": return RightToObject;
            case "rightToRectification": return RightToRectification;
            case "rightToRestrictionOfProcessing": return RightToRestrictionOfProcessing;
            case "rightsRelatedToAutomatedDecisionMaking": return RightsRelatedToAutomatedDecisionMaking;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
