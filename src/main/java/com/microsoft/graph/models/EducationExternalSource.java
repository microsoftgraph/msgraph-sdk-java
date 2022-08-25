package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum EducationExternalSource implements ValuedEnum {
    Sis("sis"),
    Manual("manual"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationExternalSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationExternalSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sis": return Sis;
            case "manual": return Manual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
