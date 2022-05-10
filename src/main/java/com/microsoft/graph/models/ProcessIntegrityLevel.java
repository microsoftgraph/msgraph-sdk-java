package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the security singleton. */
public enum ProcessIntegrityLevel implements ValuedEnum {
    Unknown("unknown"),
    Untrusted("untrusted"),
    Low("low"),
    Medium("medium"),
    High("high"),
    System("system"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProcessIntegrityLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProcessIntegrityLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "untrusted": return Untrusted;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            case "system": return System;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
