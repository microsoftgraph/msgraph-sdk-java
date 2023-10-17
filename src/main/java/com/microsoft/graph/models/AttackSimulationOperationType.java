package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttackSimulationOperationType implements ValuedEnum {
    CreateSimualation("createSimualation"),
    UpdateSimulation("updateSimulation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AttackSimulationOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttackSimulationOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "createSimualation": return CreateSimualation;
            case "updateSimulation": return UpdateSimulation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
