package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TimeOffReasonIconType implements ValuedEnum {
    None("none"),
    Car("car"),
    Calendar("calendar"),
    Running("running"),
    Plane("plane"),
    FirstAid("firstAid"),
    Doctor("doctor"),
    NotWorking("notWorking"),
    Clock("clock"),
    JuryDuty("juryDuty"),
    Globe("globe"),
    Cup("cup"),
    Phone("phone"),
    Weather("weather"),
    Umbrella("umbrella"),
    PiggyBank("piggyBank"),
    Dog("dog"),
    Cake("cake"),
    TrafficCone("trafficCone"),
    Pin("pin"),
    Sunny("sunny"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TimeOffReasonIconType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TimeOffReasonIconType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "car": return Car;
            case "calendar": return Calendar;
            case "running": return Running;
            case "plane": return Plane;
            case "firstAid": return FirstAid;
            case "doctor": return Doctor;
            case "notWorking": return NotWorking;
            case "clock": return Clock;
            case "juryDuty": return JuryDuty;
            case "globe": return Globe;
            case "cup": return Cup;
            case "phone": return Phone;
            case "weather": return Weather;
            case "umbrella": return Umbrella;
            case "piggyBank": return PiggyBank;
            case "dog": return Dog;
            case "cake": return Cake;
            case "trafficCone": return TrafficCone;
            case "pin": return Pin;
            case "sunny": return Sunny;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
