package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the privacy singleton. */
public enum SubjectRightsRequestType implements ValuedEnum {
    Export("export"),
    Delete("delete"),
    Access("access"),
    TagForAction("tagForAction"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubjectRightsRequestType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubjectRightsRequestType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "export": return Export;
            case "delete": return Delete;
            case "access": return Access;
            case "tagForAction": return TagForAction;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
