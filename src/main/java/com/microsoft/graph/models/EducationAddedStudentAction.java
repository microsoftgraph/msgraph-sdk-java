package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the educationRoot singleton.  */
public enum EducationAddedStudentAction implements ValuedEnum {
    None("none"),
    AssignIfOpen("assignIfOpen"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationAddedStudentAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationAddedStudentAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "assignIfOpen": return AssignIfOpen;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
