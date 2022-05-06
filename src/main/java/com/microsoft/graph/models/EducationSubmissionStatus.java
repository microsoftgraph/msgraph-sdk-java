package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the educationRoot singleton.  */
public enum EducationSubmissionStatus implements ValuedEnum {
    Working("working"),
    Submitted("submitted"),
    Released("released"),
    Returned("returned"),
    UnknownFutureValue("unknownFutureValue"),
    Reassigned("reassigned");
    public final String value;
    EducationSubmissionStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationSubmissionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "working": return Working;
            case "submitted": return Submitted;
            case "released": return Released;
            case "returned": return Returned;
            case "unknownFutureValue": return UnknownFutureValue;
            case "reassigned": return Reassigned;
            default: return null;
        }
    }
}
