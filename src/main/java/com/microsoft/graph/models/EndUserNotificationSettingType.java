package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EndUserNotificationSettingType implements ValuedEnum {
    Unknown("unknown"),
    NoTraining("noTraining"),
    TrainingSelected("trainingSelected"),
    NoNotification("noNotification"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EndUserNotificationSettingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EndUserNotificationSettingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "noTraining": return NoTraining;
            case "trainingSelected": return TrainingSelected;
            case "noNotification": return NoNotification;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
