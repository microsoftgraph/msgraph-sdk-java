package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PasswordPolicy implements ValuedEnum {
    None("none"),
    ChangePasswordPeriod("changePasswordPeriod"),
    CharactersCombination("charactersCombination"),
    PasswordHistoryAndReuse("passwordHistoryAndReuse"),
    PasswordLengthLimit("passwordLengthLimit"),
    PersonalInformationUse("personalInformationUse"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PasswordPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PasswordPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "changePasswordPeriod": return ChangePasswordPeriod;
            case "charactersCombination": return CharactersCombination;
            case "passwordHistoryAndReuse": return PasswordHistoryAndReuse;
            case "passwordLengthLimit": return PasswordLengthLimit;
            case "personalInformationUse": return PersonalInformationUse;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
