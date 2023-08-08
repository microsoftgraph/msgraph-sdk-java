package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WorkbookOperationStatus implements ValuedEnum {
    NotStarted("notStarted"),
    Running("running"),
    Succeeded("succeeded"),
    Failed("failed");
    public final String value;
    WorkbookOperationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkbookOperationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "running": return Running;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            default: return null;
        }
    }
}
