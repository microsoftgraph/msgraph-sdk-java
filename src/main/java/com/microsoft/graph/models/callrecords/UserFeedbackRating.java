package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
public enum UserFeedbackRating implements ValuedEnum {
    NotRated("notRated"),
    Bad("bad"),
    Poor("poor"),
    Fair("fair"),
    Good("good"),
    Excellent("excellent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserFeedbackRating(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserFeedbackRating forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notRated": return NotRated;
            case "bad": return Bad;
            case "poor": return Poor;
            case "fair": return Fair;
            case "good": return Good;
            case "excellent": return Excellent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
