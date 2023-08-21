package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProvisioningStepType implements ValuedEnum {
    Import("import"),
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProvisioningStepType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "import": return Import;
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
