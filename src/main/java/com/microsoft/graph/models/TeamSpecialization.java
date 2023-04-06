package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamSpecialization implements ValuedEnum {
    None("none"),
    EducationStandard("educationStandard"),
    EducationClass("educationClass"),
    EducationProfessionalLearningCommunity("educationProfessionalLearningCommunity"),
    EducationStaff("educationStaff"),
    HealthcareStandard("healthcareStandard"),
    HealthcareCareCoordination("healthcareCareCoordination"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamSpecialization(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamSpecialization forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "educationStandard": return EducationStandard;
            case "educationClass": return EducationClass;
            case "educationProfessionalLearningCommunity": return EducationProfessionalLearningCommunity;
            case "educationStaff": return EducationStaff;
            case "healthcareStandard": return HealthcareStandard;
            case "healthcareCareCoordination": return HealthcareCareCoordination;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
