package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Scheduled the update installation on the weeks of the month
 */
public enum WindowsUpdateForBusinessUpdateWeeks implements ValuedEnum {
    /** Allow the user to set. */
    UserDefined("userDefined"),
    /** Scheduled the update installation on the first week of the month */
    FirstWeek("firstWeek"),
    /** Scheduled the update installation on the second week of the month */
    SecondWeek("secondWeek"),
    /** Scheduled the update installation on the third week of the month */
    ThirdWeek("thirdWeek"),
    /** Scheduled the update installation on the fourth week of the month */
    FourthWeek("fourthWeek"),
    /** Scheduled the update installation on every week of the month */
    EveryWeek("everyWeek"),
    /** Evolvable enum member */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsUpdateForBusinessUpdateWeeks(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsUpdateForBusinessUpdateWeeks forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "firstWeek": return FirstWeek;
            case "secondWeek": return SecondWeek;
            case "thirdWeek": return ThirdWeek;
            case "fourthWeek": return FourthWeek;
            case "everyWeek": return EveryWeek;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
