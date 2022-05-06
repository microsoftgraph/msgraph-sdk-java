package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the privacy singleton.  */
public enum DataSubjectType implements ValuedEnum {
    Customer("customer"),
    CurrentEmployee("currentEmployee"),
    FormerEmployee("formerEmployee"),
    ProspectiveEmployee("prospectiveEmployee"),
    Student("student"),
    Teacher("teacher"),
    Faculty("faculty"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataSubjectType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DataSubjectType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "customer": return Customer;
            case "currentEmployee": return CurrentEmployee;
            case "formerEmployee": return FormerEmployee;
            case "prospectiveEmployee": return ProspectiveEmployee;
            case "student": return Student;
            case "teacher": return Teacher;
            case "faculty": return Faculty;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
