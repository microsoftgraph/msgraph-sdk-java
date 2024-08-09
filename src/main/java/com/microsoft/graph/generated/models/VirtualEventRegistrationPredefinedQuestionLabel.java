package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VirtualEventRegistrationPredefinedQuestionLabel implements ValuedEnum {
    Street("street"),
    City("city"),
    State("state"),
    PostalCode("postalCode"),
    CountryOrRegion("countryOrRegion"),
    Industry("industry"),
    JobTitle("jobTitle"),
    Organization("organization"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VirtualEventRegistrationPredefinedQuestionLabel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VirtualEventRegistrationPredefinedQuestionLabel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "street": return Street;
            case "city": return City;
            case "state": return State;
            case "postalCode": return PostalCode;
            case "countryOrRegion": return CountryOrRegion;
            case "industry": return Industry;
            case "jobTitle": return JobTitle;
            case "organization": return Organization;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
