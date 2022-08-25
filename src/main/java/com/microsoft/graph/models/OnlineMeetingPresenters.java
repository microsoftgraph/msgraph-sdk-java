package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum OnlineMeetingPresenters implements ValuedEnum {
    Everyone("everyone"),
    Organization("organization"),
    RoleIsPresenter("roleIsPresenter"),
    Organizer("organizer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnlineMeetingPresenters(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnlineMeetingPresenters forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "organization": return Organization;
            case "roleIsPresenter": return RoleIsPresenter;
            case "organizer": return Organizer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
