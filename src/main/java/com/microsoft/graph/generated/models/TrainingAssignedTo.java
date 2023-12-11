package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TrainingAssignedTo implements ValuedEnum {
    None("none"),
    AllUsers("allUsers"),
    ClickedPayload("clickedPayload"),
    Compromised("compromised"),
    ReportedPhish("reportedPhish"),
    ReadButNotClicked("readButNotClicked"),
    DidNothing("didNothing"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrainingAssignedTo(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TrainingAssignedTo forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "allUsers": return AllUsers;
            case "clickedPayload": return ClickedPayload;
            case "compromised": return Compromised;
            case "reportedPhish": return ReportedPhish;
            case "readButNotClicked": return ReadButNotClicked;
            case "didNothing": return DidNothing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
