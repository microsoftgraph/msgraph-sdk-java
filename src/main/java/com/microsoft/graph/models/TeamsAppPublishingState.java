package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the appCatalogs singleton. */
public enum TeamsAppPublishingState implements ValuedEnum {
    Submitted("submitted"),
    Rejected("rejected"),
    Published("published"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAppPublishingState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamsAppPublishingState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "submitted": return Submitted;
            case "rejected": return Rejected;
            case "published": return Published;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
