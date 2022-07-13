package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum AccessReviewExpirationBehavior implements ValuedEnum {
    KeepAccess("keepAccess"),
    RemoveAccess("removeAccess"),
    AcceptAccessRecommendation("acceptAccessRecommendation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessReviewExpirationBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessReviewExpirationBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "keepAccess": return KeepAccess;
            case "removeAccess": return RemoveAccess;
            case "acceptAccessRecommendation": return AcceptAccessRecommendation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
