package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of externalConnection entities. */
public enum PropertyType implements ValuedEnum {
    String("string"),
    Int64("int64"),
    Double_escaped("double_escaped"),
    DateTime("dateTime"),
    Boolean_escaped("boolean_escaped"),
    StringCollection("stringCollection"),
    Int64Collection("int64Collection"),
    DoubleCollection("doubleCollection"),
    DateTimeCollection("dateTimeCollection"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PropertyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PropertyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "string": return String;
            case "int64": return Int64;
            case "double": return Double_escaped;
            case "dateTime": return DateTime;
            case "boolean": return Boolean_escaped;
            case "stringCollection": return StringCollection;
            case "int64Collection": return Int64Collection;
            case "doubleCollection": return DoubleCollection;
            case "dateTimeCollection": return DateTimeCollection;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
