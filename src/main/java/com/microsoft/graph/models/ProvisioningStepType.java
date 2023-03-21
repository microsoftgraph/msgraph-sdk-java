package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ProvisioningStepType implements ValuedEnum {
    ImportEscaped("importEscaped"),
    Scoping("scoping"),
    Matching("matching"),
    Processing("processing"),
    ReferenceResolution("referenceResolution"),
    Export("export"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisioningStepType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProvisioningStepType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "import": return ImportEscaped;
            case "scoping": return Scoping;
            case "matching": return Matching;
            case "processing": return Processing;
            case "referenceResolution": return ReferenceResolution;
            case "export": return Export;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
